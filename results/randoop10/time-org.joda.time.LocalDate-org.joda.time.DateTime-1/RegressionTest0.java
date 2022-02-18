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
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, (int) 'a', (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(0, 100, 1, chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) 'a', (int) 'a', (int) 'a', (int) (short) 10, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
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
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
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
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        int int0 = org.joda.time.YearMonthDay.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property6 = yearMonthDay1.property(dateTimeFieldType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.Chronology chronology5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (byte) 1, (int) (short) 1, 0, (int) (short) 100, (int) '#', chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.util.Locale locale0 = java.util.Locale.FRANCE;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((java.lang.Object) locale0, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_FR");
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
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
        int int0 = org.joda.time.TimeOfDay.MILLIS_OF_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = yearMonthDay1.getValue(16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        java.lang.Class<?> wildcardClass10 = dateTime4.getClass();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime1.withMinuteOfHour((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572868361,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=48,MILLISECOND=361,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        int int8 = localTime6.getValue((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean9 = yearMonthDay1.isEqual((org.joda.time.ReadablePartial) localTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644572868458,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=48,MILLISECOND=458,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = null;
        // The following exception was thrown during execution in test generation
        try {
            calendar0.setTime(date1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572868595,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=48,MILLISECOND=595,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.set(9, 1, (int) ' ', 0, 16);
        java.util.Locale locale9 = java.util.Locale.FRANCE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = calendar0.getDisplayName((int) (short) 0, (int) '#', locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=9,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=32,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=0,MINUTE=16,SECOND=48,MILLISECOND=615,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr_FR");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(9, 0, (int) (byte) 100, 0, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            int int3 = yearMonthDay1.get(dateTimeFieldType2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((-1), 2, (int) '4', (int) (short) 0, (int) ' ', 20, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("United States", (double) (-1L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-1.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        java.util.Locale locale4 = java.util.Locale.UK;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap5 = calendar0.getDisplayNames(100, (int) 'a', locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572868774,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=48,MILLISECOND=774,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((java.lang.Object) 20, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.Interval interval9 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Chronology chronology11 = interval9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(16, (int) 'u', 0, 10, 2022, 16, 3, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTime dateTime2 = localTime1.toDateTimeToday();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay(dateTimeZone3);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.minusDays(0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = localTime1.isBefore((org.joda.time.ReadablePartial) yearMonthDay4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572868971,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=48,MILLISECOND=971,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(yearMonthDay6);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.set((int) (byte) -1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572869174,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=49,MILLISECOND=174,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
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
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType16 = yearMonthDay7.getFieldType((int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 117");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (short) -1, (int) 'u', 32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay.Property property2 = timeOfDay0.property(dateTimeFieldType1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.MIDNIGHT;
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale8 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeField5.set((long) 4, "", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it_IT");
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime4.withDate((-1), (int) ' ', 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localTime1.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572870046,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=50,MILLISECOND=46,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "09:47:50.046" + "'", str4, "09:47:50.046");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.util.Locale locale0 = java.util.Locale.SIMPLIFIED_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((java.lang.Object) locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = new org.joda.time.Interval((java.lang.Object) 10L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        int int5 = dateTime4.getCenturyOfEra();
        org.joda.time.DateTime dateTime7 = dateTime4.plusMillis((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime4.withDate((int) (short) 10, 371, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 371 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
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
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("de");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'de' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getVariant();
        java.lang.Class<?> wildcardClass2 = locale0.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertNotNull(wildcardClass2);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = dateTimeField5.getAsShortText(3, locale7);
        java.lang.Class<?> wildcardClass10 = dateTimeField5.getClass();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = localTime1.withFieldAdded(durationFieldType2, 32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'years' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572871034,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=51,MILLISECOND=34,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) (byte) 100, 15, 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        int int3 = localDateTime2.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay1.withField(dateTimeFieldType6, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime dateTime11 = property9.roundHalfCeilingCopy();
        java.util.Date date12 = dateTime11.toDate();
        int int13 = date12.getDate();
        org.joda.time.YearMonthDay yearMonthDay14 = org.joda.time.YearMonthDay.fromDateFields(date12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField16 = yearMonthDay14.getField(15);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 15");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Jan 03 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(yearMonthDay14);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime dateTime15 = dateTime10.withTime(2, 22, 10, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        int int12 = dateTime10.getSecondOfDay();
        org.joda.time.DateTime dateTime14 = dateTime10.plusWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime14.plusDays(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 9223371988912071275 + 170208000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35271 + "'", int12 == 35271);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime6 = interval5.getEnd();
        org.joda.time.Chronology chronology7 = interval5.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.minutes();
        org.joda.time.DurationField durationField9 = chronology7.weekyears();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTimeField dateTimeField11 = chronology7.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(1, 2, 50, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for dayOfMonth must not be larger than 31");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        calendar0.set((int) '#', (int) 'u', 20, 15, (int) '4', 0);
        int int10 = calendar0.get(2);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-60753485279668,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=44,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=294,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=52,SECOND=0,MILLISECOND=332,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 9 + "'", int10 == 9);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 15);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = timeOfDay1.withFieldAdded(durationFieldType2, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'years' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(durationFieldType2);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.Interval interval4 = interval2.withDurationBeforeEnd(readableDuration3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval6 = interval4.withEndMillis((long) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval4);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay((java.lang.Object) dateTimeField16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.GJEraDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = dateTimeField5.getAsShortText(3, locale7);
        int int10 = dateTimeField5.getMaximumValue();
        java.util.Locale locale13 = java.util.Locale.CHINA;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeField5.set(1L, "en", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"en\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_CN");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.era();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology14.getDateTimeMillis((int) ' ', 100, 4, 4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long22 = chronology14.getDateTimeMillis(16, 0, 0, (int) (short) 1, 100, 371, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = dateTimeField5.getAsShortText(3, locale7);
        long long11 = dateTimeField5.roundHalfCeiling((long) 8);
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = dateTimeField5.getAsShortText(434, locale13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((java.lang.Object) dateTimeField5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "434" + "'", str14, "434");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = localTime1.toString("292278993-02-08T09:47:51.966Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        calendar0.setFirstDayOfWeek((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar0.getMaximum(50);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 50");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878472058,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=52,MILLISECOND=58,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = calendar0.getTime();
        java.lang.String str2 = date1.toString();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572872067,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=52,MILLISECOND=67,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Fri Feb 11 09:47:52 UTC 2022");
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "Fri Feb 11 09:47:52 UTC 2022" + "'", str2, "Fri Feb 11 09:47:52 UTC 2022");
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime dateTime11 = property9.roundHalfCeilingCopy();
        int int12 = property9.get();
        java.util.Locale locale14 = java.util.Locale.ITALY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = property9.setCopy("de", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"de\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "it_IT");
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = localDate2.toString("Feb");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: F");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.withPeriodAdded(readablePeriod1, 0);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone4);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay5.toDateTime(timeOfDay6, dateTimeZone7);
        boolean boolean9 = dateTime8.isBeforeNow();
        org.joda.time.DateTime dateTime11 = dateTime8.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean13 = dateTime11.isSupported(dateTimeFieldType12);
        org.joda.time.DurationFieldType durationFieldType14 = dateTimeFieldType12.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight16 = dateMidnight3.withField(dateTimeFieldType12, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight0);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(durationFieldType14);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        java.util.Locale locale4 = java.util.Locale.CHINA;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight6 = property2.setCopy("", locale4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(charSet5);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) (short) 0, 434, 32770, 16, 13, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 434 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        int int3 = localDateTime2.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusDays(2);
        int int6 = localDateTime2.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property7.setCopy("en");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"en\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.Interval interval10 = interval2.overlap((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Duration duration11 = interval10.toDuration();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTime(timeOfDay14, dateTimeZone15);
        boolean boolean17 = dateTime16.isBeforeNow();
        org.joda.time.DateTime dateTime19 = dateTime16.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime23 = dateTime21.minusHours((int) (byte) 100);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration11, (org.joda.time.ReadableInstant) dateTime21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval26 = interval24.withEndMillis((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.lang.String str1 = locale0.getVariant();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "" + "'", str1, "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "de" + "'", str2, "de");
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.withYear(22);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = yearMonthDay1.toDateMidnight(dateTimeZone6);
        java.lang.Object obj8 = null;
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DurationField durationField15 = chronology13.minutes();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.clockhourOfHalfday();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(obj8, chronology13);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = yearMonthDay1.compareTo((org.joda.time.ReadablePartial) localTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = dateTimeField5.getAsShortText(3, locale7);
        long long11 = dateTimeField5.roundHalfCeiling((long) 8);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.monthOfYear();
        int int16 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.ReadablePartial readablePartial17 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = localDateTime14.isAfter(readablePartial17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292278993 + "'", int16 == 292278993);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property2.addToCopy(0);
        java.util.Locale locale6 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = property2.setCopy("Jan 3, 2022 12:00:00 AM", locale6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Jan 3, 2022 12:00:00 AM\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime dateTime15 = dateTime10.withTime(2, 22, 10, 5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime15.withDate(50, 70, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = dateTimeField5.getAsShortText(3, locale7);
        long long11 = dateTimeField5.roundHalfCeiling((long) 8);
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = dateTimeField5.getAsShortText(434, locale13);
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str19 = locale17.getExtension('a');
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField5.set((long) 35271, "09:47:51.583", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:47:51.583\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "434" + "'", str14, "434");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNull(str19);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = property2.setCopy("09:47:51.659");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:47:51.659\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("Feb", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.Interval interval4 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime5 = interval4.getEnd();
        org.joda.time.Chronology chronology6 = interval4.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.minutes();
        org.joda.time.DurationField durationField8 = chronology6.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(32770, 9, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("09:47:53.715", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(434, 9, 292278993, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("292278993-02-08T09:47:49.781Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '292278993-02-08T09:47:49.781Z' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        java.lang.Object obj0 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.year();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfHalfday();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(obj0, chronology5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = localTime9.withSecondOfMinute((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        int int4 = localDateTime2.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withDayOfMonth(32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = org.joda.time.DateMidnight.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        int int3 = localDateTime2.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusDays(2);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime7.withDate((int) 'a', 871, 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 871 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        calendar0.set((int) '#', (int) 'u', 20, 15, (int) '4', 0);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add((int) (short) 100, 434);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=35,MONTH=117,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=20,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=15,MINUTE=52,SECOND=0,MILLISECOND=356,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        java.util.Date date4 = calendar0.getTime();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateTime.Property property14 = dateTime9.weekyear();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime16 = property14.roundHalfCeilingCopy();
        java.util.Date date17 = dateTime16.toDate();
        int int18 = date17.getDate();
        org.joda.time.YearMonthDay yearMonthDay19 = org.joda.time.YearMonthDay.fromDateFields(date17);
        boolean boolean20 = date4.before(date17);
        int int21 = date17.getMinutes();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878474446,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=54,MILLISECOND=446,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Jul 15 09:47:54 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 03 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("Property[monthOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: Property[monthOfYear]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.minusHours((int) (byte) 100);
        org.joda.time.DateTime.Property property12 = dateTime11.secondOfDay();
        java.lang.String str13 = property12.getName();
        org.joda.time.DateTime dateTime15 = property12.addWrapFieldToCopy(292278993);
        int int16 = dateTime15.getYearOfCentury();
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Chronology chronology22 = interval20.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.minutes();
        org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long) 35271, chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((java.lang.Object) int16, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "secondOfDay" + "'", str13, "secondOfDay");
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 22 + "'", int16 == 22);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime1.property(dateTimeFieldType7);
        org.joda.time.LocalTime localTime11 = property9.setCopy((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) localTime11, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572874603,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=54,MILLISECOND=603,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "09:47:54.603" + "'", str4, "09:47:54.603");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644572874603,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=54,MILLISECOND=603,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.withYear(22);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = yearMonthDay1.toDateMidnight(dateTimeZone6);
        boolean boolean9 = dateMidnight7.isAfter((long) 11);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        int int4 = localDateTime2.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withWeekyear(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withDayOfWeek(20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(871, (-1), 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime11 = interval10.getEnd();
        org.joda.time.Chronology chronology12 = interval10.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime4.toDateTime(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay15.toDateTime(timeOfDay16, dateTimeZone17);
        boolean boolean19 = dateTime18.isBeforeNow();
        org.joda.time.DateTime dateTime21 = dateTime18.withMonthOfYear((int) (byte) 1);
        int int22 = dateTime18.getYear();
        org.joda.time.DateTime.Property property23 = dateTime18.weekyear();
        org.joda.time.DateTime dateTime24 = property23.withMaximumValue();
        org.joda.time.DateTime dateTime26 = dateTime24.withYear(2);
        int int27 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime26);
        int int28 = dateTime4.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = dateTime4.withMonthOfYear(35270);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35270 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 9 + "'", int28 == 9);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = localDate0.toString("Property[monthOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        int int4 = localDateTime2.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withWeekyear(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withYearOfCentury(35270);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35270 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.GERMAN;
        java.lang.String str2 = locale1.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "de");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("year");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime1.property(dateTimeFieldType7);
        org.joda.time.LocalTime localTime11 = localTime1.plusHours((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localTime1.compareTo((org.joda.time.ReadablePartial) localDateTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572875418,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=55,MILLISECOND=418,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "09:47:55.418" + "'", str4, "09:47:55.418");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644572875418,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=55,MILLISECOND=418,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDate0.getField(434);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 434");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("de");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"de\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        java.util.Date date4 = calendar0.getTime();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateTime.Property property14 = dateTime9.weekyear();
        org.joda.time.DateTime dateTime15 = property14.withMaximumValue();
        org.joda.time.DateTime dateTime16 = property14.roundHalfCeilingCopy();
        java.util.Date date17 = dateTime16.toDate();
        int int18 = date17.getDate();
        org.joda.time.YearMonthDay yearMonthDay19 = org.joda.time.YearMonthDay.fromDateFields(date17);
        boolean boolean20 = date4.before(date17);
        java.util.Date date26 = new java.util.Date((int) '4', 15, (int) '#', (int) ' ', (int) (byte) 10);
        long long27 = date26.getTime();
        int int28 = date26.getTimezoneOffset();
        int int29 = date17.compareTo(date26);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878475652,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=55,MILLISECOND=652,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Jul 15 09:47:55 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Jan 03 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertEquals(date26.toString(), "Wed May 06 08:10:00 UTC 1953");
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-525628200000L) + "'", long27 == (-525628200000L));
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 1 + "'", int29 == 1);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.ReadableInstant readableInstant10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dateTime7.compareTo(readableInstant10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        long long6 = java.util.Date.UTC((int) '#', 49, 79, 70, (int) '4', 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-968634479000L) + "'", long6 == (-968634479000L));
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) "09:47:51.520", chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"09:47:51.520\" is malformed at \":47:51.520\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = calendar0.getTime();
        calendar0.setFirstDayOfWeek(32770);
        int int4 = calendar0.getFirstDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add(1970, 35271);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572875807,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=32770,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=55,MILLISECOND=807,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Fri Feb 11 09:47:55 UTC 2022");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32770 + "'", int4 == 32770);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate2.withMonthOfYear(22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime1.property(dateTimeFieldType7);
        org.joda.time.LocalTime localTime11 = localTime1.plusHours((int) (short) -1);
        org.joda.time.LocalTime localTime13 = localTime11.minusMinutes(3);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay15.toDateTime(timeOfDay16, dateTimeZone17);
        org.joda.time.YearMonthDay.Property property19 = yearMonthDay15.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay15.property(dateTimeFieldType20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property22 = localTime11.property(dateTimeFieldType20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572875951,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=55,MILLISECOND=951,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "09:47:55.951" + "'", str4, "09:47:55.951");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644572875951,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=55,MILLISECOND=951,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(property21);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("2", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        int int3 = localTime1.getValue((int) (byte) 0);
        int int4 = localTime1.getMillisOfSecond();
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((java.lang.Object) property5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572876044,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=56,MILLISECOND=44,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 44 + "'", int4 == 44);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.property(dateTimeFieldType6);
        java.lang.String str8 = property7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay10 = property7.setCopy((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[monthOfYear]" + "'", str8, "Property[monthOfYear]");
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.minutes();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology4);
        // The following exception was thrown during execution in test generation
        try {
            long long12 = chronology4.getDateTimeMillis(93, 292278993, 10, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.withDayOfYear((int) '#');
        java.lang.String str4 = dateMidnight3.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval5 = new org.joda.time.Interval((java.lang.Object) str4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: 2022-02-04T00:00:00.000Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-04T00:00:00.000Z" + "'", str4, "2022-02-04T00:00:00.000Z");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusSeconds(11);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale12.getLanguage();
        java.lang.String str14 = property11.getAsShortText(locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay15 = property3.setCopy("2022-07-15", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-07-15\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "en" + "'", str13, "en");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Feb" + "'", str14, "Feb");
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property3.setCopy("-0001-02-11");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"-0001-02-11\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572876419,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=56,MILLISECOND=419,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str3 = interval2.toString();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.Interval interval14 = interval6.overlap((org.joda.time.ReadableInterval) interval11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay16.toDateTime(timeOfDay17, dateTimeZone18);
        boolean boolean20 = dateTime19.isBeforeNow();
        org.joda.time.DateTime dateTime22 = dateTime19.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour((int) (short) 0);
        boolean boolean25 = interval14.contains((org.joda.time.ReadableInstant) dateTime22);
        boolean boolean26 = interval2.contains((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.Interval interval28 = interval2.withPeriodBeforeEnd(readablePeriod27);
        boolean boolean30 = interval28.contains((long) 49);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str3, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        int int0 = org.joda.time.TimeOfDay.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay4.year();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfCentury(10);
        org.joda.time.LocalDate localDate12 = localDate10.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay20.monthOfYear();
        org.joda.time.DateTime dateTime25 = yearMonthDay20.toDateTimeAtCurrentTime();
        int int26 = property18.compareTo((org.joda.time.ReadablePartial) yearMonthDay20);
        org.joda.time.Chronology chronology27 = yearMonthDay20.getChronology();
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay20.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean31 = yearMonthDay20.isSupported(dateTimeFieldType30);
        boolean boolean32 = localDate12.isSupported(dateTimeFieldType30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay34 = yearMonthDay4.withField(dateTimeFieldType30, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878476633,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=56,MILLISECOND=633,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(292278993, 1970, 15, 17, (int) (short) 10, 8, 42, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        org.joda.time.YearMonthDay.Property property10 = yearMonthDay6.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay12.monthOfYear();
        org.joda.time.DateTime dateTime17 = yearMonthDay12.toDateTimeAtCurrentTime();
        int int18 = property10.compareTo((org.joda.time.ReadablePartial) yearMonthDay12);
        org.joda.time.Chronology chronology19 = yearMonthDay12.getChronology();
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay12.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean23 = yearMonthDay12.isSupported(dateTimeFieldType22);
        boolean boolean24 = localDate4.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate localDate26 = localDate4.plusWeeks(2);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(dateTimeZone27);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.fromCalendarFields(calendar29);
        boolean boolean32 = localTime30.equals((java.lang.Object) 16);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight28.withFields((org.joda.time.ReadablePartial) localTime30);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalTime localTime35 = localTime30.plus(readablePeriod34);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean36 = localDate26.isEqual((org.joda.time.ReadablePartial) localTime35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1644572876783,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=56,MILLISECOND=783,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertNotNull(localTime35);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay((int) '4', 13, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(8, 100, 100, 32770, (int) (byte) 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DurationField durationField15 = chronology14.halfdays();
        org.joda.time.DateTimeField dateTimeField16 = chronology14.era();
        java.lang.Object obj17 = null;
        org.joda.time.Interval interval20 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime21 = interval20.getEnd();
        org.joda.time.Chronology chronology22 = interval20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.year();
        org.joda.time.DurationField durationField24 = chronology22.minutes();
        org.joda.time.DateTimeField dateTimeField25 = chronology22.clockhourOfHalfday();
        org.joda.time.LocalTime localTime26 = new org.joda.time.LocalTime(obj17, chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime((java.lang.Object) chronology14, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str3 = interval2.toString();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.Interval interval14 = interval6.overlap((org.joda.time.ReadableInterval) interval11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay16.toDateTime(timeOfDay17, dateTimeZone18);
        boolean boolean20 = dateTime19.isBeforeNow();
        org.joda.time.DateTime dateTime22 = dateTime19.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour((int) (short) 0);
        boolean boolean25 = interval14.contains((org.joda.time.ReadableInstant) dateTime22);
        boolean boolean26 = interval2.contains((org.joda.time.ReadableInterval) interval14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime((java.lang.Object) interval14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Interval");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str3, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.withYear(22);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.minusYears(387);
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime11 = interval10.getEnd();
        org.joda.time.Chronology chronology12 = interval10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.lang.String str16 = locale15.getVariant();
        java.lang.String str17 = dateTimeField13.getAsShortText(3, locale15);
        long long19 = dateTimeField13.roundHalfCeiling((long) 8);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone21);
        org.joda.time.LocalDateTime.Property property23 = localDateTime22.monthOfYear();
        int int24 = dateTimeField13.getMaximumValue((org.joda.time.ReadablePartial) localDateTime22);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime22.minusMinutes(35270);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean28 = localDateTime26.isSupported(dateTimeFieldType27);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = yearMonthDay7.get(dateTimeFieldType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(yearMonthDay7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3" + "'", str17, "3");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 292278993 + "'", int24 == 292278993);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("en");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"en\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusSeconds(11);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay0.minus(readablePeriod3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay6 = timeOfDay0.withMinuteOfHour((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = dateTimeField5.getAsShortText(3, locale7);
        long long11 = dateTimeField5.roundHalfCeiling((long) 8);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.monthOfYear();
        int int16 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withDayOfWeek(51);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 51 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292278993 + "'", int16 == 292278993);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        int int1 = timeOfDay0.size();
        int int2 = timeOfDay0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay(dateTimeZone3);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay4.toDateTime(timeOfDay5, dateTimeZone6);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay4.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property10 = yearMonthDay4.property(dateTimeFieldType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay12 = timeOfDay0.withField(dateTimeFieldType9, 32772);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 4 + "'", int1 == 4);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 9 + "'", int2 == 9);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        java.util.Date date4 = calendar0.getTime();
        java.lang.String str5 = calendar0.toString();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878477350,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=57,MILLISECOND=350,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Jul 15 09:47:57 UTC 2022");
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "java.util.GregorianCalendar[time=1657878477350,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=57,MILLISECOND=350,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str5, "java.util.GregorianCalendar[time=1657878477350,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=57,MILLISECOND=350,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime4.withDate(708, 0, 35271);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = dateTimeField5.getAsShortText(3, locale7);
        long long11 = dateTimeField5.roundHalfCeiling((long) 8);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.monthOfYear();
        int int16 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusMinutes(35270);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime18.withDayOfMonth((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292278993 + "'", int16 == 292278993);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime9.toDateTime(chronology17);
        boolean boolean19 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.TimeOfDay timeOfDay23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay22.toDateTime(timeOfDay23, dateTimeZone24);
        boolean boolean26 = dateTime25.isBeforeNow();
        org.joda.time.DateTime dateTime28 = dateTime25.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval31 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime32 = interval31.getEnd();
        org.joda.time.Chronology chronology33 = interval31.getChronology();
        org.joda.time.DateTime dateTime34 = dateTime25.toDateTime(chronology33);
        boolean boolean35 = durationFieldType20.isSupported(chronology33);
        org.joda.time.DateTime dateTime36 = dateTime18.toDateTime(chronology33);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str38 = dateTime36.toString("ISOChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(dateTime25);
// flaky:         org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTime36);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("09:47:51.583");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay(dateTimeZone3);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay4.toDateTime(timeOfDay5, dateTimeZone6);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay10.toDateTime(timeOfDay11, dateTimeZone12);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay10.monthOfYear();
        org.joda.time.DateTime dateTime15 = yearMonthDay10.toDateTimeAtCurrentTime();
        int int16 = property8.compareTo((org.joda.time.ReadablePartial) yearMonthDay10);
        org.joda.time.Chronology chronology17 = yearMonthDay10.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.Interval interval21 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime22 = interval21.getEnd();
        org.joda.time.Chronology chronology23 = interval21.getChronology();
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime27 = interval26.getEnd();
        org.joda.time.Chronology chronology28 = interval26.getChronology();
        org.joda.time.Interval interval29 = interval21.overlap((org.joda.time.ReadableInterval) interval26);
        org.joda.time.Interval interval32 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str33 = interval32.toString();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.Interval interval41 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime42 = interval41.getEnd();
        org.joda.time.Chronology chronology43 = interval41.getChronology();
        org.joda.time.Interval interval44 = interval36.overlap((org.joda.time.ReadableInterval) interval41);
        org.joda.time.DateTimeZone dateTimeZone45 = null;
        org.joda.time.YearMonthDay yearMonthDay46 = new org.joda.time.YearMonthDay(dateTimeZone45);
        org.joda.time.TimeOfDay timeOfDay47 = null;
        org.joda.time.DateTimeZone dateTimeZone48 = null;
        org.joda.time.DateTime dateTime49 = yearMonthDay46.toDateTime(timeOfDay47, dateTimeZone48);
        boolean boolean50 = dateTime49.isBeforeNow();
        org.joda.time.DateTime dateTime52 = dateTime49.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime54 = dateTime52.withMinuteOfHour((int) (short) 0);
        boolean boolean55 = interval44.contains((org.joda.time.ReadableInstant) dateTime52);
        boolean boolean56 = interval32.contains((org.joda.time.ReadableInterval) interval44);
        org.joda.time.ReadablePeriod readablePeriod57 = null;
        org.joda.time.Interval interval58 = interval32.withPeriodBeforeEnd(readablePeriod57);
        org.joda.time.PeriodType periodType59 = null;
        org.joda.time.Period period60 = interval32.toPeriod(periodType59);
        org.joda.time.Interval interval61 = interval29.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period60);
        long long64 = chronology17.add((org.joda.time.ReadablePeriod) period60, (long) 'a', 4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay65 = new org.joda.time.TimeOfDay(1, (int) (byte) 100, 4, chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(interval29);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str33, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + boolean55 + "' != '" + false + "'", boolean55 == false);
        org.junit.Assert.assertTrue("'" + boolean56 + "' != '" + true + "'", boolean56 == true);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertNotNull(interval61);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 229L + "'", long64 == 229L);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime4.withDurationAdded(readableDuration9, (int) (short) 100);
        int int12 = dateTime4.getYear();
        org.joda.time.DateTime dateTime14 = dateTime4.withSecondOfMinute(8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime14.withHourOfDay(51);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 51 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = org.joda.time.DateMidnight.parse("en", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 35271, chronology5);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay13 = yearMonthDay9.withYear(22);
        int int14 = yearMonthDay9.size();
        int[] intArray15 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            chronology5.validate((org.joda.time.ReadablePartial) yearMonthDay9, intArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(yearMonthDay13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(intArray15);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[]");
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("German", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime4.withDate((int) (byte) 0, 1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = calendar0.getTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.era();
        boolean boolean3 = date1.equals((java.lang.Object) dateTimeFieldType2);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572877851,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=57,MILLISECOND=851,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Fri Feb 11 09:47:57 UTC 2022");
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay3.toDateTime(timeOfDay4, dateTimeZone5);
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay3.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay9.toDateTime(timeOfDay10, dateTimeZone11);
        org.joda.time.YearMonthDay.Property property13 = yearMonthDay9.monthOfYear();
        org.joda.time.DateTime dateTime14 = yearMonthDay9.toDateTimeAtCurrentTime();
        int int15 = property7.compareTo((org.joda.time.ReadablePartial) yearMonthDay9);
        org.joda.time.Chronology chronology16 = yearMonthDay9.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField18 = chronology16.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(12, 387, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 387 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        int int4 = localDateTime2.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withWeekyear(11);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusDays((-292275054));
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDateTime8.getValue(587);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 587");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = localTime1.withHourOfDay(3);
        org.joda.time.LocalTime localTime5 = localTime3.withMinuteOfHour(13);
        org.joda.time.LocalTime.Property property6 = localTime3.millisOfDay();
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        int int0 = org.joda.time.TimeOfDay.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) 'a', (-1), 16, (-292275054), 461, 32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        int int0 = org.joda.time.TimeOfDay.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((java.lang.Object) 1.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.util.Locale locale1 = new java.util.Locale("Fri Feb 11 09:47:52 UTC 2022");
        java.lang.Object obj2 = locale1.clone();
        org.junit.Assert.assertEquals(locale1.toString(), "fri feb 11 09:47:52 utc 2022");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "fri feb 11 09:47:52 utc 2022");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "fri feb 11 09:47:52 utc 2022");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "fri feb 11 09:47:52 utc 2022");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        calendar0.setFirstDayOfWeek((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.setWeekDate(6, (int) (short) 100, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878478447,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=58,MILLISECOND=447,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        int int3 = localDateTime2.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusDays(2);
        int int6 = localDateTime2.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDateTime2.getValue((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -292275054");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        java.util.Date date4 = calendar0.getTime();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = calendar0.isSet(17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 17");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878478625,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=58,MILLISECOND=625,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Jul 15 09:47:58 UTC 2022");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) 'x', 93, 50, (int) (byte) 0, 434);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 434 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(901, 5, 1, 5, (int) 'u', 22, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime5 = property3.addCopy((int) (short) 10);
        org.joda.time.LocalTime localTime6 = property3.withMaximumValue();
        org.joda.time.LocalTime localTime8 = localTime6.plusHours(22);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localTime8.get(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572878857,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=58,MILLISECOND=857,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
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
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        org.joda.time.DateTime dateTime7 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.Interval interval8 = localDate2.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate2.withDayOfWeek(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(interval8);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("secondOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"secondOfDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime6 = interval5.getEnd();
        org.joda.time.Chronology chronology7 = interval5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(9, (int) 'a', 9, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        java.util.Date date4 = calendar0.getTime();
        int int5 = calendar0.getMinimalDaysInFirstWeek();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime11 = interval10.getEnd();
        org.joda.time.Chronology chronology12 = interval10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.lang.String str16 = locale15.getVariant();
        java.lang.String str17 = dateTimeField13.getAsShortText(3, locale15);
        java.lang.String str18 = locale15.getLanguage();
        java.lang.String str19 = locale15.getISO3Country();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap20 = calendar0.getDisplayNames(901, 2022, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878479082,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=59,MILLISECOND=82,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Jul 15 09:47:59 UTC 2022");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3" + "'", str17, "3");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "de" + "'", str18, "de");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("09:47:53.715");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=09:47:53.715");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.weekOfWeekyear();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        int int18 = dateTimeField15.getMaximumTextLength(locale16);
        int int19 = dateTimeField15.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2 + "'", int18 == 2);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 53 + "'", int19 == 53);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("09:47:55.431");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"09:47:55.431\" is malformed at \":47:55.431\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusWeeks((int) 'a');
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.minutes();
        org.joda.time.DurationField durationField11 = chronology9.weekyears();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DurationField durationField13 = chronology9.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((java.lang.Object) localDate4, chronology9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime10.plusDays(32772);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 9223371988912079285 + 2831500800000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(chronology14);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology14.getDateTimeMillis((int) (byte) -1, 3, (int) (short) 0, 746);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        org.joda.time.YearMonthDay.Property property27 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTime dateTime28 = yearMonthDay23.toDateTimeAtCurrentTime();
        int int29 = property21.compareTo((org.joda.time.ReadablePartial) yearMonthDay23);
        org.joda.time.Chronology chronology30 = yearMonthDay23.getChronology();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight14.withChronology(chronology30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateMidnight31);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.util.Calendar calendar6 = java.util.Calendar.getInstance();
        calendar6.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay10 = org.joda.time.YearMonthDay.fromCalendarFields(calendar6);
        calendar6.setFirstDayOfWeek(2022);
        int int14 = calendar6.getMinimum(2);
        java.util.TimeZone timeZone15 = calendar6.getTimeZone();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime19 = interval18.getEnd();
        org.joda.time.Chronology chronology20 = interval18.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.year();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleKeys();
        java.lang.String str24 = locale22.getDisplayCountry();
        int int25 = dateTimeField21.getMaximumTextLength(locale22);
        java.lang.String str26 = locale22.getDisplayScript();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(locale22);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone15, locale22);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(51, 47, 32, 35277, 15, (int) 'u', dateTimeZone29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35277 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1657878479700,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2022,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=59,MILLISECOND=700,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "United States" + "'", str24, "United States");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1644572879701,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=59,MILLISECOND=701,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1644572879701,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=59,MILLISECOND=701,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone29);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        int int3 = localDateTime2.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusDays(2);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = localDateTime2.toDateTime(dateTimeZone6);
        long long8 = dateTime7.getMillis();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTime7.toString("und");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: u");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 3L + "'", long8 == 3L);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        java.lang.String str11 = dateTime10.toString();
        org.joda.time.DateTime.Property property12 = dateTime10.year();
        org.joda.time.DateTime.Property property13 = dateTime10.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime10.plusMinutes(292278994);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 9223371988912079819 + 17536739640000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292278993-02-08T09:47:59.819Z" + "'", str11, "292278993-02-08T09:47:59.819Z");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.withYear(22);
        org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay5.minusYears(387);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = yearMonthDay7.getFieldType(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(yearMonthDay7);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 86399, (long) 746);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withDayOfYear(461);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 461 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        int int6 = dateTimeField5.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay8.withYear(22);
        int int13 = yearMonthDay8.size();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance();
        calendar14.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay18 = org.joda.time.YearMonthDay.fromCalendarFields(calendar14);
        org.joda.time.YearMonthDay yearMonthDay20 = yearMonthDay18.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay18.year();
        int[] intArray22 = yearMonthDay18.getValues();
        int int23 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay8, intArray22);
        org.joda.time.LocalDate localDate24 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate26 = localDate24.withYearOfCentury(10);
        org.joda.time.LocalDate localDate28 = localDate26.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay30.toDateTime(timeOfDay31, dateTimeZone32);
        org.joda.time.YearMonthDay.Property property34 = yearMonthDay30.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay(dateTimeZone35);
        org.joda.time.TimeOfDay timeOfDay37 = null;
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.DateTime dateTime39 = yearMonthDay36.toDateTime(timeOfDay37, dateTimeZone38);
        org.joda.time.YearMonthDay.Property property40 = yearMonthDay36.monthOfYear();
        org.joda.time.DateTime dateTime41 = yearMonthDay36.toDateTimeAtCurrentTime();
        int int42 = property34.compareTo((org.joda.time.ReadablePartial) yearMonthDay36);
        org.joda.time.Chronology chronology43 = yearMonthDay36.getChronology();
        org.joda.time.YearMonthDay yearMonthDay45 = yearMonthDay36.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean47 = yearMonthDay36.isSupported(dateTimeFieldType46);
        boolean boolean48 = localDate28.isSupported(dateTimeFieldType46);
        java.util.Locale locale50 = java.util.Locale.UK;
        java.lang.String str51 = dateTimeField5.getAsShortText((org.joda.time.ReadablePartial) localDate28, 9, locale50);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay52 = new org.joda.time.YearMonthDay((java.lang.Object) dateTimeField5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 292278993 + "'", int6 == 292278993);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1657878480200,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=0,MILLISECOND=200,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(yearMonthDay20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[2022, 7, 15]");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-292275054) + "'", int23 == (-292275054));
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 0 + "'", int42 == 0);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "9" + "'", str51, "9");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str3 = interval2.toString();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.Interval interval14 = interval6.overlap((org.joda.time.ReadableInterval) interval11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay16.toDateTime(timeOfDay17, dateTimeZone18);
        boolean boolean20 = dateTime19.isBeforeNow();
        org.joda.time.DateTime dateTime22 = dateTime19.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour((int) (short) 0);
        boolean boolean25 = interval14.contains((org.joda.time.ReadableInstant) dateTime22);
        boolean boolean26 = interval2.contains((org.joda.time.ReadableInterval) interval14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay((java.lang.Object) interval14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Interval");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str3, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.minutes();
        org.joda.time.DurationField durationField11 = chronology9.weekyears();
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(chronology9);
        org.joda.time.DurationField durationField13 = chronology9.days();
        org.joda.time.DateTimeField dateTimeField14 = chronology9.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((int) 'a', 86399, 79, 461, 588, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 461 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime9.toDateTime(chronology17);
        boolean boolean19 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.TimeOfDay timeOfDay23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay22.toDateTime(timeOfDay23, dateTimeZone24);
        boolean boolean26 = dateTime25.isBeforeNow();
        org.joda.time.DateTime dateTime28 = dateTime25.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval31 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime32 = interval31.getEnd();
        org.joda.time.Chronology chronology33 = interval31.getChronology();
        org.joda.time.DateTime dateTime34 = dateTime25.toDateTime(chronology33);
        boolean boolean35 = durationFieldType20.isSupported(chronology33);
        org.joda.time.DateTime dateTime36 = dateTime18.toDateTime(chronology33);
        org.joda.time.DateTimeField dateTimeField37 = chronology33.halfdayOfDay();
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.LocalDateTime localDateTime40 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone39);
        int int41 = localDateTime40.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime43 = localDateTime40.plusDays(2);
        int int44 = localDateTime40.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime40.withMinuteOfHour(2);
        int int47 = localDateTime40.getYearOfCentury();
        int int48 = localDateTime40.getDayOfMonth();
        java.util.Calendar calendar50 = java.util.Calendar.getInstance();
        calendar50.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay54 = org.joda.time.YearMonthDay.fromCalendarFields(calendar50);
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay54.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property57 = yearMonthDay54.year();
        int[] intArray58 = yearMonthDay54.getValues();
        java.util.Locale locale61 = new java.util.Locale("Fri Feb 11 09:47:52 UTC 2022");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray62 = dateTimeField37.set((org.joda.time.ReadablePartial) localDateTime40, 22, intArray58, "German", locale61);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"German\" for halfdayOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 70 + "'", int44 == 70);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 70 + "'", int47 == 70);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertNotNull(calendar50);
// flaky:         org.junit.Assert.assertEquals(calendar50.toString(), "java.util.GregorianCalendar[time=1657878480363,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=0,MILLISECOND=363,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay54);
        org.junit.Assert.assertNotNull(yearMonthDay56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[2022, 7, 15]");
        org.junit.Assert.assertEquals(locale61.toString(), "fri feb 11 09:47:52 utc 2022");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        org.joda.time.DateTimeField dateTimeField12 = property11.getField();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone14);
        int int16 = localDateTime15.getMinuteOfHour();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.weekOfWeekyear();
        java.util.Calendar calendar19 = java.util.Calendar.getInstance();
        calendar19.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay23 = org.joda.time.YearMonthDay.fromCalendarFields(calendar19);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay23.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property26 = yearMonthDay23.year();
        int[] intArray27 = yearMonthDay23.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = dateTimeField12.add((org.joda.time.ReadablePartial) localDateTime15, 35271, intArray27, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35271");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1657878480395,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=0,MILLISECOND=395,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[2022, 7, 15]");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        org.joda.time.LocalTime localTime5 = property3.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime5.withHourOfDay(35273);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35273 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572880712,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=0,MILLISECOND=712,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        long long6 = java.util.Date.UTC(7, 17, 522, 35280, 20, 100);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1771457900000L) + "'", long6 == (-1771457900000L));
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("09:47:57.619");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '09:47:57.619' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        calendar0.set((int) '#', (int) 'u', 20, 15, (int) '4', 0);
        java.lang.String str9 = calendar0.toString();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=35,MONTH=117,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=20,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=15,MINUTE=52,SECOND=0,MILLISECOND=772,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=35,MONTH=117,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=20,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=15,MINUTE=52,SECOND=0,MILLISECOND=772,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str9, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=35,MONTH=117,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=20,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=15,MINUTE=52,SECOND=0,MILLISECOND=772,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(371, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572880781,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=0,MILLISECOND=781,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.lang.String str2 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "zh_TW" + "'", str2, "zh_TW");
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime5 = property3.addCopy((int) (short) 10);
        org.joda.time.LocalTime localTime6 = property3.withMaximumValue();
        org.joda.time.LocalTime localTime7 = property3.roundHalfFloorCopy();
        int int8 = property3.getMaximumValueOverall();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = property3.setCopy("09:47:51.659", locale10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:47:51.659\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572880942,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=0,MILLISECOND=942,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 86399 + "'", int8 == 86399);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.Interval interval10 = interval2.overlap((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str14 = interval13.toString();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTime(timeOfDay28, dateTimeZone29);
        boolean boolean31 = dateTime30.isBeforeNow();
        org.joda.time.DateTime dateTime33 = dateTime30.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime35 = dateTime33.withMinuteOfHour((int) (short) 0);
        boolean boolean36 = interval25.contains((org.joda.time.ReadableInstant) dateTime33);
        boolean boolean37 = interval13.contains((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.Interval interval39 = interval13.withPeriodBeforeEnd(readablePeriod38);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = interval13.toPeriod(periodType40);
        org.joda.time.Interval interval42 = interval10.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period41);
        // The following exception was thrown during execution in test generation
        try {
            int int44 = period41.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str14, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(interval42);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("09:47:55.431");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.setWeekDate(3, 8, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878481395,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2022,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=1,MILLISECOND=395,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(0, 35277, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35277 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = locale6.getDisplayCountry();
        int int9 = dateTimeField5.getMaximumTextLength(locale6);
        java.lang.String str10 = locale6.getDisplayScript();
        java.lang.String str11 = locale6.getDisplayName();
        java.lang.Object obj12 = locale6.clone();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "United States" + "'", str8, "United States");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "English (United States)" + "'", str11, "English (United States)");
        org.junit.Assert.assertNotNull(obj12);
        org.junit.Assert.assertEquals(obj12.toString(), "en_US");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "en_US");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "en_US");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.Interval interval12 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime13 = interval12.getEnd();
        org.joda.time.Chronology chronology14 = interval12.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale16.getDisplayCountry();
        int int19 = dateTimeField15.getMaximumTextLength(locale16);
        java.lang.String str20 = locale16.getDisplayScript();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale16);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone9, locale16);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) timeZone9, dateTimeZone23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: sun.util.calendar.ZoneInfo");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878481488,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2022,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=1,MILLISECOND=488,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "United States" + "'", str18, "United States");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1644572881489,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=1,MILLISECOND=489,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1644572881489,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=1,MILLISECOND=489,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(387);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime10.withDate((int) 'u', 1970, 79);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("Property[monthOfYear]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Property[monthOfYear]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("292278993-02-08T09:47:56.387Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property3 = localDate0.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate0.withEra((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusSeconds(11);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay0.withSecondOfMinute((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) timeOfDay0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay6 = property5.getYearMonthDay();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay6.year();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.DurationField durationField14 = chronology13.minutes();
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long) 35271, chronology13);
        org.joda.time.DurationField durationField16 = chronology13.minutes();
        java.lang.String str17 = chronology13.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((java.lang.Object) property7, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.YearMonthDay$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str17, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay1.plusDays((int) 'a');
        org.joda.time.Interval interval9 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str10 = interval9.toString();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Chronology chronology15 = interval13.getChronology();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime19 = interval18.getEnd();
        org.joda.time.Chronology chronology20 = interval18.getChronology();
        org.joda.time.Interval interval21 = interval13.overlap((org.joda.time.ReadableInterval) interval18);
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        boolean boolean27 = dateTime26.isBeforeNow();
        org.joda.time.DateTime dateTime29 = dateTime26.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime31 = dateTime29.withMinuteOfHour((int) (short) 0);
        boolean boolean32 = interval21.contains((org.joda.time.ReadableInstant) dateTime29);
        boolean boolean33 = interval9.contains((org.joda.time.ReadableInterval) interval21);
        boolean boolean34 = interval9.containsNow();
        org.joda.time.Chronology chronology35 = interval9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) 'a', chronology35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str10, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(dateTime26);
// flaky:         org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(chronology35);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay9.toDateTime(timeOfDay10, dateTimeZone11);
        boolean boolean13 = dateTime12.isBeforeNow();
        org.joda.time.DateTime dateTime15 = dateTime12.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime19 = interval18.getEnd();
        org.joda.time.Chronology chronology20 = interval18.getChronology();
        org.joda.time.DateTime dateTime21 = dateTime12.toDateTime(chronology20);
        boolean boolean22 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime21);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime26 = interval25.getEnd();
        org.joda.time.Chronology chronology27 = interval25.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval29 = new org.joda.time.Interval((java.lang.Object) dateTime21, chronology27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        int int12 = dateTime10.getSecondOfDay();
        org.joda.time.DateTime dateTime14 = dateTime10.plusWeeks(0);
        org.joda.time.DateTime.Property property15 = dateTime10.dayOfYear();
        org.joda.time.DateTime dateTime17 = property15.addWrapFieldToCopy((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = property15.addToCopy((long) 86399);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 9223371988912082159 + 7464873600000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35282 + "'", int12 == 35282);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("Feb 11, 2022 9:47:56 AM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Feb 11, 2022 9:47:56 AM\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.Interval interval10 = interval2.overlap((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Duration duration11 = interval10.toDuration();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTime(timeOfDay14, dateTimeZone15);
        boolean boolean17 = dateTime16.isBeforeNow();
        org.joda.time.DateTime dateTime19 = dateTime16.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime23 = dateTime21.minusHours((int) (byte) 100);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration11, (org.joda.time.ReadableInstant) dateTime21);
        boolean boolean25 = interval24.isBeforeNow();
        boolean boolean26 = interval24.containsNow();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("Fri Feb 11 09:47:52 UTC 2022", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = dateTimeField5.getAsShortText(3, locale7);
        int int10 = dateTimeField5.getMaximumValue();
        long long13 = dateTimeField5.addWrapField((long) (-1), (int) (byte) 0);
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = dateTimeField5.getAsShortText(readablePartial14, 9, locale16);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.monthOfYear();
        int int23 = localDateTime21.getSecondOfMinute();
        int int24 = localDateTime21.getDayOfWeek();
        java.util.Calendar calendar26 = java.util.Calendar.getInstance();
        calendar26.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay30 = org.joda.time.YearMonthDay.fromCalendarFields(calendar26);
        org.joda.time.YearMonthDay yearMonthDay32 = yearMonthDay30.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property33 = yearMonthDay30.year();
        int[] intArray34 = yearMonthDay30.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray36 = dateTimeField5.set((org.joda.time.ReadablePartial) localDateTime21, (-292275054), intArray34, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -292275054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "9" + "'", str18, "9");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(calendar26);
// flaky:         org.junit.Assert.assertEquals(calendar26.toString(), "java.util.GregorianCalendar[time=1657878482357,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=2,MILLISECOND=357,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(yearMonthDay32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[2022, 7, 15]");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        int int4 = localDateTime2.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withWeekyear(11);
        org.joda.time.Interval interval9 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Chronology chronology11 = interval9.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.year();
        org.joda.time.DurationField durationField13 = chronology11.minutes();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval15 = new org.joda.time.Interval((java.lang.Object) localDateTime6, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = dateTimeField5.getAsShortText(3, locale7);
        long long11 = dateTimeField5.roundHalfCeiling((long) 8);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.monthOfYear();
        int int16 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusMinutes(35270);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean20 = localDateTime18.isSupported(dateTimeFieldType19);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromCalendarFields(calendar21);
        int int24 = localTime22.getValue((int) (byte) 0);
        int int25 = localTime22.getMillisOfSecond();
        org.joda.time.LocalTime localTime27 = localTime22.withMillisOfSecond(42);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = localDateTime18.compareTo((org.joda.time.ReadablePartial) localTime27);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292278993 + "'", int16 == 292278993);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1644572882604,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=2,MILLISECOND=604,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 9 + "'", int24 == 9);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 604 + "'", int25 == 604);
        org.junit.Assert.assertNotNull(localTime27);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("2022-07-15");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-07-15\" is malformed at \"22-07-15\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        int int1 = dateMidnight0.getDayOfWeek();
        org.junit.Assert.assertNotNull(dateMidnight0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 5 + "'", int1 == 5);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusSeconds(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType4 = timeOfDay0.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
        org.junit.Assert.assertNotNull(timeOfDay0);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate localDate2 = property1.roundFloorCopy();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.year();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getVariant();
        java.lang.String str13 = dateTimeField9.getAsShortText(3, locale11);
        int int14 = dateTimeField9.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        java.util.Locale locale22 = java.util.Locale.getDefault();
        java.lang.String str23 = locale22.getLanguage();
        java.lang.String str24 = property21.getAsShortText(locale22);
        java.lang.String str25 = dateTimeField9.getAsText(35277, locale22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate26 = property1.setCopy("2022-07-15", locale22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-07-15\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3" + "'", str13, "3");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 292278993 + "'", int14 == 292278993);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "en" + "'", str23, "en");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Feb" + "'", str24, "Feb");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "35277" + "'", str25, "35277");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = property1.setCopy((-52));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -52 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        int int3 = localDateTime2.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusDays(2);
        int int6 = localDateTime2.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withMonthOfYear(86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 15);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = timeOfDay1.getValue(35279);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35279");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTime(timeOfDay9, dateTimeZone10);
        boolean boolean12 = dateTime11.isBeforeNow();
        org.joda.time.DateTime dateTime14 = dateTime11.withMonthOfYear((int) (byte) 1);
        int int15 = dateTime11.getYear();
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateTime dateTime18 = dateTime11.withDurationAdded(readableDuration16, (int) (short) 100);
        org.joda.time.DateTime.Property property19 = dateTime11.weekOfWeekyear();
        java.util.Calendar calendar20 = java.util.Calendar.getInstance();
        calendar20.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay24 = org.joda.time.YearMonthDay.fromCalendarFields(calendar20);
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay24.plusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        int int32 = dateTime31.getCenturyOfEra();
        org.joda.time.DateTime dateTime34 = dateTime31.plusMillis((int) (byte) 0);
        int int35 = dateTime34.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay(dateTimeZone36);
        org.joda.time.TimeOfDay timeOfDay38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = yearMonthDay37.toDateTime(timeOfDay38, dateTimeZone39);
        org.joda.time.YearMonthDay.Property property41 = yearMonthDay37.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property43 = yearMonthDay37.property(dateTimeFieldType42);
        org.joda.time.DateTime.Property property44 = dateTime34.property(dateTimeFieldType42);
        org.joda.time.DurationFieldType durationFieldType45 = dateTimeFieldType42.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone46);
        org.joda.time.Chronology chronology48 = yearMonthDay47.getChronology();
        org.joda.time.DurationField durationField49 = durationFieldType45.getField(chronology48);
        org.joda.time.YearMonthDay yearMonthDay51 = yearMonthDay24.withFieldAdded(durationFieldType45, (int) (short) 100);
        org.joda.time.DateTime dateTime52 = dateTime11.withFields((org.joda.time.ReadablePartial) yearMonthDay24);
        int[] intArray53 = new int[] {};
        // The following exception was thrown during execution in test generation
        try {
            chronology4.validate((org.joda.time.ReadablePartial) yearMonthDay24, intArray53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 0");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(calendar20);
// flaky:         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1657878483222,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=3,MILLISECOND=222,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 20 + "'", int32 == 20);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 11 + "'", int35 == 11);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(durationField49);
        org.junit.Assert.assertNotNull(yearMonthDay51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(intArray53);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[]");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(4, 461, (-292275054), 387);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 461 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = dateTimeField5.getAsShortText(3, locale7);
        long long11 = dateTimeField5.roundHalfCeiling((long) 8);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.monthOfYear();
        int int16 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusMinutes(35270);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean20 = localDateTime18.isSupported(dateTimeFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField22 = localDateTime18.getField(20);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 20");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292278993 + "'", int16 == 292278993);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime9.toDateTime(chronology17);
        boolean boolean19 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDate localDate20 = dateTime18.toLocalDate();
        org.joda.time.LocalDate localDate22 = localDate20.withYear((int) (short) -1);
        java.lang.String str23 = localDate22.toString();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime28 = interval27.getEnd();
        org.joda.time.Chronology chronology29 = interval27.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.year();
        org.joda.time.DurationField durationField31 = chronology29.minutes();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 16, chronology29);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime36 = interval35.getEnd();
        org.joda.time.Chronology chronology37 = interval35.getChronology();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        org.joda.time.Chronology chronology42 = interval40.getChronology();
        org.joda.time.Interval interval43 = interval35.overlap((org.joda.time.ReadableInterval) interval40);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str47 = interval46.toString();
        org.joda.time.Interval interval50 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime51 = interval50.getEnd();
        org.joda.time.Chronology chronology52 = interval50.getChronology();
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime56 = interval55.getEnd();
        org.joda.time.Chronology chronology57 = interval55.getChronology();
        org.joda.time.Interval interval58 = interval50.overlap((org.joda.time.ReadableInterval) interval55);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay(dateTimeZone59);
        org.joda.time.TimeOfDay timeOfDay61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = yearMonthDay60.toDateTime(timeOfDay61, dateTimeZone62);
        boolean boolean64 = dateTime63.isBeforeNow();
        org.joda.time.DateTime dateTime66 = dateTime63.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime68 = dateTime66.withMinuteOfHour((int) (short) 0);
        boolean boolean69 = interval58.contains((org.joda.time.ReadableInstant) dateTime66);
        boolean boolean70 = interval46.contains((org.joda.time.ReadableInterval) interval58);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.Interval interval72 = interval46.withPeriodBeforeEnd(readablePeriod71);
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.Period period74 = interval46.toPeriod(periodType73);
        org.joda.time.Interval interval75 = interval43.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period74);
        long long78 = chronology29.add((org.joda.time.ReadablePeriod) period74, 0L, 35271);
        org.joda.time.MutablePeriod mutablePeriod79 = period74.toMutablePeriod();
        org.joda.time.LocalDate localDate80 = localDate22.minus((org.joda.time.ReadablePeriod) period74);
        int int81 = period74.size();
        org.joda.time.LocalDate localDate82 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate84 = localDate82.withYearOfCentury(10);
        org.joda.time.LocalDate localDate86 = localDate84.plusYears((int) '4');
        org.joda.time.DurationFieldType durationFieldType87 = org.joda.time.DurationFieldType.seconds();
        boolean boolean88 = localDate84.isSupported(durationFieldType87);
        boolean boolean89 = period74.isSupported(durationFieldType87);
        // The following exception was thrown during execution in test generation
        try {
            int int91 = period74.getValue(35275);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35275");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-0001-02-11" + "'", str23, "-0001-02-11");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str47, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1163943L + "'", long78 == 1163943L);
        org.junit.Assert.assertNotNull(mutablePeriod79);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 8 + "'", int81 == 8);
        org.junit.Assert.assertNotNull(localDate82);
        org.junit.Assert.assertNotNull(localDate84);
        org.junit.Assert.assertNotNull(localDate86);
        org.junit.Assert.assertNotNull(durationFieldType87);
        org.junit.Assert.assertTrue("'" + boolean88 + "' != '" + false + "'", boolean88 == false);
        org.junit.Assert.assertTrue("'" + boolean89 + "' != '" + true + "'", boolean89 == true);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime5 = property3.addCopy((int) (short) 10);
        org.joda.time.LocalTime localTime6 = property3.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property3.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572884166,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=4,MILLISECOND=166,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        int int4 = localTime1.getMillisOfSecond();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572884182,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=4,MILLISECOND=182,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 182 + "'", int4 == 182);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        int int6 = dateTimeField5.getMaximumValue();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime11 = interval10.getEnd();
        org.joda.time.Chronology chronology12 = interval10.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        java.lang.String str16 = locale15.getVariant();
        java.lang.String str17 = dateTimeField13.getAsShortText(3, locale15);
        long long19 = dateTimeField13.roundHalfCeiling((long) 8);
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.lang.String str22 = dateTimeField13.getAsShortText(434, locale21);
        java.lang.String str23 = dateTimeField5.getAsShortText(32772, locale21);
        long long25 = dateTimeField5.roundHalfEven(1163943L);
        java.util.Calendar calendar28 = java.util.Calendar.getInstance();
        calendar28.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay32 = org.joda.time.YearMonthDay.fromCalendarFields(calendar28);
        calendar28.setFirstDayOfWeek(2022);
        int int36 = calendar28.getMinimum(2);
        java.util.TimeZone timeZone37 = calendar28.getTimeZone();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        org.joda.time.Chronology chronology42 = interval40.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.year();
        java.util.Locale locale44 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet45 = locale44.getUnicodeLocaleKeys();
        java.lang.String str46 = locale44.getDisplayCountry();
        int int47 = dateTimeField43.getMaximumTextLength(locale44);
        java.lang.String str48 = locale44.getDisplayScript();
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(locale44);
        java.util.Calendar calendar50 = java.util.Calendar.getInstance(timeZone37, locale44);
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forTimeZone(timeZone37);
        java.util.Locale locale52 = java.util.Locale.GERMAN;
        java.lang.String str53 = locale52.getVariant();
        java.util.Calendar calendar54 = java.util.Calendar.getInstance(timeZone37, locale52);
        // The following exception was thrown during execution in test generation
        try {
            long long55 = dateTimeField5.set(1L, "09:47:49.943", locale52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:47:49.943\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 292278993 + "'", int6 == 292278993);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "3" + "'", str17, "3");
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "434" + "'", str22, "434");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "32772" + "'", str23, "32772");
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 0L + "'", long25 == 0L);
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1657878484325,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2022,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=4,MILLISECOND=325,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay32);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(timeZone37);
        org.junit.Assert.assertEquals(timeZone37.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "United States" + "'", str46, "United States");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(calendar49);
// flaky:         org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=1644572884325,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=4,MILLISECOND=325,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar50);
// flaky:         org.junit.Assert.assertEquals(calendar50.toString(), "java.util.GregorianCalendar[time=1644572884325,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=4,MILLISECOND=325,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "de");
        org.junit.Assert.assertEquals("'" + str53 + "' != '" + "" + "'", str53, "");
        org.junit.Assert.assertNotNull(calendar54);
// flaky:         org.junit.Assert.assertEquals(calendar54.toString(), "java.util.GregorianCalendar[time=1644572884325,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=4,MILLISECOND=325,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = org.joda.time.DateMidnight.parse("09:47:51.520", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        int int3 = localDateTime2.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusDays(2);
        int int6 = localDateTime2.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.plusSeconds(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = localDateTime2.getField((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -292275054");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (byte) 1, 434, 2, 35279414, 2022, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35279414 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str3 = interval2.toString();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.Interval interval14 = interval6.overlap((org.joda.time.ReadableInterval) interval11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay16.toDateTime(timeOfDay17, dateTimeZone18);
        boolean boolean20 = dateTime19.isBeforeNow();
        org.joda.time.DateTime dateTime22 = dateTime19.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour((int) (short) 0);
        boolean boolean25 = interval14.contains((org.joda.time.ReadableInstant) dateTime22);
        boolean boolean26 = interval2.contains((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.Interval interval28 = interval2.withPeriodBeforeEnd(readablePeriod27);
        long long29 = interval28.getEndMillis();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(dateTimeZone30);
        org.joda.time.DateMidnight.Property property32 = dateMidnight31.monthOfYear();
        org.joda.time.DateMidnight dateMidnight33 = org.joda.time.DateMidnight.now();
        long long34 = property32.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateMidnight dateMidnight35 = property32.roundHalfEvenCopy();
        boolean boolean36 = interval28.isAfter((org.joda.time.ReadableInstant) dateMidnight35);
        org.joda.time.MutableInterval mutableInterval37 = interval28.toMutableInterval();
        org.joda.time.Duration duration38 = interval28.toDuration();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str3, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(mutableInterval37);
        org.junit.Assert.assertNotNull(duration38);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.Interval interval10 = interval2.overlap((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str14 = interval13.toString();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTime(timeOfDay28, dateTimeZone29);
        boolean boolean31 = dateTime30.isBeforeNow();
        org.joda.time.DateTime dateTime33 = dateTime30.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime35 = dateTime33.withMinuteOfHour((int) (short) 0);
        boolean boolean36 = interval25.contains((org.joda.time.ReadableInstant) dateTime33);
        boolean boolean37 = interval13.contains((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.Interval interval39 = interval13.withPeriodBeforeEnd(readablePeriod38);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = interval13.toPeriod(periodType40);
        org.joda.time.Interval interval42 = interval10.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period41);
        org.joda.time.Interval interval45 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str46 = interval45.toString();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime50 = interval49.getEnd();
        org.joda.time.Chronology chronology51 = interval49.getChronology();
        org.joda.time.Interval interval54 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime55 = interval54.getEnd();
        org.joda.time.Chronology chronology56 = interval54.getChronology();
        org.joda.time.Interval interval57 = interval49.overlap((org.joda.time.ReadableInterval) interval54);
        org.joda.time.DateTimeZone dateTimeZone58 = null;
        org.joda.time.YearMonthDay yearMonthDay59 = new org.joda.time.YearMonthDay(dateTimeZone58);
        org.joda.time.TimeOfDay timeOfDay60 = null;
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.DateTime dateTime62 = yearMonthDay59.toDateTime(timeOfDay60, dateTimeZone61);
        boolean boolean63 = dateTime62.isBeforeNow();
        org.joda.time.DateTime dateTime65 = dateTime62.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime67 = dateTime65.withMinuteOfHour((int) (short) 0);
        boolean boolean68 = interval57.contains((org.joda.time.ReadableInstant) dateTime65);
        boolean boolean69 = interval45.contains((org.joda.time.ReadableInterval) interval57);
        boolean boolean71 = interval57.contains((long) (byte) 1);
        boolean boolean72 = interval10.overlaps((org.joda.time.ReadableInterval) interval57);
        org.joda.time.DateTime dateTime73 = interval10.getEnd();
        boolean boolean75 = dateTime73.isAfter(77846400033L);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str14, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str46, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(interval57);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + true + "'", boolean69 == true);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertTrue("'" + boolean75 + "' != '" + false + "'", boolean75 == false);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property3 = localDate0.weekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate4.withYearOfCentury(368);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 368 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(15, 35270);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878484809,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2022,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=4,MILLISECOND=809,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = localDate2.toDateTimeAtMidnight(dateTimeZone3);
        org.joda.time.DateTime dateTime7 = dateTime4.withDurationAdded((long) 292278993, (int) '#');
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime11 = interval10.getEnd();
        org.joda.time.Chronology chronology12 = interval10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        boolean boolean18 = dateTime17.isBeforeNow();
        org.joda.time.DateTime dateTime20 = dateTime17.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime24 = interval23.getEnd();
        org.joda.time.Chronology chronology25 = interval23.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime17.toDateTime(chronology25);
        boolean boolean27 = interval10.isAfter((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay30.toDateTime(timeOfDay31, dateTimeZone32);
        boolean boolean34 = dateTime33.isBeforeNow();
        org.joda.time.DateTime dateTime36 = dateTime33.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime40 = interval39.getEnd();
        org.joda.time.Chronology chronology41 = interval39.getChronology();
        org.joda.time.DateTime dateTime42 = dateTime33.toDateTime(chronology41);
        boolean boolean43 = durationFieldType28.isSupported(chronology41);
        org.joda.time.DateTime dateTime44 = dateTime26.toDateTime(chronology41);
        org.joda.time.DateTimeField dateTimeField45 = chronology41.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField46 = chronology41.era();
        org.joda.time.Chronology chronology47 = chronology41.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((java.lang.Object) 292278993, chronology47);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(durationFieldType28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(chronology47);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime5 = property3.addCopy((int) (short) 10);
        org.joda.time.LocalTime localTime6 = property3.withMaximumValue();
        org.joda.time.LocalTime localTime8 = localTime6.plusHours(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) 22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572885081,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=5,MILLISECOND=81,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(0, 35277, 306, 13, 35271, 19, 1, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35271 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        int int4 = localDateTime2.getSecondOfMinute();
        int int5 = localDateTime2.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime2.plusHours((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime(35275, 9, 2022, 901);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35275 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 4 + "'", int5 == 4);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        int int3 = localDateTime2.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusDays(2);
        int int6 = localDateTime2.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withMinuteOfHour(2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime3.withCenturyOfEra(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale1 = locale0.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale1.getUnicodeLocaleType("09:47:55.431");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 09:47:55.431");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 15);
        org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusMillis((int) (short) -1);
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.minutes();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long) 35271, chronology9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.years();
        boolean boolean13 = localDateTime11.isSupported(durationFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay15 = timeOfDay1.withFieldAdded(durationFieldType12, 306);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'years' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertNotNull(timeOfDay3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str3 = interval2.toString();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.Interval interval14 = interval6.overlap((org.joda.time.ReadableInterval) interval11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay16.toDateTime(timeOfDay17, dateTimeZone18);
        boolean boolean20 = dateTime19.isBeforeNow();
        org.joda.time.DateTime dateTime22 = dateTime19.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour((int) (short) 0);
        boolean boolean25 = interval14.contains((org.joda.time.ReadableInstant) dateTime22);
        boolean boolean26 = interval2.contains((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.Interval interval28 = interval2.withPeriodBeforeEnd(readablePeriod27);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = interval2.toPeriod(periodType29);
        // The following exception was thrown during execution in test generation
        try {
            int int32 = period30.getValue(182);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 182");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str3, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(0, 1970, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        int int5 = dateTime4.getCenturyOfEra();
        org.joda.time.DateTime dateTime7 = dateTime4.plusMillis((int) (byte) 0);
        int int8 = dateTime7.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime7.withDayOfWeek((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        org.joda.time.DateMidnight dateMidnight4 = property2.addToCopy(0);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minus(0L);
        org.joda.time.DateTime dateTime7 = dateMidnight6.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime7.withDayOfMonth(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusSeconds(11);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = property3.setCopy(15);
        java.util.Locale locale7 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay8 = property3.setCopy("35277", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35277 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_US");
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.util.Date date3 = new java.util.Date(47, 387, 7);
        int int4 = date3.getYear();
        int int5 = date3.getDay();
        java.util.Date date11 = new java.util.Date((int) '4', 15, (int) '#', (int) ' ', (int) (byte) 10);
        long long12 = date11.getTime();
        int int13 = date11.getTimezoneOffset();
        org.joda.time.TimeOfDay timeOfDay14 = org.joda.time.TimeOfDay.fromDateFields(date11);
        long long15 = date11.getTime();
        int int16 = date3.compareTo(date11);
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 07 00:00:00 UTC 1979");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertEquals(date11.toString(), "Wed May 06 08:10:00 UTC 1953");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + (-525628200000L) + "'", long12 == (-525628200000L));
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + (-525628200000L) + "'", long15 == (-525628200000L));
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateMidnight.Property property16 = dateMidnight14.dayOfWeek();
        org.joda.time.DateMidnight dateMidnight17 = property16.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight19 = property16.setCopy("09:47:55.746");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:47:55.746\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateMidnight17);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime1.property(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        org.joda.time.DateTime dateTime16 = yearMonthDay11.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay18.toDateTime(timeOfDay19, dateTimeZone20);
        boolean boolean22 = dateTime21.isBeforeNow();
        org.joda.time.DateTime dateTime24 = dateTime21.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean26 = dateTime24.isSupported(dateTimeFieldType25);
        org.joda.time.DurationFieldType durationFieldType27 = dateTimeFieldType25.getRangeDurationType();
        org.joda.time.DateTime.Property property28 = dateTime16.property(dateTimeFieldType25);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = localTime1.get(dateTimeFieldType25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572885827,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=5,MILLISECOND=827,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "09:48:05.827" + "'", str4, "09:48:05.827");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644572885827,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=5,MILLISECOND=827,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertNotNull(property28);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTime dateTime2 = localTime1.toDateTimeToday();
        org.joda.time.LocalTime localTime4 = localTime1.withMillisOfDay(0);
        int int5 = localTime4.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localTime4.getValue(588);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 588");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572885949,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=5,MILLISECOND=949,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay(dateTimeZone3);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay4.toDateTime(timeOfDay5, dateTimeZone6);
        boolean boolean8 = dateTime7.isBeforeNow();
        org.joda.time.DateTime dateTime10 = dateTime7.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime12 = dateTime10.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = dateTime10.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(0, 32772, 20, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(7, 2, 35281, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35281 for secondOfMinute must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(0, 44, 35271, (int) 'x', (int) (byte) 10, 22, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        int int7 = localDate6.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate6.withYear(292278994);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        int int4 = calendar0.getMinimalDaysInFirstWeek();
        int int5 = calendar0.getFirstDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar0.getLeastMaximum((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -292275054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878486117,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=6,MILLISECOND=117,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.DurationField durationField10 = chronology9.minutes();
        org.joda.time.DurationField durationField11 = chronology9.weekyears();
        org.joda.time.DurationField durationField12 = chronology9.millis();
        org.joda.time.DurationField durationField13 = chronology9.months();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 70, chronology9);
        org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(0L, chronology9);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(chronology9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((int) '4', (int) (short) 1, 70, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property3 = localDate0.weekyear();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone4);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay5.toDateTime(timeOfDay6, dateTimeZone7);
        int int9 = dateTime8.getCenturyOfEra();
        org.joda.time.DateTime dateTime11 = dateTime8.plusMillis((int) (byte) 0);
        int int12 = dateTime11.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay14.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property20 = yearMonthDay14.property(dateTimeFieldType19);
        org.joda.time.DateTime.Property property21 = dateTime11.property(dateTimeFieldType19);
        boolean boolean22 = localDate0.isSupported(dateTimeFieldType19);
        org.joda.time.LocalDate.Property property23 = localDate0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int25 = localDate0.getValue((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 20 + "'", int9 == 20);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        java.util.Date date4 = calendar0.getTime();
        int int5 = calendar0.getMinimalDaysInFirstWeek();
        calendar0.set(4, 35273);
        boolean boolean9 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=35273,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=6,MILLISECOND=243,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date4);
// flaky:         org.junit.Assert.assertEquals(date4.toString(), "Fri Jul 15 09:48:06 UTC 2022");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = dateTimeField5.getAsShortText(3, locale7);
        java.lang.String str10 = dateTimeField5.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeField5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "year" + "'", str10, "year");
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.Interval interval10 = interval2.overlap((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Duration duration11 = interval10.toDuration();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTime(timeOfDay14, dateTimeZone15);
        boolean boolean17 = dateTime16.isBeforeNow();
        org.joda.time.DateTime dateTime19 = dateTime16.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime21 = dateTime19.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime23 = dateTime21.minusHours((int) (byte) 100);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration11, (org.joda.time.ReadableInstant) dateTime21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = dateTime21.withDate((int) '#', 901, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 901 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        int int4 = calendar0.getMinimalDaysInFirstWeek();
        int int5 = calendar0.getFirstDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(dateTimeZone6);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.monthOfYear();
        org.joda.time.DateMidnight dateMidnight9 = org.joda.time.DateMidnight.now();
        long long10 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.DateMidnight dateMidnight11 = property8.roundHalfEvenCopy();
        boolean boolean12 = calendar0.after((java.lang.Object) dateMidnight11);
        int int13 = calendar0.getFirstDayOfWeek();
        java.lang.String str14 = calendar0.getCalendarType();
        boolean boolean15 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878486421,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=6,MILLISECOND=421,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "gregory" + "'", str14, "gregory");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(229L);
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 35271, chronology5);
        org.joda.time.DurationField durationField8 = chronology5.minutes();
        org.joda.time.DurationField durationField9 = chronology5.centuries();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime17.getZone();
        int int22 = dateTimeZone20.getStandardOffset((long) 13);
        long long26 = dateTimeZone20.convertLocalToUTC(229L, false, (long) 49);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((java.lang.Object) durationField9, dateTimeZone20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ZonedChronology$ZonedDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 229L + "'", long26 == 229L);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        boolean boolean12 = dateTime10.isAfterNow();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        org.joda.time.YearMonthDay.Property property18 = yearMonthDay14.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        org.joda.time.YearMonthDay.Property property24 = yearMonthDay20.monthOfYear();
        org.joda.time.DateTime dateTime25 = yearMonthDay20.toDateTimeAtCurrentTime();
        int int26 = property18.compareTo((org.joda.time.ReadablePartial) yearMonthDay20);
        org.joda.time.Chronology chronology27 = yearMonthDay20.getChronology();
        org.joda.time.DurationField durationField28 = chronology27.halfdays();
        org.joda.time.DateTimeField dateTimeField29 = chronology27.era();
        int int30 = dateTime10.get(dateTimeField29);
        java.util.Locale locale32 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = dateTimeField29.getAsShortText((int) (byte) -1, locale32);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1 + "'", int30 == 1);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.minutes();
        org.joda.time.DurationField durationField10 = chronology8.weekyears();
        org.joda.time.DurationField durationField11 = chronology8.millis();
        org.joda.time.DurationField durationField12 = chronology8.months();
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) 70, chronology8);
        org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay(0L, chronology8);
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(35273, 35272, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35273 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        int int3 = localDateTime2.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusDays(2);
        int int6 = localDateTime2.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withMinuteOfHour(2);
        int int9 = localDateTime2.getYearOfCentury();
        int int10 = localDateTime2.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime2.minusMinutes(42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfMonth(35277);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35277 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 70 + "'", int9 == 70);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        int int12 = dateTime10.getSecondOfDay();
        org.joda.time.DateTime dateTime14 = dateTime10.plusWeeks(0);
        int int15 = dateTime10.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime10.withDate(0, 587, 86399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 587 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35286 + "'", int12 == 35286);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 93 + "'", int15 == 93);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        int int3 = localDateTime2.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusDays(2);
        int int6 = localDateTime2.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withEra(15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        int int4 = localDateTime2.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusYears(2022);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.days();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withFieldAdded(durationFieldType7, (int) (short) 1);
        int int10 = localDateTime6.getEra();
        org.joda.time.LocalDateTime.Property property11 = localDateTime6.weekyear();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        long long6 = java.util.Date.UTC(35280, (int) ' ', 35280, (int) 'a', 0, 93);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1114252851693000L + "'", long6 == 1114252851693000L);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay6 = property5.getYearMonthDay();
        java.util.Locale locale8 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.lang.String str10 = locale8.getDisplayScript();
        java.lang.String str11 = locale8.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay12 = property5.setCopy("Property[monthOfYear]", locale8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[monthOfYear]\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "zh-TW" + "'", str11, "zh-TW");
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        int int3 = localDateTime2.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusDays(2);
        int int6 = localDateTime2.getYearOfCentury();
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.hourOfDay();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime2.plusSeconds(12);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property10.setCopy("2022-02-25T09:48:06.134Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-25T09:48:06.134Z\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(dateTimeZone2);
        org.joda.time.TimeOfDay timeOfDay4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = yearMonthDay3.toDateTime(timeOfDay4, dateTimeZone5);
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay3.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone8);
        org.joda.time.TimeOfDay timeOfDay10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = yearMonthDay9.toDateTime(timeOfDay10, dateTimeZone11);
        org.joda.time.YearMonthDay.Property property13 = yearMonthDay9.monthOfYear();
        org.joda.time.DateTime dateTime14 = yearMonthDay9.toDateTimeAtCurrentTime();
        int int15 = property7.compareTo((org.joda.time.ReadablePartial) yearMonthDay9);
        org.joda.time.Chronology chronology16 = yearMonthDay9.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.clockhourOfHalfday();
        org.joda.time.DurationField durationField18 = chronology16.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(962, 292278993, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 962 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay1 = org.joda.time.YearMonthDay.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 'a', dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusMonths(746);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone6);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.monthOfYear();
        int int9 = localDateTime7.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withWeekyear(11);
        int int12 = localDateTime11.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int14 = localDateTime11.get(dateTimeFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate4.withField(dateTimeFieldType13, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 11 + "'", int14 == 11);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime5 = property3.addCopy((int) (short) 10);
        org.joda.time.LocalTime localTime6 = property3.withMaximumValue();
        org.joda.time.LocalTime localTime8 = localTime6.plusHours(22);
        org.joda.time.LocalTime localTime10 = localTime8.minusMillis(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime12 = localTime10.withHourOfDay(708);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 708 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572887372,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=7,MILLISECOND=372,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.MutableDateTime mutableDateTime10 = dateTime9.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime9.withWeekOfWeekyear((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean9 = dateTime7.isSupported(dateTimeFieldType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime7.withDayOfWeek(49);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay4.year();
        int[] intArray8 = yearMonthDay4.getValues();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate11 = localDate9.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property12 = localDate9.weekyear();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        int int18 = dateTime17.getCenturyOfEra();
        org.joda.time.DateTime dateTime20 = dateTime17.plusMillis((int) (byte) 0);
        int int21 = dateTime20.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        org.joda.time.YearMonthDay.Property property27 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property29 = yearMonthDay23.property(dateTimeFieldType28);
        org.joda.time.DateTime.Property property30 = dateTime20.property(dateTimeFieldType28);
        boolean boolean31 = localDate9.isSupported(dateTimeFieldType28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay33 = yearMonthDay4.withField(dateTimeFieldType28, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878487475,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=7,MILLISECOND=475,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[2022, 7, 15]");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 20 + "'", int18 == 20);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 11 + "'", int21 == 11);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        java.lang.String str11 = dateTime10.toString();
        org.joda.time.DateTime.Property property12 = dateTime10.year();
        org.joda.time.DateTime dateTime13 = property12.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.monthOfYear();
        boolean boolean15 = dateTime13.isSupported(dateTimeFieldType14);
        org.joda.time.Instant instant16 = dateTime13.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime13.withDayOfWeek((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292278993-02-08T09:48:07.493Z" + "'", str11, "292278993-02-08T09:48:07.493Z");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(instant16);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime4.withYearOfCentury(522);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 522 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusSeconds(11);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay5 = property3.setCopy(15);
        int int6 = timeOfDay5.getMillisOfSecond();
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(timeOfDay5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 660 + "'", int6 == 660);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        java.util.Date date1 = new java.util.Date(1163943L);
        int int2 = date1.getYear();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:19:23 UTC 1970");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 70 + "'", int2 == 70);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime11 = interval10.getEnd();
        org.joda.time.Chronology chronology12 = interval10.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime4.toDateTime(chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime4.withTime(306, 51, 35270, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 306 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        int int3 = localDateTime2.getMinuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime2.plusDays(2);
        int int6 = localDateTime2.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withMinuteOfHour(2);
        int int9 = localDateTime2.getYearOfCentury();
        int int10 = localDateTime2.getDayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime2.minusMinutes(42);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean14 = localDateTime2.isSupported(dateTimeFieldType13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime2.withDayOfMonth(51);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 51 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 70 + "'", int6 == 70);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 70 + "'", int9 == 70);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        int int5 = dateTime4.getCenturyOfEra();
        org.joda.time.DateTime dateTime7 = dateTime4.plusMillis((int) (byte) 0);
        int int8 = dateTime4.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime4.withTime((int) (byte) 0, 708, 883, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 708 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 9 + "'", int8 == 9);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        int int1 = dateMidnight0.getDayOfMonth();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.withYearOfCentury((int) (short) 1);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight3.withPeriodAdded(readablePeriod4, 22);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays(4);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTime dateTime22 = yearMonthDay17.toDateTimeAtCurrentTime();
        int int23 = property15.compareTo((org.joda.time.ReadablePartial) yearMonthDay17);
        org.joda.time.Chronology chronology24 = yearMonthDay17.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.weekOfWeekyear();
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleKeys();
        int int28 = dateTimeField25.getMaximumTextLength(locale26);
        java.lang.String str29 = locale26.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dateMidnight6.toString("292278993-02-08T09:48:06.020Z", locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 11 + "'", int1 == 11);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_US");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2 + "'", int28 == 2);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "en-US" + "'", str29, "en-US");
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str3 = interval2.toString();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.Interval interval14 = interval6.overlap((org.joda.time.ReadableInterval) interval11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay16.toDateTime(timeOfDay17, dateTimeZone18);
        boolean boolean20 = dateTime19.isBeforeNow();
        org.joda.time.DateTime dateTime22 = dateTime19.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour((int) (short) 0);
        boolean boolean25 = interval14.contains((org.joda.time.ReadableInstant) dateTime22);
        boolean boolean26 = interval2.contains((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.Interval interval28 = interval2.withPeriodBeforeEnd(readablePeriod27);
        org.joda.time.PeriodType periodType29 = null;
        org.joda.time.Period period30 = interval2.toPeriod(periodType29);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((java.lang.Object) interval2, dateTimeZone31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.Interval");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str3, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(period30);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay4.year();
        int[] intArray8 = yearMonthDay4.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay4.withMonthOfYear(746);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 746 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878487936,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=7,MILLISECOND=936,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[2022, 7, 15]");
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusSeconds(11);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay0.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.withField(dateTimeFieldType5, 4);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        org.joda.time.DurationFieldType durationFieldType9 = dateTimeFieldType8.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay11 = timeOfDay7.withField(dateTimeFieldType8, 522);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(durationFieldType9);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusSeconds(11);
        org.joda.time.TimeOfDay timeOfDay4 = timeOfDay0.withSecondOfMinute((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay4.withField(dateTimeFieldType5, 4);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.years();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay10 = timeOfDay7.withFieldAdded(durationFieldType8, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'years' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(timeOfDay7);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        org.joda.time.DateTime dateTime7 = localDate2.toDateTimeAtCurrentTime();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance();
        java.util.Date date9 = calendar8.getTime();
        calendar8.setFirstDayOfWeek(32770);
        int int12 = calendar8.getFirstDayOfWeek();
        java.util.Date date13 = calendar8.getTime();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance();
        calendar14.add(3, 22);
        java.util.Date date18 = calendar14.getTime();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        boolean boolean24 = dateTime23.isBeforeNow();
        org.joda.time.DateTime dateTime26 = dateTime23.withMonthOfYear((int) (byte) 1);
        int int27 = dateTime23.getYear();
        org.joda.time.DateTime.Property property28 = dateTime23.weekyear();
        org.joda.time.DateTime dateTime29 = property28.withMaximumValue();
        org.joda.time.DateTime dateTime30 = property28.roundHalfCeilingCopy();
        java.util.Date date31 = dateTime30.toDate();
        int int32 = date31.getDate();
        org.joda.time.YearMonthDay yearMonthDay33 = org.joda.time.YearMonthDay.fromDateFields(date31);
        boolean boolean34 = date18.before(date31);
        date31.setSeconds(1970);
        boolean boolean37 = date13.before(date31);
        date31.setTime((-525628200000L));
        boolean boolean40 = localDate2.equals((java.lang.Object) (-525628200000L));
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1644572888044,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=32770,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=8,MILLISECOND=44,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Feb 11 09:48:08 UTC 2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 32770 + "'", int12 == 32770);
        org.junit.Assert.assertNotNull(date13);
// flaky:         org.junit.Assert.assertEquals(date13.toString(), "Fri Feb 11 09:48:08 UTC 2022");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1657878488044,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=8,MILLISECOND=44,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date18);
// flaky:         org.junit.Assert.assertEquals(date18.toString(), "Fri Jul 15 09:48:08 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2022 + "'", int27 == 2022);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(date31);
        org.junit.Assert.assertEquals(date31.toString(), "Wed May 06 08:10:00 UTC 1953");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 3 + "'", int32 == 3);
        org.junit.Assert.assertNotNull(yearMonthDay33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("Property[millisOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: Property[millisOfDay]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(0, 271, 32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 271 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTime(timeOfDay9, dateTimeZone10);
        int int12 = dateTime11.getCenturyOfEra();
        org.joda.time.DateTime dateTime14 = dateTime11.plusMillis((int) (byte) 0);
        int int15 = dateTime14.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay17.property(dateTimeFieldType22);
        org.joda.time.DateTime.Property property24 = dateTime14.property(dateTimeFieldType22);
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType22.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.Chronology chronology28 = yearMonthDay27.getChronology();
        org.joda.time.DurationField durationField29 = durationFieldType25.getField(chronology28);
        org.joda.time.Chronology chronology30 = chronology28.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime(19, 42, 588, 12, 32770, 621, 93, chronology28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(chronology30);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 182);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay12.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay12.minusMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        boolean boolean24 = dateTime23.isBeforeNow();
        org.joda.time.DateTime dateTime26 = dateTime23.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime28 = dateTime26.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime26.getZone();
        int int31 = dateTimeZone29.getStandardOffset((long) 13);
        org.joda.time.DateTime dateTime32 = yearMonthDay12.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter8.withZone(dateTimeZone29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((-52), 44, (int) '#', 99, 722, (int) ' ', dateTimeZone29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime dateTime11 = property9.roundHalfCeilingCopy();
        java.util.Date date12 = dateTime11.toDate();
        date12.setSeconds((int) '#');
        java.lang.Object obj15 = date12.clone();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Jan 03 00:00:35 UTC 2022");
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertEquals(obj15.toString(), "Mon Jan 03 00:00:35 UTC 2022");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj15), "Mon Jan 03 00:00:35 UTC 2022");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj15), "Mon Jan 03 00:00:35 UTC 2022");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter3.withPivotYear((java.lang.Integer) 182);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.parse("292278993-02-08T09:47:56.387Z", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusSeconds(11);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.TimeOfDay timeOfDay5 = property3.withMaximumValue();
        org.joda.time.TimeOfDay.Property property6 = timeOfDay5.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay7 = property6.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay9 = property6.setCopy(621);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 621 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(timeOfDay7);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.util.Date date3 = new java.util.Date(47, 387, 7);
        int int4 = date3.getYear();
        int int5 = date3.getDate();
        java.lang.String str6 = date3.toString();
        org.junit.Assert.assertEquals(date3.toString(), "Sat Apr 07 00:00:00 UTC 1979");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 79 + "'", int4 == 79);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 7 + "'", int5 == 7);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Sat Apr 07 00:00:00 UTC 1979" + "'", str6, "Sat Apr 07 00:00:00 UTC 1979");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight.Property property3 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight.Property property4 = dateMidnight1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        long long7 = dateTimeField5.roundHalfEven((long) 371);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeField5.set((long) (-52), "");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        java.util.TimeZone timeZone9 = calendar0.getTimeZone();
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Chronology chronology15 = interval13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        int int17 = dateTimeField16.getMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.YearMonthDay yearMonthDay19 = new org.joda.time.YearMonthDay(dateTimeZone18);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.minusDays(0);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay19.withYear(22);
        int int24 = yearMonthDay19.size();
        java.util.Calendar calendar25 = java.util.Calendar.getInstance();
        calendar25.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay29 = org.joda.time.YearMonthDay.fromCalendarFields(calendar25);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay29.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property32 = yearMonthDay29.year();
        int[] intArray33 = yearMonthDay29.getValues();
        int int34 = dateTimeField16.getMinimumValue((org.joda.time.ReadablePartial) yearMonthDay19, intArray33);
        org.joda.time.LocalDate localDate35 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate37 = localDate35.withYearOfCentury(10);
        org.joda.time.LocalDate localDate39 = localDate37.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.YearMonthDay yearMonthDay41 = new org.joda.time.YearMonthDay(dateTimeZone40);
        org.joda.time.TimeOfDay timeOfDay42 = null;
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.DateTime dateTime44 = yearMonthDay41.toDateTime(timeOfDay42, dateTimeZone43);
        org.joda.time.YearMonthDay.Property property45 = yearMonthDay41.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.YearMonthDay yearMonthDay47 = new org.joda.time.YearMonthDay(dateTimeZone46);
        org.joda.time.TimeOfDay timeOfDay48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.DateTime dateTime50 = yearMonthDay47.toDateTime(timeOfDay48, dateTimeZone49);
        org.joda.time.YearMonthDay.Property property51 = yearMonthDay47.monthOfYear();
        org.joda.time.DateTime dateTime52 = yearMonthDay47.toDateTimeAtCurrentTime();
        int int53 = property45.compareTo((org.joda.time.ReadablePartial) yearMonthDay47);
        org.joda.time.Chronology chronology54 = yearMonthDay47.getChronology();
        org.joda.time.YearMonthDay yearMonthDay56 = yearMonthDay47.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType57 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean58 = yearMonthDay47.isSupported(dateTimeFieldType57);
        boolean boolean59 = localDate39.isSupported(dateTimeFieldType57);
        java.util.Locale locale61 = java.util.Locale.UK;
        java.lang.String str62 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) localDate39, 9, locale61);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone9, locale61);
        // The following exception was thrown during execution in test generation
        try {
            calendar63.roll(51, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878488650,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2022,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=8,MILLISECOND=650,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeZone9);
        org.junit.Assert.assertEquals(timeZone9.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 292278993 + "'", int17 == 292278993);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 3 + "'", int24 == 3);
        org.junit.Assert.assertNotNull(calendar25);
// flaky:         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=1657878488651,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=8,MILLISECOND=651,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[2022, 7, 15]");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + (-292275054) + "'", int34 == (-292275054));
        org.junit.Assert.assertNotNull(localDate35);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(yearMonthDay56);
        org.junit.Assert.assertNotNull(dateTimeFieldType57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + false + "'", boolean58 == false);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
        org.junit.Assert.assertNotNull(locale61);
        org.junit.Assert.assertEquals(locale61.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "9" + "'", str62, "9");
        org.junit.Assert.assertNotNull(calendar63);
// flaky:         org.junit.Assert.assertEquals(calendar63.toString(), "java.util.GregorianCalendar[time=1644572888651,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=8,MILLISECOND=651,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTime(timeOfDay9, dateTimeZone10);
        int int12 = dateTime11.getCenturyOfEra();
        org.joda.time.DateTime dateTime14 = dateTime11.plusMillis((int) (byte) 0);
        int int15 = dateTime14.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property23 = yearMonthDay17.property(dateTimeFieldType22);
        org.joda.time.DateTime.Property property24 = dateTime14.property(dateTimeFieldType22);
        org.joda.time.DurationFieldType durationFieldType25 = dateTimeFieldType22.getDurationType();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.Chronology chronology28 = yearMonthDay27.getChronology();
        org.joda.time.DurationField durationField29 = durationFieldType25.getField(chronology28);
        org.joda.time.YearMonthDay yearMonthDay31 = yearMonthDay4.withFieldAdded(durationFieldType25, (int) (short) 100);
        int int32 = yearMonthDay31.getDayOfMonth();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878488763,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=8,MILLISECOND=763,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 11 + "'", int15 == 11);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(durationFieldType25);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(yearMonthDay31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 15 + "'", int32 == 15);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime1.property(dateTimeFieldType7);
        org.joda.time.LocalTime localTime11 = localTime1.plusHours((int) (short) -1);
        int int12 = localTime1.getMillisOfSecond();
        org.joda.time.DateTime dateTime13 = localTime1.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime1.withSecondOfMinute(35270);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35270 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572888876,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=8,MILLISECOND=876,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "09:48:08.876" + "'", str4, "09:48:08.876");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644572888876,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=8,MILLISECOND=876,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 876 + "'", int12 == 876);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((long) 35271, chronology5);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.years();
        boolean boolean9 = localDateTime7.isSupported(durationFieldType8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.minus(readableDuration10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minus(readablePeriod12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withCenturyOfEra(292278994);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 271);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.minutes();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTimeField dateTimeField8 = chronology4.minuteOfDay();
        java.util.Locale locale10 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str12 = locale10.getExtension('a');
        java.lang.String str13 = dateTimeField8.getAsText(4, locale10);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeField8.set((long) 901, "-0001-02-11");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"-0001-02-11\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_CN");
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "4" + "'", str13, "4");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 182);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        org.joda.time.YearMonthDay.Property property10 = yearMonthDay6.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay6.minusMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        boolean boolean18 = dateTime17.isBeforeNow();
        org.joda.time.DateTime dateTime20 = dateTime17.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime22 = dateTime20.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime20.getZone();
        int int25 = dateTimeZone23.getStandardOffset((long) 13);
        org.joda.time.DateTime dateTime26 = yearMonthDay6.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withZone(dateTimeZone23);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = dateTimeFormatter2.parseMillis("09:48:04.383");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(962, (int) (short) 100, 17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must not be larger than 12");
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
            org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(42, 896, (int) '4', (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localDate6.toString("", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("09:47:54.387");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: 09:47:54.387");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.Chronology chronology14 = yearMonthDay7.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.dayOfWeek();
        int int18 = dateTimeField15.getDifference((long) 'a', (long) (-1));
        // The following exception was thrown during execution in test generation
        try {
            long long21 = dateTimeField15.set((long) 4, 2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        int int7 = dateTime6.getYear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTime(timeOfDay3, dateTimeZone4);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTime(timeOfDay9, dateTimeZone10);
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay8.monthOfYear();
        org.joda.time.DateTime dateTime13 = yearMonthDay8.toDateTimeAtCurrentTime();
        int int14 = property6.compareTo((org.joda.time.ReadablePartial) yearMonthDay8);
        org.joda.time.Chronology chronology15 = yearMonthDay8.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekOfWeekyear();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Chronology chronology21 = interval19.getChronology();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime25 = interval24.getEnd();
        org.joda.time.Chronology chronology26 = interval24.getChronology();
        org.joda.time.Interval interval27 = interval19.overlap((org.joda.time.ReadableInterval) interval24);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str31 = interval30.toString();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime40 = interval39.getEnd();
        org.joda.time.Chronology chronology41 = interval39.getChronology();
        org.joda.time.Interval interval42 = interval34.overlap((org.joda.time.ReadableInterval) interval39);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay(dateTimeZone43);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay44.toDateTime(timeOfDay45, dateTimeZone46);
        boolean boolean48 = dateTime47.isBeforeNow();
        org.joda.time.DateTime dateTime50 = dateTime47.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime52 = dateTime50.withMinuteOfHour((int) (short) 0);
        boolean boolean53 = interval42.contains((org.joda.time.ReadableInstant) dateTime50);
        boolean boolean54 = interval30.contains((org.joda.time.ReadableInterval) interval42);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.Interval interval56 = interval30.withPeriodBeforeEnd(readablePeriod55);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = interval30.toPeriod(periodType57);
        org.joda.time.Interval interval59 = interval27.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period58);
        long long62 = chronology15.add((org.joda.time.ReadablePeriod) period58, (long) 'a', 4);
        org.joda.time.DurationField durationField63 = chronology15.centuries();
        org.joda.time.YearMonthDay yearMonthDay64 = new org.joda.time.YearMonthDay(obj0, chronology15);
        org.joda.time.LocalDate localDate65 = org.joda.time.LocalDate.now(chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate67 = localDate65.withEra(5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 5 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str31, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 229L + "'", long62 == 229L);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(localDate65);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay2 = yearMonthDay0.withDayOfMonth(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        int int5 = dateTime4.getCenturyOfEra();
        org.joda.time.DateTime dateTime7 = dateTime4.plusMillis((int) (byte) 0);
        int int8 = dateTime7.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay10.toDateTime(timeOfDay11, dateTimeZone12);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay10.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay10.property(dateTimeFieldType15);
        org.joda.time.DateTime.Property property17 = dateTime7.property(dateTimeFieldType15);
        org.joda.time.DateTime dateTime18 = property17.roundCeilingCopy();
        org.joda.time.DateTime dateTime19 = property17.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = property17.setCopy(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 11 + "'", int8 == 11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(10L);
        org.joda.time.LocalTime localTime3 = localTime1.withHourOfDay(3);
        org.joda.time.LocalTime localTime5 = localTime3.withMinuteOfHour(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter6 = null;
        org.joda.time.format.DateTimeParser dateTimeParser7 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter6, dateTimeParser7);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((java.lang.Integer) 182);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay12.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay12.minusMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
        org.joda.time.TimeOfDay timeOfDay21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = yearMonthDay20.toDateTime(timeOfDay21, dateTimeZone22);
        boolean boolean24 = dateTime23.isBeforeNow();
        org.joda.time.DateTime dateTime26 = dateTime23.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime28 = dateTime26.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime26.getZone();
        int int31 = dateTimeZone29.getStandardOffset((long) 13);
        org.joda.time.DateTime dateTime32 = yearMonthDay12.toDateTimeAtCurrentTime(dateTimeZone29);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter33 = dateTimeFormatter8.withZone(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone34 = dateTimeFormatter33.getZone();
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.YearMonthDay yearMonthDay37 = new org.joda.time.YearMonthDay(dateTimeZone36);
        org.joda.time.TimeOfDay timeOfDay38 = null;
        org.joda.time.DateTimeZone dateTimeZone39 = null;
        org.joda.time.DateTime dateTime40 = yearMonthDay37.toDateTime(timeOfDay38, dateTimeZone39);
        boolean boolean41 = dateTime40.isBeforeNow();
        org.joda.time.DateTime dateTime43 = dateTime40.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime45 = dateTime43.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone46 = dateTime43.getZone();
        java.util.Calendar calendar47 = java.util.Calendar.getInstance();
        calendar47.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay51 = org.joda.time.YearMonthDay.fromCalendarFields(calendar47);
        calendar47.setFirstDayOfWeek(2022);
        int int55 = calendar47.getMinimum(2);
        java.util.TimeZone timeZone56 = calendar47.getTimeZone();
        org.joda.time.Interval interval59 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime60 = interval59.getEnd();
        org.joda.time.Chronology chronology61 = interval59.getChronology();
        org.joda.time.DateTimeField dateTimeField62 = chronology61.year();
        java.util.Locale locale63 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet64 = locale63.getUnicodeLocaleKeys();
        java.lang.String str65 = locale63.getDisplayCountry();
        int int66 = dateTimeField62.getMaximumTextLength(locale63);
        java.lang.String str67 = locale63.getDisplayScript();
        java.util.Calendar calendar68 = java.util.Calendar.getInstance(locale63);
        java.util.Calendar calendar69 = java.util.Calendar.getInstance(timeZone56, locale63);
        org.joda.time.DateTimeZone dateTimeZone70 = org.joda.time.DateTimeZone.forTimeZone(timeZone56);
        long long72 = dateTimeZone70.previousTransition((long) 8);
        long long74 = dateTimeZone46.getMillisKeepLocal(dateTimeZone70, (long) (byte) 0);
        org.joda.time.DateTime dateTime75 = new org.joda.time.DateTime((long) 35277, dateTimeZone70);
        long long77 = dateTimeZone70.convertUTCToLocal((long) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter78 = dateTimeFormatter33.withZone(dateTimeZone70);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str79 = localTime3.toString(dateTimeFormatter33);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTimeFormatter33);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(calendar47);
// flaky:         org.junit.Assert.assertEquals(calendar47.toString(), "java.util.GregorianCalendar[time=1657878490027,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2022,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=10,MILLISECOND=27,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay51);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 0 + "'", int55 == 0);
        org.junit.Assert.assertNotNull(timeZone56);
// flaky:         org.junit.Assert.assertEquals(timeZone56.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTimeField62);
        org.junit.Assert.assertNotNull(locale63);
// flaky:         org.junit.Assert.assertEquals(locale63.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet64);
// flaky:         org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\u53f0\u7063" + "'", str65, "\u53f0\u7063");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 9 + "'", int66 == 9);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "" + "'", str67, "");
        org.junit.Assert.assertNotNull(calendar68);
// flaky:         org.junit.Assert.assertEquals(calendar68.toString(), "java.util.GregorianCalendar[time=1644572890027,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=10,MILLISECOND=27,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar69);
// flaky:         org.junit.Assert.assertEquals(calendar69.toString(), "java.util.GregorianCalendar[time=1644572890027,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=10,MILLISECOND=27,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone70);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 8L + "'", long72 == 8L);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 0L + "'", long74 == 0L);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 97L + "'", long77 == 97L);
        org.junit.Assert.assertNotNull(dateTimeFormatter78);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay(dateTimeZone1);
        org.joda.time.TimeOfDay timeOfDay3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = yearMonthDay2.toDateTime(timeOfDay3, dateTimeZone4);
        org.joda.time.YearMonthDay.Property property6 = yearMonthDay2.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTime(timeOfDay9, dateTimeZone10);
        org.joda.time.YearMonthDay.Property property12 = yearMonthDay8.monthOfYear();
        org.joda.time.DateTime dateTime13 = yearMonthDay8.toDateTimeAtCurrentTime();
        int int14 = property6.compareTo((org.joda.time.ReadablePartial) yearMonthDay8);
        org.joda.time.Chronology chronology15 = yearMonthDay8.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekOfWeekyear();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Chronology chronology21 = interval19.getChronology();
        org.joda.time.Interval interval24 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime25 = interval24.getEnd();
        org.joda.time.Chronology chronology26 = interval24.getChronology();
        org.joda.time.Interval interval27 = interval19.overlap((org.joda.time.ReadableInterval) interval24);
        org.joda.time.Interval interval30 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str31 = interval30.toString();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime40 = interval39.getEnd();
        org.joda.time.Chronology chronology41 = interval39.getChronology();
        org.joda.time.Interval interval42 = interval34.overlap((org.joda.time.ReadableInterval) interval39);
        org.joda.time.DateTimeZone dateTimeZone43 = null;
        org.joda.time.YearMonthDay yearMonthDay44 = new org.joda.time.YearMonthDay(dateTimeZone43);
        org.joda.time.TimeOfDay timeOfDay45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = null;
        org.joda.time.DateTime dateTime47 = yearMonthDay44.toDateTime(timeOfDay45, dateTimeZone46);
        boolean boolean48 = dateTime47.isBeforeNow();
        org.joda.time.DateTime dateTime50 = dateTime47.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime52 = dateTime50.withMinuteOfHour((int) (short) 0);
        boolean boolean53 = interval42.contains((org.joda.time.ReadableInstant) dateTime50);
        boolean boolean54 = interval30.contains((org.joda.time.ReadableInterval) interval42);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.Interval interval56 = interval30.withPeriodBeforeEnd(readablePeriod55);
        org.joda.time.PeriodType periodType57 = null;
        org.joda.time.Period period58 = interval30.toPeriod(periodType57);
        org.joda.time.Interval interval59 = interval27.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period58);
        long long62 = chronology15.add((org.joda.time.ReadablePeriod) period58, (long) 'a', 4);
        org.joda.time.DurationField durationField63 = chronology15.centuries();
        org.joda.time.YearMonthDay yearMonthDay64 = new org.joda.time.YearMonthDay(obj0, chronology15);
        org.joda.time.LocalDate localDate65 = org.joda.time.LocalDate.now(chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField67 = localDate65.getField((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str31, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(interval42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertNotNull(interval56);
        org.junit.Assert.assertNotNull(period58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 229L + "'", long62 == 229L);
        org.junit.Assert.assertNotNull(durationField63);
        org.junit.Assert.assertNotNull(localDate65);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime1.property(dateTimeFieldType7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone10);
        java.util.Calendar calendar12 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromCalendarFields(calendar12);
        boolean boolean15 = localTime13.equals((java.lang.Object) 16);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.withFields((org.joda.time.ReadablePartial) localTime13);
        int int17 = property9.compareTo((org.joda.time.ReadableInstant) dateMidnight11);
        org.joda.time.Instant instant18 = dateMidnight11.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight20 = dateMidnight11.withMonthOfYear(99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572890259,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=10,MILLISECOND=259,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "09:48:10.259" + "'", str4, "09:48:10.259");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644572890259,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=10,MILLISECOND=259,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1644572890259,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=10,MILLISECOND=259,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertNotNull(instant18);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) '4', dateTimeZone1);
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.now();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localDate2.compareTo((org.joda.time.ReadablePartial) localTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay4.year();
        int[] intArray8 = yearMonthDay4.getValues();
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay4.year();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        boolean boolean15 = dateTime14.isBeforeNow();
        org.joda.time.DateTime dateTime17 = dateTime14.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime19 = dateTime17.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone20 = dateTime17.getZone();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        calendar21.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay25 = org.joda.time.YearMonthDay.fromCalendarFields(calendar21);
        calendar21.setFirstDayOfWeek(2022);
        int int29 = calendar21.getMinimum(2);
        java.util.TimeZone timeZone30 = calendar21.getTimeZone();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.DateTimeField dateTimeField36 = chronology35.year();
        java.util.Locale locale37 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet38 = locale37.getUnicodeLocaleKeys();
        java.lang.String str39 = locale37.getDisplayCountry();
        int int40 = dateTimeField36.getMaximumTextLength(locale37);
        java.lang.String str41 = locale37.getDisplayScript();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale37);
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(timeZone30, locale37);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forTimeZone(timeZone30);
        long long46 = dateTimeZone44.previousTransition((long) 8);
        long long48 = dateTimeZone20.getMillisKeepLocal(dateTimeZone44, (long) (byte) 0);
        org.joda.time.LocalDate localDate49 = new org.joda.time.LocalDate(dateTimeZone20);
        org.joda.time.DateTime dateTime50 = yearMonthDay4.toDateTimeAtMidnight(dateTimeZone20);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878490638,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=10,MILLISECOND=638,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(intArray8);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[2022, 7, 15]");
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1657878490639,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2022,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=10,MILLISECOND=639,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(timeZone30);
// flaky:         org.junit.Assert.assertEquals(timeZone30.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(locale37);
// flaky:         org.junit.Assert.assertEquals(locale37.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet38);
// flaky:         org.junit.Assert.assertEquals("'" + str39 + "' != '" + "\u53f0\u7063" + "'", str39, "\u53f0\u7063");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(calendar42);
// flaky:         org.junit.Assert.assertEquals(calendar42.toString(), "java.util.GregorianCalendar[time=1644572890639,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=10,MILLISECOND=639,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar43);
// flaky:         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=1644572890639,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=10,MILLISECOND=639,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 8L + "'", long46 == 8L);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(dateTime50);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        calendar0.set((int) '#', (int) 'u', 20, 15, (int) '4', 0);
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        boolean boolean15 = calendar0.after((java.lang.Object) dateTimeField14);
        int int16 = calendar0.getWeekYear();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Chronology chronology21 = interval19.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.minutes();
        org.joda.time.DurationField durationField23 = chronology21.weekyears();
        boolean boolean24 = calendar0.equals((java.lang.Object) chronology21);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-60753485279304,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=44,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=294,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=52,SECOND=0,MILLISECOND=696,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 44 + "'", int16 == 44);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.YearMonthDay yearMonthDay4 = new org.joda.time.YearMonthDay(dateTimeZone3);
        org.joda.time.TimeOfDay timeOfDay5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = yearMonthDay4.toDateTime(timeOfDay5, dateTimeZone6);
        org.joda.time.YearMonthDay.Property property8 = yearMonthDay4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay10.toDateTime(timeOfDay11, dateTimeZone12);
        org.joda.time.YearMonthDay.Property property14 = yearMonthDay10.monthOfYear();
        org.joda.time.DateTime dateTime15 = yearMonthDay10.toDateTimeAtCurrentTime();
        int int16 = property8.compareTo((org.joda.time.ReadablePartial) yearMonthDay10);
        org.joda.time.Chronology chronology17 = yearMonthDay10.getChronology();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(292278994, 10, 32769, chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property2 = localDate0.era();
        int int3 = localDate0.size();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone4);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay5.toDateTime(timeOfDay6, dateTimeZone7);
        boolean boolean9 = dateTime8.isBeforeNow();
        org.joda.time.DateTime dateTime11 = dateTime8.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean13 = dateTime11.isSupported(dateTimeFieldType12);
        int int14 = localDate0.indexOf(dateTimeFieldType12);
        org.joda.time.LocalDate localDate16 = localDate0.withDayOfYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int18 = localDate16.getValue(35279414);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35279414");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2 + "'", int14 == 2);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.Interval interval10 = interval2.overlap((org.joda.time.ReadableInterval) interval7);
        org.joda.time.Interval interval11 = interval2.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval13 = interval2.withEndMillis((-62135596800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(interval11);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.centuryOfEra();
        org.joda.time.Interval interval4 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime5 = interval4.getEnd();
        org.joda.time.Chronology chronology6 = interval4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
        org.joda.time.TimeOfDay timeOfDay9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = yearMonthDay8.toDateTime(timeOfDay9, dateTimeZone10);
        boolean boolean12 = dateTime11.isBeforeNow();
        org.joda.time.DateTime dateTime14 = dateTime11.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.DateTime dateTime20 = dateTime11.toDateTime(chronology19);
        boolean boolean21 = interval4.isAfter((org.joda.time.ReadableInstant) dateTime20);
        org.joda.time.LocalDate localDate22 = dateTime20.toLocalDate();
        org.joda.time.LocalDate localDate24 = localDate22.withYear((int) (short) -1);
        java.lang.String str25 = localDate24.toString();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = interval29.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.year();
        org.joda.time.DurationField durationField33 = chronology31.minutes();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) 16, chronology31);
        org.joda.time.Interval interval37 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime38 = interval37.getEnd();
        org.joda.time.Chronology chronology39 = interval37.getChronology();
        org.joda.time.Interval interval42 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime43 = interval42.getEnd();
        org.joda.time.Chronology chronology44 = interval42.getChronology();
        org.joda.time.Interval interval45 = interval37.overlap((org.joda.time.ReadableInterval) interval42);
        org.joda.time.Interval interval48 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str49 = interval48.toString();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime53 = interval52.getEnd();
        org.joda.time.Chronology chronology54 = interval52.getChronology();
        org.joda.time.Interval interval57 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime58 = interval57.getEnd();
        org.joda.time.Chronology chronology59 = interval57.getChronology();
        org.joda.time.Interval interval60 = interval52.overlap((org.joda.time.ReadableInterval) interval57);
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.YearMonthDay yearMonthDay62 = new org.joda.time.YearMonthDay(dateTimeZone61);
        org.joda.time.TimeOfDay timeOfDay63 = null;
        org.joda.time.DateTimeZone dateTimeZone64 = null;
        org.joda.time.DateTime dateTime65 = yearMonthDay62.toDateTime(timeOfDay63, dateTimeZone64);
        boolean boolean66 = dateTime65.isBeforeNow();
        org.joda.time.DateTime dateTime68 = dateTime65.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime70 = dateTime68.withMinuteOfHour((int) (short) 0);
        boolean boolean71 = interval60.contains((org.joda.time.ReadableInstant) dateTime68);
        boolean boolean72 = interval48.contains((org.joda.time.ReadableInterval) interval60);
        org.joda.time.ReadablePeriod readablePeriod73 = null;
        org.joda.time.Interval interval74 = interval48.withPeriodBeforeEnd(readablePeriod73);
        org.joda.time.PeriodType periodType75 = null;
        org.joda.time.Period period76 = interval48.toPeriod(periodType75);
        org.joda.time.Interval interval77 = interval45.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period76);
        long long80 = chronology31.add((org.joda.time.ReadablePeriod) period76, 0L, 35271);
        org.joda.time.MutablePeriod mutablePeriod81 = period76.toMutablePeriod();
        org.joda.time.LocalDate localDate82 = localDate24.minus((org.joda.time.ReadablePeriod) period76);
        int int83 = period76.size();
        org.joda.time.Interval interval84 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight0, (org.joda.time.ReadablePeriod) period76);
        org.joda.time.Interval interval86 = interval84.withStartMillis(8L);
        org.junit.Assert.assertNotNull(dateMidnight0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "-0001-02-11" + "'", str25, "-0001-02-11");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField33);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(interval45);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str49, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(chronology59);
        org.junit.Assert.assertNotNull(interval60);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + true + "'", boolean72 == true);
        org.junit.Assert.assertNotNull(interval74);
        org.junit.Assert.assertNotNull(period76);
        org.junit.Assert.assertNotNull(interval77);
        org.junit.Assert.assertTrue("'" + long80 + "' != '" + 1163943L + "'", long80 == 1163943L);
        org.junit.Assert.assertNotNull(mutablePeriod81);
        org.junit.Assert.assertNotNull(localDate82);
        org.junit.Assert.assertTrue("'" + int83 + "' != '" + 8 + "'", int83 == 8);
        org.junit.Assert.assertNotNull(interval86);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay14 = property5.withMinimumValue();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (byte) 100);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        int int40 = property5.compareTo((org.joda.time.ReadableInstant) dateTime36);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.YearMonthDay yearMonthDay42 = new org.joda.time.YearMonthDay(dateTimeZone41);
        org.joda.time.TimeOfDay timeOfDay43 = null;
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = yearMonthDay42.toDateTime(timeOfDay43, dateTimeZone44);
        org.joda.time.YearMonthDay.Property property46 = yearMonthDay42.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.YearMonthDay yearMonthDay48 = new org.joda.time.YearMonthDay(dateTimeZone47);
        org.joda.time.TimeOfDay timeOfDay49 = null;
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.DateTime dateTime51 = yearMonthDay48.toDateTime(timeOfDay49, dateTimeZone50);
        org.joda.time.YearMonthDay.Property property52 = yearMonthDay48.monthOfYear();
        org.joda.time.DateTime dateTime53 = yearMonthDay48.toDateTimeAtCurrentTime();
        int int54 = property46.compareTo((org.joda.time.ReadablePartial) yearMonthDay48);
        org.joda.time.Chronology chronology55 = yearMonthDay48.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.clockhourOfHalfday();
        org.joda.time.DurationField durationField57 = chronology55.days();
        org.joda.time.DateTime dateTime58 = dateTime36.toDateTime(chronology55);
        boolean boolean59 = dateTime58.isBeforeNow();
        int int60 = dateTime58.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 0 + "'", int54 == 0);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(durationField57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + true + "'", boolean59 == true);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2 + "'", int60 == 2);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withDayOfWeek(35273);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35273 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime11 = interval10.getEnd();
        org.joda.time.Chronology chronology12 = interval10.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime4.toDateTime(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay15.toDateTime(timeOfDay16, dateTimeZone17);
        boolean boolean19 = dateTime18.isBeforeNow();
        org.joda.time.DateTime dateTime21 = dateTime18.withMonthOfYear((int) (byte) 1);
        int int22 = dateTime18.getYear();
        org.joda.time.DateTime.Property property23 = dateTime18.weekyear();
        org.joda.time.DateTime dateTime24 = property23.withMaximumValue();
        org.joda.time.DateTime dateTime26 = dateTime24.withYear(2);
        int int27 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime26);
        int int28 = dateTime4.getSecondOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int28 + "' != '" + 35291 + "'", int28 == 35291);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.DurationField durationField8 = chronology5.millis();
        org.joda.time.DurationField durationField9 = chronology5.months();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 70, chronology5);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Chronology chronology15 = interval13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        boolean boolean21 = dateTime20.isBeforeNow();
        org.joda.time.DateTime dateTime23 = dateTime20.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime27 = interval26.getEnd();
        org.joda.time.Chronology chronology28 = interval26.getChronology();
        org.joda.time.DateTime dateTime29 = dateTime20.toDateTime(chronology28);
        boolean boolean30 = interval13.isAfter((org.joda.time.ReadableInstant) dateTime29);
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.YearMonthDay yearMonthDay33 = new org.joda.time.YearMonthDay(dateTimeZone32);
        org.joda.time.TimeOfDay timeOfDay34 = null;
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.DateTime dateTime36 = yearMonthDay33.toDateTime(timeOfDay34, dateTimeZone35);
        boolean boolean37 = dateTime36.isBeforeNow();
        org.joda.time.DateTime dateTime39 = dateTime36.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval42 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime43 = interval42.getEnd();
        org.joda.time.Chronology chronology44 = interval42.getChronology();
        org.joda.time.DateTime dateTime45 = dateTime36.toDateTime(chronology44);
        boolean boolean46 = durationFieldType31.isSupported(chronology44);
        org.joda.time.DateTime dateTime47 = dateTime29.toDateTime(chronology44);
        org.joda.time.DateTimeField dateTimeField48 = chronology44.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField49 = chronology44.era();
        org.joda.time.DateTimeField dateTimeField50 = chronology44.minuteOfDay();
        org.joda.time.LocalDate localDate51 = new org.joda.time.LocalDate(chronology44);
        int[] intArray58 = new int[] { 587, 2922789, 405, 35281, 48, (short) -1 };
        // The following exception was thrown during execution in test generation
        try {
            chronology5.validate((org.joda.time.ReadablePartial) localDate51, intArray58);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[587, 2922789, 405, 35281, 48, -1]");
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) (byte) -1, (int) (short) -1, 405, 18008, 19, 2010, 368);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 18008 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(2010, 49, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        int int3 = localTime1.getValue((int) (byte) 0);
        org.joda.time.LocalTime localTime5 = localTime1.minusSeconds((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localTime1.getValue(50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 50");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572891631,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=11,MILLISECOND=631,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusSeconds(11);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.TimeOfDay timeOfDay5 = property3.withMaximumValue();
        java.lang.String str6 = timeOfDay5.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay8 = timeOfDay5.withMinuteOfHour(75);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 75 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(timeOfDay5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "T09:48:59.650" + "'", str6, "T09:48:59.650");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        int int3 = property2.getMinimumValue();
        java.util.Locale locale5 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale6 = locale5.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = property2.setCopy("", locale6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 182);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        org.joda.time.YearMonthDay.Property property10 = yearMonthDay6.monthOfYear();
        org.joda.time.YearMonthDay yearMonthDay12 = yearMonthDay6.minusMonths((int) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        boolean boolean18 = dateTime17.isBeforeNow();
        org.joda.time.DateTime dateTime20 = dateTime17.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime22 = dateTime20.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = dateTime20.getZone();
        int int25 = dateTimeZone23.getStandardOffset((long) 13);
        org.joda.time.DateTime dateTime26 = yearMonthDay6.toDateTimeAtCurrentTime(dateTimeZone23);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = dateTimeFormatter2.withZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone28 = dateTimeFormatter27.getZone();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone30);
        org.joda.time.TimeOfDay timeOfDay32 = null;
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = yearMonthDay31.toDateTime(timeOfDay32, dateTimeZone33);
        boolean boolean35 = dateTime34.isBeforeNow();
        org.joda.time.DateTime dateTime37 = dateTime34.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime39 = dateTime37.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone40 = dateTime37.getZone();
        java.util.Calendar calendar41 = java.util.Calendar.getInstance();
        calendar41.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay45 = org.joda.time.YearMonthDay.fromCalendarFields(calendar41);
        calendar41.setFirstDayOfWeek(2022);
        int int49 = calendar41.getMinimum(2);
        java.util.TimeZone timeZone50 = calendar41.getTimeZone();
        org.joda.time.Interval interval53 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime54 = interval53.getEnd();
        org.joda.time.Chronology chronology55 = interval53.getChronology();
        org.joda.time.DateTimeField dateTimeField56 = chronology55.year();
        java.util.Locale locale57 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet58 = locale57.getUnicodeLocaleKeys();
        java.lang.String str59 = locale57.getDisplayCountry();
        int int60 = dateTimeField56.getMaximumTextLength(locale57);
        java.lang.String str61 = locale57.getDisplayScript();
        java.util.Calendar calendar62 = java.util.Calendar.getInstance(locale57);
        java.util.Calendar calendar63 = java.util.Calendar.getInstance(timeZone50, locale57);
        org.joda.time.DateTimeZone dateTimeZone64 = org.joda.time.DateTimeZone.forTimeZone(timeZone50);
        long long66 = dateTimeZone64.previousTransition((long) 8);
        long long68 = dateTimeZone40.getMillisKeepLocal(dateTimeZone64, (long) (byte) 0);
        org.joda.time.DateTime dateTime69 = new org.joda.time.DateTime((long) 35277, dateTimeZone64);
        long long71 = dateTimeZone64.convertUTCToLocal((long) 'a');
        org.joda.time.format.DateTimeFormatter dateTimeFormatter72 = dateTimeFormatter27.withZone(dateTimeZone64);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter74 = dateTimeFormatter72.withPivotYear((java.lang.Integer) 2010);
        org.joda.time.DateMidnight dateMidnight75 = org.joda.time.DateMidnight.now();
        org.joda.time.DateMidnight.Property property76 = dateMidnight75.centuryOfEra();
        org.joda.time.LocalDate localDate77 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property78 = localDate77.yearOfCentury();
        org.joda.time.LocalDate.Property property79 = localDate77.era();
        int int80 = localDate77.size();
        org.joda.time.DateTimeZone dateTimeZone81 = null;
        org.joda.time.YearMonthDay yearMonthDay82 = new org.joda.time.YearMonthDay(dateTimeZone81);
        org.joda.time.TimeOfDay timeOfDay83 = null;
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.DateTime dateTime85 = yearMonthDay82.toDateTime(timeOfDay83, dateTimeZone84);
        boolean boolean86 = dateTime85.isBeforeNow();
        org.joda.time.DateTime dateTime88 = dateTime85.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType89 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean90 = dateTime88.isSupported(dateTimeFieldType89);
        int int91 = localDate77.indexOf(dateTimeFieldType89);
        org.joda.time.DateMidnight.Property property92 = dateMidnight75.property(dateTimeFieldType89);
        org.joda.time.MutableDateTime mutableDateTime93 = dateMidnight75.toMutableDateTimeISO();
        java.util.Locale locale94 = java.util.Locale.US;
        java.util.Calendar calendar95 = mutableDateTime93.toCalendar(locale94);
        // The following exception was thrown during execution in test generation
        try {
            int int98 = dateTimeFormatter74.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime93, "12", (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(yearMonthDay12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(calendar41);
// flaky:         org.junit.Assert.assertEquals(calendar41.toString(), "java.util.GregorianCalendar[time=1657878491859,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2022,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=11,MILLISECOND=859,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay45);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(timeZone50);
// flaky:         org.junit.Assert.assertEquals(timeZone50.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertNotNull(locale57);
// flaky:         org.junit.Assert.assertEquals(locale57.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet58);
// flaky:         org.junit.Assert.assertEquals("'" + str59 + "' != '" + "\u53f0\u7063" + "'", str59, "\u53f0\u7063");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "" + "'", str61, "");
        org.junit.Assert.assertNotNull(calendar62);
// flaky:         org.junit.Assert.assertEquals(calendar62.toString(), "java.util.GregorianCalendar[time=1644572891859,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=11,MILLISECOND=859,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar63);
// flaky:         org.junit.Assert.assertEquals(calendar63.toString(), "java.util.GregorianCalendar[time=1644572891859,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=11,MILLISECOND=859,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone64);
        org.junit.Assert.assertTrue("'" + long66 + "' != '" + 8L + "'", long66 == 8L);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 0L + "'", long68 == 0L);
        org.junit.Assert.assertTrue("'" + long71 + "' != '" + 97L + "'", long71 == 97L);
        org.junit.Assert.assertNotNull(dateTimeFormatter72);
        org.junit.Assert.assertNotNull(dateTimeFormatter74);
        org.junit.Assert.assertNotNull(dateMidnight75);
        org.junit.Assert.assertNotNull(property76);
        org.junit.Assert.assertNotNull(localDate77);
        org.junit.Assert.assertNotNull(property78);
        org.junit.Assert.assertNotNull(property79);
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 3 + "'", int80 == 3);
        org.junit.Assert.assertNotNull(dateTime85);
        org.junit.Assert.assertTrue("'" + boolean86 + "' != '" + false + "'", boolean86 == false);
        org.junit.Assert.assertNotNull(dateTime88);
        org.junit.Assert.assertNotNull(dateTimeFieldType89);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 2 + "'", int91 == 2);
        org.junit.Assert.assertNotNull(property92);
        org.junit.Assert.assertNotNull(mutableDateTime93);
        org.junit.Assert.assertNotNull(locale94);
        org.junit.Assert.assertEquals(locale94.toString(), "en_US");
        org.junit.Assert.assertNotNull(calendar95);
        org.junit.Assert.assertEquals(calendar95.toString(), "java.util.GregorianCalendar[time=1644537600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.minutes();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DurationField durationField8 = chronology4.days();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay15.toDateTime(timeOfDay16, dateTimeZone17);
        boolean boolean19 = dateTime18.isBeforeNow();
        org.joda.time.DateTime dateTime21 = dateTime18.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime25 = interval24.getEnd();
        org.joda.time.Chronology chronology26 = interval24.getChronology();
        org.joda.time.DateTime dateTime27 = dateTime18.toDateTime(chronology26);
        boolean boolean28 = interval11.isAfter((org.joda.time.ReadableInstant) dateTime27);
        org.joda.time.LocalDate localDate29 = dateTime27.toLocalDate();
        org.joda.time.LocalDate localDate31 = localDate29.withYear((int) (short) -1);
        java.lang.String str32 = localDate31.toString();
        org.joda.time.Interval interval36 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime37 = interval36.getEnd();
        org.joda.time.Chronology chronology38 = interval36.getChronology();
        org.joda.time.DateTimeField dateTimeField39 = chronology38.year();
        org.joda.time.DurationField durationField40 = chronology38.minutes();
        org.joda.time.DateTime dateTime41 = new org.joda.time.DateTime((long) 16, chronology38);
        org.joda.time.Interval interval44 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime45 = interval44.getEnd();
        org.joda.time.Chronology chronology46 = interval44.getChronology();
        org.joda.time.Interval interval49 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime50 = interval49.getEnd();
        org.joda.time.Chronology chronology51 = interval49.getChronology();
        org.joda.time.Interval interval52 = interval44.overlap((org.joda.time.ReadableInterval) interval49);
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str56 = interval55.toString();
        org.joda.time.Interval interval59 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime60 = interval59.getEnd();
        org.joda.time.Chronology chronology61 = interval59.getChronology();
        org.joda.time.Interval interval64 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime65 = interval64.getEnd();
        org.joda.time.Chronology chronology66 = interval64.getChronology();
        org.joda.time.Interval interval67 = interval59.overlap((org.joda.time.ReadableInterval) interval64);
        org.joda.time.DateTimeZone dateTimeZone68 = null;
        org.joda.time.YearMonthDay yearMonthDay69 = new org.joda.time.YearMonthDay(dateTimeZone68);
        org.joda.time.TimeOfDay timeOfDay70 = null;
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.DateTime dateTime72 = yearMonthDay69.toDateTime(timeOfDay70, dateTimeZone71);
        boolean boolean73 = dateTime72.isBeforeNow();
        org.joda.time.DateTime dateTime75 = dateTime72.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime77 = dateTime75.withMinuteOfHour((int) (short) 0);
        boolean boolean78 = interval67.contains((org.joda.time.ReadableInstant) dateTime75);
        boolean boolean79 = interval55.contains((org.joda.time.ReadableInterval) interval67);
        org.joda.time.ReadablePeriod readablePeriod80 = null;
        org.joda.time.Interval interval81 = interval55.withPeriodBeforeEnd(readablePeriod80);
        org.joda.time.PeriodType periodType82 = null;
        org.joda.time.Period period83 = interval55.toPeriod(periodType82);
        org.joda.time.Interval interval84 = interval52.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period83);
        long long87 = chronology38.add((org.joda.time.ReadablePeriod) period83, 0L, 35271);
        org.joda.time.MutablePeriod mutablePeriod88 = period83.toMutablePeriod();
        org.joda.time.LocalDate localDate89 = localDate31.minus((org.joda.time.ReadablePeriod) period83);
        long long92 = chronology4.add((org.joda.time.ReadablePeriod) period83, (long) 35281, 306);
        org.joda.time.DateTimeField dateTimeField93 = chronology4.clockhourOfHalfday();
        java.lang.Class<?> wildcardClass94 = dateTimeField93.getClass();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "-0001-02-11" + "'", str32, "-0001-02-11");
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertNotNull(durationField40);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(chronology51);
        org.junit.Assert.assertNotNull(interval52);
        org.junit.Assert.assertEquals("'" + str56 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str56, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime60);
        org.junit.Assert.assertNotNull(chronology61);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(interval67);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertTrue("'" + boolean73 + "' != '" + false + "'", boolean73 == false);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertNotNull(dateTime77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + false + "'", boolean78 == false);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(interval81);
        org.junit.Assert.assertNotNull(period83);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertTrue("'" + long87 + "' != '" + 1163943L + "'", long87 == 1163943L);
        org.junit.Assert.assertNotNull(mutablePeriod88);
        org.junit.Assert.assertNotNull(localDate89);
        org.junit.Assert.assertTrue("'" + long92 + "' != '" + 45379L + "'", long92 == 45379L);
        org.junit.Assert.assertNotNull(dateTimeField93);
        org.junit.Assert.assertNotNull(wildcardClass94);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        int int12 = dateTime10.getSecondOfDay();
        org.joda.time.DateTime dateTime14 = dateTime10.plusWeeks(0);
        org.joda.time.DateTime.Property property15 = dateTime10.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) property15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35291 + "'", int12 == 35291);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime9.toDateTime(chronology17);
        boolean boolean19 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.TimeOfDay timeOfDay23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay22.toDateTime(timeOfDay23, dateTimeZone24);
        boolean boolean26 = dateTime25.isBeforeNow();
        org.joda.time.DateTime dateTime28 = dateTime25.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval31 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime32 = interval31.getEnd();
        org.joda.time.Chronology chronology33 = interval31.getChronology();
        org.joda.time.DateTime dateTime34 = dateTime25.toDateTime(chronology33);
        boolean boolean35 = durationFieldType20.isSupported(chronology33);
        org.joda.time.DateTime dateTime36 = dateTime18.toDateTime(chronology33);
        org.joda.time.ReadableDuration readableDuration37 = null;
        org.joda.time.DateTime dateTime38 = dateTime36.minus(readableDuration37);
        org.joda.time.DateTime dateTime39 = dateTime38.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime44 = dateTime38.withTime(746, 784, 387, 50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 746 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTime39);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.minusHours((int) (byte) 100);
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.lang.String str13 = locale12.getLanguage();
        java.util.Calendar calendar14 = dateTime11.toCalendar(locale12);
        java.util.Locale locale15 = java.util.Locale.CHINESE;
        java.lang.String str16 = locale12.getDisplayName(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = locale12.getUnicodeLocaleType("09:48:00.075");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 09:48:00.075");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "zh" + "'", str13, "zh");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1641531612018,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=7,DAY_OF_YEAR=7,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=5,HOUR_OF_DAY=5,MINUTE=0,SECOND=12,MILLISECOND=18,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh");
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)" + "'", str16, "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.lang.Object obj0 = null;
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.year();
        org.joda.time.DurationField durationField7 = chronology5.minutes();
        org.joda.time.DateTimeField dateTimeField8 = chronology5.clockhourOfHalfday();
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(obj0, chronology5);
        org.joda.time.DateMidnight dateMidnight10 = org.joda.time.DateMidnight.now(chronology5);
        // The following exception was thrown during execution in test generation
        try {
            long long16 = chronology5.getDateTimeMillis((-1771457900000L), 55, 48, 0, 274);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 55 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateMidnight10);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime9.toDateTime(chronology17);
        boolean boolean19 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDate localDate20 = dateTime18.toLocalDate();
        org.joda.time.LocalDate localDate22 = localDate20.withYear((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay(dateTimeZone23);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay24.toDateTime(timeOfDay25, dateTimeZone26);
        org.joda.time.YearMonthDay.Property property28 = yearMonthDay24.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay30.toDateTime(timeOfDay31, dateTimeZone32);
        org.joda.time.YearMonthDay.Property property34 = yearMonthDay30.monthOfYear();
        org.joda.time.DateTime dateTime35 = yearMonthDay30.toDateTimeAtCurrentTime();
        int int36 = property28.compareTo((org.joda.time.ReadablePartial) yearMonthDay30);
        org.joda.time.Chronology chronology37 = yearMonthDay30.getChronology();
        org.joda.time.YearMonthDay yearMonthDay39 = yearMonthDay30.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType40 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean41 = yearMonthDay30.isSupported(dateTimeFieldType40);
        boolean boolean42 = localDate20.equals((java.lang.Object) boolean41);
        java.util.Locale locale44 = java.util.Locale.US;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str45 = localDate20.toString("", locale44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 0 + "'", int36 == 0);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(yearMonthDay39);
        org.junit.Assert.assertNotNull(dateTimeFieldType40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "en_US");
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime2.withSecondOfMinute(271);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 271 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = calendar0.isSet(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1970");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878492110,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=12,MILLISECOND=110,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((java.lang.Object) "\u82f1\u6587\u7f8e\u56fd)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"?? (??)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getWeekyear();
        boolean boolean9 = dateTime4.isAfterNow();
        int int10 = dateTime4.getMillisOfSecond();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int10 + "' != '" + 203 + "'", int10 == 203);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("9", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=9");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight.Property property3 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight.Property property4 = dateMidnight1.dayOfMonth();
        org.joda.time.DateMidnight dateMidnight6 = property4.setCopy("4");
        org.joda.time.DateMidnight dateMidnight8 = property4.addToCopy((int) 'u');
        org.joda.time.DateMidnight dateMidnight10 = property4.addWrapFieldToCopy(35279414);
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime15 = interval14.getEnd();
        org.joda.time.Chronology chronology16 = interval14.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleKeys();
        java.lang.String str20 = locale18.getDisplayCountry();
        int int21 = dateTimeField17.getMaximumTextLength(locale18);
        java.lang.String str22 = locale18.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight23 = property4.setCopy("\u4e2d\u6587\u53f0\u7063)", locale18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"?? (??)\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet19);
// flaky:         org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u53f0\u7063" + "'", str20, "\u53f0\u7063");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime6 = interval5.getEnd();
        org.joda.time.Chronology chronology7 = interval5.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.year();
        org.joda.time.DurationField durationField9 = chronology7.minutes();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) 16, chronology7);
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime14 = interval13.getEnd();
        org.joda.time.Chronology chronology15 = interval13.getChronology();
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime19 = interval18.getEnd();
        org.joda.time.Chronology chronology20 = interval18.getChronology();
        org.joda.time.Interval interval21 = interval13.overlap((org.joda.time.ReadableInterval) interval18);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str25 = interval24.toString();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime29 = interval28.getEnd();
        org.joda.time.Chronology chronology30 = interval28.getChronology();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.Interval interval36 = interval28.overlap((org.joda.time.ReadableInterval) interval33);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay(dateTimeZone37);
        org.joda.time.TimeOfDay timeOfDay39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay38.toDateTime(timeOfDay39, dateTimeZone40);
        boolean boolean42 = dateTime41.isBeforeNow();
        org.joda.time.DateTime dateTime44 = dateTime41.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime46 = dateTime44.withMinuteOfHour((int) (short) 0);
        boolean boolean47 = interval36.contains((org.joda.time.ReadableInstant) dateTime44);
        boolean boolean48 = interval24.contains((org.joda.time.ReadableInterval) interval36);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.Interval interval50 = interval24.withPeriodBeforeEnd(readablePeriod49);
        org.joda.time.PeriodType periodType51 = null;
        org.joda.time.Period period52 = interval24.toPeriod(periodType51);
        org.joda.time.Interval interval53 = interval21.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period52);
        long long56 = chronology7.add((org.joda.time.ReadablePeriod) period52, 0L, 35271);
        org.joda.time.DateMidnight dateMidnight57 = dateMidnight1.plus((org.joda.time.ReadablePeriod) period52);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight1.withYearOfEra(22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight61 = dateMidnight1.withDayOfMonth((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str25, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime41);
// flaky:         org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(period52);
        org.junit.Assert.assertNotNull(interval53);
        org.junit.Assert.assertTrue("'" + long56 + "' != '" + 1163943L + "'", long56 == 1163943L);
        org.junit.Assert.assertNotNull(dateMidnight57);
        org.junit.Assert.assertNotNull(dateMidnight59);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime9.toDateTime(chronology17);
        boolean boolean19 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.TimeOfDay timeOfDay23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay22.toDateTime(timeOfDay23, dateTimeZone24);
        boolean boolean26 = dateTime25.isBeforeNow();
        org.joda.time.DateTime dateTime28 = dateTime25.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval31 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime32 = interval31.getEnd();
        org.joda.time.Chronology chronology33 = interval31.getChronology();
        org.joda.time.DateTime dateTime34 = dateTime25.toDateTime(chronology33);
        boolean boolean35 = durationFieldType20.isSupported(chronology33);
        org.joda.time.DateTime dateTime36 = dateTime18.toDateTime(chronology33);
        org.joda.time.DateTimeField dateTimeField37 = chronology33.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology33.era();
        // The following exception was thrown during execution in test generation
        try {
            long long41 = dateTimeField38.add((long) 35279, 51);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        int int4 = calendar0.getMinimalDaysInFirstWeek();
        int int5 = calendar0.getFirstDayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(dateTimeZone6);
        org.joda.time.DateMidnight.Property property8 = dateMidnight7.monthOfYear();
        org.joda.time.DateMidnight dateMidnight9 = org.joda.time.DateMidnight.now();
        long long10 = property8.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight9);
        org.joda.time.DateMidnight dateMidnight11 = property8.roundHalfEvenCopy();
        boolean boolean12 = calendar0.after((java.lang.Object) dateMidnight11);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add((int) ' ', 35271);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878492499,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=12,MILLISECOND=499,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime6 = interval5.getEnd();
        org.joda.time.Chronology chronology7 = interval5.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.minutes();
        org.joda.time.DurationField durationField9 = chronology7.weekyears();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DurationField durationField11 = chronology7.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(13, 274, (int) (byte) -1, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 274 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 182);
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        boolean boolean11 = dateTime10.isBeforeNow();
        org.joda.time.DateTime dateTime13 = dateTime10.withMonthOfYear((int) (byte) 1);
        int int14 = dateTime10.getYear();
        org.joda.time.DateTime.Property property15 = dateTime10.weekyear();
        org.joda.time.DateTime dateTime16 = property15.withMaximumValue();
        org.joda.time.DateTime dateTime18 = dateTime16.withYear(2);
        long long19 = dateTime18.getMillis();
        int int20 = dateTime18.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, (org.joda.time.ReadableInstant) dateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-62100742307336L) + "'", long19 == (-62100742307336L));
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 6 + "'", int20 == 6);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime.Property property10 = dateTime4.centuryOfEra();
        org.joda.time.DateTime dateTime11 = property10.roundCeilingCopy();
        java.util.Locale locale13 = java.util.Locale.GERMAN;
        java.lang.String str14 = locale13.getDisplayLanguage();
        java.util.Set<java.lang.Character> charSet15 = locale13.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = property10.setCopy("09:48:00.075", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:48:00.075\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "\u5fb7\u6587" + "'", str14, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(charSet15);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.monthOfYear();
        int int3 = property2.getMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = property2.setCopy(14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property3 = localDate0.weekyear();
        org.joda.time.LocalDate localDate4 = property3.withMinimumValue();
        org.joda.time.LocalDate localDate6 = localDate4.plusDays(1970);
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime11 = interval10.getEnd();
        org.joda.time.Chronology chronology12 = interval10.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.minutes();
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 35271, chronology12);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.years();
        boolean boolean16 = localDateTime14.isSupported(durationFieldType15);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minus(readableDuration17);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.minus(readablePeriod19);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = localDate6.compareTo((org.joda.time.ReadablePartial) localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("32772");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 55);
        org.joda.time.DateMidnight dateMidnight2 = localDate1.toDateMidnight();
        java.lang.String str4 = localDate1.toString("1");
        int int5 = localDate1.getYearOfCentury();
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1" + "'", str4, "1");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension('4', "1970-01-01T00:02:00.003");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.LocalDate localDate6 = localDate2.withWeekyear((int) (byte) -1);
        org.joda.time.DateTime dateTime7 = localDate2.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime9 = dateTime7.minusMonths((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTime dateTime22 = yearMonthDay17.toDateTimeAtCurrentTime();
        int int23 = property15.compareTo((org.joda.time.ReadablePartial) yearMonthDay17);
        org.joda.time.Chronology chronology24 = yearMonthDay17.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.dayOfWeek();
        int int26 = dateTime9.get(dateTimeField25);
        org.joda.time.TimeOfDay timeOfDay28 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 15);
        int int29 = timeOfDay28.getMillisOfSecond();
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay28.plusSeconds(746);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime36 = interval35.getEnd();
        org.joda.time.Chronology chronology37 = interval35.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.year();
        java.util.Locale locale39 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleKeys();
        java.lang.String str41 = locale39.getDisplayCountry();
        int int42 = dateTimeField38.getMaximumTextLength(locale39);
        java.lang.String str43 = locale39.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = dateTimeField25.getAsShortText((org.joda.time.ReadablePartial) timeOfDay31, 2922789, locale39);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2922789");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 4 + "'", int26 == 4);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 15 + "'", int29 == 15);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(locale39);
// flaky:         org.junit.Assert.assertEquals(locale39.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet40);
// flaky:         org.junit.Assert.assertEquals("'" + str41 + "' != '" + "\u53f0\u7063" + "'", str41, "\u53f0\u7063");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 9 + "'", int42 == 9);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "" + "'", str43, "");
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay4.year();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay.Property property9 = yearMonthDay4.property(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878493249,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=13,MILLISECOND=249,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = dateTimeField5.getAsShortText(3, locale7);
        int int10 = dateTimeField5.getMaximumValue();
        long long13 = dateTimeField5.addWrapField((long) (-1), (int) (byte) 0);
        org.joda.time.ReadablePartial readablePartial14 = null;
        java.util.Locale locale16 = java.util.Locale.GERMAN;
        boolean boolean17 = locale16.hasExtensions();
        java.lang.String str18 = dateTimeField5.getAsShortText(readablePartial14, 9, locale16);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone20);
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.monthOfYear();
        int int23 = localDateTime21.getSecondOfMinute();
        int int24 = localDateTime21.getDayOfWeek();
        java.util.Locale locale25 = java.util.Locale.CHINA;
        java.lang.String str26 = dateTimeField5.getAsText((org.joda.time.ReadablePartial) localDateTime21, locale25);
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(dateTimeZone27);
        org.joda.time.DateMidnight.Property property29 = dateMidnight28.monthOfYear();
        org.joda.time.DateMidnight dateMidnight31 = property29.addToCopy(0);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.withDayOfMonth(19);
        boolean boolean34 = localDateTime21.equals((java.lang.Object) 19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime36 = localDateTime21.withWeekOfWeekyear(387);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 387 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 292278993 + "'", int10 == 292278993);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-1L) + "'", long13 == (-1L));
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "de");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "9" + "'", str18, "9");
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970" + "'", str26, "1970");
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.lang.Integer int4 = dateTimeFormatter3.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter3.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.parse("ISOChronology[UTC]", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(dateTimeParser5);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime4.withDurationAdded(readableDuration9, (int) (short) 100);
        int int12 = dateTime11.getYearOfCentury();
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 22 + "'", int12 == 22);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("secondOfDay");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"secondOfDay\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        java.lang.String str11 = dateTime10.toString();
        org.joda.time.DateTime.Property property12 = dateTime10.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = property12.addToCopy(1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292278993-02-08T09:48:13.517Z" + "'", str11, "292278993-02-08T09:48:13.517Z");
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.YearMonthDay yearMonthDay5 = new org.joda.time.YearMonthDay(dateTimeZone4);
        org.joda.time.TimeOfDay timeOfDay6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = yearMonthDay5.toDateTime(timeOfDay6, dateTimeZone7);
        boolean boolean9 = dateTime8.isBeforeNow();
        org.joda.time.DateTime dateTime11 = dateTime8.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime13 = dateTime11.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = dateTime11.getZone();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance();
        calendar15.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay19 = org.joda.time.YearMonthDay.fromCalendarFields(calendar15);
        calendar15.setFirstDayOfWeek(2022);
        int int23 = calendar15.getMinimum(2);
        java.util.TimeZone timeZone24 = calendar15.getTimeZone();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime28 = interval27.getEnd();
        org.joda.time.Chronology chronology29 = interval27.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.year();
        java.util.Locale locale31 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.lang.String str33 = locale31.getDisplayCountry();
        int int34 = dateTimeField30.getMaximumTextLength(locale31);
        java.lang.String str35 = locale31.getDisplayScript();
        java.util.Calendar calendar36 = java.util.Calendar.getInstance(locale31);
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone24, locale31);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        long long40 = dateTimeZone38.previousTransition((long) 8);
        long long42 = dateTimeZone14.getMillisKeepLocal(dateTimeZone38, (long) (byte) 0);
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 368, dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((-456566), 871, 660, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 871 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1657878493785,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2022,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=13,MILLISECOND=785,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(timeZone24);
// flaky:         org.junit.Assert.assertEquals(timeZone24.getDisplayName(), "\u5354\u8abf\u4e16\u754c\u6642\u9593");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(locale31);
// flaky:         org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet32);
// flaky:         org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\u53f0\u7063" + "'", str33, "\u53f0\u7063");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(calendar36);
// flaky:         org.junit.Assert.assertEquals(calendar36.toString(), "java.util.GregorianCalendar[time=1644572893786,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=13,MILLISECOND=786,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar37);
// flaky:         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=1644572893786,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=13,MILLISECOND=786,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 8L + "'", long40 == 8L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withSecondOfMinute(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime3.withTime(49, 901, 8, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 49 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        boolean boolean5 = localTime3.equals((java.lang.Object) 16);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFields((org.joda.time.ReadablePartial) localTime3);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalTime localTime8 = localTime3.plus(readablePeriod7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localTime8.toString("Feb");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: F");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572893829,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=13,MILLISECOND=829,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        int int3 = localTime1.getValue((int) (byte) 0);
        int int4 = localTime1.getMillisOfSecond();
        org.joda.time.LocalTime.Property property5 = localTime1.millisOfDay();
        org.joda.time.DurationField durationField6 = property5.getLeapDurationField();
        org.joda.time.LocalTime localTime8 = property5.addCopy((long) (short) 10);
        org.joda.time.LocalTime localTime9 = property5.withMinimumValue();
        org.joda.time.LocalTime localTime10 = property5.getLocalTime();
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        boolean boolean18 = dateTime17.isBeforeNow();
        org.joda.time.DateTime dateTime20 = dateTime17.withMonthOfYear((int) (byte) 1);
        int int21 = dateTime17.getYear();
        org.joda.time.DateTime.Property property22 = dateTime17.weekyear();
        org.joda.time.DateTime dateTime23 = property22.withMaximumValue();
        boolean boolean24 = dateTime23.isBeforeNow();
        org.joda.time.DateTime dateTime26 = dateTime23.minusMillis(7);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateTime dateTime29 = dateTime26.withDurationAdded(readableDuration27, (int) '#');
        int int30 = dateTime26.getWeekyear();
        java.util.Locale locale31 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.util.Calendar calendar32 = dateTime26.toCalendar(locale31);
        java.util.Locale.setDefault(category12, locale31);
        java.util.Locale locale34 = java.util.Locale.GERMAN;
        java.lang.String str35 = locale34.getDisplayLanguage();
        java.lang.String str36 = locale34.getCountry();
        java.util.Locale.setDefault(category12, locale34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime38 = property5.setCopy("09:47:59.947", locale34);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:47:59.947\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572893843,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=13,MILLISECOND=843,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 9 + "'", int3 == 9);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 843 + "'", int4 == 843);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNull(durationField6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 292278993 + "'", int30 == 292278993);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=9223371988912093836,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=292278993,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=8,DAY_OF_YEAR=39,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=13,MILLISECOND=836,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\u5fb7\u6587" + "'", str35, "\u5fb7\u6587");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.setWeekDefinition(0, 387);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str3 = interval2.toString();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.Interval interval14 = interval6.overlap((org.joda.time.ReadableInterval) interval11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay16.toDateTime(timeOfDay17, dateTimeZone18);
        boolean boolean20 = dateTime19.isBeforeNow();
        org.joda.time.DateTime dateTime22 = dateTime19.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour((int) (short) 0);
        boolean boolean25 = interval14.contains((org.joda.time.ReadableInstant) dateTime22);
        boolean boolean26 = interval2.contains((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.Interval interval28 = interval2.withPeriodBeforeEnd(readablePeriod27);
        long long29 = interval28.getEndMillis();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(dateTimeZone30);
        org.joda.time.DateMidnight.Property property32 = dateMidnight31.monthOfYear();
        org.joda.time.DateMidnight dateMidnight33 = org.joda.time.DateMidnight.now();
        long long34 = property32.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateMidnight dateMidnight35 = property32.roundHalfEvenCopy();
        boolean boolean36 = interval28.isAfter((org.joda.time.ReadableInstant) dateMidnight35);
        org.joda.time.MutableInterval mutableInterval37 = interval28.toMutableInterval();
        org.joda.time.DateTime dateTime38 = mutableInterval37.getEnd();
        int int39 = dateTime38.getMillisOfSecond();
        org.joda.time.Instant instant40 = dateTime38.toInstant();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str3, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(mutableInterval37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 35 + "'", int39 == 35);
        org.junit.Assert.assertNotNull(instant40);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateMidnight dateMidnight9 = dateTime4.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime4.withField(dateTimeFieldType10, 2010);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2010 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        int int6 = calendar0.getGreatestMinimum((int) (byte) 10);
        int int7 = calendar0.getWeeksInWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar0.getGreatestMinimum(306);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 306");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878494018,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=14,MILLISECOND=18,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((int) (short) 0, 51);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = timeOfDay2.getValue(35271);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35271");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = dateTime7.getZone();
        int int12 = dateTimeZone10.getStandardOffset((long) 13);
        long long16 = dateTimeZone10.convertLocalToUTC(229L, false, (long) 49);
        int int18 = dateTimeZone10.getOffset(0L);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval20 = new org.joda.time.Interval((java.lang.Object) localDate19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 229L + "'", long16 == 229L);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        int int4 = calendar0.getMinimalDaysInFirstWeek();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        calendar5.set((int) '#', (int) 'u', 20, 15, (int) '4', 0);
        org.joda.time.Interval interval16 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime17 = interval16.getEnd();
        org.joda.time.Chronology chronology18 = interval16.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.year();
        boolean boolean20 = calendar5.after((java.lang.Object) dateTimeField19);
        int int21 = calendar5.getMinimalDaysInFirstWeek();
        int int22 = calendar0.compareTo(calendar5);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1657878494353,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=14,MILLISECOND=353,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=35,MONTH=117,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=20,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=15,MINUTE=52,SECOND=0,MILLISECOND=353,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(dateTimeZone22);
        org.joda.time.TimeOfDay timeOfDay24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = yearMonthDay23.toDateTime(timeOfDay24, dateTimeZone25);
        org.joda.time.YearMonthDay.Property property27 = yearMonthDay23.monthOfYear();
        org.joda.time.DateTime dateTime28 = yearMonthDay23.toDateTimeAtCurrentTime();
        int int29 = property21.compareTo((org.joda.time.ReadablePartial) yearMonthDay23);
        org.joda.time.Chronology chronology30 = yearMonthDay23.getChronology();
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight14.withChronology(chronology30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight33 = dateMidnight14.withMonthOfYear(271);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 271 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateMidnight31);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("09:48:00.075");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=09:48:00.075");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay(dateTimeZone6);
        org.joda.time.TimeOfDay timeOfDay8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = yearMonthDay7.toDateTime(timeOfDay8, dateTimeZone9);
        org.joda.time.YearMonthDay.Property property11 = yearMonthDay7.monthOfYear();
        org.joda.time.DateTime dateTime12 = yearMonthDay7.toDateTimeAtCurrentTime();
        int int13 = property5.compareTo((org.joda.time.ReadablePartial) yearMonthDay7);
        org.joda.time.YearMonthDay yearMonthDay14 = property5.withMinimumValue();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.Duration duration26 = interval25.toDuration();
        org.joda.time.DateTimeZone dateTimeZone27 = null;
        org.joda.time.YearMonthDay yearMonthDay28 = new org.joda.time.YearMonthDay(dateTimeZone27);
        org.joda.time.TimeOfDay timeOfDay29 = null;
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateTime dateTime31 = yearMonthDay28.toDateTime(timeOfDay29, dateTimeZone30);
        boolean boolean32 = dateTime31.isBeforeNow();
        org.joda.time.DateTime dateTime34 = dateTime31.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime36 = dateTime34.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTime dateTime38 = dateTime36.minusHours((int) (byte) 100);
        org.joda.time.Interval interval39 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration26, (org.joda.time.ReadableInstant) dateTime36);
        int int40 = property5.compareTo((org.joda.time.ReadableInstant) dateTime36);
        java.lang.String str41 = property5.getName();
        java.util.Locale locale42 = java.util.Locale.JAPAN;
        int int43 = property5.getMaximumShortTextLength(locale42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay45 = property5.setCopy(538);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 538 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(duration26);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1 + "'", int40 == 1);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "monthOfYear" + "'", str41, "monthOfYear");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2 + "'", int43 == 2);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay6 = org.joda.time.YearMonthDay.fromCalendarFields(calendar2);
        org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay6.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay6.year();
        int[] intArray10 = yearMonthDay6.getValues();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder11 = builder0.setFields(intArray10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1657878494620,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=14,MILLISECOND=620,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(intArray10);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray10), "[2022, 7, 15]");
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.Interval interval5 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime6 = interval5.getEnd();
        org.joda.time.Chronology chronology7 = interval5.getChronology();
        org.joda.time.DurationField durationField8 = chronology7.minutes();
        org.joda.time.DurationField durationField9 = chronology7.weekyears();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DurationField durationField11 = chronology7.days();
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime15 = interval14.getEnd();
        org.joda.time.Chronology chronology16 = interval14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay18.toDateTime(timeOfDay19, dateTimeZone20);
        boolean boolean22 = dateTime21.isBeforeNow();
        org.joda.time.DateTime dateTime24 = dateTime21.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime28 = interval27.getEnd();
        org.joda.time.Chronology chronology29 = interval27.getChronology();
        org.joda.time.DateTime dateTime30 = dateTime21.toDateTime(chronology29);
        boolean boolean31 = interval14.isAfter((org.joda.time.ReadableInstant) dateTime30);
        org.joda.time.LocalDate localDate32 = dateTime30.toLocalDate();
        org.joda.time.LocalDate localDate34 = localDate32.withYear((int) (short) -1);
        java.lang.String str35 = localDate34.toString();
        org.joda.time.Interval interval39 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime40 = interval39.getEnd();
        org.joda.time.Chronology chronology41 = interval39.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.year();
        org.joda.time.DurationField durationField43 = chronology41.minutes();
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) 16, chronology41);
        org.joda.time.Interval interval47 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime48 = interval47.getEnd();
        org.joda.time.Chronology chronology49 = interval47.getChronology();
        org.joda.time.Interval interval52 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime53 = interval52.getEnd();
        org.joda.time.Chronology chronology54 = interval52.getChronology();
        org.joda.time.Interval interval55 = interval47.overlap((org.joda.time.ReadableInterval) interval52);
        org.joda.time.Interval interval58 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str59 = interval58.toString();
        org.joda.time.Interval interval62 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime63 = interval62.getEnd();
        org.joda.time.Chronology chronology64 = interval62.getChronology();
        org.joda.time.Interval interval67 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime68 = interval67.getEnd();
        org.joda.time.Chronology chronology69 = interval67.getChronology();
        org.joda.time.Interval interval70 = interval62.overlap((org.joda.time.ReadableInterval) interval67);
        org.joda.time.DateTimeZone dateTimeZone71 = null;
        org.joda.time.YearMonthDay yearMonthDay72 = new org.joda.time.YearMonthDay(dateTimeZone71);
        org.joda.time.TimeOfDay timeOfDay73 = null;
        org.joda.time.DateTimeZone dateTimeZone74 = null;
        org.joda.time.DateTime dateTime75 = yearMonthDay72.toDateTime(timeOfDay73, dateTimeZone74);
        boolean boolean76 = dateTime75.isBeforeNow();
        org.joda.time.DateTime dateTime78 = dateTime75.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime80 = dateTime78.withMinuteOfHour((int) (short) 0);
        boolean boolean81 = interval70.contains((org.joda.time.ReadableInstant) dateTime78);
        boolean boolean82 = interval58.contains((org.joda.time.ReadableInterval) interval70);
        org.joda.time.ReadablePeriod readablePeriod83 = null;
        org.joda.time.Interval interval84 = interval58.withPeriodBeforeEnd(readablePeriod83);
        org.joda.time.PeriodType periodType85 = null;
        org.joda.time.Period period86 = interval58.toPeriod(periodType85);
        org.joda.time.Interval interval87 = interval55.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period86);
        long long90 = chronology41.add((org.joda.time.ReadablePeriod) period86, 0L, 35271);
        org.joda.time.MutablePeriod mutablePeriod91 = period86.toMutablePeriod();
        org.joda.time.LocalDate localDate92 = localDate34.minus((org.joda.time.ReadablePeriod) period86);
        long long95 = chronology7.add((org.joda.time.ReadablePeriod) period86, (long) 35281, 306);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay96 = new org.joda.time.YearMonthDay(182, 20, 274, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "-0001-02-11" + "'", str35, "-0001-02-11");
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(durationField43);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(chronology49);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(interval55);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str59, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(chronology64);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(interval70);
        org.junit.Assert.assertNotNull(dateTime75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(dateTime78);
        org.junit.Assert.assertNotNull(dateTime80);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + true + "'", boolean82 == true);
        org.junit.Assert.assertNotNull(interval84);
        org.junit.Assert.assertNotNull(period86);
        org.junit.Assert.assertNotNull(interval87);
        org.junit.Assert.assertTrue("'" + long90 + "' != '" + 1163943L + "'", long90 == 1163943L);
        org.junit.Assert.assertNotNull(mutablePeriod91);
        org.junit.Assert.assertNotNull(localDate92);
        org.junit.Assert.assertTrue("'" + long95 + "' != '" + 45379L + "'", long95 == 45379L);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(48, 883, 49, 274, 962, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 274 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.Interval interval2 = new org.joda.time.Interval(0L, 1L);
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.year();
        org.joda.time.DurationField durationField10 = chronology8.minutes();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((long) 16, chronology8);
        org.joda.time.Interval interval14 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime15 = interval14.getEnd();
        org.joda.time.Chronology chronology16 = interval14.getChronology();
        org.joda.time.Interval interval19 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Chronology chronology21 = interval19.getChronology();
        org.joda.time.Interval interval22 = interval14.overlap((org.joda.time.ReadableInterval) interval19);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str26 = interval25.toString();
        org.joda.time.Interval interval29 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime30 = interval29.getEnd();
        org.joda.time.Chronology chronology31 = interval29.getChronology();
        org.joda.time.Interval interval34 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime35 = interval34.getEnd();
        org.joda.time.Chronology chronology36 = interval34.getChronology();
        org.joda.time.Interval interval37 = interval29.overlap((org.joda.time.ReadableInterval) interval34);
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay(dateTimeZone38);
        org.joda.time.TimeOfDay timeOfDay40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = yearMonthDay39.toDateTime(timeOfDay40, dateTimeZone41);
        boolean boolean43 = dateTime42.isBeforeNow();
        org.joda.time.DateTime dateTime45 = dateTime42.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime47 = dateTime45.withMinuteOfHour((int) (short) 0);
        boolean boolean48 = interval37.contains((org.joda.time.ReadableInstant) dateTime45);
        boolean boolean49 = interval25.contains((org.joda.time.ReadableInterval) interval37);
        org.joda.time.ReadablePeriod readablePeriod50 = null;
        org.joda.time.Interval interval51 = interval25.withPeriodBeforeEnd(readablePeriod50);
        org.joda.time.PeriodType periodType52 = null;
        org.joda.time.Period period53 = interval25.toPeriod(periodType52);
        org.joda.time.Interval interval54 = interval22.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period53);
        long long57 = chronology8.add((org.joda.time.ReadablePeriod) period53, 0L, 35271);
        org.joda.time.MutablePeriod mutablePeriod58 = period53.toMutablePeriod();
        org.joda.time.Interval interval59 = interval2.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period53);
        boolean boolean60 = interval2.containsNow();
        org.joda.time.Period period61 = interval2.toPeriod();
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay(dateTimeZone62);
        org.joda.time.TimeOfDay timeOfDay64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = yearMonthDay63.toDateTime(timeOfDay64, dateTimeZone65);
        boolean boolean67 = dateTime66.isBeforeNow();
        org.joda.time.DateTime dateTime69 = dateTime66.withMonthOfYear((int) (byte) 1);
        int int70 = dateTime66.getYear();
        org.joda.time.DateTime.Property property71 = dateTime66.weekyear();
        org.joda.time.DateTime dateTime72 = property71.withMaximumValue();
        org.joda.time.DateTime.Property property73 = dateTime72.millisOfDay();
        int int74 = dateTime72.getSecondOfDay();
        org.joda.time.DateTime dateTime76 = dateTime72.plusWeeks(0);
        boolean boolean77 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime72);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime79 = dateTime72.plusWeeks(134);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: The calculation caused an overflow: 9223371988912094894 + 81043200000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str26, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(interval37);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + false + "'", boolean48 == false);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(interval51);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(interval54);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 1163943L + "'", long57 == 1163943L);
        org.junit.Assert.assertNotNull(mutablePeriod58);
        org.junit.Assert.assertNotNull(interval59);
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertNotNull(period61);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + false + "'", boolean67 == false);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + int70 + "' != '" + 2022 + "'", int70 == 2022);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(dateTime72);
        org.junit.Assert.assertNotNull(property73);
// flaky:         org.junit.Assert.assertTrue("'" + int74 + "' != '" + 35294 + "'", int74 == 35294);
        org.junit.Assert.assertNotNull(dateTime76);
        org.junit.Assert.assertTrue("'" + boolean77 + "' != '" + false + "'", boolean77 == false);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = calendar0.getTime();
        calendar0.setFirstDayOfWeek(32770);
        int int4 = calendar0.getFirstDayOfWeek();
        java.util.Date date5 = calendar0.getTime();
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = date5.before(date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572894928,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=32770,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=14,MILLISECOND=928,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Fri Feb 11 09:48:14 UTC 2022");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32770 + "'", int4 == 32770);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Feb 11 09:48:14 UTC 2022");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.util.Date date5 = new java.util.Date((int) '4', 15, (int) '#', (int) ' ', (int) (byte) 10);
        int int6 = date5.getMinutes();
        org.junit.Assert.assertEquals(date5.toString(), "Wed May 06 08:10:00 UTC 1953");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 10 + "'", int6 == 10);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateMidnight dateMidnight9 = dateTime4.toDateMidnight();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.YearMonthDay yearMonthDay11 = new org.joda.time.YearMonthDay(dateTimeZone10);
        org.joda.time.TimeOfDay timeOfDay12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = yearMonthDay11.toDateTime(timeOfDay12, dateTimeZone13);
        org.joda.time.YearMonthDay.Property property15 = yearMonthDay11.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.YearMonthDay yearMonthDay17 = new org.joda.time.YearMonthDay(dateTimeZone16);
        org.joda.time.TimeOfDay timeOfDay18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = yearMonthDay17.toDateTime(timeOfDay18, dateTimeZone19);
        org.joda.time.YearMonthDay.Property property21 = yearMonthDay17.monthOfYear();
        org.joda.time.DateTime dateTime22 = yearMonthDay17.toDateTimeAtCurrentTime();
        int int23 = property15.compareTo((org.joda.time.ReadablePartial) yearMonthDay17);
        org.joda.time.Chronology chronology24 = yearMonthDay17.getChronology();
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay17.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean28 = yearMonthDay17.isSupported(dateTimeFieldType27);
        org.joda.time.DurationFieldType durationFieldType29 = dateTimeFieldType27.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight31 = dateMidnight9.withField(dateTimeFieldType27, 93);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 93 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(durationFieldType29);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Locale locale4 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Locale locale6 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Locale locale8 = java.util.Locale.UK;
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getDisplayLanguage();
        java.util.Locale locale13 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        java.lang.String str15 = locale13.getDisplayCountry();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        java.lang.String str18 = locale16.getDisplayCountry();
        java.util.Locale locale20 = new java.util.Locale("");
        java.util.Locale locale21 = java.util.Locale.FRANCE;
        java.util.Locale locale22 = java.util.Locale.UK;
        java.util.Locale locale23 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale locale24 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleKeys();
        java.util.Locale locale26 = java.util.Locale.FRANCE;
        java.util.Locale[] localeArray27 = new java.util.Locale[] { locale5, locale6, locale7, locale8, locale9, locale11, locale13, locale16, locale20, locale21, locale22, locale23, locale24, locale26 };
        java.util.ArrayList<java.util.Locale> localeList28 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList28, localeArray27);
        java.util.Locale.FilteringMode filteringMode30 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.util.Locale> localeList31 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList28, filteringMode30);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList32 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "\u5fb7\u6587" + "'", str12, "\u5fb7\u6587");
        org.junit.Assert.assertNotNull(locale13);
// flaky:         org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\u53f0\u7063" + "'", str15, "\u53f0\u7063");
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\u53f0\u7063" + "'", str18, "\u53f0\u7063");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale24);
// flaky:         org.junit.Assert.assertEquals(locale24.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr_FR");
        org.junit.Assert.assertNotNull(localeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
        org.junit.Assert.assertTrue("'" + filteringMode30 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode30.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(localeList31);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addWrapFieldToCopy(3);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.secondOfMinute();
        java.lang.String str7 = property6.toString();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[secondOfMinute]" + "'", str7, "Property[secondOfMinute]");
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        int int4 = localDateTime2.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withWeekyear(11);
        int int7 = localDateTime6.getWeekOfWeekyear();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.plusSeconds(371);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfSecond();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime9.toDateTime(chronology17);
        boolean boolean19 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDate localDate20 = dateTime18.toLocalDate();
        org.joda.time.LocalDate localDate22 = localDate20.withYear((int) (short) -1);
        java.lang.String str23 = localDate22.toString();
        int int24 = localDate22.getDayOfWeek();
        org.joda.time.LocalDate.Property property25 = localDate22.dayOfWeek();
        int int26 = property25.getLeapAmount();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate28 = property25.setCopy((-52));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -52 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-0001-02-11" + "'", str23, "-0001-02-11");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.DateMidnight dateMidnight5 = localDate2.toDateMidnight();
        int int6 = dateMidnight5.getMillisOfDay();
        org.joda.time.DateMidnight.Property property7 = dateMidnight5.dayOfWeek();
        java.util.Locale locale8 = java.util.Locale.GERMAN;
        int int9 = property7.getMaximumTextLength(locale8);
        org.joda.time.DateTimeField dateTimeField10 = property7.getField();
        int int12 = dateTimeField10.get((-968634479000L));
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "de");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 6 + "'", int12 == 6);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("2022-02-25T09:48:06.134Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-25T09:48:06.134Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval15 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime16 = interval15.getEnd();
        org.joda.time.Chronology chronology17 = interval15.getChronology();
        org.joda.time.DateTime dateTime18 = dateTime9.toDateTime(chronology17);
        boolean boolean19 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.LocalDate localDate20 = dateTime18.toLocalDate();
        org.joda.time.LocalDate localDate22 = localDate20.withYear((int) (short) -1);
        java.lang.String str23 = localDate22.toString();
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime28 = interval27.getEnd();
        org.joda.time.Chronology chronology29 = interval27.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.year();
        org.joda.time.DurationField durationField31 = chronology29.minutes();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) 16, chronology29);
        org.joda.time.Interval interval35 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime36 = interval35.getEnd();
        org.joda.time.Chronology chronology37 = interval35.getChronology();
        org.joda.time.Interval interval40 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime41 = interval40.getEnd();
        org.joda.time.Chronology chronology42 = interval40.getChronology();
        org.joda.time.Interval interval43 = interval35.overlap((org.joda.time.ReadableInterval) interval40);
        org.joda.time.Interval interval46 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str47 = interval46.toString();
        org.joda.time.Interval interval50 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime51 = interval50.getEnd();
        org.joda.time.Chronology chronology52 = interval50.getChronology();
        org.joda.time.Interval interval55 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime56 = interval55.getEnd();
        org.joda.time.Chronology chronology57 = interval55.getChronology();
        org.joda.time.Interval interval58 = interval50.overlap((org.joda.time.ReadableInterval) interval55);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.YearMonthDay yearMonthDay60 = new org.joda.time.YearMonthDay(dateTimeZone59);
        org.joda.time.TimeOfDay timeOfDay61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = null;
        org.joda.time.DateTime dateTime63 = yearMonthDay60.toDateTime(timeOfDay61, dateTimeZone62);
        boolean boolean64 = dateTime63.isBeforeNow();
        org.joda.time.DateTime dateTime66 = dateTime63.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime68 = dateTime66.withMinuteOfHour((int) (short) 0);
        boolean boolean69 = interval58.contains((org.joda.time.ReadableInstant) dateTime66);
        boolean boolean70 = interval46.contains((org.joda.time.ReadableInterval) interval58);
        org.joda.time.ReadablePeriod readablePeriod71 = null;
        org.joda.time.Interval interval72 = interval46.withPeriodBeforeEnd(readablePeriod71);
        org.joda.time.PeriodType periodType73 = null;
        org.joda.time.Period period74 = interval46.toPeriod(periodType73);
        org.joda.time.Interval interval75 = interval43.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) period74);
        long long78 = chronology29.add((org.joda.time.ReadablePeriod) period74, 0L, 35271);
        org.joda.time.MutablePeriod mutablePeriod79 = period74.toMutablePeriod();
        org.joda.time.LocalDate localDate80 = localDate22.minus((org.joda.time.ReadablePeriod) period74);
        int int81 = period74.size();
        // The following exception was thrown during execution in test generation
        try {
            int int83 = period74.getValue(405);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 405");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "-0001-02-11" + "'", str23, "-0001-02-11");
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(interval43);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str47, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(interval58);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertTrue("'" + boolean64 + "' != '" + false + "'", boolean64 == false);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertTrue("'" + boolean69 + "' != '" + false + "'", boolean69 == false);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
        org.junit.Assert.assertNotNull(interval72);
        org.junit.Assert.assertNotNull(period74);
        org.junit.Assert.assertNotNull(interval75);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 1163943L + "'", long78 == 1163943L);
        org.junit.Assert.assertNotNull(mutablePeriod79);
        org.junit.Assert.assertNotNull(localDate80);
        org.junit.Assert.assertTrue("'" + int81 + "' != '" + 8 + "'", int81 == 8);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.parse("09:48:01.125", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.monthOfYear();
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay1.property(dateTimeFieldType6);
        java.lang.String str8 = property7.toString();
        org.joda.time.DateTimeField dateTimeField9 = property7.getField();
        org.joda.time.Interval interval13 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str14 = interval13.toString();
        org.joda.time.Interval interval17 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime18 = interval17.getEnd();
        org.joda.time.Chronology chronology19 = interval17.getChronology();
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.Interval interval25 = interval17.overlap((org.joda.time.ReadableInterval) interval22);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTime(timeOfDay28, dateTimeZone29);
        boolean boolean31 = dateTime30.isBeforeNow();
        org.joda.time.DateTime dateTime33 = dateTime30.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime35 = dateTime33.withMinuteOfHour((int) (short) 0);
        boolean boolean36 = interval25.contains((org.joda.time.ReadableInstant) dateTime33);
        boolean boolean37 = interval13.contains((org.joda.time.ReadableInterval) interval25);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.Interval interval39 = interval13.withPeriodBeforeEnd(readablePeriod38);
        org.joda.time.PeriodType periodType40 = null;
        org.joda.time.Period period41 = interval13.toPeriod(periodType40);
        java.util.Locale locale42 = java.util.Locale.getDefault();
        java.lang.String str43 = locale42.getLanguage();
        boolean boolean44 = interval13.equals((java.lang.Object) locale42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay45 = property7.setCopy("1970", locale42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[monthOfYear]" + "'", str8, "Property[monthOfYear]");
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str14, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(interval25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(interval39);
        org.junit.Assert.assertNotNull(period41);
        org.junit.Assert.assertNotNull(locale42);
// flaky:         org.junit.Assert.assertEquals(locale42.toString(), "zh_TW");
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "zh" + "'", str43, "zh");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        java.lang.String str11 = dateTime10.toString();
        org.joda.time.DateTime.Property property12 = dateTime10.year();
        org.joda.time.DateTime.Property property13 = dateTime10.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime10.withMonthOfYear((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "292278993-02-08T09:48:15.407Z" + "'", str11, "292278993-02-08T09:48:15.407Z");
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime5 = property3.addWrapFieldToCopy(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfWeek(883);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 883 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str3 = interval2.toString();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime12 = interval11.getEnd();
        org.joda.time.Chronology chronology13 = interval11.getChronology();
        org.joda.time.Interval interval14 = interval6.overlap((org.joda.time.ReadableInterval) interval11);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.YearMonthDay yearMonthDay16 = new org.joda.time.YearMonthDay(dateTimeZone15);
        org.joda.time.TimeOfDay timeOfDay17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = yearMonthDay16.toDateTime(timeOfDay17, dateTimeZone18);
        boolean boolean20 = dateTime19.isBeforeNow();
        org.joda.time.DateTime dateTime22 = dateTime19.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime24 = dateTime22.withMinuteOfHour((int) (short) 0);
        boolean boolean25 = interval14.contains((org.joda.time.ReadableInstant) dateTime22);
        boolean boolean26 = interval2.contains((org.joda.time.ReadableInterval) interval14);
        org.joda.time.ReadablePeriod readablePeriod27 = null;
        org.joda.time.Interval interval28 = interval2.withPeriodBeforeEnd(readablePeriod27);
        long long29 = interval28.getEndMillis();
        org.joda.time.DateTimeZone dateTimeZone30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(dateTimeZone30);
        org.joda.time.DateMidnight.Property property32 = dateMidnight31.monthOfYear();
        org.joda.time.DateMidnight dateMidnight33 = org.joda.time.DateMidnight.now();
        long long34 = property32.getDifferenceAsLong((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateMidnight dateMidnight35 = property32.roundHalfEvenCopy();
        boolean boolean36 = interval28.isAfter((org.joda.time.ReadableInstant) dateMidnight35);
        org.joda.time.MutableInterval mutableInterval37 = interval28.toMutableInterval();
        org.joda.time.DateTime dateTime38 = mutableInterval37.getEnd();
        int int39 = dateTime38.getYearOfEra();
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str3, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 35L + "'", long29 == 35L);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(mutableInterval37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 1970 + "'", int39 == 1970);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property3 = localDate0.weekyear();
        boolean boolean4 = property3.isLeap();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = new org.joda.time.YearMonthDay(461, 53, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = dateTimeField5.getAsShortText(3, locale7);
        int int12 = dateTimeField5.getDifference((long) 901, (long) 11);
        int int14 = dateTimeField5.get(0L);
        org.joda.time.Interval interval19 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime20 = interval19.getEnd();
        org.joda.time.Chronology chronology21 = interval19.getChronology();
        org.joda.time.DurationField durationField22 = chronology21.minutes();
        org.joda.time.DurationField durationField23 = chronology21.weekyears();
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(chronology21);
        org.joda.time.DateTimeField dateTimeField25 = chronology21.minuteOfDay();
        java.util.Locale locale27 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str29 = locale27.getExtension('a');
        java.lang.String str30 = dateTimeField25.getAsText(4, locale27);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = dateTimeField5.set((long) 86399, "Property[monthOfYear]", locale27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[monthOfYear]\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_CN");
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "4" + "'", str30, "4");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.year();
        org.joda.time.DateTimeField dateTimeField10 = chronology8.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay(35280, 35291, 387, 203, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35280 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) 2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withDate((-292275054), 32772, 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate0.withEra(47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        int int6 = calendar0.getGreatestMinimum((int) (byte) 10);
        calendar0.setTimeInMillis((-968634479000L));
        boolean boolean9 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=-968634479000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1939,MONTH=3,WEEK_OF_YEAR=16,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=112,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=4,AM_PM=1,HOUR=10,HOUR_OF_DAY=22,MINUTE=52,SECOND=1,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        org.joda.time.LocalDateTime localDateTime4 = property3.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDateTime4.getValue(134);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 134");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        int int8 = calendar0.getMinimum(2);
        calendar0.clear();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.roll(182, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2022,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        calendar0.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay4 = org.joda.time.YearMonthDay.fromCalendarFields(calendar0);
        calendar0.setFirstDayOfWeek(2022);
        calendar0.roll(13, 42);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = calendar0.getMinimum(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1970");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2022,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=29,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=58,MILLISECOND=163,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay4);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.Interval interval3 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime4 = interval3.getEnd();
        org.joda.time.Chronology chronology5 = interval3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        org.joda.time.DurationField durationField7 = chronology5.weekyears();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology5);
        org.joda.time.DurationField durationField9 = chronology5.centuries();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime5 = property3.addNoWrapToCopy(871);
        org.joda.time.LocalTime.Property property6 = localTime5.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = property6.setCopy("09:48:04.383");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:48:04.383\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572896312,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=16,MILLISECOND=312,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime11 = interval10.getEnd();
        org.joda.time.Chronology chronology12 = interval10.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime4.toDateTime(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay15.toDateTime(timeOfDay16, dateTimeZone17);
        boolean boolean19 = dateTime18.isBeforeNow();
        org.joda.time.DateTime dateTime21 = dateTime18.withMonthOfYear((int) (byte) 1);
        int int22 = dateTime18.getYear();
        org.joda.time.DateTime.Property property23 = dateTime18.weekyear();
        org.joda.time.DateTime dateTime24 = property23.withMaximumValue();
        org.joda.time.DateTime dateTime26 = dateTime24.withYear(2);
        int int27 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dateTime4.toString("Property[millisOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = locale6.getDisplayCountry();
        int int9 = dateTimeField5.getMaximumTextLength(locale6);
        java.lang.String str10 = locale6.getDisplayScript();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale6);
        calendar11.setMinimalDaysInFirstWeek(12);
        org.joda.time.LocalTime localTime14 = org.joda.time.LocalTime.fromCalendarFields(calendar11);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromCalendarFields(calendar15);
        calendar15.set((int) '#', (int) 'u', 20, 15, (int) '4', 0);
        org.joda.time.Interval interval26 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime27 = interval26.getEnd();
        org.joda.time.Chronology chronology28 = interval26.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = chronology28.year();
        boolean boolean30 = calendar15.after((java.lang.Object) dateTimeField29);
        int int31 = calendar15.getWeekYear();
        boolean boolean32 = calendar11.equals((java.lang.Object) calendar15);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "United Kingdom" + "'", str8, "United Kingdom");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1644572896340,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=12,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=16,MILLISECOND=340,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=-60753485279660,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=44,MONTH=9,WEEK_OF_YEAR=43,WEEK_OF_MONTH=4,DAY_OF_MONTH=20,DAY_OF_YEAR=294,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=52,SECOND=0,MILLISECOND=340,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 44 + "'", int31 == 44);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
        org.joda.time.DateMidnight.Property property2 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight.Property property3 = dateMidnight1.dayOfWeek();
        org.joda.time.DateMidnight.Property property4 = dateMidnight1.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        org.joda.time.DateMidnight dateMidnight6 = property4.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight7 = property4.roundHalfFloorCopy();
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime11 = interval10.getEnd();
        org.joda.time.Chronology chronology12 = interval10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        boolean boolean18 = dateTime17.isBeforeNow();
        org.joda.time.DateTime dateTime20 = dateTime17.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime24 = interval23.getEnd();
        org.joda.time.Chronology chronology25 = interval23.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime17.toDateTime(chronology25);
        boolean boolean27 = interval10.isAfter((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.LocalDate localDate28 = dateTime26.toLocalDate();
        org.joda.time.LocalDate localDate30 = localDate28.withYearOfCentury(20);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight7.withFields((org.joda.time.ReadablePartial) localDate28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = localDate28.withEra(10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateMidnight31);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        boolean boolean10 = dateTime9.isBeforeNow();
        org.joda.time.DateTime dateTime12 = dateTime9.withMonthOfYear((int) (byte) 1);
        int int13 = dateTime9.getYear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime9.toDateMidnight();
        org.joda.time.DateTime dateTime15 = yearMonthDay1.toDateTime((org.joda.time.ReadableInstant) dateMidnight14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType17 = yearMonthDay1.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateTime dateTime11 = dateTime4.withDurationAdded(readableDuration9, (int) (short) 100);
        org.joda.time.DateTime.Property property12 = dateTime4.weekOfWeekyear();
        long long13 = dateTime4.getMillis();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
// flaky:         org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1644572896626L + "'", long13 == 1644572896626L);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone2);
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.monthOfYear();
        int int5 = localDateTime3.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withWeekyear(11);
        int int8 = localDateTime7.getWeekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int10 = localDateTime7.get(dateTimeFieldType9);
        org.joda.time.DurationFieldType durationFieldType11 = dateTimeFieldType9.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime0.withFieldAdded(durationFieldType11, 18008);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'centuries' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 11 + "'", int10 == 11);
        org.junit.Assert.assertNotNull(durationFieldType11);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.Interval interval10 = interval2.overlap((org.joda.time.ReadableInterval) interval7);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        boolean boolean16 = dateTime15.isBeforeNow();
        org.joda.time.DateTime dateTime18 = dateTime15.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime20 = dateTime18.withMinuteOfHour((int) (short) 0);
        boolean boolean21 = interval10.contains((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.Interval interval24 = new org.joda.time.Interval((long) 2, (long) '#');
        java.lang.String str25 = interval24.toString();
        org.joda.time.Interval interval28 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime29 = interval28.getEnd();
        org.joda.time.Chronology chronology30 = interval28.getChronology();
        org.joda.time.Interval interval33 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime34 = interval33.getEnd();
        org.joda.time.Chronology chronology35 = interval33.getChronology();
        org.joda.time.Interval interval36 = interval28.overlap((org.joda.time.ReadableInterval) interval33);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.YearMonthDay yearMonthDay38 = new org.joda.time.YearMonthDay(dateTimeZone37);
        org.joda.time.TimeOfDay timeOfDay39 = null;
        org.joda.time.DateTimeZone dateTimeZone40 = null;
        org.joda.time.DateTime dateTime41 = yearMonthDay38.toDateTime(timeOfDay39, dateTimeZone40);
        boolean boolean42 = dateTime41.isBeforeNow();
        org.joda.time.DateTime dateTime44 = dateTime41.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime46 = dateTime44.withMinuteOfHour((int) (short) 0);
        boolean boolean47 = interval36.contains((org.joda.time.ReadableInstant) dateTime44);
        boolean boolean48 = interval24.contains((org.joda.time.ReadableInterval) interval36);
        org.joda.time.ReadablePeriod readablePeriod49 = null;
        org.joda.time.Interval interval50 = interval24.withPeriodBeforeEnd(readablePeriod49);
        boolean boolean51 = interval50.isBeforeNow();
        org.joda.time.Interval interval52 = interval10.overlap((org.joda.time.ReadableInterval) interval50);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z" + "'", str25, "1970-01-01T00:00:00.002Z/1970-01-01T00:00:00.035Z");
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(interval36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + true + "'", boolean51 == true);
        org.junit.Assert.assertNull(interval52);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.DateMidnight.Property property2 = dateMidnight0.property(dateTimeFieldType1);
        org.joda.time.DateMidnight dateMidnight4 = property2.setCopy("4");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight6 = property2.setCopy("09:48:08.627");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:48:08.627\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight0);
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight4);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withSecondOfMinute(12);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusHours(35273);
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property7 = localDate6.yearOfCentury();
        org.joda.time.LocalDate.Property property8 = localDate6.era();
        org.joda.time.LocalDate localDate9 = property8.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDateTime5.compareTo((org.joda.time.ReadablePartial) localDate9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("09:48:08.538");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"09:48:08.538\" is malformed at \":48:08.538\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.Interval interval9 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime10 = interval9.getEnd();
        org.joda.time.Chronology chronology11 = interval9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay(dateTimeZone12);
        org.joda.time.TimeOfDay timeOfDay14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = yearMonthDay13.toDateTime(timeOfDay14, dateTimeZone15);
        boolean boolean17 = dateTime16.isBeforeNow();
        org.joda.time.DateTime dateTime19 = dateTime16.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval22 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime23 = interval22.getEnd();
        org.joda.time.Chronology chronology24 = interval22.getChronology();
        org.joda.time.DateTime dateTime25 = dateTime16.toDateTime(chronology24);
        boolean boolean26 = interval9.isAfter((org.joda.time.ReadableInstant) dateTime25);
        org.joda.time.LocalDate localDate27 = dateTime25.toLocalDate();
        int int28 = localDate27.getEra();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.YearMonthDay yearMonthDay30 = new org.joda.time.YearMonthDay(dateTimeZone29);
        org.joda.time.TimeOfDay timeOfDay31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = yearMonthDay30.toDateTime(timeOfDay31, dateTimeZone32);
        boolean boolean34 = dateTime33.isBeforeNow();
        org.joda.time.DateTime dateTime36 = dateTime33.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime38 = dateTime36.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone39 = dateTime36.getZone();
        org.joda.time.DateTime dateTime40 = localDate27.toDateTimeAtMidnight(dateTimeZone39);
        java.lang.String str41 = dateTimeZone39.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(35289, 2922789, 461, 2022, 32, 896, 292278994, dateTimeZone39);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 1 + "'", int28 == 1);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Etc/UTC" + "'", str41, "Etc/UTC");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime dateTime12 = dateTime10.withYear(2);
        org.joda.time.LocalDate localDate13 = dateTime12.toLocalDate();
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int15 = dateTime12.get(dateTimeFieldType14);
        org.joda.time.Interval interval18 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime19 = interval18.getEnd();
        org.joda.time.Chronology chronology20 = interval18.getChronology();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.YearMonthDay yearMonthDay22 = new org.joda.time.YearMonthDay(dateTimeZone21);
        org.joda.time.TimeOfDay timeOfDay23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = yearMonthDay22.toDateTime(timeOfDay23, dateTimeZone24);
        boolean boolean26 = dateTime25.isBeforeNow();
        org.joda.time.DateTime dateTime28 = dateTime25.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval31 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime32 = interval31.getEnd();
        org.joda.time.Chronology chronology33 = interval31.getChronology();
        org.joda.time.DateTime dateTime34 = dateTime25.toDateTime(chronology33);
        boolean boolean35 = interval18.isAfter((org.joda.time.ReadableInstant) dateTime34);
        org.joda.time.LocalDate localDate36 = dateTime34.toLocalDate();
        int int37 = localDate36.getEra();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay(dateTimeZone38);
        org.joda.time.TimeOfDay timeOfDay40 = null;
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = yearMonthDay39.toDateTime(timeOfDay40, dateTimeZone41);
        boolean boolean43 = dateTime42.isBeforeNow();
        org.joda.time.DateTime dateTime45 = dateTime42.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime47 = dateTime45.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone48 = dateTime45.getZone();
        org.joda.time.DateTime dateTime49 = localDate36.toDateTimeAtMidnight(dateTimeZone48);
        org.joda.time.DateTime dateTime50 = dateTime12.withZone(dateTimeZone48);
        org.joda.time.DateMidnight dateMidnight51 = org.joda.time.DateMidnight.now(dateTimeZone48);
        long long52 = dateMidnight51.getMillis();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 8 + "'", int15 == 8);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(localDate36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1 + "'", int37 == 1);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeZone48);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateMidnight51);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 1644537600000L + "'", long52 == 1644537600000L);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long) (byte) 1);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.withSecondOfMinute(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withDayOfYear(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale6 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleKeys();
        java.lang.String str8 = locale6.getDisplayCountry();
        int int9 = dateTimeField5.getMaximumTextLength(locale6);
        java.lang.String str10 = locale6.getDisplayScript();
        java.lang.String str11 = locale6.toString();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale6);
// flaky:         org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "United Kingdom" + "'", str8, "United Kingdom");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "en_GB" + "'", str11, "en_GB");
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("days");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setRegion("Property[secondOfMinute]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Property[secondOfMinute] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long) 15);
        int int2 = timeOfDay1.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay4 = timeOfDay1.withHourOfDay(42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.Interval interval7 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime8 = interval7.getEnd();
        org.joda.time.Chronology chronology9 = interval7.getChronology();
        org.joda.time.Interval interval10 = interval2.overlap((org.joda.time.ReadableInterval) interval7);
        boolean boolean12 = interval2.isBefore((long) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
        org.joda.time.TimeOfDay timeOfDay15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = yearMonthDay14.toDateTime(timeOfDay15, dateTimeZone16);
        boolean boolean18 = dateTime17.isBeforeNow();
        org.joda.time.DateTime dateTime20 = dateTime17.withMonthOfYear((int) (byte) 1);
        int int21 = dateTime17.getYear();
        org.joda.time.DateTime.Property property22 = dateTime17.weekyear();
        org.joda.time.DateTime dateTime23 = property22.withMaximumValue();
        org.joda.time.DateTime.Property property24 = dateTime23.millisOfDay();
        int int25 = dateTime23.getSecondOfDay();
        int int26 = dateTime23.getSecondOfMinute();
        int int27 = dateTime23.getDayOfMonth();
        boolean boolean28 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime33 = dateTime23.withTime(100, 53, 35272, 371);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
// flaky:         org.junit.Assert.assertTrue("'" + int25 + "' != '" + 35296 + "'", int25 == 35296);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 16 + "'", int26 == 16);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 8 + "'", int27 == 8);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
        org.joda.time.TimeOfDay timeOfDay2 = timeOfDay0.plusSeconds(11);
        org.joda.time.TimeOfDay.Property property3 = timeOfDay2.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField4 = property3.getField();
        org.joda.time.TimeOfDay timeOfDay5 = property3.withMaximumValue();
        org.joda.time.TimeOfDay.Property property6 = timeOfDay5.secondOfMinute();
        java.util.Locale locale7 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        int int9 = property6.getMaximumTextLength(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = locale7.getUnicodeLocaleType("-0001-02-11");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: -0001-02-11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeOfDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(locale7);
// flaky:         org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property3 = localTime1.property(dateTimeFieldType2);
        org.joda.time.LocalTime localTime4 = property3.getLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType6 = localTime4.getFieldType(434);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 434");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572897132,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=17,MILLISECOND=132,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DurationField durationField5 = chronology4.minutes();
        org.joda.time.DurationField durationField6 = chronology4.weekyears();
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(chronology4);
        org.joda.time.DateTimeField dateTimeField8 = chronology4.minuteOfDay();
        org.joda.time.DurationField durationField9 = chronology4.seconds();
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology4.getDateTimeMillis(1163943L, 70, 274, 2, 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(durationField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        calendar0.set((int) '#', (int) 'u', 20, 15, (int) '4', 0);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone9);
        org.joda.time.TimeOfDay timeOfDay11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.DateTime dateTime13 = yearMonthDay10.toDateTime(timeOfDay11, dateTimeZone12);
        boolean boolean14 = dateTime13.isBeforeNow();
        org.joda.time.DateTime dateTime16 = dateTime13.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTime dateTime18 = dateTime16.withMinuteOfHour((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = dateTime16.getZone();
        java.lang.String str21 = dateTimeZone19.getNameKey((long) 35281);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((java.lang.Object) '#', dateTimeZone19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=35,MONTH=117,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=20,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=15,MINUTE=52,SECOND=0,MILLISECOND=310,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "UTC" + "'", str21, "UTC");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        org.joda.time.Interval interval10 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime11 = interval10.getEnd();
        org.joda.time.Chronology chronology12 = interval10.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime4.toDateTime(chronology12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay(dateTimeZone14);
        org.joda.time.TimeOfDay timeOfDay16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = yearMonthDay15.toDateTime(timeOfDay16, dateTimeZone17);
        boolean boolean19 = dateTime18.isBeforeNow();
        org.joda.time.DateTime dateTime21 = dateTime18.withMonthOfYear((int) (byte) 1);
        int int22 = dateTime18.getYear();
        org.joda.time.DateTime.Property property23 = dateTime18.weekyear();
        org.joda.time.DateTime dateTime24 = property23.withMaximumValue();
        org.joda.time.DateTime dateTime26 = dateTime24.withYear(2);
        int int27 = dateTime4.compareTo((org.joda.time.ReadableInstant) dateTime26);
        org.joda.time.DateTime.Property property28 = dateTime4.hourOfDay();
        boolean boolean29 = property28.isLeap();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.DateMidnight dateMidnight0 = org.joda.time.DateMidnight.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.withPeriodAdded(readablePeriod1, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withEra(99);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 99 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight0);
        org.junit.Assert.assertNotNull(dateMidnight3);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.yearOfCentury();
        org.joda.time.LocalDate.Property property2 = localDate0.era();
        org.joda.time.DateMidnight dateMidnight3 = localDate0.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withYearOfCentury((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight3);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime.Property property11 = dateTime10.millisOfDay();
        int int12 = dateTime10.getSecondOfDay();
        int int13 = dateTime10.getSecondOfMinute();
        int int14 = dateTime10.getDayOfMonth();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance();
        calendar15.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay19 = org.joda.time.YearMonthDay.fromCalendarFields(calendar15);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay19.plusYears((int) '4');
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate24 = localDate22.withYearOfCentury(10);
        org.joda.time.LocalDate.Property property25 = localDate22.weekyear();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.YearMonthDay yearMonthDay27 = new org.joda.time.YearMonthDay(dateTimeZone26);
        org.joda.time.TimeOfDay timeOfDay28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = yearMonthDay27.toDateTime(timeOfDay28, dateTimeZone29);
        org.joda.time.YearMonthDay.Property property31 = yearMonthDay27.monthOfYear();
        org.joda.time.DateTime dateTime32 = yearMonthDay27.toDateTimeAtCurrentTime();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.YearMonthDay yearMonthDay34 = new org.joda.time.YearMonthDay(dateTimeZone33);
        org.joda.time.TimeOfDay timeOfDay35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = yearMonthDay34.toDateTime(timeOfDay35, dateTimeZone36);
        boolean boolean38 = dateTime37.isBeforeNow();
        org.joda.time.DateTime dateTime40 = dateTime37.withMonthOfYear((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = org.joda.time.DateTimeFieldType.dayOfMonth();
        boolean boolean42 = dateTime40.isSupported(dateTimeFieldType41);
        org.joda.time.DurationFieldType durationFieldType43 = dateTimeFieldType41.getRangeDurationType();
        org.joda.time.DateTime.Property property44 = dateTime32.property(dateTimeFieldType41);
        org.joda.time.DurationFieldType durationFieldType45 = dateTimeFieldType41.getRangeDurationType();
        int int46 = localDate22.get(dateTimeFieldType41);
        int int47 = yearMonthDay19.get(dateTimeFieldType41);
        boolean boolean48 = dateTime10.isSupported(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 35297 + "'", int12 == 35297);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 17 + "'", int13 == 17);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 8 + "'", int14 == 8);
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1657878497594,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=17,MILLISECOND=594,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay19);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 11 + "'", int46 == 11);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 15 + "'", int47 == 15);
        org.junit.Assert.assertTrue("'" + boolean48 + "' != '" + true + "'", boolean48 == true);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromCalendarFields(calendar0);
        boolean boolean3 = localTime1.equals((java.lang.Object) 16);
        java.lang.String str4 = localTime1.toString();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromCalendarFields(calendar5);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.secondOfDay();
        org.joda.time.LocalTime.Property property8 = localTime6.property(dateTimeFieldType7);
        org.joda.time.LocalTime.Property property9 = localTime1.property(dateTimeFieldType7);
        org.joda.time.LocalTime localTime11 = property9.setCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfCentury(10);
        org.joda.time.LocalDate localDate16 = localDate14.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone17);
        org.joda.time.TimeOfDay timeOfDay19 = null;
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = yearMonthDay18.toDateTime(timeOfDay19, dateTimeZone20);
        org.joda.time.YearMonthDay.Property property22 = yearMonthDay18.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.YearMonthDay yearMonthDay24 = new org.joda.time.YearMonthDay(dateTimeZone23);
        org.joda.time.TimeOfDay timeOfDay25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = yearMonthDay24.toDateTime(timeOfDay25, dateTimeZone26);
        org.joda.time.YearMonthDay.Property property28 = yearMonthDay24.monthOfYear();
        org.joda.time.DateTime dateTime29 = yearMonthDay24.toDateTimeAtCurrentTime();
        int int30 = property22.compareTo((org.joda.time.ReadablePartial) yearMonthDay24);
        org.joda.time.Chronology chronology31 = yearMonthDay24.getChronology();
        org.joda.time.YearMonthDay yearMonthDay33 = yearMonthDay24.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean35 = yearMonthDay24.isSupported(dateTimeFieldType34);
        boolean boolean36 = localDate16.isSupported(dateTimeFieldType34);
        org.joda.time.DurationFieldType durationFieldType37 = dateTimeFieldType34.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime39 = localTime11.withField(dateTimeFieldType34, 35271);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35271 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572897624,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=17,MILLISECOND=624,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "09:48:17.624" + "'", str4, "09:48:17.624");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644572897625,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=17,MILLISECOND=625,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 0 + "'", int30 == 0);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(yearMonthDay33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(durationFieldType37);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 182);
        java.io.Writer writer5 = null;
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate8 = localDate6.withYearOfCentury(10);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(writer5, (org.joda.time.ReadablePartial) localDate8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfCentury(10);
        org.joda.time.LocalDate localDate4 = localDate2.minusWeeks((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone5);
        org.joda.time.TimeOfDay timeOfDay7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = yearMonthDay6.toDateTime(timeOfDay7, dateTimeZone8);
        org.joda.time.YearMonthDay.Property property10 = yearMonthDay6.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
        org.joda.time.TimeOfDay timeOfDay13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = yearMonthDay12.toDateTime(timeOfDay13, dateTimeZone14);
        org.joda.time.YearMonthDay.Property property16 = yearMonthDay12.monthOfYear();
        org.joda.time.DateTime dateTime17 = yearMonthDay12.toDateTimeAtCurrentTime();
        int int18 = property10.compareTo((org.joda.time.ReadablePartial) yearMonthDay12);
        org.joda.time.Chronology chronology19 = yearMonthDay12.getChronology();
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay12.withMonthOfYear(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean23 = yearMonthDay12.isSupported(dateTimeFieldType22);
        boolean boolean24 = localDate4.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDate localDate26 = localDate4.plusWeeks(2);
        // The following exception was thrown during execution in test generation
        try {
            int int28 = localDate26.getValue(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 13");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        org.joda.time.DateTime dateTime7 = dateTime4.withMonthOfYear((int) (byte) 1);
        int int8 = dateTime4.getYear();
        org.joda.time.DateTime.Property property9 = dateTime4.weekyear();
        org.joda.time.DateTime dateTime10 = property9.withMaximumValue();
        org.joda.time.DateTime dateTime11 = property9.roundHalfCeilingCopy();
        java.util.Date date12 = dateTime11.toDate();
        int int13 = date12.getDate();
        org.joda.time.YearMonthDay yearMonthDay14 = org.joda.time.YearMonthDay.fromDateFields(date12);
        org.joda.time.DateTime dateTime15 = yearMonthDay14.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime15.withDayOfYear(35291);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35291 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Mon Jan 03 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(yearMonthDay14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((-456566), 6, 883);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 883 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ISOChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
        org.joda.time.DateTime dateTime6 = yearMonthDay1.toDateTimeAtCurrentTime();
        org.joda.time.DateTime dateTime7 = yearMonthDay1.toDateTimeAtMidnight();
        org.joda.time.DateTime dateTime9 = dateTime7.minus((long) 86399);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime9.withSecondOfMinute((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.Chronology chronology2 = yearMonthDay1.getChronology();
        org.joda.time.Interval interval6 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime7 = interval6.getEnd();
        org.joda.time.Chronology chronology8 = interval6.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = chronology8.year();
        java.util.Locale locale11 = java.util.Locale.GERMAN;
        java.lang.String str12 = locale11.getVariant();
        java.lang.String str13 = dateTimeField9.getAsShortText(3, locale11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = dateTimeField9.getType();
        java.lang.String str16 = dateTimeField9.getAsText(33L);
        java.util.Locale locale18 = java.util.Locale.ITALY;
        java.lang.String str19 = dateTimeField9.getAsText((-968634479000L), locale18);
        java.lang.String str20 = yearMonthDay1.toString("\u53f0\u7063", locale18);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "de");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3" + "'", str13, "3");
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970" + "'", str16, "1970");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "it_IT");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1939" + "'", str19, "1939");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u53f0\u7063" + "'", str20, "\u53f0\u7063");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        org.joda.time.DurationField durationField6 = chronology4.minutes();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.clockhourOfHalfday();
        long long11 = chronology4.add((-968634479000L), (long) 86399, (int) '#');
        org.joda.time.DateTimeField dateTimeField12 = chronology4.monthOfYear();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) '4', dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withYear(53);
        java.util.Calendar calendar19 = java.util.Calendar.getInstance();
        calendar19.add(3, 22);
        org.joda.time.YearMonthDay yearMonthDay23 = org.joda.time.YearMonthDay.fromCalendarFields(calendar19);
        org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay23.plusYears((int) '4');
        org.joda.time.YearMonthDay.Property property26 = yearMonthDay23.year();
        int[] intArray27 = yearMonthDay23.getValues();
        java.util.Locale locale29 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = dateTimeField12.set((org.joda.time.ReadablePartial) localDate15, 708, intArray27, "zh", locale29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zh\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-968631455035L) + "'", long11 == (-968631455035L));
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1657878497776,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=6,WEEK_OF_YEAR=28,WEEK_OF_MONTH=2,DAY_OF_MONTH=15,DAY_OF_YEAR=196,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=17,MILLISECOND=776,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(yearMonthDay25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[2022, 7, 15]");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_CA");
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 2, (long) '#');
        org.joda.time.DateTime dateTime3 = interval2.getEnd();
        org.joda.time.Chronology chronology4 = interval2.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.year();
        java.util.Locale locale7 = java.util.Locale.GERMAN;
        java.lang.String str8 = locale7.getVariant();
        java.lang.String str9 = dateTimeField5.getAsShortText(3, locale7);
        long long11 = dateTimeField5.roundHalfCeiling((long) 8);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone13);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.monthOfYear();
        int int16 = dateTimeField5.getMaximumValue((org.joda.time.ReadablePartial) localDateTime14);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusMinutes(35270);
        int int19 = localDateTime18.getWeekOfWeekyear();
        int int20 = localDateTime18.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "de");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 292278993 + "'", int16 == 292278993);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 49 + "'", int19 == 49);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 19 + "'", int20 == 19);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(17, (-456566), 4, 871, 35295, 55, 588);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 871 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.util.Date date1 = calendar0.getTime();
        calendar0.setFirstDayOfWeek(32770);
        int int4 = calendar0.getFirstDayOfWeek();
        java.util.Date date5 = calendar0.getTime();
        java.lang.String str6 = date5.toString();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1644572897847,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=32770,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=17,MILLISECOND=847,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date1);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Fri Feb 11 09:48:17 UTC 2022");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 32770 + "'", int4 == 32770);
        org.junit.Assert.assertNotNull(date5);
// flaky:         org.junit.Assert.assertEquals(date5.toString(), "Fri Feb 11 09:48:17 UTC 2022");
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Fri Feb 11 09:48:17 UTC 2022" + "'", str6, "Fri Feb 11 09:48:17 UTC 2022");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
        org.joda.time.TimeOfDay timeOfDay2 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = yearMonthDay1.toDateTime(timeOfDay2, dateTimeZone3);
        boolean boolean5 = dateTime4.isBeforeNow();
        int int6 = dateTime4.getMillisOfDay();
        boolean boolean8 = dateTime4.isAfter(8L);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 35297865 + "'", int6 == 35297865);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
        int int4 = localDateTime2.getSecondOfMinute();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.minusYears(2022);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime8 = property7.withMinimumValue();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        java.lang.Object obj10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(obj10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean12 = localDateTime8.isAfter((org.joda.time.ReadablePartial) localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.parse("en-US", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.lang.Integer int4 = dateTimeFormatter3.getPivotYear();
        org.joda.time.format.DateTimeParser dateTimeParser5 = dateTimeFormatter3.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withPivotYear(44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.parse("Etc/UTC", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int4);
        org.junit.Assert.assertNull(dateTimeParser5);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }
}
