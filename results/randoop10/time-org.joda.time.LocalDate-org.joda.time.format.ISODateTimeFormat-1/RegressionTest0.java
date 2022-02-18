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
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = dateTimeFormatter0.parseLocalTime("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((int) ' ', (int) '4', 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withDate((int) ' ', (int) (byte) -1, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((java.lang.Object) (byte) 10, dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Byte");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withEra((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withPeriodAdded(readablePeriod1, (int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDateTime0.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.Chronology chronology6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(4, (int) (short) 0, 1, 4, (int) (byte) -1, 2022, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        java.util.Locale.Category category0 = null;
        java.util.Locale locale1 = java.util.Locale.ENGLISH;
        java.util.Locale locale2 = java.util.Locale.ENGLISH;
        java.lang.String str3 = locale1.getDisplayVariant(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "en");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime3.withWeekOfWeekyear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.setWeekDate((int) (short) -1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572867427,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=47,MILLISECOND=427,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime2.withMonthOfYear((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((int) (short) -1, (-1), (int) 'a', chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime3.withEra(10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = new org.joda.time.Interval((java.lang.Object) 0.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
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
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
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
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((int) (short) 10, 100, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((java.lang.Object) localDateTime0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateTime3.toString("1970-01-01T00:00", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalTime localTime2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = localDate1.toLocalDateTime(localTime2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime4.withHourOfDay(363120000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 363120000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = localDate1.withMonthOfYear((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = dateTimeFormatter0.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withOffsetParsed();
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.plusDays(1);
        org.joda.time.DateTime dateTime7 = localDateTime6.toDateTime();
        org.joda.time.DateTime dateTime8 = dateTime7.withEarlierOffsetAtOverlap();
        int int9 = dateTime7.getWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer3, (org.joda.time.ReadableInstant) dateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        java.lang.Object obj3 = calendar2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572868870,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=48,MILLISECOND=870,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj3);
// flaky:         org.junit.Assert.assertEquals(obj3.toString(), "java.util.GregorianCalendar[time=1644572868870,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=48,MILLISECOND=870,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "java.util.GregorianCalendar[time=1644572868870,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=48,MILLISECOND=870,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "java.util.GregorianCalendar[time=1644572868870,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=48,MILLISECOND=870,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        long long6 = java.util.Date.UTC((int) (short) 0, 6, 0, 363120000, 0, 35268191);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1305073831391000L + "'", long6 == 1305073831391000L);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime1.withMinuteOfHour((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = dateTimeFormatter2.parseLocalDateTime("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.addToCopy((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean6 = localDate4.isSupported(durationFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate4.withDayOfMonth(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for dayOfMonth must be in the range [1,29]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMonthOfYear((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 11, 35269732]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(chronology10);
        org.joda.time.LocalDate.Property property12 = localDate11.weekyear();
        org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property15 = localDate14.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = property9.compareTo((org.joda.time.ReadablePartial) localDate14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 11, 35269830]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        calendar2.setLenient(false);
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        calendar11.clear();
        calendar11.roll(363120000, (int) (short) 0);
        int int16 = calendar2.compareTo(calendar11);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withField(dateTimeFieldType13, 363120000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 363120000 for clockhourOfHalfday must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 11, 35270096]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("1970-01-01T00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (byte) 100, (-1), 0, 1, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.DateTime dateTime6 = localDate4.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate4.withDayOfWeek(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromCalendarFields(calendar2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.withEra((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension(' ', "+100:52");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.addToCopy((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        boolean boolean6 = localDate4.isSupported(durationFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate4.getValue((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withOffsetParsed();
        org.joda.time.ReadWritableInstant readWritableInstant3 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = dateTimeFormatter0.parseInto(readWritableInstant3, "Japanese", 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        java.util.Locale locale4 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withPeriodAdded(readablePeriod9, (int) '#');
        int[] intArray12 = localDateTime8.getValues();
        boolean boolean13 = dateTimeZone7.isLocalDateTimeGap(localDateTime8);
        int int15 = dateTimeZone7.getOffsetFromLocal((long) 4);
        java.util.Locale locale18 = new java.util.Locale("");
        java.lang.String str19 = dateTimeZone7.getName((long) 9, locale18);
        java.lang.String str20 = locale4.getDisplayLanguage(locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dateTime2.toString("hi!", locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(intArray12);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray12), "[2022, 2, 11, 35270901]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 363120000 + "'", int15 == 363120000);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "+100:52" + "'", str19, "+100:52");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Japanese" + "'", str20, "Japanese");
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(2, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("hi!");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: hi! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (short) 100, 35268191, 12, (int) (byte) 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35268191 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-02-11T09:47:50.734", (double) 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-11t09:47:50.734");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long18 = chronology12.getDateTimeMillis((long) (short) 10, (int) 'x', (int) (byte) 10, 13, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572871456,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=51,MILLISECOND=456,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withPeriodAdded(readablePeriod1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime.Property property5 = localDateTime3.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property5.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.LocalDate localDate6 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate8 = property5.addWrapFieldToCopy(15);
        int int9 = localDate8.getYearOfEra();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 100 + "'", int9 == 100);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime4 = property2.addCopy((int) (short) 100);
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.lang.String str9 = locale7.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localTime4.toString("", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2022-W06");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-w06");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime7 = dateTime4.withField(dateTimeFieldType5, 2022);
        org.joda.time.DateTime.Property property8 = dateTime4.millisOfSecond();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.util.Locale locale11 = locale10.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property8.setCopy("2022-02-11T00:00:00.000", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T00:00:00.000\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("Japanese", "09:47:51.005");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: Japanese [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(0, (-1), (int) '#', 35268191, (int) (byte) 1, 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35268191 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField5 = localDate3.getField((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) '#', 13, 32769, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant(locale1);
        java.util.Locale locale4 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getDisplayName(locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate.Property property16 = localDate15.weekyear();
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withPeriodAdded(readablePeriod19, (int) '#');
        int[] intArray22 = localDateTime18.getValues();
        java.util.Locale locale24 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = dateTimeField13.set((org.joda.time.ReadablePartial) localDate15, (int) (short) -1, intArray22, "2022", locale24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572872250,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=52,MILLISECOND=250,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(intArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[2022, 2, 11, 35272250]");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.util.Locale.Category category0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        int[] intArray8 = localDateTime4.getValues();
        boolean boolean9 = dateTimeZone3.isLocalDateTimeGap(localDateTime4);
        int int11 = dateTimeZone3.getOffsetFromLocal((long) 4);
        java.util.Locale locale14 = new java.util.Locale("");
        java.lang.String str15 = dateTimeZone3.getName((long) 9, locale14);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.setDefault(category0, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Category cannot be NULL");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[2022, 2, 11, 35272317]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 363120000 + "'", int11 == 363120000);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+100:52" + "'", str15, "+100:52");
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(2, 1, 10, 6, (int) (short) 10, 70, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateParser();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        int[] intArray8 = localDateTime4.getValues();
        boolean boolean9 = dateTimeZone3.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime.Property property10 = localDateTime4.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDateTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[2022, 2, 11, 35272493]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.months();
        org.joda.time.DurationField durationField14 = chronology12.seconds();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572872508,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=52,MILLISECOND=508,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(durationField14);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap9 = calendar2.getDisplayNames(1970, (int) (byte) 1, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.util.Locale locale7 = java.util.Locale.forLanguageTag("");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = calendar2.getDisplayName(100, (int) (short) 100, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int3 = localTime1.getValue((int) (byte) 1);
        org.joda.time.LocalTime localTime5 = localTime1.withMillisOfSecond((int) '#');
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.LocalDate.Property property8 = localDate7.weekyear();
        org.joda.time.LocalDate localDate10 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property11 = localDate10.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int13 = localDate10.get(dateTimeFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property14 = localTime1.property(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfMonth' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 47 + "'", int3 == 47);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 11 + "'", int13 == 11);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.util.Locale locale1 = new java.util.Locale("");
        java.lang.String str2 = locale1.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale1.getUnicodeLocaleType("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Etc/UTC");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.weekyear();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withChronology(chronology6);
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withPeriodAdded(readablePeriod12, (int) '#');
        int[] intArray15 = localDateTime11.getValues();
        boolean boolean16 = dateTimeZone10.isLocalDateTimeGap(localDateTime11);
        org.joda.time.LocalDateTime.Property property17 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property17.getFieldType();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight4.withField(dateTimeFieldType19, (int) (short) 10);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight4.withMillis((long) (byte) 10);
        boolean boolean25 = dateMidnight23.isEqual((long) ' ');
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(intArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2022, 2, 11, 35272867]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        java.lang.String str7 = dateTimeZone6.getID();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((int) (short) -1, (int) (byte) 100, (int) (short) 1, 2, 12, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Etc/UTC" + "'", str7, "Etc/UTC");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(32769, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        int int15 = dateTimeField13.get((long) (short) -1);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withPeriodAdded(readablePeriod17, (int) '#');
        org.joda.time.ReadableDuration readableDuration20 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime16.minus(readableDuration20);
        int int22 = localDateTime16.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.LocalDateTime localDateTime27 = localDateTime24.withPeriodAdded(readablePeriod25, (int) '#');
        int[] intArray28 = localDateTime24.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = dateTimeField13.add((org.joda.time.ReadablePartial) localDateTime16, (int) (byte) 1, intArray28, 35270798);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Fields invalid for add");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572873047,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=53,MILLISECOND=47,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
// flaky:         org.junit.Assert.assertTrue("'" + int22 + "' != '" + 35273054 + "'", int22 == 35273054);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(intArray28);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[2022, 2, 11, 35273054]");
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(12);
        org.joda.time.DateTime dateTime8 = dateTime4.withYearOfEra(6);
        org.joda.time.DateTime.Property property9 = dateTime8.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = property9.setCopy("2022");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) 100.0d, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.LocalDate localDate6 = property5.roundHalfEvenCopy();
        int int7 = property5.getMaximumValueOverall();
        java.util.Locale locale8 = null;
        int int9 = property5.getMaximumShortTextLength(locale8);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 12 + "'", int7 == 12);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime3 = property2.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = property2.setCopy("hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.addToCopy((int) (short) 10);
        org.joda.time.LocalDate localDate6 = localDate4.plusYears((int) '4');
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withPeriodAdded(readablePeriod11, (int) '#');
        int[] intArray14 = localDateTime10.getValues();
        boolean boolean15 = dateTimeZone9.isLocalDateTimeGap(localDateTime10);
        org.joda.time.LocalDateTime.Property property16 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundHalfCeilingCopy();
        int int18 = localDateTime17.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = localDate4.isBefore((org.joda.time.ReadablePartial) localDateTime17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2022, 2, 11, 35273597]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate4.toDateTimeAtStartOfDay(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate4.withDayOfMonth(32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDateTime0.getFieldType((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        int int5 = dateTime4.getMillisOfSecond();
        org.joda.time.DateTime dateTime7 = dateTime4.plusSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime4.toMutableDateTimeISO();
        int int9 = mutableDateTime8.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = mutableDateTime8.toString("1970-01-01T00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 10 + "'", int9 == 10);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
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
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime4 = property2.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType7 = localTime5.getFieldType((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 97");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromCalendarFields(calendar2);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.add(2022, 358);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime7 = dateTime4.withField(dateTimeFieldType5, 2022);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withPeriodAdded(readablePeriod9, (int) '#');
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.minuteOfHour();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        long long18 = interval17.toDurationMillis();
        org.joda.time.Period period19 = interval17.toPeriod();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime13.minus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.DateTime dateTime21 = dateTime4.minus((org.joda.time.ReadablePeriod) period19);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = period19.getValue(35270798);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35270798");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((int) (short) 0, (-1073453520), 0, (int) (short) 0, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1073453520 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644572874308,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=54,MILLISECOND=308,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.add((int) '4', 35270798);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572874375,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=54,MILLISECOND=375,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime4 = property2.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((java.lang.Object) localTime5, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusDays(1);
        org.joda.time.DateTime dateTime11 = localDateTime10.toDateTime();
        org.joda.time.DateMidnight dateMidnight12 = dateTime11.toDateMidnight();
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.weekyear();
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight12.plus((long) 'a');
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.withYear((int) (byte) 0);
        boolean boolean18 = calendar2.equals((java.lang.Object) dateMidnight15);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        int int10 = property9.getMinimumValue();
        java.lang.String str11 = property9.getAsShortText();
        org.joda.time.LocalDateTime localDateTime12 = property9.withMaximumValue();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.lang.String str17 = locale14.getDisplayVariant(locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = property9.setCopy("09:47:53.227", locale15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:47:53.227\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 11, 35274480]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "35274480" + "'", str11, "35274480");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime5 = dateTime3.withEra(0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = dateTime5.toDateTime(chronology6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime7.withMinuteOfHour(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withPeriodAdded(readablePeriod12, (int) '#');
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.minuteOfHour();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.minuteOfHour();
        boolean boolean19 = calendar10.after((java.lang.Object) localDateTime16);
        org.joda.time.Chronology chronology20 = localDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.year();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) -1, chronology20);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime(3, (int) '4', 7, (int) '4', 4, 47, 35270798, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1644572874532,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=54,MILLISECOND=532,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        int[] intArray9 = localDateTime5.getValues();
        boolean boolean10 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        int int12 = dateTimeZone4.getOffsetFromLocal((long) 4);
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = dateTimeZone4.getName((long) 9, locale15);
        java.lang.String str17 = locale1.getDisplayLanguage(locale15);
        java.util.Locale.Builder builder18 = builder0.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder0.setVariant("2022-02-11T09:47:50.734");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 2022-02-11T09:47:50.734 [at index 5]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 11, 35274618]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 363120000 + "'", int12 == 363120000);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:52" + "'", str16, "+100:52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japanese" + "'", str17, "Japanese");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        int int3 = localTime1.getValue((int) (byte) 1);
        org.joda.time.LocalTime localTime5 = localTime1.withMillisOfSecond((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType7 = localTime1.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertTrue("'" + int3 + "' != '" + 47 + "'", int3 == 47);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMaximumValue();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withPeriodAdded(readablePeriod17, (int) '#');
        int[] intArray20 = localDateTime16.getValues();
        boolean boolean21 = dateTimeZone15.isLocalDateTimeGap(localDateTime16);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(locale23);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withPeriodAdded(readablePeriod26, (int) '#');
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfDay();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.minuteOfHour();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.minuteOfHour();
        boolean boolean33 = calendar24.after((java.lang.Object) localDateTime30);
        org.joda.time.LocalDateTime localDateTime35 = localDateTime30.withYear(35268191);
        boolean boolean36 = dateTimeZone15.equals((java.lang.Object) localDateTime30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((java.lang.Object) property11, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 11, 35274736]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(intArray20);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[2022, 2, 11, 35274736]");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=1644572874736,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=54,MILLISECOND=736,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        java.lang.String str3 = localDateTime0.toString();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMonths((int) 'a');
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime0.withYearOfCentury(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-11T09:47:55.139" + "'", str3, "2022-02-11T09:47:55.139");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.util.Date date6 = new java.util.Date(0, (int) 'a', (int) (short) 1, (int) (short) 10, (int) (short) -1, (int) ' ');
        int int7 = date6.getSeconds();
        java.lang.Object obj8 = date6.clone();
        org.junit.Assert.assertEquals(date6.toString(), "Sat Feb 01 09:59:32 UTC 1908");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 32 + "'", int7 == 32);
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "Sat Feb 01 09:59:32 UTC 1908");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "Sat Feb 01 09:59:32 UTC 1908");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "Sat Feb 01 09:59:32 UTC 1908");
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
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
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = property9.getFieldType();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withPeriodAdded(readablePeriod16, (int) '#');
        int[] intArray19 = localDateTime15.getValues();
        boolean boolean20 = dateTimeZone14.isLocalDateTimeGap(localDateTime15);
        org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.now(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((java.lang.Object) property9, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 11, 35275310]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(intArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[2022, 2, 11, 35275310]");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateMidnight21);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusMinutes((int) 'a');
        org.joda.time.LocalDateTime.Property property5 = localDateTime4.year();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.minusMinutes((int) 'x');
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(0L, dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusYears((int) (short) 1);
        int int13 = localDateTime12.getEra();
        int int14 = localDateTime4.compareTo((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusDays(1);
        org.joda.time.DateTime dateTime18 = localDateTime17.toDateTime();
        org.joda.time.DateTime dateTime19 = dateTime18.withEarlierOffsetAtOverlap();
        int int20 = dateTime18.getWeekyear();
        org.joda.time.DateTime.Property property21 = dateTime18.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property23 = dateTime18.property(dateTimeFieldType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = localDateTime12.withField(dateTimeFieldType22, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertNotNull(property23);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((-1073453520), 0, 9, 0, (int) (short) 100, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTime(0, 1, 12, 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int11 = dateTime4.get(dateTimeFieldType10);
        org.joda.time.DateTime.Property property12 = dateTime4.year();
        org.joda.time.DateTime dateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.minusMonths((int) 'x');
        org.joda.time.DateTime.Property property16 = dateTime15.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTime15.toString("PT0S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getUnicodeLocaleType("2022-02-11T09:47:55.570");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 2022-02-11T09:47:55.570");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        java.lang.String str11 = property9.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 11, 35275666]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "Property[millisOfDay]" + "'", str11, "Property[millisOfDay]");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        // The following exception was thrown during execution in test generation
        try {
            long long16 = dateTimeField13.set((long) 'a', "2022-02-11T09:47:54.512");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:47:54.512\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572875835,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=55,MILLISECOND=835,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusDays(1);
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        int int8 = dateTime6.getWeekyear();
        org.joda.time.DateTime.Property property9 = dateTime6.weekOfWeekyear();
        boolean boolean10 = calendar2.after((java.lang.Object) dateTime6);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = calendar2.get((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572875866,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=55,MILLISECOND=866,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime localDateTime11 = property9.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime11.withDayOfMonth(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 11, 35275878]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(1L, dateTimeZone3);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = localTime4.getFieldType((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval7 = new org.joda.time.Interval((java.lang.Object) localTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusMillis((int) (short) 10);
        int int9 = localDateTime4.getYearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime4.getValue(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 13");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.util.Locale locale0 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: UTC");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localDateParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = dateTimeFormatter0.parseLocalDate("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.weekDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("1970-01-01T00:00", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01T00:00\" is malformed at \"-01-01T00:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        int[] intArray9 = localDateTime5.getValues();
        boolean boolean10 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        int int12 = dateTimeZone4.getOffsetFromLocal((long) 4);
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = dateTimeZone4.getName((long) 9, locale15);
        java.lang.String str17 = locale1.getDisplayLanguage(locale15);
        java.util.Locale.Builder builder18 = builder0.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder0.setLanguageTag("09:47:51.005");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 09:47:51.005 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 11, 35276183]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 363120000 + "'", int12 == 363120000);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:52" + "'", str16, "+100:52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japanese" + "'", str17, "Japanese");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(locale16);
        java.lang.String str18 = dateTimeField13.getAsShortText((long) 100, locale16);
        long long21 = dateTimeField13.add((long) 4, (long) 47);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(chronology22);
        org.joda.time.LocalDate.Property property24 = localDate23.weekyear();
        int[] intArray27 = new int[] { 9 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray29 = dateTimeField13.addWrapPartial((org.joda.time.ReadablePartial) localDate23, 1, intArray27, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572876309,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=56,MILLISECOND=309,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1644572876309,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=56,MILLISECOND=309,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 28425600004L + "'", long21 == 28425600004L);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(intArray27);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray27), "[9]");
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int5 = localDate3.get(dateTimeFieldType4);
        int int6 = localDate1.compareTo((org.joda.time.ReadablePartial) localDate3);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate1.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        int int5 = dateTime3.getWeekyear();
        org.joda.time.DateTime.Property property6 = dateTime3.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime3.withMinuteOfHour((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("09:47:53.227", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"09:47:53.227\" is malformed at \":47:53.227\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromCalendarFields(calendar2);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar2.getMinimum((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        int int12 = property11.get();
        int int13 = property11.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 11, 35276519]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 11 + "'", int12 == 11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 28 + "'", int13 == 28);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(12);
        org.joda.time.DateTime dateTime8 = dateTime4.withYearOfEra(6);
        org.joda.time.DateTime.Property property9 = dateTime8.millisOfSecond();
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        int int11 = property9.getMaximumTextLength(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = locale10.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromCalendarFields(calendar2);
        int int8 = calendar2.getWeekYear();
        long long9 = calendar2.getTimeInMillis();
        int int10 = calendar2.getWeekYear();
        java.lang.Object obj11 = calendar2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1970 + "'", int10 == 1970);
        org.junit.Assert.assertNotNull(obj11);
        org.junit.Assert.assertEquals(obj11.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj11), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj11), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) calendar2, chronology16);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = calendar2.getGreatestMinimum((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644572876837,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=56,MILLISECOND=837,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) -1, chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.centuryOfEra();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.LocalDate.Property property20 = localDate19.weekyear();
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property23 = localDate22.yearOfEra();
        int[] intArray28 = new int[] { 6, 142, 86399999 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray30 = dateTimeField17.set((org.joda.time.ReadablePartial) localDate22, 4, intArray28, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644572876882,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=56,MILLISECOND=882,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(intArray28);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray28), "[6, 142, 86399999]");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean4 = localDateTime0.isSupported(dateTimeFieldType3);
        boolean boolean6 = localDateTime0.equals((java.lang.Object) 10.0f);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime0.minusYears(32769);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, (int) '#');
        int[] intArray16 = localDateTime12.getValues();
        boolean boolean17 = dateTimeZone11.isLocalDateTimeGap(localDateTime12);
        org.joda.time.LocalDateTime.Property property18 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property18.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime0.withField(dateTimeFieldType20, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(intArray16);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[2022, 2, 11, 35276984]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.LocalDate localDate6 = property5.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property5.setCopy("35275481");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"35275481\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withYear(35268191);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDateTime8.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572877084,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=57,MILLISECOND=84,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime3.withDayOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
        java.lang.StringBuffer stringBuffer1 = null;
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale3);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.minuteOfHour();
        boolean boolean13 = calendar4.after((java.lang.Object) localDateTime10);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withYear(35268191);
        int int16 = localDateTime15.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, (org.joda.time.ReadablePartial) localDateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1644572877260,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=57,MILLISECOND=260,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        int int4 = calendar2.getActualMinimum((int) (short) 0);
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getDisplayLanguage();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = calendar2.getDisplayName(1970, 5, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572877330,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=57,MILLISECOND=330,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withPeriodAdded(readablePeriod1, (int) '#');
        int[] intArray4 = localDateTime0.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime0.withDayOfWeek(42);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[2022, 2, 11, 35277351]");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime7 = dateTime4.withField(dateTimeFieldType5, 2022);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withPeriodAdded(readablePeriod9, (int) '#');
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.minuteOfHour();
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        long long18 = interval17.toDurationMillis();
        org.joda.time.Period period19 = interval17.toPeriod();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime13.minus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.DateTime dateTime21 = dateTime4.minus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.DateTime dateTime22 = dateTime4.withLaterOffsetAtOverlap();
        org.joda.time.DateTime dateTime23 = dateTime22.toDateTime();
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.util.Locale locale26 = locale25.stripExtensions();
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(locale26);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime31 = localDateTime28.withPeriodAdded(readablePeriod29, (int) '#');
        org.joda.time.LocalDateTime.Property property32 = localDateTime31.millisOfDay();
        org.joda.time.LocalDateTime localDateTime33 = property32.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property34 = localDateTime33.minuteOfHour();
        org.joda.time.LocalDateTime.Property property35 = localDateTime33.minuteOfHour();
        boolean boolean36 = calendar27.after((java.lang.Object) localDateTime33);
        org.joda.time.Chronology chronology37 = localDateTime33.getChronology();
        org.joda.time.DateTimeField dateTimeField38 = chronology37.year();
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (short) -1, chronology37);
        org.joda.time.DateTimeField dateTimeField40 = chronology37.secondOfDay();
        org.joda.time.DateTimeField dateTimeField41 = chronology37.year();
        org.joda.time.DateTimeField dateTimeField42 = chronology37.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval43 = new org.joda.time.Interval((java.lang.Object) dateTime23, chronology37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.DateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1644572877399,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=57,MILLISECOND=399,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withPeriodAdded(readablePeriod10, (int) '#');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        boolean boolean17 = calendar8.after((java.lang.Object) localDateTime14);
        org.joda.time.Chronology chronology18 = localDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.year();
        boolean boolean20 = dateTimeFieldType5.isSupported(chronology18);
        org.joda.time.DurationField durationField21 = chronology18.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(69, 11, 7, 35270798, 47, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35270798 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1644572877446,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=57,MILLISECOND=446,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 10, chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYear(12);
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays(1);
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateMidnight dateMidnight11 = dateTime10.toDateMidnight();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DurationField durationField14 = durationFieldType12.getField(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.withFieldAdded(durationFieldType12, 35268191);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean21 = localDateTime17.isSupported(dateTimeFieldType20);
        org.joda.time.DateMidnight.Property property22 = dateMidnight16.property(dateTimeFieldType20);
        org.joda.time.DateTime.Property property23 = dateTime5.property(dateTimeFieldType20);
        org.joda.time.DateTime dateTime24 = property23.getDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = dateTime24.withMinuteOfHour(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) (short) 10, chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYear(12);
        int int8 = dateTime7.getMillisOfSecond();
        org.joda.time.DateTime dateTime10 = dateTime7.withDayOfYear(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval11 = interval2.withEnd((org.joda.time.ReadableInstant) dateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 10 + "'", int8 == 10);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTime();
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(chronology1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekyear();
        org.joda.time.LocalDate localDate5 = property3.addToCopy((int) (short) 10);
        org.joda.time.LocalDate localDate7 = localDate5.plusYears((int) '4');
        java.lang.String str8 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDate7);
        java.lang.Appendable appendable9 = null;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        java.lang.String str12 = localTime11.toString();
        org.joda.time.LocalTime.Property property13 = localTime11.millisOfDay();
        org.joda.time.LocalTime localTime15 = property13.addCopy((-1L));
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable9, (org.joda.time.ReadablePartial) localTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000" + "'", str8, "\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "09:47:57.610" + "'", str12, "09:47:57.610");
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        int int5 = dateTime3.getWeekyear();
        org.joda.time.DateTime.Property property6 = dateTime3.weekOfWeekyear();
        long long7 = property6.remainder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = property6.setCopy((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 467277672L + "'", long7 == 467277672L);
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.roll(70, 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572877757,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=57,MILLISECOND=757,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        int int5 = dateTime3.getWeekyear();
        org.joda.time.DateTime.Property property6 = dateTime3.weekOfWeekyear();
        long long7 = property6.remainder();
        java.util.Locale locale9 = java.util.Locale.SIMPLIFIED_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = property6.setCopy("", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(property6);
// flaky:         org.junit.Assert.assertTrue("'" + long7 + "' != '" + 467277784L + "'", long7 == 467277784L);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_CN");
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.timeParser();
        java.lang.StringBuffer stringBuffer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTime(0, 1, 12, 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int11 = dateTime4.get(dateTimeFieldType10);
        org.joda.time.DateTime.Property property12 = dateTime4.year();
        org.joda.time.DateTime dateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime14 = property12.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = property12.setCopy("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2084037T??????.000\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        int int5 = dateTime4.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime4.withWeekOfWeekyear((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = dateTimeFormatter0.parseMutableDateTime("0100-02-11");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"0100-02-11\" is malformed at \"00-02-11\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(12);
        org.joda.time.DateTime dateTime8 = dateTime4.withYearOfEra(6);
        org.joda.time.DateTime.Property property9 = dateTime8.millisOfSecond();
        java.util.Locale locale10 = java.util.Locale.ENGLISH;
        int int11 = property9.getMaximumTextLength(locale10);
        java.lang.String str12 = locale10.getDisplayLanguage();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromCalendarFields(calendar2);
        int int8 = calendar2.getWeekYear();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar2.getActualMaximum(35268191);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 35268191");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate localDate6 = localDate4.plusDays(1);
        java.lang.String str7 = localDate4.toString();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate localDate11 = localDate9.plusWeeks(6);
        boolean boolean12 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = localDate11.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0100-02-11" + "'", str7, "0100-02-11");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        java.util.Date date3 = dateTime2.toDate();
        int int4 = date3.getYear();
        java.lang.String str5 = date3.toString();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Thu Jan 01 00:00:00 UTC 1970" + "'", str5, "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) -1, chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.year();
        long long19 = dateTimeField17.roundFloor((long) (short) 0);
        long long21 = dateTimeField17.roundCeiling((long) 363120000);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644572878085,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=58,MILLISECOND=85,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 31536000000L + "'", long21 == 31536000000L);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.weekyear();
        org.joda.time.DateMidnight dateMidnight7 = property5.addToCopy((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight9 = property5.addToCopy(70);
        org.joda.time.DateMidnight dateMidnight10 = property5.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight12 = property5.setCopy((-1));
        int int13 = property5.getLeapAmount();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecond();
        boolean boolean2 = dateTimeFormatter1.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.parse("ko", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ko\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setUnicodeLocaleKeyword("\u97d3\u6587\u5357\u97d3)", "UTC");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: ?? (??) [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withPeriodAdded(readablePeriod12, (int) '#');
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.minuteOfHour();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.minuteOfHour();
        boolean boolean19 = calendar10.after((java.lang.Object) localDateTime16);
        org.joda.time.Chronology chronology20 = localDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.year();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((long) (short) -1, chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((int) '4', 8, 42, (int) (short) 10, (int) 'x', 32, 142, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1644572878243,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=58,MILLISECOND=243,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("+100:52", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+100:52\" is malformed at \":52\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withPeriodAdded(readablePeriod1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDateTime3.getField(42);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 42");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime2.withEra(13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.era();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) '#');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        boolean boolean14 = calendar5.after((java.lang.Object) localDateTime11);
        org.joda.time.Chronology chronology15 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) -1, chronology15);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now(chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((java.lang.Object) property1, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateMidnight$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644572878389,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=58,MILLISECOND=389,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.now(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(142, (-1), 86399999, (int) '#', (int) '#', (int) 'x', 3, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localTime8);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTimeNoMillis();
        // The following exception was thrown during execution in test generation
        try {
            long long2 = dateTimeFormatter0.parseMillis("1970-01-01T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01T00:00:00.000Z\" is malformed at \".000Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 10, chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYear(12);
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime.Property property7 = dateTime5.weekOfWeekyear();
        org.joda.time.DateTime dateTime8 = property7.roundFloorCopy();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.Locale locale10 = locale9.stripExtensions();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withPeriodAdded(readablePeriod13, (int) '#');
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.millisOfDay();
        org.joda.time.LocalDateTime localDateTime17 = property16.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.minuteOfHour();
        org.joda.time.LocalDateTime.Property property19 = localDateTime17.minuteOfHour();
        boolean boolean20 = calendar11.after((java.lang.Object) localDateTime17);
        org.joda.time.Chronology chronology21 = localDateTime17.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) property7, chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1644572878578,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=58,MILLISECOND=578,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicTTime();
        org.joda.time.format.DateTimeParser dateTimeParser2 = dateTimeFormatter1.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.parse("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2084037T??????.000\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeParser2);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(locale16);
        java.lang.String str18 = dateTimeField13.getAsShortText((long) 100, locale16);
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        int int20 = dateTimeField13.getMaximumShortTextLength(locale19);
        java.lang.String str21 = locale19.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572878763,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=58,MILLISECOND=763,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1644572878764,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=58,MILLISECOND=764,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2 + "'", int20 == 2);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "fr" + "'", str21, "fr");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecond();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronolgy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withDefaultYear(70);
        java.lang.Appendable appendable4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) 10, chronology6);
        java.util.Date date8 = dateTime7.toDate();
        org.joda.time.DateTime dateTime10 = dateTime7.withYearOfEra(1);
        org.joda.time.DateTime dateTime12 = dateTime10.withDayOfMonth(12);
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.util.Locale locale14 = locale13.stripExtensions();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale14);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDateTime localDateTime19 = localDateTime16.withPeriodAdded(readablePeriod17, (int) '#');
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.millisOfDay();
        org.joda.time.LocalDateTime localDateTime21 = property20.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.minuteOfHour();
        org.joda.time.LocalDateTime.Property property23 = localDateTime21.minuteOfHour();
        boolean boolean24 = calendar15.after((java.lang.Object) localDateTime21);
        org.joda.time.Chronology chronology25 = localDateTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.year();
        org.joda.time.DurationField durationField27 = chronology25.hours();
        org.joda.time.DateTimeField dateTimeField28 = chronology25.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime29 = dateTime12.toMutableDateTime(chronology25);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter3.printTo(appendable4, (org.joda.time.ReadableInstant) dateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644572878789,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=58,MILLISECOND=789,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(mutableDateTime29);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTime(0, 1, 12, 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int11 = dateTime4.get(dateTimeFieldType10);
        org.joda.time.DateTime.Property property12 = dateTime4.year();
        org.joda.time.DateTime dateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.minusMonths((int) 'x');
        org.joda.time.LocalDateTime localDateTime16 = dateTime15.toLocalDateTime();
        java.lang.Class<?> wildcardClass17 = localDateTime16.getClass();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 9 + "'", int11 == 9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(wildcardClass17);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("English", (double) 1644572872597L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=1.644572872597E12");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = calendar2.getMinimum(70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 70");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) -1, chronology16);
        org.joda.time.DateTimeField dateTimeField19 = chronology16.secondOfDay();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((-1073453520), 28, 0, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1073453520 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644572879264,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=59,MILLISECOND=264,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.weekDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval2 = new org.joda.time.Interval((long) 358, 0L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withPeriodAdded(readablePeriod12, (int) '#');
        int[] intArray15 = localDateTime11.getValues();
        boolean boolean16 = dateTimeZone10.isLocalDateTimeGap(localDateTime11);
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long) (byte) 10, dateTimeZone10);
        org.joda.time.DateMidnight dateMidnight18 = org.joda.time.DateMidnight.now(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(7, 35268191, 13, 42, (int) (short) 0, (int) (short) 0, 35270798, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 42 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(intArray15);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray15), "[2022, 2, 15, 52799356]");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateMidnight18);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime3 = property2.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime3.withMinuteOfHour((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecond();
        java.lang.Appendable appendable1 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.LocalTime.Property property4 = localTime3.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadablePartial) localTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        java.lang.String str3 = dateTimeFormatter1.print((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.parse("", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-05T04:52" + "'", str3, "1970-01-05T04:52");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate localDate3 = localDate1.plusWeeks(6);
        org.joda.time.LocalDate localDate5 = localDate1.withDayOfMonth(4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate5.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight((int) (byte) 10, (int) 'a', 69, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.addToCopy((int) (short) 10);
        org.joda.time.LocalDate localDate5 = property2.getLocalDate();
        org.joda.time.LocalDate.Property property6 = localDate5.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property6.setCopy(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.roll(69, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572879584,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=47,SECOND=59,MILLISECOND=584,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        int int4 = localTime3.size();
        int int5 = localTime3.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localTime3.getValue(32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32770");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 4 + "'", int4 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 52799703 + "'", int5 == 52799703);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(readableDuration2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFieldAdded(durationFieldType4, 0);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight1.withDurationAdded((long) (short) 0, 7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight11 = dateMidnight1.withDayOfYear(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight9);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.lang.Object obj4 = calendar2.clone();
        java.lang.Class<?> wildcardClass5 = calendar2.getClass();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        org.joda.time.Chronology chronology2 = dateTimeFormatter1.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.parse("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2084037T??????.000\" is malformed at \"T??????.000\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNull(chronology2);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        boolean boolean3 = interval2.containsNow();
        org.joda.time.DateTime dateTime4 = interval2.getStart();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusDays(1);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateMidnight dateMidnight9 = dateTime8.toDateMidnight();
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.weekyear();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight9.withChronology(chronology11);
        boolean boolean13 = interval2.isBefore((org.joda.time.ReadableInstant) dateMidnight12);
        org.joda.time.DateTime dateTime14 = interval2.getStart();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) 10, chronology16);
        org.joda.time.DateTime dateTime19 = dateTime17.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime22 = dateTime19.withField(dateTimeFieldType20, 2022);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withPeriodAdded(readablePeriod24, (int) '#');
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.minuteOfHour();
        java.lang.Object obj30 = null;
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.Interval interval32 = new org.joda.time.Interval(obj30, chronology31);
        long long33 = interval32.toDurationMillis();
        org.joda.time.Period period34 = interval32.toPeriod();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime28.minus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.DateTime dateTime36 = dateTime19.minus((org.joda.time.ReadablePeriod) period34);
        org.joda.time.DateTime dateTime37 = dateTime36.withLaterOffsetAtOverlap();
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withPeriodAdded(readablePeriod39, (int) '#');
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfDay();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.minuteOfHour();
        java.lang.Object obj45 = null;
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.Interval interval47 = new org.joda.time.Interval(obj45, chronology46);
        long long48 = interval47.toDurationMillis();
        org.joda.time.Period period49 = interval47.toPeriod();
        org.joda.time.LocalDateTime localDateTime50 = localDateTime43.minus((org.joda.time.ReadablePeriod) period49);
        org.joda.time.DateTime dateTime52 = dateTime36.withPeriodAdded((org.joda.time.ReadablePeriod) period49, 10);
        org.joda.time.DateTime dateTime54 = dateTime52.plusDays(2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval55 = interval2.withEnd((org.joda.time.ReadableInstant) dateTime52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(period34);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 0L + "'", long48 == 0L);
        org.junit.Assert.assertNotNull(period49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(11, 28, 35268191, (int) (short) 1, (int) '#', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        java.lang.String str3 = localDateTime0.toString();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMonths((int) 'a');
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.millisOfDay();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate.Property property10 = localDate9.weekyear();
        org.joda.time.LocalDate localDate12 = localDate9.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate localDate14 = localDate12.plusDays(1);
        java.lang.String str15 = localDate12.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDate12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-15T14:40:00.319" + "'", str3, "2022-02-15T14:40:00.319");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "0100-02-15" + "'", str15, "0100-02-15");
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        java.lang.String str2 = localTime1.toString();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime5 = property3.addCopy((-1L));
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(0L, dateTimeZone7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime8.withField(dateTimeFieldType11, (int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localTime5.compareTo((org.joda.time.ReadablePartial) localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "14:40:00.361" + "'", str2, "14:40:00.361");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime2.withMonthOfYear((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        java.lang.String str2 = localTime1.toString();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property3.roundFloorCopy();
        java.util.Locale locale6 = java.util.Locale.ENGLISH;
        java.util.Locale locale7 = java.util.Locale.ENGLISH;
        java.lang.String str8 = locale6.getDisplayVariant(locale7);
        java.util.Locale locale9 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) '#');
        int[] intArray17 = localDateTime13.getValues();
        boolean boolean18 = dateTimeZone12.isLocalDateTimeGap(localDateTime13);
        int int20 = dateTimeZone12.getOffsetFromLocal((long) 4);
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = dateTimeZone12.getName((long) 9, locale23);
        java.lang.String str25 = locale9.getDisplayLanguage(locale23);
        java.lang.String str26 = locale7.getDisplayLanguage(locale23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = property3.setCopy("2022-02-11T09:47:55.570", locale23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:47:55.570\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "14:40:00.471" + "'", str2, "14:40:00.471");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(intArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[2022, 2, 15, 52800471]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 363120000 + "'", int20 == 363120000);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+100:52" + "'", str24, "+100:52");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Japanese" + "'", str25, "Japanese");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "English" + "'", str26, "English");
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        int int5 = dateTime4.getMillisOfSecond();
        org.joda.time.DateTime dateTime7 = dateTime4.plusSeconds(0);
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime4.toMutableDateTimeISO();
        org.joda.time.DateTime.Property property9 = dateTime4.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = locale11.stripExtensions();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(locale12);
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withPeriodAdded(readablePeriod15, (int) '#');
        org.joda.time.LocalDateTime.Property property18 = localDateTime17.millisOfDay();
        org.joda.time.LocalDateTime localDateTime19 = property18.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property20 = localDateTime19.minuteOfHour();
        org.joda.time.LocalDateTime.Property property21 = localDateTime19.minuteOfHour();
        boolean boolean22 = calendar13.after((java.lang.Object) localDateTime19);
        org.joda.time.Chronology chronology23 = localDateTime19.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = chronology23.year();
        boolean boolean25 = dateTimeFieldType10.isSupported(chronology23);
        org.joda.time.DurationField durationField26 = chronology23.weekyears();
        org.joda.time.DateTime dateTime27 = dateTime4.withChronology(chronology23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime28 = new org.joda.time.LocalDateTime((java.lang.Object) chronology23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 10 + "'", int5 == 10);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1644572880526,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=0,MILLISECOND=526,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '#');
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        java.util.Set<java.lang.String> strSet7 = locale6.getUnicodeLocaleAttributes();
        java.lang.Class<?> wildcardClass8 = strSet7.getClass();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withPeriodAdded(readablePeriod10, (int) '#');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        boolean boolean17 = calendar8.after((java.lang.Object) localDateTime14);
        org.joda.time.Chronology chronology18 = localDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.year();
        boolean boolean20 = dateTimeFieldType5.isSupported(chronology18);
        org.joda.time.DurationField durationField21 = chronology18.weekyears();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(74, 32, 28, 32, 5, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1644572880667,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=0,MILLISECOND=667,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) '#');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        boolean boolean14 = calendar5.after((java.lang.Object) localDateTime11);
        org.joda.time.Chronology chronology15 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        org.joda.time.DurationField durationField17 = chronology15.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate((int) (byte) 100, (-1), 0, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644572880681,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=0,MILLISECOND=681,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfFloorCopy();
        int int11 = property9.getMaximumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = property9.setCopy("2022-02-11T09:47:54.512");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:47:54.512\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52800811]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 86399999 + "'", int11 == 86399999);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTime(0, 1, 12, 6);
        org.joda.time.DateTime.Property property10 = dateTime4.minuteOfHour();
        org.joda.time.DateTime.Property property11 = dateTime4.secondOfMinute();
        java.util.Locale.Builder builder13 = new java.util.Locale.Builder();
        java.util.Locale locale14 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime18.withPeriodAdded(readablePeriod19, (int) '#');
        int[] intArray22 = localDateTime18.getValues();
        boolean boolean23 = dateTimeZone17.isLocalDateTimeGap(localDateTime18);
        int int25 = dateTimeZone17.getOffsetFromLocal((long) 4);
        java.util.Locale locale28 = new java.util.Locale("");
        java.lang.String str29 = dateTimeZone17.getName((long) 9, locale28);
        java.lang.String str30 = locale14.getDisplayLanguage(locale28);
        java.util.Locale.Builder builder31 = builder13.setLocale(locale28);
        java.util.Locale locale32 = java.util.Locale.KOREA;
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.util.Locale locale34 = locale33.stripExtensions();
        java.lang.String str35 = locale32.getDisplayVariant(locale33);
        java.util.Locale.Builder builder36 = builder13.setLocale(locale32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = property11.setCopy("2022-02-11T09:47:50.734", locale32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:47:50.734\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(intArray22);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[2022, 2, 15, 52800912]");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 363120000 + "'", int25 == 363120000);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "+100:52" + "'", str29, "+100:52");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "Japanese" + "'", str30, "Japanese");
        org.junit.Assert.assertNotNull(builder31);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
        org.junit.Assert.assertNotNull(builder36);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale7);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withPeriodAdded(readablePeriod10, (int) '#');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.millisOfDay();
        org.joda.time.LocalDateTime localDateTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.minuteOfHour();
        org.joda.time.LocalDateTime.Property property16 = localDateTime14.minuteOfHour();
        boolean boolean17 = calendar8.after((java.lang.Object) localDateTime14);
        org.joda.time.Chronology chronology18 = localDateTime14.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = chronology18.year();
        boolean boolean20 = dateTimeFieldType5.isSupported(chronology18);
        org.joda.time.DurationField durationField21 = chronology18.weekyears();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now(chronology18);
        org.joda.time.Interval interval23 = new org.joda.time.Interval((long) (short) 10, (long) 358, chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(7, 2021, (int) (byte) 0, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2021 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1644572880961,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=0,MILLISECOND=961,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getUnicodeLocaleType("2022-02-15T14:40:00.635");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 2022-02-15T14:40:00.635");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) calendar2, chronology16);
        java.lang.String str19 = calendar2.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644572881163,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=1,MILLISECOND=163,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]" + "'", str19, "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        long long3 = interval2.toDurationMillis();
        boolean boolean4 = interval2.containsNow();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (short) 10, chronology6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYear(12);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.plus(readableDuration10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval12 = interval2.withEnd((org.joda.time.ReadableInstant) dateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        java.lang.String str2 = dateTimeFormatter0.print((long) 0);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer3, 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-05T04:52" + "'", str2, "1970-01-05T04:52");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate4.withField(dateTimeFieldType6, 363120000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 363120000 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.weekyear();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.plus((long) 'a');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withYearOfCentury(12);
        org.joda.time.Interval interval10 = dateMidnight4.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight12 = dateMidnight4.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("years", (double) 142);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=142.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        int int11 = localDateTime10.getYearOfEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withMinuteOfHour(35268191);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35268191 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52801581]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar2.getMaximum(53);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        long long16 = dateTimeField13.getDifferenceAsLong((long) (byte) 0, (long) (-1));
        java.lang.String str17 = dateTimeField13.toString();
        int int20 = dateTimeField13.getDifference(0L, (long) 70);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572881741,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=1,MILLISECOND=741,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DateTimeField[weekOfWeekyear]" + "'", str17, "DateTimeField[weekOfWeekyear]");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.timeParser();
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((java.lang.Object) dateTimeFormatter0, chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.format.DateTimeFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644572881908,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=1,MILLISECOND=908,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        calendar2.setTimeZone(timeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
// flaky:             org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '+100:52' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=+100:52,offset=363120000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+:0:52");
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight2 = org.joda.time.DateMidnight.parse("09:47:51.005", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"09:47:51.005\" is malformed at \":47:51.005\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        java.lang.String str3 = dateTimeFormatter1.print((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.parse("09:47:53.227", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"09:47:53.227\" is malformed at \":47:53.227\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "1970-01-05T04:52" + "'", str3, "1970-01-05T04:52");
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.halfdayOfDay();
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = locale18.stripExtensions();
        java.lang.String str20 = locale17.getDisplayVariant(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = dateTimeField15.getAsText((int) (byte) 100, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572882118,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=2,MILLISECOND=118,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        java.util.Date date3 = calendar2.getTime();
        boolean boolean4 = calendar2.isLenient();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572882241,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=2,MILLISECOND=241,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Fri Feb 11 09:48:02 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean4 = localDateTime0.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property5.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        java.lang.String str3 = localDateTime0.toString();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMonths((int) 'a');
        int int6 = localDateTime5.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime5.withField(dateTimeFieldType7, 358);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 358 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-15T14:40:02.385" + "'", str3, "2022-02-15T14:40:02.385");
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 74 + "'", int6 == 74);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.util.Date date0 = new java.util.Date();
        java.lang.Object obj1 = date0.clone();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Fri Feb 11 09:48:02 UTC 2022");
        org.junit.Assert.assertNotNull(obj1);
// flaky:         org.junit.Assert.assertEquals(obj1.toString(), "Fri Feb 11 09:48:02 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "Fri Feb 11 09:48:02 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "Fri Feb 11 09:48:02 UTC 2022");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.util.Locale locale11 = locale10.stripExtensions();
        java.util.Calendar calendar12 = java.util.Calendar.getInstance(locale11);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) '#');
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.millisOfDay();
        org.joda.time.LocalDateTime localDateTime18 = property17.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.minuteOfHour();
        org.joda.time.LocalDateTime.Property property20 = localDateTime18.minuteOfHour();
        boolean boolean21 = calendar12.after((java.lang.Object) localDateTime18);
        org.joda.time.Chronology chronology22 = localDateTime18.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.year();
        boolean boolean24 = dateTimeFieldType9.isSupported(chronology22);
        org.joda.time.DurationField durationField25 = chronology22.weekyears();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now(chronology22);
        org.joda.time.Interval interval27 = new org.joda.time.Interval((long) (short) 10, (long) 358, chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(70, 74, (int) 'u', 0, (int) ' ', (int) '4', (int) (byte) 10, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 74 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar12);
// flaky:         org.junit.Assert.assertEquals(calendar12.toString(), "java.util.GregorianCalendar[time=1644572882647,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=2,MILLISECOND=647,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(localDateTime26);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.dayOfWeek();
        int int4 = localDateTime2.get(dateTimeFieldType3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray8 = new org.joda.time.DateTimeFieldType[] { dateTimeFieldType3, dateTimeFieldType5, dateTimeFieldType6, dateTimeFieldType7 };
        java.util.ArrayList<org.joda.time.DateTimeFieldType> dateTimeFieldTypeList9 = new java.util.ArrayList<org.joda.time.DateTimeFieldType>();
        boolean boolean10 = java.util.Collections.addAll((java.util.Collection<org.joda.time.DateTimeFieldType>) dateTimeFieldTypeList9, dateTimeFieldTypeArray8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = org.joda.time.format.ISODateTimeFormat.forFields((java.util.Collection<org.joda.time.DateTimeFieldType>) dateTimeFieldTypeList9, true, false);
        java.lang.Appendable appendable14 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter13.printTo(appendable14, (long) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withPeriodAdded(readablePeriod1, (int) '#');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYearOfCentury(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTimeNoMillis();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("PT0S");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=pt0s");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=46.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        boolean boolean3 = interval2.containsNow();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Interval interval6 = new org.joda.time.Interval(obj4, chronology5);
        long long7 = interval6.toDurationMillis();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = interval6.toPeriod(periodType8);
        org.joda.time.Interval interval10 = interval2.overlap((org.joda.time.ReadableInterval) interval6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableInterval mutableInterval11 = interval10.toMutableInterval();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNull(interval10);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        int[] intArray9 = localDateTime5.getValues();
        boolean boolean10 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        int int12 = dateTimeZone4.getOffsetFromLocal((long) 4);
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = dateTimeZone4.getName((long) 9, locale15);
        java.lang.String str17 = locale1.getDisplayLanguage(locale15);
        java.util.Locale.Builder builder18 = builder0.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder21 = builder18.setExtension('#', "South Korea");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 15, 52802898]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 363120000 + "'", int12 == 363120000);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:52" + "'", str16, "+100:52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japanese" + "'", str17, "Japanese");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        int[] intArray11 = localDateTime7.getValues();
        boolean boolean12 = dateTimeZone6.isLocalDateTimeGap(localDateTime7);
        org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long) (byte) 10, dateTimeZone6);
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(35270798, (int) (short) 1, 0, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(intArray11);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray11), "[2022, 2, 15, 52802910]");
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateMidnight14);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        java.util.Locale locale1 = dateTimeFormatter0.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter0.withPivotYear(35268191);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = dateTimeFormatter3.parseLocalDate("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(locale1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        int[] intArray9 = localDateTime5.getValues();
        boolean boolean10 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        int int12 = dateTimeZone4.getOffsetFromLocal((long) 4);
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = dateTimeZone4.getName((long) 9, locale15);
        java.lang.String str17 = locale1.getDisplayLanguage(locale15);
        java.util.Locale.Builder builder18 = builder0.setLocale(locale15);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale19.getDisplayVariant(locale20);
        java.util.Locale.Builder builder23 = builder0.setLocale(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder23.setLanguageTag("2022-02-15T14:40:00.635");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 2022 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 15, 52803074]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 363120000 + "'", int12 == 363120000);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:52" + "'", str16, "+100:52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japanese" + "'", str17, "Japanese");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfCeilingCopy();
        java.lang.String str13 = localDateTime12.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType15 = localDateTime12.getFieldType((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52803092]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "2022-02-16T00:00:00.000" + "'", str13, "2022-02-16T00:00:00.000");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.util.Locale locale1 = new java.util.Locale("2022-02-15T14:40:01.707");
        org.junit.Assert.assertEquals(locale1.toString(), "2022-02-15t14:40:01.707");
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("2022-02-15T14:40:01.488");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis(52798648);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(3, 1, 20, 35270798, (-292275054), (int) (short) -1, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35270798 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withPeriodAdded(readablePeriod11, (int) '#');
        int[] intArray14 = localDateTime10.getValues();
        boolean boolean15 = dateTimeZone9.isLocalDateTimeGap(localDateTime10);
        org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long) (byte) 10, dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((int) (short) -1, (int) (byte) 1, 0, 9, (int) 'x', 35270798, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[2022, 2, 15, 52803257]");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusMillis((int) (short) 10);
        int int9 = localDateTime4.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime4.minus(readableDuration10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime4.withDayOfWeek(46);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) -1, chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.year();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.halfdayOfDay();
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.util.Locale locale22 = locale21.stripExtensions();
        java.lang.String str23 = locale20.getDisplayVariant(locale21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = dateTimeField18.getAsText((int) (short) 10, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644572883469,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=3,MILLISECOND=469,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
        java.io.Writer writer1 = null;
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusDays(1);
        org.joda.time.DateTime dateTime5 = localDateTime4.toDateTime();
        org.joda.time.DateMidnight dateMidnight6 = dateTime5.toDateMidnight();
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.weekyear();
        org.joda.time.DateMidnight dateMidnight9 = property7.addToCopy((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight11 = property7.addToCopy(70);
        org.joda.time.DateMidnight dateMidnight12 = property7.roundFloorCopy();
        org.joda.time.DateMidnight dateMidnight14 = property7.setCopy((-1));
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadableInstant) dateMidnight14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight14);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = dateTime1.withMinuteOfHour((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) -1, chronology13);
        org.joda.time.DateTimeField dateTimeField16 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.year();
        org.joda.time.DateTimeField dateTimeField18 = chronology13.halfdayOfDay();
        boolean boolean20 = dateTimeField18.isLeap(10L);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(chronology21);
        java.lang.String str23 = localTime22.toString();
        org.joda.time.LocalTime.Property property24 = localTime22.millisOfDay();
        org.joda.time.LocalTime localTime26 = property24.addWrapFieldToCopy(35268191);
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.util.Locale locale29 = locale28.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) localTime26, 5, locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644572883771,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=3,MILLISECOND=771,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str23 + "' != '" + "14:40:03.771" + "'", str23, "14:40:03.771");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        long long6 = java.util.Date.UTC(1970, 7, 11, (int) '4', (int) (byte) 0, (int) (short) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 59977598401000L + "'", long6 == 59977598401000L);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTime(0, 1, 12, 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int11 = dateTime4.get(dateTimeFieldType10);
        org.joda.time.DateTime.Property property12 = dateTime4.year();
        org.joda.time.DateTime dateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.minusMonths((int) 'x');
        org.joda.time.LocalDateTime localDateTime16 = dateTime15.toLocalDateTime();
        org.joda.time.DateTime dateTime18 = dateTime15.withYear(20);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.DateTime.Property property20 = dateTime15.property(dateTimeFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = property20.setCopy("0012-01-05T04:52:00.010+100:52/0012-01-05T04:52:00.010+100:52");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0012-01-05T04:52:00.010+100:52/0012-01-05T04:52:00.010+100:52\" for weekyearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime4 = property2.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime5 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis((int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.yearOfCentury();
        boolean boolean9 = localTime5.isSupported(dateTimeFieldType8);
        org.joda.time.LocalTime localTime11 = localTime5.plusMinutes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = localTime5.withMillisOfDay((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        java.lang.String str3 = localDateTime0.toString();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMonths((int) 'a');
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime0.withMinuteOfHour(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-15T14:40:03.839" + "'", str3, "2022-02-15T14:40:03.839");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DurationField durationField14 = chronology12.hours();
        org.joda.time.DurationField durationField15 = chronology12.eras();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology12.getDateTimeMillis(0L, 69, 11, 11, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572883868,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=3,MILLISECOND=868,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(readableDuration2);
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        long long20 = dateTimeField17.getDifferenceAsLong((long) (byte) 0, (long) (-1));
        java.lang.String str21 = dateTimeField17.toString();
        boolean boolean22 = dateTimeField17.isSupported();
        int int23 = dateMidnight3.get(dateTimeField17);
        int int24 = dateMidnight3.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644572883901,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=3,MILLISECOND=901,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateTimeField[weekOfWeekyear]" + "'", str21, "DateTimeField[weekOfWeekyear]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
// flaky:         org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusDays(1);
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        int int8 = dateTime6.getWeekyear();
        org.joda.time.DateTime.Property property9 = dateTime6.weekOfWeekyear();
        boolean boolean10 = calendar2.after((java.lang.Object) dateTime6);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.set((-1), 52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572883920,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=3,MILLISECOND=920,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2022 + "'", int8 == 2022);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("+100:52");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        long long3 = interval2.toDurationMillis();
        org.joda.time.Period period4 = interval2.toPeriod();
        java.lang.String str5 = period4.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = period4.getValue(8);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 8");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(period4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "PT0S" + "'", str5, "PT0S");
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        int int4 = calendar2.getActualMinimum((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.roll((int) 'u', true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572884006,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=4,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        calendar6.clear();
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withPeriodAdded(readablePeriod12, (int) '#');
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.minuteOfHour();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.minuteOfHour();
        boolean boolean19 = calendar10.after((java.lang.Object) localDateTime16);
        org.joda.time.Chronology chronology20 = localDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.year();
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) calendar6, chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((int) (short) 0, 2, (int) (short) 100, 32770, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
        org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1644572884025,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=4,MILLISECOND=25,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(86399999, (int) 'x', 363120000, 900, 12, 32770, (int) (byte) 100, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 900 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(35268191, 69, (-292275054), 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35268191 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfYear(35270798);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35270798 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52804493]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(12);
        org.joda.time.DateTime dateTime8 = dateTime4.minusMonths(358);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime11 = dateTime8.withFieldAdded(durationFieldType9, 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime8.withMinuteOfHour((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime localTime3 = localTime1.withMillisOfDay(3);
        org.joda.time.LocalTime localTime5 = localTime1.withMinuteOfHour(15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = localTime5.withMillisOfSecond((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("14:40:01.081", (double) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=12.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        long long16 = dateTimeField13.getDifferenceAsLong((long) (byte) 0, (long) (-1));
        java.lang.String str17 = dateTimeField13.toString();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(chronology18);
        org.joda.time.LocalDate.Property property20 = localDate19.weekyear();
        org.joda.time.LocalDate localDate22 = property20.addToCopy((int) (short) 10);
        org.joda.time.LocalDate localDate23 = property20.roundHalfCeilingCopy();
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration27 = null;
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.plus(readableDuration27);
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.util.Locale locale30 = locale29.stripExtensions();
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(locale30);
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withPeriodAdded(readablePeriod33, (int) '#');
        org.joda.time.LocalDateTime.Property property36 = localDateTime35.millisOfDay();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.minuteOfHour();
        org.joda.time.LocalDateTime.Property property39 = localDateTime37.minuteOfHour();
        boolean boolean40 = calendar31.after((java.lang.Object) localDateTime37);
        org.joda.time.Chronology chronology41 = localDateTime37.getChronology();
        org.joda.time.DateTimeField dateTimeField42 = chronology41.weekOfWeekyear();
        long long45 = dateTimeField42.getDifferenceAsLong((long) (byte) 0, (long) (-1));
        java.lang.String str46 = dateTimeField42.toString();
        boolean boolean47 = dateTimeField42.isSupported();
        int int48 = dateMidnight28.get(dateTimeField42);
        java.lang.String str49 = dateTimeField42.toString();
        org.joda.time.ReadablePartial readablePartial50 = null;
        java.util.Locale locale51 = java.util.Locale.KOREA;
        java.util.Locale locale52 = locale51.stripExtensions();
        java.util.Calendar calendar53 = java.util.Calendar.getInstance(locale52);
        org.joda.time.LocalDateTime localDateTime54 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.LocalDateTime localDateTime57 = localDateTime54.withPeriodAdded(readablePeriod55, (int) '#');
        org.joda.time.LocalDateTime.Property property58 = localDateTime57.millisOfDay();
        org.joda.time.LocalDateTime localDateTime59 = property58.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property60 = localDateTime59.minuteOfHour();
        org.joda.time.LocalDateTime.Property property61 = localDateTime59.minuteOfHour();
        boolean boolean62 = calendar53.after((java.lang.Object) localDateTime59);
        org.joda.time.Chronology chronology63 = localDateTime59.getChronology();
        org.joda.time.DateTimeField dateTimeField64 = chronology63.year();
        java.util.Locale locale65 = java.util.Locale.KOREA;
        java.util.Locale locale66 = locale65.stripExtensions();
        int int67 = dateTimeField64.getMaximumTextLength(locale65);
        long long70 = dateTimeField64.set((long) (short) 10, 35268191);
        org.joda.time.DateTimeZone dateTimeZone72 = null;
        org.joda.time.LocalDateTime localDateTime73 = new org.joda.time.LocalDateTime(0L, dateTimeZone72);
        org.joda.time.LocalDateTime localDateTime75 = localDateTime73.minusYears((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime76 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod77 = null;
        org.joda.time.LocalDateTime localDateTime79 = localDateTime76.withPeriodAdded(readablePeriod77, (int) '#');
        org.joda.time.LocalDateTime.Property property80 = localDateTime79.millisOfDay();
        org.joda.time.LocalDateTime localDateTime81 = property80.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property82 = localDateTime81.minuteOfHour();
        org.joda.time.LocalDateTime.Property property83 = localDateTime81.minuteOfHour();
        boolean boolean84 = localDateTime75.isAfter((org.joda.time.ReadablePartial) localDateTime81);
        int[] intArray89 = new int[] { 142, (short) 1, 28, 2022 };
        int int90 = dateTimeField64.getMinimumValue((org.joda.time.ReadablePartial) localDateTime81, intArray89);
        int int91 = dateTimeField42.getMinimumValue(readablePartial50, intArray89);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray93 = dateTimeField13.add((org.joda.time.ReadablePartial) localDate23, 74, intArray89, 363120000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 74");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572884760,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=4,MILLISECOND=760,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DateTimeField[weekOfWeekyear]" + "'", str17, "DateTimeField[weekOfWeekyear]");
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar31);
// flaky:         org.junit.Assert.assertEquals(calendar31.toString(), "java.util.GregorianCalendar[time=1644572884760,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=4,MILLISECOND=760,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 0L + "'", long45 == 0L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "DateTimeField[weekOfWeekyear]" + "'", str46, "DateTimeField[weekOfWeekyear]");
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + true + "'", boolean47 == true);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1 + "'", int48 == 1);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "DateTimeField[weekOfWeekyear]" + "'", str49, "DateTimeField[weekOfWeekyear]");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar53);
// flaky:         org.junit.Assert.assertEquals(calendar53.toString(), "java.util.GregorianCalendar[time=1644572884761,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=4,MILLISECOND=761,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(localDateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertTrue("'" + boolean62 + "' != '" + false + "'", boolean62 == false);
        org.junit.Assert.assertNotNull(chronology63);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertNotNull(locale65);
        org.junit.Assert.assertEquals(locale65.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 9 + "'", int67 == 9);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 1112894443353600010L + "'", long70 == 1112894443353600010L);
        org.junit.Assert.assertNotNull(localDateTime75);
        org.junit.Assert.assertNotNull(localDateTime76);
        org.junit.Assert.assertNotNull(localDateTime79);
        org.junit.Assert.assertNotNull(property80);
        org.junit.Assert.assertNotNull(localDateTime81);
        org.junit.Assert.assertNotNull(property82);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertTrue("'" + boolean84 + "' != '" + false + "'", boolean84 == false);
        org.junit.Assert.assertNotNull(intArray89);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray89), "[142, 1, 28, 2022]");
        org.junit.Assert.assertTrue("'" + int90 + "' != '" + (-292275054) + "'", int90 == (-292275054));
        org.junit.Assert.assertTrue("'" + int91 + "' != '" + 1 + "'", int91 == 1);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 10, chronology5);
        java.util.Date date7 = dateTime6.toDate();
        org.joda.time.DateTime dateTime9 = dateTime6.withYearOfEra(1);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfMonth(12);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(locale13);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withPeriodAdded(readablePeriod16, (int) '#');
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.minuteOfHour();
        boolean boolean23 = calendar14.after((java.lang.Object) localDateTime20);
        org.joda.time.Chronology chronology24 = localDateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.year();
        org.joda.time.DurationField durationField26 = chronology24.hours();
        org.joda.time.DateTimeField dateTimeField27 = chronology24.hourOfHalfday();
        org.joda.time.MutableDateTime mutableDateTime28 = dateTime11.toMutableDateTime(chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime(7, 900, 86399999, (int) 'u', chronology24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 900 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1644572884808,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=4,MILLISECOND=808,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(mutableDateTime28);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) calendar2, chronology16);
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.util.Locale locale22 = java.util.Locale.ENGLISH;
        java.lang.String str23 = locale21.getDisplayVariant(locale22);
        java.lang.String str24 = locale22.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap25 = calendar2.getDisplayNames(1970, 2021, locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644572884830,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=4,MILLISECOND=830,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        java.util.Date date10 = localDate9.toDate();
        calendar2.setTime(date10);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone16.toTimeZone();
        calendar2.setTimeZone(timeZone18);
        java.lang.Object obj20 = calendar2.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644883200000,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=+100:52,offset=363120000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Tue Feb 15 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone18);
// flaky:         org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+:0:52");
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "java.util.GregorianCalendar[time=1644883200000,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=+100:52,offset=363120000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "java.util.GregorianCalendar[time=1644883200000,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=+100:52,offset=363120000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "java.util.GregorianCalendar[time=1644883200000,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=+100:52,offset=363120000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) calendar2, chronology16);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.clear(2021);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2021");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644572885042,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=5,MILLISECOND=42,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime4 = dateTimeFormatter0.parseMutableDateTime("15");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"15\" is too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("Feb 15, 2022 12:00:00 AM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'Feb 15, 2022 12:00:00 AM' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.addToCopy((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long11 = dateTimeZone7.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.Interval interval12 = localDate4.toInterval(dateTimeZone7);
        int int13 = localDate4.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate4.withEra((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-327851809L) + "'", long11 == (-327851809L));
        org.junit.Assert.assertNotNull(interval12);
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 7 + "'", int13 == 7);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate localDate6 = localDate4.plusDays(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate6.withEra((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        java.util.Date date3 = dateTime2.toDate();
        org.joda.time.DateTime dateTime5 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfMonth(12);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32);
        java.lang.Class<?> wildcardClass10 = dateTime9.getClass();
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        java.util.Date date3 = dateTime2.toDate();
        int int4 = date3.getYear();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromDateFields(date3);
        org.joda.time.LocalDate localDate7 = localDate5.withYear(1970);
        java.lang.Object obj8 = null;
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.Interval interval10 = new org.joda.time.Interval(obj8, chronology9);
        long long11 = interval10.toDurationMillis();
        org.joda.time.PeriodType periodType12 = null;
        org.joda.time.Period period13 = interval10.toPeriod(periodType12);
        org.joda.time.LocalDate localDate14 = localDate7.plus((org.joda.time.ReadablePeriod) period13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate7.withEra(7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 7 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 0L + "'", long11 == 0L);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (byte) 100, chronology16);
        java.lang.Object obj18 = null;
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.Interval interval20 = new org.joda.time.Interval(obj18, chronology19);
        long long21 = interval20.toDurationMillis();
        org.joda.time.Period period22 = interval20.toPeriod();
        java.lang.String str23 = period22.toString();
        long long26 = chronology16.add((org.joda.time.ReadablePeriod) period22, (long) (byte) 100, 0);
        long long32 = chronology16.getDateTimeMillis((long) 35268191, (int) (byte) 1, 20, (int) (byte) 0, 42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(2, 86399999, (-1), chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644572885291,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=5,MILLISECOND=291,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 0L + "'", long21 == 0L);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "PT0S" + "'", str23, "PT0S");
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 100L + "'", long26 == 100L);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 4800042L + "'", long32 == 4800042L);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) '#');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        boolean boolean14 = calendar5.after((java.lang.Object) localDateTime11);
        org.joda.time.Chronology chronology15 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        org.joda.time.DurationField durationField17 = chronology15.years();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(52, (-1073453520), 11, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1073453520 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644572885342,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=5,MILLISECOND=342,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(durationField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        calendar2.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.setWeekDate(6, 0, 17520000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 17520000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.util.TimeZone timeZone1 = null;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        org.joda.time.DateMidnight dateMidnight3 = org.joda.time.DateMidnight.now(dateTimeZone2);
        java.lang.String str5 = dateTimeZone2.getNameKey((long) 12);
        java.lang.Object obj6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Interval interval8 = new org.joda.time.Interval(obj6, chronology7);
        long long9 = interval8.toDurationMillis();
        org.joda.time.PeriodType periodType10 = null;
        org.joda.time.Period period11 = interval8.toPeriod(periodType10);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) (byte) 1);
        boolean boolean14 = interval8.isAfter((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime.Property property15 = dateTime13.weekOfWeekyear();
        int int16 = dateTimeZone2.getOffset((org.joda.time.ReadableInstant) dateTime13);
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((long) (short) -1, dateTimeZone2);
        java.util.Locale locale19 = java.util.Locale.CHINA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dateTime17.toString("", locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateMidnight3);
// flaky:         org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + 0L + "'", long9 == 0L);
        org.junit.Assert.assertNotNull(period11);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property15);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 363120000 + "'", int16 == 363120000);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondMillis();
        java.io.Writer writer1 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        int[] intArray9 = localDateTime5.getValues();
        boolean boolean10 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        org.joda.time.LocalDateTime.Property property11 = localDateTime5.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime14 = property13.withMaximumValue();
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadableInstant) dateTime15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 15, 52805479]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecond();
        boolean boolean2 = dateTimeFormatter1.isPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.parse("2022-02-15T14:40:00.635", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-15T14:40:00.635\" is malformed at \"22-02-15T14:40:00.635\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("South Korea");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"South Korea\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
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
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        int[] intArray9 = localDateTime5.getValues();
        boolean boolean10 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        int int12 = dateTimeZone4.getOffsetFromLocal((long) 4);
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = dateTimeZone4.getName((long) 9, locale15);
        java.lang.String str17 = locale1.getDisplayLanguage(locale15);
        java.util.Locale.Builder builder18 = builder0.setLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder20 = builder18.setLanguageTag("15 Feb 2022 14:40:02 GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 15 Feb 2022 14:40:02 GMT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 15, 52805682]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 363120000 + "'", int12 == 363120000);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:52" + "'", str16, "+100:52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japanese" + "'", str17, "Japanese");
        org.junit.Assert.assertNotNull(builder18);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        java.util.Date date3 = dateTime2.toDate();
        int int4 = date3.getYear();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromDateFields(date3);
        org.joda.time.LocalDate localDate7 = localDate5.withYear(1970);
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDate7.toString("Etc/UTC", locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 70 + "'", int4 == 70);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        calendar2.setTimeZone(timeZone14);
        boolean boolean16 = calendar2.isLenient();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=+100:52,offset=363120000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(timeZone14);
// flaky:         org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+:0:52");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.getDefault();
        org.junit.Assert.assertNotNull(dateTimeZone0);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime3.withDayOfMonth(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52805961]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = dateTimeFormatter0.parseDateTime("java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.util.GregorianCalendar[time...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        java.util.Date date10 = localDate9.toDate();
        calendar2.setTime(date10);
        java.lang.String str12 = date10.toLocaleString();
        int int13 = date10.getDay();
        java.util.Date date20 = new java.util.Date(0, (int) 'a', (int) (short) 1, (int) (short) 10, (int) (short) -1, (int) ' ');
        int int21 = date10.compareTo(date20);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644883200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date10);
// flaky:         org.junit.Assert.assertEquals(date10.toString(), "Tue Feb 15 00:00:00 UTC 2022");
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Feb 15, 2022 12:00:00 AM" + "'", str12, "Feb 15, 2022 12:00:00 AM");
// flaky:         org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2 + "'", int13 == 2);
        org.junit.Assert.assertEquals(date20.toString(), "Sat Feb 01 09:59:32 UTC 1908");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(70, 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 1970");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime4 = property2.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime5 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime7 = localTime5.plusMillis((int) (byte) 1);
        org.joda.time.LocalTime.Property property8 = localTime5.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localTime5.toString("2022-02-11T09:47:50.734");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusWeeks(1);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(0L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localDateTime17.isSupported(dateTimeFieldType18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusMillis((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusDays(1);
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.DateMidnight dateMidnight26 = dateTime25.toDateMidnight();
        org.joda.time.DateMidnight.Property property27 = dateMidnight26.weekyear();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight26.withChronology(chronology28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withPeriodAdded(readablePeriod34, (int) '#');
        int[] intArray37 = localDateTime33.getValues();
        boolean boolean38 = dateTimeZone32.isLocalDateTimeGap(localDateTime33);
        org.joda.time.LocalDateTime.Property property39 = localDateTime33.millisOfDay();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight26.withField(dateTimeFieldType41, (int) (short) 10);
        org.joda.time.DateTime dateTime44 = localDateTime21.toDateTime((org.joda.time.ReadableInstant) dateMidnight43);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withPeriodAdded(readablePeriod46, (int) '#');
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfDay();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.minuteOfHour();
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Interval interval54 = new org.joda.time.Interval(obj52, chronology53);
        long long55 = interval54.toDurationMillis();
        org.joda.time.Period period56 = interval54.toPeriod();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime50.minus((org.joda.time.ReadablePeriod) period56);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight43.minus((org.joda.time.ReadablePeriod) period56);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime12.withPeriodAdded((org.joda.time.ReadablePeriod) period56, 6);
        java.util.TimeZone timeZone61 = null;
        org.joda.time.DateTimeZone dateTimeZone62 = org.joda.time.DateTimeZone.forTimeZone(timeZone61);
        org.joda.time.LocalTime localTime63 = org.joda.time.LocalTime.now(dateTimeZone62);
        org.joda.time.DateTimeFieldType dateTimeFieldType64 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean65 = localTime63.isSupported(dateTimeFieldType64);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime67 = localDateTime60.withField(dateTimeFieldType64, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52806184]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(intArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[2022, 2, 15, 52806185]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(dateTimeZone62);
        org.junit.Assert.assertNotNull(localTime63);
        org.junit.Assert.assertNotNull(dateTimeFieldType64);
        org.junit.Assert.assertTrue("'" + boolean65 + "' != '" + false + "'", boolean65 == false);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        long long16 = dateTimeField13.getDifferenceAsLong((long) (byte) 0, (long) (-1));
        java.lang.String str17 = dateTimeField13.toString();
        boolean boolean18 = dateTimeField13.isSupported();
        java.lang.String str19 = dateTimeField13.toString();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(chronology20);
        org.joda.time.LocalDate localDate23 = localDate21.plusWeeks(6);
        org.joda.time.LocalDate localDate25 = localDate21.minusWeeks(7);
        int int26 = localDate25.getDayOfYear();
        org.joda.time.LocalDate localDate28 = localDate25.plusMonths(35270798);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = locale30.stripExtensions();
        java.util.Calendar calendar32 = java.util.Calendar.getInstance(locale31);
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withPeriodAdded(readablePeriod34, (int) '#');
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.millisOfDay();
        org.joda.time.LocalDateTime localDateTime38 = property37.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property39 = localDateTime38.minuteOfHour();
        org.joda.time.LocalDateTime.Property property40 = localDateTime38.minuteOfHour();
        boolean boolean41 = calendar32.after((java.lang.Object) localDateTime38);
        org.joda.time.Chronology chronology42 = localDateTime38.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = chronology42.year();
        java.util.Locale locale44 = java.util.Locale.KOREA;
        java.util.Locale locale45 = locale44.stripExtensions();
        int int46 = dateTimeField43.getMaximumTextLength(locale44);
        long long49 = dateTimeField43.set((long) (short) 10, 35268191);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(0L, dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.minusYears((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime55 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.LocalDateTime localDateTime58 = localDateTime55.withPeriodAdded(readablePeriod56, (int) '#');
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.millisOfDay();
        org.joda.time.LocalDateTime localDateTime60 = property59.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property61 = localDateTime60.minuteOfHour();
        org.joda.time.LocalDateTime.Property property62 = localDateTime60.minuteOfHour();
        boolean boolean63 = localDateTime54.isAfter((org.joda.time.ReadablePartial) localDateTime60);
        int[] intArray68 = new int[] { 142, (short) 1, 28, 2022 };
        int int69 = dateTimeField43.getMinimumValue((org.joda.time.ReadablePartial) localDateTime60, intArray68);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray71 = dateTimeField13.addWrapPartial((org.joda.time.ReadablePartial) localDate28, (int) (short) -1, intArray68, 15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572886206,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=6,MILLISECOND=206,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "DateTimeField[weekOfWeekyear]" + "'", str17, "DateTimeField[weekOfWeekyear]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "DateTimeField[weekOfWeekyear]" + "'", str19, "DateTimeField[weekOfWeekyear]");
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
// flaky:         org.junit.Assert.assertTrue("'" + int26 + "' != '" + 362 + "'", int26 == 362);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar32);
// flaky:         org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1644572886206,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=6,MILLISECOND=206,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 9 + "'", int46 == 9);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1112894443353600010L + "'", long49 == 1112894443353600010L);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(localDateTime55);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(localDateTime60);
        org.junit.Assert.assertNotNull(property61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[142, 1, 28, 2022]");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + (-292275054) + "'", int69 == (-292275054));
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long11 = dateTimeZone7.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(0L, dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        boolean boolean18 = localDateTime16.isSupported(dateTimeFieldType17);
        org.joda.time.LocalDateTime localDateTime20 = localDateTime16.minusMillis((int) (short) 10);
        boolean boolean21 = dateTimeZone7.isLocalDateTimeGap(localDateTime16);
        long long23 = dateTimeZone7.convertUTCToLocal(0L);
        int int25 = dateTimeZone7.getOffset((long) 35268191);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone7);
        java.lang.Object obj27 = null;
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.Interval interval29 = new org.joda.time.Interval(obj27, chronology28);
        boolean boolean30 = interval29.containsNow();
        java.lang.Object obj31 = null;
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.Interval interval33 = new org.joda.time.Interval(obj31, chronology32);
        long long34 = interval33.toDurationMillis();
        org.joda.time.PeriodType periodType35 = null;
        org.joda.time.Period period36 = interval33.toPeriod(periodType35);
        org.joda.time.Interval interval37 = interval29.overlap((org.joda.time.ReadableInterval) interval33);
        boolean boolean38 = interval29.containsNow();
        boolean boolean39 = dateTimeZone7.equals((java.lang.Object) boolean38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((int) ' ', 1, (int) (byte) 0, 28, (-1073453520), dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 28 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-327851809L) + "'", long11 == (-327851809L));
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 363120000L + "'", long23 == 363120000L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 363120000 + "'", int25 == 363120000);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 0L + "'", long34 == 0L);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNull(interval37);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.util.Date date0 = new java.util.Date();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        int[] intArray8 = localDateTime4.getValues();
        boolean boolean9 = dateTimeZone3.isLocalDateTimeGap(localDateTime4);
        org.joda.time.LocalDateTime.Property property10 = localDateTime4.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundHalfFloorCopy();
        java.util.Date date12 = localDateTime11.toDate();
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.fromDateFields(date12);
        java.lang.String str14 = date12.toGMTString();
        int int15 = date12.getMinutes();
        int int16 = date0.compareTo(date12);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Fri Feb 11 09:48:06 UTC 2022");
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(intArray8);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray8), "[2022, 2, 15, 52806391]");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(date12);
// flaky:         org.junit.Assert.assertEquals(date12.toString(), "Tue Feb 15 14:40:06 UTC 2022");
        org.junit.Assert.assertNotNull(localDateTime13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "15 Feb 2022 14:40:06 GMT" + "'", str14, "15 Feb 2022 14:40:06 GMT");
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 40 + "'", int15 == 40);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + (-1) + "'", int16 == (-1));
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 10, chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYear(12);
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime.Property property7 = dateTime5.weekOfWeekyear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology8);
        java.lang.String str10 = localTime9.toString();
        org.joda.time.DateTime dateTime11 = dateTime5.withFields((org.joda.time.ReadablePartial) localTime9);
        int int12 = dateTime11.getYear();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "14:40:06.584" + "'", str10, "14:40:06.584");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 12 + "'", int12 == 12);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMaximumValue();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        int int14 = dateTime13.getEra();
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTime dateTime17 = dateTime13.withFieldAdded(durationFieldType15, 11);
        java.lang.String str18 = durationFieldType15.getName();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52806595]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "millis" + "'", str18, "millis");
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.localDateParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("ISOChronology[UTC]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ISOChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        java.util.Locale locale2 = dateTimeFormatter1.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter1.withPivotYear(35268191);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = org.joda.time.DateMidnight.parse("1970-W01", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-W01\" is malformed at \"W01\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNull(locale2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        int int4 = calendar2.getActualMinimum((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calendar2.getActualMaximum((-292275054));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -292275054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572886792,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=6,MILLISECOND=792,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        int int11 = localDateTime10.getYearOfEra();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.weekOfWeekyear();
        org.joda.time.LocalDateTime.Property property13 = localDateTime10.millisOfDay();
        org.joda.time.DurationField durationField14 = property13.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52806827]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNull(durationField14);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        long long3 = interval2.toDurationMillis();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = interval2.toPeriod(periodType4);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) (byte) 1);
        boolean boolean8 = interval2.isAfter((org.joda.time.ReadableInstant) dateTime7);
        org.joda.time.ReadableInterval readableInterval9 = null;
        org.joda.time.Interval interval10 = interval2.overlap(readableInterval9);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusDays(1);
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateMidnight dateMidnight15 = dateTime14.toDateMidnight();
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.weekyear();
        long long17 = dateMidnight15.getMillis();
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight15.withWeekyear((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval20 = interval2.withEnd((org.joda.time.ReadableInstant) dateMidnight19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(interval10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 1644606480000L + "'", long17 == 1644606480000L);
        org.junit.Assert.assertNotNull(dateMidnight19);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("DateTimeField[dayOfWeek]", (double) 40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=40.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 86399999);
        org.joda.time.LocalTime localTime3 = localTime1.plusSeconds((int) (short) 100);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfDay();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.lang.String str9 = locale6.getDisplayVariant(locale7);
        java.util.Locale locale10 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime17 = localDateTime14.withPeriodAdded(readablePeriod15, (int) '#');
        int[] intArray18 = localDateTime14.getValues();
        boolean boolean19 = dateTimeZone13.isLocalDateTimeGap(localDateTime14);
        int int21 = dateTimeZone13.getOffsetFromLocal((long) 4);
        java.util.Locale locale24 = new java.util.Locale("");
        java.lang.String str25 = dateTimeZone13.getName((long) 9, locale24);
        java.lang.String str26 = locale10.getDisplayLanguage(locale24);
        java.lang.String str27 = locale6.getDisplayCountry(locale24);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusDays(1);
        org.joda.time.DateTime dateTime31 = localDateTime30.toDateTime();
        org.joda.time.DateTime dateTime32 = dateTime31.withEarlierOffsetAtOverlap();
        int int33 = dateTime31.getWeekyear();
        org.joda.time.DateTime.Property property34 = dateTime31.weekOfWeekyear();
        java.util.Locale locale36 = new java.util.Locale("");
        java.lang.String str37 = locale36.getDisplayLanguage();
        int int38 = property34.getMaximumShortTextLength(locale36);
        java.lang.String str39 = locale24.getDisplayVariant(locale36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime40 = property4.setCopy("1970-W02", locale36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-W02\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(intArray18);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[2022, 2, 15, 52806980]");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 363120000 + "'", int21 == 363120000);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+100:52" + "'", str25, "+100:52");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "Japanese" + "'", str26, "Japanese");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "South Korea" + "'", str27, "South Korea");
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 2 + "'", int38 == 2);
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.dayOfMonth();
        org.joda.time.LocalDateTime localDateTime12 = property11.withMaximumValue();
        org.joda.time.DateTime dateTime13 = localDateTime12.toDateTime();
        int int14 = dateTime13.getEra();
        org.joda.time.DateTime dateTime16 = dateTime13.withDayOfYear(362);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dateTime16.get(dateTimeFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52807038]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withDefaultYear((int) 'x');
        java.io.Writer writer3 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (short) 10, chronology5);
        java.util.Date date7 = dateTime6.toDate();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer3, (org.joda.time.ReadableInstant) dateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.weekyear();
        org.joda.time.DateMidnight dateMidnight7 = property5.addToCopy((long) (short) 0);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusYears((int) (byte) 1);
        org.joda.time.DateMidnight.Property property10 = dateMidnight7.centuryOfEra();
        org.joda.time.DateMidnight dateMidnight11 = property10.withMinimumValue();
        java.util.Locale locale14 = java.util.Locale.forLanguageTag("\ufffd\ufffd\ufffd\ufffd\ufffd\ufffd.000");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight15 = property10.setCopy("Etc/UTC", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Etc/UTC\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "");
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        java.util.Date date3 = dateTime2.toDate();
        int int4 = date3.getDate();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.fromDateFields(date3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter6.withDefaultYear(3);
        boolean boolean9 = date3.equals((java.lang.Object) dateTimeFormatter8);
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) 'x');
        org.joda.time.LocalTime.Property property6 = localTime3.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localTime3.getValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight.Property property1 = dateMidnight0.era();
        java.util.Locale locale3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = property1.setCopy("35272277", locale3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"35272277\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("English");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.addToCopy((int) (short) 10);
        org.joda.time.LocalDate localDate5 = property2.getLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = property2.setCopy("2022-01-05T14:40:05.029+100:52");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-01-05T14:40:05.029+100:52\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        java.lang.String str2 = localTime1.toString();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = locale6.stripExtensions();
        java.lang.String str8 = locale5.getDisplayVariant(locale6);
        java.util.Locale locale9 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime13.withPeriodAdded(readablePeriod14, (int) '#');
        int[] intArray17 = localDateTime13.getValues();
        boolean boolean18 = dateTimeZone12.isLocalDateTimeGap(localDateTime13);
        int int20 = dateTimeZone12.getOffsetFromLocal((long) 4);
        java.util.Locale locale23 = new java.util.Locale("");
        java.lang.String str24 = dateTimeZone12.getName((long) 9, locale23);
        java.lang.String str25 = locale9.getDisplayLanguage(locale23);
        java.lang.String str26 = locale5.getDisplayCountry(locale23);
        java.util.Set<java.lang.String> strSet27 = locale5.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime28 = property3.setCopy("09:47:51.005", locale5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:47:51.005\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "14:40:07.616" + "'", str2, "14:40:07.616");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(intArray17);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray17), "[2022, 2, 15, 52807616]");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 363120000 + "'", int20 == 363120000);
        org.junit.Assert.assertEquals(locale23.toString(), "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+100:52" + "'", str24, "+100:52");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "Japanese" + "'", str25, "Japanese");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "South Korea" + "'", str26, "South Korea");
        org.junit.Assert.assertNotNull(strSet27);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = localDate1.toString("2022-02-11T09:47:54.545");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hour();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = dateTimeFormatter0.withZoneUTC();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter1.printTo(writer2, (long) 358);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '#');
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withPeriodAdded(readablePeriod10, (int) '#');
        int[] intArray13 = localDateTime9.getValues();
        boolean boolean14 = dateTimeZone8.isLocalDateTimeGap(localDateTime9);
        org.joda.time.DateMidnight dateMidnight15 = org.joda.time.DateMidnight.now(dateTimeZone8);
        java.lang.String str16 = dateTimeFormatter5.print((org.joda.time.ReadableInstant) dateMidnight15);
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.plus(readableDuration19);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight18.withFieldAdded(durationFieldType21, 0);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight18.withDurationAdded((long) (short) 0, 7);
        org.joda.time.DateMidnight.Property property27 = dateMidnight18.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight29 = property27.addWrapFieldToCopy(11);
        org.joda.time.DateMidnight.Property property30 = dateMidnight29.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval31 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight15, (org.joda.time.ReadableInstant) dateMidnight29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(intArray13);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[2022, 2, 15, 52807872]");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "2022-046T00:00:00.000+100:52" + "'", str16, "2022-046T00:00:00.000+100:52");
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumShortTextLength(locale7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property5.setCopy(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.LocalDate localDate6 = property5.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray7 = localDate6.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate6.withDayOfMonth(69);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray7);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("Feb 15, 2022 12:00:00 AM");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Feb 15, 2022 12:00:00 AM\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\ud654", (double) (-62163607920000L));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=-6.216360792E13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicTTime();
        org.joda.time.format.DateTimeParser dateTimeParser1 = dateTimeFormatter0.getParser();
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer2, (long) 35268191);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeParser1);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(chronology3);
        org.joda.time.LocalDate.Property property5 = localDate4.weekyear();
        org.joda.time.LocalDate localDate7 = localDate4.withYearOfEra((int) (byte) 100);
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDate7.toDateTimeAtStartOfDay(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight((-1073453520), 28, 0, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1073453520 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        java.lang.String str2 = localTime1.toString();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime5 = property3.addCopy((-1L));
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology6);
        org.joda.time.LocalDate.Property property8 = localDate7.weekyear();
        org.joda.time.LocalDate localDate10 = property8.addToCopy((int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long17 = dateTimeZone13.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.Interval interval18 = localDate10.toInterval(dateTimeZone13);
        int int19 = localDate10.getWeekOfWeekyear();
        org.joda.time.LocalDate localDate21 = localDate10.minusWeeks(0);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int24 = localDate22.get(dateTimeFieldType23);
        boolean boolean25 = localDate21.isSupported(dateTimeFieldType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property26 = localTime5.property(dateTimeFieldType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "14:40:08.441" + "'", str2, "14:40:08.441");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-327851809L) + "'", long17 == (-327851809L));
        org.junit.Assert.assertNotNull(interval18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '#');
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        // The following exception was thrown during execution in test generation
        try {
            long long7 = dateTimeFormatter5.parseMillis("2022-02-15T14:40:06.617");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-15T14:40:06.617\" is malformed at \"-15T14:40:06.617\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTimeNoMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = dateTimeFormatter0.parseLocalTime("1970-01-01T00:00:00.010Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1970-01-01T00:00:00.010Z\" is malformed at \".010Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.lang.String[] strArray91 = new java.lang.String[] { "09:47:54.610", "0012-01-05T04:52:00.010+100:52/0012-01-05T04:52:00.010+100:52", "ISOChronology[UTC]", "millis", "32770", "2", "2", "Feb 15, 2022 12:00:00 AM", "14:39:59.929", "ISOChronology[UTC]", "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", "Thu Jan 01 00:00:00 UTC 1970", "52804398", "1970-W01", "35271248", "1970-01-05T04:52", "15 Feb 2022 14:40:04 GMT", "0", "09:47:51.005", "35273537", "Korean (South Korea)", "32770", "PT0S", "8", "15 Feb 2022 14:40:02 GMT", "0100-02-15", "14:40:03.187", "en", "2022-02-15T14:40:06.617", "zho", "yearOfCentury", "Etc/UTC", "2022-02-15T14:40:01.707", "UTC", "52805835", "15", "14:40:06.584", "14:39:59.794", "32770", "millis", "Thu Jan 01 00:00:00 UTC 1970", "PT0S", "ko", "1970-01-05T04:52:00.010+100:52", "PT0S", "centuryOfEra", "2022-01-05T14:40:05.029+100:52", "2022-02-11T00:00:00.000", "52805835", "1970-01-01T00:00:00.000Z", "2022-02-15T14:40:01.488", "centuryOfEra", "09:47:54.610", "14:40:06.568", "0100-02-11", "DateTimeField[hourOfDay]", "PT0S", "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]", "1970-01-01T00:00:00.010Z", "2022-046T00:00:00.000+100:52", "\uc6d4", "52804398", "0100-02-11", "2022-02-11T00:00:00.000", "15 Feb 2022 14:40:06 GMT", "0012-01-05T04:52:00.010+100:52/0012-01-05T04:52:00.010+100:52", "2022-02-15T14:40:00.635", "14:40:06.568", "35274921", "yearOfCentury", "0100-02-15", "2", "+100:52", "32770", "2022-W07", "2", "1970-01-05T00:00:00.000+100:52/2022-02-15T14:40:08.423+100:52", "2022-02-15T14:40:01.488", "2022-046T00:00:00.000+100:52", "\uae08", "hi!", "1970-W02", "1", "yearOfCentury", "PT0S", "\u97d3\u6587\u5357\u97d3)", "32770", "15 Feb 2022 14:40:04 GMT", "2022-02-11T09:47:55.570", "UTC", "DateTimeField[weekOfWeekyear]" };
        java.util.ArrayList<java.lang.String> strList92 = new java.util.ArrayList<java.lang.String>();
        boolean boolean93 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList92, strArray91);
        boolean boolean95 = strList92.add("Korean");
        org.junit.Assert.assertNotNull(strArray91);
        org.junit.Assert.assertTrue("'" + boolean93 + "' != '" + true + "'", boolean93 == true);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(readableDuration2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFieldAdded(durationFieldType4, 0);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight1.withDurationAdded((long) (short) 0, 7);
        org.joda.time.DateMidnight.Property property10 = dateMidnight1.era();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight1.withMillis(0L);
        org.joda.time.DateMidnight.Property property13 = dateMidnight12.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight15 = property13.setCopy("0100-02-11");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0100-02-11\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("\uae08");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"???\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime4.withSecondOfMinute(2021);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2021 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = locale15.stripExtensions();
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(locale16);
        java.lang.String str18 = dateTimeField13.getAsShortText((long) 100, locale16);
        long long21 = dateTimeField13.set((long) (byte) 0, 3);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572888706,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=8,MILLISECOND=706,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1644572888706,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=8,MILLISECOND=706,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1" + "'", str18, "1");
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1209600000L + "'", long21 == 1209600000L);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime3.withMonthOfYear(8);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.minusMinutes((int) (short) 0);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(chronology14);
        org.joda.time.LocalDate.Property property16 = localDate15.weekyear();
        org.joda.time.LocalDate localDate18 = property16.addToCopy((int) (short) 10);
        org.joda.time.LocalDate localDate19 = property16.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = localDateTime3.isAfter((org.joda.time.ReadablePartial) localDate19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52808789]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = localDateTime3.withMonthOfYear(8);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime3.minusMinutes((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime18 = localDateTime3.withTime(53, 48, 32769, 28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52809015]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((-292275054), 7, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        long long3 = interval2.toDurationMillis();
        java.lang.Object obj4 = null;
        boolean boolean5 = interval2.equals(obj4);
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration8 = null;
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.plus(readableDuration8);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight7.withFieldAdded(durationFieldType10, 0);
        org.joda.time.ReadableDuration readableDuration13 = null;
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight12.withDurationAdded(readableDuration13, 0);
        org.joda.time.Interval interval16 = interval2.withStart((org.joda.time.ReadableInstant) dateMidnight12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight18 = dateMidnight12.withMonthOfYear((-1073453520));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1073453520 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(interval16);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.LocalDate localDate6 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        org.joda.time.LocalDate localDate9 = localDate6.withCenturyOfEra(28);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(0L, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusYears((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withPeriodAdded(readablePeriod16, (int) '#');
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.minuteOfHour();
        boolean boolean23 = localDateTime14.isAfter((org.joda.time.ReadablePartial) localDateTime20);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.centuries();
        boolean boolean25 = localDateTime20.isSupported(durationFieldType24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate27 = localDate9.withFieldAdded(durationFieldType24, 35268191);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 3526819100");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        calendar2.setTimeInMillis(1L);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = calendar2.getGreatestMinimum(292278993);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 292278993");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("0100-02-11");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '0100-02-11' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfFloorCopy();
        java.util.Date date11 = localDateTime10.toDate();
        java.lang.Object obj12 = date11.clone();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52809172]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Feb 15 14:40:09 UTC 2022");
        org.junit.Assert.assertNotNull(obj12);
// flaky:         org.junit.Assert.assertEquals(obj12.toString(), "Tue Feb 15 14:40:09 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj12), "Tue Feb 15 14:40:09 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj12), "Tue Feb 15 14:40:09 UTC 2022");
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withHourOfDay((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52809199]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(1L, dateTimeZone4);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 32769, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(1L, dateTimeZone11);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 32769, dateTimeZone11);
        boolean boolean15 = dateTimeZone11.isStandardOffset((long) 2022);
        org.joda.time.DateTime dateTime16 = localTime6.toDateTimeToday(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType18 = localTime6.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.LocalDateTime.Property property4 = localDateTime2.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = property4.setCopy("2022-02-11T09:47:54.545");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-11T09:47:54.545\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(10, 48, 40, (-1), 142, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime4 = property2.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime5 = property2.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime7 = localTime5.minusMillis((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime5.withMinuteOfHour(17520000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17520000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 1970);
        int int2 = dateTime1.getCenturyOfEra();
        java.lang.Class<?> wildcardClass3 = dateTime1.getClass();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
        org.junit.Assert.assertNotNull(wildcardClass3);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        int int2 = localDate1.getEra();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) '#');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        boolean boolean14 = calendar5.after((java.lang.Object) localDateTime11);
        org.joda.time.Chronology chronology15 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology15);
        org.joda.time.DateTimeField dateTimeField18 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField19 = chronology15.minutes();
        org.joda.time.DateTimeField dateTimeField20 = chronology15.clockhourOfHalfday();
        org.joda.time.DurationField durationField21 = chronology15.hours();
        java.lang.String str22 = chronology15.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((java.lang.Object) localDate1, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644572889449,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=9,MILLISECOND=449,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "ISOChronology[UTC]" + "'", str22, "ISOChronology[UTC]");
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale3);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.minuteOfHour();
        boolean boolean13 = calendar4.after((java.lang.Object) localDateTime10);
        org.joda.time.Chronology chronology14 = localDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) -1, chronology14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval17 = new org.joda.time.Interval((java.lang.Object) filteringMode0, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.util.Locale$FilteringMode");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1644572889464,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=9,MILLISECOND=464,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) 100);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plusWeeks((int) (byte) -1);
        int int4 = dateMidnight3.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTime(0, 1, 12, 6);
        org.joda.time.DateTime dateTime11 = dateTime4.withMillis(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = dateTime11.minusYears(363120000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -363118030 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.ordinalDate();
        java.util.Locale locale2 = dateTimeFormatter1.getLocale();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter1.withPivotYear(35268191);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.parse("14:40:06.503", dateTimeFormatter4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"14:40:06.503\" is malformed at \":40:06.503\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNull(locale2);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.addUnicodeLocaleAttribute("2022-02-15T14:40:01.488");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-15T14:40:01.488 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.weekyear();
        org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.plus((long) 'a');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withYearOfCentury(12);
        org.joda.time.Interval interval10 = dateMidnight4.toInterval();
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusDays(1);
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateMidnight dateMidnight15 = dateTime14.toDateMidnight();
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.weekyear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight15.withChronology(chronology17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withPeriodAdded(readablePeriod23, (int) '#');
        int[] intArray26 = localDateTime22.getValues();
        boolean boolean27 = dateTimeZone21.isLocalDateTimeGap(localDateTime22);
        org.joda.time.LocalDateTime.Property property28 = localDateTime22.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property28.getFieldType();
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight15.withField(dateTimeFieldType30, (int) (short) 10);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight15.withMillis((long) (byte) 10);
        boolean boolean35 = interval10.isAfter((org.joda.time.ReadableInstant) dateMidnight34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval37 = interval10.withEndMillis((long) 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(intArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[2022, 2, 15, 52809586]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusWeeks(1);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(0L, dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localDateTime17.isSupported(dateTimeFieldType18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.minusMillis((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusDays(1);
        org.joda.time.DateTime dateTime25 = localDateTime24.toDateTime();
        org.joda.time.DateMidnight dateMidnight26 = dateTime25.toDateMidnight();
        org.joda.time.DateMidnight.Property property27 = dateMidnight26.weekyear();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight26.withChronology(chronology28);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime33 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime33.withPeriodAdded(readablePeriod34, (int) '#');
        int[] intArray37 = localDateTime33.getValues();
        boolean boolean38 = dateTimeZone32.isLocalDateTimeGap(localDateTime33);
        org.joda.time.LocalDateTime.Property property39 = localDateTime33.millisOfDay();
        org.joda.time.LocalDateTime localDateTime40 = property39.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType41 = property39.getFieldType();
        org.joda.time.DateMidnight dateMidnight43 = dateMidnight26.withField(dateTimeFieldType41, (int) (short) 10);
        org.joda.time.DateTime dateTime44 = localDateTime21.toDateTime((org.joda.time.ReadableInstant) dateMidnight43);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withPeriodAdded(readablePeriod46, (int) '#');
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfDay();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.minuteOfHour();
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Interval interval54 = new org.joda.time.Interval(obj52, chronology53);
        long long55 = interval54.toDurationMillis();
        org.joda.time.Period period56 = interval54.toPeriod();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime50.minus((org.joda.time.ReadablePeriod) period56);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight43.minus((org.joda.time.ReadablePeriod) period56);
        org.joda.time.LocalDateTime localDateTime60 = localDateTime12.withPeriodAdded((org.joda.time.ReadablePeriod) period56, 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime63 = localDateTime12.withField(dateTimeFieldType61, 900);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52809731]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(intArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[2022, 2, 15, 52809731]");
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertNotNull(localDateTime40);
        org.junit.Assert.assertNotNull(dateTimeFieldType41);
        org.junit.Assert.assertNotNull(dateMidnight43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertNotNull(localDateTime60);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyearWeek();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronology();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean6 = localDateTime2.isSupported(dateTimeFieldType5);
        boolean boolean8 = localDateTime2.equals((java.lang.Object) 10.0f);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime2.minusYears(32769);
        java.lang.String str11 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDateTime2);
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.util.Locale locale13 = locale12.stripExtensions();
        java.util.Calendar calendar14 = java.util.Calendar.getInstance(locale13);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime15.withPeriodAdded(readablePeriod16, (int) '#');
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.millisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property21 = localDateTime20.minuteOfHour();
        org.joda.time.LocalDateTime.Property property22 = localDateTime20.minuteOfHour();
        boolean boolean23 = calendar14.after((java.lang.Object) localDateTime20);
        org.joda.time.Chronology chronology24 = localDateTime20.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = chronology24.weekOfWeekyear();
        int int27 = dateTimeField25.get((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime32 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.LocalDateTime localDateTime35 = localDateTime32.withPeriodAdded(readablePeriod33, (int) '#');
        int[] intArray36 = localDateTime32.getValues();
        boolean boolean37 = dateTimeZone31.isLocalDateTimeGap(localDateTime32);
        org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long) (byte) 10, dateTimeZone31);
        int int39 = dateTimeField25.getMaximumValue((org.joda.time.ReadablePartial) localDateTime38);
        java.lang.String str40 = dateTimeFormatter0.print((org.joda.time.ReadablePartial) localDateTime38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDate localDate42 = new org.joda.time.LocalDate(dateTimeZone41);
        org.joda.time.DurationFieldType durationFieldType43 = org.joda.time.DurationFieldType.years();
        java.lang.String str44 = durationFieldType43.toString();
        org.joda.time.LocalDate localDate46 = localDate42.withFieldAdded(durationFieldType43, 900);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime48 = localDateTime38.withFieldAdded(durationFieldType43, 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292280963 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "2022-W07" + "'", str11, "2022-W07");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=1644572889818,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=9,MILLISECOND=818,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1 + "'", int27 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(intArray36);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[2022, 2, 15, 52809818]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 53 + "'", int39 == 53);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "1970-W02" + "'", str40, "1970-W02");
        org.junit.Assert.assertNotNull(durationFieldType43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "years" + "'", str44, "years");
        org.junit.Assert.assertNotNull(localDate46);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property5 = localDate4.monthOfYear();
        org.joda.time.DurationField durationField6 = property5.getDurationField();
        java.util.Locale locale7 = null;
        int int8 = property5.getMaximumShortTextLength(locale7);
        org.joda.time.DateTimeField dateTimeField9 = property5.getField();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime(chronology10);
        org.joda.time.LocalTime.Property property12 = localTime11.minuteOfHour();
        org.joda.time.LocalTime localTime14 = property12.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime15 = property12.roundHalfFloorCopy();
        org.joda.time.LocalTime localTime17 = localTime15.minusMillis((int) ' ');
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(locale21);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withPeriodAdded(readablePeriod24, (int) '#');
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.minuteOfHour();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.minuteOfHour();
        boolean boolean31 = calendar22.after((java.lang.Object) localDateTime28);
        org.joda.time.Chronology chronology32 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.year();
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((long) (short) -1, chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.secondOfDay();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.year();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (short) 10, chronology38);
        org.joda.time.DateTime dateTime41 = dateTime39.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime44 = dateTime41.withField(dateTimeFieldType42, 2022);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withPeriodAdded(readablePeriod46, (int) '#');
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfDay();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.minuteOfHour();
        java.lang.Object obj52 = null;
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.Interval interval54 = new org.joda.time.Interval(obj52, chronology53);
        long long55 = interval54.toDurationMillis();
        org.joda.time.Period period56 = interval54.toPeriod();
        org.joda.time.LocalDateTime localDateTime57 = localDateTime50.minus((org.joda.time.ReadablePeriod) period56);
        org.joda.time.DateTime dateTime58 = dateTime41.minus((org.joda.time.ReadablePeriod) period56);
        java.lang.String str59 = period56.toString();
        int[] intArray62 = chronology32.get((org.joda.time.ReadablePeriod) period56, (long) 'a', 0L);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray64 = dateTimeField9.set((org.joda.time.ReadablePartial) localTime17, 32770, intArray62, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1644572889849,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=9,MILLISECOND=849,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + long55 + "' != '" + 0L + "'", long55 == 0L);
        org.junit.Assert.assertNotNull(period56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "PT0S" + "'", str59, "PT0S");
        org.junit.Assert.assertNotNull(intArray62);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[0, 0, 0, 0, 0, 0, 0, -97]");
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        long long3 = interval2.toDurationMillis();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        org.joda.time.DurationField durationField18 = chronology16.weeks();
        org.joda.time.Chronology chronology19 = chronology16.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight((java.lang.Object) interval2, chronology16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.Interval");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644572889873,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=9,MILLISECOND=873,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField18);
        org.junit.Assert.assertNotNull(chronology19);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        int[] intArray9 = localDateTime5.getValues();
        boolean boolean10 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        int int12 = dateTimeZone4.getOffsetFromLocal((long) 4);
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = dateTimeZone4.getName((long) 9, locale15);
        java.lang.String str17 = locale1.getDisplayLanguage(locale15);
        java.util.Locale.Builder builder18 = builder0.setLocale(locale15);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale19.getDisplayVariant(locale20);
        java.util.Locale.Builder builder23 = builder0.setLocale(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder0.setLanguageTag("0");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 15, 52809949]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 363120000 + "'", int12 == 363120000);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:52" + "'", str16, "+100:52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japanese" + "'", str17, "Japanese");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        long long3 = interval2.toDurationMillis();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Period period5 = interval2.toPeriod(periodType4);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYear(12);
        org.joda.time.Interval interval12 = new org.joda.time.Interval(readableDuration6, (org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusDays(1);
        org.joda.time.DateTime dateTime16 = localDateTime15.toDateTime();
        org.joda.time.DateTime dateTime17 = dateTime16.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime19 = dateTime17.plusSeconds((int) (short) -1);
        boolean boolean20 = interval12.isBefore((org.joda.time.ReadableInstant) dateTime17);
        boolean boolean21 = interval2.isBefore((org.joda.time.ReadableInterval) interval12);
        boolean boolean23 = interval12.isBefore((long) 86399999);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(period5);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + true + "'", boolean23 == true);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        java.util.Date date10 = localDate9.toDate();
        calendar2.setTime(date10);
        calendar2.setLenient(false);
        calendar2.set((-292275054), 32770, 28, 8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.fromCalendarFields(calendar2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: YEAR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=-292275054,MONTH=32770,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=28,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=8,MINUTE=1,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Tue Feb 15 00:00:00 UTC 2022");
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 86399999);
        org.joda.time.LocalTime localTime3 = localTime1.plusSeconds((int) (short) 100);
        org.joda.time.LocalTime.Property property4 = localTime3.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = property4.setCopy(363120000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 363120000 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property2.addToCopy((int) (short) 10);
        org.joda.time.LocalDate localDate5 = property2.getLocalDate();
        org.joda.time.LocalDate localDate7 = property2.addWrapFieldToCopy(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra((-1073453520));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1073453520 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        int[] intArray9 = localDateTime5.getValues();
        boolean boolean10 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        int int12 = dateTimeZone4.getOffsetFromLocal((long) 4);
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = dateTimeZone4.getName((long) 9, locale15);
        java.lang.String str17 = locale1.getDisplayLanguage(locale15);
        java.util.Locale.Builder builder18 = builder0.setLocale(locale15);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale19.getDisplayVariant(locale20);
        java.util.Locale.Builder builder23 = builder0.setLocale(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder25 = builder0.setLanguage("1970-005");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 1970-005 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 15, 52810595]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 363120000 + "'", int12 == 363120000);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:52" + "'", str16, "+100:52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japanese" + "'", str17, "Japanese");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime(1L, dateTimeZone4);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) 32769, dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(1L, dateTimeZone11);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 32769, dateTimeZone11);
        boolean boolean15 = dateTimeZone11.isStandardOffset((long) 2022);
        org.joda.time.DateTime dateTime16 = localTime6.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTime dateTime18 = dateTime16.minus(31536000000L);
        org.joda.time.DateTime.Property property19 = dateTime16.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime16.withMillisOfSecond(292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            calendar2.roll((int) (short) -1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("2022-02-15T14:40:00.081");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-15T14:40:00.081 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(3, 1970, (int) '#', 0, 13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.util.Locale locale8 = locale7.stripExtensions();
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale8);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.withPeriodAdded(readablePeriod11, (int) '#');
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.millisOfDay();
        org.joda.time.LocalDateTime localDateTime15 = property14.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property16 = localDateTime15.minuteOfHour();
        org.joda.time.LocalDateTime.Property property17 = localDateTime15.minuteOfHour();
        boolean boolean18 = calendar9.after((java.lang.Object) localDateTime15);
        org.joda.time.Chronology chronology19 = localDateTime15.getChronology();
        org.joda.time.DurationField durationField20 = chronology19.months();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long27 = dateTimeZone23.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.LocalDateTime localDateTime30 = new org.joda.time.LocalDateTime(0L, dateTimeZone29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        boolean boolean34 = localDateTime32.isSupported(dateTimeFieldType33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.minusMillis((int) (short) 10);
        boolean boolean37 = dateTimeZone23.isLocalDateTimeGap(localDateTime32);
        org.joda.time.LocalDateTime localDateTime39 = localDateTime32.plusMinutes((int) (short) 1);
        long long41 = chronology19.set((org.joda.time.ReadablePartial) localDateTime39, (long) 32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(15, 52814315, 16, 35268191, 10, 999, 52814315, chronology19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35268191 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1644572890888,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=10,MILLISECOND=888,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-327851809L) + "'", long27 == (-327851809L));
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + (-31172820000L) + "'", long41 == (-31172820000L));
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) calendar2, chronology16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean20 = calendar2.isSet(52);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644572890985,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=10,MILLISECOND=985,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.plusMillis((int) 'x');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.years();
        java.lang.String str9 = durationFieldType8.toString();
        org.joda.time.LocalDate localDate11 = localDate7.withFieldAdded(durationFieldType8, 900);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localTime3.compareTo((org.joda.time.ReadablePartial) localDate11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "years" + "'", str9, "years");
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = locale14.stripExtensions();
        int int16 = dateTimeField13.getMaximumTextLength(locale14);
        long long19 = dateTimeField13.set((long) (short) 10, 35268191);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime(0L, dateTimeZone21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.minusYears((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withPeriodAdded(readablePeriod26, (int) '#');
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfDay();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.minuteOfHour();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.minuteOfHour();
        boolean boolean33 = localDateTime24.isAfter((org.joda.time.ReadablePartial) localDateTime30);
        int[] intArray38 = new int[] { 142, (short) 1, 28, 2022 };
        int int39 = dateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localDateTime30, intArray38);
        java.util.Locale locale40 = java.util.Locale.KOREA;
        java.util.Locale locale41 = locale40.stripExtensions();
        java.util.Calendar calendar42 = java.util.Calendar.getInstance(locale41);
        org.joda.time.LocalDateTime localDateTime43 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod44 = null;
        org.joda.time.LocalDateTime localDateTime46 = localDateTime43.withPeriodAdded(readablePeriod44, (int) '#');
        org.joda.time.LocalDateTime.Property property47 = localDateTime46.millisOfDay();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.minuteOfHour();
        org.joda.time.LocalDateTime.Property property50 = localDateTime48.minuteOfHour();
        boolean boolean51 = calendar42.after((java.lang.Object) localDateTime48);
        org.joda.time.LocalDateTime localDateTime53 = localDateTime48.withYear(35268191);
        org.joda.time.DateTimeZone dateTimeZone57 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime58 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod59 = null;
        org.joda.time.LocalDateTime localDateTime61 = localDateTime58.withPeriodAdded(readablePeriod59, (int) '#');
        int[] intArray62 = localDateTime58.getValues();
        boolean boolean63 = dateTimeZone57.isLocalDateTimeGap(localDateTime58);
        org.joda.time.LocalDateTime.Property property64 = localDateTime58.millisOfDay();
        int int65 = property64.getMinimumValue();
        java.lang.String str66 = property64.getAsShortText();
        org.joda.time.LocalDateTime localDateTime67 = property64.withMaximumValue();
        int[] intArray68 = localDateTime67.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray70 = dateTimeField13.set((org.joda.time.ReadablePartial) localDateTime48, 35268191, intArray68, 52814315);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35268191");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572891038,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=11,MILLISECOND=38,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1112894443353600010L + "'", long19 == 1112894443353600010L);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(intArray38);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray38), "[142, 1, 28, 2022]");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + (-292275054) + "'", int39 == (-292275054));
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar42);
// flaky:         org.junit.Assert.assertEquals(calendar42.toString(), "java.util.GregorianCalendar[time=1644572891039,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=11,MILLISECOND=39,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(dateTimeZone57);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(intArray62);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray62), "[2022, 2, 15, 52811039]");
        org.junit.Assert.assertTrue("'" + boolean63 + "' != '" + false + "'", boolean63 == false);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str66 + "' != '" + "52811039" + "'", str66, "52811039");
        org.junit.Assert.assertNotNull(localDateTime67);
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[2022, 2, 15, 86399999]");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = org.joda.time.Interval.parse("1970-01-05T04:52");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Format requires a '/' separator: 1970-01-05T04:52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(readableDuration2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFieldAdded(durationFieldType4, 0);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.withDurationAdded(readableDuration7, 0);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.yearOfCentury();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusDays(1);
        org.joda.time.DateTime dateTime15 = localDateTime14.toDateTime();
        org.joda.time.DateTime dateTime16 = dateTime15.withEarlierOffsetAtOverlap();
        int int17 = dateTime15.getWeekyear();
        org.joda.time.DateTime.Property property18 = dateTime15.weekOfWeekyear();
        java.util.Locale locale20 = new java.util.Locale("");
        java.lang.String str21 = locale20.getDisplayLanguage();
        int int22 = property18.getMaximumShortTextLength(locale20);
        java.util.Set<java.lang.String> strSet23 = locale20.getUnicodeLocaleAttributes();
        java.util.Locale locale24 = locale20.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight25 = property10.setCopy("14:40:09.707", locale20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"14:40:09.707\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2 + "'", int22 == 2);
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "");
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        java.util.Date date10 = localDate9.toDate();
        calendar2.setTime(date10);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone16.toTimeZone();
        calendar2.setTimeZone(timeZone18);
        calendar2.set((int) (byte) 1, 20, 32769, 74, (int) 'x', 362);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean28 = calendar2.isSet((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=+100:52,offset=363120000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=20,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=32769,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=74,MINUTE=120,SECOND=362,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Tue Feb 15 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+:0:52");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("2022-02-15T14:40:01.488");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-15t14:40:01.488");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale3);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.minuteOfHour();
        boolean boolean13 = calendar4.after((java.lang.Object) localDateTime10);
        org.joda.time.Chronology chronology14 = localDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) -1, chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.centuryOfEra();
        org.joda.time.DateTimeField dateTimeField19 = chronology14.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField20 = chronology14.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((java.lang.Object) (-1.0d), chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1644572891298,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=11,MILLISECOND=298,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        org.joda.time.DurationField durationField14 = chronology12.weeks();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long21 = chronology12.getDateTimeMillis((long) 52807920, 32, 11, 52814315, 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572891348,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=11,MILLISECOND=348,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setLanguageTag("15 Feb 2022 14:40:04 GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 15 Feb 2022 14:40:04 GMT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = localDate1.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate localDate6 = localDate4.plusDays(1);
        java.lang.String str7 = localDate4.toString();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        org.joda.time.LocalDate localDate11 = localDate9.plusWeeks(6);
        boolean boolean12 = localDate4.isEqual((org.joda.time.ReadablePartial) localDate11);
        int int13 = localDate4.size();
        int int14 = localDate4.size();
        org.joda.time.LocalDate.Property property15 = localDate4.dayOfWeek();
        java.util.Locale locale17 = java.util.Locale.SIMPLIFIED_CHINESE;
        java.lang.String str18 = locale17.getISO3Language();
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("");
        java.lang.String str21 = locale17.getDisplayScript(locale20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = property15.setCopy("Feb 15, 2022 12:00:00 AM", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Feb 15, 2022 12:00:00 AM\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0100-02-15" + "'", str7, "0100-02-15");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 3 + "'", int14 == 3);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "zho" + "'", str18, "zho");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.minuteOfHour();
        boolean boolean13 = localDateTime4.isAfter((org.joda.time.ReadablePartial) localDateTime10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime10.withDayOfYear(1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecondFraction();
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        calendar2.setLenient(false);
        calendar2.setTimeInMillis((long) (-1));
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromCalendarFields(calendar2);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.add((int) (byte) 100, 20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) calendar2, chronology16);
        calendar2.setLenient(false);
        java.lang.Object obj21 = null;
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.Interval interval23 = new org.joda.time.Interval(obj21, chronology22);
        boolean boolean24 = interval23.containsNow();
        org.joda.time.DateTime dateTime25 = interval23.getStart();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusDays(1);
        org.joda.time.DateTime dateTime29 = localDateTime28.toDateTime();
        org.joda.time.DateMidnight dateMidnight30 = dateTime29.toDateMidnight();
        org.joda.time.DateMidnight.Property property31 = dateMidnight30.weekyear();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight30.withChronology(chronology32);
        boolean boolean34 = interval23.isBefore((org.joda.time.ReadableInstant) dateMidnight33);
        org.joda.time.DateTime dateTime35 = interval23.getStart();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter36 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter38 = dateTimeFormatter36.withPivotYear((int) '#');
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.util.Locale locale40 = locale39.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter41 = dateTimeFormatter38.withLocale(locale40);
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withPeriodAdded(readablePeriod46, (int) '#');
        int[] intArray49 = localDateTime45.getValues();
        boolean boolean50 = dateTimeZone44.isLocalDateTimeGap(localDateTime45);
        org.joda.time.DateMidnight dateMidnight51 = org.joda.time.DateMidnight.now(dateTimeZone44);
        java.lang.String str52 = dateTimeFormatter41.print((org.joda.time.ReadableInstant) dateMidnight51);
        java.util.Locale locale53 = dateTimeFormatter41.getLocale();
        java.util.Calendar calendar54 = dateTime35.toCalendar(locale53);
        int int55 = calendar2.compareTo(calendar54);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644572891766,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=11,MILLISECOND=766,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTimeFormatter36);
        org.junit.Assert.assertNotNull(dateTimeFormatter38);
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale40);
        org.junit.Assert.assertEquals(locale40.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(intArray49);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[2022, 2, 15, 52811766]");
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertNotNull(dateMidnight51);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "2022-046T00:00:00.000+100:52" + "'", str52, "2022-046T00:00:00.000+100:52");
        org.junit.Assert.assertNotNull(locale53);
        org.junit.Assert.assertEquals(locale53.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar54);
// flaky:         org.junit.Assert.assertEquals(calendar54.toString(), "java.util.GregorianCalendar[time=1644572891766,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=+100:52,offset=363120000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=2,HOUR_OF_DAY=14,MINUTE=40,SECOND=11,MILLISECOND=766,ZONE_OFFSET=363120000,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + (-1) + "'", int55 == (-1));
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(chronology12);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) 100);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.plusWeeks((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight16.minus(readableDuration19);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = locale22.stripExtensions();
        java.util.Calendar calendar24 = java.util.Calendar.getInstance(locale23);
        org.joda.time.LocalDateTime localDateTime25 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDateTime localDateTime28 = localDateTime25.withPeriodAdded(readablePeriod26, (int) '#');
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.millisOfDay();
        org.joda.time.LocalDateTime localDateTime30 = property29.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property31 = localDateTime30.minuteOfHour();
        org.joda.time.LocalDateTime.Property property32 = localDateTime30.minuteOfHour();
        boolean boolean33 = calendar24.after((java.lang.Object) localDateTime30);
        org.joda.time.Chronology chronology34 = localDateTime30.getChronology();
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (byte) 100, chronology34);
        java.lang.Object obj36 = null;
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.Interval interval38 = new org.joda.time.Interval(obj36, chronology37);
        long long39 = interval38.toDurationMillis();
        org.joda.time.Period period40 = interval38.toPeriod();
        java.lang.String str41 = period40.toString();
        long long44 = chronology34.add((org.joda.time.ReadablePeriod) period40, (long) (byte) 100, 0);
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight20.minus((org.joda.time.ReadablePeriod) period40);
        int[] intArray48 = chronology12.get((org.joda.time.ReadablePeriod) period40, (long) 47, 3801600000L);
        java.util.TimeZone timeZone52 = null;
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forTimeZone(timeZone52);
        org.joda.time.DateMidnight dateMidnight54 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone53);
        java.util.TimeZone timeZone55 = dateTimeZone53.toTimeZone();
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone53);
        org.joda.time.ReadableInstant readableInstant57 = null;
        int int58 = dateTimeZone53.getOffset(readableInstant57);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight59 = new org.joda.time.DateMidnight((java.lang.Object) chronology12, dateTimeZone53);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572891942,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=11,MILLISECOND=942,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar24);
// flaky:         org.junit.Assert.assertEquals(calendar24.toString(), "java.util.GregorianCalendar[time=1644572891942,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=11,MILLISECOND=942,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 0L + "'", long39 == 0L);
        org.junit.Assert.assertNotNull(period40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "PT0S" + "'", str41, "PT0S");
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 100L + "'", long44 == 100L);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertNotNull(intArray48);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray48), "[0, 1, 1, 5, 23, 59, 59, 953]");
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(timeZone55);
        org.junit.Assert.assertEquals(timeZone55.getDisplayName(), "GMT+:0:52");
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 363120000 + "'", int58 == 363120000);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        java.util.Date date10 = localDate9.toDate();
        calendar2.setTime(date10);
        // The following exception was thrown during execution in test generation
        try {
            calendar2.add(52810033, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644883200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Tue Feb 15 00:00:00 UTC 2022");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        java.lang.String str3 = localDateTime0.toString();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMonths((int) 'a');
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property6.setCopy((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-15T14:40:12.019" + "'", str3, "2022-02-15T14:40:12.019");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.Locale locale8 = java.util.Locale.KOREA;
        java.util.Locale locale9 = locale8.stripExtensions();
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.LocalDateTime localDateTime14 = localDateTime11.withPeriodAdded(readablePeriod12, (int) '#');
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.millisOfDay();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property17 = localDateTime16.minuteOfHour();
        org.joda.time.LocalDateTime.Property property18 = localDateTime16.minuteOfHour();
        boolean boolean19 = calendar10.after((java.lang.Object) localDateTime16);
        org.joda.time.Chronology chronology20 = localDateTime16.getChronology();
        org.joda.time.DateTimeField dateTimeField21 = chronology20.year();
        boolean boolean22 = dateTimeFieldType7.isSupported(chronology20);
        org.joda.time.DurationField durationField23 = chronology20.weekyears();
        org.joda.time.LocalDateTime localDateTime24 = org.joda.time.LocalDateTime.now(chronology20);
        org.joda.time.Interval interval25 = new org.joda.time.Interval((long) (short) 10, (long) 358, chronology20);
        org.joda.time.DateTimeField dateTimeField26 = chronology20.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(17520, (int) (byte) 0, 20, 69, 19, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 69 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1644572892095,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=12,MILLISECOND=95,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeField26);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        java.util.Date date10 = localDate9.toDate();
        calendar2.setTime(date10);
        date10.setDate(4);
        java.time.Instant instant14 = date10.toInstant();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644883200000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Fri Feb 04 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(instant14);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (short) -1);
        int int2 = localDate1.getYear();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        int int7 = calendar2.getMinimalDaysInFirstWeek();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(chronology8);
        java.util.Date date10 = localDate9.toDate();
        calendar2.setTime(date10);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone16);
        java.util.TimeZone timeZone18 = dateTimeZone16.toTimeZone();
        calendar2.setTimeZone(timeZone18);
        // The following exception was thrown during execution in test generation
        try {
            int int21 = calendar2.getGreatestMinimum(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32769");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644883200000,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=+100:52,offset=363120000,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=3,DAY_OF_MONTH=15,DAY_OF_YEAR=46,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(date10);
        org.junit.Assert.assertEquals(date10.toString(), "Tue Feb 15 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "GMT+:0:52");
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(52810033, 139);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52810033 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime3 = property2.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = property2.setCopy("09:47:58.517");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"09:47:58.517\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("fr");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '#');
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withLocale(locale4);
        java.util.Locale locale6 = dateTimeFormatter5.getLocale();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime(1L, dateTimeZone11);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) 32769, dateTimeZone11);
        boolean boolean15 = dateTimeZone11.isStandardOffset((long) 2022);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((java.lang.Object) locale6, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        calendar2.set((int) '#', (int) (byte) 0, 8, 2022, 0, 9);
        int int14 = calendar2.getMinimalDaysInFirstWeek();
        calendar2.setLenient(true);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withPeriodAdded(readablePeriod23, (int) '#');
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.minuteOfHour();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.minuteOfHour();
        boolean boolean30 = calendar21.after((java.lang.Object) localDateTime27);
        org.joda.time.Chronology chronology31 = localDateTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.weekOfWeekyear();
        long long35 = dateTimeField32.getDifferenceAsLong((long) (byte) 0, (long) (-1));
        java.lang.String str36 = dateTimeField32.toString();
        boolean boolean37 = dateTimeField32.isSupported();
        org.joda.time.DateTimeZone dateTimeZone40 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime41 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod42 = null;
        org.joda.time.LocalDateTime localDateTime44 = localDateTime41.withPeriodAdded(readablePeriod42, (int) '#');
        int[] intArray45 = localDateTime41.getValues();
        boolean boolean46 = dateTimeZone40.isLocalDateTimeGap(localDateTime41);
        org.joda.time.LocalDateTime.Property property47 = localDateTime41.millisOfDay();
        org.joda.time.LocalDateTime localDateTime48 = property47.roundHalfCeilingCopy();
        int int49 = localDateTime48.getYearOfEra();
        org.joda.time.LocalDateTime localDateTime51 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime53 = localDateTime51.plusDays(1);
        org.joda.time.DateTime dateTime54 = localDateTime53.toDateTime();
        org.joda.time.DateTime dateTime55 = dateTime54.withEarlierOffsetAtOverlap();
        int int56 = dateTime54.getWeekyear();
        org.joda.time.DateTime.Property property57 = dateTime54.weekOfWeekyear();
        java.util.Locale locale59 = new java.util.Locale("");
        java.lang.String str60 = locale59.getDisplayLanguage();
        int int61 = property57.getMaximumShortTextLength(locale59);
        java.lang.String str62 = dateTimeField32.getAsText((org.joda.time.ReadablePartial) localDateTime48, 8, locale59);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str63 = calendar2.getDisplayName((int) 'u', 32770, locale59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=35,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=8,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=2022,MINUTE=0,SECOND=9,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1644572892684,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=12,MILLISECOND=684,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 0L + "'", long35 == 0L);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "DateTimeField[weekOfWeekyear]" + "'", str36, "DateTimeField[weekOfWeekyear]");
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(intArray45);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[2022, 2, 15, 52812684]");
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2022 + "'", int49 == 2022);
        org.junit.Assert.assertNotNull(localDateTime51);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2022 + "'", int56 == 2022);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 2 + "'", int61 == 2);
        org.junit.Assert.assertEquals("'" + str62 + "' != '" + "8" + "'", str62, "8");
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.tz.NameProvider nameProvider0 = null;
        org.joda.time.DateTimeZone.setNameProvider(nameProvider0);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusDays(1);
        org.joda.time.DateTime dateTime6 = localDateTime5.toDateTime();
        org.joda.time.DateTime dateTime7 = dateTime6.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime7.withWeekOfWeekyear(12);
        org.joda.time.DateTime dateTime11 = dateTime7.minusMonths(358);
        org.joda.time.DateTime dateTime13 = dateTime11.minusMonths((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval14 = interval2.withEnd((org.joda.time.ReadableInstant) dateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.now(dateTimeZone0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(chronology2);
        org.joda.time.LocalDate.Property property4 = localDate3.weekyear();
        org.joda.time.LocalDate localDate6 = localDate3.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate.Property property7 = localDate6.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.dayOfMonth();
        int int9 = localDate6.get(dateTimeFieldType8);
        org.joda.time.LocalDate localDate11 = localDate6.minusMonths(363120000);
        org.joda.time.LocalDate localDate13 = localDate11.withWeekyear((int) (short) 1);
        org.joda.time.LocalDate localDate15 = localDate13.plusYears(70);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localTime1.compareTo((org.joda.time.ReadablePartial) localDate15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 15 + "'", int9 == 15);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DateMidnight.Property property5 = dateMidnight4.weekyear();
        org.joda.time.DateMidnight dateMidnight7 = property5.addToCopy((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.withDayOfMonth(72);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 72 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateMidnight7);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("2022-02-15T14:40:01.707");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-15t14:40:01.707");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTime(0, 1, 12, 6);
        org.joda.time.DateTime.Property property10 = dateTime4.minuteOfHour();
        org.joda.time.DateTime.Property property11 = dateTime4.weekOfWeekyear();
        org.joda.time.DateTime dateTime13 = dateTime4.withMillisOfDay(35268191);
        org.joda.time.DateTime.Property property14 = dateTime13.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime13.withWeekOfWeekyear(86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime3.minus(readableDuration7);
        boolean boolean9 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        java.util.Locale locale12 = new java.util.Locale("");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = dateTimeZone2.getShortName((long) 9, locale12);
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.plus(readableDuration17);
        org.joda.time.DurationFieldType durationFieldType19 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight16.withFieldAdded(durationFieldType19, 0);
        org.joda.time.DateMidnight.Property property22 = dateMidnight21.weekyear();
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.plusDays(35268191);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.withWeekyear(20);
        boolean boolean27 = locale12.equals((java.lang.Object) 20);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+100:52" + "'", str14, "+100:52");
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(durationFieldType19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 1);
        int int5 = localDateTime4.getEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusSeconds(5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology8);
        java.lang.String str10 = localTime9.toString();
        org.joda.time.LocalTime.Property property11 = localTime9.millisOfDay();
        org.joda.time.LocalTime localTime13 = property11.addWrapFieldToCopy(35268191);
        org.joda.time.LocalTime localTime14 = property11.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = localDateTime7.isBefore((org.joda.time.ReadablePartial) localTime14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "14:40:13.323" + "'", str10, "14:40:13.323");
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime14);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(2, (int) '4', 48, 1, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusMillis((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withYearOfEra((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withHourOfDay(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("Japanese", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Japanese\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusWeeks(1);
        int int13 = localDateTime12.getWeekOfWeekyear();
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.now(dateTimeZone15);
        org.joda.time.LocalTime localTime18 = localTime16.plusHours((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52813510]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 6 + "'", int13 == 6);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.yearOfEra();
        int int5 = localDate3.get(dateTimeFieldType4);
        int int6 = localDate1.compareTo((org.joda.time.ReadablePartial) localDate3);
        org.joda.time.LocalDate.Property property7 = localDate1.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = localDate1.withMonthOfYear(15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.set((int) '#', 16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight((int) (byte) 1, 12, 10, dateTimeZone11);
        java.util.TimeZone timeZone13 = dateTimeZone11.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((int) (byte) 10, 52, 52, (-292275054), 4, 100, 32770, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "GMT+:0:52");
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime4 = property2.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime5 = property2.roundCeilingCopy();
        org.joda.time.LocalTime localTime6 = property2.roundCeilingCopy();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = dateTimeFormatter8.withPivotYear((int) '#');
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = locale11.stripExtensions();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter13 = dateTimeFormatter10.withLocale(locale12);
        java.util.Locale locale14 = dateTimeFormatter13.getLocale();
        java.util.Set<java.lang.String> strSet15 = locale14.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = property2.setCopy("15 Feb 2022 14:40:13 GMT", locale14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"15 Feb 2022 14:40:13 GMT\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(dateTimeFormatter13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(strSet15);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 1);
        int int5 = localDateTime4.getEra();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.plusSeconds(5);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfCentury();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(chronology9);
        org.joda.time.LocalTime.Property property11 = localTime10.minuteOfHour();
        org.joda.time.LocalTime localTime12 = property11.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDateTime7.compareTo((org.joda.time.ReadablePartial) localTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime12);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTime(0, 1, 12, 6);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        int int11 = dateTime4.get(dateTimeFieldType10);
        org.joda.time.DateTime.Property property12 = dateTime4.year();
        org.joda.time.DateTime dateTime13 = property12.roundHalfEvenCopy();
        java.lang.String str14 = property12.getAsText();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2 + "'", int11 == 2);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022" + "'", str14, "2022");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        int int5 = dateTime3.getWeekyear();
        org.joda.time.DateTime.Property property6 = dateTime3.weekOfWeekyear();
        java.util.Locale locale8 = new java.util.Locale("");
        java.lang.String str9 = locale8.getDisplayLanguage();
        int int10 = property6.getMaximumShortTextLength(locale8);
        org.joda.time.DateTime dateTime11 = property6.withMinimumValue();
        java.lang.String str12 = dateTime11.toString();
        org.joda.time.DateTime dateTime14 = dateTime11.withYearOfCentury(0);
        org.joda.time.DateTime.Property property15 = dateTime11.monthOfYear();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2 + "'", int10 == 2);
        org.junit.Assert.assertNotNull(dateTime11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022-01-05T14:40:14.173+100:52" + "'", str12, "2022-01-05T14:40:14.173+100:52");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(69, 70, 69, 17520000, 0, 28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17520000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(readableDuration2);
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.weekOfWeekyear();
        long long20 = dateTimeField17.getDifferenceAsLong((long) (byte) 0, (long) (-1));
        java.lang.String str21 = dateTimeField17.toString();
        boolean boolean22 = dateTimeField17.isSupported();
        int int23 = dateMidnight3.get(dateTimeField17);
        int int25 = dateTimeField17.getMinimumValue((long) (byte) -1);
        java.lang.String str27 = dateTimeField17.getAsShortText(0L);
        // The following exception was thrown during execution in test generation
        try {
            long long30 = dateTimeField17.set((long) 999, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644572894398,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=14,MILLISECOND=398,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "DateTimeField[weekOfWeekyear]" + "'", str21, "DateTimeField[weekOfWeekyear]");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 1 + "'", int25 == 1);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "1" + "'", str27, "1");
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.months();
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(chronology12);
        int int15 = dateMidnight14.getWeekyear();
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight14.minus((long) 14);
        int int18 = dateMidnight14.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight20 = dateMidnight14.withEra(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572894412,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=14,MILLISECOND=412,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.JAPAN;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        int[] intArray9 = localDateTime5.getValues();
        boolean boolean10 = dateTimeZone4.isLocalDateTimeGap(localDateTime5);
        int int12 = dateTimeZone4.getOffsetFromLocal((long) 4);
        java.util.Locale locale15 = new java.util.Locale("");
        java.lang.String str16 = dateTimeZone4.getName((long) 9, locale15);
        java.lang.String str17 = locale1.getDisplayLanguage(locale15);
        java.util.Locale.Builder builder18 = builder0.setLocale(locale15);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.lang.String str22 = locale19.getDisplayVariant(locale20);
        java.util.Locale.Builder builder23 = builder0.setLocale(locale19);
        java.util.Locale.Builder builder24 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder26 = builder0.addUnicodeLocaleAttribute("2022-01-05T14:40:05.029+100:52");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-01-05T14:40:05.029+100:52 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(intArray9);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[2022, 2, 15, 52814574]");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 363120000 + "'", int12 == 363120000);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "+100:52" + "'", str16, "+100:52");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Japanese" + "'", str17, "Japanese");
        org.junit.Assert.assertNotNull(builder18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertNotNull(builder23);
        org.junit.Assert.assertNotNull(builder24);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withPeriodAdded(readablePeriod1, (int) '#');
        int[] intArray4 = localDateTime0.getValues();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusMonths((int) (short) 1);
        org.joda.time.DateTime dateTime7 = localDateTime0.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime0.minusYears((-1073453520));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1073455542 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[2022, 2, 15, 52814608]");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = locale3.stripExtensions();
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withPeriodAdded(readablePeriod7, (int) '#');
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.millisOfDay();
        org.joda.time.LocalDateTime localDateTime11 = property10.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.minuteOfHour();
        org.joda.time.LocalDateTime.Property property13 = localDateTime11.minuteOfHour();
        boolean boolean14 = calendar5.after((java.lang.Object) localDateTime11);
        org.joda.time.Chronology chronology15 = localDateTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.year();
        org.joda.time.DateTimeField dateTimeField17 = chronology15.minuteOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology15.halfdayOfDay();
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField20 = chronology15.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(17520, 46, 72, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 46 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644572894708,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=14,MILLISECOND=708,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTime(0, 1, 12, 6);
        org.joda.time.DateTime.Property property10 = dateTime4.minuteOfHour();
        org.joda.time.DateTime.Property property11 = dateTime4.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfDay();
        org.joda.time.DateTime dateTime14 = dateTime4.withField(dateTimeFieldType12, 86399999);
        org.joda.time.DateTime.Property property15 = dateTime4.dayOfWeek();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (byte) 100, chronology13);
        java.lang.Object obj15 = null;
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.Interval interval17 = new org.joda.time.Interval(obj15, chronology16);
        long long18 = interval17.toDurationMillis();
        org.joda.time.Period period19 = interval17.toPeriod();
        java.lang.String str20 = period19.toString();
        long long23 = chronology13.add((org.joda.time.ReadablePeriod) period19, (long) (byte) 100, 0);
        long long29 = chronology13.getDateTimeMillis((long) 35268191, (int) (byte) 1, 20, (int) (byte) 0, 42);
        java.lang.String str30 = chronology13.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime((java.lang.Object) str30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"ISOChronology[UTC]\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644572894788,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=14,MILLISECOND=788,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "PT0S" + "'", str20, "PT0S");
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 100L + "'", long23 == 100L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 4800042L + "'", long29 == 4800042L);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ISOChronology[UTC]" + "'", str30, "ISOChronology[UTC]");
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.eras();
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.util.Locale locale6 = locale5.stripExtensions();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(locale6);
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod9 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime8.withPeriodAdded(readablePeriod9, (int) '#');
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.millisOfDay();
        org.joda.time.LocalDateTime localDateTime13 = property12.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property14 = localDateTime13.minuteOfHour();
        org.joda.time.LocalDateTime.Property property15 = localDateTime13.minuteOfHour();
        boolean boolean16 = calendar7.after((java.lang.Object) localDateTime13);
        org.joda.time.Chronology chronology17 = localDateTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.weekOfWeekyear();
        org.joda.time.DurationField durationField19 = chronology17.weeks();
        boolean boolean20 = durationFieldType4.isSupported(chronology17);
        org.joda.time.DateTimeField dateTimeField21 = chronology17.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(35268191, 8, 39, 32770, chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35268191 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1644572894803,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=14,MILLISECOND=803,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.LocalDateTime.Property property9 = localDateTime3.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundHalfFloorCopy();
        java.util.Date date11 = localDateTime10.toDate();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromDateFields(date11);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 10, chronology14);
        java.util.Date date16 = dateTime15.toDate();
        int int17 = date16.getTimezoneOffset();
        int int18 = date16.getDate();
        boolean boolean19 = date11.after(date16);
        java.util.Date date20 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int21 = date11.compareTo(date20);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52814844]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(date11);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Tue Feb 15 14:40:14 UTC 2022");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinute();
        java.lang.String str2 = dateTimeFormatter0.print((long) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long9 = dateTimeZone5.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(0L, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        boolean boolean16 = localDateTime14.isSupported(dateTimeFieldType15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusMillis((int) (short) 10);
        boolean boolean19 = dateTimeZone5.isLocalDateTimeGap(localDateTime14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((java.lang.Object) dateTimeFormatter0, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.format.DateTimeFormatter");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-05T04:52" + "'", str2, "1970-01-05T04:52");
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long9 + "' != '" + (-327851809L) + "'", long9 == (-327851809L));
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        org.joda.time.LocalTime.Property property2 = localTime1.minuteOfHour();
        org.joda.time.LocalTime localTime3 = property2.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime3.withHourOfDay(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        java.util.Date date1 = new java.util.Date((long) 2);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.LocalTime.Property property4 = localTime3.minuteOfHour();
        org.joda.time.LocalTime localTime6 = property4.addCopy((int) (short) 100);
        org.joda.time.LocalTime localTime7 = property4.roundCeilingCopy();
        org.joda.time.LocalTime localTime9 = localTime7.plusMillis((int) (byte) 1);
        org.joda.time.LocalTime.Property property10 = localTime7.hourOfDay();
        boolean boolean11 = date1.equals((java.lang.Object) localTime7);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfDay();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Locale locale3 = locale2.stripExtensions();
        java.util.Calendar calendar4 = java.util.Calendar.getInstance(locale3);
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime5.withPeriodAdded(readablePeriod6, (int) '#');
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.millisOfDay();
        org.joda.time.LocalDateTime localDateTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.minuteOfHour();
        org.joda.time.LocalDateTime.Property property12 = localDateTime10.minuteOfHour();
        boolean boolean13 = calendar4.after((java.lang.Object) localDateTime10);
        org.joda.time.Chronology chronology14 = localDateTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = chronology14.year();
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) -1, chronology14);
        org.joda.time.DateTimeField dateTimeField17 = chronology14.secondOfDay();
        org.joda.time.DateTimeField dateTimeField18 = chronology14.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval19 = new org.joda.time.Interval((java.lang.Object) dateTimeFieldType0, chronology14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=1644572895010,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=15,MILLISECOND=10,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDate();
        org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronolgy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = dateTimeFormatter0.parseLocalDateTime("52804398");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Cannot parse \"52804398\": Value 43 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(chronology1);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(0, 53, 74, (-292275054), 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(chronology0);
        java.lang.String str2 = localTime1.toString();
        org.joda.time.LocalTime.Property property3 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime4 = property3.roundFloorCopy();
        java.lang.String str5 = property3.getName();
        org.joda.time.DateTimeField dateTimeField6 = property3.getField();
        java.util.Locale locale7 = null;
        int int8 = dateTimeField6.getMaximumShortTextLength(locale7);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeField6.set((long) 20, "centuryOfEra");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"centuryOfEra\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "14:40:15.507" + "'", str2, "14:40:15.507");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "millisOfDay" + "'", str5, "millisOfDay");
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 8 + "'", int8 == 8);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        int[] intArray7 = localDateTime3.getValues();
        boolean boolean8 = dateTimeZone2.isLocalDateTimeGap(localDateTime3);
        org.joda.time.DateMidnight dateMidnight9 = org.joda.time.DateMidnight.now(dateTimeZone2);
        org.joda.time.DateMidnight.Property property10 = dateMidnight9.yearOfCentury();
        java.lang.Object obj11 = null;
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.Interval interval13 = new org.joda.time.Interval(obj11, chronology12);
        long long14 = interval13.toDurationMillis();
        org.joda.time.Period period15 = interval13.toPeriod();
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight9.plus((org.joda.time.ReadablePeriod) period15);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusDays(1);
        org.joda.time.DateTime dateTime20 = localDateTime19.toDateTime();
        int int21 = localDateTime19.getMillisOfSecond();
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.yearOfCentury();
        int int23 = localDateTime19.indexOf(dateTimeFieldType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight25 = dateMidnight9.withField(dateTimeFieldType22, 292);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(intArray7);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray7), "[2022, 2, 15, 52815518]");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertNotNull(period15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
// flaky:         org.junit.Assert.assertTrue("'" + int21 + "' != '" + 518 + "'", int21 == 518);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + (-1) + "'", int23 == (-1));
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.weekOfWeekyear();
        int int15 = dateTimeField13.get((long) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime(0L, dateTimeZone17);
        int int19 = localDateTime18.getWeekOfWeekyear();
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(locale21);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withPeriodAdded(readablePeriod24, (int) '#');
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.minuteOfHour();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.minuteOfHour();
        boolean boolean31 = calendar22.after((java.lang.Object) localDateTime28);
        org.joda.time.Chronology chronology32 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.year();
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.util.Locale locale35 = locale34.stripExtensions();
        int int36 = dateTimeField33.getMaximumTextLength(locale34);
        long long39 = dateTimeField33.set((long) (short) 10, 35268191);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime(0L, dateTimeZone41);
        org.joda.time.LocalDateTime localDateTime44 = localDateTime42.minusYears((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withPeriodAdded(readablePeriod46, (int) '#');
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfDay();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.minuteOfHour();
        org.joda.time.LocalDateTime.Property property52 = localDateTime50.minuteOfHour();
        boolean boolean53 = localDateTime44.isAfter((org.joda.time.ReadablePartial) localDateTime50);
        int[] intArray58 = new int[] { 142, (short) 1, 28, 2022 };
        int int59 = dateTimeField33.getMinimumValue((org.joda.time.ReadablePartial) localDateTime50, intArray58);
        int int60 = dateTimeField13.getMaximumValue((org.joda.time.ReadablePartial) localDateTime18, intArray58);
        org.joda.time.LocalDateTime localDateTime61 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime63 = localDateTime61.plusDays(1);
        org.joda.time.DateTime dateTime64 = localDateTime63.toDateTime();
        org.joda.time.DateTime dateTime65 = dateTime64.withEarlierOffsetAtOverlap();
        int int66 = dateTime64.getWeekyear();
        org.joda.time.DateTime.Property property67 = dateTime64.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.DateTime.Property property69 = dateTime64.property(dateTimeFieldType68);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime71 = localDateTime18.withField(dateTimeFieldType68, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572895562,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=15,MILLISECOND=562,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2 + "'", int19 == 2);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1644572895562,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=15,MILLISECOND=562,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 9 + "'", int36 == 9);
        org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1112894443353600010L + "'", long39 == 1112894443353600010L);
        org.junit.Assert.assertNotNull(localDateTime44);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[142, 1, 28, 2022]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + (-292275054) + "'", int59 == (-292275054));
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 53 + "'", int60 == 53);
        org.junit.Assert.assertNotNull(localDateTime61);
        org.junit.Assert.assertNotNull(localDateTime63);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertNotNull(dateTime65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2022 + "'", int66 == 2022);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertNotNull(property69);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime9 = dateTime4.withTime(0, 1, 12, 6);
        org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear((int) (byte) 10);
        org.joda.time.DateTime dateTime13 = dateTime11.withMillisOfDay(7);
        org.joda.time.DateTime.Property property14 = dateTime11.weekOfWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime11.minusMonths(69);
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfDay();
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = locale1.stripExtensions();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale2);
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withPeriodAdded(readablePeriod5, (int) '#');
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.minuteOfHour();
        org.joda.time.LocalDateTime.Property property11 = localDateTime9.minuteOfHour();
        boolean boolean12 = calendar3.after((java.lang.Object) localDateTime9);
        org.joda.time.Chronology chronology13 = localDateTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = chronology13.year();
        boolean boolean15 = dateTimeFieldType0.isSupported(chronology13);
        org.joda.time.DurationField durationField16 = chronology13.weekyears();
        org.joda.time.DateTimeField dateTimeField17 = chronology13.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField17.set((long) 139, "14:40:01.081");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"14:40:01.081\" for hourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1644572895671,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=15,MILLISECOND=671,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.withPeriodAdded(readablePeriod4, (int) '#');
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfDay();
        org.joda.time.LocalDateTime localDateTime8 = property7.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property9 = localDateTime8.minuteOfHour();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.minuteOfHour();
        boolean boolean11 = calendar2.after((java.lang.Object) localDateTime8);
        org.joda.time.Chronology chronology12 = localDateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = chronology12.year();
        org.joda.time.DurationField durationField14 = chronology12.hours();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(chronology12);
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean20 = localDateTime16.isSupported(dateTimeFieldType19);
        boolean boolean22 = localDateTime16.equals((java.lang.Object) 10.0f);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime16.minusYears(32769);
        org.joda.time.LocalDateTime localDateTime26 = localDateTime16.plusYears((-1));
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.util.Locale locale29 = locale28.stripExtensions();
        java.util.Calendar calendar30 = java.util.Calendar.getInstance(locale29);
        org.joda.time.LocalDateTime localDateTime31 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.LocalDateTime localDateTime34 = localDateTime31.withPeriodAdded(readablePeriod32, (int) '#');
        org.joda.time.LocalDateTime.Property property35 = localDateTime34.millisOfDay();
        org.joda.time.LocalDateTime localDateTime36 = property35.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property37 = localDateTime36.minuteOfHour();
        org.joda.time.LocalDateTime.Property property38 = localDateTime36.minuteOfHour();
        boolean boolean39 = calendar30.after((java.lang.Object) localDateTime36);
        org.joda.time.Chronology chronology40 = localDateTime36.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.year();
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((long) (short) -1, chronology40);
        org.joda.time.DateTimeField dateTimeField43 = chronology40.secondOfDay();
        org.joda.time.DateTimeField dateTimeField44 = chronology40.year();
        org.joda.time.Chronology chronology46 = null;
        org.joda.time.DateTime dateTime47 = new org.joda.time.DateTime((long) (short) 10, chronology46);
        org.joda.time.DateTime dateTime49 = dateTime47.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime52 = dateTime49.withField(dateTimeFieldType50, 2022);
        org.joda.time.LocalDateTime localDateTime53 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod54 = null;
        org.joda.time.LocalDateTime localDateTime56 = localDateTime53.withPeriodAdded(readablePeriod54, (int) '#');
        org.joda.time.LocalDateTime.Property property57 = localDateTime56.millisOfDay();
        org.joda.time.LocalDateTime localDateTime58 = property57.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property59 = localDateTime58.minuteOfHour();
        java.lang.Object obj60 = null;
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.Interval interval62 = new org.joda.time.Interval(obj60, chronology61);
        long long63 = interval62.toDurationMillis();
        org.joda.time.Period period64 = interval62.toPeriod();
        org.joda.time.LocalDateTime localDateTime65 = localDateTime58.minus((org.joda.time.ReadablePeriod) period64);
        org.joda.time.DateTime dateTime66 = dateTime49.minus((org.joda.time.ReadablePeriod) period64);
        java.lang.String str67 = period64.toString();
        int[] intArray70 = chronology40.get((org.joda.time.ReadablePeriod) period64, (long) 'a', 0L);
        // The following exception was thrown during execution in test generation
        try {
            chronology12.validate((org.joda.time.ReadablePartial) localDateTime16, intArray70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1644572895687,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=15,MILLISECOND=687,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar30);
// flaky:         org.junit.Assert.assertEquals(calendar30.toString(), "java.util.GregorianCalendar[time=1644572895687,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=15,MILLISECOND=687,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime31);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(dateTime49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(localDateTime53);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 0L + "'", long63 == 0L);
        org.junit.Assert.assertNotNull(period64);
        org.junit.Assert.assertNotNull(localDateTime65);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "PT0S" + "'", str67, "PT0S");
        org.junit.Assert.assertNotNull(intArray70);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray70), "[0, 0, 0, 0, 0, 0, 0, -97]");
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        java.util.Date date3 = dateTime2.toDate();
        org.joda.time.DateTime dateTime5 = dateTime2.withYearOfEra(1);
        org.joda.time.DateTime dateTime7 = dateTime5.withDayOfMonth(12);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillis((long) 32);
        org.joda.time.DateTime dateTime11 = dateTime7.withYearOfEra(1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime11.withTime((int) 'x', 52, (int) (byte) 100, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 10, chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYear(12);
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays(1);
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateMidnight dateMidnight11 = dateTime10.toDateMidnight();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DurationField durationField14 = durationFieldType12.getField(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.withFieldAdded(durationFieldType12, 35268191);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean21 = localDateTime17.isSupported(dateTimeFieldType20);
        org.joda.time.DateMidnight.Property property22 = dateMidnight16.property(dateTimeFieldType20);
        org.joda.time.DateTime.Property property23 = dateTime5.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = dateTimeField24.getAsText(122, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 122");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = null;
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusMillis((int) (short) 10);
        int int9 = localDateTime4.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime(0L, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = null;
        boolean boolean16 = localDateTime14.isSupported(dateTimeFieldType15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.minusMillis((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusDays(1);
        org.joda.time.DateTime dateTime22 = localDateTime21.toDateTime();
        org.joda.time.DateMidnight dateMidnight23 = dateTime22.toDateMidnight();
        org.joda.time.DateMidnight.Property property24 = dateMidnight23.weekyear();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight23.withChronology(chronology25);
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod31 = null;
        org.joda.time.LocalDateTime localDateTime33 = localDateTime30.withPeriodAdded(readablePeriod31, (int) '#');
        int[] intArray34 = localDateTime30.getValues();
        boolean boolean35 = dateTimeZone29.isLocalDateTimeGap(localDateTime30);
        org.joda.time.LocalDateTime.Property property36 = localDateTime30.millisOfDay();
        org.joda.time.LocalDateTime localDateTime37 = property36.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = property36.getFieldType();
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight23.withField(dateTimeFieldType38, (int) (short) 10);
        org.joda.time.DateTime dateTime41 = localDateTime18.toDateTime((org.joda.time.ReadableInstant) dateMidnight40);
        org.joda.time.LocalDateTime localDateTime42 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod43 = null;
        org.joda.time.LocalDateTime localDateTime45 = localDateTime42.withPeriodAdded(readablePeriod43, (int) '#');
        org.joda.time.LocalDateTime.Property property46 = localDateTime45.millisOfDay();
        org.joda.time.LocalDateTime localDateTime47 = property46.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property48 = localDateTime47.minuteOfHour();
        java.lang.Object obj49 = null;
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.Interval interval51 = new org.joda.time.Interval(obj49, chronology50);
        long long52 = interval51.toDurationMillis();
        org.joda.time.Period period53 = interval51.toPeriod();
        org.joda.time.LocalDateTime localDateTime54 = localDateTime47.minus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight40.minus((org.joda.time.ReadablePeriod) period53);
        org.joda.time.LocalDateTime localDateTime56 = localDateTime4.plus((org.joda.time.ReadablePeriod) period53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime58 = localDateTime4.withMinuteOfHour(86399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 86399999 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 69 + "'", int9 == 69);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(intArray34);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[2022, 2, 15, 52816039]");
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localDateTime42);
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(property46);
        org.junit.Assert.assertNotNull(localDateTime47);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertTrue("'" + long52 + "' != '" + 0L + "'", long52 == 0L);
        org.junit.Assert.assertNotNull(period53);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertNotNull(localDateTime56);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime dateTime1 = dateTime0.toDateTimeISO();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(0L, dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        boolean boolean8 = localDateTime6.isSupported(dateTimeFieldType7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.minusMillis((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusDays(1);
        org.joda.time.DateTime dateTime14 = localDateTime13.toDateTime();
        org.joda.time.DateMidnight dateMidnight15 = dateTime14.toDateMidnight();
        org.joda.time.DateMidnight.Property property16 = dateMidnight15.weekyear();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight15.withChronology(chronology17);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withPeriodAdded(readablePeriod23, (int) '#');
        int[] intArray26 = localDateTime22.getValues();
        boolean boolean27 = dateTimeZone21.isLocalDateTimeGap(localDateTime22);
        org.joda.time.LocalDateTime.Property property28 = localDateTime22.millisOfDay();
        org.joda.time.LocalDateTime localDateTime29 = property28.roundHalfCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property28.getFieldType();
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight15.withField(dateTimeFieldType30, (int) (short) 10);
        org.joda.time.DateTime dateTime33 = localDateTime10.toDateTime((org.joda.time.ReadableInstant) dateMidnight32);
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDateTime localDateTime37 = localDateTime34.withPeriodAdded(readablePeriod35, (int) '#');
        org.joda.time.LocalDateTime.Property property38 = localDateTime37.millisOfDay();
        org.joda.time.LocalDateTime localDateTime39 = property38.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.minuteOfHour();
        java.lang.Object obj41 = null;
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.Interval interval43 = new org.joda.time.Interval(obj41, chronology42);
        long long44 = interval43.toDurationMillis();
        org.joda.time.Period period45 = interval43.toPeriod();
        org.joda.time.LocalDateTime localDateTime46 = localDateTime39.minus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight32.minus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.DateTime dateTime48 = dateTime1.minus((org.joda.time.ReadablePeriod) period45);
        boolean boolean50 = dateTime1.isBefore(86400000L);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(intArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[2022, 2, 15, 52816072]");
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 0L + "'", long44 == 0L);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(localDateTime46);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = locale4.stripExtensions();
        java.util.Calendar calendar6 = java.util.Calendar.getInstance(locale5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod8 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withPeriodAdded(readablePeriod8, (int) '#');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfDay();
        org.joda.time.LocalDateTime localDateTime12 = property11.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.minuteOfHour();
        org.joda.time.LocalDateTime.Property property14 = localDateTime12.minuteOfHour();
        boolean boolean15 = calendar6.after((java.lang.Object) localDateTime12);
        org.joda.time.Chronology chronology16 = localDateTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField17 = chronology16.year();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) calendar2, chronology16);
        org.joda.time.DurationField durationField19 = chronology16.weeks();
        org.joda.time.DateTimeField dateTimeField20 = chronology16.clockhourOfHalfday();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar6);
// flaky:         org.junit.Assert.assertEquals(calendar6.toString(), "java.util.GregorianCalendar[time=1644572896158,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=16,MILLISECOND=158,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(0, 17520010, (int) (short) 1, 0, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17520010 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.fromCalendarFields(calendar2);
        int int8 = calendar2.getWeekYear();
        calendar2.setFirstDayOfWeek((-292275054));
        // The following exception was thrown during execution in test generation
        try {
            int int12 = calendar2.getMaximum((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=-292275054,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 10, chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYear(12);
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.LocalDateTime localDateTime7 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusDays(1);
        org.joda.time.DateTime dateTime10 = localDateTime9.toDateTime();
        org.joda.time.DateMidnight dateMidnight11 = dateTime10.toDateMidnight();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.months();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DurationField durationField14 = durationFieldType12.getField(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight11.withFieldAdded(durationFieldType12, 35268191);
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean21 = localDateTime17.isSupported(dateTimeFieldType20);
        org.joda.time.DateMidnight.Property property22 = dateMidnight16.property(dateTimeFieldType20);
        org.joda.time.DateTime.Property property23 = dateTime5.property(dateTimeFieldType20);
        org.joda.time.DateTimeField dateTimeField24 = property23.getField();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(0L, dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.minusYears((int) (short) 1);
        int int30 = localDateTime27.getYearOfCentury();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime27.plusYears(8);
        int[] intArray33 = localDateTime32.getValues();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Locale locale36 = locale35.stripExtensions();
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(locale36);
        org.joda.time.LocalDateTime localDateTime38 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime38.withPeriodAdded(readablePeriod39, (int) '#');
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfDay();
        org.joda.time.LocalDateTime localDateTime43 = property42.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property44 = localDateTime43.minuteOfHour();
        org.joda.time.LocalDateTime.Property property45 = localDateTime43.minuteOfHour();
        boolean boolean46 = calendar37.after((java.lang.Object) localDateTime43);
        org.joda.time.Chronology chronology47 = localDateTime43.getChronology();
        org.joda.time.DateTimeField dateTimeField48 = chronology47.year();
        java.util.Locale locale49 = java.util.Locale.KOREA;
        java.util.Locale locale50 = locale49.stripExtensions();
        int int51 = dateTimeField48.getMaximumTextLength(locale49);
        long long54 = dateTimeField48.set((long) (short) 10, 35268191);
        java.util.Locale locale56 = java.util.Locale.ENGLISH;
        java.util.Locale locale57 = java.util.Locale.ENGLISH;
        java.lang.String str58 = locale56.getDisplayVariant(locale57);
        java.lang.String str59 = dateTimeField48.getAsShortText((int) (byte) 100, locale56);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str60 = dateTimeField24.getAsShortText((org.joda.time.ReadablePartial) localDateTime32, 28, locale56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 28");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 70 + "'", int30 == 70);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[1978, 1, 5, 17520000]");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar37);
// flaky:         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=1644572896258,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=16,MILLISECOND=258,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(property44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertNotNull(chronology47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "ko_KR");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 1112894443353600010L + "'", long54 == 1112894443353600010L);
        org.junit.Assert.assertNotNull(locale56);
        org.junit.Assert.assertEquals(locale56.toString(), "en");
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "en");
        org.junit.Assert.assertEquals("'" + str58 + "' != '" + "" + "'", str58, "");
        org.junit.Assert.assertEquals("'" + str59 + "' != '" + "100" + "'", str59, "100");
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        java.lang.String str3 = localDateTime0.toString();
        org.joda.time.LocalDateTime localDateTime5 = localDateTime0.plusMonths((int) 'a');
        org.joda.time.LocalDateTime.Property property6 = localDateTime0.hourOfDay();
        org.joda.time.LocalDateTime.Property property7 = localDateTime0.millisOfDay();
        org.joda.time.LocalDateTime localDateTime9 = property7.addToCopy((long) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        long long16 = dateTimeZone12.convertLocalToUTC((long) 35268191, false, (long) 35268191);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime(0L, dateTimeZone18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.minusYears((int) (short) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = null;
        boolean boolean23 = localDateTime21.isSupported(dateTimeFieldType22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.minusMillis((int) (short) 10);
        boolean boolean26 = dateTimeZone12.isLocalDateTimeGap(localDateTime21);
        long long28 = dateTimeZone12.convertUTCToLocal(0L);
        int int30 = dateTimeZone12.getOffset((long) 35268191);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone12);
        org.joda.time.DateTime dateTime32 = localDateTime9.toDateTime(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime34 = localDateTime9.withYear(28);
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight((long) 100);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.plusWeeks((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration39 = null;
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight36.minus(readableDuration39);
        java.util.Locale locale42 = java.util.Locale.KOREA;
        java.util.Locale locale43 = locale42.stripExtensions();
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        org.joda.time.LocalDateTime localDateTime45 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod46 = null;
        org.joda.time.LocalDateTime localDateTime48 = localDateTime45.withPeriodAdded(readablePeriod46, (int) '#');
        org.joda.time.LocalDateTime.Property property49 = localDateTime48.millisOfDay();
        org.joda.time.LocalDateTime localDateTime50 = property49.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property51 = localDateTime50.minuteOfHour();
        org.joda.time.LocalDateTime.Property property52 = localDateTime50.minuteOfHour();
        boolean boolean53 = calendar44.after((java.lang.Object) localDateTime50);
        org.joda.time.Chronology chronology54 = localDateTime50.getChronology();
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime((long) (byte) 100, chronology54);
        java.lang.Object obj56 = null;
        org.joda.time.Chronology chronology57 = null;
        org.joda.time.Interval interval58 = new org.joda.time.Interval(obj56, chronology57);
        long long59 = interval58.toDurationMillis();
        org.joda.time.Period period60 = interval58.toPeriod();
        java.lang.String str61 = period60.toString();
        long long64 = chronology54.add((org.joda.time.ReadablePeriod) period60, (long) (byte) 100, 0);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight40.minus((org.joda.time.ReadablePeriod) period60);
        org.joda.time.MutablePeriod mutablePeriod66 = period60.toMutablePeriod();
        org.joda.time.DurationFieldType durationFieldType67 = org.joda.time.DurationFieldType.centuries();
        boolean boolean68 = mutablePeriod66.isSupported(durationFieldType67);
        org.joda.time.PeriodType periodType69 = mutablePeriod66.getPeriodType();
        org.joda.time.LocalDateTime localDateTime70 = localDateTime9.plus((org.joda.time.ReadablePeriod) mutablePeriod66);
        java.lang.String str71 = mutablePeriod66.toString();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "2022-02-15T14:40:16.335" + "'", str3, "2022-02-15T14:40:16.335");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + (-327851809L) + "'", long16 == (-327851809L));
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 363120000L + "'", long28 == 363120000L);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 363120000 + "'", int30 == 363120000);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572896335,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=16,MILLISECOND=335,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime45);
        org.junit.Assert.assertNotNull(localDateTime48);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 0L + "'", long59 == 0L);
        org.junit.Assert.assertNotNull(period60);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "PT0S" + "'", str61, "PT0S");
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 100L + "'", long64 == 100L);
        org.junit.Assert.assertNotNull(dateMidnight65);
        org.junit.Assert.assertNotNull(mutablePeriod66);
        org.junit.Assert.assertNotNull(durationFieldType67);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(periodType69);
        org.junit.Assert.assertNotNull(localDateTime70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "PT0S" + "'", str71, "PT0S");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime0.withPeriodAdded(readablePeriod1, (int) '#');
        int[] intArray4 = localDateTime0.getValues();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusDays(1);
        org.joda.time.DateTime dateTime8 = localDateTime7.toDateTime();
        org.joda.time.DateMidnight dateMidnight9 = dateTime8.toDateMidnight();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.months();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DurationField durationField12 = durationFieldType10.getField(chronology11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight9.withFieldAdded(durationFieldType10, 35268191);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean19 = localDateTime15.isSupported(dateTimeFieldType18);
        org.joda.time.DateMidnight.Property property20 = dateMidnight14.property(dateTimeFieldType18);
        int int21 = localDateTime0.get(dateTimeFieldType18);
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime0.withDurationAdded(readableDuration22, 69);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = localDateTime0.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(intArray4);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray4), "[2022, 2, 15, 52816372]");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2 + "'", int21 == 2);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        int int5 = dateTime3.getWeekyear();
        org.joda.time.DateTime dateTime7 = dateTime3.plusDays(1970);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime3.withHourOfDay(52807920);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52807920 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateTime dateTime4 = dateTime3.withEarlierOffsetAtOverlap();
        org.joda.time.DateTime dateTime6 = dateTime4.withWeekOfWeekyear(12);
        org.joda.time.DateTime dateTime8 = dateTime4.minusMonths(0);
        org.joda.time.DateTime.Property property9 = dateTime8.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = property9.addToCopy(1112894443353600010L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1112894443353600010 * 604800000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        java.util.Date date3 = dateTime2.toDate();
        int int4 = date3.getTimezoneOffset();
        int int5 = date3.getYear();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.fromDateFields(date3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = localDate6.getFieldType(13);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 13");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(date3);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 70 + "'", int5 == 70);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        java.lang.Object obj0 = null;
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.Interval interval2 = new org.joda.time.Interval(obj0, chronology1);
        boolean boolean3 = interval2.containsNow();
        java.lang.Object obj4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Interval interval6 = new org.joda.time.Interval(obj4, chronology5);
        long long7 = interval6.toDurationMillis();
        org.joda.time.PeriodType periodType8 = null;
        org.joda.time.Period period9 = interval6.toPeriod(periodType8);
        org.joda.time.Interval interval10 = interval2.overlap((org.joda.time.ReadableInterval) interval6);
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) (short) 10, chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYear(12);
        org.joda.time.Interval interval17 = new org.joda.time.Interval(readableDuration11, (org.joda.time.ReadableInstant) dateTime16);
        org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusDays(1);
        org.joda.time.DateTime dateTime21 = localDateTime20.toDateTime();
        org.joda.time.DateMidnight dateMidnight22 = dateTime21.toDateMidnight();
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.months();
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DurationField durationField25 = durationFieldType23.getField(chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight22.withFieldAdded(durationFieldType23, 35268191);
        org.joda.time.LocalDateTime localDateTime28 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean32 = localDateTime28.isSupported(dateTimeFieldType31);
        org.joda.time.DateMidnight.Property property33 = dateMidnight27.property(dateTimeFieldType31);
        org.joda.time.DateTime.Property property34 = dateTime16.property(dateTimeFieldType31);
        org.joda.time.DateTime dateTime35 = property34.getDateTime();
        org.joda.time.DateTime dateTime37 = dateTime35.withWeekOfWeekyear((int) (short) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval38 = interval2.withEnd((org.joda.time.ReadableInstant) dateTime37);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(period9);
        org.junit.Assert.assertNull(interval10);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays(1);
        org.joda.time.DateTime dateTime3 = localDateTime2.toDateTime();
        org.joda.time.DateMidnight dateMidnight4 = dateTime3.toDateMidnight();
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.months();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DurationField durationField7 = durationFieldType5.getField(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight4.withFieldAdded(durationFieldType5, 35268191);
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusDays(1);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.dayOfWeek();
        boolean boolean14 = localDateTime10.isSupported(dateTimeFieldType13);
        org.joda.time.DateMidnight.Property property15 = dateMidnight9.property(dateTimeFieldType13);
        org.joda.time.DateMidnight dateMidnight16 = property15.getDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight18 = property15.addToCopy(946684800000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 946684800000 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + true + "'", boolean14 == true);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.ordinalDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear((int) '#');
        java.lang.Appendable appendable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable3, (long) 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        java.util.Date date2 = localDate1.toDate();
        int int3 = date2.getYear();
        java.util.Locale.Builder builder4 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder5 = builder4.clearExtensions();
        java.util.Locale.Builder builder6 = builder4.clear();
        boolean boolean7 = date2.equals((java.lang.Object) builder6);
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Tue Feb 15 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 122 + "'", int3 == 122);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime(0L, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears((int) (short) 1);
        int int5 = localDateTime4.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withDate(0, 363120000, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 363120000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) (short) 10, chronology2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYear(12);
        org.joda.time.Interval interval6 = new org.joda.time.Interval(readableDuration0, (org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime.Property property7 = dateTime5.weekOfWeekyear();
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(chronology8);
        java.lang.String str10 = localTime9.toString();
        org.joda.time.DateTime dateTime11 = dateTime5.withFields((org.joda.time.ReadablePartial) localTime9);
        int int12 = dateTime5.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime5.withHourOfDay(142);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 142 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "14:40:16.846" + "'", str10, "14:40:16.846");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 10 + "'", int12 == 10);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.parse("14:40:06.584");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"14:40:06.584\" is malformed at \":40:06.584\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight((long) (short) 0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.plus(readableDuration2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.months();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withFieldAdded(durationFieldType4, 0);
        org.joda.time.DateMidnight.Property property7 = dateMidnight6.weekyear();
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.plusDays(35268191);
        org.joda.time.Interval interval10 = dateMidnight9.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight12 = dateMidnight9.withDayOfWeek((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(durationFieldType4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(interval10);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((long) (short) 10, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYear(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.yearOfEra();
        org.joda.time.DateTime dateTime7 = dateTime4.withField(dateTimeFieldType5, 2022);
        org.joda.time.DateMidnight dateMidnight8 = dateTime7.toDateMidnight();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.withDurationAdded(readableDuration9, 2022);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight((long) 100);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.plusWeeks((int) (byte) -1);
        org.joda.time.ReadableDuration readableDuration16 = null;
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight13.minus(readableDuration16);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.util.Locale locale20 = locale19.stripExtensions();
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime22.withPeriodAdded(readablePeriod23, (int) '#');
        org.joda.time.LocalDateTime.Property property26 = localDateTime25.millisOfDay();
        org.joda.time.LocalDateTime localDateTime27 = property26.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property28 = localDateTime27.minuteOfHour();
        org.joda.time.LocalDateTime.Property property29 = localDateTime27.minuteOfHour();
        boolean boolean30 = calendar21.after((java.lang.Object) localDateTime27);
        org.joda.time.Chronology chronology31 = localDateTime27.getChronology();
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (byte) 100, chronology31);
        java.lang.Object obj33 = null;
        org.joda.time.Chronology chronology34 = null;
        org.joda.time.Interval interval35 = new org.joda.time.Interval(obj33, chronology34);
        long long36 = interval35.toDurationMillis();
        org.joda.time.Period period37 = interval35.toPeriod();
        java.lang.String str38 = period37.toString();
        long long41 = chronology31.add((org.joda.time.ReadablePeriod) period37, (long) (byte) 100, 0);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight17.minus((org.joda.time.ReadablePeriod) period37);
        org.joda.time.MutablePeriod mutablePeriod43 = period37.toMutablePeriod();
        org.joda.time.DateMidnight dateMidnight45 = dateMidnight11.withPeriodAdded((org.joda.time.ReadablePeriod) mutablePeriod43, 32769);
        java.lang.String str46 = mutablePeriod43.toString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1644572897097,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=17,MILLISECOND=97,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertNotNull(period37);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "PT0S" + "'", str38, "PT0S");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 100L + "'", long41 == 100L);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertNotNull(mutablePeriod43);
        org.junit.Assert.assertNotNull(dateMidnight45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "PT0S" + "'", str46, "PT0S");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 100, (int) '4');
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime localTime5 = localTime3.minusMinutes((int) '#');
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = localTime5.isEqual(readablePartial6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Partial cannot be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = locale0.stripExtensions();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(locale1);
        calendar2.clear();
        calendar2.roll(363120000, (int) (short) 0);
        calendar2.set((int) '#', (int) (byte) 0, 8, 2022, 0, 9);
        calendar2.set(39, (int) (short) 10, 1970, 86399999, (int) (short) 10);
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = locale20.stripExtensions();
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(locale21);
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now();
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime26 = localDateTime23.withPeriodAdded(readablePeriod24, (int) '#');
        org.joda.time.LocalDateTime.Property property27 = localDateTime26.millisOfDay();
        org.joda.time.LocalDateTime localDateTime28 = property27.roundCeilingCopy();
        org.joda.time.LocalDateTime.Property property29 = localDateTime28.minuteOfHour();
        org.joda.time.LocalDateTime.Property property30 = localDateTime28.minuteOfHour();
        boolean boolean31 = calendar22.after((java.lang.Object) localDateTime28);
        org.joda.time.Chronology chronology32 = localDateTime28.getChronology();
        org.joda.time.DateTimeField dateTimeField33 = chronology32.weekOfWeekyear();
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.clockhourOfHalfday();
        org.joda.time.DurationField durationField36 = chronology32.minutes();
        long long40 = chronology32.add(363120010L, (long) 86399999, 52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate41 = new org.joda.time.LocalDate((java.lang.Object) 86399999, chronology32);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar2);
        org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=?,YEAR=39,MONTH=10,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=1970,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=86399999,MINUTE=10,SECOND=9,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1644572897186,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=48,SECOND=17,MILLISECOND=186,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(durationField36);
        org.junit.Assert.assertTrue("'" + long40 + "' != '" + 4855919958L + "'", long40 == 4855919958L);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("KOR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) (short) 10, (int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(17520010, 48, 17, 23, 122, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 122 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }
}
