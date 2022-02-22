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
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.DurationFieldType durationFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = period3.withFieldAdded(durationFieldType4, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
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
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((int) (short) -1, (int) (byte) 100, 10, 0, (int) (short) 1, 0, (int) (byte) 10, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
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
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("PT0.099S", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
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
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("PT0.099S", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=pt0.099s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        java.io.IOException iOException0 = new java.io.IOException();
        org.joda.time.PeriodType periodType3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period((long) 100, 1L, periodType3);
        org.joda.time.Period period6 = period4.minusSeconds((-1));
        java.lang.String str7 = period4.toString();
        org.joda.time.Period period8 = period4.toPeriod();
        org.joda.time.PeriodType periodType9 = period4.getPeriodType();
        org.joda.time.Chronology chronology10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period11 = new org.joda.time.Period((java.lang.Object) iOException0, periodType9, chronology10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.io.IOException");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "PT0.099S" + "'", str7, "PT0.099S");
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withDate(0, 10, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.lang.Throwable throwable0 = null;
        java.io.IOException iOException1 = new java.io.IOException(throwable0);
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException" + "'", str2, "java.io.IOException");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
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
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusMillis((int) (byte) 0);
        int[] intArray19 = new int[] { 10, 100, (short) 100, '4', ' ' };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = dateTimeField6.addWrapPartial((org.joda.time.ReadablePartial) localDateTime12, (int) 'a', intArray19, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 97");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[10, 100, 100, 52, 32]");
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (short) 100, 38, (int) (byte) -1, (int) (short) 0, 0, 0, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setYears((int) '#');
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod3.add((long) 1, chronology7);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.set(durationFieldType9, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'null'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) 100, chronology1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay(10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean8 = localTime2.isEqual((org.joda.time.ReadablePartial) localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((int) (byte) -1, (int) (byte) 100, (int) (byte) 10, (int) (byte) 10, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (byte) 0, (-1), (int) (byte) -1, (int) (short) 100, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (short) 0, 10, 0, 0, (int) (short) 10, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setYears((int) '#');
        mutablePeriod3.setSeconds((int) 'a');
        mutablePeriod3.setPeriod((long) ' ', (long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.addWeeks(38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (byte) -1, (int) ' ', (int) (byte) 0, 14, (int) (byte) 100, (int) (short) 100, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localTime3.get(dateTimeFieldType4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField((int) (byte) 0);
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str9 = dateTimeField6.getAsShortText((long) (byte) 1, locale8);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusMillis((int) (byte) 0);
        int[] intArray17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray19 = dateTimeField6.addWrapField((org.joda.time.ReadablePartial) localDateTime10, (int) (byte) 1, intArray17, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970" + "'", str9, "1970");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime3.withHourOfDay(38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime0.withField(dateTimeFieldType1, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime0.withYearOfCentury((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((java.lang.Object) "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis(0L);
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((int) (byte) 0, 52, (-1), 100, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = durationField4.getValueAsLong((long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate6 = localDate4.minusMonths((int) ' ');
        org.joda.time.Chronology chronology7 = localDate4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((java.lang.Object) chronology3, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((java.lang.Object) 10, chronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Locale locale10 = java.util.Locale.CANADA;
        java.lang.String str11 = locale9.getDisplayVariant(locale10);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket12 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale10);
        // The following exception was thrown during execution in test generation
        try {
            long long13 = dateTimeField4.set(0L, "hi!", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField11 = localDateTime9.getField((int) (byte) 0);
        java.util.Locale locale13 = java.util.Locale.CANADA;
        java.lang.String str14 = dateTimeField11.getAsShortText((long) (byte) 1, locale13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = property3.setCopy("PeriodType[Standard]", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PeriodType[Standard]\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970" + "'", str14, "1970");
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField((int) (byte) 0);
        java.lang.String str7 = dateTimeField6.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        org.joda.time.LocalTime localTime11 = localTime9.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime13 = localTime11.plusMillis((int) (byte) 100);
        int[] intArray17 = new int[] { 14, 14 };
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str20 = locale19.getScript();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = dateTimeField6.set((org.joda.time.ReadablePartial) localTime13, (int) (byte) -1, intArray17, "2022-02-21T14:53:38.450Z", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T14:53:38.450Z\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "DateTimeField[year]" + "'", str7, "DateTimeField[year]");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(intArray17);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[14, 14]");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField4 = localDateTime2.getField(38);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 38");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((-1), 1, (int) (short) 0, 52, (int) (byte) 0, (int) (short) 10, 41);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis((int) (byte) 0);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.millis();
        boolean boolean13 = localDateTime4.isSupported(durationFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime4.withDate((int) (byte) -1, (int) '#', 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime6.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str13 = dateTimeFieldType12.getName();
        int int14 = localDateTime6.indexOf(dateTimeFieldType12);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime6.minusSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = localTime3.isAfter((org.joda.time.ReadablePartial) localDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "clockhourOfDay" + "'", str13, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = durationField4.add((long) (byte) 100, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
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
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localTime3.toString("deu");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: u");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) '4', 100, 1, 1, 21, (int) (byte) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.dayTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period(41, (int) (short) 1, (int) (byte) 1, (int) '#', (int) (byte) -1, (int) ' ', 22, 39221019, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        int int18 = property17.get();
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1969 + "'", int18 == 1969);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.Period period4 = period2.withDays((int) (byte) 1);
        org.joda.time.Period period6 = period4.withWeeks((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) period6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(period6);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant3, periodType4);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period8 = duration7.toPeriod();
        org.joda.time.Duration duration11 = duration7.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, 1L, periodType14);
        org.joda.time.PeriodType periodType18 = null;
        org.joda.time.Period period19 = new org.joda.time.Period((long) 100, 1L, periodType18);
        org.joda.time.Period period20 = period15.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.Instant instant21 = new org.joda.time.Instant();
        org.joda.time.Instant instant23 = instant21.withMillis(0L);
        org.joda.time.Duration duration24 = period19.toDurationTo((org.joda.time.ReadableInstant) instant23);
        org.joda.time.Instant instant26 = instant23.plus((long) (byte) -1);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((long) (short) 1, chronology28);
        org.joda.time.Instant instant30 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType31 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime29, (org.joda.time.ReadableInstant) instant30, periodType31);
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration7, (org.joda.time.ReadableInstant) instant23, periodType31);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(chronology36);
        int int38 = dateTime37.getSecondOfMinute();
        boolean boolean39 = dateTime37.isEqualNow();
        int int40 = dateTime37.getDayOfYear();
        org.joda.time.Chronology chronology41 = dateTime37.getChronology();
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((java.lang.Object) dateTime2, periodType31, chronology41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(duration24);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(periodType31);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 43 + "'", int38 == 43);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 52 + "'", int40 == 52);
        org.junit.Assert.assertNotNull(chronology41);
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
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.withMillis(0L);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(3, 0, (int) ' ', chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("English");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"English\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration3, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration6 = new org.joda.time.Duration((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        boolean boolean6 = property3.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getSecondOfMinute();
        int int10 = dateTime8.getYearOfEra();
        int int11 = property3.getDifference((org.joda.time.ReadableInstant) dateTime8);
        int int12 = dateTime8.getHourOfDay();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 43 + "'", int9 == 43);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str20 = dateTimeFieldType19.getName();
        int int21 = localDateTime13.indexOf(dateTimeFieldType19);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime13.minusSeconds(0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (short) 1, chronology25);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) instant27, periodType28);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime0, (org.joda.time.ReadablePartial) localDateTime23, periodType28);
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate33 = localDate31.minusMonths((int) ' ');
        org.joda.time.Chronology chronology34 = localDate31.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = localDateTime23.isAfter((org.joda.time.ReadablePartial) localDate31);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "clockhourOfDay" + "'", str20, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(chronology34);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        java.util.Locale locale4 = locale3.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone0.getDisplayName(false, 53, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 53");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        java.util.TimeZone timeZone9 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) period8, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) 100, 1L, periodType7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.Period period13 = period8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.Instant instant16 = instant14.withMillis(0L);
        org.joda.time.Duration duration17 = period12.toDurationTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime4.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime18, (org.joda.time.ReadablePartial) localDate19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 1L, periodType5);
        org.joda.time.Period period8 = period6.minusSeconds((-1));
        java.lang.String str9 = period6.toString();
        org.joda.time.Period period10 = period6.toPeriod();
        org.joda.time.PeriodType periodType11 = period6.getPeriodType();
        org.joda.time.Period period12 = period2.normalizedStandard(periodType11);
        org.joda.time.Period period14 = period12.multipliedBy((int) (short) 100);
        org.joda.time.Period period16 = period14.plusMonths(893);
        org.joda.time.Period period18 = period16.minusSeconds(52);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.hourOfDay();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str26 = dateTimeFieldType25.getName();
        int int27 = localDateTime19.indexOf(dateTimeFieldType25);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime19.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime31 = localDateTime19.minusSeconds((int) '#');
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property35 = localDateTime32.hourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str39 = dateTimeFieldType38.getName();
        int int40 = localDateTime32.indexOf(dateTimeFieldType38);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime32.minusSeconds(0);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((long) (short) 1, chronology44);
        org.joda.time.Instant instant46 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType47 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime45, (org.joda.time.ReadableInstant) instant46, periodType47);
        org.joda.time.Period period49 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime19, (org.joda.time.ReadablePartial) localDateTime42, periodType47);
        int int50 = periodType47.size();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period51 = period16.normalizedStandard(periodType47);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT0.099S" + "'", str9, "PT0.099S");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "clockhourOfDay" + "'", str26, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "clockhourOfDay" + "'", str39, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(periodType47);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 1 + "'", int50 == 1);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.plusMonths(43);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = localTime3.isEqual((org.joda.time.ReadablePartial) localDate6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField10 = localDateTime8.getField((int) (byte) 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray11 = localDateTime8.getFields();
        int[] intArray13 = new int[] { (short) 1 };
        // The following exception was thrown during execution in test generation
        try {
            chronology3.validate((org.joda.time.ReadablePartial) localDateTime8, intArray13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeFieldArray11);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[1]");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.PeriodType periodType20 = null;
        org.joda.time.Period period21 = new org.joda.time.Period((long) 100, 1L, periodType20);
        org.joda.time.PeriodType periodType24 = null;
        org.joda.time.Period period25 = new org.joda.time.Period((long) 100, 1L, periodType24);
        org.joda.time.Period period26 = period21.plus((org.joda.time.ReadablePeriod) period25);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.Instant instant29 = instant27.withMillis(0L);
        org.joda.time.Duration duration30 = period25.toDurationTo((org.joda.time.ReadableInstant) instant29);
        org.joda.time.Instant instant32 = instant29.plus((long) (byte) -1);
        org.joda.time.DateTime dateTime33 = instant29.toDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType35 = dateTimeFieldType34.getRangeDurationType();
        org.joda.time.DateTime.Property property36 = dateTime33.property(dateTimeFieldType34);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.set(dateTimeFieldType34, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(instant29);
        org.junit.Assert.assertNotNull(duration30);
        org.junit.Assert.assertNotNull(instant32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertNotNull(durationFieldType35);
        org.junit.Assert.assertNotNull(property36);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime.Property property3 = dateTime2.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime2.withCenturyOfEra(39221019);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39221019 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField2 = localTime0.getField((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("deu", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime3.withField(dateTimeFieldType4, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("English (United Kingdom)", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        java.lang.String str5 = durationField4.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = durationField4.getValueAsLong((long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eras" + "'", str5, "eras");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate0.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration3, readableInstant4);
        org.joda.time.Period period7 = period5.withDays((int) (byte) 1);
        org.joda.time.LocalDate localDate8 = localDate2.plus((org.joda.time.ReadablePeriod) period7);
        java.util.Locale locale10 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localDate2.toString("2022-02-21T14:53:38.450Z", locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_CA");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str9 = locale7.getDisplayVariant(locale8);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology6, locale8);
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.util.Locale locale12 = java.util.Locale.CANADA;
        java.lang.String str13 = locale11.getDisplayVariant(locale12);
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        java.lang.String str17 = locale14.getISO3Language();
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        java.util.Locale locale21 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.lang.String str23 = locale22.getDisplayName();
        java.util.Locale locale24 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology26 = null;
        java.util.Locale locale27 = java.util.Locale.GERMAN;
        java.util.Locale locale28 = java.util.Locale.CANADA;
        java.lang.String str29 = locale27.getDisplayVariant(locale28);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket31 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology26, locale28, (java.lang.Integer) 10);
        java.util.Locale locale32 = java.util.Locale.GERMAN;
        java.lang.String str33 = locale32.getDisplayName();
        java.util.Locale locale34 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale35 = java.util.Locale.UK;
        java.util.Locale[] localeArray36 = new java.util.Locale[] { locale8, locale12, locale14, locale18, locale21, locale22, locale24, locale28, locale32, locale34, locale35 };
        java.util.ArrayList<java.util.Locale> localeList37 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean38 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList37, localeArray36);
        java.util.Locale.FilteringMode filteringMode39 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList40 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList37, filteringMode39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant41 = new org.joda.time.Instant((java.lang.Object) filteringMode39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale$FilteringMode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "deu" + "'", str17, "deu");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "German" + "'", str23, "German");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "de");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "de");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "German" + "'", str33, "German");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localeArray36);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + true + "'", boolean38 == true);
        org.junit.Assert.assertTrue("'" + filteringMode39 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode39.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList40);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant10 = instant8.withMillis(0L);
        org.joda.time.Chronology chronology11 = instant10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        java.util.Locale locale13 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology11, locale13, (java.lang.Integer) 39221019);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((int) (short) 1, 40, 6, 45, 45, (int) 'a', (int) ' ', chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setWeekOfWeekyear(14);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate22 = localDate20.minusMonths((int) ' ');
        org.joda.time.Chronology chronology23 = localDate20.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.minuteOfDay();
        mutableDateTime1.setChronology(chronology23);
        mutableDateTime1.addSeconds(43);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        java.lang.String str5 = durationField4.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = durationField4.getValueAsLong((long) 3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eras" + "'", str5, "eras");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("clockhourOfDay", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withMillisOfSecond(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.util.TimeZone timeZone0 = null;
        java.util.TimeZone.setDefault(timeZone0);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration3, readableInstant4);
        org.joda.time.Period period7 = period5.withDays((int) (byte) 1);
        org.joda.time.LocalDate localDate8 = localDate2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period10 = period7.plusSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType12 = period10.getFieldType(53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
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
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withTime((int) (short) -1, 42, 43, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("PT0.099S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=pt0.099s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant3, periodType4);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod5.setWeeks(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weeks'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths(43);
        org.joda.time.LocalDate.Property property3 = localDate0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = property3.setCopy((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.monthOfYear();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getSecondOfMinute();
        boolean boolean12 = dateTime10.isEqualNow();
        int int13 = dateTime10.getDayOfYear();
        org.joda.time.Chronology chronology14 = dateTime10.getChronology();
        long long15 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime10);
        int int16 = property8.getMaximumValue();
        java.util.Locale locale17 = null;
        java.lang.String str18 = property8.getAsText(locale17);
        org.joda.time.LocalDateTime localDateTime20 = property8.addToCopy(12);
        int[] intArray22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = dateTimeField6.addWrapPartial((org.joda.time.ReadablePartial) localDateTime20, (int) 'a', intArray22, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 47 + "'", int11 == 47);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 0L + "'", long15 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 12 + "'", int16 == 12);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "February" + "'", str18, "February");
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.ReadableDuration readableDuration1 = null;
        org.joda.time.ReadableInstant readableInstant2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period(readableDuration1, readableInstant2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period9 = period7.minusSeconds((-1));
        java.lang.String str10 = period7.toString();
        org.joda.time.Period period11 = period7.toPeriod();
        org.joda.time.PeriodType periodType12 = period7.getPeriodType();
        org.joda.time.Period period13 = period3.normalizedStandard(periodType12);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology16);
        int int18 = dateTime17.getSecondOfMinute();
        boolean boolean19 = dateTime17.isEqualNow();
        int int20 = dateTime17.getDayOfYear();
        org.joda.time.Chronology chronology21 = dateTime17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.year();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period25 = new org.joda.time.Period((java.lang.Object) (-1L), periodType12, chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "PT0.099S" + "'", str10, "PT0.099S");
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(periodType12);
        org.junit.Assert.assertNotNull(period13);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 48 + "'", int18 == 48);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 52 + "'", int20 == 52);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = property1.setCopy("PeriodType[Standard]", locale3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PeriodType[Standard]\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = property4.setCopy("February");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"February\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate0.withDayOfYear(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateMidnight4);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = durationField4.getMillis(44);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.withMillis(0L);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.util.Locale locale8 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology6, locale8, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        int int16 = property14.get();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfFloorCopy();
        long long19 = chronology6.set((org.joda.time.ReadablePartial) localDateTime17, (long) 2022);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(chronology6);
        // The following exception was thrown during execution in test generation
        try {
            long long25 = chronology6.getDateTimeMillis((int) (short) 10, 46, (int) (short) 1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 14 + "'", int16 == 14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1645455600000L + "'", long19 == 1645455600000L);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withMonthOfYear(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.util.Locale.Category category0 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale1 = java.util.Locale.getDefault(category0);
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertTrue("'" + category0 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category0.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "en_US" + "'", str2, "en_US");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = new org.joda.time.Duration((java.lang.Object) 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        java.lang.String str5 = durationField4.getName();
        boolean boolean6 = durationField4.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = durationField4.subtract(24L, 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eras" + "'", str5, "eras");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str3 = dateTimeZone1.getNameKey((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) "en_US", dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"en_US\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        java.lang.String str5 = durationField4.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = durationField4.subtract((long) 39221019, 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eras" + "'", str5, "eras");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("UTC", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField8 = localDateTime6.getField((int) (byte) 0);
        long long10 = dateTimeField8.roundHalfEven((long) 1);
        int int11 = dateTime1.get(dateTimeField8);
        boolean boolean12 = dateTime1.isBeforeNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime1.withMinuteOfHour((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property2 = localDateTime1.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getSecondOfMinute();
        boolean boolean6 = dateTime4.isEqualNow();
        int int7 = dateTime4.getDayOfYear();
        org.joda.time.Chronology chronology8 = dateTime4.getChronology();
        long long9 = property2.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime4);
        org.joda.time.DateTime dateTime11 = dateTime4.minusYears(0);
        java.util.Date date12 = dateTime4.toDate();
        boolean boolean13 = timeZone0.inDaylightTime(date12);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 50 + "'", int5 == 50);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Mon Feb 21 14:53:50 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(52, 50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        java.lang.String str3 = locale0.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "deu" + "'", str3, "deu");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField((int) (byte) 0);
        java.lang.String str7 = localDateTime4.toString();
        int int8 = localDateTime4.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime4.withMonthOfYear((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-21T10:53:50.766" + "'", str7, "2022-02-21T10:53:50.766");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 52 + "'", int8 == 52);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        java.util.Locale locale7 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology5, locale7, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 53, chronology5);
        org.joda.time.DateTimeField dateTimeField11 = chronology5.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = dateTimeField11.getType();
        org.joda.time.ReadablePartial readablePartial13 = null;
        int[] intArray21 = new int[] { 50, 1969, 4, '4', 100, 3 };
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale24 = java.util.Locale.CANADA;
        java.lang.String str25 = locale23.getDisplayVariant(locale24);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = dateTimeField11.set(readablePartial13, 3, intArray21, "hi!", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[50, 1969, 4, 52, 100, 3]");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = durationField4.subtract((-60494601599990L), 893);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.util.Locale locale0 = java.util.Locale.CANADA;
        java.lang.String str1 = locale0.getDisplayLanguage();
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 100, 1L, periodType10);
        org.joda.time.Period period12 = period7.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.Instant instant15 = instant13.withMillis(0L);
        org.joda.time.Duration duration16 = period11.toDurationTo((org.joda.time.ReadableInstant) instant15);
        mutableDateTime3.add((org.joda.time.ReadableDuration) duration16, 39);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime3.setZone(dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime((java.lang.Object) str1, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"English\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "English" + "'", str1, "English");
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField((int) (byte) 0);
        java.util.Locale locale8 = java.util.Locale.CANADA;
        java.lang.String str9 = dateTimeField6.getAsShortText((long) (byte) 1, locale8);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = dateTimeField6.set((long) '#', "hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "1970" + "'", str9, "1970");
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        int int6 = localTime5.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime5.withHourOfDay((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 39232075 + "'", int6 == 39232075);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        long long8 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime3);
        int int9 = property1.getMaximumValue();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property1.getAsText(locale10);
        int int12 = property1.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime14 = property1.addWrapFieldToCopy(46);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getSecondOfMinute();
        boolean boolean20 = dateTime18.isEqualNow();
        int int21 = dateTime18.getDayOfYear();
        org.joda.time.Chronology chronology22 = dateTime18.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) property1, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "February" + "'", str11, "February");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 3, true);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str8 = dateTimeFieldType7.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime6.withField(dateTimeFieldType7, 41);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 41 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3L + "'", long5 == 3L);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "clockhourOfDay" + "'", str8, "clockhourOfDay");
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField((int) (byte) 0);
        java.lang.String str7 = localDateTime4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant8 = new org.joda.time.Instant((java.lang.Object) localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-21T10:53:52.445" + "'", str7, "2022-02-21T10:53:52.445");
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfMonth();
        org.joda.time.Chronology chronology2 = localDate0.getChronology();
        org.joda.time.LocalDate.Property property3 = localDate0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime((java.lang.Object) localDate0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"UTC\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone0);
        java.lang.String str5 = dateTimeZone0.getID();
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "UTC" + "'", str5, "UTC");
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        java.lang.String str5 = durationField4.getName();
        // The following exception was thrown during execution in test generation
        try {
            long long7 = durationField4.getValueAsLong((long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eras" + "'", str5, "eras");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setYears((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.add(44, 100, 1, 56, 3, 893, (int) (short) -1, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        java.lang.Object obj2 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(obj2);
// flaky:         org.junit.Assert.assertEquals(obj2.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withMillisOfSecond(9722);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9722 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setRawOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str6 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Coordinated Universal Time" + "'", str6, "Coordinated Universal Time");
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setRawOffset((int) '#');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property11 = localDateTime8.hourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.plusMillis((int) (byte) 0);
        int int14 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localDateTime8);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime7.withMillisOfSecond(12);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.minusWeeks((int) '4');
        java.util.Date date19 = localDateTime16.toDate();
        boolean boolean20 = timeZone0.inDaylightTime(date19);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(date19);
// flaky:         org.junit.Assert.assertEquals(date19.toString(), "Mon Feb 21 10:53:54 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(chronology8);
        int int10 = dateTime9.getSecondOfMinute();
        boolean boolean11 = dateTime9.isEqualNow();
        int int12 = dateTime9.getDayOfYear();
        org.joda.time.Chronology chronology13 = dateTime9.getChronology();
        java.util.Locale locale14 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket(315532800097L, chronology13, locale14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(43, 958, (int) (short) 100, 0, 8, 50, (-292275054), chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 55 + "'", int10 == 55);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 52 + "'", int12 == 52);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "zh_CN");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        java.lang.String str5 = durationField4.getName();
        boolean boolean6 = durationField4.isSupported();
        boolean boolean7 = durationField4.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField4.add((long) (short) 10, (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eras" + "'", str5, "eras");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) 100, 1L, periodType7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.Period period13 = period8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.Instant instant16 = instant14.withMillis(0L);
        org.joda.time.Duration duration17 = period12.toDurationTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime4.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusYears(6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withDayOfMonth(43);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 43 for dayOfMonth must be in the range [1,29]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.Period period1 = org.joda.time.Period.hours(44);
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(2022, (int) ' ', 6, (int) (short) 100);
        org.joda.time.Period period7 = period1.minus((org.joda.time.ReadablePeriod) mutablePeriod6);
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime9.add((org.joda.time.ReadableDuration) duration11, (int) (short) 100);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) 1, chronology15);
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime16, (org.joda.time.ReadableInstant) instant17, periodType18);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate22 = localDate20.minusMonths((int) ' ');
        org.joda.time.Chronology chronology23 = localDate20.getChronology();
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate26 = localDate20.withFieldAdded(durationFieldType24, (int) (byte) 100);
        int int27 = periodType18.indexOf(durationFieldType24);
        org.joda.time.Period period28 = duration11.toPeriod(periodType18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period29 = period1.withPeriodType(periodType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + (-1) + "'", int27 == (-1));
        org.junit.Assert.assertNotNull(period28);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime22 = property20.addWrapField((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime22.setTime(43, 38, 56, 41);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 43 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime22);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setRawOffset((int) '#');
        boolean boolean3 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.Period period1 = org.joda.time.Period.days((int) (byte) 100);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant3, periodType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int7 = instant3.get(dateTimeFieldType6);
        org.joda.time.Duration duration10 = new org.joda.time.Duration((long) 10, (long) 3);
        org.joda.time.Instant instant12 = instant3.withDurationAdded((org.joda.time.ReadableDuration) duration10, 0);
        java.lang.Object obj13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj13);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField21 = localDateTime19.getField((int) (byte) 0);
        long long23 = dateTimeField21.roundHalfEven((long) 1);
        int int24 = dateTime14.get(dateTimeField21);
        boolean boolean25 = dateTime14.isBeforeNow();
        org.joda.time.DateTime.Property property26 = dateTime14.weekOfWeekyear();
        org.joda.time.DateTime dateTime27 = property26.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval28 = duration10.toIntervalTo((org.joda.time.ReadableInstant) dateTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 893 + "'", int7 == 893);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.Period period17 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        org.joda.time.Instant instant20 = instant18.withMillis(0L);
        org.joda.time.Duration duration21 = period16.toDurationTo((org.joda.time.ReadableInstant) instant20);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration21, 39);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime8.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime8.setZone(dateTimeZone25);
        org.joda.time.Chronology chronology28 = null;
        java.util.Locale locale29 = java.util.Locale.GERMAN;
        java.util.Locale locale30 = locale29.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology28, locale29, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeParserBucket33.getZone();
        long long36 = dateTimeZone25.getMillisKeepLocal(dateTimeZone34, 315532800097L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(51, 42, 39, 50, 45, 1969, 2023, dateTimeZone34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "de");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 315532800097L + "'", long36 == 315532800097L);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) 'a', (int) '#', 2023);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        int int6 = localDateTime5.getCenturyOfEra();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (short) 0, 45, 2022, 44, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("clockhourOfDay", (double) 9722);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=9722.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.year();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
        long long14 = dateTimeZone11.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds(39);
        org.joda.time.Period period20 = org.joda.time.Period.hours(44);
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(2022, (int) ' ', 6, (int) (short) 100);
        org.joda.time.Period period26 = period20.minus((org.joda.time.ReadablePeriod) mutablePeriod25);
        int[] intArray27 = period20.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = dateTimeField10.addWrapPartial((org.joda.time.ReadablePartial) localDateTime15, (int) 'a', intArray27, 9722);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 57 + "'", int4 == 57);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 100L + "'", long14 == 100L);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[0, 0, 0, 0, 44, 0, 0, 0]");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(44, 2, 10, 50, (int) (byte) -1, 44, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.Period period17 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Period period19 = period16.minusSeconds(21);
        mutablePeriod8.add((org.joda.time.ReadablePeriod) period19);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod8.setValue(9722, 49);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 9722");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 57 + "'", int4 == 57);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(period19);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("English (United Kingdom)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'English (United Kingdom)' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology7);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = mutablePeriod8.getValue(22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 58 + "'", int4 == 58);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        boolean boolean8 = property5.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getSecondOfMinute();
        int int12 = dateTime10.getYearOfEra();
        int int13 = property5.getDifference((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.DateTime dateTime15 = dateTime1.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime15.withMinuteOfHour(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 58 + "'", int11 == 58);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime9 = localTime7.plusMillis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.eras();
        boolean boolean11 = localTime7.isSupported(durationFieldType10);
        boolean boolean12 = mutablePeriod3.isSupported(durationFieldType10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableInstant13, readableInstant14, periodType15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime localTime20 = localTime18.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime22 = localTime20.plusMillis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.eras();
        boolean boolean24 = localTime20.isSupported(durationFieldType23);
        boolean boolean25 = mutablePeriod16.isSupported(durationFieldType23);
        mutablePeriod3.add((org.joda.time.ReadablePeriod) mutablePeriod16);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.ReadableInstant readableInstant28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period(readableDuration27, readableInstant28);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 100, 1L, periodType32);
        org.joda.time.Period period35 = period33.minusSeconds((-1));
        java.lang.String str36 = period33.toString();
        org.joda.time.Period period37 = period33.toPeriod();
        org.joda.time.PeriodType periodType38 = period33.getPeriodType();
        org.joda.time.Period period39 = period29.normalizedStandard(periodType38);
        org.joda.time.Period period41 = period39.multipliedBy((int) (short) 100);
        org.joda.time.Period period43 = period41.plusMonths(893);
        org.joda.time.Period period45 = period43.minusSeconds(52);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.mergePeriod((org.joda.time.ReadablePeriod) period43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(period35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "PT0.099S" + "'", str36, "PT0.099S");
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertNotNull(period45);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.era();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        boolean boolean6 = property4.isLeap();
        org.joda.time.DurationField durationField7 = property4.getLeapDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = property4.addToCopy(50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNull(durationField7);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        timeZone0.setRawOffset((int) '#');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.monthOfYear();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(chronology5);
        int int7 = dateTime6.getSecondOfMinute();
        boolean boolean8 = dateTime6.isEqualNow();
        int int9 = dateTime6.getDayOfYear();
        org.joda.time.Chronology chronology10 = dateTime6.getChronology();
        long long11 = property4.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime dateTime13 = dateTime6.minusYears(0);
        java.util.Date date14 = dateTime6.toDate();
        boolean boolean15 = timeZone0.inDaylightTime(date14);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 58 + "'", int7 == 58);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Mon Feb 21 14:53:58 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setRawOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        boolean boolean6 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDateTime4.getValue(41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 41");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        java.lang.String str5 = durationField4.getName();
        boolean boolean6 = durationField4.isSupported();
        boolean boolean7 = durationField4.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField4.getDifferenceAsLong(0L, (long) 86396191);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eras" + "'", str5, "eras");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("1969-12-31T23:59:56.191Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        boolean boolean19 = mutableDateTime1.isBeforeNow();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDateTime(10, 22, 5, 0, (int) (short) 1, 45, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("14");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"14\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology5);
        org.joda.time.DurationField durationField8 = chronology5.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology5.getDateTimeMillis(45, 38, (int) (byte) 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 38 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        java.lang.String str5 = durationField4.getName();
        boolean boolean6 = durationField4.isSupported();
        boolean boolean7 = durationField4.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField4.getValueAsLong((long) 45, (long) 53);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eras" + "'", str5, "eras");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2022-02-21T14:53:55.782Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(40, 23, (int) (byte) 0, 9722);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField8 = localDateTime6.getField((int) (byte) 0);
        long long10 = dateTimeField8.roundHalfEven((long) 1);
        int int11 = dateTime1.get(dateTimeField8);
        int int13 = dateTimeField8.getLeapAmount((long) (byte) 10);
        java.lang.String str15 = dateTimeField8.getAsText((long) 1969);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField24 = localDateTime22.getField((int) (byte) 0);
        java.util.Locale locale26 = java.util.Locale.CANADA;
        java.lang.String str27 = dateTimeField24.getAsShortText((long) (byte) 1, locale26);
        java.lang.String str28 = locale26.getVariant();
        java.lang.String str29 = locale26.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            long long30 = dateTimeField8.set((long) ' ', "eras", locale26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"eras\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970" + "'", str15, "1970");
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1970" + "'", str27, "1970");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en-CA" + "'", str29, "en-CA");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.year();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology7.halfdays();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        long long15 = dateTimeZone12.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusSeconds(39);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 100, 1L, periodType21);
        org.joda.time.Period period24 = period22.minusSeconds((-1));
        java.lang.String str25 = period22.toString();
        org.joda.time.Period period26 = period22.toPeriod();
        org.joda.time.Period period28 = period22.plusSeconds((int) '#');
        int[] intArray29 = period22.getValues();
        // The following exception was thrown during execution in test generation
        try {
            chronology7.validate((org.joda.time.ReadablePartial) localDateTime18, intArray29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 59 + "'", int4 == 59);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 100L + "'", long15 == 100L);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "PT0.099S" + "'", str25, "PT0.099S");
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, 0, 0, 0, 0, -99]");
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField8 = localDateTime6.getField((int) (byte) 0);
        long long10 = dateTimeField8.roundHalfEven((long) 1);
        int int11 = dateTime1.get(dateTimeField8);
        int int13 = dateTimeField8.getLeapAmount((long) (byte) 10);
        java.lang.String str15 = dateTimeField8.getAsText((long) 1969);
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
        long long20 = dateTimeZone17.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone17);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean23 = localTime21.isSupported(dateTimeFieldType22);
        org.joda.time.Instant instant26 = new org.joda.time.Instant();
        org.joda.time.Instant instant28 = instant26.withMillis(0L);
        org.joda.time.Chronology chronology29 = instant28.getChronology();
        org.joda.time.DurationField durationField30 = chronology29.eras();
        java.util.Locale locale31 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket33 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology29, locale31, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property37 = localDateTime34.hourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = property37.getField();
        int int39 = property37.get();
        org.joda.time.LocalDateTime localDateTime40 = property37.roundHalfFloorCopy();
        long long42 = chronology29.set((org.joda.time.ReadablePartial) localDateTime40, (long) 2022);
        org.joda.time.DateTimeField dateTimeField43 = chronology29.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField44 = chronology29.minuteOfHour();
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) 100, 1L, periodType47);
        org.joda.time.Period period50 = period48.minusSeconds((-1));
        java.lang.String str51 = period48.toString();
        org.joda.time.Period period52 = period48.negated();
        int[] intArray54 = chronology29.get((org.joda.time.ReadablePeriod) period52, (long) 1969);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray56 = dateTimeField8.add((org.joda.time.ReadablePartial) localTime21, 23, intArray54, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 23");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "1970" + "'", str15, "1970");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 100L + "'", long20 == 100L);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(instant28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(dateTimeField38);
// flaky:         org.junit.Assert.assertTrue("'" + int39 + "' != '" + 14 + "'", int39 == 14);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 1645455600000L + "'", long42 == 1645455600000L);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "PT0.099S" + "'", str51, "PT0.099S");
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(intArray54);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray54), "[0, 0, 0, 0, 0, 0, 1, 969]");
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(0, 2023, 49, 4, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.ReadablePartial readablePartial4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.minusMonths((int) ' ');
        int int8 = localDate5.size();
        org.joda.time.LocalDate.Property property9 = localDate5.era();
        org.joda.time.PeriodType periodType10 = org.joda.time.PeriodType.yearDayTime();
        boolean boolean11 = localDate5.equals((java.lang.Object) periodType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime3, readablePartial4, periodType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(periodType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusSeconds(39);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.secondOfMinute();
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.weekOfWeekyear();
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.eras();
        java.util.Locale locale16 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology14, locale16, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) 53, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDate19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = locale2.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket6.getZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localTime8.toDateTimeToday();
        org.joda.time.LocalTime.Property property10 = localTime8.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = property10.setCopy(457070);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 457070 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        long long5 = durationField4.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = durationField4.getValue((long) (short) 10, (long) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21");
        java.util.Locale locale2 = java.util.Locale.CANADA;
        java.lang.String str3 = locale2.getDisplayLanguage();
        java.util.Locale locale4 = java.util.Locale.US;
        java.lang.String str5 = locale2.getDisplayName(locale4);
        java.lang.String str6 = timeZone1.getDisplayName(locale4);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "English" + "'", str3, "English");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "English (Canada)" + "'", str5, "English (Canada)");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Greenwich Mean Time" + "'", str6, "Greenwich Mean Time");
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.LocalTime localTime2 = localTime0.withSecondOfMinute(45);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str10 = dateTimeFieldType9.getName();
        int int11 = localDateTime3.indexOf(dateTimeFieldType9);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime3.minusSeconds((int) '#');
        org.joda.time.LocalDateTime localDateTime17 = localDateTime3.plusMillis((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localTime2.compareTo((org.joda.time.ReadablePartial) localDateTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "clockhourOfDay" + "'", str10, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.lang.String str1 = timeZone0.getDisplayName();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "Coordinated Universal Time" + "'", str1, "Coordinated Universal Time");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        int int21 = mutableDateTime1.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime1.year();
        mutableDateTime1.setSecondOfDay(50);
        org.joda.time.Chronology chronology25 = mutableDateTime1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setHourOfDay(86396191);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86396191 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969 + "'", int20 == 1969);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(chronology25);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str14 = dateTimeFieldType13.getName();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.property(dateTimeFieldType13);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(0L, dateTimeZone18);
        long long22 = dateTimeZone18.convertLocalToUTC((long) 3, true);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) 4, dateTimeZone18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime12, (org.joda.time.ReadablePartial) localTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "dayOfMonth" + "'", str14, "dayOfMonth");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 3L + "'", long22 == 3L);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("de");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"de\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("14", dateTimeFormatter1);
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
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("PeriodType[Standard]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"PeriodType[Standard]\" is malformed at \"eriodType[Standard]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 1, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        int int8 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration10);
        org.joda.time.DateMidnight dateMidnight12 = dateTime6.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime6.withTime(1969, 31, 40, 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration10);
        org.junit.Assert.assertNotNull(dateMidnight12);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField((int) (byte) 0);
        java.lang.String str7 = localDateTime4.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withDayOfWeek(39236);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39236 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeField6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-21T10:54:01.971" + "'", str7, "2022-02-21T10:54:01.971");
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.minusHours((-1));
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period8 = duration7.toPeriod();
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.centuries();
        int int10 = period8.get(durationFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime3.withFieldAdded(durationFieldType9, 39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(5, 51, 1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        long long8 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime3);
        int int9 = property1.getMaximumValue();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property1.getAsText(locale10);
        int int12 = property1.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime14 = property1.addWrapFieldToCopy(46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMonthOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2 + "'", int4 == 2);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "February" + "'", str11, "February");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(0, 20, (-292275054), 1970, (int) (byte) 1, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        long long10 = dateTimeZone7.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType17 = null;
        org.joda.time.Period period18 = new org.joda.time.Period((long) 100, 1L, periodType17);
        org.joda.time.PeriodType periodType21 = null;
        org.joda.time.Period period22 = new org.joda.time.Period((long) 100, 1L, periodType21);
        org.joda.time.Period period23 = period18.plus((org.joda.time.ReadablePeriod) period22);
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.Instant instant26 = instant24.withMillis(0L);
        org.joda.time.Duration duration27 = period22.toDurationTo((org.joda.time.ReadableInstant) instant26);
        mutableDateTime14.add((org.joda.time.ReadableDuration) duration27, 39);
        org.joda.time.MutableDateTime.Property property30 = mutableDateTime14.secondOfMinute();
        org.joda.time.MutableDateTime.Property property31 = mutableDateTime14.minuteOfHour();
        java.lang.String str32 = property31.getAsShortText();
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.util.Locale locale34 = locale33.stripExtensions();
        int int35 = property31.getMaximumTextLength(locale34);
        java.lang.String str36 = dateTimeZone7.getShortName((long) (short) 1, locale34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime37 = new org.joda.time.MutableDateTime(3, (int) (short) 100, 56, 8, 55, 4, 44, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 100L + "'", long10 == 100L);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(instant26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "59" + "'", str32, "59");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2 + "'", int35 == 2);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "+00:00" + "'", str36, "+00:00");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        long long3 = dateTimeZone0.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.time();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = new org.joda.time.Period((java.lang.Object) dateTimeZone0, periodType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 100L + "'", long3 == 100L);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setSecondOfDay(457070);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 457070 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) timeZone0, chronology5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("PT0.099S", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        boolean boolean19 = mutableDateTime1.isBeforeNow();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = mutableDateTime1.toString("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.minusMonths((int) ' ');
        org.joda.time.Chronology chronology8 = localDate5.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(39221019, 51, 38, 4, 86396191, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86396191 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setRawOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone.setDefault(timeZone0);
        java.util.Locale locale9 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = timeZone0.getDisplayName(false, 1970, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 1970");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_US");
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        int int6 = localTime5.getMillisOfDay();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate9 = localDate7.minusMonths((int) ' ');
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate13 = localDate7.withFieldAdded(durationFieldType11, (int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localTime5.compareTo((org.joda.time.ReadablePartial) localDate13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 39244755 + "'", int6 == 39244755);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(0L, dateTimeZone3);
        int int6 = dateTimeZone3.getOffsetFromLocal((long) (byte) 1);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(obj1, dateTimeZone3);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) 40, dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDate8.toString("java.io.IOException");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        int int19 = mutableDateTime1.getWeekOfWeekyear();
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime1.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDateTime(39239, 39243612, (int) (short) -1, 365, 47, 39239, 45);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long) (short) 1);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 100, 1L, periodType10);
        org.joda.time.Period period12 = period7.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.Instant instant15 = instant13.withMillis(0L);
        org.joda.time.Duration duration16 = period11.toDurationTo((org.joda.time.ReadableInstant) instant15);
        mutableDateTime3.add((org.joda.time.ReadableDuration) duration16, 39);
        org.joda.time.MutableDateTime.Property property19 = mutableDateTime3.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime21 = mutableDateTime3.toMutableDateTime(dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) duration1, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Duration");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(39239, 14, 39221019, 57, 55);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 57 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period9 = period7.minusSeconds((-1));
        org.joda.time.Duration duration11 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period12 = duration11.toPeriod();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.centuries();
        int int14 = period12.get(durationFieldType13);
        boolean boolean15 = period7.isSupported(durationFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.add(durationFieldType13, 39236);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'centuries'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime.Property property6 = localTime3.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime3.withField(dateTimeFieldType7, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        long long9 = dateTimeZone6.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone6);
        int int12 = dateTimeZone6.getOffset((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((int) (short) 0, (int) 'x', 19, 1970, 8, (int) (byte) 0, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 100L + "'", long9 == 100L);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        int int18 = mutableDateTime1.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField26 = localDateTime24.getField((int) (byte) 0);
        java.util.Locale locale28 = java.util.Locale.CANADA;
        java.lang.String str29 = dateTimeField26.getAsShortText((long) (byte) 1, locale28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = mutableDateTime1.toString("deu", locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: u");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "1970" + "'", str29, "1970");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = chronology3.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField5 = chronology3.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = chronology3.getDateTimeMillis(31, 894, 42, 8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 894 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = locale2.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket6.getZone();
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.era();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearDayTime();
        boolean boolean6 = localDate0.equals((java.lang.Object) periodType5);
        org.joda.time.LocalDate localDate8 = localDate0.withYearOfEra(52);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate0.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears(1);
        org.joda.time.LocalDate.Property property4 = localDate3.yearOfEra();
        int int5 = property4.getMinimumValueOverall();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime1.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        long long24 = dateTimeZone21.convertLocalToUTC((long) (byte) 100, false);
        mutableDateTime1.setZone(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfWeek(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 100L + "'", long24 == 100L);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("Property[hourOfDay]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 1, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        int int8 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Duration duration10 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableDuration) duration10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime6.withDate(20, 14, 86396);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(duration10);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate3.withEra(58);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        java.util.Locale locale6 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale6, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        int int14 = property12.get();
        org.joda.time.LocalDateTime localDateTime15 = property12.roundHalfFloorCopy();
        long long17 = chronology4.set((org.joda.time.ReadablePartial) localDateTime15, (long) 2022);
        org.joda.time.DateTimeField dateTimeField18 = chronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology4.minuteOfHour();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 1L, periodType22);
        org.joda.time.Period period25 = period23.minusSeconds((-1));
        java.lang.String str26 = period23.toString();
        org.joda.time.Period period27 = period23.negated();
        int[] intArray29 = chronology4.get((org.joda.time.ReadablePeriod) period27, (long) 1969);
        org.joda.time.DateTimeField dateTimeField30 = chronology4.halfdayOfDay();
        org.joda.time.ReadablePartial readablePartial31 = null;
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.Instant instant36 = instant34.withMillis(0L);
        org.joda.time.Chronology chronology37 = instant36.getChronology();
        org.joda.time.DurationField durationField38 = chronology37.eras();
        java.util.Locale locale39 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket41 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology37, locale39, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property45 = localDateTime42.hourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = property45.getField();
        int int47 = property45.get();
        org.joda.time.LocalDateTime localDateTime48 = property45.roundHalfFloorCopy();
        long long50 = chronology37.set((org.joda.time.ReadablePartial) localDateTime48, (long) 2022);
        org.joda.time.DateTimeField dateTimeField51 = chronology37.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField52 = chronology37.minuteOfHour();
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) 100, 1L, periodType55);
        org.joda.time.Period period58 = period56.minusSeconds((-1));
        java.lang.String str59 = period56.toString();
        org.joda.time.Period period60 = period56.negated();
        int[] intArray62 = chronology37.get((org.joda.time.ReadablePeriod) period60, (long) 1969);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray64 = dateTimeField30.add(readablePartial31, 1969, intArray62, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1969");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 14 + "'", int14 == 14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1645455600000L + "'", long17 == 1645455600000L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT0.099S" + "'", str26, "PT0.099S");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, 0, 0, 0, 1, 969]");
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(durationField38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTimeField46);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 14 + "'", int47 == 14);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 1645455600000L + "'", long50 == 1645455600000L);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "PT0.099S" + "'", str59, "PT0.099S");
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 0, 0, 0, 0, 1, 969]");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("14", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        java.lang.String str5 = durationField4.getName();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.plusMonths(43);
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear(12);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.minusMonths((int) ' ');
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableDuration14, readableInstant15);
        org.joda.time.Period period18 = period16.withDays((int) (byte) 1);
        org.joda.time.LocalDate localDate19 = localDate13.plus((org.joda.time.ReadablePeriod) period18);
        org.joda.time.LocalDate localDate21 = localDate19.minusMonths((-292275054));
        org.joda.time.LocalDate localDate23 = localDate19.minusYears(21);
        org.joda.time.PeriodType periodType24 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType25 = periodType24.withMonthsRemoved();
        org.joda.time.Period period26 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate10, (org.joda.time.ReadablePartial) localDate23, periodType24);
        org.joda.time.PeriodType periodType27 = period26.getPeriodType();
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.Instant instant31 = instant29.withMillis(0L);
        org.joda.time.Chronology chronology32 = instant31.getChronology();
        org.joda.time.DurationField durationField33 = chronology32.eras();
        java.util.Locale locale34 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket36 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology32, locale34, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime37 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property40 = localDateTime37.hourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = property40.getField();
        int int42 = property40.get();
        org.joda.time.LocalDateTime localDateTime43 = property40.roundHalfFloorCopy();
        long long45 = chronology32.set((org.joda.time.ReadablePartial) localDateTime43, (long) 2022);
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now(chronology32);
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime(chronology32);
        org.joda.time.DurationField durationField48 = chronology32.eras();
        org.joda.time.DateTimeField dateTimeField49 = chronology32.weekyear();
        org.joda.time.Chronology chronology50 = chronology32.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((java.lang.Object) durationField4, periodType27, chronology32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.field.UnsupportedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eras" + "'", str5, "eras");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(periodType24);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTimeField41);
// flaky:         org.junit.Assert.assertTrue("'" + int42 + "' != '" + 14 + "'", int42 == 14);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1645455600000L + "'", long45 == 1645455600000L);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(durationField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(chronology50);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        boolean boolean3 = dateTime1.isEqualNow();
        int int4 = dateTime1.getDayOfYear();
        org.joda.time.Chronology chronology5 = dateTime1.getChronology();
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(chronology5);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getSecondOfMinute();
        boolean boolean12 = dateTime10.isEqualNow();
        int int13 = dateTime10.getDayOfYear();
        org.joda.time.Chronology chronology14 = dateTime10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology14);
        int int16 = mutablePeriod15.getDays();
        org.joda.time.DateTime dateTime18 = dateTime6.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod15, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime6.withDate(9722, 5, 2023);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2023 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 7 + "'", int2 == 7);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 7 + "'", int11 == 7);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.monthOfYear();
        java.lang.String str10 = dateTimeField8.getAsShortText((long) (short) 1);
        org.joda.time.Chronology chronology14 = null;
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.util.Locale locale16 = java.util.Locale.CANADA;
        java.lang.String str17 = locale15.getDisplayVariant(locale16);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology14, locale16, (java.lang.Integer) 10);
        long long22 = dateTimeParserBucket19.computeMillis(true, "");
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField29 = localDateTime27.getField((int) (byte) 0);
        dateTimeParserBucket19.saveField(dateTimeField29, (int) (short) 10);
        java.lang.Object obj32 = dateTimeParserBucket19.saveState();
        java.util.Locale locale33 = dateTimeParserBucket19.getLocale();
        // The following exception was thrown during execution in test generation
        try {
            long long34 = dateTimeField8.set((long) 39236, "10:54:05.854", locale33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"10:54:05.854\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Jan" + "'", str10, "Jan");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + (-1L) + "'", long22 == (-1L));
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(obj32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_CA");
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        mutableDateTime1.addMonths(41);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime1.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setTime(642, (-292275054), 894, 55);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 642 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969 + "'", int20 == 1969);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        long long8 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime3);
        int int9 = property1.getMaximumValue();
        java.util.Locale locale10 = null;
        java.lang.String str11 = property1.getAsText(locale10);
        int int12 = property1.getLeapAmount();
        org.joda.time.LocalDateTime localDateTime14 = property1.addWrapFieldToCopy(46);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withDate(958, 1, 958);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 958 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 8 + "'", int4 == 8);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "February" + "'", str11, "February");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 100, 1L, periodType10);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, 1L, periodType14);
        org.joda.time.Period period16 = period11.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.Instant instant19 = instant17.withMillis(0L);
        org.joda.time.Duration duration20 = period15.toDurationTo((org.joda.time.ReadableInstant) instant19);
        mutableDateTime7.add((org.joda.time.ReadableDuration) duration20, 39);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime7.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime7.setZone(dateTimeZone24);
        int int26 = mutableDateTime7.getYearOfEra();
        int int27 = mutableDateTime7.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime7.year();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfEven();
        org.joda.time.DateTime dateTime30 = localTime5.toDateTime((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.LocalTime localTime32 = localTime5.plusSeconds(958);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.hourOfDay();
        org.joda.time.LocalDateTime localDateTime38 = localDateTime33.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str40 = dateTimeFieldType39.getName();
        int int41 = localDateTime33.indexOf(dateTimeFieldType39);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime33.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime33.minusSeconds((int) '#');
        org.joda.time.LocalDateTime localDateTime46 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime48 = localDateTime46.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property49 = localDateTime46.hourOfDay();
        org.joda.time.LocalDateTime localDateTime51 = localDateTime46.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType52 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str53 = dateTimeFieldType52.getName();
        int int54 = localDateTime46.indexOf(dateTimeFieldType52);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime46.minusSeconds(0);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 1, chronology58);
        org.joda.time.Instant instant60 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType61 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime59, (org.joda.time.ReadableInstant) instant60, periodType61);
        org.joda.time.Period period63 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime33, (org.joda.time.ReadablePartial) localDateTime56, periodType61);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((java.lang.Object) 958, periodType61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1969 + "'", int26 == 1969);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 59 + "'", int27 == 59);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "clockhourOfDay" + "'", str40, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(dateTimeFieldType52);
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "clockhourOfDay" + "'", str53, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + (-1) + "'", int54 == (-1));
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(periodType61);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        boolean boolean19 = mutableDateTime1.isBeforeNow();
        int int20 = mutableDateTime1.getSecondOfDay();
        mutableDateTime1.addHours((int) (byte) 1);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 86396 + "'", int20 == 86396);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 1, chronology3);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) instant5, periodType6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.minusMonths((int) ' ');
        org.joda.time.Chronology chronology11 = localDate8.getChronology();
        org.joda.time.Period period12 = new org.joda.time.Period((long) (byte) 1, periodType6, chronology11);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths((int) ' ');
        org.joda.time.Chronology chronology16 = localDate13.getChronology();
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate19 = localDate13.withFieldAdded(durationFieldType17, (int) (byte) 100);
        boolean boolean20 = periodType6.isSupported(durationFieldType17);
        org.joda.time.PeriodType periodType21 = periodType6.withDaysRemoved();
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property23 = localDate22.dayOfMonth();
        org.joda.time.Chronology chronology24 = localDate22.getChronology();
        org.joda.time.Period period25 = new org.joda.time.Period((long) 43, periodType6, chronology24);
        int int26 = period25.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period28 = period25.minusWeeks(1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(periodType21);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis((int) (byte) 0);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("2022-02-21");
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis(0L);
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.eras();
        java.util.Locale locale9 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology7, locale9, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.hourOfDay();
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        int int17 = property15.get();
        org.joda.time.LocalDateTime localDateTime18 = property15.roundHalfFloorCopy();
        long long20 = chronology7.set((org.joda.time.ReadablePartial) localDateTime18, (long) 2022);
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now(chronology7);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DurationField durationField23 = chronology7.eras();
        java.util.Locale locale27 = new java.util.Locale("hi!", "clockhourOfDay", "java.io.IOException");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket28 = new org.joda.time.format.DateTimeParserBucket((long) 42, chronology7, locale27);
        java.lang.String str29 = timeZone1.getDisplayName(locale27);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 14 + "'", int17 == 14);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 1645455600000L + "'", long20 == 1645455600000L);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertEquals(locale27.toString(), "hi!_CLOCKHOUROFDAY_java.io.IOException");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Greenwich Mean Time" + "'", str29, "Greenwich Mean Time");
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'United States' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 3, true);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setTime(39236, 2, 52, (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39236 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3L + "'", long5 == 3L);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("hourOfHalfday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: hourOfHalfday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        org.joda.time.Chronology chronology5 = null;
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = locale6.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology5, locale6, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone11 = dateTimeParserBucket10.getZone();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(dateTimeZone11);
        org.joda.time.DateTime dateTime13 = localTime12.toDateTimeToday();
        org.joda.time.LocalTime.Property property14 = localTime12.secondOfMinute();
        org.joda.time.LocalTime localTime16 = property14.addNoWrapToCopy(46);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = localDateTime2.isAfter((org.joda.time.ReadablePartial) localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("en-CA", (double) 365);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=365.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("months", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration4 = new org.joda.time.Duration((java.lang.Object) localDate3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        java.util.Locale locale6 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale6, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        int int14 = property12.get();
        org.joda.time.LocalDateTime localDateTime15 = property12.roundHalfFloorCopy();
        long long17 = chronology4.set((org.joda.time.ReadablePartial) localDateTime15, (long) 2022);
        org.joda.time.DateTimeField dateTimeField18 = chronology4.weekOfWeekyear();
        int int19 = dateTimeField18.getMaximumValue();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField27 = localDateTime25.getField((int) (byte) 0);
        java.util.Locale locale29 = java.util.Locale.CANADA;
        java.lang.String str30 = dateTimeField27.getAsShortText((long) (byte) 1, locale29);
        java.lang.String str31 = dateTimeField18.getAsText((int) (byte) -1, locale29);
        java.lang.String str32 = dateTimeField18.toString();
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 14 + "'", int14 == 14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1645455600000L + "'", long17 == 1645455600000L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "1970" + "'", str30, "1970");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "-1" + "'", str31, "-1");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "DateTimeField[weekOfWeekyear]" + "'", str32, "DateTimeField[weekOfWeekyear]");
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) 100, 1L, periodType7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.Period period13 = period8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.Instant instant16 = instant14.withMillis(0L);
        org.joda.time.Duration duration17 = period12.toDurationTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime4.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMillisOfDay(1);
        int int21 = localDateTime18.getDayOfYear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.Instant instant9 = instant7.withMillis(0L);
        org.joda.time.Chronology chronology10 = instant9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        java.util.Locale locale12 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology10, locale12, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) 53, chronology10);
        org.joda.time.DateTimeField dateTimeField16 = chronology10.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(47, 893, 39243612, 1970, (int) (short) 100, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        int int3 = dateTime1.getYearOfEra();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 10, 100, (int) 'a', 21);
        java.lang.String str9 = mutablePeriod8.toString();
        org.joda.time.DateTime dateTime10 = dateTime1.plus((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.Period period21 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Duration duration25 = period20.toDurationTo((org.joda.time.ReadableInstant) instant24);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration25, 39);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime12.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime12.setZone(dateTimeZone29);
        int int31 = mutableDateTime12.getYearOfEra();
        int int32 = mutableDateTime12.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property33 = mutableDateTime12.year();
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate36 = localDate34.minusMonths((int) ' ');
        org.joda.time.Chronology chronology37 = localDate34.getChronology();
        mutableDateTime12.setChronology(chronology37);
        boolean boolean39 = dateTime1.isBefore((org.joda.time.ReadableInstant) mutableDateTime12);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (short) 1, chronology41);
        org.joda.time.Instant instant43 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType44 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime42, (org.joda.time.ReadableInstant) instant43, periodType44);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int47 = instant43.get(dateTimeFieldType46);
        java.lang.String str48 = dateTimeFieldType46.getName();
        java.lang.String str49 = dateTimeFieldType46.toString();
        boolean boolean50 = dateTime1.isSupported(dateTimeFieldType46);
        org.joda.time.Instant instant52 = new org.joda.time.Instant();
        org.joda.time.Instant instant54 = instant52.withMillis(0L);
        org.joda.time.Chronology chronology55 = instant54.getChronology();
        org.joda.time.DurationField durationField56 = chronology55.eras();
        org.joda.time.DateTimeField dateTimeField57 = chronology55.yearOfEra();
        org.joda.time.Period period58 = new org.joda.time.Period((long) ' ', chronology55);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period59 = new org.joda.time.Period((java.lang.Object) dateTimeFieldType46, chronology55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT10H100M97.021S" + "'", str9, "PT10H100M97.021S");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 1969 + "'", int31 == 1969);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 59 + "'", int32 == 59);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(periodType44);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
// flaky:         org.junit.Assert.assertTrue("'" + int47 + "' != '" + 894 + "'", int47 == 894);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "minuteOfDay" + "'", str48, "minuteOfDay");
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "minuteOfDay" + "'", str49, "minuteOfDay");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
        org.junit.Assert.assertNotNull(instant54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(durationField56);
        org.junit.Assert.assertNotNull(dateTimeField57);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        int int9 = period3.getHours();
        org.joda.time.Period period10 = period3.toPeriod();
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.Instant instant15 = instant13.withMillis(0L);
        org.joda.time.Chronology chronology16 = instant15.getChronology();
        org.joda.time.DurationField durationField17 = chronology16.eras();
        java.util.Locale locale18 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket20 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology16, locale18, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate((long) 53, chronology16);
        org.joda.time.DateTimeField dateTimeField22 = chronology16.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((java.lang.Object) period10, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeField22);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("United States", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=unitedstates");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 1, chronology3);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) instant5, periodType6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int9 = instant5.get(dateTimeFieldType8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withField(dateTimeFieldType8, 39);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusSeconds(52);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDateTime11.getValue(2023);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2023");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 894 + "'", int9 == 894);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 1, chronology5);
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime6, (org.joda.time.ReadableInstant) instant7, periodType8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate12 = localDate10.minusMonths((int) ' ');
        org.joda.time.Chronology chronology13 = localDate10.getChronology();
        org.joda.time.Period period14 = new org.joda.time.Period((long) (byte) 1, periodType8, chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(958, 43, 38, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 43 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        java.util.Locale locale6 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale6, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths((int) ' ');
        org.joda.time.Chronology chronology12 = localDate9.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.minuteOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = dateTimeField13.getType();
        org.joda.time.Chronology chronology17 = null;
        java.util.Locale locale18 = java.util.Locale.GERMAN;
        java.util.Locale locale19 = java.util.Locale.CANADA;
        java.lang.String str20 = locale18.getDisplayVariant(locale19);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology17, locale19, (java.lang.Integer) 10);
        dateTimeParserBucket8.saveField(dateTimeFieldType14, "PT0.099S", locale19);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.yearOfCentury();
        dateTimeParserBucket8.saveField(dateTimeFieldType24, 43);
        dateTimeParserBucket8.setPivotYear((java.lang.Integer) 50);
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "de");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str20 = dateTimeFieldType19.getName();
        int int21 = localDateTime13.indexOf(dateTimeFieldType19);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime13.minusSeconds(0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (short) 1, chronology25);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) instant27, periodType28);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime0, (org.joda.time.ReadablePartial) localDateTime23, periodType28);
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.PeriodType periodType33 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod(readableInstant31, readableInstant32, periodType33);
        mutablePeriod34.setYears((int) '#');
        org.joda.time.Chronology chronology38 = null;
        mutablePeriod34.add((long) 1, chronology38);
        java.lang.Object obj40 = mutablePeriod34.clone();
        org.joda.time.LocalDateTime localDateTime42 = localDateTime0.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod34, 57);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property44 = localDate43.dayOfMonth();
        org.joda.time.Chronology chronology45 = localDate43.getChronology();
        org.joda.time.LocalDate.Property property46 = localDate43.dayOfWeek();
        org.joda.time.LocalDate localDate48 = localDate43.plusWeeks(56);
        org.joda.time.LocalDate localDate50 = localDate43.plusMonths(41);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean51 = localDateTime42.isAfter((org.joda.time.ReadablePartial) localDate50);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "clockhourOfDay" + "'", str20, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(periodType33);
        org.junit.Assert.assertNotNull(obj40);
        org.junit.Assert.assertEquals(obj40.toString(), "P35YT0.001S");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj40), "P35YT0.001S");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj40), "P35YT0.001S");
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDate48);
        org.junit.Assert.assertNotNull(localDate50);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant3, periodType4);
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant10 = instant8.withMillis(0L);
        org.joda.time.Chronology chronology11 = instant10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        java.util.Locale locale13 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology11, locale13, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        int int21 = property19.get();
        org.joda.time.LocalDateTime localDateTime22 = property19.roundHalfFloorCopy();
        long long24 = chronology11.set((org.joda.time.ReadablePartial) localDateTime22, (long) 2022);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(chronology11);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DurationField durationField27 = chronology11.eras();
        java.util.Locale locale31 = new java.util.Locale("hi!", "clockhourOfDay", "java.io.IOException");
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) 42, chronology11, locale31);
        org.joda.time.DateTimeZone dateTimeZone33 = dateTimeParserBucket32.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((java.lang.Object) mutablePeriod5, dateTimeZone33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1645455600000L + "'", long24 == 1645455600000L);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertEquals(locale31.toString(), "hi!_CLOCKHOUROFDAY_java.io.IOException");
        org.junit.Assert.assertNotNull(dateTimeZone33);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = locale2.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket6.getZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localTime8.toDateTimeToday();
        org.joda.time.LocalTime.Property property10 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property10.addNoWrapToCopy(46);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.hourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = property16.getField();
        boolean boolean18 = property16.isLeap();
        boolean boolean19 = property16.isLeap();
        org.joda.time.LocalDateTime localDateTime20 = property16.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean21 = localTime12.isEqual((org.joda.time.ReadablePartial) localDateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDate0.get(dateTimeFieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.year();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfMonth();
        org.joda.time.DurationField durationField11 = chronology7.halfdays();
        long long14 = durationField11.getMillis(0L, (long) 6);
        long long17 = durationField11.add((long) 4, (long) 21);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 11 + "'", int4 == 11);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 907200004L + "'", long17 == 907200004L);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 100, 1L, periodType10);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, 1L, periodType14);
        org.joda.time.Period period16 = period11.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.Instant instant19 = instant17.withMillis(0L);
        org.joda.time.Duration duration20 = period15.toDurationTo((org.joda.time.ReadableInstant) instant19);
        mutableDateTime7.add((org.joda.time.ReadableDuration) duration20, 39);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime7.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime7.setZone(dateTimeZone24);
        int int26 = mutableDateTime7.getYearOfEra();
        int int27 = mutableDateTime7.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime7.year();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfEven();
        org.joda.time.DateTime dateTime30 = localTime5.toDateTime((org.joda.time.ReadableInstant) mutableDateTime29);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime29.setDayOfMonth((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1969 + "'", int26 == 1969);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 59 + "'", int27 == 59);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime3.withFieldAdded(durationFieldType6, 642);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("United States");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"United States\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime1.withDate(52, 56, 39251167);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 689 + "'", int2 == 689);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setRawOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone.setDefault(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone0.getDisplayName(false, 69);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 69");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration3, readableInstant4);
        org.joda.time.Period period7 = period5.withDays((int) (byte) 1);
        org.joda.time.LocalDate localDate8 = localDate2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period10 = period7.plusWeeks(31);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) 100, 1L, periodType7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.Period period13 = period8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.Instant instant16 = instant14.withMillis(0L);
        org.joda.time.Duration duration17 = period12.toDurationTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime4.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withMillisOfDay(1);
        int int21 = localDateTime20.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime20.withWeekOfWeekyear(56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 56 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        java.util.Locale locale6 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale6, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        int int14 = property12.get();
        org.joda.time.LocalDateTime localDateTime15 = property12.roundHalfFloorCopy();
        long long17 = chronology4.set((org.joda.time.ReadablePartial) localDateTime15, (long) 2022);
        org.joda.time.DateTimeField dateTimeField18 = chronology4.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField19 = chronology4.minuteOfHour();
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 1L, periodType22);
        org.joda.time.Period period25 = period23.minusSeconds((-1));
        java.lang.String str26 = period23.toString();
        org.joda.time.Period period27 = period23.negated();
        int[] intArray29 = chronology4.get((org.joda.time.ReadablePeriod) period27, (long) 1969);
        org.joda.time.DateTimeField dateTimeField30 = chronology4.halfdayOfDay();
        org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property32 = localDate31.dayOfMonth();
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.lang.String str34 = locale33.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = dateTimeField30.getAsText((org.joda.time.ReadablePartial) localDate31, locale33);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdayOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 14 + "'", int14 == 14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1645455600000L + "'", long17 == 1645455600000L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(period25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "PT0.099S" + "'", str26, "PT0.099S");
        org.junit.Assert.assertNotNull(period27);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[0, 0, 0, 0, 0, 0, 1, 969]");
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "German" + "'", str34, "German");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 1, chronology3);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) instant5, periodType6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int9 = instant5.get(dateTimeFieldType8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withField(dateTimeFieldType8, 39);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusSeconds(52);
        int int14 = localDateTime13.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.minusHours(47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withDayOfMonth(53600069);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53600069 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 894 + "'", int9 == 894);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(localDateTime16);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusSeconds((int) (byte) 10);
        org.joda.time.LocalTime.Property property6 = localTime3.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property6.setCopy("10:54:10.761");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"10:54:10.761\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        boolean boolean3 = dateTime1.isEqualNow();
        int int4 = dateTime1.getDayOfYear();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime1.withMinuteOfHour((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 12 + "'", int2 == 12);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 1, chronology3);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) instant5, periodType6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int9 = instant5.get(dateTimeFieldType8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withField(dateTimeFieldType8, 39);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusSeconds(52);
        int int14 = localDateTime11.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property15 = localDateTime11.year();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 894 + "'", int9 == 894);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime9 = localTime7.plusMillis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.eras();
        boolean boolean11 = localTime7.isSupported(durationFieldType10);
        boolean boolean12 = mutablePeriod3.isSupported(durationFieldType10);
        org.joda.time.ReadableInstant readableInstant13 = null;
        org.joda.time.ReadableInstant readableInstant14 = null;
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod(readableInstant13, readableInstant14, periodType15);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime(dateTimeZone17);
        org.joda.time.LocalTime localTime20 = localTime18.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime22 = localTime20.plusMillis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.eras();
        boolean boolean24 = localTime20.isSupported(durationFieldType23);
        boolean boolean25 = mutablePeriod16.isSupported(durationFieldType23);
        mutablePeriod3.add((org.joda.time.ReadablePeriod) mutablePeriod16);
        mutablePeriod16.setPeriod((long) 39239, (long) 49);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime dateTime3 = dateTime1.withCenturyOfEra(39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime1.withTime(894, 86396191, 57, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 894 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfHour(894);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 894 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969 + "'", int20 == 1969);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.lang.Throwable throwable0 = null;
        java.io.IOException iOException1 = new java.io.IOException(throwable0);
        java.io.IOException iOException2 = new java.io.IOException();
        iOException1.addSuppressed((java.lang.Throwable) iOException2);
        java.lang.String str4 = iOException2.toString();
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "java.io.IOException" + "'", str4, "java.io.IOException");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate6 = localDate0.withFieldAdded(durationFieldType4, (int) (byte) 100);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfWeek();
        org.joda.time.LocalDate.Property property8 = localDate0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate0.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        java.lang.String str5 = durationField4.getName();
        boolean boolean6 = durationField4.isSupported();
        boolean boolean7 = durationField4.isPrecise();
        // The following exception was thrown during execution in test generation
        try {
            long long10 = durationField4.getDifferenceAsLong((long) 39251693, (long) 642);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "eras" + "'", str5, "eras");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        long long8 = dateTimeZone5.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(0, 958, 47, 21, 0, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 958 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 100L + "'", long8 == 100L);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone timeZone2 = dateTimeZone1.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone2.getDisplayName(false, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 5");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        boolean boolean5 = property3.isLeap();
        java.util.Locale locale6 = java.util.Locale.GERMAN;
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.getCountry();
        java.lang.String str10 = property3.getAsShortText(locale7);
        org.joda.time.LocalDateTime localDateTime12 = property3.addWrapFieldToCopy((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withEra(45);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "de");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "CA" + "'", str9, "CA");
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "14" + "'", str10, "14");
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.era();
        java.lang.String str5 = localDate0.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate0.withDayOfWeek(45);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 45 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-21" + "'", str5, "2022-02-21");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.TimeZone.setDefault(timeZone0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = timeZone0.getOffset(69, 365, 39236, (int) (short) 1, 58, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime1.toMutableDateTime(dateTimeZone18);
        org.joda.time.Chronology chronology22 = null;
        java.util.Locale locale23 = java.util.Locale.GERMAN;
        java.util.Locale locale24 = java.util.Locale.CANADA;
        java.lang.String str25 = locale23.getDisplayVariant(locale24);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket27 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology22, locale24, (java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = mutableDateTime1.toString("2022-02-21T14:53:38.450Z", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "de");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("eras", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.DateMidnight dateMidnight4 = localDate0.toDateMidnight();
        int int5 = dateMidnight4.getDayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight4.toMutableDateTime();
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.DateTime.Property property2 = dateTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.DateTime dateTime4 = property2.withMinimumValue();
        org.joda.time.Interval interval5 = property2.toInterval();
        org.joda.time.DateTime dateTime7 = property2.addToCopy((long) 40);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("PT86403.686S", (double) 50);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=50.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.plusMonths(43);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(12);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate7 = localDate5.minusMonths((int) ' ');
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.ReadableInstant readableInstant9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period(readableDuration8, readableInstant9);
        org.joda.time.Period period12 = period10.withDays((int) (byte) 1);
        org.joda.time.LocalDate localDate13 = localDate7.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths((-292275054));
        org.joda.time.LocalDate localDate17 = localDate13.minusYears(21);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType19 = periodType18.withMonthsRemoved();
        org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate4, (org.joda.time.ReadablePartial) localDate17, periodType18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object) localDate17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate9 = localDate7.minusMonths((int) ' ');
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate13 = localDate7.withFieldAdded(durationFieldType11, (int) (byte) 100);
        org.joda.time.LocalDate.Property property14 = localDate7.dayOfWeek();
        org.joda.time.LocalDate localDate16 = property14.addWrapFieldToCopy(3);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getSecondOfMinute();
        boolean boolean22 = dateTime20.isEqualNow();
        int int23 = dateTime20.getDayOfYear();
        org.joda.time.Chronology chronology24 = dateTime20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology24);
        org.joda.time.DateTimeField dateTimeField26 = chronology24.year();
        org.joda.time.DateTimeZone dateTimeZone27 = chronology24.getZone();
        org.joda.time.DateTime dateTime28 = localDate16.toDateTimeAtCurrentTime(dateTimeZone27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(51, (int) ' ', 1970, 58, 6, (int) ' ', 893, dateTimeZone27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 58 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 15 + "'", int21 == 15);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        boolean boolean6 = property3.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getSecondOfMinute();
        int int10 = dateTime8.getYearOfEra();
        int int11 = property3.getDifference((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.LocalDateTime localDateTime12 = property3.roundHalfFloorCopy();
        java.lang.String str13 = property3.getAsShortText();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "14" + "'", str13, "14");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardSeconds(10L);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 100, 1L, periodType10);
        org.joda.time.Period period12 = period7.plus((org.joda.time.ReadablePeriod) period11);
        org.joda.time.Instant instant13 = new org.joda.time.Instant();
        org.joda.time.Instant instant15 = instant13.withMillis(0L);
        org.joda.time.Duration duration16 = period11.toDurationTo((org.joda.time.ReadableInstant) instant15);
        mutableDateTime3.add((org.joda.time.ReadableDuration) duration16, 39);
        boolean boolean19 = duration1.isLongerThan((org.joda.time.ReadableDuration) duration16);
        org.joda.time.Days days20 = duration1.toStandardDays();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(days20);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime localTime7 = localTime3.plusSeconds(40);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localTime3.getValue(457070);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 457070");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusDays(0);
        org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.millis();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 46, periodType17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime15.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod18, 39221019);
        // The following exception was thrown during execution in test generation
        try {
            int int22 = localDateTime15.getValue(39243612);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 39243612");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(periodType17);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate6 = localDate0.withFieldAdded(durationFieldType4, (int) (byte) 100);
        org.joda.time.LocalDate.Property property7 = localDate0.dayOfWeek();
        org.joda.time.LocalDate localDate9 = property7.addWrapFieldToCopy(3);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getSecondOfMinute();
        boolean boolean15 = dateTime13.isEqualNow();
        int int16 = dateTime13.getDayOfYear();
        org.joda.time.Chronology chronology17 = dateTime13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology17);
        org.joda.time.DateTimeField dateTimeField19 = chronology17.year();
        org.joda.time.DateTimeZone dateTimeZone20 = chronology17.getZone();
        org.joda.time.DateTime dateTime21 = localDate9.toDateTimeAtCurrentTime(dateTimeZone20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration22 = new org.joda.time.Duration((java.lang.Object) dateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 15 + "'", int14 == 15);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setRawOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        timeZone0.setRawOffset(43);
        boolean boolean8 = timeZone0.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) 100, 1L, periodType7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.Period period13 = period8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.Instant instant16 = instant14.withMillis(0L);
        org.joda.time.Duration duration17 = period12.toDurationTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime4.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusYears(6);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        mutablePeriod24.setYears((int) '#');
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod24.add((long) 1, chronology28);
        mutablePeriod24.addDays((int) 'a');
        org.joda.time.LocalDateTime localDateTime32 = localDateTime18.minus((org.joda.time.ReadablePeriod) mutablePeriod24);
        int int33 = localDateTime18.size();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 4 + "'", int33 == 4);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property16 = localDateTime13.hourOfDay();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime13.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str20 = dateTimeFieldType19.getName();
        int int21 = localDateTime13.indexOf(dateTimeFieldType19);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime13.minusSeconds(0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((long) (short) 1, chronology25);
        org.joda.time.Instant instant27 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType28 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime26, (org.joda.time.ReadableInstant) instant27, periodType28);
        org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime0, (org.joda.time.ReadablePartial) localDateTime23, periodType28);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
        long long34 = dateTimeZone31.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime35 = new org.joda.time.LocalDateTime(dateTimeZone31);
        org.joda.time.DateTime dateTime36 = localDateTime0.toDateTime(dateTimeZone31);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate39 = localDate37.plusMonths(43);
        org.joda.time.LocalDate localDate41 = localDate37.withYearOfEra(44);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean42 = localDateTime0.isAfter((org.joda.time.ReadablePartial) localDate41);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "clockhourOfDay" + "'", str20, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(periodType28);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 100L + "'", long34 == 100L);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(localDate41);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("minuteOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'minuteOfDay' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long6 = durationField4.getMillis(41);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime localTime7 = localTime3.plusSeconds(40);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = null;
        java.lang.String str9 = localTime3.toString(dateTimeFormatter8);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.Period period21 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Duration duration25 = period20.toDurationTo((org.joda.time.ReadableInstant) instant24);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration25, 39);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime12.secondOfMinute();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime12.minuteOfHour();
        java.lang.String str30 = property29.getAsShortText();
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = locale31.stripExtensions();
        int int33 = property29.getMaximumTextLength(locale32);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField40 = localDateTime38.getField((int) (byte) 0);
        java.util.Locale locale42 = java.util.Locale.CANADA;
        java.lang.String str43 = dateTimeField40.getAsShortText((long) (byte) 1, locale42);
        java.lang.String str44 = locale32.getDisplayName(locale42);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = localTime3.toString("hourOfHalfday", locale42);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "10:54:16.889" + "'", str9, "10:54:16.889");
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "59" + "'", str30, "59");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "de");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "1970" + "'", str43, "1970");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "German" + "'", str44, "German");
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(86396, 100, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime21.setDate(50, 39236, 58);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39236 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.Period period5 = period3.minusSeconds((-1));
        java.lang.String str6 = period3.toString();
        org.joda.time.Period period7 = period3.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        int int9 = period7.size();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0.099S" + "'", str6, "PT0.099S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 8 + "'", int9 == 8);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis((int) (byte) 0);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.millis();
        boolean boolean13 = localDateTime4.isSupported(durationFieldType12);
        org.joda.time.LocalDateTime.Property property14 = localDateTime4.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime4.withDate(52, 48, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology5);
        org.joda.time.DurationField durationField8 = chronology5.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = durationField8.getDifferenceAsLong((long) 894, (long) 958);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period10 = period7.plusDays(53600069);
        org.joda.time.Period period12 = period10.plusMonths(39239);
        org.joda.time.Period period14 = period12.minusSeconds((-1));
        int int15 = period14.getSeconds();
        org.joda.time.Period period16 = period14.toPeriod();
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = dateTime1.withEra(22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDate1.getValue(642);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 642");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getSecondOfMinute();
        boolean boolean6 = dateTime4.isEqualNow();
        int int7 = dateTime4.getDayOfYear();
        org.joda.time.Chronology chronology8 = dateTime4.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.year();
        org.joda.time.Period period11 = new org.joda.time.Period(1L, chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType13 = period11.getFieldType(59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: null");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 17 + "'", int5 == 17);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(893, 457070);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 893 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        java.util.Locale locale8 = java.util.Locale.SIMPLIFIED_CHINESE;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket(315532800097L, chronology7, locale8);
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType0.getField(chronology7);
        long long13 = dateTimeField10.getDifferenceAsLong((long) (byte) 10, (long) 25);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 18 + "'", int4 == 18);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13 == 0L);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        int int21 = mutableDateTime1.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime1.year();
        mutableDateTime1.setSecondOfDay(50);
        org.joda.time.Chronology chronology25 = mutableDateTime1.getChronology();
        org.joda.time.PeriodType periodType28 = null;
        org.joda.time.Period period29 = new org.joda.time.Period((long) 100, 1L, periodType28);
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 100, 1L, periodType32);
        org.joda.time.Period period34 = period29.plus((org.joda.time.ReadablePeriod) period33);
        org.joda.time.Period period36 = period33.plusDays(53600069);
        org.joda.time.Period period38 = period36.plusMonths(39239);
        org.joda.time.Period period40 = period38.minusSeconds((-1));
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.add((org.joda.time.ReadablePeriod) period40, 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 203281548393650191 + 9123160544352000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969 + "'", int20 == 1969);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(period40);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusDays(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withDayOfMonth(44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 44 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 3, true);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setDayOfWeek(86396);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86396 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3L + "'", long5 == 3L);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration3, (int) (short) 100);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getYearOfCentury();
        org.joda.time.Interval interval9 = duration3.toIntervalTo((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long) (byte) -1);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime7, (org.joda.time.ReadableInstant) mutableDateTime11);
        mutableDateTime11.addDays(2);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property16 = localDate15.dayOfMonth();
        org.joda.time.Chronology chronology17 = localDate15.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) 2, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 22 + "'", int8 == 22);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.Instant instant7 = new org.joda.time.Instant();
        org.joda.time.Instant instant9 = instant7.withMillis(0L);
        org.joda.time.Chronology chronology10 = instant9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.eras();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.yearOfEra();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(39221019, 894, 39251693, 4, (int) (short) 0, 2022, (int) (byte) 10, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.era();
        org.joda.time.LocalDate localDate5 = property4.roundCeilingCopy();
        org.joda.time.LocalDate.Property property6 = localDate5.weekyear();
        org.joda.time.LocalDate localDate8 = localDate5.plusMonths(44);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property10 = localDate9.dayOfMonth();
        org.joda.time.Chronology chronology11 = localDate9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) localDate8, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property3.addWrapFieldToCopy(46);
        java.lang.String str6 = property3.getAsString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property3.setCopy("PT-0.007S");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT-0.007S\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "14" + "'", str6, "14");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.era();
        org.joda.time.LocalDate localDate5 = property4.roundCeilingCopy();
        org.joda.time.LocalDate.Property property6 = localDate5.weekyear();
        org.joda.time.LocalDate localDate8 = property6.addWrapFieldToCopy(31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate8.minusWeeks(39251167);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: -9223371069840000000 + -23739105801600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        java.util.Locale locale6 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale6, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.hourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = property12.getField();
        int int14 = property12.get();
        org.joda.time.LocalDateTime localDateTime15 = property12.roundHalfFloorCopy();
        long long17 = chronology4.set((org.joda.time.ReadablePartial) localDateTime15, (long) 2022);
        org.joda.time.DateTimeField dateTimeField18 = chronology4.weekOfWeekyear();
        int int19 = dateTimeField18.getMaximumValue();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getSecondOfMinute();
        boolean boolean23 = dateTime21.isEqualNow();
        int int24 = dateTime21.getDayOfYear();
        org.joda.time.LocalTime localTime25 = dateTime21.toLocalTime();
        java.util.Locale locale27 = new java.util.Locale("en_US");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) localTime25, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekOfWeekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTimeField13);
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 14 + "'", int14 == 14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1645455600000L + "'", long17 == 1645455600000L);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 19 + "'", int22 == 19);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertEquals(locale27.toString(), "en_us");
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.withMillis(0L);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.util.Locale locale8 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology6, locale8, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        int int16 = property14.get();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfFloorCopy();
        long long19 = chronology6.set((org.joda.time.ReadablePartial) localDateTime17, (long) 2022);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(chronology6);
        org.joda.time.DateTime dateTime22 = dateTime1.plusDays(22);
        int int23 = dateTime1.getSecondOfMinute();
        org.joda.time.DateMidnight dateMidnight24 = dateTime1.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime1.withMonthOfYear(20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 14 + "'", int16 == 14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1645455600000L + "'", long19 == 1645455600000L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 19 + "'", int23 == 19);
        org.junit.Assert.assertNotNull(dateMidnight24);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis((int) (byte) 0);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withMillisOfSecond(12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime15.withMonthOfYear(39250977);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39250977 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 1L, periodType5);
        org.joda.time.Period period8 = period6.minusSeconds((-1));
        java.lang.String str9 = period6.toString();
        org.joda.time.Period period10 = period6.toPeriod();
        org.joda.time.PeriodType periodType11 = period6.getPeriodType();
        org.joda.time.Period period12 = period2.normalizedStandard(periodType11);
        org.joda.time.Period period14 = period12.multipliedBy((int) (short) 100);
        org.joda.time.Period period16 = period14.plusMonths(893);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = period14.getValue(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT0.099S" + "'", str9, "PT0.099S");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str14 = dateTimeFieldType13.getName();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.property(dateTimeFieldType13);
        org.joda.time.DateTimeField dateTimeField16 = property15.getField();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "dayOfMonth" + "'", str14, "dayOfMonth");
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str14 = dateTimeFieldType13.getName();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.property(dateTimeFieldType13);
        int int16 = localDateTime12.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withMillisOfDay(1);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap22);
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = java.util.Locale.CANADA;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale27);
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.util.Locale locale34 = java.util.Locale.CANADA;
        java.lang.String str35 = locale33.getDisplayVariant(locale34);
        java.lang.String str36 = locale33.getISO3Language();
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.lang.String str39 = locale37.getDisplayVariant(locale38);
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.lang.String str42 = locale41.getDisplayName();
        java.util.Locale locale43 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.util.Locale locale47 = java.util.Locale.CANADA;
        java.lang.String str48 = locale46.getDisplayVariant(locale47);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology45, locale47, (java.lang.Integer) 10);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.lang.String str52 = locale51.getDisplayName();
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale54 = java.util.Locale.UK;
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale27, locale31, locale33, locale37, locale40, locale41, locale43, locale47, locale51, locale53, locale54 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList56, filteringMode58);
        boolean boolean60 = localDateTime18.equals((java.lang.Object) languageRangeList20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime62 = localDateTime18.withMinuteOfHour(97);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "dayOfMonth" + "'", str14, "dayOfMonth");
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "deu" + "'", str36, "deu");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "German" + "'", str42, "German");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "de");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "German" + "'", str52, "German");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode58.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        int int21 = mutableDateTime1.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime1.year();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate25 = localDate23.minusMonths((int) ' ');
        org.joda.time.Chronology chronology26 = localDate23.getChronology();
        mutableDateTime1.setChronology(chronology26);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 100, 1L, periodType32);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 100, 1L, periodType36);
        org.joda.time.Period period38 = period33.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Instant instant39 = new org.joda.time.Instant();
        org.joda.time.Instant instant41 = instant39.withMillis(0L);
        org.joda.time.Duration duration42 = period37.toDurationTo((org.joda.time.ReadableInstant) instant41);
        mutableDateTime29.add((org.joda.time.ReadableDuration) duration42, 39);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime29.yearOfEra();
        mutableDateTime29.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime29.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        long long52 = dateTimeZone49.convertLocalToUTC((long) (byte) 100, false);
        mutableDateTime29.setZone(dateTimeZone49);
        mutableDateTime1.setZoneRetainFields(dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(dateTimeZone49);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime55.setMinuteOfDay(53600069);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53600069 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969 + "'", int20 == 1969);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 100L + "'", long52 == 100L);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime localTime7 = localTime3.plusSeconds(40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration8 = new org.joda.time.Duration((java.lang.Object) 40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
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
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property3.addWrapFieldToCopy(46);
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property3.setCopy("English (Canada)", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"English (Canada)\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(strSet9);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setYears((int) '#');
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod3.add((long) 1, chronology7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        mutablePeriod3.setPeriod(readableInterval9);
        int int11 = mutablePeriod3.getWeeks();
        mutablePeriod3.setMinutes(39);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.add(12022, 958, 0, 894, 55, (int) (byte) 0, 894, 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        org.joda.time.DateTimeField dateTimeField6 = chronology4.yearOfEra();
        org.joda.time.Period period7 = new org.joda.time.Period((long) ' ', chronology4);
        org.joda.time.DateTimeField dateTimeField8 = chronology4.halfdayOfDay();
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.PeriodType periodType19 = null;
        org.joda.time.Period period20 = new org.joda.time.Period((long) 100, 1L, periodType19);
        org.joda.time.Period period21 = period16.plus((org.joda.time.ReadablePeriod) period20);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Duration duration25 = period20.toDurationTo((org.joda.time.ReadableInstant) instant24);
        mutableDateTime12.add((org.joda.time.ReadableDuration) duration25, 39);
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime12.secondOfMinute();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime12.minuteOfHour();
        java.lang.String str30 = property29.getAsShortText();
        java.util.Locale locale31 = java.util.Locale.GERMAN;
        java.util.Locale locale32 = locale31.stripExtensions();
        int int33 = property29.getMaximumTextLength(locale32);
        java.lang.String str34 = locale32.getDisplayLanguage();
        java.lang.String str35 = locale32.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            long long36 = dateTimeField8.set(129383503200000L, "2022-02-21T10:54:08.756", locale32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T10:54:08.756\" for halfdayOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(period21);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(duration25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "59" + "'", str30, "59");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "de");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "de");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "German" + "'", str34, "German");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "de" + "'", str35, "de");
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.monthOfYear();
        java.lang.String str10 = dateTimeField8.getAsShortText((long) (short) 1);
        long long12 = dateTimeField8.roundHalfEven((long) 9);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Jan" + "'", str10, "Jan");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        int int3 = dateTime1.getYearOfEra();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((int) (short) 10, 100, (int) 'a', 21);
        java.lang.String str9 = mutablePeriod8.toString();
        org.joda.time.DateTime dateTime10 = dateTime1.plus((org.joda.time.ReadablePeriod) mutablePeriod8);
        org.joda.time.TimeOfDay timeOfDay11 = dateTime1.toTimeOfDay();
        org.joda.time.DateTime dateTime13 = dateTime1.minusDays(47);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime1.withYearOfCentury((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT10H100M97.021S" + "'", str9, "PT10H100M97.021S");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(timeOfDay11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.removeUnicodeLocaleAttribute("CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        java.util.Locale locale7 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology5, locale7, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 53, chronology5);
        org.joda.time.DateTimeField dateTimeField11 = chronology5.dayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = dateTimeField11.getType();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        long long17 = dateTimeZone14.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone14);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean20 = localTime18.isSupported(dateTimeFieldType19);
        int int21 = localTime18.getMinuteOfHour();
        int int22 = localTime18.size();
        int int23 = localTime18.getMinuteOfHour();
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate26 = localDate24.minusMonths((int) ' ');
        int int27 = localDate24.size();
        org.joda.time.LocalDate.Property property28 = localDate24.era();
        org.joda.time.DateTimeField dateTimeField29 = property28.getField();
        boolean boolean30 = property28.isLeap();
        org.joda.time.LocalDate localDate31 = property28.withMaximumValue();
        java.util.Locale locale35 = new java.util.Locale("clockhourOfDay", "java.io.IOException", "");
        int int36 = property28.getMaximumShortTextLength(locale35);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str37 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) localTime18, locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 100L + "'", long17 == 100L);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 4 + "'", int22 == 4);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 59 + "'", int23 == 59);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertEquals(locale35.toString(), "clockhourofday_JAVA.IO.IOEXCEPTION");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period10 = period7.plusDays(53600069);
        org.joda.time.Period period12 = period10.plusMonths(39239);
        org.joda.time.Period period14 = period12.minusSeconds((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes15 = period12.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.Instant instant5 = instant3.withMillis(0L);
        org.joda.time.Chronology chronology6 = instant5.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.eras();
        java.util.Locale locale8 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket10 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology6, locale8, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property14 = localDateTime11.hourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = property14.getField();
        int int16 = property14.get();
        org.joda.time.LocalDateTime localDateTime17 = property14.roundHalfFloorCopy();
        long long19 = chronology6.set((org.joda.time.ReadablePartial) localDateTime17, (long) 2022);
        org.joda.time.DateTime dateTime20 = dateTime1.toDateTime(chronology6);
        org.joda.time.DateTime.Property property21 = dateTime1.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = dateTime1.withSecondOfMinute((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeField15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 14 + "'", int16 == 14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1645455600000L + "'", long19 == 1645455600000L);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime1.toMutableDateTime(dateTimeZone18);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime19.secondOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime19.setSecondOfMinute(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        long long5 = durationField4.getUnitMillis();
        boolean boolean6 = durationField4.isSupported();
        boolean boolean7 = durationField4.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = durationField4.getValue((long) 7, (long) 23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.util.Locale locale1 = new java.util.Locale("PT0.099S");
        java.lang.String str2 = locale1.getDisplayCountry();
        java.lang.String str3 = locale1.getDisplayCountry();
        org.junit.Assert.assertEquals(locale1.toString(), "pt0.099s");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.PeriodType periodType5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) 100, 1L, periodType5);
        org.joda.time.Period period8 = period6.minusSeconds((-1));
        java.lang.String str9 = period6.toString();
        org.joda.time.Period period10 = period6.toPeriod();
        org.joda.time.PeriodType periodType11 = period6.getPeriodType();
        org.joda.time.Period period12 = period2.normalizedStandard(periodType11);
        org.joda.time.Period period14 = period12.multipliedBy((int) (short) 100);
        org.joda.time.Period period16 = period14.plusMonths(893);
        org.joda.time.Period period18 = period16.minusSeconds(52);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period21 = period18.withFieldAdded(durationFieldType19, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'weekyears'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "PT0.099S" + "'", str9, "PT0.099S");
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(durationFieldType19);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2022-02-21T14:53:55.782Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.MutablePeriod mutablePeriod9 = period8.toMutablePeriod();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod9.setValue(86396, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 86396");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutablePeriod9);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = new org.joda.time.Period((long) 100, 1L, periodType10);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, 1L, periodType14);
        org.joda.time.Period period16 = period11.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.Instant instant17 = new org.joda.time.Instant();
        org.joda.time.Instant instant19 = instant17.withMillis(0L);
        org.joda.time.Duration duration20 = period15.toDurationTo((org.joda.time.ReadableInstant) instant19);
        mutableDateTime7.add((org.joda.time.ReadableDuration) duration20, 39);
        org.joda.time.MutableDateTime.Property property23 = mutableDateTime7.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime7.setZone(dateTimeZone24);
        int int26 = mutableDateTime7.getYearOfEra();
        int int27 = mutableDateTime7.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property28 = mutableDateTime7.year();
        org.joda.time.MutableDateTime mutableDateTime29 = property28.roundHalfEven();
        org.joda.time.DateTime dateTime30 = localTime5.toDateTime((org.joda.time.ReadableInstant) mutableDateTime29);
        org.joda.time.LocalTime localTime32 = localTime5.plusSeconds(958);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime35 = localTime5.withField(dateTimeFieldType33, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(instant19);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1969 + "'", int26 == 1969);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 59 + "'", int27 == 59);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.PeriodType periodType7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) 100, 1L, periodType7);
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.Period period13 = period8.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.Instant instant14 = new org.joda.time.Instant();
        org.joda.time.Instant instant16 = instant14.withMillis(0L);
        org.joda.time.Duration duration17 = period12.toDurationTo((org.joda.time.ReadableInstant) instant16);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime4.plus((org.joda.time.ReadablePeriod) period12);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minusYears(6);
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.ReadableInstant readableInstant22 = null;
        org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod(readableInstant21, readableInstant22, periodType23);
        mutablePeriod24.setYears((int) '#');
        org.joda.time.Chronology chronology28 = null;
        mutablePeriod24.add((long) 1, chronology28);
        mutablePeriod24.addDays((int) 'a');
        org.joda.time.LocalDateTime localDateTime32 = localDateTime18.minus((org.joda.time.ReadablePeriod) mutablePeriod24);
        int int33 = localDateTime32.getHourOfDay();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(instant16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(periodType23);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 10 + "'", int33 == 10);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = property4.setCopy(9722);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9722 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setExtension('4', "52");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMonthOfYear((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.Period period1 = org.joda.time.Period.hours(751);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        mutableDateTime1.setDayOfYear(22);
        int int19 = mutableDateTime1.getYearOfCentury();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.eras();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.add(durationFieldType20, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 69 + "'", int19 == 69);
        org.junit.Assert.assertNotNull(durationFieldType20);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.Period period17 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        org.joda.time.Instant instant20 = instant18.withMillis(0L);
        org.joda.time.Duration duration21 = period16.toDurationTo((org.joda.time.ReadableInstant) instant20);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration21, 39);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime8.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime8.setZone(dateTimeZone25);
        int int27 = mutableDateTime8.getYearOfEra();
        int int28 = mutableDateTime8.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property29 = mutableDateTime8.year();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate32 = localDate30.minusMonths((int) ' ');
        org.joda.time.Chronology chronology33 = localDate30.getChronology();
        mutableDateTime8.setChronology(chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType39 = null;
        org.joda.time.Period period40 = new org.joda.time.Period((long) 100, 1L, periodType39);
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) 100, 1L, periodType43);
        org.joda.time.Period period45 = period40.plus((org.joda.time.ReadablePeriod) period44);
        org.joda.time.Instant instant46 = new org.joda.time.Instant();
        org.joda.time.Instant instant48 = instant46.withMillis(0L);
        org.joda.time.Duration duration49 = period44.toDurationTo((org.joda.time.ReadableInstant) instant48);
        mutableDateTime36.add((org.joda.time.ReadableDuration) duration49, 39);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime36.yearOfEra();
        mutableDateTime36.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property55 = mutableDateTime36.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone56 = org.joda.time.DateTimeZone.UTC;
        long long59 = dateTimeZone56.convertLocalToUTC((long) (byte) 100, false);
        mutableDateTime36.setZone(dateTimeZone56);
        mutableDateTime8.setZoneRetainFields(dateTimeZone56);
        org.joda.time.MutableDateTime mutableDateTime62 = new org.joda.time.MutableDateTime(dateTimeZone56);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime63 = new org.joda.time.DateTime(12022, 39221019, (int) (short) 0, 54, 38, 0, 12, dateTimeZone56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1969 + "'", int27 == 1969);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 59 + "'", int28 == 59);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(instant48);
        org.junit.Assert.assertNotNull(duration49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(dateTimeZone56);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 100L + "'", long59 == 100L);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        mutableDateTime1.addMonths(41);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime1.toMutableDateTimeISO();
        mutableDateTime1.setMinuteOfDay(47);
        mutableDateTime1.setWeekOfWeekyear(1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMonthOfYear(958);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 958 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969 + "'", int20 == 1969);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) ' ');
        org.joda.time.Chronology chronology6 = localDate3.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.minuteOfDay();
        org.joda.time.DurationField durationField8 = chronology6.days();
        org.joda.time.DurationField durationField9 = chronology6.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(39239, 21, 39221019, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType1 = periodType0.withSecondsRemoved();
        org.joda.time.DurationFieldType durationFieldType3 = periodType0.getFieldType((int) (byte) 1);
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, 1L, periodType12);
        org.joda.time.Period period14 = period9.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.withMillis(0L);
        org.joda.time.Duration duration18 = period13.toDurationTo((org.joda.time.ReadableInstant) instant17);
        mutableDateTime5.add((org.joda.time.ReadableDuration) duration18, 39);
        org.joda.time.MutableDateTime.Property property21 = mutableDateTime5.yearOfEra();
        mutableDateTime5.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime5.minuteOfDay();
        org.joda.time.DurationField durationField25 = property24.getRangeDurationField();
        org.joda.time.DurationFieldType durationFieldType26 = durationField25.getType();
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate29 = localDate27.minusMonths((int) ' ');
        org.joda.time.Chronology chronology30 = localDate27.getChronology();
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate33 = localDate27.withFieldAdded(durationFieldType31, (int) (byte) 100);
        org.joda.time.LocalDate localDate35 = localDate33.minusMonths(55);
        org.joda.time.PeriodType periodType38 = null;
        org.joda.time.Period period39 = new org.joda.time.Period((long) 100, 1L, periodType38);
        org.joda.time.Period period41 = period39.minusSeconds((-1));
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period44 = duration43.toPeriod();
        org.joda.time.DurationFieldType durationFieldType45 = org.joda.time.DurationFieldType.centuries();
        int int46 = period44.get(durationFieldType45);
        boolean boolean47 = period39.isSupported(durationFieldType45);
        boolean boolean48 = localDate33.isSupported(durationFieldType45);
        org.joda.time.ReadableDuration readableDuration49 = null;
        org.joda.time.ReadableInstant readableInstant50 = null;
        org.joda.time.Period period51 = new org.joda.time.Period(readableDuration49, readableInstant50);
        org.joda.time.PeriodType periodType54 = null;
        org.joda.time.Period period55 = new org.joda.time.Period((long) 100, 1L, periodType54);
        org.joda.time.Period period57 = period55.minusSeconds((-1));
        java.lang.String str58 = period55.toString();
        org.joda.time.Period period59 = period55.toPeriod();
        org.joda.time.PeriodType periodType60 = period55.getPeriodType();
        org.joda.time.Period period61 = period51.normalizedStandard(periodType60);
        org.joda.time.Period period63 = period61.withSeconds(10);
        org.joda.time.DurationFieldType durationFieldType64 = org.joda.time.DurationFieldType.millis();
        boolean boolean65 = period61.isSupported(durationFieldType64);
        org.joda.time.MutableDateTime mutableDateTime67 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period((long) 100, 1L, periodType70);
        org.joda.time.PeriodType periodType74 = null;
        org.joda.time.Period period75 = new org.joda.time.Period((long) 100, 1L, periodType74);
        org.joda.time.Period period76 = period71.plus((org.joda.time.ReadablePeriod) period75);
        org.joda.time.Instant instant77 = new org.joda.time.Instant();
        org.joda.time.Instant instant79 = instant77.withMillis(0L);
        org.joda.time.Duration duration80 = period75.toDurationTo((org.joda.time.ReadableInstant) instant79);
        mutableDateTime67.add((org.joda.time.ReadableDuration) duration80, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType83 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean84 = mutableDateTime67.isSupported(dateTimeFieldType83);
        org.joda.time.DurationFieldType durationFieldType85 = dateTimeFieldType83.getDurationType();
        org.joda.time.DurationFieldType[] durationFieldTypeArray86 = new org.joda.time.DurationFieldType[] { durationFieldType3, durationFieldType26, durationFieldType45, durationFieldType64, durationFieldType85 };
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.PeriodType periodType87 = org.joda.time.PeriodType.forFields(durationFieldTypeArray86);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: PeriodType does not support fields: [centuries]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationFieldType26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(period44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(period57);
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "PT0.099S" + "'", str58, "PT0.099S");
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertNotNull(periodType60);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(durationFieldType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + true + "'", boolean65 == true);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(instant79);
        org.junit.Assert.assertNotNull(duration80);
        org.junit.Assert.assertNotNull(dateTimeFieldType83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + true + "'", boolean84 == true);
        org.junit.Assert.assertNotNull(durationFieldType85);
        org.junit.Assert.assertNotNull(durationFieldTypeArray86);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration3, readableInstant4);
        org.joda.time.Period period7 = period5.withDays((int) (byte) 1);
        org.joda.time.LocalDate localDate8 = localDate2.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.LocalDate localDate10 = localDate8.minusMonths((-292275054));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate8.getValue(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        java.lang.String str5 = property3.toString();
        org.joda.time.LocalDateTime localDateTime6 = property3.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField8 = localDateTime6.getField(751);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 751");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Property[hourOfDay]" + "'", str5, "Property[hourOfDay]");
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setRawOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.lang.String str6 = timeZone0.getID();
        java.time.ZoneId zoneId7 = timeZone0.toZoneId();
        java.util.TimeZone timeZone8 = java.util.TimeZone.getTimeZone(zoneId7);
        int int9 = timeZone8.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Etc/UTC" + "'", str6, "Etc/UTC");
        org.junit.Assert.assertNotNull(zoneId7);
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("PT0.099S", "-1");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: PT0.099S [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology1, locale3, (java.lang.Integer) 10);
        long long9 = dateTimeParserBucket6.computeMillis(true, "");
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField16 = localDateTime14.getField((int) (byte) 0);
        dateTimeParserBucket6.saveField(dateTimeField16, (int) (short) 10);
        java.lang.Object obj19 = dateTimeParserBucket6.saveState();
        java.util.Locale locale20 = dateTimeParserBucket6.getLocale();
        long long23 = dateTimeParserBucket6.computeMillis(false, "14");
        org.joda.time.Instant instant25 = new org.joda.time.Instant();
        org.joda.time.Instant instant27 = instant25.withMillis(0L);
        org.joda.time.Chronology chronology28 = instant27.getChronology();
        org.joda.time.DurationField durationField29 = chronology28.eras();
        java.util.Locale locale30 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket32 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology28, locale30, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property36 = localDateTime33.hourOfDay();
        org.joda.time.DateTimeField dateTimeField37 = property36.getField();
        int int38 = property36.get();
        org.joda.time.LocalDateTime localDateTime39 = property36.roundHalfFloorCopy();
        long long41 = chronology28.set((org.joda.time.ReadablePartial) localDateTime39, (long) 2022);
        org.joda.time.DateTimeField dateTimeField42 = chronology28.weekOfWeekyear();
        org.joda.time.DateTimeField dateTimeField43 = chronology28.minuteOfHour();
        org.joda.time.DateTimeField dateTimeField44 = chronology28.millisOfSecond();
        dateTimeParserBucket6.saveField(dateTimeField44, (int) 'a');
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-1L) + "'", long9 == (-1L));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(obj19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_CA");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + (-61820064000001L) + "'", long23 == (-61820064000001L));
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTimeField37);
// flaky:         org.junit.Assert.assertTrue("'" + int38 + "' != '" + 14 + "'", int38 == 14);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 1645455600000L + "'", long41 == 1645455600000L);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str14 = dateTimeFieldType13.getName();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.property(dateTimeFieldType13);
        int int16 = localDateTime12.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withMillisOfDay(1);
        org.joda.time.Duration duration20 = org.joda.time.Duration.millis(1645455600000L);
        org.joda.time.Minutes minutes21 = duration20.toStandardMinutes();
        org.joda.time.Duration duration23 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period24 = duration23.toPeriod();
        org.joda.time.Duration duration27 = duration23.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime29.add((org.joda.time.ReadableDuration) duration31, (int) (short) 100);
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime(chronology34);
        int int36 = dateTime35.getYearOfCentury();
        org.joda.time.Interval interval37 = duration31.toIntervalTo((org.joda.time.ReadableInstant) dateTime35);
        org.joda.time.Duration duration38 = duration27.minus((org.joda.time.ReadableDuration) duration31);
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period41 = duration40.toPeriod();
        org.joda.time.Duration duration43 = duration27.withDurationAdded((org.joda.time.ReadableDuration) duration40, 54);
        org.joda.time.Duration duration44 = duration20.minus((org.joda.time.ReadableDuration) duration43);
        org.joda.time.LocalDateTime localDateTime45 = localDateTime12.plus((org.joda.time.ReadableDuration) duration20);
        // The following exception was thrown during execution in test generation
        try {
            int int47 = localDateTime12.getValue(39243612);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 39243612");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "dayOfMonth" + "'", str14, "dayOfMonth");
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 53 + "'", int16 == 53);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(duration20);
        org.junit.Assert.assertNotNull(minutes21);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 22 + "'", int36 == 22);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(duration38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(duration44);
        org.junit.Assert.assertNotNull(localDateTime45);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) (byte) -1, chronology1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withYear((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDateTime2.getValue(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property20 = mutableDateTime1.minuteOfDay();
        org.joda.time.MutableDateTime mutableDateTime21 = property20.roundHalfCeiling();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime21.dayOfMonth();
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = java.util.Locale.CANADA;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket30 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology25, locale27, (java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime31 = property22.set("1969-12-31T23:59:56.191Z", locale27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-12-31T23:59:56.191Z\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        org.joda.time.DateTime.Property property4 = dateTime3.yearOfCentury();
        org.joda.time.DateTime dateTime6 = property4.addToCopy(39246272);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getSecondOfMinute();
        boolean boolean12 = dateTime10.isEqualNow();
        int int13 = dateTime10.getDayOfYear();
        org.joda.time.Chronology chronology14 = dateTime10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.year();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology14);
        org.joda.time.DateTimeField dateTimeField19 = chronology14.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((java.lang.Object) 39246272, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTime6);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 25 + "'", int11 == 25);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 52 + "'", int13 == 52);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeField19);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(dateTimeZone4);
        org.joda.time.LocalTime localTime7 = localTime5.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime9 = localTime7.plusMillis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.eras();
        boolean boolean11 = localTime7.isSupported(durationFieldType10);
        boolean boolean12 = mutablePeriod3.isSupported(durationFieldType10);
        org.joda.time.Period period13 = mutablePeriod3.toPeriod();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setMonths(46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(period13);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 42, (long) 49, chronology2);
        mutablePeriod3.setPeriod((-1511999969L));
        mutablePeriod3.setYears((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = mutablePeriod3.getValue(18);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 18");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = java.util.Locale.CANADA;
        java.lang.String str4 = locale2.getDisplayVariant(locale3);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology1, locale3, (java.lang.Integer) 10);
        java.util.Set<java.lang.String> strSet7 = locale3.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = strSet7.add("2022-02-21T14:54:08.597Z");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertNotNull(strSet7);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(39243612, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.util.Locale locale3 = new java.util.Locale("dayOfMonth", "en-CA", "2022-02-21T14:53:55.782Z");
        java.util.Set<java.lang.Character> charSet4 = locale3.getExtensionKeys();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.secondOfDay();
        java.lang.String str6 = dateTimeFieldType5.toString();
        boolean boolean7 = locale3.equals((java.lang.Object) dateTimeFieldType5);
        org.junit.Assert.assertEquals(locale3.toString(), "dayofmonth_EN-CA_2022-02-21T14:53:55.782Z");
        org.junit.Assert.assertNotNull(charSet4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "secondOfDay" + "'", str6, "secondOfDay");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.Period period17 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        org.joda.time.Instant instant20 = instant18.withMillis(0L);
        org.joda.time.Duration duration21 = period16.toDurationTo((org.joda.time.ReadableInstant) instant20);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration21, 39);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime8.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime26 = mutableDateTime8.toMutableDateTime(dateTimeZone25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(97, 39251167, 39250977, (int) (byte) -1, (int) (byte) 10, 365, 958, dateTimeZone25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.addUnicodeLocaleAttribute("CA");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: CA [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.Period period8 = new org.joda.time.Period((long) 5, (long) (byte) 100, chronology7);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.now(chronology7);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.Instant instant14 = instant12.withMillis(0L);
        org.joda.time.Chronology chronology15 = instant14.getChronology();
        org.joda.time.DurationField durationField16 = chronology15.eras();
        java.util.Locale locale17 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket19 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology15, locale17, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate((long) 53, chronology15);
        org.joda.time.DateTimeField dateTimeField21 = chronology15.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) chronology7, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 26 + "'", int4 == 26);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(instant14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration3, (int) (short) 100);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.yearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.LocalTime localTime10 = localTime8.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime12 = localTime10.plusMillis((int) (byte) 100);
        java.lang.String str13 = localTime12.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = property6.compareTo((org.joda.time.ReadablePartial) localTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "10:54:26.331" + "'", str13, "10:54:26.331");
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        java.util.Locale locale7 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology5, locale7, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) 53, chronology5);
        org.joda.time.DateTimeField dateTimeField11 = chronology5.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeField11.set((long) (byte) 1, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        long long5 = durationField4.getUnitMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long8 = durationField4.getMillis(0L, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setRawOffset((int) (byte) -1);
        java.lang.Object obj5 = timeZone0.clone();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(obj5);
        org.junit.Assert.assertEquals(obj5.toString(), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj5), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj5), "sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=-1,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.Instant instant8 = new org.joda.time.Instant();
        org.joda.time.Instant instant10 = instant8.withMillis(0L);
        org.joda.time.Chronology chronology11 = instant10.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.eras();
        java.util.Locale locale13 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology11, locale13, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property19 = localDateTime16.hourOfDay();
        org.joda.time.DateTimeField dateTimeField20 = property19.getField();
        int int21 = property19.get();
        org.joda.time.LocalDateTime localDateTime22 = property19.roundHalfFloorCopy();
        long long24 = chronology11.set((org.joda.time.ReadablePartial) localDateTime22, (long) 2022);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now(chronology11);
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(chronology11);
        org.joda.time.DurationField durationField27 = chronology11.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime(24, 2, 43, 51, 11, 31, 457070, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 51 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeField20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 14 + "'", int21 == 14);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1645455600000L + "'", long24 == 1645455600000L);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 100);
        int int2 = dateTime1.getCenturyOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) 1, chronology4);
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime5, (org.joda.time.ReadableInstant) instant6, periodType7);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int10 = instant6.get(dateTimeFieldType9);
        org.joda.time.Duration duration13 = new org.joda.time.Duration((long) 10, (long) 3);
        org.joda.time.Instant instant15 = instant6.withDurationAdded((org.joda.time.ReadableDuration) duration13, 0);
        org.joda.time.Instant instant16 = new org.joda.time.Instant();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration13, (org.joda.time.ReadableInstant) instant16);
        org.joda.time.DateTime dateTime19 = dateTime1.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod17, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            int int21 = mutablePeriod17.getValue(642);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 642");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 894 + "'", int10 == 894);
        org.junit.Assert.assertNotNull(instant15);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration3, readableInstant4);
        org.joda.time.Period period7 = period5.withDays((int) (byte) 1);
        org.joda.time.LocalDate localDate8 = localDate2.plus((org.joda.time.ReadablePeriod) period7);
        int int9 = localDate8.getEra();
        org.joda.time.LocalTime localTime10 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDate8.toLocalDateTime(localTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        int int5 = localDateTime4.getMinuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDateTime4.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 54 + "'", int5 == 54);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        java.lang.String[] strArray11 = new java.lang.String[] { "dayOfMonth", "2022-02-21T10:53:40.615", "clockhourOfDay", "hi!", "PeriodType[Standard]", "Standard", "dayOfMonth", "59", "deu", "1970", "Standard" };
        java.util.LinkedHashSet<java.lang.String> strSet12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet12, strArray11);
        java.util.Spliterator<java.lang.String> strSpliterator14 = strSet12.spliterator();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.monthOfYear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        int int19 = dateTime18.getSecondOfMinute();
        boolean boolean20 = dateTime18.isEqualNow();
        int int21 = dateTime18.getDayOfYear();
        org.joda.time.Chronology chronology22 = dateTime18.getChronology();
        long long23 = property16.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDateTime localDateTime24 = property16.getLocalDateTime();
        boolean boolean25 = strSet12.equals((java.lang.Object) localDateTime24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField27 = localDateTime24.getField(39250977);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 39250977");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(strSpliterator14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 27 + "'", int19 == 27);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 52 + "'", int21 == 52);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 0L + "'", long23 == 0L);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean7 = localTime5.isSupported(dateTimeFieldType6);
        int int8 = localTime5.getMinuteOfHour();
        int int9 = localTime5.size();
        int int10 = localTime5.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) int10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 59 + "'", int8 == 59);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 4 + "'", int9 == 4);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 59 + "'", int10 == 59);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Duration duration5 = duration1.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.ReadableInstant readableInstant6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration5, readableInstant6);
        int int8 = mutablePeriod7.getMinutes();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        boolean boolean7 = property5.isLeap();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale9.getCountry();
        java.lang.String str12 = property5.getAsShortText(locale9);
        java.util.Set<java.lang.String> strSet13 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder14 = builder1.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder1.setUnicodeLocaleKeyword("2022-02-21T14:54:16.756", "ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 2022-02-21T14:54:16.756 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CA" + "'", str11, "CA");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "14" + "'", str12, "14");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.Instant instant2 = instant0.withMillis(0L);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.DurationField durationField4 = chronology3.eras();
        long long5 = durationField4.getUnitMillis();
        boolean boolean6 = durationField4.isSupported();
        boolean boolean7 = durationField4.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = durationField4.getMillis((-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationField4);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 0L + "'", long5 == 0L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 1, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        int int8 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime.Property property9 = dateTime3.hourOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.centuryOfEra();
        org.joda.time.DateTime.Property property11 = dateTime3.minuteOfDay();
        org.joda.time.PeriodType periodType12 = org.joda.time.PeriodType.yearDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object) property11, periodType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(periodType12);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.year();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField12 = chronology7.minuteOfDay();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.PeriodType periodType16 = null;
        org.joda.time.Period period17 = new org.joda.time.Period((long) 100, 1L, periodType16);
        org.joda.time.Period period19 = period17.minusSeconds((-1));
        org.joda.time.Duration duration21 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period22 = duration21.toPeriod();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.centuries();
        int int24 = period22.get(durationFieldType23);
        boolean boolean25 = period17.isSupported(durationFieldType23);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime13.withFieldAdded(durationFieldType23, 52);
        int[] intArray29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = dateTimeField12.addWrapPartial((org.joda.time.ReadablePartial) localDateTime13, 0, intArray29, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 27 + "'", int4 == 27);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setDayOfYear((int) ' ');
        mutableDateTime1.add((long) 39221019);
        mutableDateTime1.setMinuteOfDay(21);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfHour(39246272);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39246272 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.minuteOfHour();
        org.joda.time.Chronology chronology21 = null;
        java.util.Locale locale22 = java.util.Locale.GERMAN;
        java.util.Locale locale23 = java.util.Locale.CANADA;
        java.lang.String str24 = locale22.getDisplayVariant(locale23);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket25 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology21, locale23);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.centuryOfEra();
        java.util.Locale.Category category28 = java.util.Locale.Category.DISPLAY;
        java.util.Locale locale29 = java.util.Locale.getDefault(category28);
        java.lang.String str30 = locale29.getVariant();
        dateTimeParserBucket25.saveField(dateTimeFieldType26, "2022-02-21T14:53:55.782Z", locale29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime32 = property18.set("2022-02-21T15:00:00.000", locale29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T15:00:00.000\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "de");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + category28 + "' != '" + java.util.Locale.Category.DISPLAY + "'", category28.equals(java.util.Locale.Category.DISPLAY));
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str10 = dateTimeFieldType9.getName();
        org.joda.time.LocalDateTime.Property property11 = localDateTime0.property(dateTimeFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = property11.setCopy("GB");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"GB\" for clockhourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "clockhourOfDay" + "'", str10, "clockhourOfDay");
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.Period period5 = period3.minusSeconds((-1));
        org.joda.time.Period period7 = period5.minusMillis(1439);
        org.joda.time.Period period8 = period7.normalizedStandard();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = locale2.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket6.getZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) (short) 1, chronology10);
        org.joda.time.Instant instant12 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime11, (org.joda.time.ReadableInstant) instant12, periodType13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate17 = localDate15.minusMonths((int) ' ');
        org.joda.time.Chronology chronology18 = localDate15.getChronology();
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate21 = localDate15.withFieldAdded(durationFieldType19, (int) (byte) 100);
        int int22 = periodType13.indexOf(durationFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = localTime8.withFieldAdded(durationFieldType19, 57);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getSecondOfMinute();
        boolean boolean18 = dateTime16.isEqualNow();
        int int19 = dateTime16.getDayOfYear();
        org.joda.time.Chronology chronology20 = dateTime16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology20);
        org.joda.time.DateTimeField dateTimeField22 = chronology20.year();
        org.joda.time.DateTimeZone dateTimeZone23 = chronology20.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime((java.lang.Object) localDateTime12, chronology20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 29 + "'", int17 == 29);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 52 + "'", int19 == 52);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = locale2.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket6.getZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localTime8.toDateTimeToday();
        org.joda.time.LocalTime.Property property10 = localTime8.secondOfMinute();
        org.joda.time.LocalTime localTime12 = property10.addNoWrapToCopy(46);
        org.joda.time.LocalTime localTime14 = localTime12.plusSeconds(958);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property16 = localTime12.property(dateTimeFieldType15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        boolean boolean7 = property5.isLeap();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale9.getCountry();
        java.lang.String str12 = property5.getAsShortText(locale9);
        java.util.Set<java.lang.String> strSet13 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder14 = builder1.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder17 = builder1.setUnicodeLocaleKeyword("53662039", "10:54:34.850");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 53662039 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CA" + "'", str11, "CA");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "14" + "'", str12, "14");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        int int21 = mutableDateTime1.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime1.year();
        mutableDateTime1.setSecondOfDay(50);
        org.joda.time.Chronology chronology25 = mutableDateTime1.getChronology();
        java.lang.Object obj26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(obj26);
        org.joda.time.DateTime.Property property28 = dateTime27.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = dateTime27.toLocalDateTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = localDateTime29.getFieldType((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.set(dateTimeFieldType31, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969 + "'", int20 == 1969);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDay();
        org.joda.time.PeriodType periodType1 = periodType0.withMonthsRemoved();
        java.lang.String str2 = periodType1.toString();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "PeriodType[YearMonthDayNoMonths]" + "'", str2, "PeriodType[YearMonthDayNoMonths]");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        boolean boolean6 = property3.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getSecondOfMinute();
        int int10 = dateTime8.getYearOfEra();
        int int11 = property3.getDifference((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime8.toMutableDateTimeISO();
        int int13 = mutableDateTime12.getMinuteOfDay();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.hourOfDay();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime14.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str21 = dateTimeFieldType20.getName();
        int int22 = localDateTime14.indexOf(dateTimeFieldType20);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime14.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime14.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str28 = dateTimeFieldType27.getName();
        org.joda.time.LocalDateTime.Property property29 = localDateTime26.property(dateTimeFieldType27);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime12.set(dateTimeFieldType27, 49);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 29 + "'", int9 == 29);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 894 + "'", int13 == 894);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "clockhourOfDay" + "'", str21, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + (-1) + "'", int22 == (-1));
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "dayOfMonth" + "'", str28, "dayOfMonth");
        org.junit.Assert.assertNotNull(property29);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(116, 0, 13, 39266896, 40);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39266896 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 100);
        org.joda.time.DateTime.Property property2 = dateTime1.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(chronology3);
        int int5 = dateTime4.getSecondOfMinute();
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate();
        int int7 = localDate6.getDayOfMonth();
        org.joda.time.LocalDate localDate9 = localDate6.plusYears(1);
        org.joda.time.LocalDate localDate11 = localDate9.plusYears((int) (short) -1);
        org.joda.time.DateTime dateTime12 = dateTime4.withFields((org.joda.time.ReadablePartial) localDate9);
        int int13 = property2.getDifference((org.joda.time.ReadableInstant) dateTime4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime4.withWeekOfWeekyear(9722);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9722 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 29 + "'", int5 == 29);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-625) + "'", int13 == (-625));
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        org.joda.time.Chronology chronology3 = localDate0.getChronology();
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate6 = localDate0.withFieldAdded(durationFieldType4, (int) (byte) 100);
        org.joda.time.PeriodType periodType9 = null;
        org.joda.time.Period period10 = new org.joda.time.Period((long) 100, 1L, periodType9);
        org.joda.time.Period period12 = period10.minusSeconds((-1));
        java.lang.String str13 = period10.toString();
        org.joda.time.Period period14 = period10.toPeriod();
        org.joda.time.Period period16 = period10.plusSeconds((int) '#');
        org.joda.time.DurationFieldType[] durationFieldTypeArray17 = period16.getFieldTypes();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.forFields(durationFieldTypeArray17);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(chronology19);
        int int21 = dateTime20.getSecondOfMinute();
        boolean boolean22 = dateTime20.isEqualNow();
        int int23 = dateTime20.getDayOfYear();
        org.joda.time.Chronology chronology24 = dateTime20.getChronology();
        org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((java.lang.Object) localDate0, periodType18, chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "PT0.099S" + "'", str13, "PT0.099S");
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(durationFieldTypeArray17);
        org.junit.Assert.assertNotNull(periodType18);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 29 + "'", int21 == 29);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        long long4 = dateTimeZone1.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (short) -1, dateTimeZone1);
        org.joda.time.Chronology chronology8 = null;
        java.util.Locale locale9 = java.util.Locale.GERMAN;
        java.util.Locale locale10 = locale9.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket13 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology8, locale9, (java.lang.Integer) 45, (int) '4');
        java.lang.String str14 = dateTimeZone1.getName(31536000000L, locale9);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(chronology15);
        int int17 = dateTime16.getSecondOfMinute();
        int int18 = dateTime16.getYearOfEra();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((int) (short) 10, 100, (int) 'a', 21);
        java.lang.String str24 = mutablePeriod23.toString();
        org.joda.time.DateTime dateTime25 = dateTime16.plus((org.joda.time.ReadablePeriod) mutablePeriod23);
        mutablePeriod23.setDays(56);
        boolean boolean28 = dateTimeZone1.equals((java.lang.Object) 56);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 100L + "'", long4 == 100L);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
// flaky:         org.junit.Assert.assertTrue("'" + int17 + "' != '" + 30 + "'", int17 == 30);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "PT10H100M97.021S" + "'", str24, "PT10H100M97.021S");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Days days3 = period2.toStandardDays();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = period2.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(days3);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(48, 39251693, 40, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime localTime6 = localTime4.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime8 = localTime6.plusMillis((int) (byte) 100);
        org.joda.time.DateTime dateTime9 = dateTime2.withFields((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.DateTime dateTime10 = dateTime2.toDateTimeISO();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) 100);
        org.joda.time.DateTime.Property property13 = dateTime12.monthOfYear();
        org.joda.time.DateTime dateTime14 = dateTime12.toDateTimeISO();
        boolean boolean15 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime14);
        org.joda.time.DateTime dateTime17 = dateTime14.withYearOfCentury(56);
        org.joda.time.DateTime dateTime19 = dateTime17.plusSeconds(54);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime19.withEra(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.Period period4 = period2.withHours(8);
        org.joda.time.Weeks weeks5 = period2.toStandardWeeks();
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertNotNull(weeks5);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.PeriodType periodType8 = org.joda.time.PeriodType.yearWeekDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period9 = new org.joda.time.Period(819, 39251167, 18, (int) (byte) -1, 10, 1439, 59, 50, periodType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType8);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        mutableDateTime1.addMonths(41);
        org.joda.time.MutableDateTime mutableDateTime23 = mutableDateTime1.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime23.setWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969 + "'", int20 == 1969);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.Chronology chronology1 = null;
        java.util.Locale locale2 = java.util.Locale.GERMAN;
        java.util.Locale locale3 = locale2.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket6 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology1, locale2, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = dateTimeParserBucket6.getZone();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localTime8.toDateTimeToday();
        org.joda.time.LocalTime.Property property10 = localTime8.secondOfMinute();
        java.lang.String str11 = property10.getName();
        org.joda.time.LocalTime localTime12 = property10.roundHalfCeilingCopy();
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localTime12.toString("2022-02-21T14:54:18.123Z", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "secondOfMinute" + "'", str11, "secondOfMinute");
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(0L, dateTimeZone7);
        long long11 = dateTimeZone7.convertLocalToUTC((long) 3, true);
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(0, (int) ' ', 39239, (int) (short) 10, 29, 0, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 3L + "'", long11 == 3L);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.era();
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearDayTime();
        boolean boolean6 = localDate0.equals((java.lang.Object) periodType5);
        int int7 = localDate0.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDate0.getValue(18);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 18");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(periodType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.lang.String[] strArray18 = new java.lang.String[] { "hourOfHalfday", "UTC", "Greenwich Mean Time", "2022-02-21T14:54:15.888Z", "-1", "2022-02-21T14:54:08.597Z", "PeriodType[YearMonthDayNoMonths]", "1969-12-31T23:59:56.191Z", "53664006", "secondOfMinute", "59", "CA", "months", "2022-02-21T14:54:25.999Z", "clockhourOfDay", "+00:00", "59", "2022-02-21T14:54:08.597Z" };
        java.util.LinkedHashSet<java.lang.String> strSet19 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean20 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet19, strArray18);
        java.io.IOException[] iOExceptionArray21 = new java.io.IOException[] {};
        java.io.IOException[] iOExceptionArray22 = new java.io.IOException[] {};
        java.io.IOException[] iOExceptionArray23 = new java.io.IOException[] {};
        java.io.IOException[] iOExceptionArray24 = new java.io.IOException[] {};
        java.io.IOException[] iOExceptionArray25 = new java.io.IOException[] {};
        java.io.IOException[][] iOExceptionArray26 = new java.io.IOException[][] { iOExceptionArray21, iOExceptionArray22, iOExceptionArray23, iOExceptionArray24, iOExceptionArray25 };
        // The following exception was thrown during execution in test generation
        try {
            java.io.IOException[][] iOExceptionArray27 = strSet19.toArray(iOExceptionArray26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(iOExceptionArray21);
        org.junit.Assert.assertNotNull(iOExceptionArray22);
        org.junit.Assert.assertNotNull(iOExceptionArray23);
        org.junit.Assert.assertNotNull(iOExceptionArray24);
        org.junit.Assert.assertNotNull(iOExceptionArray25);
        org.junit.Assert.assertNotNull(iOExceptionArray26);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period19 = duration18.toPeriod();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.centuries();
        int int21 = period19.get(durationFieldType20);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period19, 54);
        mutableDateTime1.setMillisOfDay(0);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime1.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime28 = property26.set("DateTimeField[weekOfWeekyear]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"DateTimeField[weekOfWeekyear]\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(86396, 86396, 55, 22, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.minuteOfHour();
        org.joda.time.MutableDateTime mutableDateTime20 = property18.addWrapField(6);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        java.lang.String str23 = dateTimeZone21.getNameKey((long) (byte) 0);
        mutableDateTime20.setZoneRetainFields(dateTimeZone21);
        org.joda.time.PeriodType periodType27 = null;
        org.joda.time.Period period28 = new org.joda.time.Period((long) 100, 1L, periodType27);
        org.joda.time.PeriodType periodType31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period((long) 100, 1L, periodType31);
        org.joda.time.Period period33 = period28.plus((org.joda.time.ReadablePeriod) period32);
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.Instant instant36 = instant34.withMillis(0L);
        org.joda.time.Duration duration37 = period32.toDurationTo((org.joda.time.ReadableInstant) instant36);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = new org.joda.time.Period((long) 100, 1L, periodType40);
        org.joda.time.PeriodType periodType44 = null;
        org.joda.time.Period period45 = new org.joda.time.Period((long) 100, 1L, periodType44);
        org.joda.time.Period period46 = period41.plus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Instant instant49 = instant47.withMillis(0L);
        org.joda.time.Duration duration50 = period45.toDurationTo((org.joda.time.ReadableInstant) instant49);
        boolean boolean51 = instant36.isEqual((org.joda.time.ReadableInstant) instant49);
        boolean boolean52 = mutableDateTime20.isEqual((org.joda.time.ReadableInstant) instant36);
        org.joda.time.MutableDateTime.Property property53 = mutableDateTime20.monthOfYear();
        java.util.Locale locale55 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime56 = property53.set("1969-02-01T23:59:56.244Z", locale55);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1969-02-01T23:59:56.244Z\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(mutableDateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "UTC" + "'", str23, "UTC");
        org.junit.Assert.assertNotNull(period33);
        org.junit.Assert.assertNotNull(instant36);
        org.junit.Assert.assertNotNull(duration37);
        org.junit.Assert.assertNotNull(period46);
        org.junit.Assert.assertNotNull(instant49);
        org.junit.Assert.assertNotNull(duration50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + false + "'", boolean52 == false);
        org.junit.Assert.assertNotNull(property53);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology6);
        int int8 = dateTime7.getSecondOfMinute();
        boolean boolean9 = dateTime7.isEqualNow();
        int int10 = dateTime7.getDayOfYear();
        org.joda.time.Chronology chronology11 = dateTime7.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.year();
        org.joda.time.DateTimeZone dateTimeZone14 = chronology11.getZone();
        org.joda.time.DateTimeField dateTimeField15 = chronology11.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime(30, 2023, 1969, 25, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 30 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 31 + "'", int8 == 31);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(18, 894, 3, 29, 9722, (int) (byte) -1, 28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 29 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.lang.String[] strArray38 = new java.lang.String[] { "PT10H100M97.021S", "java.io.IOException", "English (United Kingdom)", "dayOfMonth", "de", "2022-02-21T14:53:38.450Z", "", "2022-02-21T10:53:40.615", "hi!", "DateTimeField[year]", "en_US", "PT86400S", "2022-02-21T10:53:40.615", "", "dayOfMonth", "minuteOfDay", "1970", "UTC", "2022-02-21T15:00:00.000", "2022-02-21T10:53:40.615", "DateTimeField[year]", "February", "en-US", "14", "2022-02-21T15:00:00.000", "PT86400S", "German", "2022-02-21T14:53:55.782Z", "PT86400S", "PT10H100M97.021S", "clockhourOfDay", "59", "59", "1970", "Property[hourOfDay]", "2022-02-21T15:00:00.000", "59", "PT0.099S" };
        java.util.LinkedHashSet<java.lang.String> strSet39 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet39, strArray38);
        boolean boolean42 = strSet39.add("DateTimeField[year]");
        boolean boolean44 = strSet39.add("en_US");
        org.junit.Assert.assertNotNull(strArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        boolean boolean3 = dateTime1.isEqualNow();
        int int4 = dateTime1.getDayOfYear();
        org.joda.time.LocalTime localTime5 = dateTime1.toLocalTime();
        org.joda.time.DateTime dateTime7 = dateTime1.withMillisOfSecond((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime1.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = property8.setCopy((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 31 + "'", int2 == 31);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.dayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (byte) -1, chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYear((int) (short) -1);
        int int15 = localDateTime12.getCenturyOfEra();
        int int16 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withDayOfYear(5);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = localDateTime12.getFields();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime12.minusMonths(39243612);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = localDateTime21.getValue(23);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 23");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 31 + "'", int16 == 31);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldArray19);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone.setDefault(timeZone0);
        timeZone0.setRawOffset((int) (byte) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.util.TimeZone.setDefault(timeZone0);
        java.util.Locale locale9 = java.util.Locale.CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = timeZone0.getDisplayName(false, 50, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 50");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh");
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.Chronology chronology8 = localDateTime7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(1970, 9722, 24, 2, 457070, 22, 5, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 457070 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(13, 21, (int) (byte) 0, 97, 2025);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Locale locale1 = java.util.Locale.CANADA;
        java.lang.String str2 = locale0.getDisplayVariant(locale1);
        java.util.Set<java.lang.String> strSet3 = locale1.getUnicodeLocaleKeys();
        java.util.Collection<java.util.Locale.LanguageRange> languageRangeCollection4 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = strSet3.containsAll(languageRangeCollection4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(strSet3);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Duration duration5 = duration1.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = new org.joda.time.Period((long) 100, 1L, periodType12);
        org.joda.time.Period period14 = period9.plus((org.joda.time.ReadablePeriod) period13);
        org.joda.time.Instant instant15 = new org.joda.time.Instant();
        org.joda.time.Instant instant17 = instant15.withMillis(0L);
        org.joda.time.Duration duration18 = period13.toDurationTo((org.joda.time.ReadableInstant) instant17);
        org.joda.time.Instant instant20 = instant17.plus((long) (byte) -1);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 1, chronology22);
        org.joda.time.Instant instant24 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType25 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableInstant) instant24, periodType25);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration1, (org.joda.time.ReadableInstant) instant17, periodType25);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration31 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime29.add((org.joda.time.ReadableDuration) duration31, (int) (short) 100);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((long) (short) 1, chronology35);
        org.joda.time.Instant instant37 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime36, (org.joda.time.ReadableInstant) instant37, periodType38);
        org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate42 = localDate40.minusMonths((int) ' ');
        org.joda.time.Chronology chronology43 = localDate40.getChronology();
        org.joda.time.DurationFieldType durationFieldType44 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate46 = localDate40.withFieldAdded(durationFieldType44, (int) (byte) 100);
        int int47 = periodType38.indexOf(durationFieldType44);
        org.joda.time.Period period48 = duration31.toPeriod(periodType38);
        org.joda.time.DurationFieldType durationFieldType49 = org.joda.time.DurationFieldType.days();
        org.joda.time.Period period51 = period48.withField(durationFieldType49, 49);
        mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) period51);
        org.joda.time.PeriodType periodType55 = null;
        org.joda.time.Period period56 = new org.joda.time.Period((long) 100, 1L, periodType55);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = new org.joda.time.Period((long) 100, 1L, periodType59);
        org.joda.time.Period period61 = period56.plus((org.joda.time.ReadablePeriod) period60);
        org.joda.time.Period period63 = period60.minusSeconds(21);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod27.setPeriod((org.joda.time.ReadablePeriod) period60);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'millis'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertNotNull(instant17);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(durationFieldType44);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + (-1) + "'", int47 == (-1));
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertNotNull(durationFieldType49);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(period63);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.io.IOException iOException1 = new java.io.IOException();
        java.lang.Throwable[] throwableArray2 = iOException1.getSuppressed();
        java.lang.Throwable throwable3 = null;
        java.io.IOException iOException4 = new java.io.IOException(throwable3);
        java.io.IOException iOException5 = new java.io.IOException();
        iOException4.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException7 = new java.io.IOException();
        java.lang.Throwable[] throwableArray8 = iOException7.getSuppressed();
        iOException5.addSuppressed((java.lang.Throwable) iOException7);
        iOException1.addSuppressed((java.lang.Throwable) iOException5);
        java.io.IOException iOException11 = new java.io.IOException((java.lang.Throwable) iOException1);
        java.io.IOException iOException12 = new java.io.IOException("Coordinated Universal Time", (java.lang.Throwable) iOException1);
        java.lang.String str13 = iOException12.toString();
        org.junit.Assert.assertNotNull(throwableArray2);
        org.junit.Assert.assertNotNull(throwableArray8);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.io.IOException: Coordinated Universal Time" + "'", str13, "java.io.IOException: Coordinated Universal Time");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("2022-02-21T14:54:16.756", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod((long) 1439, 3155760000035L);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate5 = localDate3.minusMonths((int) ' ');
        org.joda.time.Chronology chronology6 = localDate3.getChronology();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate9 = localDate3.withFieldAdded(durationFieldType7, (int) (byte) 100);
        org.joda.time.LocalDate localDate11 = localDate9.minusMonths(55);
        org.joda.time.PeriodType periodType14 = null;
        org.joda.time.Period period15 = new org.joda.time.Period((long) 100, 1L, periodType14);
        org.joda.time.Period period17 = period15.minusSeconds((-1));
        org.joda.time.Duration duration19 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period20 = duration19.toPeriod();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.centuries();
        int int22 = period20.get(durationFieldType21);
        boolean boolean23 = period15.isSupported(durationFieldType21);
        boolean boolean24 = localDate9.isSupported(durationFieldType21);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod2.add(durationFieldType21, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'centuries'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
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
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.lang.Object obj0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(obj0);
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        boolean boolean8 = property5.equals((java.lang.Object) '#');
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getSecondOfMinute();
        int int12 = dateTime10.getYearOfEra();
        int int13 = property5.getDifference((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime1, (org.joda.time.ReadableInstant) dateTime10);
        java.util.GregorianCalendar gregorianCalendar15 = dateTime1.toGregorianCalendar();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object) gregorianCalendar15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.GregorianCalendar");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 33 + "'", int11 == 33);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(gregorianCalendar15);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.util.Locale locale3 = new java.util.Locale("hi!", "clockhourOfDay", "java.io.IOException");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for CLOCKHOUROFDAY");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "hi!_CLOCKHOUROFDAY_java.io.IOException");
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withDurationAdded((long) 6, 12);
        int int6 = dateTime5.getYear();
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 33 + "'", int2 == 33);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType11 = null;
        org.joda.time.Period period12 = new org.joda.time.Period((long) 100, 1L, periodType11);
        org.joda.time.PeriodType periodType15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period((long) 100, 1L, periodType15);
        org.joda.time.Period period17 = period12.plus((org.joda.time.ReadablePeriod) period16);
        org.joda.time.Instant instant18 = new org.joda.time.Instant();
        org.joda.time.Instant instant20 = instant18.withMillis(0L);
        org.joda.time.Duration duration21 = period16.toDurationTo((org.joda.time.ReadableInstant) instant20);
        mutableDateTime8.add((org.joda.time.ReadableDuration) duration21, 39);
        org.joda.time.MutableDateTime.Property property24 = mutableDateTime8.yearOfEra();
        mutableDateTime8.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property27 = mutableDateTime8.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone28 = org.joda.time.DateTimeZone.UTC;
        long long31 = dateTimeZone28.convertLocalToUTC((long) (byte) 100, false);
        mutableDateTime8.setZone(dateTimeZone28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime33 = new org.joda.time.MutableDateTime(29, 116, 13, (-625), 642, 51, 1439, dateTimeZone28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -625 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period17);
        org.junit.Assert.assertNotNull(instant20);
        org.junit.Assert.assertNotNull(duration21);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 100L + "'", long31 == 100L);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setRegion("20");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 20 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        long long8 = property1.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime3);
        org.joda.time.DateTime dateTime10 = dateTime3.minusYears(0);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays(53);
        int int13 = dateTime12.getHourOfDay();
        org.joda.time.DateTime.Property property14 = dateTime12.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) property14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 33 + "'", int4 == 33);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 14 + "'", int13 == 14);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        mutableDateTime1.setDayOfYear((int) ' ');
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate22 = localDate20.minusMonths((int) ' ');
        org.joda.time.Chronology chronology23 = localDate20.getChronology();
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate26 = localDate20.withFieldAdded(durationFieldType24, (int) (byte) 100);
        org.joda.time.LocalDate.Property property27 = localDate20.dayOfWeek();
        org.joda.time.LocalDate localDate29 = property27.addWrapFieldToCopy(3);
        org.joda.time.DateTimeField dateTimeField30 = property27.getField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setRounding(dateTimeField30, 48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 48");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTimeField30);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration3, (int) (short) 100);
        mutableDateTime1.setYear(10);
        mutableDateTime1.addSeconds((int) (short) 0);
        org.joda.time.MutableDateTime.Property property10 = mutableDateTime1.minuteOfDay();
        mutableDateTime1.setMillisOfDay(69);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDateTime(56, 0, (int) (byte) 1, 893, 457070, 0, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 893 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        boolean boolean19 = mutableDateTime1.isBeforeNow();
        int int20 = mutableDateTime1.getSecondOfDay();
        org.joda.time.LocalDateTime localDateTime21 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.hourOfDay();
        org.joda.time.DateTimeField dateTimeField25 = property24.getField();
        mutableDateTime1.setRounding(dateTimeField25);
        long long29 = dateTimeField25.getDifferenceAsLong(0L, (long) 48);
        org.joda.time.Instant instant31 = new org.joda.time.Instant();
        org.joda.time.Instant instant33 = instant31.withMillis(0L);
        org.joda.time.Chronology chronology34 = instant33.getChronology();
        org.joda.time.DurationField durationField35 = chronology34.eras();
        java.util.Locale locale36 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket38 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology34, locale36, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property42 = localDateTime39.hourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = property42.getField();
        int int44 = property42.get();
        org.joda.time.LocalDateTime localDateTime45 = property42.roundHalfFloorCopy();
        long long47 = chronology34.set((org.joda.time.ReadablePartial) localDateTime45, (long) 2022);
        org.joda.time.LocalDateTime localDateTime49 = localDateTime45.withWeekyear((int) (short) 10);
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate();
        int int52 = localDate51.getDayOfMonth();
        org.joda.time.LocalDate localDate54 = localDate51.plusYears(1);
        org.joda.time.Interval interval55 = localDate51.toInterval();
        int[] intArray56 = localDate51.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray58 = dateTimeField25.addWrapField((org.joda.time.ReadablePartial) localDateTime45, 11, intArray56, 38);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 86396 + "'", int20 == 86396);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 0L + "'", long29 == 0L);
        org.junit.Assert.assertNotNull(instant33);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(durationField35);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTimeField43);
// flaky:         org.junit.Assert.assertTrue("'" + int44 + "' != '" + 14 + "'", int44 == 14);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 1645455600000L + "'", long47 == 1645455600000L);
        org.junit.Assert.assertNotNull(localDateTime49);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 21 + "'", int52 == 21);
        org.junit.Assert.assertNotNull(localDate54);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertNotNull(intArray56);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray56), "[2022, 2, 21]");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(0L, dateTimeZone8);
        int int11 = dateTimeZone8.getOffsetFromLocal((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(30, 39272321, 39251693, (int) (byte) 0, 1439, (int) (byte) 100, 18, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.LocalTime localTime7 = localTime3.plusSeconds(40);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate10 = localDate8.minusMonths((int) ' ');
        int int11 = localDate8.size();
        org.joda.time.LocalDate.Property property12 = localDate8.era();
        org.joda.time.LocalDate localDate13 = property12.roundCeilingCopy();
        org.joda.time.LocalDate.Property property14 = localDate13.weekyear();
        org.joda.time.LocalDate localDate16 = localDate13.plusMonths(44);
        org.joda.time.LocalDate.Property property17 = localDate16.dayOfWeek();
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.dayTime();
        org.joda.time.PeriodType periodType19 = periodType18.withMinutesRemoved();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period20 = new org.joda.time.Period((org.joda.time.ReadablePartial) localTime3, (org.joda.time.ReadablePartial) localDate16, periodType19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(periodType18);
        org.junit.Assert.assertNotNull(periodType19);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate9 = localDate7.minusMonths((int) ' ');
        org.joda.time.Chronology chronology10 = localDate7.getChronology();
        java.util.Locale locale11 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket14 = new org.joda.time.format.DateTimeParserBucket(0L, chronology10, locale11, (java.lang.Integer) 59, 12);
        org.joda.time.DurationField durationField15 = chronology10.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((int) (byte) 100, 17, 3, 25, 20, 38, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 25 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant3, periodType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int7 = instant3.get(dateTimeFieldType6);
        java.lang.String str8 = dateTimeFieldType6.getName();
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.eras();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology14);
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType6.getField(chronology14);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = chronology14.getDateTimeMillis(14, 5, 0, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 894 + "'", int7 == 894);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "minuteOfDay" + "'", str8, "minuteOfDay");
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime(chronology2);
        int int4 = dateTime3.getSecondOfMinute();
        boolean boolean5 = dateTime3.isEqualNow();
        int int6 = dateTime3.getDayOfYear();
        org.joda.time.Chronology chronology7 = dateTime3.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.year();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now(chronology7);
        org.joda.time.DateTimeField dateTimeField12 = chronology7.minuteOfDay();
        long long14 = dateTimeField12.roundCeiling((long) (-1));
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 34 + "'", int4 == 34);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfWeek();
        org.joda.time.LocalDate.Property property2 = localDate0.monthOfYear();
        org.joda.time.Instant instant4 = new org.joda.time.Instant();
        org.joda.time.Instant instant6 = instant4.withMillis(0L);
        org.joda.time.Chronology chronology7 = instant6.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.eras();
        java.util.Locale locale9 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology7, locale9, (java.lang.Integer) 39221019);
        org.joda.time.Chronology chronology13 = null;
        java.util.Locale locale14 = java.util.Locale.GERMAN;
        java.util.Locale locale15 = java.util.Locale.CANADA;
        java.lang.String str16 = locale14.getDisplayVariant(locale15);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology13, locale15);
        org.joda.time.DateTimeZone dateTimeZone18 = dateTimeParserBucket17.getZone();
        org.joda.time.Chronology chronology19 = chronology7.withZone(dateTimeZone18);
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.now(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = dateTimeField21.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = localDate0.withField(dateTimeFieldType22, 894);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 894 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(instant6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "de");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.era();
        org.joda.time.LocalDate localDate5 = property4.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = localDate5.toDateTimeAtMidnight();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("en-US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"en-US\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        int int21 = mutableDateTime1.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime1.year();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate25 = localDate23.minusMonths((int) ' ');
        org.joda.time.Chronology chronology26 = localDate23.getChronology();
        mutableDateTime1.setChronology(chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.dayOfYear();
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property32 = localDateTime29.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = property32.getField();
        boolean boolean34 = property32.isLeap();
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = java.util.Locale.CANADA;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = locale36.getCountry();
        java.lang.String str39 = property32.getAsShortText(locale36);
        org.joda.time.LocalDateTime localDateTime41 = property32.addWrapFieldToCopy((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime43 = localDateTime41.withCenturyOfEra((int) (byte) 0);
        org.joda.time.LocalDate localDate45 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate47 = localDate45.minusMonths((int) ' ');
        org.joda.time.Chronology chronology48 = localDate45.getChronology();
        org.joda.time.DateTimeField dateTimeField49 = chronology48.minuteOfDay();
        org.joda.time.DurationField durationField50 = chronology48.days();
        org.joda.time.ReadableDuration readableDuration51 = null;
        org.joda.time.ReadableInstant readableInstant52 = null;
        org.joda.time.Period period53 = new org.joda.time.Period(readableDuration51, readableInstant52);
        org.joda.time.PeriodType periodType56 = null;
        org.joda.time.Period period57 = new org.joda.time.Period((long) 100, 1L, periodType56);
        org.joda.time.Period period59 = period57.minusSeconds((-1));
        java.lang.String str60 = period57.toString();
        org.joda.time.Period period61 = period57.toPeriod();
        org.joda.time.PeriodType periodType62 = period57.getPeriodType();
        org.joda.time.Period period63 = period53.normalizedStandard(periodType62);
        org.joda.time.Period period65 = period63.multipliedBy((int) (short) 100);
        org.joda.time.Seconds seconds66 = period65.toStandardSeconds();
        org.joda.time.Period period68 = period65.minusWeeks(58);
        int[] intArray70 = chronology48.get((org.joda.time.ReadablePeriod) period68, (long) 59);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray72 = dateTimeField28.addWrapPartial((org.joda.time.ReadablePartial) localDateTime41, 20, intArray70, 116);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969 + "'", int20 == 1969);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CA" + "'", str38, "CA");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "14" + "'", str39, "14");
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDate47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(period59);
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "PT0.099S" + "'", str60, "PT0.099S");
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(period63);
        org.junit.Assert.assertNotNull(period65);
        org.junit.Assert.assertNotNull(seconds66);
        org.junit.Assert.assertNotNull(period68);
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 0, 0, 0, 0, 0, 59]");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(chronology7);
        int int9 = dateTime8.getSecondOfMinute();
        boolean boolean10 = dateTime8.isEqualNow();
        int int11 = dateTime8.getDayOfYear();
        org.joda.time.Chronology chronology12 = dateTime8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(1969, 16, 39243612, 57, 457070, chronology12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 57 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 35 + "'", int9 == 35);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 52 + "'", int11 == 52);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("United States");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = timeZone1.getDisplayName(false, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 59");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        org.joda.time.DateTime dateTime5 = dateTime1.withDurationAdded((long) 6, 12);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (short) 1, chronology8);
        org.joda.time.Instant instant10 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType11 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableInstant) instant10, periodType11);
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate15 = localDate13.minusMonths((int) ' ');
        org.joda.time.Chronology chronology16 = localDate13.getChronology();
        org.joda.time.Period period17 = new org.joda.time.Period((long) (byte) 1, periodType11, chronology16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate20 = localDate18.minusMonths((int) ' ');
        org.joda.time.Chronology chronology21 = localDate18.getChronology();
        org.joda.time.DurationFieldType durationFieldType22 = org.joda.time.DurationFieldType.centuries();
        org.joda.time.LocalDate localDate24 = localDate18.withFieldAdded(durationFieldType22, (int) (byte) 100);
        boolean boolean25 = periodType11.isSupported(durationFieldType22);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType26.getRangeDurationType();
        boolean boolean28 = periodType11.isSupported(durationFieldType27);
        org.joda.time.Chronology chronology29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period30 = new org.joda.time.Period((java.lang.Object) 12, periodType11, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 35 + "'", int2 == 35);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(periodType11);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationFieldType22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.dayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (byte) -1, chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYear((int) (short) -1);
        int int15 = localDateTime12.getCenturyOfEra();
        int int16 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withDayOfYear(5);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = localDateTime12.getFields();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.hours();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime12.withFieldAdded(durationFieldType20, 51);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime12.plusYears(86396191);
        java.util.Locale locale26 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = localDateTime24.toString("2022-02-21T14:53:55.782Z", locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 31 + "'", int16 == 31);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldArray19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("United States");
        boolean boolean2 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Period period7 = new org.joda.time.Period((long) 100, 1L, periodType6);
        org.joda.time.Period period8 = period3.plus((org.joda.time.ReadablePeriod) period7);
        org.joda.time.Period period10 = period7.plusDays(53600069);
        org.joda.time.Period period12 = period10.plusMonths(39239);
        org.joda.time.Period period14 = period12.minusSeconds((-1));
        int int15 = period14.getSeconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Weeks weeks16 = period14.toStandardWeeks();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Weeks as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(period14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(44);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = period1.getValue(17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = org.joda.time.Period.parse("10:54:10.761");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"10:54:10.761\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.Period period1 = new org.joda.time.Period((long) 51);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str7 = dateTimeFieldType6.getName();
        int int8 = localDateTime0.indexOf(dateTimeFieldType6);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime0.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime0.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str14 = dateTimeFieldType13.getName();
        org.joda.time.LocalDateTime.Property property15 = localDateTime12.property(dateTimeFieldType13);
        int int16 = localDateTime12.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withMillisOfDay(1);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap22 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList23 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, strMap22);
        org.joda.time.Chronology chronology25 = null;
        java.util.Locale locale26 = java.util.Locale.GERMAN;
        java.util.Locale locale27 = java.util.Locale.CANADA;
        java.lang.String str28 = locale26.getDisplayVariant(locale27);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology25, locale27);
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = locale30.getDisplayVariant(locale31);
        java.util.Locale locale33 = java.util.Locale.GERMAN;
        java.util.Locale locale34 = java.util.Locale.CANADA;
        java.lang.String str35 = locale33.getDisplayVariant(locale34);
        java.lang.String str36 = locale33.getISO3Language();
        java.util.Locale locale37 = java.util.Locale.GERMAN;
        java.util.Locale locale38 = java.util.Locale.CANADA;
        java.lang.String str39 = locale37.getDisplayVariant(locale38);
        java.util.Locale locale40 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale41 = java.util.Locale.GERMAN;
        java.lang.String str42 = locale41.getDisplayName();
        java.util.Locale locale43 = java.util.Locale.CANADA;
        org.joda.time.Chronology chronology45 = null;
        java.util.Locale locale46 = java.util.Locale.GERMAN;
        java.util.Locale locale47 = java.util.Locale.CANADA;
        java.lang.String str48 = locale46.getDisplayVariant(locale47);
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long) (-1), chronology45, locale47, (java.lang.Integer) 10);
        java.util.Locale locale51 = java.util.Locale.GERMAN;
        java.lang.String str52 = locale51.getDisplayName();
        java.util.Locale locale53 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Locale locale54 = java.util.Locale.UK;
        java.util.Locale[] localeArray55 = new java.util.Locale[] { locale27, locale31, locale33, locale37, locale40, locale41, locale43, locale47, locale51, locale53, locale54 };
        java.util.ArrayList<java.util.Locale> localeList56 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList56, localeArray55);
        java.util.Locale.FilteringMode filteringMode58 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.util.Locale> localeList59 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList56, filteringMode58);
        boolean boolean60 = localDateTime18.equals((java.lang.Object) languageRangeList20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField62 = localDateTime18.getField(41);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 41");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "clockhourOfDay" + "'", str7, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + (-1) + "'", int8 == (-1));
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "dayOfMonth" + "'", str14, "dayOfMonth");
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 54 + "'", int16 == 54);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(languageRangeList23);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "de");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "deu" + "'", str36, "deu");
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "de");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "de");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "German" + "'", str42, "German");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "en_CA");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "de");
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "de");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "German" + "'", str52, "German");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale54);
        org.junit.Assert.assertEquals(locale54.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + true + "'", boolean57 == true);
        org.junit.Assert.assertTrue("'" + filteringMode58 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode58.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(localeList59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone3);
        org.joda.time.LocalTime localTime6 = localTime4.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime8 = localTime6.plusMillis((int) (byte) 100);
        org.joda.time.DateTime dateTime9 = dateTime2.withFields((org.joda.time.ReadablePartial) localTime8);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.minusMonths((int) ' ');
        org.joda.time.Chronology chronology14 = localDate11.getChronology();
        java.util.Locale locale15 = null;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket(0L, chronology14, locale15, (java.lang.Integer) 59, 12);
        org.joda.time.DurationField durationField19 = chronology14.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((java.lang.Object) dateTime2, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((-625), 22, 25, 1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -625 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.hourOfDay();
        org.joda.time.DateTimeField dateTimeField6 = property5.getField();
        boolean boolean7 = property5.isLeap();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        java.util.Locale locale9 = java.util.Locale.CANADA;
        java.lang.String str10 = locale8.getDisplayVariant(locale9);
        java.lang.String str11 = locale9.getCountry();
        java.lang.String str12 = property5.getAsShortText(locale9);
        java.util.Set<java.lang.String> strSet13 = locale9.getUnicodeLocaleAttributes();
        java.util.Locale.Builder builder14 = builder1.setLocale(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder16 = builder1.setVariant("PeriodType[Standard]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: PeriodType[Standard] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "CA" + "'", str11, "CA");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "14" + "'", str12, "14");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertNotNull(builder14);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(21, 47, 41, 22, 53639537);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53639537 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.Instant instant1 = new org.joda.time.Instant();
        org.joda.time.Instant instant3 = instant1.withMillis(0L);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.eras();
        java.util.Locale locale6 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket8 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology4, locale6, (java.lang.Integer) 39221019);
        org.joda.time.DateTimeField dateTimeField9 = chronology4.yearOfCentury();
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.eras();
        java.util.Locale locale16 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket18 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology14, locale16, (java.lang.Integer) 39221019);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property22 = localDateTime19.hourOfDay();
        org.joda.time.DateTimeField dateTimeField23 = property22.getField();
        int int24 = property22.get();
        org.joda.time.LocalDateTime localDateTime25 = property22.roundHalfFloorCopy();
        long long27 = chronology14.set((org.joda.time.ReadablePartial) localDateTime25, (long) 2022);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now(chronology14);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology14);
        org.joda.time.DurationField durationField30 = chronology14.eras();
        org.joda.time.DateTimeField dateTimeField31 = chronology14.weekyear();
        org.joda.time.Chronology chronology32 = chronology14.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((java.lang.Object) chronology4, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeField23);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 14 + "'", int24 == 14);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 1645455600000L + "'", long27 == 1645455600000L);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(durationField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(chronology32);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property10 = localDateTime7.hourOfDay();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str14 = dateTimeFieldType13.getName();
        int int15 = localDateTime7.indexOf(dateTimeFieldType13);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime7.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime7.minusSeconds((int) '#');
        org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property23 = localDateTime20.hourOfDay();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str27 = dateTimeFieldType26.getName();
        int int28 = localDateTime20.indexOf(dateTimeFieldType26);
        org.joda.time.LocalDateTime localDateTime30 = localDateTime20.minusSeconds(0);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (short) 1, chronology32);
        org.joda.time.Instant instant34 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType35 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime33, (org.joda.time.ReadableInstant) instant34, periodType35);
        org.joda.time.Period period37 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime7, (org.joda.time.ReadablePartial) localDateTime30, periodType35);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.UTC;
        long long41 = dateTimeZone38.convertLocalToUTC((long) (byte) 100, false);
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(dateTimeZone38);
        org.joda.time.DateTime dateTime43 = localDateTime7.toDateTime(dateTimeZone38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime(41, 39266896, 35, 55, 457070, 86396, 39251167, dateTimeZone38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 55 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "clockhourOfDay" + "'", str14, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "clockhourOfDay" + "'", str27, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(periodType35);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertNotNull(dateTime43);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.ReadableInstant readableInstant3 = null;
        org.joda.time.Period period4 = new org.joda.time.Period(readableDuration2, readableInstant3);
        org.joda.time.Period period6 = period4.withDays((int) (byte) 1);
        org.joda.time.Period period8 = period6.minusWeeks(100);
        org.joda.time.Period period10 = period8.withDays(1);
        org.joda.time.LocalDate localDate12 = localDate0.withPeriodAdded((org.joda.time.ReadablePeriod) period8, 642);
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((int) (short) 10, 100, (int) 'a', 21);
        mutablePeriod17.addYears(59);
        org.joda.time.Instant instant22 = new org.joda.time.Instant();
        org.joda.time.Instant instant24 = instant22.withMillis(0L);
        org.joda.time.Chronology chronology25 = instant24.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.eras();
        java.util.Locale locale27 = java.util.Locale.UK;
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket29 = new org.joda.time.format.DateTimeParserBucket((long) '#', chronology25, locale27, (java.lang.Integer) 39221019);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((long) 53, chronology25);
        org.joda.time.ReadableDuration readableDuration31 = null;
        org.joda.time.ReadableInstant readableInstant32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period(readableDuration31, readableInstant32);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 100, 1L, periodType36);
        org.joda.time.Period period39 = period37.minusSeconds((-1));
        java.lang.String str40 = period37.toString();
        org.joda.time.Period period41 = period37.toPeriod();
        org.joda.time.PeriodType periodType42 = period37.getPeriodType();
        org.joda.time.Period period43 = period33.normalizedStandard(periodType42);
        boolean boolean44 = localDate30.equals((java.lang.Object) period33);
        org.joda.time.Interval interval45 = localDate30.toInterval();
        mutablePeriod17.add((org.joda.time.ReadableInterval) interval45);
        org.joda.time.LocalDate localDate47 = localDate0.plus((org.joda.time.ReadablePeriod) mutablePeriod17);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod17.setValue((int) 'x', 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 120");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(period6);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(instant24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_GB");
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "PT0.099S" + "'", str40, "PT0.099S");
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertNotNull(period43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertNotNull(localDate47);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (short) 10, 22, 53600069);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53600069 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        mutableDateTime1.addHours(39251693);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime(chronology0);
        int int2 = dateTime1.getSecondOfMinute();
        int int3 = dateTime1.getYearOfEra();
        org.joda.time.LocalTime localTime4 = dateTime1.toLocalTime();
        org.joda.time.LocalTime.Property property5 = localTime4.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime4.withSecondOfMinute((-625));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -625 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 37 + "'", int2 == 37);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 2022 + "'", int3 == 2022);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.era();
        org.joda.time.LocalDate localDate5 = property4.roundCeilingCopy();
        org.joda.time.LocalDate.Property property6 = localDate5.weekyear();
        org.joda.time.LocalDate localDate8 = localDate5.plusMonths(44);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology9);
        int int11 = dateTime10.getYearOfCentury();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = null;
        java.lang.String str13 = dateTime10.toString(dateTimeFormatter12);
        org.joda.time.DateTime dateTime15 = dateTime10.plusMonths(86396191);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(chronology18);
        int int20 = dateTime19.getSecondOfMinute();
        boolean boolean21 = dateTime19.isEqualNow();
        int int22 = dateTime19.getDayOfYear();
        org.joda.time.Chronology chronology23 = dateTime19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology23);
        org.joda.time.DateTime dateTime25 = dateTime15.toDateTime(chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period26 = new org.joda.time.Period((java.lang.Object) 44, chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 22 + "'", int11 == 22);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-21T14:54:37.428Z" + "'", str13, "2022-02-21T14:54:37.428Z");
        org.junit.Assert.assertNotNull(dateTime15);
// flaky:         org.junit.Assert.assertTrue("'" + int20 + "' != '" + 37 + "'", int20 == 37);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 52 + "'", int22 == 52);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property1 = localDateTime0.monthOfYear();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 1, chronology3);
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType6 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime4, (org.joda.time.ReadableInstant) instant5, periodType6);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int9 = instant5.get(dateTimeFieldType8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime0.withField(dateTimeFieldType8, 39);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusSeconds(52);
        int int14 = localDateTime13.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.plusWeeks(22);
        org.joda.time.DateTime dateTime17 = localDateTime13.toDateTime();
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType22 = null;
        org.joda.time.Period period23 = new org.joda.time.Period((long) 100, 1L, periodType22);
        org.joda.time.PeriodType periodType26 = null;
        org.joda.time.Period period27 = new org.joda.time.Period((long) 100, 1L, periodType26);
        org.joda.time.Period period28 = period23.plus((org.joda.time.ReadablePeriod) period27);
        org.joda.time.Instant instant29 = new org.joda.time.Instant();
        org.joda.time.Instant instant31 = instant29.withMillis(0L);
        org.joda.time.Duration duration32 = period27.toDurationTo((org.joda.time.ReadableInstant) instant31);
        mutableDateTime19.add((org.joda.time.ReadableDuration) duration32, 39);
        org.joda.time.MutableDateTime.Property property35 = mutableDateTime19.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime19.setZone(dateTimeZone36);
        org.joda.time.DateTime dateTime38 = dateTime17.withZone(dateTimeZone36);
        org.joda.time.MutableDateTime mutableDateTime40 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType43 = null;
        org.joda.time.Period period44 = new org.joda.time.Period((long) 100, 1L, periodType43);
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period((long) 100, 1L, periodType47);
        org.joda.time.Period period49 = period44.plus((org.joda.time.ReadablePeriod) period48);
        org.joda.time.Instant instant50 = new org.joda.time.Instant();
        org.joda.time.Instant instant52 = instant50.withMillis(0L);
        org.joda.time.Duration duration53 = period48.toDurationTo((org.joda.time.ReadableInstant) instant52);
        mutableDateTime40.add((org.joda.time.ReadableDuration) duration53, 39);
        java.lang.String str56 = mutableDateTime40.toString();
        boolean boolean57 = mutableDateTime40.isEqualNow();
        boolean boolean58 = dateTime17.isBefore((org.joda.time.ReadableInstant) mutableDateTime40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime60 = dateTime17.withHourOfDay(97);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 894 + "'", int9 == 894);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(instant52);
        org.junit.Assert.assertNotNull(duration53);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1969-12-31T23:59:56.191Z" + "'", str56, "1969-12-31T23:59:56.191Z");
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.Instant instant3 = new org.joda.time.Instant();
        org.joda.time.PeriodType periodType4 = org.joda.time.PeriodType.days();
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime2, (org.joda.time.ReadableInstant) instant3, periodType4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfDay();
        int int7 = instant3.get(dateTimeFieldType6);
        java.lang.String str8 = dateTimeFieldType6.getName();
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Chronology chronology14 = instant13.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.eras();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology14);
        org.joda.time.DateTimeField dateTimeField17 = dateTimeFieldType6.getField(chronology14);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.monthOfYear();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(chronology20);
        int int22 = dateTime21.getSecondOfMinute();
        boolean boolean23 = dateTime21.isEqualNow();
        int int24 = dateTime21.getDayOfYear();
        org.joda.time.Chronology chronology25 = dateTime21.getChronology();
        long long26 = property19.getDifferenceAsLong((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.LocalDateTime localDateTime27 = property19.roundFloorCopy();
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime((-1511999969L));
        org.joda.time.LocalDateTime localDateTime30 = localDateTime27.withFields((org.joda.time.ReadablePartial) localDateTime29);
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property35 = localDateTime32.hourOfDay();
        org.joda.time.LocalDateTime localDateTime37 = localDateTime32.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str39 = dateTimeFieldType38.getName();
        int int40 = localDateTime32.indexOf(dateTimeFieldType38);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime32.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime32.minusSeconds((int) '#');
        org.joda.time.Chronology chronology45 = localDateTime44.getChronology();
        org.joda.time.ReadableDuration readableDuration46 = null;
        org.joda.time.ReadableInstant readableInstant47 = null;
        org.joda.time.Period period48 = new org.joda.time.Period(readableDuration46, readableInstant47);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = new org.joda.time.Period((long) 100, 1L, periodType51);
        org.joda.time.Period period54 = period52.minusSeconds((-1));
        java.lang.String str55 = period52.toString();
        org.joda.time.Period period56 = period52.toPeriod();
        org.joda.time.PeriodType periodType57 = period52.getPeriodType();
        org.joda.time.Period period58 = period48.normalizedStandard(periodType57);
        org.joda.time.Period period60 = period58.multipliedBy((int) (short) 100);
        int[] intArray62 = chronology45.get((org.joda.time.ReadablePeriod) period58, 2629746000L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray64 = dateTimeField17.addWrapPartial((org.joda.time.ReadablePartial) localDateTime27, (int) 'x', intArray62, 57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 120");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
// flaky:         org.junit.Assert.assertTrue("'" + int7 + "' != '" + 894 + "'", int7 == 894);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "minuteOfDay" + "'", str8, "minuteOfDay");
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 37 + "'", int22 == 37);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 52 + "'", int24 == 52);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "clockhourOfDay" + "'", str39, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + (-1) + "'", int40 == (-1));
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(period54);
        org.junit.Assert.assertEquals("'" + str55 + "' != '" + "PT0.099S" + "'", str55, "PT0.099S");
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(periodType57);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 4, 2, 10, 29, 6, 0]");
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("java.io.IOException: Coordinated Universal Time");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'java.io.IOException: Coordinated Universal Time' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) 42, (long) 49, chronology2);
        mutablePeriod3.setPeriod((-1511999969L));
        mutablePeriod3.setSeconds(0);
        mutablePeriod3.add((int) 'x', 12022, 41, 86396, 1, 16, 15, (int) ' ');
        mutablePeriod3.setPeriod(1969, 14, (-292275054), 25, 819, 0, 19, 22);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(893, (int) ' ', 365, 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 893 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
        mutableDateTime1.setZone(dateTimeZone18);
        int int20 = mutableDateTime1.getYearOfEra();
        int int21 = mutableDateTime1.getMinuteOfHour();
        org.joda.time.MutableDateTime.Property property22 = mutableDateTime1.year();
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate25 = localDate23.minusMonths((int) ' ');
        org.joda.time.Chronology chronology26 = localDate23.getChronology();
        mutableDateTime1.setChronology(chronology26);
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType32 = null;
        org.joda.time.Period period33 = new org.joda.time.Period((long) 100, 1L, periodType32);
        org.joda.time.PeriodType periodType36 = null;
        org.joda.time.Period period37 = new org.joda.time.Period((long) 100, 1L, periodType36);
        org.joda.time.Period period38 = period33.plus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.Instant instant39 = new org.joda.time.Instant();
        org.joda.time.Instant instant41 = instant39.withMillis(0L);
        org.joda.time.Duration duration42 = period37.toDurationTo((org.joda.time.ReadableInstant) instant41);
        mutableDateTime29.add((org.joda.time.ReadableDuration) duration42, 39);
        org.joda.time.MutableDateTime.Property property45 = mutableDateTime29.yearOfEra();
        mutableDateTime29.setWeekOfWeekyear(14);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime29.minuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.UTC;
        long long52 = dateTimeZone49.convertLocalToUTC((long) (byte) 100, false);
        mutableDateTime29.setZone(dateTimeZone49);
        mutableDateTime1.setZoneRetainFields(dateTimeZone49);
        org.joda.time.MutableDateTime mutableDateTime55 = new org.joda.time.MutableDateTime(dateTimeZone49);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime55.setWeekOfWeekyear(1969);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1969 + "'", int20 == 1969);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 59 + "'", int21 == 59);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(period38);
        org.junit.Assert.assertNotNull(instant41);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 100L + "'", long52 == 100L);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean18 = mutableDateTime1.isSupported(dateTimeFieldType17);
        int int19 = mutableDateTime1.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfHour(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (short) 100, chronology1);
        org.joda.time.DateTime dateTime3 = localTime2.toDateTimeToday();
        int int4 = dateTime3.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 52 + "'", int4 == 52);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.Chronology chronology6 = null;
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.util.Locale locale8 = locale7.stripExtensions();
        org.joda.time.format.DateTimeParserBucket dateTimeParserBucket11 = new org.joda.time.format.DateTimeParserBucket((long) 'a', chronology6, locale7, (java.lang.Integer) 45, (int) '4');
        org.joda.time.DateTimeZone dateTimeZone12 = dateTimeParserBucket11.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(15, (int) 'a', 55, 50, 10, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 1, chronology1);
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 1, chronology5);
        org.joda.time.DateTime dateTime7 = dateTime6.toDateTime();
        int int8 = dateTime3.compareTo((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.DateTime.Property property9 = dateTime3.hourOfDay();
        org.joda.time.DateTime.Property property10 = dateTime3.centuryOfEra();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology13);
        int int15 = dateTime14.getSecondOfMinute();
        boolean boolean16 = dateTime14.isEqualNow();
        int int17 = dateTime14.getDayOfYear();
        org.joda.time.Chronology chronology18 = dateTime14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) (byte) 0, (long) '#', chronology18);
        int int20 = mutablePeriod19.getDays();
        org.joda.time.DateTime dateTime21 = dateTime3.minus((org.joda.time.ReadablePeriod) mutablePeriod19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = dateTime21.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 38 + "'", int15 == 38);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 52 + "'", int17 == 52);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        mutableDateTime1.addYears(3);
        mutableDateTime1.addMinutes(22);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDate(26, 54, 39221019);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears(1);
        int int4 = localDate0.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDate0.getField(894);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 894");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2022-02-21T14:54:14.351Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-21t14:54:14.351z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(0L, dateTimeZone1);
        long long5 = dateTimeZone1.convertLocalToUTC((long) 3, true);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime6.setDayOfWeek(33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 33 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 3L + "'", long5 == 3L);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime((long) (byte) -1);
        java.util.Locale locale21 = java.util.Locale.GERMAN;
        java.lang.String str22 = locale21.getDisplayName();
        java.util.Calendar calendar23 = mutableDateTime20.toCalendar(locale21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime24 = property17.set("en", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"en\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "German" + "'", str22, "German");
        org.junit.Assert.assertNotNull(calendar23);
        org.junit.Assert.assertEquals(calendar23.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("PT86400S", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property18 = mutableDateTime1.minuteOfHour();
        java.lang.String str19 = property18.getAsShortText();
        java.util.Locale locale20 = java.util.Locale.GERMAN;
        java.util.Locale locale21 = locale20.stripExtensions();
        int int22 = property18.getMaximumTextLength(locale21);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withHourOfDay(10);
        org.joda.time.DateTimeField dateTimeField29 = localDateTime27.getField((int) (byte) 0);
        java.util.Locale locale31 = java.util.Locale.CANADA;
        java.lang.String str32 = dateTimeField29.getAsShortText((long) (byte) 1, locale31);
        java.lang.String str33 = locale21.getDisplayName(locale31);
        java.util.Locale locale34 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = locale21.getDisplayLanguage(locale34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "59" + "'", str19, "59");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "de");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "de");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "1970" + "'", str32, "1970");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "German" + "'", str33, "German");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusSeconds((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localTime5.getValue(51);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 51");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property3 = localDateTime0.hourOfDay();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        int int5 = property3.get();
        org.joda.time.LocalDateTime localDateTime6 = property3.roundHalfFloorCopy();
        org.joda.time.DateTimeField dateTimeField7 = property3.getField();
        int int9 = dateTimeField7.get((long) 'a');
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.hourOfDay();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.plusMillis((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        java.lang.String str17 = dateTimeFieldType16.getName();
        int int18 = localDateTime10.indexOf(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime10.minusSeconds(0);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime10.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.dayOfMonth();
        java.lang.String str24 = dateTimeFieldType23.getName();
        org.joda.time.LocalDateTime.Property property25 = localDateTime22.property(dateTimeFieldType23);
        int int26 = localDateTime22.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime22.withMillisOfDay(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter29 = null;
        java.lang.String str30 = localDateTime28.toString(dateTimeFormatter29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime28.plusMonths(53600069);
        int[] intArray35 = new int[] { (short) 0 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray37 = dateTimeField7.set((org.joda.time.ReadablePartial) localDateTime32, 18, intArray35, 39266896);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39266896 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 14 + "'", int5 == 14);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "clockhourOfDay" + "'", str17, "clockhourOfDay");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "dayOfMonth" + "'", str24, "dayOfMonth");
        org.junit.Assert.assertNotNull(property25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 54 + "'", int26 == 54);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "2022-02-21T00:00:00.001" + "'", str30, "2022-02-21T00:00:00.001");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[0]");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withHourOfDay(10);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property8 = localDateTime5.hourOfDay();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.plusMillis((int) (byte) 0);
        int int11 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime5);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withMillisOfSecond(12);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.minusWeeks((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime19 = localDateTime13.withDate(7, 46, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + (-1) + "'", int11 == (-1));
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.era();
        org.joda.time.LocalDate localDate5 = property4.roundCeilingCopy();
        org.joda.time.LocalDate.Property property6 = localDate5.weekyear();
        org.joda.time.LocalDate localDate7 = property6.roundHalfEvenCopy();
        boolean boolean8 = property6.isLeap();
        org.joda.time.LocalDate localDate9 = property6.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType11 = localDate9.getFieldType(893);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 893");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.ReadableInstant readableInstant0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant0, readableInstant1, periodType2);
        mutablePeriod3.setYears((int) '#');
        org.joda.time.Chronology chronology7 = null;
        mutablePeriod3.add((long) 1, chronology7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        mutablePeriod3.setPeriod(readableInterval9);
        int int11 = mutablePeriod3.getWeeks();
        mutablePeriod3.setMinutes(39);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.add(53, (int) 'u', (int) '#', (-1), 0, 51, 100, 751);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'months'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(19, 894);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 894 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((int) 'a', 2025, (int) (short) -1, 3, 6, (int) 'a', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType3 = localDate0.getFieldType(22);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 22");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("2022-02-21T14:54:16.756", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-21t14:54:16.756");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period2 = duration1.toPeriod();
        org.joda.time.Duration duration5 = duration1.withDurationAdded((long) 38, (int) 'a');
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardSeconds(10L);
        mutableDateTime7.add((org.joda.time.ReadableDuration) duration9, (int) (short) 100);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(chronology12);
        int int14 = dateTime13.getYearOfCentury();
        org.joda.time.Interval interval15 = duration9.toIntervalTo((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.Duration duration16 = duration5.minus((org.joda.time.ReadableDuration) duration9);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (short) 1, chronology18);
        org.joda.time.DateTime dateTime20 = dateTime19.toDateTime();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 1, chronology22);
        org.joda.time.DateTime dateTime24 = dateTime23.toDateTime();
        int int25 = dateTime20.compareTo((org.joda.time.ReadableInstant) dateTime23);
        org.joda.time.PeriodType periodType26 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType27 = periodType26.withDaysRemoved();
        org.joda.time.Period period28 = duration9.toPeriodTo((org.joda.time.ReadableInstant) dateTime23, periodType26);
        org.joda.time.LocalDateTime localDateTime29 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime31 = localDateTime29.withHourOfDay(10);
        org.joda.time.LocalDateTime.Property property32 = localDateTime29.hourOfDay();
        org.joda.time.DateTimeField dateTimeField33 = property32.getField();
        boolean boolean34 = property32.isLeap();
        java.util.Locale locale35 = java.util.Locale.GERMAN;
        java.util.Locale locale36 = java.util.Locale.CANADA;
        java.lang.String str37 = locale35.getDisplayVariant(locale36);
        java.lang.String str38 = locale36.getCountry();
        java.lang.String str39 = property32.getAsShortText(locale36);
        org.joda.time.LocalDateTime localDateTime41 = property32.addWrapFieldToCopy((int) (byte) 100);
        org.joda.time.DateTime dateTime42 = dateTime23.withFields((org.joda.time.ReadablePartial) localDateTime41);
        int int43 = dateTime42.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant44 = new org.joda.time.Instant((java.lang.Object) int43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(period2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 22 + "'", int14 == 22);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(periodType26);
        org.junit.Assert.assertNotNull(periodType27);
        org.junit.Assert.assertNotNull(period28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "de");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "CA" + "'", str38, "CA");
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "14" + "'", str39, "14");
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 21 + "'", int43 == 21);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.dayOfMonth();
        org.joda.time.Chronology chronology2 = localDate0.getChronology();
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate3.withYearOfCentury(39266896);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39266896 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(chronology2);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate2 = localDate0.minusMonths((int) ' ');
        int int3 = localDate0.size();
        org.joda.time.LocalDate.Property property4 = localDate0.era();
        java.lang.String str5 = localDate0.toString();
        org.joda.time.LocalDate localDate7 = localDate0.withYearOfEra(54);
        org.joda.time.LocalDate.Property property8 = localDate7.yearOfCentury();
        java.util.Date date9 = localDate7.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromDateFields(date9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -999 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "2022-02-21" + "'", str5, "2022-02-21");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Feb 21 00:00:00 UTC 54");
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("2022-02-21T14:54:05.731Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis(0L);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.eras();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (short) 10, (long) '#', chronology5);
        org.joda.time.DateTimeField dateTimeField8 = chronology5.monthOfYear();
        org.joda.time.DateTimeField dateTimeField9 = chronology5.dayOfMonth();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) (byte) -1, chronology11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withYear((int) (short) -1);
        int int15 = localDateTime12.getCenturyOfEra();
        int int16 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime12.withDayOfYear(5);
        int int19 = localDateTime12.getCenturyOfEra();
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 31 + "'", int16 == 31);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 19 + "'", int19 == 19);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("United States", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        int int2 = mutableDateTime1.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfWeek((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.Duration duration18 = org.joda.time.Duration.standardDays((long) (byte) 1);
        org.joda.time.Period period19 = duration18.toPeriod();
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.centuries();
        int int21 = period19.get(durationFieldType20);
        mutableDateTime1.add((org.joda.time.ReadablePeriod) period19, 54);
        mutableDateTime1.setMillisOfDay(0);
        org.joda.time.MutableDateTime.Property property26 = mutableDateTime1.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant27 = new org.joda.time.Instant((java.lang.Object) property26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.MutableDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(duration18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(property26);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.PeriodType periodType2 = null;
        org.joda.time.Period period3 = new org.joda.time.Period((long) 100, 1L, periodType2);
        org.joda.time.Period period5 = period3.minusSeconds((-1));
        java.lang.String str6 = period3.toString();
        org.joda.time.Period period7 = period3.toPeriod();
        org.joda.time.MutablePeriod mutablePeriod8 = period7.toMutablePeriod();
        org.joda.time.Period period10 = period7.minusDays(40);
        org.joda.time.Period period11 = period7.normalizedStandard();
        org.joda.time.Hours hours12 = period11.toStandardHours();
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "PT0.099S" + "'", str6, "PT0.099S");
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertNotNull(mutablePeriod8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertNotNull(hours12);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) '4');
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period((long) 100, 1L, periodType4);
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = new org.joda.time.Period((long) 100, 1L, periodType8);
        org.joda.time.Period period10 = period5.plus((org.joda.time.ReadablePeriod) period9);
        org.joda.time.Instant instant11 = new org.joda.time.Instant();
        org.joda.time.Instant instant13 = instant11.withMillis(0L);
        org.joda.time.Duration duration14 = period9.toDurationTo((org.joda.time.ReadableInstant) instant13);
        mutableDateTime1.add((org.joda.time.ReadableDuration) duration14, 39);
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime1.yearOfEra();
        int int18 = mutableDateTime1.getSecondOfMinute();
        java.lang.String str19 = mutableDateTime1.toString();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setHourOfDay(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(instant13);
        org.junit.Assert.assertNotNull(duration14);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 56 + "'", int18 == 56);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1969-12-31T23:59:56.191Z" + "'", str19, "1969-12-31T23:59:56.191Z");
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        org.joda.time.LocalTime localTime3 = localTime1.minusHours((int) (byte) 100);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.eras();
        boolean boolean7 = localTime3.isSupported(durationFieldType6);
        org.joda.time.LocalTime localTime9 = localTime3.withMillisOfDay(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime3.withField(dateTimeFieldType10, 39243612);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 39243612 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }
}
