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
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (short) 0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
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
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.ReadablePartial readablePartial0 = null;
        org.joda.time.ReadablePartial readablePartial1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.fieldDifference(readablePartial0, readablePartial1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((int) (short) -1, (int) (byte) 100, (int) '#', 0, 0, 1970, (int) '#', (int) (byte) 100, periodType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType11 = period9.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        int int0 = org.joda.time.MonthDay.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (byte) 0, (int) (short) 100, 10, 1, (int) (short) -1, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        int int3 = dateMidnight2.getMonthOfYear();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(1970, 0, (int) (short) 0, 5, (int) (short) 10, 11, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = org.joda.time.DateMidnight.parse("hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.hours();
        java.lang.String str2 = periodType1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((java.lang.Object) 1.0f, periodType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PeriodType[Hours]" + "'", str2, "PeriodType[Hours]");
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hi!", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.monthOfYear();
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        int int21 = property19.getMaximumShortTextLength(locale20);
        boolean boolean23 = locale20.equals((java.lang.Object) 100.0d);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate7);
        org.joda.time.Chronology chronology10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((java.lang.Object) period9, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
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
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("fran\347ais (France)");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withField(dateTimeFieldType1, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime1.withHourOfDay((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("PeriodType[Hours]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Hours]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
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
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval2 = new org.joda.time.Interval((java.lang.Object) (short) 100, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("PeriodType[Hours]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=periodtype[hours]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.util.Locale.Category category0 = null;
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(1L, dateTimeZone3);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period(readableDuration1, (org.joda.time.ReadableInstant) dateMidnight4, periodType5);
        int int7 = dateMidnight4.getYear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration10, (org.joda.time.ReadableInstant) dateMidnight13, periodType14);
        int int16 = dateMidnight13.getYear();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.withDayOfMonth((int) (byte) 10);
        boolean boolean19 = dateMidnight4.isBefore((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.DateMidnight.Property property20 = dateMidnight18.monthOfYear();
        java.util.Locale locale21 = java.util.Locale.JAPAN;
        int int22 = property20.getMaximumShortTextLength(locale21);
        boolean boolean23 = locale21.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1970 + "'", int7 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        java.util.Calendar calendar0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay1 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The calendar must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        int int0 = org.joda.time.TimeOfDay.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.monthOfYear();
        org.joda.time.DateMidnight dateMidnight20 = property19.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.withDayOfMonth((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateMidnight20);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.millis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate2.withFieldAdded(durationFieldType3, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millis' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean5 = localDate2.isSupported(dateTimeFieldType4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) localDate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((-1));
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(1L, dateTimeZone10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableDuration8, (org.joda.time.ReadableInstant) dateMidnight11, periodType12);
        int int14 = dateMidnight11.getYear();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableDuration17, (org.joda.time.ReadableInstant) dateMidnight20, periodType21);
        int int23 = dateMidnight20.getYear();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight20.withDayOfMonth((int) (byte) 10);
        boolean boolean26 = dateMidnight11.isBefore((org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.DateMidnight.Property property27 = dateMidnight25.monthOfYear();
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        int int29 = property27.getMaximumShortTextLength(locale28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = localDate2.toString("", locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("hi!");
        int int2 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        java.util.Date date2 = dateTime1.toDate();
        org.joda.time.DateTime dateTime4 = dateTime1.minusSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime4.withMillisOfSecond(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTime(timeOfDay2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = timeOfDay2.getFieldType(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32769");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.minusSeconds((int) (byte) 0);
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval4 = new org.joda.time.Interval((java.lang.Object) period0, chronology3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime2.withDate((int) '#', (int) '#', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(instant3);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.monthOfYear();
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        int int21 = property19.getMaximumShortTextLength(locale20);
        java.lang.String str22 = property19.getAsString();
        java.lang.String str23 = property19.getAsText();
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight26 = property19.setCopy("PeriodType[Hours]", locale25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PeriodType[Hours]\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "January" + "'", str23, "January");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja_JP");
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getStandardOffset((long) 5);
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) 5, chronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (byte) 10);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) property4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeFieldType0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate2.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((long) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = yearMonthDay0.compareTo((org.joda.time.ReadablePartial) timeOfDay4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        boolean boolean3 = dateTimeZone1.isFixed();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDate4.getField(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.time.ZoneId zoneId2 = timeZone0.toZoneId();
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime4 = yearMonthDay3.toDateTimeAtMidnight();
        java.util.Date date5 = dateTime4.toDate();
        date5.setMonth((int) '#');
        boolean boolean8 = timeZone0.inDaylightTime(date5);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(date5);
        org.junit.Assert.assertEquals(date5.toString(), "Sat Dec 21 00:00:00 UTC 2024");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        boolean boolean6 = calendar4.isSet(7);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454794897,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=34,MILLISECOND=897,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((-1), (int) (byte) 100, 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, 32769, (int) ' ', (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        int int0 = org.joda.time.TimeOfDay.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(100L, dateTimeZone5);
        boolean boolean7 = dateTimeZone5.isFixed();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) localTime1, (org.joda.time.ReadablePartial) localDate8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.DateTime dateTime6 = yearMonthDay0.toDateTime(timeOfDay5);
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime8 = yearMonthDay7.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = yearMonthDay7.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = timeOfDay5.isEqual((org.joda.time.ReadablePartial) yearMonthDay7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        java.util.Locale locale10 = java.util.Locale.FRANCE;
        java.lang.String str11 = locale9.getDisplayName(locale10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableDuration12, (org.joda.time.ReadableInstant) dateMidnight15, periodType16);
        int int18 = dateMidnight15.getYear();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight15.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(1L, dateTimeZone23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableDuration21, (org.joda.time.ReadableInstant) dateMidnight24, periodType25);
        int int27 = dateMidnight24.getYear();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight24.withDayOfMonth((int) (byte) 10);
        boolean boolean30 = dateMidnight15.isBefore((org.joda.time.ReadableInstant) dateMidnight29);
        org.joda.time.DateMidnight.Property property31 = dateMidnight29.monthOfYear();
        java.util.Locale locale32 = java.util.Locale.JAPAN;
        int int33 = property31.getMaximumShortTextLength(locale32);
        java.lang.String str34 = locale10.getDisplayLanguage(locale32);
        // The following exception was thrown during execution in test generation
        try {
            long long35 = dateTimeField6.set(1L, "PeriodType[Hours]", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PeriodType[Hours]\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "fran\347ais (France)" + "'", str11, "fran\347ais (France)");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str34, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone1 = dateTimeZone0.toTimeZone();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime3 = yearMonthDay2.toDateTimeAtMidnight();
        java.util.Date date4 = dateTime3.toDate();
        boolean boolean5 = timeZone1.inDaylightTime(date4);
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(date4);
        org.junit.Assert.assertEquals(date4.toString(), "Mon Feb 21 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean5 = localDate2.isSupported(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(1970);
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        java.lang.String str9 = property8.getAsShortText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = property8.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3940" + "'", str9, "3940");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.monthOfYear();
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        int int21 = property19.getMaximumShortTextLength(locale20);
        java.lang.String str22 = property19.getAsString();
        java.lang.String str23 = property19.getAsText();
        java.util.Locale locale24 = java.util.Locale.FRANCE;
        java.util.Locale locale25 = java.util.Locale.FRANCE;
        java.lang.String str26 = locale24.getDisplayName(locale25);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableDuration27, (org.joda.time.ReadableInstant) dateMidnight30, periodType31);
        int int33 = dateMidnight30.getYear();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight30.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration36 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(1L, dateTimeZone38);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period(readableDuration36, (org.joda.time.ReadableInstant) dateMidnight39, periodType40);
        int int42 = dateMidnight39.getYear();
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight39.withDayOfMonth((int) (byte) 10);
        boolean boolean45 = dateMidnight30.isBefore((org.joda.time.ReadableInstant) dateMidnight44);
        org.joda.time.DateMidnight.Property property46 = dateMidnight44.monthOfYear();
        java.util.Locale locale47 = java.util.Locale.JAPAN;
        int int48 = property46.getMaximumShortTextLength(locale47);
        java.lang.String str49 = locale25.getDisplayLanguage(locale47);
        java.util.Locale.setDefault(locale25);
        int int51 = property19.getMaximumTextLength(locale25);
        java.util.Locale locale53 = java.util.Locale.FRANCE;
        java.util.Locale locale54 = java.util.Locale.FRANCE;
        java.lang.String str55 = locale53.getDisplayName(locale54);
        java.util.Set<java.lang.Character> charSet56 = locale53.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight57 = property19.setCopy("January", locale53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"January\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "janvier" + "'", str23, "janvier");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "fran\347ais (France)" + "'", str26, "fran\347ais (France)");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1970 + "'", int33 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1970 + "'", int42 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 2 + "'", int48 == 2);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str49, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "fran\347ais (France)" + "'", str55, "fran\347ais (France)");
        org.junit.Assert.assertNotNull(charSet56);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromCalendarFields(calendar4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localTime5.toString("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454797065,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=37,MILLISECOND=65,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (byte) 10);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.plusDays((int) 'a');
        long long11 = dateMidnight10.getMillis();
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.plus((long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            int int14 = property4.getDifference((org.joda.time.ReadableInstant) dateMidnight10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: -8294410000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 8380800000L + "'", long11 == 8380800000L);
        org.junit.Assert.assertNotNull(dateMidnight13);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("fra", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean5 = localDate2.isSupported(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(1970);
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        java.lang.String str9 = property8.getAsShortText();
        org.joda.time.LocalDate localDate10 = property8.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate10.withYearOfEra((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3940" + "'", str9, "3940");
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("1");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '1' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.US;
        int int5 = property3.getMaximumShortTextLength(locale4);
        java.lang.String str6 = locale4.toString();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 9 + "'", int5 == 9);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "en_US" + "'", str6, "en_US");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate7);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((java.lang.Object) localDate7);
        org.joda.time.LocalDate localDate12 = localDate7.minusYears((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField14 = localDate7.getField((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        java.util.Date date2 = dateTime1.toDate();
        date2.setMonth((int) '#');
        int int5 = date2.getMinutes();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight9, readableDuration10, periodType11);
        int int13 = dateMidnight9.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = dateMidnight9.getZone();
        org.joda.time.DateMidnight dateMidnight15 = org.joda.time.DateMidnight.now(dateTimeZone14);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone14);
        boolean boolean17 = date2.equals((java.lang.Object) dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Sat Dec 21 00:00:00 UTC 2024");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calendar4.getLeastMaximum((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454798030,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=38,MILLISECOND=30,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType4 = yearMonthDay0.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) locale0, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate7);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((java.lang.Object) localDate7);
        org.joda.time.LocalDate localDate12 = localDate7.minusYears((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate7.withDayOfWeek(12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((java.lang.Object) 0.0d, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("japonais (Japon)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"japonais (Japon)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone2);
        java.util.TimeZone timeZone6 = dateTimeZone5.toTimeZone();
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay8 = new org.joda.time.MonthDay((java.lang.Object) dateTimeZone5, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454798547,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=38,MILLISECOND=547,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Temps universel coordonn\351");
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.yearOfEra();
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property5.setCopy("\u30d5\u30e9\u30f3\u30b9\u8a9e", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"?????\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("\u30d5\u30e9\u30f3\u30b9\u8a9e", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime8 = yearMonthDay7.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime9 = yearMonthDay7.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property10 = yearMonthDay7.year();
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.DateTime dateTime13 = yearMonthDay7.toDateTime(timeOfDay12);
        int[] intArray15 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = dateTimeField6.addWrapField((org.joda.time.ReadablePartial) timeOfDay12, 1970, intArray15, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1970");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime3.withTime(70, (int) (byte) 1, (int) (byte) 100, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) '4', (-292275054), (-292275054), (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        int int0 = org.joda.time.YearMonthDay.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
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
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        java.util.Date date8 = dateTime4.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime4.withDayOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Mon Dec 30 00:00:00 UTC 569");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1970, dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localDate4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate4.withWeekyear((-1));
        boolean boolean10 = localDate8.equals((java.lang.Object) 8);
        int int11 = localDate8.getYear();
        boolean boolean12 = yearMonthDay0.equals((java.lang.Object) localDate8);
        int int13 = localDate8.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate8.withMonthOfYear(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.centuryOfEra();
        org.joda.time.LocalDate localDate5 = localDateTime3.toLocalDate();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        // The following exception was thrown during execution in test generation
        try {
            calendar4.roll((int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454800164,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=40,MILLISECOND=164,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        long long9 = dateTimeField6.add((long) (byte) 10, (long) '4');
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime13 = localTime11.minusSeconds((int) (byte) 10);
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.LocalTime localTime15 = property14.roundCeilingCopy();
        org.joda.time.LocalTime localTime16 = property14.withMaximumValue();
        int[] intArray21 = new int[] { 6, 0, 3 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = dateTimeField6.add((org.joda.time.ReadablePartial) localTime16, 5, intArray21, 292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1640995200010L + "'", long9 == 1640995200010L);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[6, 0, 3]");
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 1, 9, 12, 7, 8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.monthOfYear();
        java.util.Locale locale21 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight22 = property19.setCopy("YearWeekDayNoWeeks", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"YearWeekDayNoWeeks\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ja_JP");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.YearMonthDay yearMonthDay7 = property3.setCopy(2);
        org.joda.time.DateTimeField dateTimeField8 = property3.getField();
        java.util.Locale locale10 = java.util.Locale.US;
        java.util.Locale locale11 = locale10.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay12 = property3.setCopy("fra", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"fra\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_US");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime9 = dateTime4.withMillis(8380800000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime4.withYearOfEra((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        java.lang.String str2 = periodType1.getName();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "YearMonthDayTime" + "'", str2, "YearMonthDayTime");
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        calendar4.clear();
        java.lang.Object obj6 = calendar4.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("en_US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=en_us");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("hi!");
        timeZone1.setID("3940");
        java.util.Locale locale4 = java.util.Locale.FRANCE;
        java.util.Locale locale5 = java.util.Locale.FRANCE;
        java.lang.String str6 = locale4.getDisplayName(locale5);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration7, (org.joda.time.ReadableInstant) dateMidnight10, periodType11);
        int int13 = dateMidnight10.getYear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration16, (org.joda.time.ReadableInstant) dateMidnight19, periodType20);
        int int22 = dateMidnight19.getYear();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight19.withDayOfMonth((int) (byte) 10);
        boolean boolean25 = dateMidnight10.isBefore((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.DateMidnight.Property property26 = dateMidnight24.monthOfYear();
        java.util.Locale locale27 = java.util.Locale.JAPAN;
        int int28 = property26.getMaximumShortTextLength(locale27);
        java.lang.String str29 = locale5.getDisplayLanguage(locale27);
        java.lang.String str30 = timeZone1.getDisplayName(locale5);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "fran\347ais (France)" + "'", str6, "fran\347ais (France)");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str29, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "GMT+00:00" + "'", str30, "GMT+00:00");
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) localDate2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone16 = dateTimeZone15.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) property14, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.MutableDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(timeZone16);
        org.junit.Assert.assertEquals(timeZone16.getDisplayName(), "Temps universel coordonn\351");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = yearMonthDay0.getFieldTypes();
        int int3 = yearMonthDay0.getMonthOfYear();
        java.lang.String str4 = yearMonthDay0.toString();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay0.plusDays((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property8 = yearMonthDay0.property(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-21" + "'", str4, "2022-02-21");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromCalendarFields(calendar4);
        long long6 = calendar4.getTimeInMillis();
        calendar4.set((int) '#', 32769, 0, 7, 4);
        boolean boolean14 = calendar4.isSet(8);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=35,MONTH=32769,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=0,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=7,MINUTE=4,SECOND=41,MILLISECOND=986,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645454801986L + "'", long6 == 1645454801986L);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period8 = period5.withField(durationFieldType6, 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(8380800000L, chronology1);
        org.joda.time.LocalTime.Property property3 = localTime2.millisOfSecond();
        int int4 = localTime2.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = localTime2.toString("months");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime7 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime8 = yearMonthDay6.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay6.year();
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = property9.getAsText(locale10);
        org.joda.time.DateTimeField dateTimeField12 = property9.getField();
        long long15 = dateTimeField12.add((long) (byte) 10, (long) '4');
        int int16 = dateMidnight3.get(dateTimeField12);
        // The following exception was thrown during execution in test generation
        try {
            long long19 = dateTimeField12.set((long) 10, "months");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"months\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1640995200010L + "'", long15 == 1640995200010L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("PeriodType[Hours]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Hours]\" is malformed at \"eriodType[Hours]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean5 = localDate2.isSupported(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(1970);
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        java.lang.String str9 = property8.getAsShortText();
        org.joda.time.Instant instant10 = new org.joda.time.Instant((java.lang.Object) str9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3940" + "'", str9, "3940");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.minusSeconds((int) (byte) 0);
        org.joda.time.Period period4 = period2.minusSeconds(100);
        org.joda.time.Period period5 = period4.negated();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType7 = period5.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.Period period11 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period13 = period11.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.plusDays((int) 'a');
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period11, (org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay(2022, (-1), 20, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.minusSeconds((int) (byte) 0);
        org.joda.time.Period period4 = period2.minusSeconds((int) '#');
        org.joda.time.MutablePeriod mutablePeriod5 = period2.toMutablePeriod();
        mutablePeriod5.setPeriod((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod5.setValue((int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(mutablePeriod5);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        java.util.Locale locale7 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeZone2.getDisplayName(false, 5, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454802976,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=42,MILLISECOND=976,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_CA");
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTimeISO();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.yearWeekDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = new org.joda.time.Period((java.lang.Object) dateTime5, periodType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(periodType6);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMillis(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withField(dateTimeFieldType6, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        java.util.Locale locale13 = java.util.Locale.forLanguageTag("");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = property10.setCopy("janvier", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"janvier\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "minuteOfDay" + "'", str7, "minuteOfDay");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar4);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField8 = yearMonthDay6.getField(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454803110,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=43,MILLISECOND=110,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(yearMonthDay6);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar4);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("janvier");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap10 = calendar4.getDisplayNames(2022, 70, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454803173,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=43,MILLISECOND=173,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "janvier");
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(8380800000L, chronology1);
        org.joda.time.LocalTime.Property property3 = localTime2.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = property3.setCopy("1969");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime8 = yearMonthDay7.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = yearMonthDay7.getFieldTypes();
        int int10 = yearMonthDay7.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay7.minusMonths((int) (byte) 0);
        int[] intArray16 = new int[] { 3, 4 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = dateTimeField6.addWrapPartial((org.joda.time.ReadablePartial) yearMonthDay12, 0, intArray16, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[13, 4]");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        java.util.Date date2 = dateTime1.toDate();
        int int3 = date2.getSeconds();
        date2.setTime((long) 5);
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.hours();
        org.joda.time.Period period15 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period17 = period15.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.plusDays((int) 'a');
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period15, (org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) date2, periodType6, chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.YearMonthDay yearMonthDay7 = property3.setCopy(2);
        int int8 = property3.get();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate2.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval6 = localDate2.toInterval();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate2.withFieldAdded(durationFieldType7, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minutes' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate7);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((java.lang.Object) localDate7);
        org.joda.time.LocalDate localDate12 = localDate7.minusYears((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate7.withWeekOfWeekyear((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(localDate12);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay((int) (byte) -1, 20, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.minusMillis(0);
        org.joda.time.Period period12 = period8.minusMonths(9);
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType14 = periodType13.withWeeksRemoved();
        java.lang.String str15 = periodType14.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period16 = period12.normalizedStandard(periodType14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(periodType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "YearWeekDayNoWeeks" + "'", str15, "YearWeekDayNoWeeks");
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = chronology17.getDateTimeMillis((long) 100, 5, 11, 100, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTime(timeOfDay2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.withMinuteOfHour((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withDate(21, (int) ' ', 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology2);
        long long4 = interval3.getEndMillis();
        java.lang.String str5 = interval3.toString();
        org.joda.time.Period period7 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(0, (int) (byte) 0, (int) (byte) 10, 1);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.millis();
        mutablePeriod12.set(durationFieldType13, 5);
        org.joda.time.Period period17 = period7.withField(durationFieldType13, 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval18 = interval3.withPeriodAfterStart((org.joda.time.ReadablePeriod) period7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.010Z" + "'", str5, "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertNotNull(period17);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (byte) 10);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = localTime5.minusMinutes((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime7.withFieldAdded(durationFieldType8, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(100L, dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((java.lang.Object) periodType0, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((-1));
        int int7 = localDate6.getWeekyear();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfYear(3);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean12 = dateTimeZone11.isFixed();
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusMillis(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str17 = dateTimeFieldType16.getName();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withField(dateTimeFieldType16, (int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = localDateTime13.getFieldTypes();
        org.joda.time.PeriodType periodType21 = org.joda.time.PeriodType.weeks();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDateTime13, periodType21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "minuteOfDay" + "'", str17, "minuteOfDay");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray20);
        org.junit.Assert.assertNotNull(periodType21);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1970);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withMillisOfDay((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withYear((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withDate(1970, 20, 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(100L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str10 = dateTimeFieldType9.getName();
        org.joda.time.DateTime dateTime12 = dateTime6.withField(dateTimeFieldType9, (int) 'u');
        java.lang.String str13 = dateTimeFieldType9.toString();
        org.joda.time.Period period22 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period24 = period22.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(1L, dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.plusDays((int) 'a');
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period22, (org.joda.time.ReadableInstant) dateMidnight29);
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.now(chronology31);
        boolean boolean33 = dateTimeFieldType9.isSupported(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay34 = new org.joda.time.TimeOfDay(0, 20, (int) '#', 1970, chronology31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for millisOfSecond must not be larger than 999");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "minuteOfDay" + "'", str10, "minuteOfDay");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "minuteOfDay" + "'", str13, "minuteOfDay");
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 1970);
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean5 = timeZone2.hasSameRules(timeZone4);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.DateTime dateTime8 = localDateTime1.toDateTime(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime8.withMinuteOfHour(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645454804241,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=44,MILLISECOND=241,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.YearMonthDay yearMonthDay7 = property3.setCopy(2);
        org.joda.time.DateTimeField dateTimeField8 = property3.getField();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.lang.String str11 = dateTimeField8.getAsShortText((int) ' ', locale10);
        java.lang.String str12 = locale10.toString();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "de" + "'", str12, "de");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
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
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.minusSeconds((int) (byte) 0);
        int int3 = period0.getDays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) int3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight20 = dateMidnight17.withCenturyOfEra((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("YearWeekDayNoWeeks");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=yearweekdaynoweeks");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(chronology17);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.now(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = chronology17.getDateTimeMillis((int) ' ', 0, 569, 4, 0, (int) 'x', 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(localTime19);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: centuryOfEra");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean4 = timeZone1.hasSameRules(timeZone3);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(timeZone3);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        java.util.TimeZone timeZone7 = dateTimeZone6.toTimeZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (-1), dateTimeZone6);
        int int10 = localTime8.getValue((int) (short) 1);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1645454804812,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=44,MILLISECOND=812,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.setMillis((long) (byte) 10);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime17 = localTime15.minusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.millis();
        boolean boolean19 = localTime15.isSupported(durationFieldType18);
        mutableDateTime9.add(durationFieldType18, (-1));
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        mutableDateTime9.setZoneRetainFields(dateTimeZone23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime9.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setSecondOfMinute(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(property25);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        calendar4.clear();
        // The following exception was thrown during execution in test generation
        try {
            calendar4.setWeekDate(292278993, 10, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        int int0 = org.joda.time.YearMonthDay.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.hours();
        java.lang.String str2 = periodType1.toString();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0L, periodType1, chronology3);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod4.setWeeks((int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PeriodType[Hours]" + "'", str2, "PeriodType[Hours]");
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(8380800000L, chronology1);
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime5 = yearMonthDay4.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay4.year();
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.lang.String str9 = property7.getAsText(locale8);
        org.joda.time.DateTimeField dateTimeField10 = property7.getField();
        long long13 = dateTimeField10.add((long) (byte) 10, (long) '4');
        java.util.Locale locale14 = java.util.Locale.US;
        int int15 = dateTimeField10.getMaximumTextLength(locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localTime2.toString("GMT+00:00", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1640995200010L + "'", long13 == 1640995200010L);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar4);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = calendar4.getLeastMaximum(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2022");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454805208,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=45,MILLISECOND=208,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(yearMonthDay6);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
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
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime4 = yearMonthDay3.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray5 = yearMonthDay3.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = timeOfDay7.getFieldTypes();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone11 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean12 = timeZone9.hasSameRules(timeZone11);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateTime dateTime15 = yearMonthDay3.toDateTime(timeOfDay7, dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(7, (int) 'a', (int) (short) -1, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray5);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645454805399,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=45,MILLISECOND=399,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        int int5 = localDateTime3.getMonthOfYear();
        java.util.Date date6 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.minusMinutes((-1));
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withWeekOfWeekyear((int) '4');
        org.joda.time.LocalDateTime localDateTime12 = localDateTime8.withDayOfMonth(7);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDateTime12.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("3940");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(569);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.YearMonthDay yearMonthDay7 = property3.setCopy(2);
        org.joda.time.DateTimeField dateTimeField8 = property3.getField();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.lang.String str11 = dateTimeField8.getAsShortText((int) ' ', locale10);
        long long13 = dateTimeField8.roundCeiling((long) 710);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.Period period16 = org.joda.time.Period.ZERO;
        org.joda.time.Period period18 = period16.minusSeconds((int) (byte) 0);
        org.joda.time.LocalTime localTime19 = localTime15.plus((org.joda.time.ReadablePeriod) period16);
        int[] intArray23 = new int[] { (-1), (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = dateTimeField8.addWrapField((org.joda.time.ReadablePartial) localTime15, 8, intArray23, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 31536000000L + "'", long13 == 31536000000L);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(intArray23);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[-1, 10]");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.yearOfCentury();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone4 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean5 = timeZone2.hasSameRules(timeZone4);
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(timeZone4);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        java.util.TimeZone timeZone8 = dateTimeZone7.toTimeZone();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((long) (-1), dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeFieldType0, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1645454805860,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=45,MILLISECOND=860,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Temps universel coordonn\351");
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight(1L, dateTimeZone4);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period(readableDuration2, (org.joda.time.ReadableInstant) dateMidnight5, periodType6);
        int int8 = dateMidnight5.getYear();
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight5.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime11 = dateMidnight10.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone13 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTime dateTime14 = mutableDateTime11.toDateTime(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 4, 0L, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((-292275054), 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (byte) 10);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime9 = localTime7.minusSeconds((int) (byte) 10);
        org.joda.time.LocalTime.Property property10 = localTime9.millisOfSecond();
        org.joda.time.LocalTime localTime11 = property10.roundCeilingCopy();
        int int12 = property4.compareTo((org.joda.time.ReadablePartial) localTime11);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localTime11.get(dateTimeFieldType13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        boolean boolean3 = dateTimeZone1.isFixed();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime4.setDayOfYear(600100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 600100 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now(dateTimeZone1);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone6);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromCalendarFields(calendar8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate9);
        org.joda.time.Period period11 = org.joda.time.Period.ZERO;
        org.joda.time.Period period13 = period11.minusSeconds((int) (byte) 0);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.millis();
        int int15 = period13.get(durationFieldType14);
        org.joda.time.Period period17 = period13.minusWeeks(9);
        org.joda.time.LocalDate localDate19 = localDate3.withPeriodAdded((org.joda.time.ReadablePeriod) period17, 7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = localDate19.withDayOfWeek(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454806264,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=46,MILLISECOND=264,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.LocalDate.Property property4 = localDate3.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = property4.addToCopy(2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        int int5 = localDateTime3.getEra();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMillis(100);
        org.joda.time.Period period7 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = dateTime10.toLocalDateTime();
        org.joda.time.DateTime dateTime13 = dateTime10.withMonthOfYear(11);
        org.joda.time.Duration duration14 = period7.toDurationFrom((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime3.minus((org.joda.time.ReadableDuration) duration14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime15.withDate(70, (int) (short) -1, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        java.util.Date date2 = dateTime1.toDate();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableDuration3, (org.joda.time.ReadableInstant) dateMidnight6, periodType7);
        int int9 = dateMidnight6.getYear();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight6.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight11.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone14 = dateTimeZone13.toTimeZone();
        org.joda.time.DateTime dateTime15 = mutableDateTime12.toDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime15.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withYear(710);
        int int4 = yearMonthDay3.getDayOfMonth();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        int int3 = dateTime1.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        boolean boolean3 = dateTimeZone1.isFixed();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9, periodType10);
        int int12 = dateMidnight8.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight8.getZone();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone13);
        mutableDateTime4.setZone(dateTimeZone13);
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime18 = yearMonthDay17.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate19 = dateTime18.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(100L, dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withCenturyOfEra(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str26 = dateTimeFieldType25.getName();
        org.joda.time.DateTime dateTime28 = dateTime22.withField(dateTimeFieldType25, (int) 'u');
        int int29 = dateTime18.get(dateTimeFieldType25);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime4.set(dateTimeFieldType25, 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "minuteOfDay" + "'", str26, "minuteOfDay");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        org.joda.time.Period period14 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period16 = period14.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.plusDays((int) 'a');
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period14, (org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.DateMidnight dateMidnight24 = org.joda.time.DateMidnight.now(chronology23);
        long long28 = chronology23.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight29 = org.joda.time.DateMidnight.now(chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(70, 11, 7, (int) (short) 100, 569, 1, chronology23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 0L + "'", long28 == 0L);
        org.junit.Assert.assertNotNull(dateMidnight29);
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int3 = dateTimeZone1.getStandardOffset((long) 5);
        java.lang.String str5 = dateTimeZone1.getShortName(100L);
        java.util.Locale locale8 = java.util.Locale.forLanguageTag("fran\347ais (France)");
        java.lang.String str9 = dateTimeZone1.getName((long) (short) 0, locale8);
        org.joda.time.Period period11 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime15 = dateTime14.toLocalDateTime();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear(11);
        org.joda.time.Duration duration18 = period11.toDurationFrom((org.joda.time.ReadableInstant) dateTime17);
        boolean boolean19 = locale8.equals((java.lang.Object) duration18);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "+00:00" + "'", str5, "+00:00");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "+00:00" + "'", str9, "+00:00");
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withDurationAdded(readableDuration8, 1970);
        int int11 = dateTime4.getSecondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((java.lang.Object) int11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
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
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate2.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.DateTime dateTime6 = yearMonthDay0.toDateTime(timeOfDay5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property8 = yearMonthDay0.property(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekOfWeekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDay();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(chronology17);
        org.joda.time.LocalTime localTime19 = org.joda.time.LocalTime.now(chronology17);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long23 = dateTimeField20.set((long) 11, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("months", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime2.withMonthOfYear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.yearOfEra();
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.millisOfDay();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(9, (int) (byte) 1, 10);
        org.joda.time.LocalTime localTime13 = localTime11.plusSeconds(0);
        int[] intArray18 = new int[] { 52, (byte) -1, 20 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = dateTimeField7.set((org.joda.time.ReadablePartial) localTime11, 569, intArray18, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 569");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[52, -1, 20]");
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("YearWeekDayNoWeeks");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"YearWeekDayNoWeeks\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str13 = dateTimeFieldType12.getName();
        mutableDateTime11.set(dateTimeFieldType12, 5);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.setMinuteOfHour(200);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 200 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "minuteOfDay" + "'", str13, "minuteOfDay");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(5, (int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder6 = builder0.set((-292275054), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.YearMonthDay yearMonthDay7 = property3.setCopy(2);
        org.joda.time.DateTimeField dateTimeField8 = property3.getField();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration10, (org.joda.time.ReadableInstant) dateMidnight13, periodType14);
        int int16 = dateMidnight13.getYear();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableDuration19, (org.joda.time.ReadableInstant) dateMidnight22, periodType23);
        int int25 = dateMidnight22.getYear();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight22.withDayOfMonth((int) (byte) 10);
        boolean boolean28 = dateMidnight13.isBefore((org.joda.time.ReadableInstant) dateMidnight27);
        org.joda.time.DateMidnight.Property property29 = dateMidnight27.monthOfYear();
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        int int31 = property29.getMaximumShortTextLength(locale30);
        java.lang.String str32 = property29.getAsString();
        java.lang.String str33 = property29.getAsText();
        java.util.Locale locale34 = java.util.Locale.FRANCE;
        java.util.Locale locale35 = java.util.Locale.FRANCE;
        java.lang.String str36 = locale34.getDisplayName(locale35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(1L, dateTimeZone39);
        org.joda.time.PeriodType periodType41 = null;
        org.joda.time.Period period42 = new org.joda.time.Period(readableDuration37, (org.joda.time.ReadableInstant) dateMidnight40, periodType41);
        int int43 = dateMidnight40.getYear();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight40.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(1L, dateTimeZone48);
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableDuration46, (org.joda.time.ReadableInstant) dateMidnight49, periodType50);
        int int52 = dateMidnight49.getYear();
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight49.withDayOfMonth((int) (byte) 10);
        boolean boolean55 = dateMidnight40.isBefore((org.joda.time.ReadableInstant) dateMidnight54);
        org.joda.time.DateMidnight.Property property56 = dateMidnight54.monthOfYear();
        java.util.Locale locale57 = java.util.Locale.JAPAN;
        int int58 = property56.getMaximumShortTextLength(locale57);
        java.lang.String str59 = locale35.getDisplayLanguage(locale57);
        java.util.Locale.setDefault(locale35);
        int int61 = property29.getMaximumTextLength(locale35);
        java.lang.String str62 = dateTimeField8.getAsText((long) 32769, locale35);
        int int64 = dateTimeField8.getMaximumValue(31536000000L);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1" + "'", str32, "1");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "janvier" + "'", str33, "janvier");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "fran\347ais (France)" + "'", str36, "fran\347ais (France)");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 1970 + "'", int43 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1970 + "'", int52 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + true + "'", boolean55 == true);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 2 + "'", int58 == 2);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str59, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 9 + "'", int61 == 9);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "1970" + "'", str62, "1970");
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 292278993 + "'", int64 == 292278993);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getYear();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.minusDays(1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withDate(3, 1970, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.Interval interval5 = interval3.withDurationBeforeEnd(readableDuration4);
        org.joda.time.Period period6 = interval3.toPeriod();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration7, (org.joda.time.ReadableInstant) dateMidnight10, periodType11);
        org.joda.time.Hours hours13 = period12.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period16 = period12.withFieldAdded(durationFieldType14, 100);
        org.joda.time.Period period18 = period6.withFieldAdded(durationFieldType14, (int) (byte) 10);
        int int19 = period6.getMonths();
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(hours13);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, (int) (byte) 0, (int) (byte) 10, 1);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.millis();
        mutablePeriod4.set(durationFieldType5, 5);
        int int8 = mutablePeriod4.getMonths();
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.LocalDate localDate5 = localDate2.minusWeeks((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9, periodType10);
        boolean boolean12 = localDate5.equals((java.lang.Object) dateMidnight8);
        org.joda.time.LocalDate localDate14 = localDate5.minusYears((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate14.withWeekOfWeekyear((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("months", (double) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=21.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean3 = dateTimeZone2.isFixed();
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusMillis(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str8 = dateTimeFieldType7.getName();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withField(dateTimeFieldType7, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay12 = monthDay0.withField(dateTimeFieldType7, 569);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "minuteOfDay" + "'", str8, "minuteOfDay");
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.DateTime dateTime6 = yearMonthDay0.toDateTime(timeOfDay5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay8 = timeOfDay5.withMillisOfSecond((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str13 = dateTimeFieldType12.getName();
        mutableDateTime11.set(dateTimeFieldType12, 5);
        mutableDateTime11.setSecondOfDay((int) (byte) 10);
        mutableDateTime11.setMinuteOfDay((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime11.setSecondOfMinute(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "minuteOfDay" + "'", str13, "minuteOfDay");
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        boolean boolean7 = dateTimeField6.isLenient();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1970, dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDate10.isSupported(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = localDate10.withWeekyear((-1));
        int int15 = localDate14.getWeekyear();
        org.joda.time.LocalDate localDate17 = localDate14.withDayOfYear(3);
        org.joda.time.LocalDate localDate19 = localDate17.minusWeeks((-1));
        int[] intArray26 = new int[] { 292278993, 1, (byte) 100, (byte) 100, (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = dateTimeField6.addWrapField((org.joda.time.ReadablePartial) localDate17, (int) 'x', intArray26, 292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 120");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(intArray26);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[292278993, 1, 100, 100, 100]");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("fran\347ais (France)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"franc?ais (France)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        int int6 = calendar4.getGreatestMinimum(11);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = calendar4.get(35);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454809381,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=49,MILLISECOND=381,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.now(chronology17);
        org.joda.time.DateTime dateTime21 = dateTime19.withMillis((long) 21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime19.withTime((int) '4', 15, 0, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        java.lang.String str4 = periodType3.getName();
        int int5 = periodType3.size();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(10L, (long) (byte) 100, periodType3, chronology6);
        int int8 = mutablePeriod7.getMinutes();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod7.setWeeks(70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "YearWeekDayNoWeeks" + "'", str4, "YearWeekDayNoWeeks");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = yearMonthDay0.getFieldTypes();
        int int3 = yearMonthDay0.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay0.minusMonths((int) (byte) 0);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime9 = localTime7.minusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.millis();
        boolean boolean11 = localTime7.isSupported(durationFieldType10);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 0);
        int int14 = localTime13.getMinuteOfHour();
        boolean boolean15 = localTime7.equals((java.lang.Object) localTime13);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean17 = localTime7.isSupported(dateTimeFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay19 = yearMonthDay0.withField(dateTimeFieldType16, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        int int5 = localDateTime3.getMonthOfYear();
        java.util.Date date6 = localDateTime3.toDate();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration7, (org.joda.time.ReadableInstant) dateMidnight10, periodType11);
        int int13 = dateMidnight10.getYear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration16, (org.joda.time.ReadableInstant) dateMidnight19, periodType20);
        int int22 = dateMidnight19.getYear();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight19.withDayOfMonth((int) (byte) 10);
        boolean boolean25 = dateMidnight10.isBefore((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.DateTime dateTime26 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) dateMidnight10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = localDateTime3.withEra((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("de", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay1 = org.joda.time.MonthDay.parse("en_US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"en_US\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(100L, (long) (short) -1);
        mutablePeriod2.setMinutes(11);
        java.lang.String str5 = mutablePeriod2.toString();
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT11M0.101S" + "'", str5, "PT11M0.101S");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(12, (int) 'u', (int) (short) -1);
        java.util.Calendar.Builder builder9 = builder0.setTimeOfDay(292278993, 8, (int) 'a', 7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder12 = builder9.set(292278993, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(1L, dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight4, readableDuration5, periodType6);
        int int8 = dateMidnight4.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = dateMidnight4.getZone();
        org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.now(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj0, dateTimeZone9);
        org.joda.time.DateTime.Property property13 = dateTime12.yearOfEra();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar4);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar4);
        int int7 = yearMonthDay6.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime9 = yearMonthDay8.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate10 = dateTime9.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withCenturyOfEra(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str17 = dateTimeFieldType16.getName();
        org.joda.time.DateTime dateTime19 = dateTime13.withField(dateTimeFieldType16, (int) 'u');
        int int20 = dateTime9.get(dateTimeFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property21 = yearMonthDay6.property(dateTimeFieldType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454809993,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=49,MILLISECOND=993,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "minuteOfDay" + "'", str17, "minuteOfDay");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.YearMonthDay yearMonthDay7 = property3.setCopy(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = yearMonthDay7.getFieldType((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay7);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plusDays((int) 'a');
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusMonths(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight8 = dateMidnight4.withDayOfMonth(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        boolean boolean7 = charSet3.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5);
        boolean boolean8 = charSet3.isEmpty();
        java.util.Spliterator<java.lang.Character> charSpliterator9 = charSet3.spliterator();
        java.lang.Class<?> wildcardClass10 = charSet3.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fran\347ais (France)" + "'", str2, "fran\347ais (France)");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(charSpliterator9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.Instant instant5 = instant3.minus((long) 32769);
        org.joda.time.Instant instant6 = instant3.toInstant();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology2);
        long long4 = interval3.getEndMillis();
        java.lang.String str5 = interval3.toString();
        org.joda.time.MutableInterval mutableInterval6 = interval3.toMutableInterval();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) 1970, dateTimeZone8);
        int int10 = localDate9.getDayOfWeek();
        org.joda.time.LocalDate localDate12 = localDate9.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval13 = localDate9.toInterval();
        boolean boolean14 = interval3.contains((org.joda.time.ReadableInterval) interval13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(1L, dateTimeZone17);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period(readableDuration15, (org.joda.time.ReadableInstant) dateMidnight18, periodType19);
        int int21 = dateMidnight18.getYear();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight18.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime24 = dateMidnight23.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime24.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime24.copy();
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str28 = dateTimeFieldType27.getName();
        mutableDateTime26.set(dateTimeFieldType27, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval31 = interval13.withStart((org.joda.time.ReadableInstant) mutableDateTime26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.010Z" + "'", str5, "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(mutableInterval6);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(mutableDateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "minuteOfDay" + "'", str28, "minuteOfDay");
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        org.joda.time.Hours hours6 = period5.toStandardHours();
        org.joda.time.Period period8 = period5.minusMillis((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int10 = period5.getValue(600100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 600100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableDuration3, (org.joda.time.ReadableInstant) dateMidnight6, periodType7);
        org.joda.time.Hours hours9 = period8.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period12 = period8.withFieldAdded(durationFieldType10, 100);
        org.joda.time.Period period21 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period23 = period21.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.plusDays((int) 'a');
        org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period21, (org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(chronology30);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology30);
        org.joda.time.DurationField durationField33 = durationFieldType10.getField(chronology30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate(6, 21, 12, chronology30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(durationField33);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        java.util.Date date8 = dateTime4.toDate();
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromDateFields(date8);
        int int10 = date8.getDay();
        java.lang.String str11 = date8.toLocaleString();
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime13 = yearMonthDay12.toDateTimeAtMidnight();
        java.util.Date date14 = dateTime13.toDate();
        date14.setMonth((int) '#');
        int int17 = date14.getMinutes();
        date14.setYear((int) (byte) 0);
        int int20 = date8.compareTo(date14);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Mon Dec 30 00:00:00 UTC 569");
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "30 d\351c. 0569 00:00:00" + "'", str11, "30 d\351c. 0569 00:00:00");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Fri Dec 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + (-1) + "'", int20 == (-1));
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMillis(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withField(dateTimeFieldType6, (int) (short) 10);
        int int10 = localDateTime9.getWeekOfWeekyear();
        java.util.TimeZone timeZone12 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        int int15 = dateTimeZone13.getStandardOffset((long) 5);
        java.lang.String str17 = dateTimeZone13.getShortName(100L);
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("fran\347ais (France)");
        java.lang.String str21 = dateTimeZone13.getName((long) (short) 0, locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = localDateTime9.toString("en_US", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "minuteOfDay" + "'", str7, "minuteOfDay");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+00:00" + "'", str17, "+00:00");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        java.time.Instant instant5 = calendar4.toInstant();
        java.util.Locale locale8 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap9 = calendar4.getDisplayNames(710, 4, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454811066,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=51,MILLISECOND=66,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant5);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusHours((int) (short) 0);
        int int4 = timeOfDay3.getHourOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay3.millisOfSecond();
        org.joda.time.Period period14 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period16 = period14.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.plusDays((int) 'a');
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period14, (org.joda.time.ReadableInstant) dateMidnight21);
        org.joda.time.Chronology chronology23 = interval22.getChronology();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(chronology23);
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay((java.lang.Object) property5, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.TimeOfDay$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        boolean boolean3 = dateTimeZone1.isFixed();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        int int5 = mutableDateTime4.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(70, 0, (int) (byte) 10, (int) (byte) 10, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.monthOfYear();
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        int int21 = property19.getMaximumShortTextLength(locale20);
        org.joda.time.DurationField durationField22 = property19.getDurationField();
        long long24 = durationField22.getValueAsLong((long) ' ');
        long long27 = durationField22.subtract((long) (short) 1, 5);
        boolean boolean28 = durationField22.isSupported();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-13219199999L) + "'", long27 == (-13219199999L));
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        org.joda.time.MutableDateTime.Property property12 = mutableDateTime9.dayOfMonth();
        int int13 = mutableDateTime9.getCenturyOfEra();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Instant instant3 = dateTime2.toInstant();
        org.joda.time.LocalDate localDate4 = dateTime2.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime2.withEra(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(1970, 32769, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        calendar4.clear();
        java.util.Date date6 = calendar4.getTime();
        int int7 = date6.getMinutes();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withCenturyOfEra(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str14 = dateTimeFieldType13.getName();
        org.joda.time.DateTime dateTime16 = dateTime10.withField(dateTimeFieldType13, (int) 'u');
        java.lang.String str17 = dateTimeFieldType13.toString();
        org.joda.time.Period period26 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period28 = period26.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(1L, dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.plusDays((int) 'a');
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period26, (org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.DateMidnight dateMidnight36 = org.joda.time.DateMidnight.now(chronology35);
        boolean boolean37 = dateTimeFieldType13.isSupported(chronology35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((java.lang.Object) int7, chronology35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "minuteOfDay" + "'", str14, "minuteOfDay");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "minuteOfDay" + "'", str17, "minuteOfDay");
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.secondOfDay();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((long) 4, chronology21);
        int[] intArray24 = new int[] {};
        org.joda.time.ReadableDuration readableDuration26 = null;
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(1L, dateTimeZone28);
        org.joda.time.PeriodType periodType30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period(readableDuration26, (org.joda.time.ReadableInstant) dateMidnight29, periodType30);
        int int32 = dateMidnight29.getYear();
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight29.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(1L, dateTimeZone37);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableDuration35, (org.joda.time.ReadableInstant) dateMidnight38, periodType39);
        int int41 = dateMidnight38.getYear();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight38.withDayOfMonth((int) (byte) 10);
        boolean boolean44 = dateMidnight29.isBefore((org.joda.time.ReadableInstant) dateMidnight43);
        org.joda.time.DateMidnight.Property property45 = dateMidnight43.monthOfYear();
        java.util.Locale locale46 = java.util.Locale.JAPAN;
        int int47 = property45.getMaximumShortTextLength(locale46);
        boolean boolean48 = locale46.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray49 = dateTimeField19.set((org.joda.time.ReadablePartial) timeOfDay22, (int) (short) 10, intArray24, "2022-02-21", locale46);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[]");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1970 + "'", int32 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1970 + "'", int41 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2 + "'", int47 == 2);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        int int5 = localDateTime3.getMonthOfYear();
        java.util.Date date6 = localDateTime3.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withMillisOfDay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.setMillis((long) (byte) 10);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime17 = localTime15.minusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.millis();
        boolean boolean19 = localTime15.isSupported(durationFieldType18);
        mutableDateTime9.add(durationFieldType18, (-1));
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        mutableDateTime9.setZoneRetainFields(dateTimeZone23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime9.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime26 = property25.roundHalfFloor();
        org.joda.time.tz.NameProvider nameProvider28 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale30 = java.util.Locale.forLanguageTag("janvier");
        java.lang.String str33 = nameProvider28.getName(locale30, "", "years");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = mutableDateTime26.toString("DateTimeField[year]", locale30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(nameProvider28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "janvier");
        org.junit.Assert.assertNull(str33);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.Period period12 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period14 = period12.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(1L, dateTimeZone16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.plusDays((int) 'a');
        org.joda.time.Interval interval20 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period12, (org.joda.time.ReadableInstant) dateMidnight19);
        org.joda.time.Chronology chronology21 = interval20.getChronology();
        org.joda.time.DateMidnight dateMidnight22 = org.joda.time.DateMidnight.now(chronology21);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.now(chronology21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((int) (short) 100, 6, (int) 'a', 32769, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(localTime23);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.LocalTime localTime5 = dateTime2.toLocalTime();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime7 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 1970, dateTimeZone9);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        boolean boolean12 = localDate10.isSupported(dateTimeFieldType11);
        org.joda.time.LocalDate localDate14 = localDate10.withWeekyear((-1));
        boolean boolean16 = localDate14.equals((java.lang.Object) 8);
        int int17 = localDate14.getYear();
        boolean boolean18 = yearMonthDay6.equals((java.lang.Object) localDate14);
        org.joda.time.LocalDate.Property property19 = localDate14.yearOfEra();
        org.joda.time.LocalDate localDate21 = property19.addToCopy(8);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean22 = localTime5.isAfter((org.joda.time.ReadablePartial) localDate21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + (-1) + "'", int17 == (-1));
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyear();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean22 = dateTimeZone21.isFixed();
        org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone21);
        int int24 = localDateTime23.getMillisOfSecond();
        org.joda.time.LocalDateTime.Property property25 = localDateTime23.yearOfEra();
        org.joda.time.LocalDateTime.Property property26 = localDateTime23.millisOfDay();
        int[] intArray29 = new int[] { 19 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = dateTimeField19.addWrapField((org.joda.time.ReadablePartial) localDateTime23, (-1), intArray29, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 100 + "'", int24 == 100);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[19]");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight8, readableDuration11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight8.withDayOfWeek(4);
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.dayOfYear();
        org.joda.time.DateMidnight dateMidnight17 = property15.addToCopy((int) 'u');
        org.joda.time.DateMidnight.Property property18 = dateMidnight17.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight20 = property18.setCopy("months");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"months\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.YearMonthDay yearMonthDay7 = property3.setCopy(2);
        org.joda.time.DateTimeField dateTimeField8 = property3.getField();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.lang.String str11 = dateTimeField8.getAsShortText((int) ' ', locale10);
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime13 = yearMonthDay12.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((long) 1970, dateTimeZone15);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = localDate16.isSupported(dateTimeFieldType17);
        org.joda.time.LocalDate localDate20 = localDate16.withWeekyear((-1));
        boolean boolean22 = localDate20.equals((java.lang.Object) 8);
        int int23 = localDate20.getYear();
        boolean boolean24 = yearMonthDay12.equals((java.lang.Object) localDate20);
        org.joda.time.LocalDate.Property property25 = localDate20.yearOfEra();
        org.joda.time.LocalDate localDate27 = property25.addToCopy(8);
        org.joda.time.LocalDate localDate29 = localDate27.withDayOfWeek(3);
        int[] intArray37 = new int[] { 4, 12, (byte) 100, (-1), 3, (byte) 10 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = dateTimeField8.addWrapPartial((org.joda.time.ReadablePartial) localDate29, 19, intArray37, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[4, 12, 100, -1, 3, 10]");
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("janvier");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"janvier\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean5 = localDate2.isSupported(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(1970);
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = property8.setCopy("centuryOfEra", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"centuryOfEra\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        long long9 = dateTimeField6.add((long) (byte) 10, (long) '4');
        java.util.Locale locale10 = java.util.Locale.US;
        int int11 = dateTimeField6.getMaximumTextLength(locale10);
        long long13 = dateTimeField6.roundHalfEven((long) (-1));
        long long15 = dateTimeField6.roundHalfFloor((long) 6);
        long long17 = dateTimeField6.roundHalfFloor((long) 8);
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime19 = yearMonthDay18.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray20 = yearMonthDay18.getFieldTypes();
        int int21 = yearMonthDay18.getMonthOfYear();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime24 = yearMonthDay23.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime25 = yearMonthDay23.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property26 = yearMonthDay23.year();
        java.util.Locale locale27 = java.util.Locale.GERMANY;
        java.lang.String str28 = property26.getAsText(locale27);
        org.joda.time.YearMonthDay yearMonthDay30 = property26.setCopy(2);
        org.joda.time.DateTimeField dateTimeField31 = property26.getField();
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.lang.String str34 = dateTimeField31.getAsShortText((int) ' ', locale33);
        java.lang.String str35 = dateTimeField6.getAsText((org.joda.time.ReadablePartial) yearMonthDay18, 7, locale33);
        java.util.Locale.Category category36 = java.util.Locale.Category.FORMAT;
        boolean boolean37 = locale33.equals((java.lang.Object) category36);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1640995200010L + "'", long9 == 1640995200010L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "2022" + "'", str28, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "32" + "'", str34, "32");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "7" + "'", str35, "7");
        org.junit.Assert.assertTrue("'" + category36 + "' != '" + java.util.Locale.Category.FORMAT + "'", category36.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay.Property property1 = monthDay0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField2 = property1.getField();
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime4 = yearMonthDay3.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime5 = yearMonthDay3.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay3.year();
        java.util.Locale locale7 = java.util.Locale.GERMANY;
        java.lang.String str8 = property6.getAsText(locale7);
        org.joda.time.YearMonthDay yearMonthDay10 = property6.setCopy(2);
        int[] intArray14 = new int[] { 9, (byte) 1 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = dateTimeField2.addWrapField((org.joda.time.ReadablePartial) yearMonthDay10, (int) (short) 0, intArray14, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022" + "'", str8, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[9, 1]");
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        int int5 = localDateTime3.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withHourOfDay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.YearMonthDay yearMonthDay7 = property3.setCopy(2);
        org.joda.time.DateTimeField dateTimeField8 = property3.getField();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.lang.String str11 = dateTimeField8.getAsShortText((int) ' ', locale10);
        org.joda.time.Period period12 = org.joda.time.Period.ZERO;
        org.joda.time.Period period14 = period12.minusSeconds((int) (byte) 0);
        org.joda.time.Period period16 = period14.minusSeconds((int) '#');
        org.joda.time.MutablePeriod mutablePeriod17 = period14.toMutablePeriod();
        boolean boolean18 = locale10.equals((java.lang.Object) mutablePeriod17);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "32" + "'", str11, "32");
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(mutablePeriod17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate2.withField(dateTimeFieldType5, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(100L, dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime10 = dateTime8.plus((long) (-1));
        org.joda.time.DateTime dateTime11 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime8.withDurationAdded(readableDuration12, 1970);
        int int15 = property3.compareTo((org.joda.time.ReadableInstant) dateTime8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime8.withTime(569, (int) 'u', 49, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 569 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) 100, 4, (int) ' ', 0, (-292275054), (int) (short) -1, (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = java.util.Locale.JAPANESE;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(100, 21, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("fran\347ais (France)");
        java.lang.String str8 = property3.getAsText(locale7);
        java.lang.String str9 = property3.getAsShortText();
        org.joda.time.PeriodType periodType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object) str9, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "2022" + "'", str8, "2022");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology2);
        long long4 = interval3.getEndMillis();
        java.lang.String str5 = interval3.toString();
        org.joda.time.MutableInterval mutableInterval6 = interval3.toMutableInterval();
        org.joda.time.Period period7 = interval3.toPeriod();
        org.joda.time.Period period9 = period7.plusMinutes(710);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.010Z" + "'", str5, "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(mutableInterval6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period9);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight21 = dateMidnight17.withYearOfCentury(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withDurationAdded(readableDuration8, 1970);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime12 = yearMonthDay11.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.DateTime dateTime16 = dateTime12.toDateTime(dateTimeZone15);
        org.joda.time.DateTime dateTime17 = dateTime4.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime19 = dateTime4.minusYears(0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        org.joda.time.Period period15 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period17 = period15.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.plusDays((int) 'a');
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period15, (org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(chronology24);
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(chronology24);
        org.joda.time.DateTimeField dateTimeField27 = chronology24.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(32769, (int) 'u', 49, 52, (int) (short) 1, 21, 21, chronology24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeField27);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((long) 1970, dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localDate4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDate localDate8 = localDate4.withWeekyear((-1));
        boolean boolean10 = localDate8.equals((java.lang.Object) 8);
        int int11 = localDate8.getYear();
        boolean boolean12 = yearMonthDay0.equals((java.lang.Object) localDate8);
        org.joda.time.LocalDate.Property property13 = localDate8.yearOfEra();
        org.joda.time.LocalDate localDate15 = property13.addToCopy(8);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfWeek(3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = localDate17.toString("January");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("0570-01-01T00:00:00.100Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '0570-01-01T00:00:00.100Z' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType2 = periodType0.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        org.joda.time.Hours hours6 = period5.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period9 = period5.withFieldAdded(durationFieldType7, 100);
        org.joda.time.Period period18 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period20 = period18.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(1L, dateTimeZone22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.plusDays((int) 'a');
        org.joda.time.Interval interval26 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period18, (org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.Chronology chronology27 = interval26.getChronology();
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(chronology27);
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(chronology27);
        org.joda.time.DurationField durationField30 = durationFieldType7.getField(chronology27);
        org.joda.time.LocalTime localTime32 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime34 = localTime32.minusSeconds((int) (byte) 10);
        org.joda.time.LocalTime.Property property35 = localTime34.millisOfSecond();
        org.joda.time.LocalTime localTime36 = property35.roundCeilingCopy();
        org.joda.time.LocalTime localTime37 = property35.roundCeilingCopy();
        org.joda.time.LocalTime localTime38 = property35.roundHalfFloorCopy();
        int[] intArray41 = new int[] { (byte) 100, (-1) };
        // The following exception was thrown during execution in test generation
        try {
            chronology27.validate((org.joda.time.ReadablePartial) localTime38, intArray41);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(intArray41);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray41), "[100, -1]");
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.lang.Character[] charArray7 = new java.lang.Character[] { '4', '4' };
        java.util.LinkedHashSet<java.lang.Character> charSet8 = new java.util.LinkedHashSet<java.lang.Character>();
        boolean boolean9 = java.util.Collections.addAll((java.util.Collection<java.lang.Character>) charSet8, charArray7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(100L, dateTimeZone11);
        boolean boolean13 = dateTimeZone11.isFixed();
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone11);
        boolean boolean15 = charSet8.contains((java.lang.Object) dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((int) 'u', (int) (short) 1, 11, 1, 200, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 200 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(charArray7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, readableDuration9);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = property11.setCopy("YearMonthDayTime");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"YearMonthDayTime\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withYear(710);
        org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.plusHours((int) (short) 0);
        org.joda.time.TimeOfDay timeOfDay9 = timeOfDay5.minusMillis((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean10 = yearMonthDay0.isAfter((org.joda.time.ReadablePartial) timeOfDay5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(timeOfDay9);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight2, readableDuration3, periodType4);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod5.setPeriod(1L, chronology7);
        org.joda.time.Period period17 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period19 = period17.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.plusDays((int) 'a');
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period17, (org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.Chronology chronology26 = interval25.getChronology();
        org.joda.time.DateMidnight dateMidnight27 = org.joda.time.DateMidnight.now(chronology26);
        long long31 = chronology26.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.now(chronology26);
        org.joda.time.DateMidnight dateMidnight33 = org.joda.time.DateMidnight.now(chronology26);
        org.joda.time.DurationField durationField34 = chronology26.minutes();
        org.joda.time.DurationField durationField35 = chronology26.millis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay36 = new org.joda.time.TimeOfDay((java.lang.Object) mutablePeriod5, chronology26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 0L + "'", long31 == 0L);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(durationField35);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.setMillis((long) (byte) 10);
        int int14 = mutableDateTime9.getYearOfEra();
        mutableDateTime9.setWeekyear(11);
        mutableDateTime9.addYears(5);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setMinuteOfDay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        org.joda.time.YearMonthDay yearMonthDay8 = property3.setCopy((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((java.lang.Object) yearMonthDay8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(yearMonthDay8);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        java.util.Date date2 = dateTime1.toDate();
        date2.setMonth((int) '#');
        int int5 = date2.getMinutes();
        date2.setYear((int) (byte) 0);
        int int8 = date2.getTimezoneOffset();
        int int9 = date2.getHours();
        java.lang.String str10 = date2.toString();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Fri Dec 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Fri Dec 21 00:00:00 UTC 1900" + "'", str10, "Fri Dec 21 00:00:00 UTC 1900");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay.Property property1 = monthDay0.dayOfMonth();
        java.lang.String str2 = property1.getName();
        java.util.Locale locale4 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay5 = property1.setCopy("3940", locale4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 3940 for dayOfMonth must be in the range [1,29]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "dayOfMonth" + "'", str2, "dayOfMonth");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Interval interval7 = interval5.withDurationBeforeEnd(readableDuration6);
        org.joda.time.Period period8 = interval5.toPeriod();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        org.joda.time.Hours hours15 = period14.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period18 = period14.withFieldAdded(durationFieldType16, 100);
        org.joda.time.Period period20 = period8.withFieldAdded(durationFieldType16, (int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = localDate1.withFieldAdded(durationFieldType16, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millis' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(period20);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.dayOfMonth();
        mutableDateTime9.addSeconds(710);
        mutableDateTime9.setSecondOfMinute(12);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime9.year();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime9.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setTime(19, 1970, (int) ' ', 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        java.util.Date date8 = dateTime4.toDate();
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromDateFields(date8);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.withDayOfMonth(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.withMonthOfYear(600100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 600100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Mon Dec 30 00:00:00 UTC 569");
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(yearMonthDay11);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        int int6 = property3.get();
        org.joda.time.YearMonthDay yearMonthDay8 = property3.setCopy(70);
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay8.year();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime11 = yearMonthDay10.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate12 = dateTime11.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withCenturyOfEra(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str19 = dateTimeFieldType18.getName();
        org.joda.time.DateTime dateTime21 = dateTime15.withField(dateTimeFieldType18, (int) 'u');
        int int22 = dateTime11.get(dateTimeFieldType18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay8.withField(dateTimeFieldType18, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "minuteOfDay" + "'", str19, "minuteOfDay");
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        int int5 = localDateTime3.getMonthOfYear();
        java.util.Date date6 = localDateTime3.toDate();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration7, (org.joda.time.ReadableInstant) dateMidnight10, periodType11);
        int int13 = dateMidnight10.getYear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration16, (org.joda.time.ReadableInstant) dateMidnight19, periodType20);
        int int22 = dateMidnight19.getYear();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight19.withDayOfMonth((int) (byte) 10);
        boolean boolean25 = dateMidnight10.isBefore((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.DateTime dateTime26 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime3.withMillisOfSecond((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            int int30 = localDateTime28.getValue(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32769");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.Period period11 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period13 = period11.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.plusDays((int) 'a');
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period11, (org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.now(chronology20);
        org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime(8, (int) (short) 1, (int) (byte) 1);
        long long27 = chronology20.set((org.joda.time.ReadablePartial) localTime25, 10L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(0, (int) (byte) 1, 32770, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 28861000L + "'", long27 == 28861000L);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.millis();
        boolean boolean5 = localTime1.isSupported(durationFieldType4);
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) 0);
        int int8 = localTime7.getMinuteOfHour();
        boolean boolean9 = localTime1.equals((java.lang.Object) localTime7);
        org.joda.time.LocalTime localTime11 = localTime1.withMinuteOfHour(0);
        org.joda.time.ReadablePartial readablePartial12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localTime1.compareTo(readablePartial12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean5 = localDate2.isSupported(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(1970);
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        org.joda.time.Hours hours15 = period14.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period18 = period14.withFieldAdded(durationFieldType16, 100);
        boolean boolean19 = localDate7.isSupported(durationFieldType16);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(hours15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        java.util.Date date2 = dateTime1.toDate();
        date2.setMonth((int) '#');
        int int5 = date2.getMinutes();
        date2.setYear((int) (byte) 0);
        int int8 = date2.getTimezoneOffset();
        int int9 = date2.getHours();
        int int10 = date2.getSeconds();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Fri Dec 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        int int5 = localDateTime3.getMonthOfYear();
        java.util.Date date6 = localDateTime3.toDate();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.minusMinutes((-1));
        int int9 = localDateTime3.getWeekyear();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime3.minusMonths((int) '4');
        int[] intArray12 = localDateTime11.getValues();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(intArray12);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[1965, 9, 1, 100]");
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusHours((int) (short) 0);
        int int4 = timeOfDay3.getSecondOfMinute();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay3.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay7 = property5.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar4);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar4);
        java.util.Date date7 = calendar4.getTime();
        int int8 = date7.getDay();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454816140,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=56,MILLISECOND=140,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Feb 21 14:46:56 UTC 2022");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.secondOfDay();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone22 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean23 = timeZone20.hasSameRules(timeZone22);
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(timeZone22);
        java.time.Instant instant25 = calendar24.toInstant();
        org.joda.time.YearMonthDay yearMonthDay26 = org.joda.time.YearMonthDay.fromCalendarFields(calendar24);
        java.util.Locale locale27 = java.util.Locale.CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dateTimeField19.getAsText((org.joda.time.ReadablePartial) yearMonthDay26, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=1645454816246,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=56,MILLISECOND=246,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DurationFieldType durationFieldType1 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DurationFieldType[] durationFieldTypeArray2 = new org.joda.time.DurationFieldType[] { durationFieldType0, durationFieldType1 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.forFields(durationFieldTypeArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: PeriodType does not support fields: [millis]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType1);
        org.junit.Assert.assertNotNull(durationFieldTypeArray2);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay.Property property1 = monthDay0.dayOfMonth();
        java.lang.String str2 = property1.getName();
        int int3 = property1.getMaximumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay5 = property1.setCopy((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,29]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "dayOfMonth" + "'", str2, "dayOfMonth");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 31 + "'", int3 == 31);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        java.util.Date date8 = dateTime4.toDate();
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromDateFields(date8);
        int int10 = yearMonthDay9.getYear();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray11 = yearMonthDay9.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Mon Dec 30 00:00:00 UTC 569");
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 569 + "'", int10 == 569);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray11);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = new org.joda.time.Instant((java.lang.Object) yearMonthDay0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.YearMonthDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.Period period9 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period11 = period9.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plusDays((int) 'a');
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period9, (org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DateMidnight dateMidnight19 = org.joda.time.DateMidnight.now(chronology18);
        org.joda.time.TimeOfDay timeOfDay20 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 0, chronology18);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = chronology18.getDateTimeMillis((int) (byte) 0, 20, (int) (short) 100, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(timeOfDay20);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(2, 32, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("fra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"fra\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean5 = localDate2.isSupported(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(1970);
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        org.joda.time.LocalDate localDate9 = property8.roundHalfCeilingCopy();
        boolean boolean10 = property8.isLeap();
        org.joda.time.LocalDate localDate11 = property8.withMinimumValue();
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        java.lang.String str15 = locale13.getDisplayName(locale14);
        java.util.Set<java.lang.Character> charSet16 = locale13.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = property8.setCopy("\u30d5\u30e9\u30f3\u30b9\u8a9e", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"?????\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "fran\347ais (France)" + "'", str15, "fran\347ais (France)");
        org.junit.Assert.assertNotNull(charSet16);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) -1, (long) (byte) 0, chronology2);
        org.joda.time.Period period12 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period14 = period12.minusMillis(0);
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) period14);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setValue(31, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("1970-01-01T06:00:00.021Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01T06:00:00.021Z\" is malformed at \"70-01-01T06:00:00.021Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime3 = localTime1.minusSeconds((int) (byte) 10);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfSecond();
        org.joda.time.LocalTime localTime5 = property4.roundCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.withMinuteOfHour(35);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTime dateTime10 = dateTime4.withDurationAdded(readableDuration8, 1970);
        int int11 = dateTime4.getSecondOfDay();
        org.joda.time.DateTime dateTime13 = dateTime4.plusMonths(600100);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.Period period15 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period17 = period15.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.plusDays((int) 'a');
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period15, (org.joda.time.ReadableInstant) dateMidnight22);
        org.joda.time.Chronology chronology24 = interval23.getChronology();
        org.joda.time.DateMidnight dateMidnight25 = org.joda.time.DateMidnight.now(chronology24);
        long long29 = chronology24.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight30 = org.joda.time.DateMidnight.now(chronology24);
        org.joda.time.DateTimeField dateTimeField31 = chronology24.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime(21, (int) '#', 32769, (int) (byte) 0, (int) (short) 1, 570, (int) (short) 10, chronology24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 570 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(dateTimeField31);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay8 = property3.setCopy("PeriodType[Hours]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PeriodType[Hours]\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.Period period3 = org.joda.time.Period.ZERO;
        org.joda.time.Period period5 = period3.minusSeconds((int) (byte) 0);
        org.joda.time.Period period7 = period5.minusSeconds((int) '#');
        org.joda.time.MutablePeriod mutablePeriod8 = period5.toMutablePeriod();
        mutablePeriod8.setPeriod((long) 100);
        mutablePeriod8.setMillis((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay18 = timeOfDay16.plusHours((int) (short) 0);
        int int19 = timeOfDay18.getHourOfDay();
        org.joda.time.TimeOfDay.Property property20 = timeOfDay18.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField21 = property20.getField();
        org.joda.time.TimeOfDay timeOfDay22 = property20.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay24 = property20.addToCopy(49);
        org.joda.time.Period period33 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period35 = period33.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(1L, dateTimeZone37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.plusDays((int) 'a');
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period33, (org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.Chronology chronology42 = interval41.getChronology();
        org.joda.time.DateMidnight dateMidnight43 = org.joda.time.DateMidnight.now(chronology42);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(1L, dateTimeZone45);
        org.joda.time.ReadableDuration readableDuration47 = null;
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight46, readableDuration47, periodType48);
        org.joda.time.Chronology chronology51 = null;
        mutablePeriod49.setPeriod(1L, chronology51);
        long long55 = chronology42.add((org.joda.time.ReadablePeriod) mutablePeriod49, (long) (short) 0, 32769);
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay24.withChronologyRetainFields(chronology42);
        mutablePeriod8.setPeriod((long) 52, 28861000L, chronology42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay58 = new org.joda.time.TimeOfDay((int) 'u', (int) (byte) 100, (int) (short) -1, chronology42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(timeOfDay18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(timeOfDay22);
        org.junit.Assert.assertNotNull(timeOfDay24);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 32769L + "'", long55 == 32769L);
        org.junit.Assert.assertNotNull(timeOfDay56);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        int int8 = dateTime4.getMinuteOfDay();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        int int12 = mutableDateTime9.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.weekyear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) 12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.yearOfCentury();
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay20 = timeOfDay18.plusHours((int) (short) 0);
        int int21 = timeOfDay20.getHourOfDay();
        org.joda.time.TimeOfDay.Property property22 = timeOfDay20.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime15.setRounding(dateTimeField23, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime7 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime8 = yearMonthDay6.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay6.year();
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = property9.getAsText(locale10);
        org.joda.time.DateTimeField dateTimeField12 = property9.getField();
        long long15 = dateTimeField12.add((long) (byte) 10, (long) '4');
        int int16 = dateMidnight3.get(dateTimeField12);
        org.joda.time.DurationField durationField17 = dateTimeField12.getDurationField();
        long long20 = durationField17.add((long) 'u', 28861000L);
        long long23 = durationField17.getMillis(54, 1645454801199L);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1640995200010L + "'", long15 == 1640995200010L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 910765191715200117L + "'", long20 == 910765191715200117L);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 1704067200000L + "'", long23 == 1704067200000L);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (short) 0, chronology1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableDuration3, (org.joda.time.ReadableInstant) dateMidnight6, periodType7);
        int int9 = dateMidnight6.getYear();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight6.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight11, readableDuration12);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight11, readableDuration14, periodType15);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay2.minus((org.joda.time.ReadablePeriod) mutablePeriod16);
        java.lang.Object obj18 = mutablePeriod16.clone();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod16.setPeriod(366, 32, (int) (byte) 100, 600100, (-292275054), 4, 366, 600100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertEquals(obj18.toString(), "PT0S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj18), "PT0S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj18), "PT0S");
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.monthOfYear();
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        int int21 = property19.getMaximumShortTextLength(locale20);
        org.joda.time.DurationField durationField22 = property19.getDurationField();
        long long25 = durationField22.getDifferenceAsLong((long) '4', 0L);
        int int28 = durationField22.getValue((long) (byte) 0, (-1L));
        boolean boolean29 = durationField22.isSupported();
        long long30 = durationField22.getUnitMillis();
        long long33 = durationField22.getDifferenceAsLong((long) 52, (long) 7);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 2629746000L + "'", long30 == 2629746000L);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.dayOfMonth();
        mutableDateTime9.addSeconds(710);
        mutableDateTime9.setSecondOfMinute(12);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime9.year();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setDayOfWeek(200);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 200 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusHours((int) (short) 0);
        int int4 = timeOfDay3.getSecondOfMinute();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay3.hourOfDay();
        int int7 = timeOfDay3.getValue(2);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        org.joda.time.Hours hours6 = period5.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period9 = period5.withFieldAdded(durationFieldType7, 100);
        org.joda.time.Period period11 = period5.withMonths(3);
        org.junit.Assert.assertNotNull(hours6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(period11);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar4);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(1L, dateTimeZone10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableDuration8, (org.joda.time.ReadableInstant) dateMidnight11, periodType12);
        int int14 = dateMidnight11.getYear();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(1L, dateTimeZone19);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period(readableDuration17, (org.joda.time.ReadableInstant) dateMidnight20, periodType21);
        int int23 = dateMidnight20.getYear();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight20.withDayOfMonth((int) (byte) 10);
        boolean boolean26 = dateMidnight11.isBefore((org.joda.time.ReadableInstant) dateMidnight25);
        org.joda.time.DateMidnight.Property property27 = dateMidnight25.monthOfYear();
        java.util.Locale locale28 = java.util.Locale.JAPAN;
        int int29 = property27.getMaximumShortTextLength(locale28);
        java.lang.String str30 = property27.getAsString();
        java.lang.String str31 = property27.getAsText();
        java.util.Locale locale32 = java.util.Locale.FRANCE;
        java.util.Locale locale33 = java.util.Locale.FRANCE;
        java.lang.String str34 = locale32.getDisplayName(locale33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(1L, dateTimeZone37);
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period(readableDuration35, (org.joda.time.ReadableInstant) dateMidnight38, periodType39);
        int int41 = dateMidnight38.getYear();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight38.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(1L, dateTimeZone46);
        org.joda.time.PeriodType periodType48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period(readableDuration44, (org.joda.time.ReadableInstant) dateMidnight47, periodType48);
        int int50 = dateMidnight47.getYear();
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight47.withDayOfMonth((int) (byte) 10);
        boolean boolean53 = dateMidnight38.isBefore((org.joda.time.ReadableInstant) dateMidnight52);
        org.joda.time.DateMidnight.Property property54 = dateMidnight52.monthOfYear();
        java.util.Locale locale55 = java.util.Locale.JAPAN;
        int int56 = property54.getMaximumShortTextLength(locale55);
        java.lang.String str57 = locale33.getDisplayLanguage(locale55);
        java.util.Locale.setDefault(locale33);
        int int59 = property27.getMaximumTextLength(locale33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = calendar4.getDisplayName(292278993, 70, locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454818341,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=58,MILLISECOND=341,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1970 + "'", int23 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2 + "'", int29 == 2);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1" + "'", str30, "1");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "janvier" + "'", str31, "janvier");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "fran\347ais (France)" + "'", str34, "fran\347ais (France)");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1970 + "'", int41 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1970 + "'", int50 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertNotNull(property54);
        org.junit.Assert.assertNotNull(locale55);
        org.junit.Assert.assertEquals(locale55.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2 + "'", int56 == 2);
        org.junit.Assert.assertEquals("'" + str57 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str57, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.time.ZoneId zoneId2 = timeZone0.toZoneId();
        java.time.ZoneId zoneId3 = timeZone0.toZoneId();
        int int4 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("Thursday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Thursday\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(0, 0, 21, 70, 366, (-15993));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTime dateTime5 = dateTime1.toDateTime(dateTimeZone4);
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = locale7.getDisplayName(locale8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period(readableDuration10, (org.joda.time.ReadableInstant) dateMidnight13, periodType14);
        int int16 = dateMidnight13.getYear();
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight13.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableDuration19, (org.joda.time.ReadableInstant) dateMidnight22, periodType23);
        int int25 = dateMidnight22.getYear();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight22.withDayOfMonth((int) (byte) 10);
        boolean boolean28 = dateMidnight13.isBefore((org.joda.time.ReadableInstant) dateMidnight27);
        org.joda.time.DateMidnight.Property property29 = dateMidnight27.monthOfYear();
        java.util.Locale locale30 = java.util.Locale.JAPAN;
        int int31 = property29.getMaximumShortTextLength(locale30);
        java.lang.String str32 = locale8.getDisplayLanguage(locale30);
        java.util.Locale.setDefault(locale8);
        java.lang.String str34 = dateTimeZone4.getName((-5270399989L), locale8);
        java.lang.String str35 = locale8.getDisplayLanguage();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fran\347ais (France)" + "'", str9, "fran\347ais (France)");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2 + "'", int31 == 2);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str32, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "+00:00" + "'", str34, "+00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "fran\347ais" + "'", str35, "fran\347ais");
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime8 = yearMonthDay7.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray9 = yearMonthDay7.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean16 = timeZone13.hasSameRules(timeZone15);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(timeZone15);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateTime dateTime19 = yearMonthDay7.toDateTime(timeOfDay11, dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((-1), 15, 19, 11, 1, 0, (int) (byte) 10, dateTimeZone18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645454818978,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=46,SECOND=58,MILLISECOND=978,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusHours((int) (short) 0);
        int int4 = timeOfDay3.getSecondOfMinute();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay3.hourOfDay();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.util.Locale locale8 = java.util.Locale.FRANCE;
        java.lang.String str9 = locale7.getDisplayName(locale8);
        java.util.Set<java.lang.Character> charSet10 = locale7.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = timeOfDay3.toString("", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "fran\347ais (France)" + "'", str9, "fran\347ais (France)");
        org.junit.Assert.assertNotNull(charSet10);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration7, (org.joda.time.ReadableInstant) dateMidnight10, periodType11);
        int int13 = dateMidnight10.getYear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight15, readableDuration16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight15, readableDuration18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight15.withDayOfWeek(4);
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        org.joda.time.DateTime dateTime25 = dateMidnight21.toDateTime(dateTimeZone23);
        org.joda.time.Period period26 = org.joda.time.Period.ZERO;
        org.joda.time.Period period28 = period26.minusSeconds((int) (byte) 0);
        boolean boolean29 = dateTimeZone23.equals((java.lang.Object) period28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(9, (int) (byte) 100, 8, 9, 35, (int) '#', 12, dateTimeZone23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        calendar4.setTimeInMillis((long) 4);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = calendar4.getActualMinimum((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=4,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=4,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime9.toDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTime();
        int int14 = dateTime12.getMonthOfYear();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean5 = localDate2.isSupported(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(1970);
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfEra();
        java.lang.String str9 = property8.getAsShortText();
        org.joda.time.LocalDate localDate10 = property8.roundFloorCopy();
        int int11 = property8.getMinimumValue();
        org.joda.time.LocalDate localDate12 = property8.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfEra();
        boolean boolean14 = localDate12.isSupported(dateTimeFieldType13);
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) 0);
        int int17 = localTime16.getMinuteOfHour();
        int int18 = localTime16.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDate12.compareTo((org.joda.time.ReadablePartial) localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3940" + "'", str9, "3940");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableDuration3, (org.joda.time.ReadableInstant) dateMidnight6, periodType7);
        org.joda.time.Hours hours9 = period8.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period12 = period8.withFieldAdded(durationFieldType10, 100);
        org.joda.time.Period period21 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period23 = period21.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.plusDays((int) 'a');
        org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period21, (org.joda.time.ReadableInstant) dateMidnight28);
        org.joda.time.Chronology chronology30 = interval29.getChronology();
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now(chronology30);
        org.joda.time.DateTime dateTime32 = org.joda.time.DateTime.now(chronology30);
        org.joda.time.DurationField durationField33 = durationFieldType10.getField(chronology30);
        org.joda.time.DurationField durationField34 = chronology30.centuries();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay35 = new org.joda.time.YearMonthDay((int) (byte) 0, 52, 32770, chronology30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(hours9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(durationField34);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay2 = org.joda.time.MonthDay.parse("dayOfMonth", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder5 = builder0.setWeekDefinition(32770, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(1L, dateTimeZone6);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period(readableDuration4, (org.joda.time.ReadableInstant) dateMidnight7, periodType8);
        int int10 = dateMidnight7.getYear();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight7.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight12, readableDuration13);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight12, readableDuration15);
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod(100L, (long) (short) -1);
        mutablePeriod19.setMinutes(11);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight12, (org.joda.time.ReadablePeriod) mutablePeriod19);
        org.joda.time.Chronology chronology23 = dateMidnight12.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime(59, (-292275054), (-1), (int) '4', chronology23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(chronology23);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone11 = dateTimeZone10.toTimeZone();
        org.joda.time.DateTime dateTime12 = mutableDateTime9.toDateTime(dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime12.toDateTime();
        org.joda.time.Period period22 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period24 = period22.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(1L, dateTimeZone26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.plusDays((int) 'a');
        org.joda.time.Interval interval30 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period22, (org.joda.time.ReadableInstant) dateMidnight29);
        org.joda.time.Chronology chronology31 = interval30.getChronology();
        org.joda.time.DateMidnight dateMidnight32 = org.joda.time.DateMidnight.now(chronology31);
        long long36 = chronology31.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight37 = org.joda.time.DateMidnight.now(chronology31);
        org.joda.time.DateMidnight dateMidnight38 = org.joda.time.DateMidnight.now(chronology31);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay((java.lang.Object) dateTime12, chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((java.lang.Object) yearMonthDay39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.YearMonthDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(timeZone11);
        org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(dateMidnight38);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology2);
        long long4 = interval3.getEndMillis();
        org.joda.time.Interval interval6 = interval3.withEndMillis((long) 11);
        org.joda.time.Period period7 = interval6.toPeriod();
        int int8 = period7.getSeconds();
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 10L + "'", long4 == 10L);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime7 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime8 = yearMonthDay6.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay6.year();
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = property9.getAsText(locale10);
        org.joda.time.DateTimeField dateTimeField12 = property9.getField();
        long long15 = dateTimeField12.add((long) (byte) 10, (long) '4');
        int int16 = dateMidnight3.get(dateTimeField12);
        org.joda.time.DurationField durationField17 = dateTimeField12.getDurationField();
        java.lang.String str18 = durationField17.toString();
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1640995200010L + "'", long15 == 1640995200010L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "DurationField[years]" + "'", str18, "DurationField[years]");
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 49);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("months", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean5 = dateTimeZone4.isFixed();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMillis(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str10 = dateTimeFieldType9.getName();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime6.withField(dateTimeFieldType9, (int) (short) 10);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        int int16 = dateTimeZone14.getStandardOffset((long) 5);
        org.joda.time.DateTime dateTime17 = localDateTime6.toDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(31, (int) (short) -1, 70, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "minuteOfDay" + "'", str10, "minuteOfDay");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(4, 1, 15, 19);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate7);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((java.lang.Object) localDate7);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone12 = dateTimeZone11.toTimeZone();
        org.joda.time.DateMidnight dateMidnight13 = yearMonthDay10.toDateMidnight(dateTimeZone11);
        java.util.TimeZone timeZone14 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        int int17 = dateTimeZone15.getStandardOffset((long) 5);
        java.util.TimeZone timeZone18 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone20 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean21 = timeZone18.hasSameRules(timeZone20);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone20);
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        java.util.TimeZone timeZone24 = dateTimeZone23.toTimeZone();
        long long26 = dateTimeZone15.getMillisKeepLocal(dateTimeZone23, (long) 100);
        org.joda.time.Interval interval27 = yearMonthDay10.toInterval(dateTimeZone15);
        org.joda.time.LocalDate localDate28 = yearMonthDay10.toLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay10.withField(dateTimeFieldType29, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone20);
        org.junit.Assert.assertEquals(timeZone20.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1645454820375,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=0,MILLISECOND=375,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(timeZone24);
        org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime9 = dateTime4.minus((long) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime4.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime10.withLaterOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime10.withWeekOfWeekyear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.minusMillis(0);
        org.joda.time.Period period12 = period8.minusMonths(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Seconds seconds13 = period8.toStandardSeconds();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Seconds as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMillis(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withField(dateTimeFieldType6, (int) (short) 10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray10 = localDateTime3.getFieldTypes();
        int int11 = localDateTime3.getHourOfDay();
        int int12 = localDateTime3.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean15 = dateTimeZone14.isFixed();
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusMillis(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str20 = dateTimeFieldType19.getName();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime16.withField(dateTimeFieldType19, (int) (short) 10);
        boolean boolean23 = localDateTime3.isSupported(dateTimeFieldType19);
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(100L, dateTimeZone25);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now(dateTimeZone25);
        java.util.TimeZone timeZone28 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone30 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean31 = timeZone28.hasSameRules(timeZone30);
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(timeZone30);
        org.joda.time.LocalDate localDate33 = org.joda.time.LocalDate.fromCalendarFields(calendar32);
        org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate27, (org.joda.time.ReadablePartial) localDate33);
        // The following exception was thrown during execution in test generation
        try {
            int int35 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localDate33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "minuteOfDay" + "'", str7, "minuteOfDay");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1970 + "'", int12 == 1970);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "minuteOfDay" + "'", str20, "minuteOfDay");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(timeZone28);
        org.junit.Assert.assertEquals(timeZone28.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone30);
        org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1645454820491,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=0,MILLISECOND=491,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate33);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (byte) 1, (int) (byte) -1, (int) (byte) 10, 59, (int) (short) 1, 971);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone0);
        int int5 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454820639,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=0,MILLISECOND=639,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        java.util.Locale locale1 = java.util.Locale.FRANCE;
        java.lang.String str2 = locale0.getDisplayName(locale1);
        java.util.Set<java.lang.Character> charSet3 = locale0.getExtensionKeys();
        java.util.Locale.LanguageRange[] languageRangeArray4 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList5 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5, languageRangeArray4);
        boolean boolean7 = charSet3.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList5);
        boolean boolean8 = charSet3.isEmpty();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight17, readableDuration18);
        mutablePeriod19.addSeconds(5);
        mutablePeriod19.setPeriod((long) 70);
        mutablePeriod19.addSeconds(0);
        org.joda.time.base.BasePeriod[] basePeriodArray26 = new org.joda.time.base.BasePeriod[] { mutablePeriod19 };
        org.joda.time.base.BasePeriod[] basePeriodArray27 = charSet3.toArray(basePeriodArray26);
        java.util.Locale.LanguageRange[] languageRangeArray28 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList29 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean30 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29, languageRangeArray28);
        java.lang.String[] strArray32 = new java.lang.String[] { "fran\347ais (France)" };
        java.util.ArrayList<java.lang.String> strList33 = new java.util.ArrayList<java.lang.String>();
        boolean boolean34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList33, strArray32);
        java.lang.String str35 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList29, (java.util.Collection<java.lang.String>) strList33);
        boolean boolean36 = charSet3.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList29);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(100L, dateTimeZone38);
        boolean boolean40 = dateTimeZone38.isFixed();
        org.joda.time.LocalDate localDate41 = org.joda.time.LocalDate.now(dateTimeZone38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight((java.lang.Object) boolean36, dateTimeZone38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "fran\347ais (France)" + "'", str2, "fran\347ais (France)");
        org.junit.Assert.assertNotNull(charSet3);
        org.junit.Assert.assertNotNull(languageRangeArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(basePeriodArray26);
        org.junit.Assert.assertNotNull(basePeriodArray27);
        org.junit.Assert.assertNotNull(languageRangeArray28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(strArray32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localDate41);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration7, (org.joda.time.ReadableInstant) dateMidnight10, periodType11);
        int int13 = dateMidnight10.getYear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight15, readableDuration16);
        org.joda.time.ReadableDuration readableDuration18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight15, readableDuration18);
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(100L, (long) (short) -1);
        mutablePeriod22.setMinutes(11);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight15, (org.joda.time.ReadablePeriod) mutablePeriod22);
        org.joda.time.Chronology chronology26 = dateMidnight15.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((int) '4', (int) '4', (int) ' ', (int) (byte) -1, (int) 'a', (int) (short) -1, 32, chronology26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(chronology26);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("en_US", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("allemand", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        int int1 = dateTime0.getEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime0.withField(dateTimeFieldType2, 569);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 569 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        int int5 = localDateTime3.getMonthOfYear();
        java.util.Date date6 = localDateTime3.toDate();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration7, (org.joda.time.ReadableInstant) dateMidnight10, periodType11);
        int int13 = dateMidnight10.getYear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration16, (org.joda.time.ReadableInstant) dateMidnight19, periodType20);
        int int22 = dateMidnight19.getYear();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight19.withDayOfMonth((int) (byte) 10);
        boolean boolean25 = dateMidnight10.isBefore((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.DateTime dateTime26 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime3.withMillisOfSecond((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime30 = localDateTime28.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.monthOfYear();
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        int int21 = property19.getMaximumShortTextLength(locale20);
        java.lang.String str22 = property19.getAsString();
        boolean boolean23 = property19.isLeap();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "1" + "'", str22, "1");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight2, readableDuration3, periodType4);
        int int6 = dateMidnight2.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight2.getZone();
        org.joda.time.DateMidnight dateMidnight8 = org.joda.time.DateMidnight.now(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays(21);
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime12 = yearMonthDay11.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = yearMonthDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray16 = timeOfDay15.getFieldTypes();
        java.util.TimeZone timeZone17 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone19 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean20 = timeZone17.hasSameRules(timeZone19);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(timeZone19);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone19);
        org.joda.time.DateTime dateTime23 = yearMonthDay11.toDateTime(timeOfDay15, dateTimeZone22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) 21, dateTimeZone22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1645454821762,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=1,MILLISECOND=762,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        int int5 = localDateTime3.getMonthOfYear();
        java.util.Date date6 = localDateTime3.toDate();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone9 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean10 = timeZone7.hasSameRules(timeZone9);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone9);
        calendar11.clear();
        java.util.Date date13 = calendar11.getTime();
        date13.setSeconds(52);
        int int16 = date6.compareTo(date13);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(date13);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:52 UTC 1970");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.setMillis((long) (byte) 10);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime17 = localTime15.minusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.millis();
        boolean boolean19 = localTime15.isSupported(durationFieldType18);
        mutableDateTime9.add(durationFieldType18, (-1));
        java.util.TimeZone timeZone22 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        mutableDateTime9.setZoneRetainFields(dateTimeZone23);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime9.yearOfEra();
        java.util.Locale locale26 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet27 = locale26.getExtensionKeys();
        java.util.Calendar calendar28 = mutableDateTime9.toCalendar(locale26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((java.lang.Object) locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(timeZone22);
        org.junit.Assert.assertEquals(timeZone22.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet27);
        org.junit.Assert.assertNotNull(calendar28);
        org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=9,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=9,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((-1));
        int int7 = localDate6.getWeekyear();
        org.joda.time.LocalDate localDate9 = localDate6.withDayOfYear(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        boolean boolean11 = localDate6.isSupported(dateTimeFieldType10);
        org.joda.time.LocalDate.Property property12 = localDate6.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate6.withWeekOfWeekyear(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-1) + "'", int7 == (-1));
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillis((long) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime2.withTime((-292275054), 19, 13, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.monthOfYear();
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        int int21 = property19.getMaximumShortTextLength(locale20);
        org.joda.time.DurationField durationField22 = property19.getDurationField();
        long long24 = durationField22.getValueAsLong((long) ' ');
        long long27 = durationField22.subtract((long) (short) 1, 5);
        int int30 = durationField22.getValue((long) 10, (long) 100);
        org.joda.time.DurationFieldType durationFieldType31 = durationField22.getType();
        int int34 = durationField22.getDifference((long) 366, (long) 570);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 0L + "'", long24 == 0L);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-13219199999L) + "'", long27 == (-13219199999L));
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 0 + "'", int34 == 0);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getYear();
        org.joda.time.LocalDate localDate5 = localDateTime3.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withMonthOfYear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight2, readableDuration3, periodType4);
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod5.setPeriod(1L, chronology7);
        mutablePeriod5.add(100L);
        int int11 = mutablePeriod5.getYears();
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(1L, dateTimeZone14);
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period(readableDuration12, (org.joda.time.ReadableInstant) dateMidnight15, periodType16);
        int int18 = dateMidnight15.getYear();
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight15.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight20, readableDuration21);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight20, readableDuration23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight20.withDayOfWeek(4);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableDuration27, (org.joda.time.ReadableInstant) dateMidnight30, periodType31);
        int int33 = dateMidnight30.getYear();
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight30.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight35.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property37 = mutableDateTime36.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime36.copy();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str40 = dateTimeFieldType39.getName();
        mutableDateTime38.set(dateTimeFieldType39, 5);
        mutablePeriod5.setPeriod((org.joda.time.ReadableInstant) dateMidnight20, (org.joda.time.ReadableInstant) mutableDateTime38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight45 = dateMidnight20.withEra(19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1970 + "'", int33 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "minuteOfDay" + "'", str40, "minuteOfDay");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.MonthDay monthDay0 = org.joda.time.MonthDay.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay.Property property2 = monthDay0.property(dateTimeFieldType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay0);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval2 = new org.joda.time.Interval((long) (byte) 100, 11L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearWeekDay();
        org.joda.time.PeriodType periodType2 = periodType1.withWeeksRemoved();
        org.joda.time.Period period11 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period13 = period11.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.plusDays((int) 'a');
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period11, (org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.now(chronology20);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.now(chronology20);
        org.joda.time.DateTimeField dateTimeField23 = chronology20.dayOfWeek();
        org.joda.time.Period period24 = new org.joda.time.Period((long) 11, periodType2, chronology20);
        // The following exception was thrown during execution in test generation
        try {
            long long32 = chronology20.getDateTimeMillis(3, 10, 0, 20, (int) ' ', 11, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, readableDuration9);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long15 = dateTimeZone13.nextTransition(379987200000L);
        org.joda.time.DateTime dateTime16 = dateTime8.toDateTime(dateTimeZone13);
        org.joda.time.Period period25 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period27 = period25.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(1L, dateTimeZone29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.plusDays((int) 'a');
        org.joda.time.Interval interval33 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period25, (org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.Chronology chronology34 = interval33.getChronology();
        org.joda.time.DateMidnight dateMidnight35 = org.joda.time.DateMidnight.now(chronology34);
        org.joda.time.DateTimeField dateTimeField36 = chronology34.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((java.lang.Object) dateTimeZone13, chronology34);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 379987200000L + "'", long15 == 379987200000L);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay1 = org.joda.time.MonthDay.parse("1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.010Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1969-12-31T23:59:59.999Z/1970-01-01T00:00:...\" is malformed at \"T23:59:59.999Z/1970-01-01T00:00:...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.Instant instant5 = dateTime4.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime4.withYearOfCentury(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(instant5);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        int int0 = org.joda.time.YearMonthDay.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.Period period11 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period13 = period11.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(1L, dateTimeZone15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.plusDays((int) 'a');
        org.joda.time.Interval interval19 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period11, (org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.Chronology chronology20 = interval19.getChronology();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay((int) '4', 59, 4, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray2 = yearMonthDay0.getFieldTypes();
        int int3 = yearMonthDay0.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay0.withField(dateTimeFieldType4, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuryOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay1 = org.joda.time.MonthDay.parse("weekOfWeekyear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"weekOfWeekyear\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100L, dateTimeZone6);
        boolean boolean8 = dateTimeZone6.isFixed();
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) dateTimeZone1, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTime(timeOfDay2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay0.withDayOfMonth(971);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 971 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        java.util.TimeZone timeZone3 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.DateTime dateTime5 = dateTime1.toDateTime(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime1.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar4);
        org.joda.time.LocalDate.Property property6 = localDate5.monthOfYear();
        org.joda.time.LocalDate localDate7 = property6.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate9 = property6.addWrapFieldToCopy(15);
        int int10 = localDate9.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454822917,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=2,MILLISECOND=917,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 20 + "'", int10 == 20);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("English");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"English\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        boolean boolean3 = dateTimeZone1.isFixed();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9, periodType10);
        int int12 = dateMidnight8.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight8.getZone();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone13);
        mutableDateTime4.setZone(dateTimeZone13);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (-1), (long) 1970, chronology19);
        mutableDateTime4.add((org.joda.time.ReadablePeriod) mutablePeriod20);
        int int22 = mutablePeriod20.getMinutes();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        int int12 = mutableDateTime9.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.weekyear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) 12);
        org.joda.time.DateTimeField dateTimeField16 = property13.getField();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean19 = dateTimeZone18.isFixed();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone18);
        int int21 = localDateTime20.getYear();
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableDuration23, (org.joda.time.ReadableInstant) dateMidnight26, periodType27);
        org.joda.time.Hours hours29 = period28.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType30 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period32 = period28.withFieldAdded(durationFieldType30, 100);
        org.joda.time.Period period41 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period43 = period41.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.DateMidnight dateMidnight46 = new org.joda.time.DateMidnight(1L, dateTimeZone45);
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight46.plusDays((int) 'a');
        org.joda.time.Interval interval49 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period41, (org.joda.time.ReadableInstant) dateMidnight48);
        org.joda.time.Chronology chronology50 = interval49.getChronology();
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now(chronology50);
        org.joda.time.DateTime dateTime52 = org.joda.time.DateTime.now(chronology50);
        org.joda.time.DurationField durationField53 = durationFieldType30.getField(chronology50);
        org.joda.time.DurationField durationField54 = chronology50.centuries();
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight(1L, dateTimeZone57);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableDuration55, (org.joda.time.ReadableInstant) dateMidnight58, periodType59);
        int int61 = dateMidnight58.getYear();
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight58.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime64 = dateMidnight63.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property65 = mutableDateTime64.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime66 = mutableDateTime64.copy();
        int int67 = mutableDateTime64.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property68 = mutableDateTime64.weekyear();
        org.joda.time.MutableDateTime mutableDateTime70 = property68.add((long) 12);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight(1L, dateTimeZone72);
        org.joda.time.ReadableDuration readableDuration74 = null;
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.MutablePeriod mutablePeriod76 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight73, readableDuration74, periodType75);
        org.joda.time.Chronology chronology78 = null;
        mutablePeriod76.setPeriod(1L, chronology78);
        mutableDateTime70.add((org.joda.time.ReadablePeriod) mutablePeriod76);
        int[] intArray83 = chronology50.get((org.joda.time.ReadablePeriod) mutablePeriod76, (long) (byte) 10, (-13219199999L));
        java.util.Locale locale85 = java.util.Locale.FRANCE;
        java.util.Locale locale86 = java.util.Locale.FRANCE;
        java.lang.String str87 = locale85.getDisplayName(locale86);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray88 = dateTimeField16.set((org.joda.time.ReadablePartial) localDateTime20, (int) (short) 100, intArray83, "UTC", locale85);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"UTC\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1970 + "'", int21 == 1970);
        org.junit.Assert.assertNotNull(hours29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(chronology50);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(durationField53);
        org.junit.Assert.assertNotNull(durationField54);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1970 + "'", int61 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(mutableDateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 0 + "'", int67 == 0);
        org.junit.Assert.assertNotNull(property68);
        org.junit.Assert.assertNotNull(mutableDateTime70);
        org.junit.Assert.assertNotNull(intArray83);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray83), "[0, -5, 0, 0, 0, 0, 0, -9]");
        org.junit.Assert.assertNotNull(locale85);
        org.junit.Assert.assertEquals(locale85.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "fran\347ais (France)" + "'", str87, "fran\347ais (France)");
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = dateTimeFormatter2.parseLocalDateTime("YearMonthDayTime");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight3, readableDuration4, periodType5);
        int int7 = dateMidnight3.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone8 = dateMidnight3.getZone();
        org.joda.time.DateMidnight dateMidnight9 = org.joda.time.DateMidnight.now(dateTimeZone8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((long) 8, dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object) dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateMidnight9);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(12, (int) 'u', (int) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime6 = yearMonthDay5.toDateTimeAtMidnight();
        java.util.Date date7 = dateTime6.toDate();
        date7.setMonth((int) '#');
        int int10 = date7.getMinutes();
        date7.setYear((int) (byte) 0);
        java.time.Instant instant13 = date7.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder14 = builder4.setInstant(date7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Fri Dec 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(instant13);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = dateTimeFormatter2.print((long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("japonais (Japon)", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((java.lang.Object) timeOfDay0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay0);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMillis(100);
        org.joda.time.Period period7 = org.joda.time.Period.weeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = dateTime10.toLocalDateTime();
        org.joda.time.DateTime dateTime13 = dateTime10.withMonthOfYear(11);
        org.joda.time.Duration duration14 = period7.toDurationFrom((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime3.minus((org.joda.time.ReadableDuration) duration14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, dateTimeZone7);
        boolean boolean9 = dateTimeZone7.isFixed();
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone7);
        boolean boolean11 = dateTimeZone7.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(2765, (-292275054), 19, 19, 19, 54, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("+00:00", "1970-01-01T06:00:00.021Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: +00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.weekyear();
        org.joda.time.DurationField durationField20 = chronology17.centuries();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(8380800000L, chronology22);
        org.joda.time.Period period32 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period34 = period32.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(1L, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.plusDays((int) 'a');
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period32, (org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.DateMidnight dateMidnight42 = org.joda.time.DateMidnight.now(chronology41);
        long long46 = chronology41.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField47 = chronology41.dayOfWeek();
        org.joda.time.ReadableDuration readableDuration48 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(1L, dateTimeZone50);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableDuration48, (org.joda.time.ReadableInstant) dateMidnight51, periodType52);
        int int54 = dateMidnight51.getYear();
        org.joda.time.DateMidnight dateMidnight56 = dateMidnight51.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration57 = null;
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight56, readableDuration57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.PeriodType periodType60 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight56, readableDuration59, periodType60);
        mutablePeriod61.addMillis((int) '4');
        int int64 = mutablePeriod61.size();
        int[] intArray66 = chronology41.get((org.joda.time.ReadablePeriod) mutablePeriod61, (-44179689599900L));
        // The following exception was thrown during execution in test generation
        try {
            chronology17.validate((org.joda.time.ReadablePartial) localTime23, intArray66);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -511338 for secondOfMinute must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 0L + "'", long46 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1970 + "'", int54 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight56);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 7 + "'", int64 == 7);
        org.junit.Assert.assertNotNull(intArray66);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray66), "[0, 0, -511338, -23, -59, -59, -900]");
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(887, 32470000, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 887 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(0, 20);
        long long4 = dateTimeZone2.nextTransition(379987200000L);
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone2);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = yearMonthDay5.toString(dateTimeFormatter8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 379987200000L + "'", long4 == 379987200000L);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Appendable appendable3 = null;
        org.joda.time.ReadablePartial readablePartial4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable3, readablePartial4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar4);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar4);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(1L, dateTimeZone8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight9, readableDuration10, periodType11);
        org.joda.time.Chronology chronology14 = null;
        mutablePeriod12.setPeriod(1L, chronology14);
        mutablePeriod12.add(100L);
        int int18 = mutablePeriod12.getYears();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableDuration19, (org.joda.time.ReadableInstant) dateMidnight22, periodType23);
        int int25 = dateMidnight22.getYear();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight22.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight27, readableDuration28);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight27, readableDuration30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight27.withDayOfWeek(4);
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(1L, dateTimeZone36);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period(readableDuration34, (org.joda.time.ReadableInstant) dateMidnight37, periodType38);
        int int40 = dateMidnight37.getYear();
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight37.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime43 = dateMidnight42.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property44 = mutableDateTime43.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime43.copy();
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str47 = dateTimeFieldType46.getName();
        mutableDateTime45.set(dateTimeFieldType46, 5);
        mutablePeriod12.setPeriod((org.joda.time.ReadableInstant) dateMidnight27, (org.joda.time.ReadableInstant) mutableDateTime45);
        org.joda.time.DateMidnight.Property property51 = dateMidnight27.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int53 = dateMidnight27.get(dateTimeFieldType52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property54 = yearMonthDay6.property(dateTimeFieldType52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekOfWeekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454824508,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=4,MILLISECOND=508,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(mutableDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "minuteOfDay" + "'", str47, "minuteOfDay");
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2 + "'", int53 == 2);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        int int12 = mutableDateTime9.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.weekyear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) 12);
        org.joda.time.MutableDateTime.Property property16 = mutableDateTime15.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime18 = property16.set("English");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"English\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) -1, (long) (byte) 0, chronology2);
        org.joda.time.Period period12 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period14 = period12.minusMillis(0);
        mutablePeriod3.setPeriod((org.joda.time.ReadablePeriod) period14);
        mutablePeriod3.setMinutes(366);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology20);
        long long22 = interval21.getEndMillis();
        java.lang.String str23 = interval21.toString();
        org.joda.time.MutableInterval mutableInterval24 = interval21.toMutableInterval();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate((long) 1970, dateTimeZone26);
        int int28 = localDate27.getDayOfWeek();
        org.joda.time.LocalDate localDate30 = localDate27.minusWeeks((int) (short) 10);
        org.joda.time.Interval interval31 = localDate27.toInterval();
        boolean boolean32 = interval21.contains((org.joda.time.ReadableInterval) interval31);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology35);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.Interval interval38 = interval36.withDurationBeforeEnd(readableDuration37);
        org.joda.time.Period period39 = interval36.toPeriod();
        org.joda.time.Interval interval40 = interval21.gap((org.joda.time.ReadableInterval) interval36);
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) (-1), (long) (short) 10, chronology43);
        long long45 = interval44.getEndMillis();
        java.lang.String str46 = interval44.toString();
        org.joda.time.MutableInterval mutableInterval47 = interval44.toMutableInterval();
        org.joda.time.Period period48 = interval44.toPeriod();
        org.joda.time.Interval interval49 = interval36.overlap((org.joda.time.ReadableInterval) interval44);
        mutablePeriod3.setPeriod((org.joda.time.ReadableInterval) interval36);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.010Z" + "'", str23, "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(mutableInterval24);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 4 + "'", int28 == 4);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(interval31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNull(interval40);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 10L + "'", long45 == 10L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.010Z" + "'", str46, "1969-12-31T23:59:59.999Z/1970-01-01T00:00:00.010Z");
        org.junit.Assert.assertNotNull(mutableInterval47);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(interval49);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setRawOffset(1);
        int int3 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setRawOffset(1);
        boolean boolean3 = timeZone0.observesDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(710, 32769, 366, 0, (int) '4', (-1), 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.Period period2 = org.joda.time.Period.ZERO;
        org.joda.time.Period period4 = period2.minusSeconds((int) (byte) 0);
        org.joda.time.LocalTime localTime5 = localTime1.plus((org.joda.time.ReadablePeriod) period2);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property7 = localTime5.property(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMillis(100);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withField(dateTimeFieldType6, (int) (short) 10);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withDayOfMonth(2765);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2765 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "minuteOfDay" + "'", str7, "minuteOfDay");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.plusDays((int) 'a');
        int int5 = dateMidnight2.getWeekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight2.withDayOfYear((int) ' ');
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.yearOfCentury();
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight7.toMutableDateTime();
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        int int6 = calendar4.getGreatestMinimum(11);
        java.lang.Object obj7 = calendar4.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454825145,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=5,MILLISECOND=145,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "java.util.GregorianCalendar[time=1645454825145,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=5,MILLISECOND=145,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "java.util.GregorianCalendar[time=1645454825145,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=5,MILLISECOND=145,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "java.util.GregorianCalendar[time=1645454825145,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=5,MILLISECOND=145,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setRegion("japonais");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: japonais [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(1L, dateTimeZone3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight4, readableDuration5, periodType6);
        int int8 = dateMidnight4.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = dateMidnight4.getZone();
        org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.now(dateTimeZone9);
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone9);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(obj0, dateTimeZone9);
        java.lang.String str13 = dateTime12.toString();
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateMidnight10);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-21T14:47:05.423Z" + "'", str13, "2022-02-21T14:47:05.423Z");
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.Period period9 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period11 = period9.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.plusDays((int) 'a');
        org.joda.time.Interval interval17 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period9, (org.joda.time.ReadableInstant) dateMidnight16);
        org.joda.time.Chronology chronology18 = interval17.getChronology();
        org.joda.time.DateMidnight dateMidnight19 = org.joda.time.DateMidnight.now(chronology18);
        long long23 = chronology18.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField24 = chronology18.dayOfWeek();
        org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay(chronology18);
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) 570, chronology18);
        java.util.Locale locale27 = java.util.Locale.getDefault();
        java.util.Calendar calendar28 = dateMidnight26.toCalendar(locale27);
        java.util.Locale locale29 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = locale27.getDisplayCountry(locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(calendar28);
        org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        int int12 = mutableDateTime9.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime9.weekyear();
        org.joda.time.MutableDateTime mutableDateTime15 = property13.add((long) 12);
        org.joda.time.DateTimeField dateTimeField16 = property13.getField();
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(1L, dateTimeZone21);
        org.joda.time.PeriodType periodType23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableDuration19, (org.joda.time.ReadableInstant) dateMidnight22, periodType23);
        int int25 = dateMidnight22.getYear();
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight22.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration28 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(1L, dateTimeZone30);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableDuration28, (org.joda.time.ReadableInstant) dateMidnight31, periodType32);
        int int34 = dateMidnight31.getYear();
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight31.withDayOfMonth((int) (byte) 10);
        boolean boolean37 = dateMidnight22.isBefore((org.joda.time.ReadableInstant) dateMidnight36);
        org.joda.time.DateMidnight.Property property38 = dateMidnight36.monthOfYear();
        java.util.Locale locale39 = java.util.Locale.JAPAN;
        int int40 = property38.getMaximumShortTextLength(locale39);
        java.lang.String str41 = property38.getAsString();
        java.lang.String str42 = property38.getAsText();
        java.util.Locale locale43 = java.util.Locale.FRANCE;
        java.util.Locale locale44 = java.util.Locale.FRANCE;
        java.lang.String str45 = locale43.getDisplayName(locale44);
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateMidnight dateMidnight49 = new org.joda.time.DateMidnight(1L, dateTimeZone48);
        org.joda.time.PeriodType periodType50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableDuration46, (org.joda.time.ReadableInstant) dateMidnight49, periodType50);
        int int52 = dateMidnight49.getYear();
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight49.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration55 = null;
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight(1L, dateTimeZone57);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period(readableDuration55, (org.joda.time.ReadableInstant) dateMidnight58, periodType59);
        int int61 = dateMidnight58.getYear();
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight58.withDayOfMonth((int) (byte) 10);
        boolean boolean64 = dateMidnight49.isBefore((org.joda.time.ReadableInstant) dateMidnight63);
        org.joda.time.DateMidnight.Property property65 = dateMidnight63.monthOfYear();
        java.util.Locale locale66 = java.util.Locale.JAPAN;
        int int67 = property65.getMaximumShortTextLength(locale66);
        java.lang.String str68 = locale44.getDisplayLanguage(locale66);
        java.util.Locale.setDefault(locale44);
        int int70 = property38.getMaximumTextLength(locale44);
        // The following exception was thrown during execution in test generation
        try {
            long long71 = dateTimeField16.set((long) 5, "deu", locale44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"deu\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1970 + "'", int25 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 1970 + "'", int34 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "1" + "'", str41, "1");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "janvier" + "'", str42, "janvier");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "fran\347ais (France)" + "'", str45, "fran\347ais (France)");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 1970 + "'", int52 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1970 + "'", int61 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + true + "'", boolean64 == true);
        org.junit.Assert.assertNotNull(property65);
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 2 + "'", int67 == 2);
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "\u30d5\u30e9\u30f3\u30b9\u8a9e" + "'", str68, "\u30d5\u30e9\u30f3\u30b9\u8a9e");
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 9 + "'", int70 == 9);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(12, (int) 'u', (int) (short) -1);
        java.util.Calendar.Builder builder9 = builder0.setTimeOfDay(292278993, 8, (int) 'a', 7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder11 = builder9.setInstant((long) 569);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        int int5 = localDateTime3.getMonthOfYear();
        java.util.Date date6 = localDateTime3.toDate();
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration7, (org.joda.time.ReadableInstant) dateMidnight10, periodType11);
        int int13 = dateMidnight10.getYear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(1L, dateTimeZone18);
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period(readableDuration16, (org.joda.time.ReadableInstant) dateMidnight19, periodType20);
        int int22 = dateMidnight19.getYear();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight19.withDayOfMonth((int) (byte) 10);
        boolean boolean25 = dateMidnight10.isBefore((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.DateTime dateTime26 = localDateTime3.toDateTime((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime3.withMillisOfSecond((int) 'x');
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
        int int31 = localDateTime28.getValue(1);
        int int32 = localDateTime28.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) 1970, dateTimeZone34);
        org.joda.time.DateTimeFieldType dateTimeFieldType36 = null;
        boolean boolean37 = localDate35.isSupported(dateTimeFieldType36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long) 1970, dateTimeZone39);
        int int41 = localDate40.getDayOfWeek();
        org.joda.time.Period period42 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate35, (org.joda.time.ReadablePartial) localDate40);
        org.joda.time.YearMonthDay yearMonthDay43 = new org.joda.time.YearMonthDay((java.lang.Object) localDate40);
        org.joda.time.LocalDate localDate45 = localDate40.minusYears((int) '4');
        org.joda.time.LocalDate localDate47 = localDate40.plusYears((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime28, (org.joda.time.ReadablePartial) localDate47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(date6);
        org.junit.Assert.assertEquals(date6.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1970 + "'", int22 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1 + "'", int31 == 1);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 120 + "'", int32 == 120);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 4 + "'", int41 == 4);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(localDate47);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(chronology17);
        long long22 = chronology17.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateTimeField dateTimeField23 = chronology17.dayOfWeek();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(1L, dateTimeZone26);
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableDuration24, (org.joda.time.ReadableInstant) dateMidnight27, periodType28);
        int int30 = dateMidnight27.getYear();
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight27.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration33 = null;
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight32, readableDuration33);
        org.joda.time.ReadableDuration readableDuration35 = null;
        org.joda.time.PeriodType periodType36 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight32, readableDuration35, periodType36);
        mutablePeriod37.addMillis((int) '4');
        int int40 = mutablePeriod37.size();
        int[] intArray42 = chronology17.get((org.joda.time.ReadablePeriod) mutablePeriod37, (-44179689599900L));
        mutablePeriod37.setPeriod((long) 59);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(periodType36);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 7 + "'", int40 == 7);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[0, 0, -511338, -23, -59, -59, -900]");
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property14 = mutableDateTime9.dayOfMonth();
        org.joda.time.Period period23 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period25 = period23.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(1L, dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.plusDays((int) 'a');
        org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period23, (org.joda.time.ReadableInstant) dateMidnight30);
        org.joda.time.Chronology chronology32 = interval31.getChronology();
        org.joda.time.DateMidnight dateMidnight33 = org.joda.time.DateMidnight.now(chronology32);
        org.joda.time.LocalTime localTime34 = org.joda.time.LocalTime.now(chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.yearOfCentury();
        org.joda.time.DateMidnight dateMidnight36 = org.joda.time.DateMidnight.now(chronology32);
        int int37 = property14.getDifference((org.joda.time.ReadableInstant) dateMidnight36);
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(1L, dateTimeZone39);
        org.joda.time.ReadableDuration readableDuration41 = null;
        org.joda.time.PeriodType periodType42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight40, readableDuration41, periodType42);
        org.joda.time.Chronology chronology45 = null;
        mutablePeriod43.setPeriod(1L, chronology45);
        mutablePeriod43.add(100L);
        int int49 = mutablePeriod43.getYears();
        org.joda.time.ReadableDuration readableDuration50 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(1L, dateTimeZone52);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period(readableDuration50, (org.joda.time.ReadableInstant) dateMidnight53, periodType54);
        int int56 = dateMidnight53.getYear();
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight53.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.MutablePeriod mutablePeriod60 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight58, readableDuration59);
        org.joda.time.ReadableDuration readableDuration61 = null;
        org.joda.time.Period period62 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight58, readableDuration61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight58.withDayOfWeek(4);
        org.joda.time.ReadableDuration readableDuration65 = null;
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight(1L, dateTimeZone67);
        org.joda.time.PeriodType periodType69 = null;
        org.joda.time.Period period70 = new org.joda.time.Period(readableDuration65, (org.joda.time.ReadableInstant) dateMidnight68, periodType69);
        int int71 = dateMidnight68.getYear();
        org.joda.time.DateMidnight dateMidnight73 = dateMidnight68.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime74 = dateMidnight73.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime74.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime76 = mutableDateTime74.copy();
        org.joda.time.DateTimeFieldType dateTimeFieldType77 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str78 = dateTimeFieldType77.getName();
        mutableDateTime76.set(dateTimeFieldType77, 5);
        mutablePeriod43.setPeriod((org.joda.time.ReadableInstant) dateMidnight58, (org.joda.time.ReadableInstant) mutableDateTime76);
        org.joda.time.DateMidnight.Property property82 = dateMidnight58.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        int int84 = dateMidnight58.get(dateTimeFieldType83);
        int int85 = dateMidnight36.get(dateTimeFieldType83);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-15993) + "'", int37 == (-15993));
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 1970 + "'", int56 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertTrue("'" + int71 + "' != '" + 1970 + "'", int71 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight73);
        org.junit.Assert.assertNotNull(mutableDateTime74);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(mutableDateTime76);
        org.junit.Assert.assertNotNull(dateTimeFieldType77);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "minuteOfDay" + "'", str78, "minuteOfDay");
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(dateTimeFieldType83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 2 + "'", int84 == 2);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 8 + "'", int85 == 8);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now(dateTimeZone1);
        java.util.TimeZone timeZone4 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean7 = timeZone4.hasSameRules(timeZone6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(timeZone6);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.fromCalendarFields(calendar8);
        org.joda.time.Period period10 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate3, (org.joda.time.ReadablePartial) localDate9);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, dateTimeZone12);
        org.joda.time.DateTime dateTime15 = dateTime13.withCenturyOfEra(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str17 = dateTimeFieldType16.getName();
        org.joda.time.DateTime dateTime19 = dateTime13.withField(dateTimeFieldType16, (int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = localDate3.withField(dateTimeFieldType16, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(timeZone4);
        org.junit.Assert.assertEquals(timeZone4.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645454826005,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=6,MILLISECOND=5,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "minuteOfDay" + "'", str17, "minuteOfDay");
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        org.joda.time.Interval interval8 = property7.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight((java.lang.Object) property7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(interval8);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromCalendarFields(calendar4);
        org.joda.time.LocalTime localTime7 = localTime5.withMillisOfDay((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withCenturyOfEra(5);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.lang.String str14 = dateTimeFieldType13.getName();
        org.joda.time.DateTime dateTime16 = dateTime10.withField(dateTimeFieldType13, (int) 'u');
        java.lang.String str17 = dateTimeFieldType13.toString();
        org.joda.time.LocalTime.Property property18 = localTime7.property(dateTimeFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = property18.setCopy("1970");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454826139,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=6,MILLISECOND=139,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "minuteOfDay" + "'", str14, "minuteOfDay");
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "minuteOfDay" + "'", str17, "minuteOfDay");
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime7 = yearMonthDay6.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime8 = yearMonthDay6.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay6.year();
        java.util.Locale locale10 = java.util.Locale.GERMANY;
        java.lang.String str11 = property9.getAsText(locale10);
        org.joda.time.DateTimeField dateTimeField12 = property9.getField();
        long long15 = dateTimeField12.add((long) (byte) 10, (long) '4');
        int int16 = dateMidnight3.get(dateTimeField12);
        org.joda.time.DurationField durationField17 = dateTimeField12.getDurationField();
        java.lang.String str18 = durationField17.getName();
        long long21 = durationField17.getDifferenceAsLong((long) 35, (long) (byte) -1);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022" + "'", str11, "2022");
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1640995200010L + "'", long15 == 1640995200010L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1970 + "'", int16 == 1970);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "years" + "'", str18, "years");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("fran\347ais (France)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(1L, dateTimeZone5);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period(readableDuration3, (org.joda.time.ReadableInstant) dateMidnight6, periodType7);
        int int9 = dateMidnight6.getYear();
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight6.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateMidnight11.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime12.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime14 = mutableDateTime12.copy();
        org.joda.time.MutableDateTime.Property property15 = mutableDateTime12.dayOfMonth();
        mutableDateTime12.setYear((-292275054));
        int int18 = mutableDateTime12.getYear();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) mutableDateTime12);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime12.addDays((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -9223372016265600000 + -25252564665600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1970 + "'", int9 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-292275054) + "'", int18 == (-292275054));
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        long long9 = dateTimeField6.add((long) (byte) 10, (long) '4');
        java.util.Locale locale10 = java.util.Locale.US;
        int int11 = dateTimeField6.getMaximumTextLength(locale10);
        long long13 = dateTimeField6.roundHalfEven((long) (-1));
        long long15 = dateTimeField6.roundHalfFloor((long) 6);
        java.lang.String str16 = dateTimeField6.getName();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 1640995200010L + "'", long9 == 1640995200010L);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_US");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "year" + "'", str16, "year");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(100L, (long) (short) -1);
        mutablePeriod4.setMinutes(11);
        org.joda.time.LocalTime localTime8 = localTime1.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod4, (int) 'x');
        org.joda.time.LocalTime localTime10 = localTime8.minusMinutes(31);
        java.lang.String str11 = localTime10.toString();
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "21:28:47.880" + "'", str11, "21:28:47.880");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.plusHours((int) (short) 0);
        int int4 = timeOfDay3.getHourOfDay();
        org.joda.time.TimeOfDay.Property property5 = timeOfDay3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        int int7 = property5.get();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay9 = property5.setCopy("--02-21");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"--02-21\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((java.lang.Object) 32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(23, (int) (byte) 1, 4, 100, 0, 2200);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((-15993), 366, 31, 52, (int) (byte) -1, 32770, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.monthOfYear();
        int int20 = dateMidnight17.getDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) dateMidnight17, dateTimeZone21);
        int int23 = dateMidnight17.getYearOfCentury();
        org.joda.time.DateMidnight.Property property24 = dateMidnight17.dayOfYear();
        org.joda.time.DateMidnight dateMidnight25 = property24.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(100L, dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime28.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime32 = dateTime30.plus((long) (-1));
        org.joda.time.DateTime dateTime33 = dateTime30.withTimeAtStartOfDay();
        org.joda.time.ReadableDuration readableDuration34 = null;
        org.joda.time.DateTime dateTime36 = dateTime30.withDurationAdded(readableDuration34, 1970);
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime38 = yearMonthDay37.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate39 = dateTime38.toLocalDate();
        java.util.TimeZone timeZone40 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forTimeZone(timeZone40);
        org.joda.time.DateTime dateTime42 = dateTime38.toDateTime(dateTimeZone41);
        org.joda.time.DateTime dateTime43 = dateTime30.withZoneRetainFields(dateTimeZone41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((java.lang.Object) property24, dateTimeZone41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateMidnight$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 70 + "'", int23 == 70);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(timeZone40);
        org.junit.Assert.assertEquals(timeZone40.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight8.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime9.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime11 = mutableDateTime9.copy();
        mutableDateTime9.setMillis((long) (byte) 10);
        mutableDateTime9.add((long) 1970);
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(0, (int) (byte) 0, (int) (byte) 10, 1);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.millis();
        mutablePeriod20.set(durationFieldType21, 5);
        mutableDateTime9.add((org.joda.time.ReadablePeriod) mutablePeriod20);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setTime(59, 1970, 8, (-15993));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(durationFieldType21);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay.Property property1 = monthDay0.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField2 = property1.getField();
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime5 = yearMonthDay4.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime6 = yearMonthDay4.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay4.year();
        java.util.Locale locale8 = java.util.Locale.GERMANY;
        java.lang.String str9 = property7.getAsText(locale8);
        java.util.Locale locale11 = java.util.Locale.forLanguageTag("fran\347ais (France)");
        java.lang.String str12 = property7.getAsText(locale11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay13 = property1.setCopy("months", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"months\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeField2);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "2022" + "'", str9, "2022");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022" + "'", str12, "2022");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        boolean boolean3 = dateTimeZone1.isFixed();
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone1);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(1L, dateTimeZone7);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9, periodType10);
        int int12 = dateMidnight8.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = dateMidnight8.getZone();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone13);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone13);
        mutableDateTime4.setZone(dateTimeZone13);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (-1), (long) 1970, chronology19);
        mutableDateTime4.add((org.joda.time.ReadablePeriod) mutablePeriod20);
        java.util.GregorianCalendar gregorianCalendar22 = mutableDateTime4.toGregorianCalendar();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime4.setDate((int) (byte) 0, (int) '4', 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(gregorianCalendar22);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getMillisOfSecond();
        org.joda.time.MonthDay monthDay5 = new org.joda.time.MonthDay();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDateTime3.compareTo((org.joda.time.ReadablePartial) monthDay5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 100 + "'", int4 == 100);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(569, 16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 569 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.io.Writer writer3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long) 1970, dateTimeZone5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDate6.isSupported(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((long) 1970, dateTimeZone10);
        int int12 = localDate11.getDayOfWeek();
        org.joda.time.Period period13 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate6, (org.joda.time.ReadablePartial) localDate11);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(1L, dateTimeZone16);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period(readableDuration14, (org.joda.time.ReadableInstant) dateMidnight17, periodType18);
        int int20 = dateMidnight17.getYear();
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight17.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration23 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(1L, dateTimeZone25);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period(readableDuration23, (org.joda.time.ReadableInstant) dateMidnight26, periodType27);
        int int29 = dateMidnight26.getYear();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight26.withDayOfMonth((int) (byte) 10);
        boolean boolean32 = dateMidnight17.isBefore((org.joda.time.ReadableInstant) dateMidnight31);
        org.joda.time.DateMidnight.Property property33 = dateMidnight31.monthOfYear();
        org.joda.time.DateMidnight dateMidnight34 = property33.roundFloorCopy();
        boolean boolean35 = localDate11.equals((java.lang.Object) dateMidnight34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight34.withCenturyOfEra((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer3, (org.joda.time.ReadableInstant) dateMidnight37);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1970 + "'", int29 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateMidnight37);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight8, readableDuration9);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateMidnight8, readableDuration11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight8.withDayOfWeek(4);
        org.joda.time.DateMidnight.Property property15 = dateMidnight14.dayOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone17 = dateTimeZone16.toTimeZone();
        org.joda.time.DateTime dateTime18 = dateMidnight14.toDateTime(dateTimeZone16);
        org.joda.time.Period period19 = org.joda.time.Period.ZERO;
        org.joda.time.Period period21 = period19.minusSeconds((int) (byte) 0);
        boolean boolean22 = dateTimeZone16.equals((java.lang.Object) period21);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime(dateTimeZone16);
        org.joda.time.Period period32 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period34 = period32.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(1L, dateTimeZone36);
        org.joda.time.DateMidnight dateMidnight39 = dateMidnight37.plusDays((int) 'a');
        org.joda.time.Interval interval40 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period32, (org.joda.time.ReadableInstant) dateMidnight39);
        org.joda.time.Chronology chronology41 = interval40.getChronology();
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now(chronology41);
        org.joda.time.DateTimeField dateTimeField43 = chronology41.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight((java.lang.Object) localTime23, chronology41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone17);
        org.junit.Assert.assertEquals(timeZone17.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(dateTimeField43);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1L, dateTimeZone2);
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration0, (org.joda.time.ReadableInstant) dateMidnight3, periodType4);
        int int6 = dateMidnight3.getYear();
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight3.withDayOfMonth((int) (byte) 10);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.PeriodType periodType13 = null;
        org.joda.time.Period period14 = new org.joda.time.Period(readableDuration9, (org.joda.time.ReadableInstant) dateMidnight12, periodType13);
        int int15 = dateMidnight12.getYear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight12.withDayOfMonth((int) (byte) 10);
        boolean boolean18 = dateMidnight3.isBefore((org.joda.time.ReadableInstant) dateMidnight17);
        org.joda.time.DateMidnight.Property property19 = dateMidnight17.monthOfYear();
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        int int21 = property19.getMaximumShortTextLength(locale20);
        org.joda.time.DurationField durationField22 = property19.getDurationField();
        org.joda.time.DateMidnight dateMidnight23 = property19.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minus((long) 200);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.withDayOfMonth((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1970 + "'", int6 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateMidnight25);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) (short) 0, (int) 'a', 16, 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusMillis(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withDayOfWeek(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.io.Writer writer3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(100L, dateTimeZone5);
        boolean boolean7 = dateTimeZone5.isFixed();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(1L, dateTimeZone11);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight12, readableDuration13, periodType14);
        int int16 = dateMidnight12.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone17 = dateMidnight12.getZone();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(dateTimeZone17);
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight((long) ' ', dateTimeZone17);
        mutableDateTime8.setZone(dateTimeZone17);
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(1L, dateTimeZone23);
        org.joda.time.PeriodType periodType25 = null;
        org.joda.time.Period period26 = new org.joda.time.Period(readableDuration21, (org.joda.time.ReadableInstant) dateMidnight24, periodType25);
        int int27 = dateMidnight24.getYear();
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight24.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime30 = dateMidnight29.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime30.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime32 = mutableDateTime30.copy();
        mutableDateTime30.addMonths((int) (byte) 100);
        mutableDateTime8.setMillis((org.joda.time.ReadableInstant) mutableDateTime30);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer3, (org.joda.time.ReadableInstant) mutableDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(mutableDateTime32);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(5, (int) (byte) -1);
        java.util.Calendar.Builder builder7 = builder0.setTimeOfDay(0, (int) '4', (int) 'u');
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(1L, dateTimeZone10);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period(readableDuration8, (org.joda.time.ReadableInstant) dateMidnight11, periodType12);
        org.joda.time.Hours hours14 = period13.toStandardHours();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.millis();
        org.joda.time.Period period17 = period13.withFieldAdded(durationFieldType15, 100);
        org.joda.time.Period period26 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period28 = period26.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(1L, dateTimeZone30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.plusDays((int) 'a');
        org.joda.time.Interval interval34 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period26, (org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.Chronology chronology35 = interval34.getChronology();
        org.joda.time.LocalDateTime localDateTime36 = org.joda.time.LocalDateTime.now(chronology35);
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(chronology35);
        org.joda.time.DurationField durationField38 = durationFieldType15.getField(chronology35);
        org.joda.time.DurationField durationField39 = chronology35.centuries();
        org.joda.time.ReadableDuration readableDuration40 = null;
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(1L, dateTimeZone42);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period(readableDuration40, (org.joda.time.ReadableInstant) dateMidnight43, periodType44);
        int int46 = dateMidnight43.getYear();
        org.joda.time.DateMidnight dateMidnight48 = dateMidnight43.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime49 = dateMidnight48.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property50 = mutableDateTime49.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime51 = mutableDateTime49.copy();
        int int52 = mutableDateTime49.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime49.weekyear();
        org.joda.time.MutableDateTime mutableDateTime55 = property53.add((long) 12);
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateMidnight dateMidnight58 = new org.joda.time.DateMidnight(1L, dateTimeZone57);
        org.joda.time.ReadableDuration readableDuration59 = null;
        org.joda.time.PeriodType periodType60 = null;
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight58, readableDuration59, periodType60);
        org.joda.time.Chronology chronology63 = null;
        mutablePeriod61.setPeriod(1L, chronology63);
        mutableDateTime55.add((org.joda.time.ReadablePeriod) mutablePeriod61);
        int[] intArray68 = chronology35.get((org.joda.time.ReadablePeriod) mutablePeriod61, (long) (byte) 10, (-13219199999L));
        java.util.Calendar.Builder builder69 = builder7.setFields(intArray68);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar70 = builder7.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid era");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(hours14);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 1970 + "'", int46 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight48);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[0, -5, 0, 0, 0, 0, 0, -9]");
        org.junit.Assert.assertNotNull(builder69);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        int int3 = localDate2.getDayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.centuryOfEra();
        boolean boolean5 = localDate2.isSupported(dateTimeFieldType4);
        org.joda.time.LocalDate localDate7 = localDate2.plusYears(1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.withMonthOfYear(14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        boolean boolean2 = dateTimeZone1.isFixed();
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 100, dateTimeZone1);
        int int4 = localDateTime3.getYear();
        org.joda.time.LocalTime localTime5 = localDateTime3.toLocalTime();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1970 + "'", int4 == 1970);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.hours();
        java.lang.String str10 = periodType9.toString();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(0L, periodType9, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(11, (int) (short) 100, (int) (short) 0, 13, 3, (int) '4', (int) 'a', 32470000, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PeriodType[Hours]" + "'", str10, "PeriodType[Hours]");
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.DateTime dateTime9 = property7.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime11 = property7.addToCopy(7);
        org.joda.time.DateTime dateTime12 = property7.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime12.withMonthOfYear(2765);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2765 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("1970-01-01T06:00:00.021Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01T06:00:00.021Z\" is malformed at \"Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.parse("years", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.LocalDate localDate3 = dateTime2.toLocalDate();
        org.joda.time.Instant instant4 = new org.joda.time.Instant((java.lang.Object) dateTime2);
        org.joda.time.DateTime dateTime6 = dateTime2.plusSeconds(0);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval2 = new org.joda.time.Interval(1735689600000L, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(chronology17);
        long long22 = chronology17.add(0L, 1970L, (int) (short) 0);
        org.joda.time.MonthDay monthDay23 = org.joda.time.MonthDay.now(chronology17);
        org.joda.time.DateTimeField dateTimeField24 = chronology17.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = chronology17.getDateTimeMillis(1640995200010L, 32, 23, 887, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(monthDay23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder4 = builder0.setDate(12, (int) 'u', (int) (short) -1);
        java.util.Calendar.Builder builder9 = builder0.setTimeOfDay(292278993, 8, (int) 'a', 7);
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder11 = builder9.setLocale(locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(builder9);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone0);
        calendar4.setMinimalDaysInFirstWeek(1970);
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(100L, (long) (short) -1);
        mutablePeriod11.setMinutes(11);
        org.joda.time.LocalTime localTime15 = localTime8.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod11, (int) 'x');
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime19 = localTime17.minusSeconds((int) (byte) 10);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.millis();
        boolean boolean21 = localTime17.isSupported(durationFieldType20);
        mutablePeriod11.add(durationFieldType20, 100);
        boolean boolean24 = calendar4.equals((java.lang.Object) 100);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454829061,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=9,MILLISECOND=61,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(1L, dateTimeZone9);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period(readableDuration7, (org.joda.time.ReadableInstant) dateMidnight10, periodType11);
        int int13 = dateMidnight10.getYear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight10.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime16 = dateMidnight15.toMutableDateTime();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.getDefault();
        java.util.TimeZone timeZone18 = dateTimeZone17.toTimeZone();
        org.joda.time.DateTime dateTime19 = mutableDateTime16.toDateTime(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime19.toDateTime();
        org.joda.time.Period period29 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period31 = period29.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(1L, dateTimeZone33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.plusDays((int) 'a');
        org.joda.time.Interval interval37 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period29, (org.joda.time.ReadableInstant) dateMidnight36);
        org.joda.time.Chronology chronology38 = interval37.getChronology();
        org.joda.time.DateMidnight dateMidnight39 = org.joda.time.DateMidnight.now(chronology38);
        long long43 = chronology38.add(0L, 1970L, (int) (short) 0);
        org.joda.time.DateMidnight dateMidnight44 = org.joda.time.DateMidnight.now(chronology38);
        org.joda.time.DateMidnight dateMidnight45 = org.joda.time.DateMidnight.now(chronology38);
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay((java.lang.Object) dateTime19, chronology38);
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight(chronology38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime(20, 11, 8, 0, 2765, 59, 16, chronology38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2765 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(period31);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateMidnight39);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 0L + "'", long43 == 0L);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertNotNull(dateMidnight45);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.Period period1 = org.joda.time.Period.millis(366);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromCalendarFields(calendar4);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar4);
        int int7 = yearMonthDay6.getDayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay6.minusYears(35);
        org.joda.time.Interval interval10 = yearMonthDay6.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType12 = yearMonthDay6.getFieldType((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454829468,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=9,MILLISECOND=468,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime2 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay0.year();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        java.lang.String str5 = property3.getAsText(locale4);
        int int6 = property3.get();
        org.joda.time.YearMonthDay yearMonthDay8 = property3.setCopy(70);
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay8.year();
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime11 = yearMonthDay10.toDateTimeAtMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime dateTime14 = dateTime11.withField(dateTimeFieldType12, 6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay8.withField(dateTimeFieldType12, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022" + "'", str5, "2022");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(1645454800697L, chronology1);
        mutablePeriod2.addMinutes((int) (byte) 0);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.minusSeconds((int) (byte) 0);
        org.joda.time.Period period4 = period2.minusSeconds((int) '#');
        org.joda.time.MutablePeriod mutablePeriod5 = period2.toMutablePeriod();
        mutablePeriod5.setPeriod((long) 100);
        mutablePeriod5.setMillis((int) (short) -1);
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((long) 1);
        org.joda.time.TimeOfDay timeOfDay15 = timeOfDay13.plusHours((int) (short) 0);
        int int16 = timeOfDay15.getHourOfDay();
        org.joda.time.TimeOfDay.Property property17 = timeOfDay15.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField18 = property17.getField();
        org.joda.time.TimeOfDay timeOfDay19 = property17.getTimeOfDay();
        org.joda.time.TimeOfDay timeOfDay21 = property17.addToCopy(49);
        org.joda.time.Period period30 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period32 = period30.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(1L, dateTimeZone34);
        org.joda.time.DateMidnight dateMidnight37 = dateMidnight35.plusDays((int) 'a');
        org.joda.time.Interval interval38 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period30, (org.joda.time.ReadableInstant) dateMidnight37);
        org.joda.time.Chronology chronology39 = interval38.getChronology();
        org.joda.time.DateMidnight dateMidnight40 = org.joda.time.DateMidnight.now(chronology39);
        org.joda.time.DateTimeZone dateTimeZone42 = null;
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight(1L, dateTimeZone42);
        org.joda.time.ReadableDuration readableDuration44 = null;
        org.joda.time.PeriodType periodType45 = null;
        org.joda.time.MutablePeriod mutablePeriod46 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight43, readableDuration44, periodType45);
        org.joda.time.Chronology chronology48 = null;
        mutablePeriod46.setPeriod(1L, chronology48);
        long long52 = chronology39.add((org.joda.time.ReadablePeriod) mutablePeriod46, (long) (short) 0, 32769);
        org.joda.time.TimeOfDay timeOfDay53 = timeOfDay21.withChronologyRetainFields(chronology39);
        mutablePeriod5.setPeriod((long) 52, 28861000L, chronology39);
        org.joda.time.DurationField durationField55 = chronology39.hours();
        boolean boolean56 = durationField55.isPrecise();
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(mutablePeriod5);
        org.junit.Assert.assertNotNull(timeOfDay15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(timeOfDay19);
        org.junit.Assert.assertNotNull(timeOfDay21);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 32769L + "'", long52 == 32769L);
        org.junit.Assert.assertNotNull(timeOfDay53);
        org.junit.Assert.assertNotNull(durationField55);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay.Property property1 = monthDay0.dayOfMonth();
        int int2 = monthDay0.size();
        int int3 = monthDay0.size();
        org.joda.time.Period period5 = new org.joda.time.Period((long) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(0, (int) (byte) 0, (int) (byte) 10, 1);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.millis();
        mutablePeriod10.set(durationFieldType11, 5);
        org.joda.time.Period period15 = period5.withField(durationFieldType11, 1);
        java.lang.String str16 = durationFieldType11.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay18 = monthDay0.withFieldAdded(durationFieldType11, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millis' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 2 + "'", int2 == 2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2 + "'", int3 == 2);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "millis" + "'", str16, "millis");
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        calendar4.setTimeInMillis((long) 4);
        long long7 = calendar4.getTimeInMillis();
        // The following exception was thrown during execution in test generation
        try {
            calendar4.roll(20, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=4,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=4,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 4L + "'", long7 == 4L);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withDefaultYear(21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight6 = org.joda.time.DateMidnight.parse("DateTimeField[year]", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime6.withDayOfWeek((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.Period period1 = org.joda.time.Period.hours((int) ' ');
        org.joda.time.Period period3 = period1.minusYears((int) ' ');
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearMonthDayTime();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) (short) 0, periodType5, chronology6);
        org.joda.time.Period period8 = period1.withPeriodType(periodType5);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = period8.getValue(2765);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2765");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 1970, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDate2.isSupported(dateTimeFieldType3);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long) 1970, dateTimeZone6);
        int int8 = localDate7.getDayOfWeek();
        org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate2, (org.joda.time.ReadablePartial) localDate7);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay((java.lang.Object) localDate7);
        org.joda.time.LocalDate localDate12 = localDate7.minusYears((int) '4');
        org.joda.time.LocalDate localDate14 = localDate7.plusYears((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate7.withDayOfMonth((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime9 = dateTime4.minus((long) (short) 1);
        org.joda.time.DateTime dateTime10 = dateTime4.toDateTime();
        org.joda.time.DateTime dateTime11 = dateTime10.withLaterOffsetAtOverlap();
        org.joda.time.DateTime.Property property12 = dateTime10.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime10.withDayOfMonth(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("PeriodType[Hours]", (double) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.Period period0 = org.joda.time.Period.ZERO;
        org.joda.time.Period period2 = period0.minusSeconds((int) (byte) 0);
        org.joda.time.Period period4 = period2.minusSeconds(100);
        org.joda.time.Period period5 = period4.negated();
        org.joda.time.Minutes minutes6 = period4.toStandardMinutes();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = period4.withFieldAdded(durationFieldType7, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'halfdays'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period0);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(minutes6);
        org.junit.Assert.assertNotNull(durationFieldType7);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromCalendarFields(calendar4);
        org.joda.time.LocalTime localTime7 = localTime5.withMillisOfDay((int) (byte) 1);
        int int8 = localTime5.getMillisOfDay();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454830351,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=10,MILLISECOND=351,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 53230351 + "'", int8 == 53230351);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.Period period4 = new org.joda.time.Period(15, 2765, (int) 'u', 32769);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(8380800000L, chronology1);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((long) 0);
        org.joda.time.LocalTime localTime6 = localTime4.minusSeconds((int) (byte) 10);
        int int7 = localTime2.compareTo((org.joda.time.ReadablePartial) localTime4);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property9 = localTime4.property(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.parse("1970", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate2 = dateTime1.toLocalDate();
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime4 = yearMonthDay3.toDateTimeAtMidnight();
        org.joda.time.LocalDate localDate5 = dateTime4.toLocalDate();
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.DateTime dateTime8 = dateTime4.toDateTime(dateTimeZone7);
        org.joda.time.Interval interval9 = localDate2.toInterval(dateTimeZone7);
        org.joda.time.LocalDate.Property property10 = localDate2.monthOfYear();
        int int11 = property10.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 12 + "'", int11 == 12);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withDefaultYear(21);
        org.joda.time.format.DateTimeParser dateTimeParser6 = dateTimeFormatter3.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = org.joda.time.DateMidnight.parse("YearWeekDayNoWeeks", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNull(dateTimeParser6);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set(5, (int) (byte) -1);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate6 = localDate4.minusWeeks(10);
        org.joda.time.Chronology chronology7 = localDate6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay8 = new org.joda.time.MonthDay((java.lang.Object) 5, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromCalendarFields(calendar4);
        long long6 = calendar4.getTimeInMillis();
        // The following exception was thrown during execution in test generation
        try {
            calendar4.setWeekDate(0, 13, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454830983,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=10,MILLISECOND=983,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645454830983L + "'", long6 == 1645454830983L);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        java.util.Date date2 = dateTime1.toDate();
        org.joda.time.YearMonthDay yearMonthDay3 = org.joda.time.YearMonthDay.fromDateFields(date2);
        date2.setHours(32770);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Nov 17 10:00:00 GMT 2025");
        org.junit.Assert.assertNotNull(yearMonthDay3);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) -1, (int) (byte) 10, (int) (byte) 0, 100, (int) (byte) -1, (int) (byte) -1, (int) (short) 100, (-1));
        org.joda.time.Period period10 = period8.withMinutes(10);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(1L, dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusDays((int) 'a');
        org.joda.time.Interval interval16 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.Chronology chronology17 = interval16.getChronology();
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(chronology17);
        long long22 = chronology17.add(0L, 1970L, (int) (short) 0);
        org.joda.time.MonthDay monthDay23 = org.joda.time.MonthDay.now(chronology17);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) (-1), (long) 1970, chronology26);
        int[] intArray30 = chronology17.get((org.joda.time.ReadablePeriod) mutablePeriod27, (-5270399989L), 63808128000020L);
        org.joda.time.DateTimeField dateTimeField31 = chronology17.year();
        int int33 = dateTimeField31.get(1970L);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(monthDay23);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[2022, 2, 0, 0, 0, 0, 0, 9]");
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1970 + "'", int33 == 1970);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(1L, dateTimeZone1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight2, readableDuration3, periodType4);
        int int6 = dateMidnight2.getSecondOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = dateMidnight2.getZone();
        org.joda.time.DateMidnight dateMidnight8 = org.joda.time.DateMidnight.now(dateTimeZone7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays(21);
        int int11 = dateMidnight8.getYearOfEra();
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) '4', 15, 20, 59, 53230351);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getTimeZone("hi!");
        boolean boolean3 = timeZone0.hasSameRules(timeZone2);
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(timeZone2);
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromCalendarFields(calendar4);
        org.joda.time.LocalTime localTime7 = localTime5.withMillisOfDay((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval8 = new org.joda.time.Interval((java.lang.Object) localTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
// flaky:         org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Heure de Greenwich");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1645454831391,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=47,SECOND=11,MILLISECOND=391,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plus((long) (-1));
        org.joda.time.DateTime dateTime7 = dateTime4.withTimeAtStartOfDay();
        java.util.Date date8 = dateTime4.toDate();
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromDateFields(date8);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromDateFields(date8);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(1L, dateTimeZone13);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableDuration11, (org.joda.time.ReadableInstant) dateMidnight14, periodType15);
        int int17 = dateMidnight14.getYear();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight14.withDayOfMonth((int) (byte) 10);
        org.joda.time.MutableDateTime mutableDateTime20 = dateMidnight19.toMutableDateTime();
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime20.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime22 = mutableDateTime20.copy();
        mutableDateTime20.addMonths((int) (byte) 100);
        org.joda.time.MutableDateTime.Property property25 = mutableDateTime20.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime27 = property25.add((int) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime28 = property25.getMutableDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        int int30 = mutableDateTime28.get(dateTimeFieldType29);
        // The following exception was thrown during execution in test generation
        try {
            int int31 = localDate10.get(dateTimeFieldType29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(date8);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Dec 30 00:00:00 GMT 569");
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(mutableDateTime27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24 + "'", int30 == 24);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.getDefault();
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withCenturyOfEra(5);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property7 = dateTime4.minuteOfDay();
        org.joda.time.DateTime dateTime8 = property7.withMaximumValue();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, readableDuration9);
        org.joda.time.DateTime.Property property11 = dateTime8.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime8.withYearOfEra((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }
}
