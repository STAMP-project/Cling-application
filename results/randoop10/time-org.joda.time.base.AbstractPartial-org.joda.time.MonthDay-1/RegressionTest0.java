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
            java.util.Date date1 = new java.util.Date("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
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
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
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
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        java.util.TimeZone timeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar1 = java.util.Calendar.getInstance(timeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (byte) 10, (int) 'a', (int) '4', (int) (short) 0, (int) (short) -1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
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
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr" + "'", str1, "fr");
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(0L);
        java.lang.String str2 = monthDay1.toString();
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((java.lang.Object) monthDay1, dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.MonthDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--01-01" + "'", str2, "--01-01");
        org.junit.Assert.assertNotNull(dateTimeZone4);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("--02-01", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((int) (short) 0, 32770, (int) '#', (int) (short) -1, (int) (short) 0, 5, (int) (byte) 100, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar1.getActualMaximum((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572103283,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=3,MILLISECOND=283,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.MonthDay monthDay5 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay7 = monthDay5.minusMonths((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer3, (org.joda.time.ReadablePartial) monthDay5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay7);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        int int0 = org.joda.time.MonthDay.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = monthDay0.toString("monthOfYear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Appendable appendable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable3, (long) 32770);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        java.io.Writer writer4 = null;
        org.joda.time.MonthDay monthDay5 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay7 = monthDay5.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField9 = monthDay7.getField((int) (byte) 0);
        java.util.Locale locale13 = new java.util.Locale("", "", "hi!");
        int int14 = dateTimeField9.getMaximumTextLength(locale13);
        long long17 = dateTimeField9.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.MonthDay monthDay22 = monthDay18.minus(readablePeriod21);
        org.joda.time.MonthDay monthDay23 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay25 = monthDay23.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField27 = monthDay25.getField((int) (byte) 0);
        java.util.Locale locale31 = new java.util.Locale("", "", "hi!");
        int int32 = dateTimeField27.getMaximumTextLength(locale31);
        java.lang.String str33 = dateTimeField9.getAsShortText((org.joda.time.ReadablePartial) monthDay18, locale31);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer4, (org.joda.time.ReadablePartial) monthDay18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(monthDay7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 9L + "'", long17 == 9L);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(monthDay22);
        org.junit.Assert.assertNotNull(monthDay25);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "Feb" + "'", str33, "Feb");
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long6 = dateTimeZone2.convertLocalToUTC((long) 13, true, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object) 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-187199987L) + "'", long6 == (-187199987L));
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (short) 1, (int) (byte) 1, (int) 'a', 0, 0, 1970, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) '#', (int) (byte) 1, (int) '4', 1970, 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.MonthDay monthDay6 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay8 = monthDay6.minusMonths((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, (org.joda.time.ReadablePartial) monthDay8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(monthDay8);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long11 = dateTimeZone7.convertLocalToUTC((long) 13, true, (long) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(100, (int) (short) 0, (int) (short) -1, 4, 12, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-187199987L) + "'", long11 == (-187199987L));
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology6 = null;
        boolean boolean7 = dateTimeFieldType5.isSupported(chronology6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = monthDay2.get(dateTimeFieldType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        java.util.Locale locale10 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = calendar1.getDisplayName((int) (byte) 0, (int) '4', locale10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=10,MONTH=12,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=0,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=35,MINUTE=13,SECOND=4,MILLISECOND=619,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        org.joda.time.LocalDateTime localDateTime11 = dateTime9.toLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property17 = dateTime16.hourOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime9.toMutableDateTime(chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((int) (byte) 0, (int) (byte) 10, (int) '#', (int) 'a', 0, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(mutableDateTime21);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTimeFormatter2.parseDateTime("23");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay2 = new org.joda.time.MonthDay((java.lang.Object) locale0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572105058,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=5,MILLISECOND=58,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(0L);
        java.lang.String str2 = monthDay1.toString();
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = monthDay1.toString("hi!", locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--01-01" + "'", str2, "--01-01");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(0, (int) (byte) 10, (int) (byte) 100, (int) '4', 52, (int) ' ', (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.roll(9, false);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.clear(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32769");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=5,MILLISECOND=350,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(chronology0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay3 = monthDay1.withDayOfMonth((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,29]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.LocalTime localTime7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDate2.toLocalDateTime(localTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MonthDay monthDay8 = new org.joda.time.MonthDay(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        org.joda.time.DateTime dateTime16 = dateTime13.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology17 = dateTime16.getChronology();
        org.joda.time.MonthDay monthDay18 = monthDay8.withChronologyRetainFields(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(2922789, 5, 100, (int) '4', (int) ' ', 1, 13, chronology17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(monthDay18);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime2.withDate(52, (int) (byte) 10, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MonthDay monthDay6 = new org.joda.time.MonthDay(chronology5);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate2.compareTo((org.joda.time.ReadablePartial) monthDay6);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property6 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology13 = chronology9.withZone(dateTimeZone12);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((long) (byte) 1, dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate14.withDayOfYear(2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtStartOfDay(dateTimeZone4);
        org.joda.time.MonthDay monthDay7 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay9 = monthDay7.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField11 = monthDay9.getField((int) (byte) 0);
        java.util.Locale locale15 = new java.util.Locale("", "", "hi!");
        int int16 = dateTimeField11.getMaximumTextLength(locale15);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay20 = monthDay18.minusMonths((int) (byte) 0);
        org.joda.time.MonthDay monthDay21 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay23 = monthDay21.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField25 = monthDay23.getField((int) (byte) 0);
        java.util.Locale locale29 = new java.util.Locale("", "", "hi!");
        int int30 = dateTimeField25.getMaximumTextLength(locale29);
        long long33 = dateTimeField25.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay34 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay36 = monthDay34.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.MonthDay monthDay38 = monthDay34.minus(readablePeriod37);
        org.joda.time.MonthDay monthDay39 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay41 = monthDay39.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField43 = monthDay41.getField((int) (byte) 0);
        java.util.Locale locale47 = new java.util.Locale("", "", "hi!");
        int int48 = dateTimeField43.getMaximumTextLength(locale47);
        java.lang.String str49 = dateTimeField25.getAsShortText((org.joda.time.ReadablePartial) monthDay34, locale47);
        int[] intArray50 = monthDay34.getValues();
        int int51 = dateTimeField11.getMinimumValue((org.joda.time.ReadablePartial) monthDay18, intArray50);
        // The following exception was thrown during execution in test generation
        try {
            int int52 = localDate2.compareTo((org.joda.time.ReadablePartial) monthDay18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(monthDay9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(monthDay23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9L + "'", long33 == 9L);
        org.junit.Assert.assertNotNull(monthDay36);
        org.junit.Assert.assertNotNull(monthDay38);
        org.junit.Assert.assertNotNull(monthDay41);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Feb" + "'", str49, "Feb");
        org.junit.Assert.assertNotNull(intArray50);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[2, 11]");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 1 + "'", int51 == 1);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Appendable appendable3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable3, (long) 59);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField17 = monthDay15.getField((int) (byte) 0);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        long long30 = dateTimeField22.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay31 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay33 = monthDay31.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.MonthDay monthDay35 = monthDay31.minus(readablePeriod34);
        org.joda.time.MonthDay monthDay36 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay38 = monthDay36.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField40 = monthDay38.getField((int) (byte) 0);
        java.util.Locale locale44 = new java.util.Locale("", "", "hi!");
        int int45 = dateTimeField40.getMaximumTextLength(locale44);
        java.lang.String str46 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) monthDay31, locale44);
        java.lang.String str47 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) monthDay15, locale44);
        long long49 = dateTimeField4.roundFloor((long) 2922789);
        org.joda.time.MonthDay monthDay50 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay52 = monthDay50.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField54 = monthDay52.getField((int) (byte) 0);
        java.util.Locale locale58 = new java.util.Locale("", "", "hi!");
        int int59 = dateTimeField54.getMaximumTextLength(locale58);
        long long62 = dateTimeField54.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay63 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay65 = monthDay63.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.MonthDay monthDay67 = monthDay63.minus(readablePeriod66);
        org.joda.time.MonthDay monthDay68 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay70 = monthDay68.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField72 = monthDay70.getField((int) (byte) 0);
        java.util.Locale locale76 = new java.util.Locale("", "", "hi!");
        int int77 = dateTimeField72.getMaximumTextLength(locale76);
        java.lang.String str78 = dateTimeField54.getAsShortText((org.joda.time.ReadablePartial) monthDay63, locale76);
        int[] intArray79 = monthDay63.getValues();
        int[] intArray86 = new int[] { 3, 11, 2, 1970, 12 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray88 = dateTimeField4.set((org.joda.time.ReadablePartial) monthDay63, 1970, intArray86, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1970");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9L + "'", long30 == 9L);
        org.junit.Assert.assertNotNull(monthDay33);
        org.junit.Assert.assertNotNull(monthDay35);
        org.junit.Assert.assertNotNull(monthDay38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Feb" + "'", str46, "Feb");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "February" + "'", str47, "February");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(monthDay52);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 9L + "'", long62 == 9L);
        org.junit.Assert.assertNotNull(monthDay65);
        org.junit.Assert.assertNotNull(monthDay67);
        org.junit.Assert.assertNotNull(monthDay70);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 9 + "'", int77 == 9);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Feb" + "'", str78, "Feb");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[2, 11]");
        org.junit.Assert.assertNotNull(intArray86);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray86), "[3, 11, 2, 1970, 12]");
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField8 = localDate2.getField(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField17 = monthDay15.getField((int) (byte) 0);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        long long30 = dateTimeField22.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay31 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay33 = monthDay31.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.MonthDay monthDay35 = monthDay31.minus(readablePeriod34);
        org.joda.time.MonthDay monthDay36 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay38 = monthDay36.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField40 = monthDay38.getField((int) (byte) 0);
        java.util.Locale locale44 = new java.util.Locale("", "", "hi!");
        int int45 = dateTimeField40.getMaximumTextLength(locale44);
        java.lang.String str46 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) monthDay31, locale44);
        java.lang.String str47 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) monthDay15, locale44);
        long long49 = dateTimeField4.roundHalfFloor((long) (short) 100);
        org.joda.time.MonthDay monthDay50 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay52 = monthDay50.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField54 = monthDay52.getField((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType55 = org.joda.time.DateTimeFieldType.era();
        int int56 = monthDay52.indexOf(dateTimeFieldType55);
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.DateTime dateTime60 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone59);
        org.joda.time.DateTime dateTime62 = dateTime60.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property63 = dateTime62.hourOfDay();
        java.lang.String str64 = property63.getAsShortText();
        org.joda.time.MonthDay monthDay65 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay67 = monthDay65.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField69 = monthDay67.getField((int) (byte) 0);
        java.util.Locale locale73 = new java.util.Locale("", "", "hi!");
        int int74 = dateTimeField69.getMaximumTextLength(locale73);
        long long77 = dateTimeField69.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay78 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay80 = monthDay78.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod81 = null;
        org.joda.time.MonthDay monthDay82 = monthDay78.minus(readablePeriod81);
        org.joda.time.MonthDay monthDay83 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay85 = monthDay83.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField87 = monthDay85.getField((int) (byte) 0);
        java.util.Locale locale91 = new java.util.Locale("", "", "hi!");
        int int92 = dateTimeField87.getMaximumTextLength(locale91);
        java.lang.String str93 = dateTimeField69.getAsShortText((org.joda.time.ReadablePartial) monthDay78, locale91);
        int int94 = property63.getMaximumTextLength(locale91);
        org.joda.time.DateTimeField dateTimeField95 = property63.getField();
        java.util.Locale locale96 = java.util.Locale.FRENCH;
        java.util.Calendar calendar97 = java.util.Calendar.getInstance(locale96);
        int int98 = property63.getMaximumTextLength(locale96);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str99 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) monthDay52, (-1), locale96);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9L + "'", long30 == 9L);
        org.junit.Assert.assertNotNull(monthDay33);
        org.junit.Assert.assertNotNull(monthDay35);
        org.junit.Assert.assertNotNull(monthDay38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Feb" + "'", str46, "Feb");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "February" + "'", str47, "February");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(monthDay52);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(dateTimeFieldType55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + (-1) + "'", int56 == (-1));
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(property63);
        org.junit.Assert.assertEquals("'" + str64 + "' != '" + "23" + "'", str64, "23");
        org.junit.Assert.assertNotNull(monthDay67);
        org.junit.Assert.assertNotNull(dateTimeField69);
        org.junit.Assert.assertEquals(locale73.toString(), "");
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 9 + "'", int74 == 9);
        org.junit.Assert.assertTrue("'" + long77 + "' != '" + 9L + "'", long77 == 9L);
        org.junit.Assert.assertNotNull(monthDay80);
        org.junit.Assert.assertNotNull(monthDay82);
        org.junit.Assert.assertNotNull(monthDay85);
        org.junit.Assert.assertNotNull(dateTimeField87);
        org.junit.Assert.assertEquals(locale91.toString(), "");
        org.junit.Assert.assertTrue("'" + int92 + "' != '" + 9 + "'", int92 == 9);
        org.junit.Assert.assertEquals("'" + str93 + "' != '" + "Feb" + "'", str93, "Feb");
        org.junit.Assert.assertTrue("'" + int94 + "' != '" + 2 + "'", int94 == 2);
        org.junit.Assert.assertNotNull(dateTimeField95);
        org.junit.Assert.assertNotNull(locale96);
        org.junit.Assert.assertEquals(locale96.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar97);
// flaky:         org.junit.Assert.assertEquals(calendar97.toString(), "java.util.GregorianCalendar[time=1644572106339,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=6,MILLISECOND=339,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 2 + "'", int98 == 2);
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
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.dayOfMonth();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) '4');
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = dateTimeFormatter6.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime15, "fr", 8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, (long) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        org.joda.time.MonthDay monthDay11 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay13 = monthDay11.minusMonths((int) (byte) 0);
        org.joda.time.MonthDay monthDay14 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay16 = monthDay14.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField18 = monthDay16.getField((int) (byte) 0);
        java.util.Locale locale22 = new java.util.Locale("", "", "hi!");
        int int23 = dateTimeField18.getMaximumTextLength(locale22);
        long long26 = dateTimeField18.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay27 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay29 = monthDay27.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay31 = monthDay27.minus(readablePeriod30);
        org.joda.time.MonthDay monthDay32 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay34 = monthDay32.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField36 = monthDay34.getField((int) (byte) 0);
        java.util.Locale locale40 = new java.util.Locale("", "", "hi!");
        int int41 = dateTimeField36.getMaximumTextLength(locale40);
        java.lang.String str42 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) monthDay27, locale40);
        int[] intArray43 = monthDay27.getValues();
        int int44 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) monthDay11, intArray43);
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(dateTimeZone46);
        org.joda.time.LocalDate localDate49 = localDate47.withDayOfYear(100);
        org.joda.time.Interval interval50 = localDate49.toInterval();
        org.joda.time.MonthDay monthDay52 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay54 = monthDay52.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField56 = monthDay54.getField((int) (byte) 0);
        java.util.Locale locale60 = new java.util.Locale("", "", "hi!");
        int int61 = dateTimeField56.getMaximumTextLength(locale60);
        long long64 = dateTimeField56.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay65 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay67 = monthDay65.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod68 = null;
        org.joda.time.MonthDay monthDay69 = monthDay65.minus(readablePeriod68);
        org.joda.time.MonthDay monthDay70 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay72 = monthDay70.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField74 = monthDay72.getField((int) (byte) 0);
        java.util.Locale locale78 = new java.util.Locale("", "", "hi!");
        int int79 = dateTimeField74.getMaximumTextLength(locale78);
        java.lang.String str80 = dateTimeField56.getAsShortText((org.joda.time.ReadablePartial) monthDay65, locale78);
        int[] intArray81 = monthDay65.getValues();
        java.util.Locale locale83 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray84 = dateTimeField4.set((org.joda.time.ReadablePartial) localDate49, (int) (short) -1, intArray81, "", locale83);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(monthDay16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9L + "'", long26 == 9L);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay31);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Feb" + "'", str42, "Feb");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[2, 11]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(localDate49);
        org.junit.Assert.assertNotNull(interval50);
        org.junit.Assert.assertNotNull(monthDay54);
        org.junit.Assert.assertNotNull(dateTimeField56);
        org.junit.Assert.assertEquals(locale60.toString(), "");
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 9 + "'", int61 == 9);
        org.junit.Assert.assertTrue("'" + long64 + "' != '" + 9L + "'", long64 == 9L);
        org.junit.Assert.assertNotNull(monthDay67);
        org.junit.Assert.assertNotNull(monthDay69);
        org.junit.Assert.assertNotNull(monthDay72);
        org.junit.Assert.assertNotNull(dateTimeField74);
        org.junit.Assert.assertEquals(locale78.toString(), "");
        org.junit.Assert.assertTrue("'" + int79 + "' != '" + 9 + "'", int79 == 9);
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "Feb" + "'", str80, "Feb");
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[2, 11]");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "fr");
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        org.joda.time.MonthDay monthDay11 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay13 = monthDay11.minusMonths((int) (byte) 0);
        org.joda.time.MonthDay monthDay14 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay16 = monthDay14.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField18 = monthDay16.getField((int) (byte) 0);
        java.util.Locale locale22 = new java.util.Locale("", "", "hi!");
        int int23 = dateTimeField18.getMaximumTextLength(locale22);
        long long26 = dateTimeField18.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay27 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay29 = monthDay27.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay31 = monthDay27.minus(readablePeriod30);
        org.joda.time.MonthDay monthDay32 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay34 = monthDay32.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField36 = monthDay34.getField((int) (byte) 0);
        java.util.Locale locale40 = new java.util.Locale("", "", "hi!");
        int int41 = dateTimeField36.getMaximumTextLength(locale40);
        java.lang.String str42 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) monthDay27, locale40);
        int[] intArray43 = monthDay27.getValues();
        int int44 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) monthDay11, intArray43);
        int[] intArray45 = monthDay11.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int int47 = monthDay11.getValue(4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 4");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(monthDay16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9L + "'", long26 == 9L);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay31);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Feb" + "'", str42, "Feb");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[2, 11]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 1]");
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.roll(9, false);
        java.util.Calendar calendar5 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calendar1.compareTo(calendar5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=6,MILLISECOND=712,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        int int0 = org.joda.time.MonthDay.MONTH_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        org.joda.time.DateTime.Property property7 = dateTime4.dayOfYear();
        int int8 = dateTime4.getCenturyOfEra();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.MonthDay monthDay11 = monthDay1.withChronologyRetainFields(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = chronology10.get(readablePeriod12, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(monthDay11);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property13 = dateTime2.centuryOfEra();
        java.lang.String str14 = dateTime2.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime2.withDayOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1969-12-31T23:59:59.999Z" + "'", str14, "1969-12-31T23:59:59.999Z");
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(0, (int) (short) 1, (int) ' ', (int) (short) 10, (int) (short) 0, 32769, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(0L);
        java.lang.String str2 = monthDay1.toString();
        org.joda.time.LocalDate localDate4 = monthDay1.toLocalDate(2022);
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--01-01" + "'", str2, "--01-01");
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate2.withYearOfCentury((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        int int14 = dateTimeField4.get((-187199987L));
        org.joda.time.MonthDay monthDay15 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay17 = monthDay15.minusDays((int) (short) 10);
        int[] intArray24 = new int[] { (byte) -1, 32769, 1, (byte) 100, ' ' };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray26 = dateTimeField4.addWrapPartial((org.joda.time.ReadablePartial) monthDay15, 32770, intArray24, 16);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32770");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[-1, 32769, 1, 100, 32]");
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        boolean boolean5 = dateTimeFormatter3.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withDefaultYear(0);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.parse("0053-01-01T00:00:00.051Z", dateTimeFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays((int) '#');
        int int15 = dateTime12.getWeekyear();
        org.joda.time.DateMidnight dateMidnight16 = dateTime12.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property18 = dateTime12.property(dateTimeFieldType17);
        boolean boolean19 = localDate4.isSupported(dateTimeFieldType17);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        calendar21.setLenient(true);
        calendar21.setMinimalDaysInFirstWeek(1970);
        int int27 = calendar21.getGreatestMinimum(10);
        org.joda.time.MonthDay monthDay28 = org.joda.time.MonthDay.fromCalendarFields(calendar21);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = localDate4.compareTo((org.joda.time.ReadablePartial) monthDay28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1644572107607,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=7,MILLISECOND=607,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(monthDay28);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property13 = dateTime2.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime2.withDate(21, 1, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        long long6 = java.util.Date.UTC(10, (int) (byte) 0, 2922789, (int) (short) 0, 0, 32769);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 250635459969000L + "'", long6 == 250635459969000L);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = calendar1.get(21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572107665,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=7,MILLISECOND=665,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        org.joda.time.MonthDay monthDay11 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay13 = monthDay11.minusMonths((int) (byte) 0);
        org.joda.time.MonthDay monthDay14 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay16 = monthDay14.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField18 = monthDay16.getField((int) (byte) 0);
        java.util.Locale locale22 = new java.util.Locale("", "", "hi!");
        int int23 = dateTimeField18.getMaximumTextLength(locale22);
        long long26 = dateTimeField18.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay27 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay29 = monthDay27.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay31 = monthDay27.minus(readablePeriod30);
        org.joda.time.MonthDay monthDay32 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay34 = monthDay32.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField36 = monthDay34.getField((int) (byte) 0);
        java.util.Locale locale40 = new java.util.Locale("", "", "hi!");
        int int41 = dateTimeField36.getMaximumTextLength(locale40);
        java.lang.String str42 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) monthDay27, locale40);
        int[] intArray43 = monthDay27.getValues();
        int int44 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) monthDay11, intArray43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.MonthDay monthDay47 = monthDay11.withPeriodAdded(readablePeriod45, 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType48 = org.joda.time.DateTimeFieldType.era();
        java.lang.String str49 = dateTimeFieldType48.getName();
        // The following exception was thrown during execution in test generation
        try {
            int int50 = monthDay11.get(dateTimeFieldType48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(monthDay16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9L + "'", long26 == 9L);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay31);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Feb" + "'", str42, "Feb");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[2, 11]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(monthDay47);
        org.junit.Assert.assertNotNull(dateTimeFieldType48);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "era" + "'", str49, "era");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.MonthDay monthDay17 = monthDay13.minus(readablePeriod16);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        java.lang.String str28 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) monthDay13, locale26);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay32 = monthDay30.minusMonths((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.MonthDay monthDay34 = monthDay30.minus(readablePeriod33);
        int[] intArray42 = new int[] { (-1), 6, 11, '#', (short) 0, 5 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray44 = dateTimeField4.set((org.joda.time.ReadablePartial) monthDay34, 8, intArray42, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feb" + "'", str28, "Feb");
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[-1, 6, 11, 35, 0, 5]");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("fra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'fra' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("eras");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        int int14 = dateTimeField4.get((-187199987L));
        long long16 = dateTimeField4.roundHalfCeiling((long) 11);
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 0L + "'", long16 == 0L);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType7 = localDate4.getFieldType(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32769");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        java.lang.Class<?> wildcardClass13 = dateTime2.getClass();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(wildcardClass13);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer7, (long) 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.parse("--02-11", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField17 = monthDay15.getField((int) (byte) 0);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        long long30 = dateTimeField22.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay31 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay33 = monthDay31.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.MonthDay monthDay35 = monthDay31.minus(readablePeriod34);
        org.joda.time.MonthDay monthDay36 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay38 = monthDay36.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField40 = monthDay38.getField((int) (byte) 0);
        java.util.Locale locale44 = new java.util.Locale("", "", "hi!");
        int int45 = dateTimeField40.getMaximumTextLength(locale44);
        java.lang.String str46 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) monthDay31, locale44);
        java.lang.String str47 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) monthDay15, locale44);
        long long49 = dateTimeField4.roundHalfFloor((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            long long52 = dateTimeField4.set((long) (byte) -1, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9L + "'", long30 == 9L);
        org.junit.Assert.assertNotNull(monthDay33);
        org.junit.Assert.assertNotNull(monthDay35);
        org.junit.Assert.assertNotNull(monthDay38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Feb" + "'", str46, "Feb");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "February" + "'", str47, "February");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(writer7, 4L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology14 = chronology10.withZone(dateTimeZone13);
        org.joda.time.MonthDay monthDay15 = org.joda.time.MonthDay.now(chronology10);
        org.joda.time.DateTimeField dateTimeField16 = chronology10.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay17 = new org.joda.time.MonthDay(21, (int) (short) 0, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        int int6 = monthDay2.indexOf(dateTimeFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.MonthDay monthDay9 = monthDay2.withPeriodAdded(readablePeriod7, (-1));
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.withDayOfYear(100);
        org.joda.time.Interval interval15 = localDate14.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean16 = monthDay2.isEqual((org.joda.time.ReadablePartial) localDate14);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(monthDay9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(interval15);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar1.getMinimum((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572108799,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=8,MILLISECOND=799,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("fr");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        int int15 = dateTime2.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTime2.toString("era");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property12 = dateTime11.hourOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology19 = chronology15.withZone(dateTimeZone18);
        org.joda.time.DateTimeField dateTimeField20 = chronology15.weekyearOfCentury();
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate(83968099800000L, chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((int) (short) 100, 2022, (-1), 5, (int) (byte) 100, 2922789, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property8 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = dateTime7.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(6, 17, 1970, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.MonthDay monthDay17 = monthDay13.minus(readablePeriod16);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        java.lang.String str28 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) monthDay13, locale26);
        int[] intArray29 = monthDay13.getValues();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay32 = monthDay13.withPeriodAdded(readablePeriod30, 59);
        org.joda.time.MonthDay monthDay34 = monthDay13.minusDays(59);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType36 = monthDay13.getFieldType(2922789);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2922789");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feb" + "'", str28, "Feb");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[2, 11]");
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(monthDay34);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property16 = dateTime10.property(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate7.property(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.plus(readablePeriod21);
        int int23 = property17.compareTo((org.joda.time.ReadableInstant) dateTime22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = property17.addToCopy(12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.MonthDay monthDay11 = monthDay1.withChronologyRetainFields(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = monthDay11.getValue(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(monthDay11);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        // The following exception was thrown during execution in test generation
        try {
            int int2 = monthDay0.getValue(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2022");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime10.hourOfDay();
        org.joda.time.DateTime dateTime13 = dateTime10.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology18 = chronology14.withZone(dateTimeZone17);
        java.lang.String str19 = chronology14.toString();
        org.joda.time.DurationField durationField20 = chronology14.seconds();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(13, 32769, 5, 13, 16, 52, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str19, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField20);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = dateTimeFormatter6.parseLocalTime("year");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology14 = chronology10.withZone(dateTimeZone13);
        org.joda.time.DateTimeField dateTimeField15 = chronology10.weekyearOfCentury();
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(83968099800000L, chronology10);
        org.joda.time.DurationField durationField17 = durationFieldType0.getField(chronology10);
        org.joda.time.ReadablePartial readablePartial18 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray20 = chronology10.get(readablePartial18, (long) 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField17);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.MutableDateTime mutableDateTime12 = dateTime7.toMutableDateTime(dateTimeZone11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(11, (int) 'a', 4, 5, (int) (byte) 10, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.MonthDay monthDay17 = monthDay13.minus(readablePeriod16);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        java.lang.String str28 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) monthDay13, locale26);
        int[] intArray29 = monthDay13.getValues();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay32 = monthDay13.withPeriodAdded(readablePeriod30, 59);
        org.joda.time.MonthDay monthDay34 = monthDay13.minusDays(59);
        org.joda.time.DateTimeFieldType dateTimeFieldType35 = org.joda.time.DateTimeFieldType.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay37 = monthDay13.withField(dateTimeFieldType35, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feb" + "'", str28, "Feb");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[2, 11]");
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertNotNull(dateTimeFieldType35);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int9 = localDate7.getValue(0);
        java.lang.String str10 = localDate7.toString();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str41 = localDate7.toString("1969-12-31T23:59:59.999Z", locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-08-11" + "'", str10, "2022-08-11");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime4.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        java.lang.String str13 = chronology8.toString();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology8.get(readablePeriod14, (long) ' ', (long) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str13, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) '4');
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime9.toMutableDateTime(dateTimeZone13);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = dateTimeFormatter6.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime14, "", (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = property5.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate9 = property5.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property5.getFieldType();
        org.joda.time.LocalDate localDate11 = property5.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate11.withDayOfMonth((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = property5.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate9 = property5.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = property5.setCopy("Feb");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Feb\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.MonthDay monthDay4 = new org.joda.time.MonthDay(0L);
        java.lang.String str5 = monthDay4.toString();
        org.joda.time.Chronology chronology6 = monthDay4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(0, (int) (byte) 1, (int) (byte) -1, chronology6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--01-01" + "'", str5, "--01-01");
        org.junit.Assert.assertNotNull(chronology6);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property8 = dateTime7.hourOfDay();
        org.joda.time.DateTime dateTime10 = dateTime7.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology15 = chronology11.withZone(dateTimeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(2922789, 8, (int) (short) -1, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        long long11 = dateTimeZone7.convertLocalToUTC((long) (byte) 10, true);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(0, 1, 0, 13, (int) (byte) 1, 2730, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2730 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        java.util.Date date3 = new java.util.Date(0, 0, (int) '4');
        date3.setDate(12);
        date3.setHours(2922789);
        date3.setTime(9L);
        java.util.Date date13 = new java.util.Date(0, 0, (int) '4');
        int int14 = date13.getHours();
        int int15 = date13.getDate();
        boolean boolean16 = date3.after(date13);
        boolean boolean18 = date13.equals((java.lang.Object) (byte) 0);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date13.toString(), "Wed Feb 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.MonthDay monthDay13 = org.joda.time.MonthDay.now(chronology8);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone17);
        org.joda.time.DateTime dateTime20 = dateTime18.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property21 = dateTime20.hourOfDay();
        org.joda.time.DateTime dateTime23 = dateTime20.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology24 = dateTime23.getChronology();
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology28 = chronology24.withZone(dateTimeZone27);
        org.joda.time.DateTimeField dateTimeField29 = chronology24.weekyearOfCentury();
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(83968099800000L, chronology24);
        org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtStartOfDay(dateTimeZone33);
        org.joda.time.MonthDay monthDay36 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay38 = monthDay36.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField40 = monthDay38.getField((int) (byte) 0);
        java.util.Locale locale44 = new java.util.Locale("", "", "hi!");
        int int45 = dateTimeField40.getMaximumTextLength(locale44);
        org.joda.time.MonthDay monthDay47 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay49 = monthDay47.minusMonths((int) (byte) 0);
        org.joda.time.MonthDay monthDay50 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay52 = monthDay50.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField54 = monthDay52.getField((int) (byte) 0);
        java.util.Locale locale58 = new java.util.Locale("", "", "hi!");
        int int59 = dateTimeField54.getMaximumTextLength(locale58);
        long long62 = dateTimeField54.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay63 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay65 = monthDay63.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod66 = null;
        org.joda.time.MonthDay monthDay67 = monthDay63.minus(readablePeriod66);
        org.joda.time.MonthDay monthDay68 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay70 = monthDay68.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField72 = monthDay70.getField((int) (byte) 0);
        java.util.Locale locale76 = new java.util.Locale("", "", "hi!");
        int int77 = dateTimeField72.getMaximumTextLength(locale76);
        java.lang.String str78 = dateTimeField54.getAsShortText((org.joda.time.ReadablePartial) monthDay63, locale76);
        int[] intArray79 = monthDay63.getValues();
        int int80 = dateTimeField40.getMinimumValue((org.joda.time.ReadablePartial) monthDay47, intArray79);
        int[] intArray81 = monthDay47.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray83 = dateTimeField14.addWrapPartial((org.joda.time.ReadablePartial) localDate30, 16, intArray81, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 16");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeZone33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(monthDay38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertNotNull(monthDay49);
        org.junit.Assert.assertNotNull(monthDay52);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertEquals(locale58.toString(), "");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 9 + "'", int59 == 9);
        org.junit.Assert.assertTrue("'" + long62 + "' != '" + 9L + "'", long62 == 9L);
        org.junit.Assert.assertNotNull(monthDay65);
        org.junit.Assert.assertNotNull(monthDay67);
        org.junit.Assert.assertNotNull(monthDay70);
        org.junit.Assert.assertNotNull(dateTimeField72);
        org.junit.Assert.assertEquals(locale76.toString(), "");
        org.junit.Assert.assertTrue("'" + int77 + "' != '" + 9 + "'", int77 == 9);
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "Feb" + "'", str78, "Feb");
        org.junit.Assert.assertNotNull(intArray79);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray79), "[2, 11]");
        org.junit.Assert.assertTrue("'" + int80 + "' != '" + 1 + "'", int80 == 1);
        org.junit.Assert.assertNotNull(intArray81);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray81), "[1, 1]");
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.MonthDay monthDay13 = org.joda.time.MonthDay.now(chronology8);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.year();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology8.getDateTimeMillis((int) (byte) 10, 32770, (int) 'x', 187200000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 187200000 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setTimeInMillis((long) 32769);
        java.util.Locale locale8 = java.util.Locale.ITALIAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = calendar1.getDisplayName(32770, (int) (short) -1, locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=32769,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=32,MILLISECOND=769,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "it");
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.util.Date date3 = new java.util.Date(0, 0, (int) '4');
        date3.setDate(12);
        date3.setHours(2922789);
        date3.setTime(9L);
        java.util.Date date13 = new java.util.Date(0, 0, (int) '4');
        int int14 = date13.getHours();
        int int15 = date13.getDate();
        boolean boolean16 = date3.after(date13);
        java.lang.Object obj17 = date3.clone();
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date13.toString(), "Wed Feb 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 21 + "'", int15 == 21);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay3 = monthDay1.minusMonths((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.MonthDay monthDay5 = monthDay1.minus(readablePeriod4);
        org.joda.time.MonthDay.Property property6 = monthDay1.dayOfMonth();
        java.lang.String str7 = property6.toString();
        java.util.Locale locale9 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay10 = property6.setCopy("February", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"February\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay3);
        org.junit.Assert.assertNotNull(monthDay5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "Property[dayOfMonth]" + "'", str7, "Property[dayOfMonth]");
        org.junit.Assert.assertNotNull(locale9);
// flaky:         org.junit.Assert.assertEquals(locale9.toString(), "fr");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.setWeekDefinition((int) (short) -1, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        java.lang.Appendable appendable7 = null;
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.withDayOfYear(100);
        int int13 = localDate10.size();
        org.joda.time.LocalDate localDate15 = localDate10.plusMonths(6);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable7, (org.joda.time.ReadablePartial) localDate10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 3 + "'", int13 == 3);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        java.lang.Object obj8 = calendar1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=10,MONTH=12,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=0,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=35,MINUTE=13,SECOND=11,MILLISECOND=516,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj8);
// flaky:         org.junit.Assert.assertEquals(obj8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=10,MONTH=12,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=0,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=35,MINUTE=13,SECOND=11,MILLISECOND=516,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=10,MONTH=12,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=0,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=35,MINUTE=13,SECOND=11,MILLISECOND=516,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=10,MONTH=12,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=0,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=35,MINUTE=13,SECOND=11,MILLISECOND=516,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        java.util.Date date3 = new java.util.Date(0, 0, (int) '4');
        date3.setDate(12);
        date3.setHours(2922789);
        date3.setTime(9L);
        java.util.Date date13 = new java.util.Date(0, 0, (int) '4');
        int int14 = date13.getHours();
        boolean boolean15 = date3.before(date13);
        java.lang.String str16 = date3.toLocaleString();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property23 = dateTime22.hourOfDay();
        org.joda.time.DateTime dateTime25 = dateTime22.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology26 = dateTime25.getChronology();
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology30 = chronology26.withZone(dateTimeZone29);
        org.joda.time.DateTimeField dateTimeField31 = chronology26.weekyearOfCentury();
        org.joda.time.LocalDate localDate32 = new org.joda.time.LocalDate(83968099800000L, chronology26);
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime36 = localDate32.toDateTimeAtStartOfDay(dateTimeZone35);
        boolean boolean37 = date3.equals((java.lang.Object) localDate32);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date13.toString(), "Wed Feb 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1 janv. 1970 00:00:00" + "'", str16, "1 janv. 1970 00:00:00");
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        org.joda.time.MonthDay monthDay11 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay13 = monthDay11.minusMonths((int) (byte) 0);
        org.joda.time.MonthDay monthDay14 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay16 = monthDay14.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField18 = monthDay16.getField((int) (byte) 0);
        java.util.Locale locale22 = new java.util.Locale("", "", "hi!");
        int int23 = dateTimeField18.getMaximumTextLength(locale22);
        long long26 = dateTimeField18.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay27 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay29 = monthDay27.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay31 = monthDay27.minus(readablePeriod30);
        org.joda.time.MonthDay monthDay32 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay34 = monthDay32.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField36 = monthDay34.getField((int) (byte) 0);
        java.util.Locale locale40 = new java.util.Locale("", "", "hi!");
        int int41 = dateTimeField36.getMaximumTextLength(locale40);
        java.lang.String str42 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) monthDay27, locale40);
        int[] intArray43 = monthDay27.getValues();
        int int44 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) monthDay11, intArray43);
        org.joda.time.ReadablePeriod readablePeriod45 = null;
        org.joda.time.MonthDay monthDay47 = monthDay11.withPeriodAdded(readablePeriod45, 0);
        org.joda.time.DurationFieldType durationFieldType48 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay50 = monthDay47.withFieldAdded(durationFieldType48, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'null' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(monthDay16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9L + "'", long26 == 9L);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay31);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Feb" + "'", str42, "Feb");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[2, 11]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(monthDay47);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime10.hourOfDay();
        org.joda.time.DateTime dateTime13 = dateTime10.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology18 = chronology14.withZone(dateTimeZone17);
        java.lang.String str19 = chronology14.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(5, 7, 2922789, 23, 5, 0, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str19, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("--01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"--01-01\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.MonthDay monthDay11 = monthDay1.withChronologyRetainFields(chronology10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray14 = chronology10.get(readablePeriod12, (long) 23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(monthDay11);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.roll(9, false);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calendar1.getActualMinimum(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=12,MILLISECOND=251,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        org.joda.time.MonthDay monthDay11 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay13 = monthDay11.minusMonths((int) (byte) 0);
        org.joda.time.MonthDay monthDay14 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay16 = monthDay14.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField18 = monthDay16.getField((int) (byte) 0);
        java.util.Locale locale22 = new java.util.Locale("", "", "hi!");
        int int23 = dateTimeField18.getMaximumTextLength(locale22);
        long long26 = dateTimeField18.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay27 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay29 = monthDay27.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay31 = monthDay27.minus(readablePeriod30);
        org.joda.time.MonthDay monthDay32 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay34 = monthDay32.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField36 = monthDay34.getField((int) (byte) 0);
        java.util.Locale locale40 = new java.util.Locale("", "", "hi!");
        int int41 = dateTimeField36.getMaximumTextLength(locale40);
        java.lang.String str42 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) monthDay27, locale40);
        int[] intArray43 = monthDay27.getValues();
        int int44 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) monthDay11, intArray43);
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = org.joda.time.DateTimeFieldType.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay47 = monthDay11.withField(dateTimeFieldType45, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'yearOfEra' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(monthDay16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9L + "'", long26 == 9L);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay31);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Feb" + "'", str42, "Feb");
        org.junit.Assert.assertNotNull(intArray43);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[2, 13]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(0, 1970, 8, 32772, (int) (short) 100, (int) (byte) 10, 23, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateTime2.toString("fr", locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1644572112374,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=12,MILLISECOND=374,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(0L);
        java.lang.String str2 = monthDay1.toString();
        org.joda.time.Chronology chronology3 = monthDay1.getChronology();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray6 = chronology3.get(readablePeriod4, (long) 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--01-03" + "'", str2, "--01-03");
        org.junit.Assert.assertNotNull(chronology3);
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = property5.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.DateTimeField[] dateTimeFieldArray9 = localDate8.getFields();
        org.joda.time.LocalDate localDate11 = localDate8.minusYears(2730);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate13 = localDate11.withDayOfWeek(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray9);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.withYearOfEra((int) ' ');
        int int10 = dateTime4.getYearOfCentury();
        org.joda.time.DateTime dateTime12 = dateTime4.withWeekOfWeekyear(9);
        java.util.Locale locale14 = java.util.Locale.FRENCH;
        java.util.Calendar calendar15 = java.util.Calendar.getInstance(locale14);
        java.lang.String str16 = locale14.getCountry();
        java.util.Locale locale17 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str18 = locale14.getDisplayVariant(locale17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateTime4.toString("0053-01-01T00:00:00.051Z", locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1644572112627,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=12,MILLISECOND=627,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        int int6 = monthDay2.indexOf(dateTimeFieldType5);
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.withDayOfYear(100);
        org.joda.time.Interval interval12 = localDate11.toInterval();
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.days();
        java.lang.String str14 = durationFieldType13.getName();
        org.joda.time.LocalDate localDate16 = localDate11.withFieldAdded(durationFieldType13, 32770);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = monthDay2.compareTo((org.joda.time.ReadablePartial) localDate11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "days" + "'", str14, "days");
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        org.joda.time.MonthDay monthDay8 = org.joda.time.MonthDay.fromCalendarFields(calendar1);
        int int10 = calendar1.getGreatestMinimum(3);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.roll((int) '4', false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572112699,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=12,MILLISECOND=699,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(monthDay8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale3.getDisplayScript(locale4);
        int int7 = property2.getMaximumTextLength(locale3);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        java.lang.String str15 = property14.getAsShortText();
        org.joda.time.MonthDay monthDay16 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay18 = monthDay16.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField20 = monthDay18.getField((int) (byte) 0);
        java.util.Locale locale24 = new java.util.Locale("", "", "hi!");
        int int25 = dateTimeField20.getMaximumTextLength(locale24);
        long long28 = dateTimeField20.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay29 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay31 = monthDay29.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod32 = null;
        org.joda.time.MonthDay monthDay33 = monthDay29.minus(readablePeriod32);
        org.joda.time.MonthDay monthDay34 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay36 = monthDay34.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField38 = monthDay36.getField((int) (byte) 0);
        java.util.Locale locale42 = new java.util.Locale("", "", "hi!");
        int int43 = dateTimeField38.getMaximumTextLength(locale42);
        java.lang.String str44 = dateTimeField20.getAsShortText((org.joda.time.ReadablePartial) monthDay29, locale42);
        int int45 = property14.getMaximumTextLength(locale42);
        org.joda.time.DateTimeField dateTimeField46 = property14.getField();
        java.util.Locale locale47 = java.util.Locale.FRENCH;
        java.util.Calendar calendar48 = java.util.Calendar.getInstance(locale47);
        int int49 = property14.getMaximumTextLength(locale47);
        boolean boolean50 = locale47.hasExtensions();
        java.lang.String str51 = locale47.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay52 = property2.setCopy("19", locale47);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"19\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "3" + "'", str15, "3");
        org.junit.Assert.assertNotNull(monthDay18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 9 + "'", int25 == 9);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 9L + "'", long28 == 9L);
        org.junit.Assert.assertNotNull(monthDay31);
        org.junit.Assert.assertNotNull(monthDay33);
        org.junit.Assert.assertNotNull(monthDay36);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertEquals(locale42.toString(), "");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 9 + "'", int43 == 9);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "Feb" + "'", str44, "Feb");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(locale47);
        org.junit.Assert.assertEquals(locale47.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar48);
// flaky:         org.junit.Assert.assertEquals(calendar48.toString(), "java.util.GregorianCalendar[time=1644572112729,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=12,MILLISECOND=729,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + false + "'", boolean50 == false);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "" + "'", str51, "");
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        calendar1.clear();
        calendar1.setMinimalDaysInFirstWeek((int) 'u');
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=117,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int9 = localDate7.getValue(0);
        java.lang.String str10 = localDate7.toString();
        org.joda.time.LocalDate localDate12 = localDate7.withWeekyear(1);
        org.joda.time.LocalDate localDate14 = localDate7.withDayOfYear((int) (byte) 1);
        org.joda.time.LocalDate localDate16 = localDate14.withWeekyear(6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = localDate14.withMonthOfYear(13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-08-13" + "'", str10, "2022-08-13");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(70);
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear(100);
        int int11 = localDate8.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDate8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        int int6 = monthDay2.indexOf(dateTimeFieldType5);
        java.lang.String str7 = dateTimeFieldType5.getName();
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "era" + "'", str7, "era");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer3, (long) 32770);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.MonthDay monthDay13 = org.joda.time.MonthDay.now(chronology8);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.year();
        long long17 = dateTimeField15.roundHalfEven(10L);
        org.joda.time.MonthDay monthDay19 = new org.joda.time.MonthDay((long) (byte) 100);
        org.joda.time.MonthDay monthDay21 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay23 = monthDay21.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField25 = monthDay23.getField((int) (byte) 0);
        java.util.Locale locale29 = new java.util.Locale("", "", "hi!");
        int int30 = dateTimeField25.getMaximumTextLength(locale29);
        long long33 = dateTimeField25.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay34 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay36 = monthDay34.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod37 = null;
        org.joda.time.MonthDay monthDay38 = monthDay34.minus(readablePeriod37);
        org.joda.time.MonthDay monthDay39 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay41 = monthDay39.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField43 = monthDay41.getField((int) (byte) 0);
        java.util.Locale locale47 = new java.util.Locale("", "", "hi!");
        int int48 = dateTimeField43.getMaximumTextLength(locale47);
        java.lang.String str49 = dateTimeField25.getAsShortText((org.joda.time.ReadablePartial) monthDay34, locale47);
        int[] intArray50 = monthDay34.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray52 = dateTimeField15.add((org.joda.time.ReadablePartial) monthDay19, 32772, intArray50, 187200000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32772");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
// flaky:         org.junit.Assert.assertTrue("'" + long17 + "' != '" + (-187200000L) + "'", long17 == (-187200000L));
        org.junit.Assert.assertNotNull(monthDay23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 9L + "'", long33 == 9L);
        org.junit.Assert.assertNotNull(monthDay36);
        org.junit.Assert.assertNotNull(monthDay38);
        org.junit.Assert.assertNotNull(monthDay41);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertEquals("'" + str49 + "' != '" + "Feb" + "'", str49, "Feb");
        org.junit.Assert.assertNotNull(intArray50);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray50), "[2, 13]");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.era();
        int int6 = monthDay2.indexOf(dateTimeFieldType5);
        org.joda.time.ReadablePeriod readablePeriod7 = null;
        org.joda.time.MonthDay monthDay9 = monthDay2.withPeriodAdded(readablePeriod7, (-1));
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays((int) '#');
        int int15 = dateTime12.getWeekyear();
        org.joda.time.DateMidnight dateMidnight16 = dateTime12.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property18 = dateTime12.property(dateTimeFieldType17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay.Property property19 = monthDay2.property(dateTimeFieldType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + (-1) + "'", int6 == (-1));
        org.junit.Assert.assertNotNull(monthDay9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property12 = dateTime11.hourOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime4.toMutableDateTime(chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField17.set(0L, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.roll((int) (short) 100, 0);
        int int8 = calendar1.getGreatestMinimum(0);
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        calendar10.setLenient(true);
        int int13 = calendar1.compareTo(calendar10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572113158,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=13,MILLISECOND=158,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1644572113158,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=13,MILLISECOND=158,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        java.lang.Object obj1 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long8 = dateTimeZone4.convertLocalToUTC((long) 13, true, (long) ' ');
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(obj1, dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) 8, dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + (-187199987L) + "'", long8 == (-187199987L));
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property12 = dateTime11.hourOfDay();
        org.joda.time.DateTime dateTime14 = dateTime11.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology15 = dateTime14.getChronology();
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology19 = chronology15.withZone(dateTimeZone18);
        org.joda.time.DurationField durationField20 = chronology15.weeks();
        org.joda.time.DateTimeField dateTimeField21 = chronology15.clockhourOfDay();
        long long26 = chronology15.getDateTimeMillis((-1), 8, 2, 17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(0, (int) (byte) 10, (-1), 8, 59, 52, (int) '#', chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
// flaky:         org.junit.Assert.assertTrue("'" + long26 + "' != '" + (-62180539199983L) + "'", long26 == (-62180539199983L));
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property16 = dateTime10.property(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate7.property(dateTimeFieldType15);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone19);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.DateTime dateTime22 = dateTime20.plus(readablePeriod21);
        int int23 = property17.compareTo((org.joda.time.ReadableInstant) dateTime22);
        org.joda.time.DateTime dateTime25 = dateTime22.minus((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTime25.withMinuteOfHour(229);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 229 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        java.lang.Appendable appendable49 = null;
        org.joda.time.DateTime dateTime51 = new org.joda.time.DateTime((long) (byte) 0);
        org.joda.time.DateTime dateTime52 = dateTime51.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable49, (org.joda.time.ReadableInstant) dateTime52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572113366,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=13,MILLISECOND=366,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTime52);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        boolean boolean4 = calendar1.isLenient();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572113414,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=13,MILLISECOND=414,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        boolean boolean8 = dateTimeZone6.isStandardOffset(10L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((int) (byte) -1, 21, (-1), 239, 32772, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 239 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra(52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate0.withDayOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        org.joda.time.MonthDay monthDay5 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay7 = monthDay5.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField9 = monthDay7.getField((int) (byte) 0);
        java.util.Locale locale13 = new java.util.Locale("", "", "hi!");
        int int14 = dateTimeField9.getMaximumTextLength(locale13);
        boolean boolean15 = dateTime4.equals((java.lang.Object) int14);
        int int16 = dateTime4.getMinuteOfDay();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(monthDay7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals(locale13.toString(), "");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 9 + "'", int14 == 9);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 239 + "'", int16 == 239);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        java.util.Date date3 = new java.util.Date(0, 0, (int) '4');
        int int4 = date3.getHours();
        int int5 = date3.getMinutes();
        java.util.Date date9 = new java.util.Date(0, 0, (int) '4');
        date9.setDate(12);
        date9.setTime(1L);
        boolean boolean14 = date3.after(date9);
        java.lang.String str15 = date9.toString();
        org.junit.Assert.assertEquals(date3.toString(), "Wed Feb 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertEquals(date9.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Thu Jan 01 00:00:00 UTC 1970" + "'", str15, "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("fr");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"fr\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(365, (int) 'a', 23, (int) (short) 10, 20, 100, 21, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        java.util.Date date11 = new java.util.Date(0, 0, (int) '4');
        date11.setDate(12);
        date11.setHours(2922789);
        date11.setTime(9L);
        java.util.Date date21 = new java.util.Date(0, 0, (int) '4');
        int int22 = date21.getHours();
        boolean boolean23 = date11.before(date21);
        int int24 = date11.getDay();
        calendar1.setTime(date11);
        java.util.Locale locale26 = java.util.Locale.FRENCH;
        java.util.Calendar calendar27 = java.util.Calendar.getInstance(locale26);
        int int28 = calendar1.compareTo(calendar27);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=9,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=9,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date21.toString(), "Wed Feb 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1644572113785,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=13,MILLISECOND=785,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + (-1) + "'", int28 == (-1));
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter6.getPrinter();
        java.io.Writer writer8 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone10);
        org.joda.time.ReadablePeriod readablePeriod12 = null;
        org.joda.time.DateTime dateTime13 = dateTime11.plus(readablePeriod12);
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        long long19 = dateTimeZone15.convertLocalToUTC((long) (byte) 10, true);
        org.joda.time.DateTime dateTime20 = dateTime11.withZoneRetainFields(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(writer8, (org.joda.time.ReadableInstant) dateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimePrinter7);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
// flaky:         org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-187199990L) + "'", long19 == (-187199990L));
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = localDate4.toDateTimeAtCurrentTime(dateTimeZone7);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.era();
        int int11 = localDate4.get(dateTimeFieldType10);
        int int12 = localDate4.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 14 + "'", int12 == 14);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        java.time.Instant instant8 = calendar1.toInstant();
        calendar1.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.add(2730, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572113931,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=13,MILLISECOND=931,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(instant8);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        java.util.Date date11 = new java.util.Date(0, 0, (int) '4');
        date11.setDate(12);
        date11.setHours(2922789);
        date11.setTime(9L);
        java.util.Date date21 = new java.util.Date(0, 0, (int) '4');
        int int22 = date21.getHours();
        boolean boolean23 = date11.before(date21);
        int int24 = date11.getDay();
        calendar1.setTime(date11);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = calendar1.getActualMaximum(365);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 365");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=9,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=9,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(date11.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date21.toString(), "Wed Feb 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 4 + "'", int24 == 4);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        java.util.Date date5 = new java.util.Date((int) (short) 100, 100, 11, 0, (int) (byte) 10);
        java.util.Date date11 = new java.util.Date(0, 32770, 5, 0, (int) (short) 10);
        int int12 = date5.compareTo(date11);
        org.junit.Assert.assertEquals(date5.toString(), "Sun May 11 00:10:00 UTC 2008");
        org.junit.Assert.assertEquals(date11.toString(), "Fri Nov 05 00:10:00 UTC 4630");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        java.io.Writer writer49 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer49, (long) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572113986,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=13,MILLISECOND=986,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set((int) (byte) 0, (int) (byte) 1);
        java.util.Calendar.Builder builder7 = builder0.setDate(59, (int) (byte) 1, 2022);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder9 = builder7.setCalendarType("janv.");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: janv.");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property16 = dateTime10.property(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate7.property(dateTimeFieldType15);
        org.joda.time.LocalDate localDate18 = property17.roundCeilingCopy();
        java.lang.String str19 = property17.getAsString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "1" + "'", str19, "1");
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property16 = dateTime10.property(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate7.property(dateTimeFieldType15);
        java.lang.String str18 = localDate7.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate7.withEra(21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
// flaky:         org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2022-08-13" + "'", str18, "2022-08-13");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property16 = dateTime10.property(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate7.property(dateTimeFieldType15);
        org.joda.time.LocalDate localDate18 = property17.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = localDate18.withEra((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay3 = monthDay1.minusMonths((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.MonthDay monthDay5 = monthDay1.minus(readablePeriod4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = monthDay5.toString("en-US");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay3);
        org.junit.Assert.assertNotNull(monthDay5);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear(70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.parse("ISOChronology[+52:00]", dateTimeFormatter6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        org.joda.time.MonthDay monthDay9 = new org.joda.time.MonthDay(0L);
        java.lang.String str10 = monthDay9.toString();
        org.joda.time.Chronology chronology11 = monthDay9.getChronology();
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime2.withEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "--01-03" + "'", str10, "--01-03");
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.MonthDay monthDay11 = monthDay1.withChronologyRetainFields(chronology10);
        org.joda.time.DurationField durationField12 = chronology10.days();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear(100);
        int int18 = localDate15.size();
        org.joda.time.LocalDate localDate20 = localDate15.plusMonths(6);
        int[] intArray22 = new int[] { (byte) 100 };
        // The following exception was thrown during execution in test generation
        try {
            chronology10.validate((org.joda.time.ReadablePartial) localDate20, intArray22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(monthDay11);
        org.junit.Assert.assertNotNull(durationField12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[100]");
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("1970-01-03T03:59:59.999+52:00", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        java.time.Instant instant8 = calendar1.toInstant();
        int int9 = calendar1.getWeekYear();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap41 = calendar1.getDisplayNames(32770, 365, locale38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572114536,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=14,MILLISECOND=536,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, (long) 16);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = dateTimeFormatter2.parseLocalDate("2022-02-11");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalTime localTime1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = localDate0.toLocalDateTime(localTime1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        org.joda.time.MonthDay monthDay4 = property2.addToCopy((int) ' ');
        int int5 = property2.get();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay7 = property2.setCopy("hi!");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(monthDay4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField17 = monthDay15.getField((int) (byte) 0);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        long long30 = dateTimeField22.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay31 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay33 = monthDay31.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.MonthDay monthDay35 = monthDay31.minus(readablePeriod34);
        org.joda.time.MonthDay monthDay36 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay38 = monthDay36.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField40 = monthDay38.getField((int) (byte) 0);
        java.util.Locale locale44 = new java.util.Locale("", "", "hi!");
        int int45 = dateTimeField40.getMaximumTextLength(locale44);
        java.lang.String str46 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) monthDay31, locale44);
        java.lang.String str47 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) monthDay15, locale44);
        long long49 = dateTimeField4.roundHalfFloor((long) (short) 100);
        boolean boolean50 = dateTimeField4.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long53 = dateTimeField4.set((long) 1, 229);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 229 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9L + "'", long30 == 9L);
        org.junit.Assert.assertNotNull(monthDay33);
        org.junit.Assert.assertNotNull(monthDay35);
        org.junit.Assert.assertNotNull(monthDay38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Feb" + "'", str46, "Feb");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "February" + "'", str47, "February");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.Chronology chronology15 = dateTime2.getChronology();
        org.joda.time.Chronology chronology16 = dateTime2.getChronology();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.Chronology chronology18 = null;
        boolean boolean19 = dateTimeFieldType17.isSupported(chronology18);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone21);
        org.joda.time.DateTime dateTime24 = dateTime22.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property25 = dateTime24.hourOfDay();
        org.joda.time.DateTime dateTime27 = dateTime24.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology28 = dateTime27.getChronology();
        boolean boolean29 = dateTimeFieldType17.isSupported(chronology28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate((java.lang.Object) chronology16, chronology28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.minusMinutes(52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = dateTime2.withDayOfWeek((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfCentury((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDate7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        java.time.Instant instant8 = calendar1.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar1.getMaximum(70);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 70");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572115396,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=15,MILLISECOND=396,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(instant8);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.withYearOfEra((int) ' ');
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        java.lang.String str12 = locale10.getCountry();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime17.hourOfDay();
        java.lang.String str19 = property18.getAsShortText();
        org.joda.time.MonthDay monthDay20 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay22 = monthDay20.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField24 = monthDay22.getField((int) (byte) 0);
        java.util.Locale locale28 = new java.util.Locale("", "", "hi!");
        int int29 = dateTimeField24.getMaximumTextLength(locale28);
        long long32 = dateTimeField24.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay33 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay35 = monthDay33.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.MonthDay monthDay37 = monthDay33.minus(readablePeriod36);
        org.joda.time.MonthDay monthDay38 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay40 = monthDay38.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField42 = monthDay40.getField((int) (byte) 0);
        java.util.Locale locale46 = new java.util.Locale("", "", "hi!");
        int int47 = dateTimeField42.getMaximumTextLength(locale46);
        java.lang.String str48 = dateTimeField24.getAsShortText((org.joda.time.ReadablePartial) monthDay33, locale46);
        int int49 = property18.getMaximumTextLength(locale46);
        java.lang.String str50 = locale10.getDisplayVariant(locale46);
        java.util.Locale locale51 = java.util.Locale.ITALIAN;
        java.lang.String str52 = locale46.getDisplayScript(locale51);
        java.util.Calendar calendar53 = dateTime9.toCalendar(locale46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = locale46.getUnicodeLocaleType("1969-12-31T23:59:59.999Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 1969-12-31T23:59:59.999Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1644572115448,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=15,MILLISECOND=448,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3" + "'", str19, "3");
        org.junit.Assert.assertNotNull(monthDay22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9L + "'", long32 == 9L);
        org.junit.Assert.assertNotNull(monthDay35);
        org.junit.Assert.assertNotNull(monthDay37);
        org.junit.Assert.assertNotNull(monthDay40);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Feb" + "'", str48, "Feb");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "it");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(calendar53);
// flaky:         org.junit.Assert.assertEquals(calendar53.toString(), "java.util.GregorianCalendar[time=-61157376000001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=32,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.util.Locale locale0 = java.util.Locale.ITALY;
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        java.lang.String str2 = locale1.getLanguage();
        java.lang.String str3 = locale0.getDisplayScript(locale1);
        java.lang.String str4 = locale1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "it" + "'", str2, "it");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "it" + "'", str4, "it");
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.roll((int) (short) 100, 0);
        int int8 = calendar1.get((int) (byte) 0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572115579,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=15,MILLISECOND=579,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        java.lang.Appendable appendable7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable7, (long) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        java.util.Locale locale3 = new java.util.Locale("fra", "--01-01", "monthOfYear");
        java.lang.Object obj4 = locale3.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "fra_--01-01_monthOfYear");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "fra_--01-01_monthOfYear");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "fra_--01-01_monthOfYear");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "fra_--01-01_monthOfYear");
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property13 = dateTime2.centuryOfEra();
        java.lang.String str14 = dateTime2.toString();
        int int15 = dateTime2.getWeekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) int15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "1970-01-03T03:59:59.999+52:00" + "'", str14, "1970-01-03T03:59:59.999+52:00");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        java.time.Instant instant8 = calendar1.toInstant();
        java.util.Date date9 = java.util.Date.from(instant8);
        org.joda.time.MonthDay monthDay10 = org.joda.time.MonthDay.fromDateFields(date9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.MonthDay monthDay12 = monthDay10.minus(readablePeriod11);
        java.util.Locale locale14 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = monthDay10.toString("en-US", locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572115898,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=15,MILLISECOND=898,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Feb 11 09:35:15 UTC 2022");
        org.junit.Assert.assertNotNull(monthDay10);
        org.junit.Assert.assertNotNull(monthDay12);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((long) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateTimeFormatter2.print((org.joda.time.ReadableInstant) dateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(chronology4);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.roll(6, true);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfEra(52);
        org.joda.time.LocalDate.Property property10 = localDate9.weekOfWeekyear();
        boolean boolean11 = calendar1.equals((java.lang.Object) property10);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=43,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=16,MILLISECOND=92,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("janvier");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property16 = dateTime10.property(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate7.property(dateTimeFieldType15);
        org.joda.time.LocalDate localDate18 = property17.roundCeilingCopy();
        int int19 = localDate18.getDayOfYear();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone22);
        org.joda.time.DateTime dateTime25 = dateTime23.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property26 = dateTime25.hourOfDay();
        org.joda.time.DateTime dateTime28 = dateTime25.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology29 = dateTime28.getChronology();
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology33 = chronology29.withZone(dateTimeZone32);
        org.joda.time.DateTimeField dateTimeField34 = chronology29.weekyearOfCentury();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(83968099800000L, chronology29);
        org.joda.time.DateTimeZone dateTimeZone38 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime39 = localDate35.toDateTimeAtStartOfDay(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusDays((int) '#');
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(dateTimeZone46);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = localDate47.toDateTimeAtStartOfDay(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime42.toDateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime54 = dateTime42.plusWeeks(5);
        int int55 = dateTimeZone38.getOffset((org.joda.time.ReadableInstant) dateTime42);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime56 = localDate18.toDateTimeAtCurrentTime(dateTimeZone38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 229 + "'", int19 == 229);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeZone38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 187200000 + "'", int55 == 187200000);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.util.Date date5 = new java.util.Date(0, 32770, 5, 0, (int) (short) 10);
        int int6 = date5.getYear();
        int int7 = date5.getYear();
        org.junit.Assert.assertEquals(date5.toString(), "Fri Nov 05 00:10:00 UTC 4630");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2730 + "'", int6 == 2730);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2730 + "'", int7 == 2730);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusDays((int) '#');
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime9.toDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime21 = dateTime9.plusWeeks(5);
        int int22 = dateTime9.getSecondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime26.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property29 = dateTime28.hourOfDay();
        org.joda.time.DateTime dateTime31 = dateTime28.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology32 = dateTime31.getChronology();
        org.joda.time.DateTimeZone dateTimeZone35 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology36 = chronology32.withZone(dateTimeZone35);
        org.joda.time.DateTimeField dateTimeField37 = chronology32.weekyearOfCentury();
        org.joda.time.LocalDate localDate38 = new org.joda.time.LocalDate(83968099800000L, chronology32);
        org.joda.time.DateTimeZone dateTimeZone41 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime42 = localDate38.toDateTimeAtStartOfDay(dateTimeZone41);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusDays((int) '#');
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone49);
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(dateTimeZone52);
        org.joda.time.DateTime dateTime54 = localDate50.toDateTimeAtStartOfDay(dateTimeZone52);
        org.joda.time.DateTime dateTime55 = dateTime45.toDateTime(dateTimeZone52);
        org.joda.time.DateTime dateTime57 = dateTime45.plusWeeks(5);
        int int58 = dateTimeZone41.getOffset((org.joda.time.ReadableInstant) dateTime45);
        org.joda.time.MutableDateTime mutableDateTime59 = dateTime9.toMutableDateTime(dateTimeZone41);
        // The following exception was thrown during execution in test generation
        try {
            int int62 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime59, "ISOChronology[Etc/UTC]", (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 59 + "'", int22 == 59);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeZone35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeZone41);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 187200000 + "'", int58 == 187200000);
        org.junit.Assert.assertNotNull(mutableDateTime59);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        java.lang.Appendable appendable8 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(appendable8, 250635459969000L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        java.lang.StringBuffer stringBuffer4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, (long) 52);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.MonthDay monthDay11 = monthDay1.withChronologyRetainFields(chronology10);
        org.joda.time.DurationField durationField12 = chronology10.eras();
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = chronology10.get(readablePeriod13, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(monthDay11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = dateTimeFormatter2.parseLocalTime("+52:00");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(2730, 20, 1439);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays((int) '#');
        int int15 = dateTime12.getWeekyear();
        org.joda.time.DateMidnight dateMidnight16 = dateTime12.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property18 = dateTime12.property(dateTimeFieldType17);
        boolean boolean19 = localDate4.isSupported(dateTimeFieldType17);
        java.lang.String str20 = dateTimeFieldType17.toString();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "era" + "'", str20, "era");
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.minusDays((int) 'u');
        int int10 = dateTime4.getYearOfEra();
        org.joda.time.DateTime dateTime12 = dateTime4.plusMillis(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime12.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = localDate6.plusWeeks(14);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate6.withField(dateTimeFieldType9, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property6 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology13 = chronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyearOfCentury();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(83968099800000L, chronology9);
        org.joda.time.LocalDate localDate17 = localDate15.plusYears(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType19 = localDate17.getFieldType((int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 117");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = dateTimeFormatter6.parseLocalDate("--02-01");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        calendar1.set(0, (int) (byte) 10, (int) (short) 10);
        int int12 = calendar1.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate17.withDayOfYear(100);
        org.joda.time.Interval interval20 = localDate19.toInterval();
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.days();
        java.lang.String str22 = durationFieldType21.getName();
        org.joda.time.LocalDate localDate24 = localDate19.withFieldAdded(durationFieldType21, 32770);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime27.minusDays((int) '#');
        int int30 = dateTime27.getWeekyear();
        org.joda.time.DateMidnight dateMidnight31 = dateTime27.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType32 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property33 = dateTime27.property(dateTimeFieldType32);
        boolean boolean34 = localDate19.isSupported(dateTimeFieldType32);
        java.util.TimeZone timeZone35 = null;
        org.joda.time.DateTimeZone dateTimeZone36 = org.joda.time.DateTimeZone.forTimeZone(timeZone35);
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate(dateTimeZone36);
        org.joda.time.LocalDate localDate39 = localDate37.withDayOfYear(100);
        org.joda.time.LocalDate.Property property40 = localDate37.dayOfMonth();
        org.joda.time.LocalDate localDate41 = property40.getLocalDate();
        org.joda.time.LocalDate localDate43 = property40.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate44 = property40.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType45 = property40.getFieldType();
        boolean boolean46 = localDate19.equals((java.lang.Object) property40);
        java.lang.String str47 = property40.getAsText();
        java.util.Locale locale51 = new java.util.Locale("fra", "--01-01", "monthOfYear");
        java.lang.String str52 = property40.getAsText(locale51);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str53 = calendar1.getDisplayName((int) '4', 5, locale51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=0,MONTH=10,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=35,MINUTE=13,SECOND=17,MILLISECOND=142,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(interval20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "days" + "'", str22, "days");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 1970 + "'", int30 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertNotNull(dateTimeFieldType32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(localDate39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localDate41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(dateTimeFieldType45);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str47 + "' != '" + "13" + "'", str47, "13");
        org.junit.Assert.assertEquals(locale51.toString(), "fra_--01-01_monthOfYear");
// flaky:         org.junit.Assert.assertEquals("'" + str52 + "' != '" + "13" + "'", str52, "13");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = property5.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate9 = property5.roundHalfFloorCopy();
        org.joda.time.MonthDay monthDay10 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay12 = monthDay10.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField14 = monthDay12.getField((int) (byte) 0);
        java.util.Locale locale18 = new java.util.Locale("", "", "hi!");
        int int19 = dateTimeField14.getMaximumTextLength(locale18);
        org.joda.time.MonthDay monthDay21 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay23 = monthDay21.minusMonths((int) (byte) 0);
        org.joda.time.MonthDay monthDay24 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay26 = monthDay24.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField28 = monthDay26.getField((int) (byte) 0);
        java.util.Locale locale32 = new java.util.Locale("", "", "hi!");
        int int33 = dateTimeField28.getMaximumTextLength(locale32);
        long long36 = dateTimeField28.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay37 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay39 = monthDay37.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.MonthDay monthDay41 = monthDay37.minus(readablePeriod40);
        org.joda.time.MonthDay monthDay42 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay44 = monthDay42.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField46 = monthDay44.getField((int) (byte) 0);
        java.util.Locale locale50 = new java.util.Locale("", "", "hi!");
        int int51 = dateTimeField46.getMaximumTextLength(locale50);
        java.lang.String str52 = dateTimeField28.getAsShortText((org.joda.time.ReadablePartial) monthDay37, locale50);
        int[] intArray53 = monthDay37.getValues();
        int int54 = dateTimeField14.getMinimumValue((org.joda.time.ReadablePartial) monthDay21, intArray53);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.MonthDay monthDay57 = monthDay21.withPeriodAdded(readablePeriod55, 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean58 = localDate9.isEqual((org.joda.time.ReadablePartial) monthDay57);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(monthDay12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertNotNull(monthDay23);
        org.junit.Assert.assertNotNull(monthDay26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 9L + "'", long36 == 9L);
        org.junit.Assert.assertNotNull(monthDay39);
        org.junit.Assert.assertNotNull(monthDay41);
        org.junit.Assert.assertNotNull(monthDay44);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "Feb" + "'", str52, "Feb");
        org.junit.Assert.assertNotNull(intArray53);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray53), "[2, 13]");
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 1 + "'", int54 == 1);
        org.junit.Assert.assertNotNull(monthDay57);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        java.lang.String str6 = property5.getAsShortText();
        org.joda.time.DateTime dateTime7 = property5.roundHalfEvenCopy();
        org.joda.time.DurationField durationField8 = property5.getLeapDurationField();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3" + "'", str6, "3");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNull(durationField8);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder2 = builder0.setCalendarType("Property[hourOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: Property[hourOfDay]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property6 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology13 = chronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyearOfCentury();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(83968099800000L, chronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate15.toDateTimeAtStartOfDay();
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.withDayOfYear(100);
        org.joda.time.Interval interval26 = localDate25.toInterval();
        org.joda.time.DurationFieldType durationFieldType27 = org.joda.time.DurationFieldType.days();
        java.lang.String str28 = durationFieldType27.getName();
        org.joda.time.LocalDate localDate30 = localDate25.withFieldAdded(durationFieldType27, 32770);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.minusDays((int) '#');
        int int36 = dateTime33.getWeekyear();
        org.joda.time.DateMidnight dateMidnight37 = dateTime33.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property39 = dateTime33.property(dateTimeFieldType38);
        boolean boolean40 = localDate25.isSupported(dateTimeFieldType38);
        org.joda.time.DurationFieldType durationFieldType41 = dateTimeFieldType38.getDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate43 = localDate15.withFieldAdded(durationFieldType41, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(interval26);
        org.junit.Assert.assertNotNull(durationFieldType27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "days" + "'", str28, "days");
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 1970 + "'", int36 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertNotNull(property39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(durationFieldType41);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(0);
        int int11 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property17 = dateTime16.hourOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology24 = chronology20.withZone(dateTimeZone23);
        java.lang.String str25 = chronology20.toString();
        boolean boolean26 = dateTime4.equals((java.lang.Object) str25);
        java.util.Locale locale27 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar28 = dateTime4.toCalendar(locale27);
        // The following exception was thrown during execution in test generation
        try {
            int int30 = calendar28.get(32772);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32772");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
// flaky:         org.junit.Assert.assertTrue("'" + int11 + "' != '" + 239 + "'", int11 == 239);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
// flaky:         org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ISOChronology[+52:00]" + "'", str25, "ISOChronology[+52:00]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=-60526224000001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=52,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        int int4 = property2.getMaximumShortTextLength(locale3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay6 = property2.setCopy(14399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14399 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.Integer int3 = dateTimeFormatter2.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTimeFormatter2.parseDateTime("--01-01");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int3);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("de-DE");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setVariant("366");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: 366 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtStartOfDay(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField8 = localDate2.getField(5);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 5");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateTime dateTime7 = dateTime2.minusMillis((int) (short) 0);
        int int8 = dateTime7.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays((int) '#');
        int int14 = dateTime11.getWeekyear();
        org.joda.time.DateTime dateTime16 = dateTime11.minusMillis((int) (short) 0);
        boolean boolean17 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime16);
        int int18 = dateTime16.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime16.withWeekOfWeekyear(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1970 + "'", int14 == 1970);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 14399999 + "'", int18 == 14399999);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.MutableDateTime mutableDateTime7 = dateTime2.toMutableDateTime(dateTimeZone6);
        java.lang.Class<?> wildcardClass8 = dateTimeZone6.getClass();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        long long6 = java.util.Date.UTC(17, 5, (int) (short) 100, 0, 100, 52);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1650925148000L) + "'", long6 == (-1650925148000L));
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        boolean boolean5 = dateTimeFormatter3.isParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay6 = org.joda.time.MonthDay.parse("janv.", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) '4');
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.MutableDateTime mutableDateTime14 = dateTime9.toMutableDateTime(dateTimeZone13);
        int int16 = dateTimeZone13.getStandardOffset((long) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(23, 21, 59, 12, 0, 1970, (int) (short) 1, dateTimeZone13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(mutableDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int16 + "' != '" + 187200000 + "'", int16 == 187200000);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long7 = dateTimeZone3.convertLocalToUTC((long) 13, true, (long) ' ');
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj0, dateTimeZone3);
        org.joda.time.MonthDay monthDay10 = new org.joda.time.MonthDay(0L);
        java.lang.String str11 = monthDay10.toString();
        org.joda.time.Chronology chronology12 = monthDay10.getChronology();
        org.joda.time.DateTime dateTime13 = dateTime8.withChronology(chronology12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime8.withMonthOfYear(365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-187199987L) + "'", long7 == (-187199987L));
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "--01-03" + "'", str11, "--01-03");
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property6 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology13 = chronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyearOfCentury();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(83968099800000L, chronology9);
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime19 = localDate15.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate15.toDateTimeAtStartOfDay();
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.withDayOfYear(100);
        org.joda.time.LocalDate.Property property26 = localDate23.dayOfMonth();
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtStartOfDay();
        org.joda.time.LocalTime localTime28 = null;
        org.joda.time.DateTime dateTime29 = localDate23.toDateTime(localTime28);
        boolean boolean30 = dateTime20.isBefore((org.joda.time.ReadableInstant) dateTime29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime32 = dateTime20.withDayOfWeek((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        calendar1.clear();
        java.lang.Object obj9 = calendar1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(obj9);
        org.junit.Assert.assertEquals(obj9.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj9), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj9), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        org.joda.time.MonthDay monthDay11 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay13 = monthDay11.minusMonths((int) (byte) 0);
        org.joda.time.MonthDay monthDay14 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay16 = monthDay14.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField18 = monthDay16.getField((int) (byte) 0);
        java.util.Locale locale22 = new java.util.Locale("", "", "hi!");
        int int23 = dateTimeField18.getMaximumTextLength(locale22);
        long long26 = dateTimeField18.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay27 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay29 = monthDay27.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay31 = monthDay27.minus(readablePeriod30);
        org.joda.time.MonthDay monthDay32 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay34 = monthDay32.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField36 = monthDay34.getField((int) (byte) 0);
        java.util.Locale locale40 = new java.util.Locale("", "", "hi!");
        int int41 = dateTimeField36.getMaximumTextLength(locale40);
        java.lang.String str42 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) monthDay27, locale40);
        int[] intArray43 = monthDay27.getValues();
        int int44 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) monthDay11, intArray43);
        int[] intArray45 = monthDay11.getValues();
        java.util.TimeZone timeZone46 = null;
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forTimeZone(timeZone46);
        org.joda.time.LocalDate localDate48 = new org.joda.time.LocalDate(dateTimeZone47);
        org.joda.time.LocalDate localDate50 = localDate48.withDayOfYear(100);
        int int51 = localDate48.size();
        org.joda.time.LocalDate localDate53 = localDate48.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.minusDays((int) '#');
        int int59 = dateTime56.getWeekyear();
        org.joda.time.DateMidnight dateMidnight60 = dateTime56.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType61 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property62 = dateTime56.property(dateTimeFieldType61);
        org.joda.time.LocalDate.Property property63 = localDate53.property(dateTimeFieldType61);
        // The following exception was thrown during execution in test generation
        try {
            int int64 = monthDay11.get(dateTimeFieldType61);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(monthDay16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9L + "'", long26 == 9L);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay31);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Feb" + "'", str42, "Feb");
        org.junit.Assert.assertNotNull(intArray43);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[2, 13]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertNotNull(intArray45);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 3]");
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(localDate50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 3 + "'", int51 == 3);
        org.junit.Assert.assertNotNull(localDate53);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 1970 + "'", int59 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight60);
        org.junit.Assert.assertNotNull(dateTimeFieldType61);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(property63);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime2.withDayOfWeek(11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 11 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateMidnight dateMidnight6 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property8 = dateTime2.property(dateTimeFieldType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime2.withDayOfWeek(8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 8 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology17 = chronology13.withZone(dateTimeZone16);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay((java.lang.Object) dateTime4, chronology13);
        java.lang.String str20 = monthDay18.toString("35");
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.MonthDay monthDay23 = monthDay18.withPeriodAdded(readablePeriod21, 0);
        java.util.TimeZone timeZone24 = null;
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forTimeZone(timeZone24);
        org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(dateTimeZone25);
        org.joda.time.LocalDate localDate28 = localDate26.withDayOfYear(100);
        int int29 = localDate26.size();
        org.joda.time.LocalDate localDate31 = localDate26.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.DateTime dateTime34 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone33);
        org.joda.time.DateTime dateTime36 = dateTime34.minusDays((int) '#');
        int int37 = dateTime34.getWeekyear();
        org.joda.time.DateMidnight dateMidnight38 = dateTime34.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property40 = dateTime34.property(dateTimeFieldType39);
        org.joda.time.LocalDate.Property property41 = localDate31.property(dateTimeFieldType39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay43 = monthDay23.withField(dateTimeFieldType39, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'era' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35" + "'", str20, "35");
        org.junit.Assert.assertNotNull(monthDay23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 3 + "'", int29 == 3);
        org.junit.Assert.assertNotNull(localDate31);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 1970 + "'", int37 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(property41);
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MonthDay monthDay7 = new org.joda.time.MonthDay(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property13 = dateTime12.hourOfDay();
        org.joda.time.DateTime dateTime15 = dateTime12.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.MonthDay monthDay17 = monthDay7.withChronologyRetainFields(chronology16);
        org.joda.time.DurationField durationField18 = chronology16.days();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(32769, 32770, 10, 2730, 0, 12, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2730 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(durationField18);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set((int) (byte) 0, (int) (byte) 1);
        java.util.Calendar.Builder builder7 = builder0.setDate(59, (int) (byte) 1, 2022);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder10 = builder7.set(14399999, 239);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        java.lang.StringBuffer stringBuffer5 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer5, (long) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(dateTimeParser4);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        java.time.Instant instant8 = calendar1.toInstant();
        java.util.Date date9 = java.util.Date.from(instant8);
        org.joda.time.MonthDay monthDay10 = org.joda.time.MonthDay.fromDateFields(date9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.MonthDay monthDay12 = monthDay10.minus(readablePeriod11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate.Property property16 = localDate15.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            int int17 = monthDay10.compareTo((org.joda.time.ReadablePartial) localDate15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572119177,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=19,MILLISECOND=177,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Fri Feb 11 09:35:19 UTC 2022");
        org.junit.Assert.assertNotNull(monthDay10);
        org.junit.Assert.assertNotNull(monthDay12);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        org.joda.time.MutableDateTime mutableDateTime5 = dateTime2.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime2.withMinuteOfHour(239);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 239 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateTime dateTime7 = dateTime2.minusMillis((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.plus(readablePeriod11);
        boolean boolean13 = dateTime2.isEqual((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate((java.lang.Object) dateTime2);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = localDate14.getValue((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 120");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.Chronology chronology15 = dateTime2.getChronology();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime17 = dateTime2.minus(readablePeriod16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime17.withHourOfDay(32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        org.joda.time.Chronology chronology5 = dateTimeFormatter3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.parse("Taiwan", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNull(chronology5);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime10.hourOfDay();
        org.joda.time.DateTime dateTime13 = dateTime10.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology18 = chronology14.withZone(dateTimeZone17);
        java.lang.String str19 = chronology14.toString();
        org.joda.time.DurationField durationField20 = chronology14.seconds();
        org.joda.time.DateTimeField dateTimeField21 = chronology14.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((int) ' ', (int) (short) 100, 1, 16, 21, (int) 'u', chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(chronology18);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ISOChronology[+52:00]" + "'", str19, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(durationField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay3 = monthDay1.minusMonths((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.MonthDay monthDay5 = monthDay1.minus(readablePeriod4);
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.MonthDay monthDay7 = monthDay1.plus(readablePeriod6);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = monthDay7.getValue(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay3);
        org.junit.Assert.assertNotNull(monthDay5);
        org.junit.Assert.assertNotNull(monthDay7);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withYearOfCentury((int) '#');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDate localDate6 = localDate4.minus(readablePeriod5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate4.getValue(70);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 70");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) 0);
        org.joda.time.LocalDate.Property property4 = localDate0.year();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((long) 4, dateTimeZone8);
        org.joda.time.DateTime dateTime10 = localDate0.toDateTime((org.joda.time.ReadableInstant) dateTime9);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long18 = dateTimeZone14.convertLocalToUTC((long) 13, true, (long) ' ');
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj11, dateTimeZone14);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime9.toMutableDateTime(dateTimeZone14);
        long long24 = dateTimeZone14.convertLocalToUTC((long) 2021, true);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-187199987L) + "'", long18 == (-187199987L));
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + (-187197979L) + "'", long24 == (-187197979L));
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("1-gen-1970 0.00.00", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=1-gen-19700.00.00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        int int7 = localDate6.getWeekyear();
        int int8 = localDate6.getMonthOfYear();
        int int9 = localDate6.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        java.util.Locale.Category category6 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        java.lang.String str8 = locale7.getLanguage();
        java.lang.String str10 = locale7.getExtension('a');
        java.util.Locale.setDefault(category6, locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap12 = calendar1.getDisplayNames(0, 2730, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572119985,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=19,MILLISECOND=985,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + category6 + "' != '" + java.util.Locale.Category.FORMAT + "'", category6.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "it" + "'", str8, "it");
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.StringBuffer stringBuffer3 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays((int) '#');
        boolean boolean9 = dateTime6.isBeforeNow();
        int int10 = dateTime6.getMinuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer3, (org.joda.time.ReadableInstant) dateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 239 + "'", int10 == 239);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.roll((int) (short) 100, 0);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property12 = dateTime11.hourOfDay();
        java.lang.String str13 = property12.getAsShortText();
        org.joda.time.DurationField durationField14 = property12.getDurationField();
        org.joda.time.DateTime dateTime16 = property12.addToCopy((long) 239);
        org.joda.time.DateTime dateTime17 = property12.roundFloorCopy();
        boolean boolean18 = calendar1.equals((java.lang.Object) property12);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572120032,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=20,MILLISECOND=32,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "3" + "'", str13, "3");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        boolean boolean49 = dateTimeFormatter48.isOffsetParsed();
        java.io.Writer writer50 = null;
        java.util.TimeZone timeZone51 = null;
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forTimeZone(timeZone51);
        org.joda.time.LocalDate localDate53 = new org.joda.time.LocalDate(dateTimeZone52);
        org.joda.time.LocalDate localDate55 = localDate53.withDayOfYear(100);
        int int56 = localDate53.size();
        org.joda.time.LocalDate localDate58 = localDate53.plusMonths(6);
        int int60 = localDate58.getValue(0);
        java.lang.String str61 = localDate58.toString();
        org.joda.time.LocalDate localDate63 = localDate58.withWeekyear(1);
        java.util.TimeZone timeZone64 = null;
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forTimeZone(timeZone64);
        org.joda.time.LocalDate localDate66 = new org.joda.time.LocalDate(dateTimeZone65);
        java.util.TimeZone timeZone67 = null;
        org.joda.time.DateTimeZone dateTimeZone68 = org.joda.time.DateTimeZone.forTimeZone(timeZone67);
        org.joda.time.LocalDate localDate69 = new org.joda.time.LocalDate(dateTimeZone68);
        org.joda.time.DateTime dateTime70 = localDate66.toDateTimeAtStartOfDay(dateTimeZone68);
        org.joda.time.DateTime dateTime71 = localDate63.toDateTimeAtCurrentTime(dateTimeZone68);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter48.printTo(writer50, (org.joda.time.ReadablePartial) localDate63);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572120046,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=20,MILLISECOND=46,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(localDate55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 3 + "'", int56 == 3);
        org.junit.Assert.assertNotNull(localDate58);
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 2022 + "'", int60 == 2022);
        org.junit.Assert.assertEquals("'" + str61 + "' != '" + "2022-08-13" + "'", str61, "2022-08-13");
        org.junit.Assert.assertNotNull(localDate63);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(dateTimeZone68);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(dateTime71);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        java.lang.String str6 = property5.getAsShortText();
        org.joda.time.MonthDay monthDay7 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay9 = monthDay7.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField11 = monthDay9.getField((int) (byte) 0);
        java.util.Locale locale15 = new java.util.Locale("", "", "hi!");
        int int16 = dateTimeField11.getMaximumTextLength(locale15);
        long long19 = dateTimeField11.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay20 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay22 = monthDay20.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.MonthDay monthDay24 = monthDay20.minus(readablePeriod23);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField29 = monthDay27.getField((int) (byte) 0);
        java.util.Locale locale33 = new java.util.Locale("", "", "hi!");
        int int34 = dateTimeField29.getMaximumTextLength(locale33);
        java.lang.String str35 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) monthDay20, locale33);
        int int36 = property5.getMaximumTextLength(locale33);
        org.joda.time.DateTimeField dateTimeField37 = property5.getField();
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(locale38);
        int int40 = property5.getMaximumTextLength(locale38);
        int int41 = property5.getLeapAmount();
        int int42 = property5.get();
        org.joda.time.DateTime dateTime44 = property5.addWrapFieldToCopy((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime46 = property5.setCopy((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3" + "'", str6, "3");
        org.junit.Assert.assertNotNull(monthDay9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9L + "'", long19 == 9L);
        org.junit.Assert.assertNotNull(monthDay22);
        org.junit.Assert.assertNotNull(monthDay24);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Feb" + "'", str35, "Feb");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar39);
// flaky:         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=1644572120091,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=20,MILLISECOND=91,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 0 + "'", int41 == 0);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 3 + "'", int42 == 3);
        org.junit.Assert.assertNotNull(dateTime44);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        boolean boolean49 = dateTimeFormatter48.isOffsetParsed();
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.DateTime dateTime52 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone51);
        org.joda.time.DateTime dateTime54 = dateTime52.minusDays((int) '#');
        org.joda.time.MutableDateTime mutableDateTime55 = dateTime52.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            int int58 = dateTimeFormatter48.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime55, "janvier", (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572120172,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=20,MILLISECOND=172,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(mutableDateTime55);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        java.lang.Object obj0 = null;
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long7 = dateTimeZone3.convertLocalToUTC((long) 13, true, (long) ' ');
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(obj0, dateTimeZone3);
        org.joda.time.DateTimeZone.setDefault(dateTimeZone3);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate10.getValue(11);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 11");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + (-187199987L) + "'", long7 == (-187199987L));
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        int int10 = localDate9.getDayOfYear();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 364 + "'", int10 == 364);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.MonthDay monthDay11 = monthDay1.withChronologyRetainFields(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.clockhourOfHalfday();
        long long15 = dateTimeField12.add((long) '4', (long) (byte) 0);
        java.lang.String str17 = dateTimeField12.getAsShortText((long) 'u');
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(dateTimeZone19);
        org.joda.time.MonthDay monthDay22 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay24 = monthDay22.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField26 = monthDay24.getField((int) (byte) 0);
        java.util.Locale locale30 = new java.util.Locale("", "", "hi!");
        int int31 = dateTimeField26.getMaximumTextLength(locale30);
        long long34 = dateTimeField26.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay35 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay37 = monthDay35.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.MonthDay monthDay39 = monthDay35.minus(readablePeriod38);
        org.joda.time.MonthDay monthDay40 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay42 = monthDay40.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField44 = monthDay42.getField((int) (byte) 0);
        java.util.Locale locale48 = new java.util.Locale("", "", "hi!");
        int int49 = dateTimeField44.getMaximumTextLength(locale48);
        java.lang.String str50 = dateTimeField26.getAsShortText((org.joda.time.ReadablePartial) monthDay35, locale48);
        int[] intArray51 = monthDay35.getValues();
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.MonthDay monthDay54 = monthDay35.withPeriodAdded(readablePeriod52, 59);
        int[] intArray55 = monthDay35.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray57 = dateTimeField12.addWrapPartial((org.joda.time.ReadablePartial) localDate20, (int) (byte) 10, intArray55, 23);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(monthDay11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 52L + "'", long15 == 52L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "4" + "'", str17, "4");
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(monthDay24);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertEquals(locale30.toString(), "");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 9 + "'", int31 == 9);
        org.junit.Assert.assertTrue("'" + long34 + "' != '" + 9L + "'", long34 == 9L);
        org.junit.Assert.assertNotNull(monthDay37);
        org.junit.Assert.assertNotNull(monthDay39);
        org.junit.Assert.assertNotNull(monthDay42);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertEquals(locale48.toString(), "");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 9 + "'", int49 == 9);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "Feb" + "'", str50, "Feb");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[2, 13]");
        org.junit.Assert.assertNotNull(monthDay54);
        org.junit.Assert.assertNotNull(intArray55);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray55), "[2, 13]");
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int9 = localDate7.getValue(0);
        java.lang.String str10 = localDate7.toString();
        org.joda.time.LocalDate localDate12 = localDate7.withWeekyear(1);
        org.joda.time.LocalDate localDate14 = localDate7.withDayOfYear((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = localDate14.withMonthOfYear(2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-08-13" + "'", str10, "2022-08-13");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear(100);
        org.joda.time.LocalDate.Property property11 = localDate8.dayOfMonth();
        org.joda.time.DateTime dateTime12 = localDate8.toDateTimeAtStartOfDay();
        org.joda.time.LocalTime localTime13 = null;
        org.joda.time.DateTime dateTime14 = localDate8.toDateTime(localTime13);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDate8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNull(int5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        long long6 = java.util.Date.UTC(365, 7, 14399, (int) (byte) 10, 8, 32770);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 10571714050000L + "'", long6 == 10571714050000L);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter48.withZoneUTC();
        org.joda.time.ReadablePartial readablePartial50 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str51 = dateTimeFormatter48.print(readablePartial50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572120576,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=20,MILLISECOND=576,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        boolean boolean5 = dateTimeFormatter3.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withDefaultYear(0);
        org.joda.time.format.DateTimeParser dateTimeParser8 = dateTimeFormatter7.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.parse("3", dateTimeFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimeParser8);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfCentury();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localDate9.toDateTime(readableInstant11);
        org.joda.time.LocalDate.Property property13 = localDate9.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localDate9.getValue((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 35");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        org.joda.time.DateTimeZone dateTimeZone49 = dateTimeFormatter2.getZone();
        java.lang.Appendable appendable50 = null;
        org.joda.time.ReadableInstant readableInstant51 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable50, readableInstant51);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572120726,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=20,MILLISECOND=726,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNull(dateTimeZone49);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        int int15 = dateTime2.getSecondOfMinute();
        java.util.Date date16 = dateTime2.toDate();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 59 + "'", int15 == 59);
        org.junit.Assert.assertNotNull(date16);
        org.junit.Assert.assertEquals(date16.toString(), "Wed Dec 31 23:59:59 UTC 1969");
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.util.Date date3 = new java.util.Date(0, 0, (int) '4');
        date3.setDate(12);
        date3.setHours(2922789);
        date3.setTime(9L);
        java.util.Date date13 = new java.util.Date(0, 0, (int) '4');
        int int14 = date13.getHours();
        boolean boolean15 = date3.before(date13);
        java.lang.String str16 = date3.toLocaleString();
        int int17 = date3.getDay();
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.MonthDay monthDay22 = monthDay18.minus(readablePeriod21);
        java.lang.String str23 = monthDay18.toString();
        org.joda.time.MonthDay.Property property24 = monthDay18.monthOfYear();
        boolean boolean25 = date3.equals((java.lang.Object) property24);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertEquals(date13.toString(), "Wed Feb 21 00:00:00 UTC 1900");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1-gen-1970 0.00.00" + "'", str16, "1-gen-1970 0.00.00");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(monthDay22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "--02-13" + "'", str23, "--02-13");
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField13 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfDay();
        long long19 = chronology8.getDateTimeMillis((-1), 8, 2, 17);
        org.joda.time.MonthDay monthDay20 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay22 = monthDay20.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField24 = monthDay22.getField((int) (byte) 0);
        java.util.Locale locale28 = new java.util.Locale("", "", "hi!");
        int int29 = dateTimeField24.getMaximumTextLength(locale28);
        long long32 = dateTimeField24.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay33 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay35 = monthDay33.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.MonthDay monthDay37 = monthDay33.minus(readablePeriod36);
        org.joda.time.MonthDay monthDay38 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay40 = monthDay38.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField42 = monthDay40.getField((int) (byte) 0);
        java.util.Locale locale46 = new java.util.Locale("", "", "hi!");
        int int47 = dateTimeField42.getMaximumTextLength(locale46);
        java.lang.String str48 = dateTimeField24.getAsShortText((org.joda.time.ReadablePartial) monthDay33, locale46);
        int[] intArray49 = monthDay33.getValues();
        int[] intArray51 = chronology8.get((org.joda.time.ReadablePartial) monthDay33, (long) 4);
        org.joda.time.ReadablePeriod readablePeriod52 = null;
        org.joda.time.MonthDay monthDay53 = monthDay33.plus(readablePeriod52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType55 = monthDay33.getFieldType((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-62180539199983L) + "'", long19 == (-62180539199983L));
        org.junit.Assert.assertNotNull(monthDay22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9L + "'", long32 == 9L);
        org.junit.Assert.assertNotNull(monthDay35);
        org.junit.Assert.assertNotNull(monthDay37);
        org.junit.Assert.assertNotNull(monthDay40);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Feb" + "'", str48, "Feb");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[2, 13]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 3]");
        org.junit.Assert.assertNotNull(monthDay53);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays((int) '#');
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime6.toDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime18 = dateTime6.plusWeeks(5);
        org.joda.time.Chronology chronology19 = dateTime6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withChronology(chronology19);
        // The following exception was thrown during execution in test generation
        try {
            long long22 = dateTimeFormatter2.parseMillis("eras");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property16 = dateTime10.property(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate7.property(dateTimeFieldType15);
        org.joda.time.LocalDate localDate18 = property17.roundCeilingCopy();
        int int19 = localDate18.getDayOfYear();
        org.joda.time.LocalDate localDate21 = localDate18.plusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = localDate18.toDateTimeAtMidnight();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 229 + "'", int19 == 229);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.MonthDay monthDay17 = monthDay13.minus(readablePeriod16);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        java.lang.String str28 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) monthDay13, locale26);
        int[] intArray29 = monthDay13.getValues();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay32 = monthDay13.withPeriodAdded(readablePeriod30, 59);
        org.joda.time.MonthDay monthDay34 = monthDay13.minusDays(59);
        java.util.Date date40 = new java.util.Date(0, 32770, 5, 0, (int) (short) 10);
        long long41 = date40.getTime();
        long long42 = date40.getTime();
        boolean boolean43 = monthDay13.equals((java.lang.Object) date40);
        java.util.Date date44 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int45 = date40.compareTo(date44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feb" + "'", str28, "Feb");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[2, 13]");
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertEquals(date40.toString(), "Fri Nov 05 00:10:00 UTC 4630");
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 83968099800000L + "'", long41 == 83968099800000L);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 83968099800000L + "'", long42 == 83968099800000L);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("de-DE");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder3.setRegion("11 f\351vr. 2022 09:35:18");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 11 fe?vr. 2022 09:35:18 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("Taiwan");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setUnicodeLocaleKeyword("4", "Feb");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 4 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateTime dateTime7 = dateTime2.minusMillis((int) (short) 0);
        org.joda.time.DateTime.Property property8 = dateTime7.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = dateTime7.withDayOfYear(14399);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14399 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        org.joda.time.MonthDay monthDay11 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay13 = monthDay11.minusMonths((int) (byte) 0);
        org.joda.time.MonthDay monthDay14 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay16 = monthDay14.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField18 = monthDay16.getField((int) (byte) 0);
        java.util.Locale locale22 = new java.util.Locale("", "", "hi!");
        int int23 = dateTimeField18.getMaximumTextLength(locale22);
        long long26 = dateTimeField18.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay27 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay29 = monthDay27.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay31 = monthDay27.minus(readablePeriod30);
        org.joda.time.MonthDay monthDay32 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay34 = monthDay32.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField36 = monthDay34.getField((int) (byte) 0);
        java.util.Locale locale40 = new java.util.Locale("", "", "hi!");
        int int41 = dateTimeField36.getMaximumTextLength(locale40);
        java.lang.String str42 = dateTimeField18.getAsShortText((org.joda.time.ReadablePartial) monthDay27, locale40);
        int[] intArray43 = monthDay27.getValues();
        int int44 = dateTimeField4.getMinimumValue((org.joda.time.ReadablePartial) monthDay11, intArray43);
        long long46 = dateTimeField4.remainder((-60526224000001L));
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(monthDay16);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertEquals(locale22.toString(), "");
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 9 + "'", int23 == 9);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 9L + "'", long26 == 9L);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay31);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertNotNull(dateTimeField36);
        org.junit.Assert.assertEquals(locale40.toString(), "");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 9 + "'", int41 == 9);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "Feb" + "'", str42, "Feb");
        org.junit.Assert.assertNotNull(intArray43);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray43), "[2, 13]");
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 1 + "'", int44 == 1);
        org.junit.Assert.assertTrue("'" + long46 + "' != '" + 2678399999L + "'", long46 == 2678399999L);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.MonthDay monthDay4 = monthDay0.minus(readablePeriod3);
        java.lang.String str5 = monthDay0.toString();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear(100);
        org.joda.time.Interval interval11 = localDate10.toInterval();
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.days();
        java.lang.String str13 = durationFieldType12.getName();
        org.joda.time.LocalDate localDate15 = localDate10.withFieldAdded(durationFieldType12, 32770);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate17 = localDate10.plus(readablePeriod16);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = monthDay0.isAfter((org.joda.time.ReadablePartial) localDate17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(monthDay4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--02-13" + "'", str5, "--02-13");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "days" + "'", str13, "days");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        java.lang.StringBuffer stringBuffer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer7, (long) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.util.Date date5 = new java.util.Date(32772, 1439, 21, (int) (short) 0, 59);
        java.lang.String str6 = date5.toString();
        org.junit.Assert.assertEquals(date5.toString(), "Sat Dec 21 00:59:00 UTC 34791");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Sat Dec 21 00:59:00 UTC 34791" + "'", str6, "Sat Dec 21 00:59:00 UTC 34791");
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(1644572109112L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField3 = monthDay1.getField((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(70, (int) (byte) 100, 0, chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
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
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property13 = dateTime2.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay14 = new org.joda.time.MonthDay((java.lang.Object) property13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.withMillisOfDay(8);
        boolean boolean11 = dateTime4.isAfter((long) 17);
        org.joda.time.Instant instant12 = dateTime4.toInstant();
        org.joda.time.DateTime.Property property13 = dateTime4.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = property13.setCopy("days");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"days\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(instant12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.minusDays((int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime4.withEra(229);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 229 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        boolean boolean5 = dateTimeFormatter3.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = dateTimeFormatter7.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay9 = org.joda.time.MonthDay.parse("Property[monthOfYear]", dateTimeFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
        org.junit.Assert.assertNull(dateTimePrinter8);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.MonthDay monthDay13 = org.joda.time.MonthDay.now(chronology8);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.hourOfHalfday();
        java.util.Locale locale17 = java.util.Locale.PRC;
        java.util.Locale locale18 = java.util.Locale.CANADA;
        java.lang.String str19 = locale17.getDisplayScript(locale18);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = dateTimeField14.set((long) 2021, "Property[monthOfYear]", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Property[monthOfYear]\" for hourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property16 = dateTime10.property(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate7.property(dateTimeFieldType15);
        java.lang.String str18 = localDate7.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = localDate7.withField(dateTimeFieldType19, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "2022-08-13" + "'", str18, "2022-08-13");
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("2022-02-11");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime3 = dateTime1.withYearOfCentury((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfCentury();
        org.joda.time.ReadableInstant readableInstant11 = null;
        org.joda.time.DateTime dateTime12 = localDate9.toDateTime(readableInstant11);
        int int13 = localDate9.getEra();
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate16.withDayOfYear(100);
        int int19 = localDate16.size();
        org.joda.time.LocalDate localDate21 = localDate16.plusMonths(3);
        org.joda.time.LocalDate localDate22 = localDate9.withFields((org.joda.time.ReadablePartial) localDate21);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.dayOfYear();
        boolean boolean24 = localDate9.isSupported(dateTimeFieldType23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone26);
        org.joda.time.LocalDate localDate29 = localDate27.withDayOfYear(100);
        org.joda.time.Interval interval30 = localDate29.toInterval();
        org.joda.time.DurationFieldType durationFieldType31 = org.joda.time.DurationFieldType.days();
        java.lang.String str32 = durationFieldType31.getName();
        org.joda.time.LocalDate localDate34 = localDate29.withFieldAdded(durationFieldType31, 32770);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime37.minusDays((int) '#');
        int int40 = dateTime37.getWeekyear();
        org.joda.time.DateMidnight dateMidnight41 = dateTime37.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType42 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property43 = dateTime37.property(dateTimeFieldType42);
        boolean boolean44 = localDate29.isSupported(dateTimeFieldType42);
        org.joda.time.DurationFieldType durationFieldType45 = dateTimeFieldType42.getDurationType();
        java.lang.String str46 = durationFieldType45.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate48 = localDate9.withFieldAdded(durationFieldType45, 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 3 + "'", int19 == 3);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "days" + "'", str32, "days");
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 1970 + "'", int40 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertNotNull(dateTimeFieldType42);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(durationFieldType45);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "eras" + "'", str46, "eras");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.roll(9, false);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.setWeekDate(21, (int) (short) 0, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 117");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=22,MILLISECOND=471,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(2730, 365, 1439, 0, (int) 'a', 349260000, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(0L);
        java.lang.String str2 = monthDay1.toString();
        org.joda.time.Chronology chronology3 = monthDay1.getChronology();
        org.joda.time.Chronology chronology4 = monthDay1.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = chronology4.minuteOfHour();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = chronology4.get(readablePeriod6, (long) 5, (-187197979L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--01-03" + "'", str2, "--01-03");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.util.Date date0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay1 = org.joda.time.MonthDay.fromDateFields(date0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The date must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtStartOfDay(dateTimeZone4);
        java.util.Date date7 = dateTime6.toDate();
        java.lang.Class<?> wildcardClass8 = date7.getClass();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Feb 10 20:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(wildcardClass8);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = property5.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate9 = property5.roundHalfFloorCopy();
        java.util.Locale locale11 = java.util.Locale.JAPANESE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = property5.setCopy("366", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 366 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ja");
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays((int) '#');
        int int15 = dateTime12.getWeekyear();
        org.joda.time.DateMidnight dateMidnight16 = dateTime12.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property18 = dateTime12.property(dateTimeFieldType17);
        boolean boolean19 = localDate4.isSupported(dateTimeFieldType17);
        java.util.TimeZone timeZone20 = null;
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forTimeZone(timeZone20);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate22.withDayOfYear(100);
        org.joda.time.LocalDate.Property property25 = localDate22.dayOfMonth();
        org.joda.time.LocalDate localDate26 = property25.getLocalDate();
        org.joda.time.LocalDate localDate28 = property25.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate29 = property25.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property25.getFieldType();
        boolean boolean31 = localDate4.equals((java.lang.Object) property25);
        java.lang.String str32 = property25.getAsText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate34 = property25.setCopy(14399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14399999 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "13" + "'", str32, "13");
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.setRegion("Feb");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: Feb [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set((int) (byte) 0, (int) (byte) 1);
        java.util.Calendar.Builder builder7 = builder3.setTimeOfDay((int) 'x', (int) ' ', 0);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder9 = builder7.setInstant((long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = property5.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate9 = property5.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property5.getFieldType();
        org.joda.time.LocalDate localDate11 = property5.getLocalDate();
        org.joda.time.LocalDate localDate13 = localDate11.withYear((int) ' ');
        org.joda.time.LocalDate localDate15 = localDate13.withYear((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property17 = localDate13.property(dateTimeFieldType16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.withYearOfEra((int) ' ');
        java.util.Locale locale10 = java.util.Locale.FRENCH;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        java.lang.String str12 = locale10.getCountry();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime17.hourOfDay();
        java.lang.String str19 = property18.getAsShortText();
        org.joda.time.MonthDay monthDay20 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay22 = monthDay20.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField24 = monthDay22.getField((int) (byte) 0);
        java.util.Locale locale28 = new java.util.Locale("", "", "hi!");
        int int29 = dateTimeField24.getMaximumTextLength(locale28);
        long long32 = dateTimeField24.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay33 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay35 = monthDay33.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.MonthDay monthDay37 = monthDay33.minus(readablePeriod36);
        org.joda.time.MonthDay monthDay38 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay40 = monthDay38.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField42 = monthDay40.getField((int) (byte) 0);
        java.util.Locale locale46 = new java.util.Locale("", "", "hi!");
        int int47 = dateTimeField42.getMaximumTextLength(locale46);
        java.lang.String str48 = dateTimeField24.getAsShortText((org.joda.time.ReadablePartial) monthDay33, locale46);
        int int49 = property18.getMaximumTextLength(locale46);
        java.lang.String str50 = locale10.getDisplayVariant(locale46);
        java.util.Locale locale51 = java.util.Locale.ITALIAN;
        java.lang.String str52 = locale46.getDisplayScript(locale51);
        java.util.Calendar calendar53 = dateTime9.toCalendar(locale46);
        // The following exception was thrown during execution in test generation
        try {
            int int55 = calendar53.getGreatestMinimum((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1644572123419,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=23,MILLISECOND=419,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "3" + "'", str19, "3");
        org.junit.Assert.assertNotNull(monthDay22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9L + "'", long32 == 9L);
        org.junit.Assert.assertNotNull(monthDay35);
        org.junit.Assert.assertNotNull(monthDay37);
        org.junit.Assert.assertNotNull(monthDay40);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Feb" + "'", str48, "Feb");
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 2 + "'", int49 == 2);
        org.junit.Assert.assertEquals("'" + str50 + "' != '" + "" + "'", str50, "");
        org.junit.Assert.assertNotNull(locale51);
        org.junit.Assert.assertEquals(locale51.toString(), "it");
        org.junit.Assert.assertEquals("'" + str52 + "' != '" + "" + "'", str52, "");
        org.junit.Assert.assertNotNull(calendar53);
        org.junit.Assert.assertEquals(calendar53.toString(), "java.util.GregorianCalendar[time=-61157376000001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=32,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        java.io.Writer writer5 = null;
        org.joda.time.MonthDay monthDay6 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay8 = monthDay6.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField10 = monthDay8.getField((int) (byte) 0);
        java.util.Locale locale14 = new java.util.Locale("", "", "hi!");
        int int15 = dateTimeField10.getMaximumTextLength(locale14);
        long long18 = dateTimeField10.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay19 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay21 = monthDay19.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.MonthDay monthDay23 = monthDay19.minus(readablePeriod22);
        org.joda.time.MonthDay monthDay24 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay26 = monthDay24.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField28 = monthDay26.getField((int) (byte) 0);
        java.util.Locale locale32 = new java.util.Locale("", "", "hi!");
        int int33 = dateTimeField28.getMaximumTextLength(locale32);
        java.lang.String str34 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) monthDay19, locale32);
        int[] intArray35 = monthDay19.getValues();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.MonthDay monthDay38 = monthDay19.withPeriodAdded(readablePeriod36, 59);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer5, (org.joda.time.ReadablePartial) monthDay38);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(monthDay8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9L + "'", long18 == 9L);
        org.junit.Assert.assertNotNull(monthDay21);
        org.junit.Assert.assertNotNull(monthDay23);
        org.junit.Assert.assertNotNull(monthDay26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Feb" + "'", str34, "Feb");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[2, 13]");
        org.junit.Assert.assertNotNull(monthDay38);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = localDate2.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = localDate2.toInterval(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
        org.junit.Assert.assertNotNull(interval8);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        boolean boolean5 = dateTimeFormatter3.isParser();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime10.hourOfDay();
        java.lang.String str12 = property11.getAsShortText();
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField17 = monthDay15.getField((int) (byte) 0);
        java.util.Locale locale21 = new java.util.Locale("", "", "hi!");
        int int22 = dateTimeField17.getMaximumTextLength(locale21);
        long long25 = dateTimeField17.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay26 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay28 = monthDay26.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.MonthDay monthDay30 = monthDay26.minus(readablePeriod29);
        org.joda.time.MonthDay monthDay31 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay33 = monthDay31.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField35 = monthDay33.getField((int) (byte) 0);
        java.util.Locale locale39 = new java.util.Locale("", "", "hi!");
        int int40 = dateTimeField35.getMaximumTextLength(locale39);
        java.lang.String str41 = dateTimeField17.getAsShortText((org.joda.time.ReadablePartial) monthDay26, locale39);
        int int42 = property11.getMaximumTextLength(locale39);
        org.joda.time.DateTimeField dateTimeField43 = property11.getField();
        java.util.Locale locale44 = java.util.Locale.FRENCH;
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale44);
        int int46 = property11.getMaximumTextLength(locale44);
        boolean boolean47 = locale44.hasExtensions();
        java.lang.String str48 = locale44.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter3.withLocale(locale44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter49.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay51 = org.joda.time.MonthDay.parse("1-gen-1970 0.00.00", dateTimeFormatter50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3" + "'", str12, "3");
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9L + "'", long25 == 9L);
        org.junit.Assert.assertNotNull(monthDay28);
        org.junit.Assert.assertNotNull(monthDay30);
        org.junit.Assert.assertNotNull(monthDay33);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Feb" + "'", str41, "Feb");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar45);
// flaky:         org.junit.Assert.assertEquals(calendar45.toString(), "java.util.GregorianCalendar[time=1644572123676,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=23,MILLISECOND=676,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        java.time.Instant instant8 = calendar1.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar1.getActualMaximum((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572123741,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=23,MILLISECOND=741,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(instant8);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("14399");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.LocalDate.Property property10 = localDate9.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate9.withYearOfCentury(43199999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 43199999 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateMidnight dateMidnight6 = dateTime2.toDateMidnight();
        java.util.Locale locale8 = java.util.Locale.CANADA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = dateTime2.toString("eras", locale8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: r");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "en_CA");
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        java.io.Writer writer5 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime10.hourOfDay();
        org.joda.time.DateTime dateTime13 = dateTime10.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology14 = dateTime13.getChronology();
        org.joda.time.DateTime dateTime16 = dateTime13.withMinuteOfHour(8);
        org.joda.time.DateTime dateTime18 = dateTime13.withCenturyOfEra(0);
        org.joda.time.DateTime dateTime20 = dateTime18.withCenturyOfEra((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer5, (org.joda.time.ReadableInstant) dateTime20);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.roll(9, false);
        java.lang.Object obj5 = null;
        boolean boolean6 = calendar1.after(obj5);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = calendar1.getMaximum((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=23,MILLISECOND=943,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter2.withPivotYear(70);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime10.hourOfDay();
        org.joda.time.DateTime dateTime13 = dateTime10.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime15 = dateTime10.withYearOfEra((int) ' ');
        int int16 = dateTime10.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime19 = dateTime10.withDurationAdded(readableDuration17, (int) (byte) -1);
        org.joda.time.DateTime dateTime21 = dateTime19.plusHours(229);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = dateTimeFormatter5.print((org.joda.time.ReadableInstant) dateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.MonthDay monthDay13 = org.joda.time.MonthDay.now(chronology8);
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray17 = chronology8.get(readablePeriod14, (long) 32772, (long) 292278994);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(monthDay13);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.addUnicodeLocaleAttribute("\u4e00\u6708");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ?? [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property13 = dateTime2.centuryOfEra();
        java.lang.String str14 = property13.getAsShortText();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime17.minusDays((int) '#');
        int int20 = dateTime17.getWeekyear();
        org.joda.time.DateTime dateTime22 = dateTime17.minusMillis((int) (short) 0);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.DateTime dateTime24 = dateTime17.plus(readablePeriod23);
        int int25 = property13.compareTo((org.joda.time.ReadableInstant) dateTime24);
        org.joda.time.DateTime dateTime27 = property13.addToCopy((long) 11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = dateTime27.withSecondOfMinute((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "19" + "'", str14, "19");
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1970 + "'", int20 == 1970);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 0 + "'", int25 == 0);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.withYearOfEra((int) ' ');
        int int10 = dateTime4.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration11 = null;
        org.joda.time.DateTime dateTime13 = dateTime4.withDurationAdded(readableDuration11, (int) (byte) -1);
        org.joda.time.DateTime dateTime15 = dateTime13.plusHours(229);
        int int16 = dateTime13.getYearOfCentury();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 52 + "'", int10 == 52);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 52 + "'", int16 == 52);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 10);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, (long) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology17 = chronology13.withZone(dateTimeZone16);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay((java.lang.Object) dateTime4, chronology13);
        java.lang.String str20 = monthDay18.toString("35");
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.MonthDay monthDay23 = monthDay18.withPeriodAdded(readablePeriod21, 0);
        int int24 = monthDay18.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType26 = monthDay18.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "35" + "'", str20, "35");
        org.junit.Assert.assertNotNull(monthDay23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 29 + "'", int24 == 29);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-08-13", (double) 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=32769.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        org.joda.time.MonthDay monthDay3 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay5 = monthDay3.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField7 = monthDay5.getField((int) (byte) 0);
        java.util.Locale locale11 = new java.util.Locale("", "", "hi!");
        int int12 = dateTimeField7.getMaximumTextLength(locale11);
        long long15 = dateTimeField7.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay16 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay18 = monthDay16.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod19 = null;
        org.joda.time.MonthDay monthDay20 = monthDay16.minus(readablePeriod19);
        org.joda.time.MonthDay monthDay21 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay23 = monthDay21.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField25 = monthDay23.getField((int) (byte) 0);
        java.util.Locale locale29 = new java.util.Locale("", "", "hi!");
        int int30 = dateTimeField25.getMaximumTextLength(locale29);
        java.lang.String str31 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) monthDay16, locale29);
        int[] intArray32 = monthDay16.getValues();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.MonthDay monthDay35 = monthDay16.withPeriodAdded(readablePeriod33, 59);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone37);
        org.joda.time.DateTime dateTime40 = dateTime38.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property41 = dateTime40.hourOfDay();
        org.joda.time.DateTime dateTime43 = dateTime40.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology44 = dateTime43.getChronology();
        org.joda.time.DateTimeZone dateTimeZone47 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology48 = chronology44.withZone(dateTimeZone47);
        org.joda.time.MonthDay monthDay49 = org.joda.time.MonthDay.now(chronology44);
        org.joda.time.DateTimeField dateTimeField50 = chronology44.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField51 = chronology44.year();
        org.joda.time.DateTimeField dateTimeField52 = chronology44.minuteOfDay();
        org.joda.time.MonthDay monthDay53 = monthDay35.withChronologyRetainFields(chronology44);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate54 = new org.joda.time.LocalDate(16, 32769, (int) (short) 1, chronology44);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay5);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals(locale11.toString(), "");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 9 + "'", int12 == 9);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 9L + "'", long15 == 9L);
        org.junit.Assert.assertNotNull(monthDay18);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(monthDay23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertEquals(locale29.toString(), "");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 9 + "'", int30 == 9);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Feb" + "'", str31, "Feb");
        org.junit.Assert.assertNotNull(intArray32);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray32), "[2, 13]");
        org.junit.Assert.assertNotNull(monthDay35);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeZone47);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(monthDay49);
        org.junit.Assert.assertNotNull(dateTimeField50);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertNotNull(dateTimeField52);
        org.junit.Assert.assertNotNull(monthDay53);
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        java.util.Locale locale4 = java.util.Locale.FRENCH;
        java.util.Calendar calendar5 = java.util.Calendar.getInstance(locale4);
        calendar5.setLenient(true);
        calendar5.set((-1), 0, 32770, (int) 'u', (int) (byte) -1, 1439);
        calendar5.set(3, 16, 0);
        int int19 = calendar1.compareTo(calendar5);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572124521,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=24,MILLISECOND=521,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar5);
// flaky:         org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=3,MONTH=16,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=0,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=117,MINUTE=-1,SECOND=1439,MILLISECOND=521,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int9 = localDate7.getValue(0);
        java.lang.String str10 = localDate7.toString();
        org.joda.time.LocalDate localDate12 = localDate7.withWeekyear(1);
        org.joda.time.LocalDate localDate14 = localDate7.withDayOfYear((int) (byte) 1);
        int int15 = localDate7.getYear();
        java.util.TimeZone timeZone16 = null;
        org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.forTimeZone(timeZone16);
        org.joda.time.LocalDate localDate18 = new org.joda.time.LocalDate(dateTimeZone17);
        org.joda.time.LocalDate localDate20 = localDate18.withDayOfYear(100);
        int int21 = localDate18.size();
        org.joda.time.LocalDate localDate23 = localDate18.plusMonths(6);
        int int25 = localDate23.getValue(0);
        boolean boolean26 = localDate7.equals((java.lang.Object) int25);
        org.joda.time.LocalDate localDate28 = localDate7.withDayOfYear((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate((java.lang.Object) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-08-13" + "'", str10, "2022-08-13");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(localDate28);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        int int5 = dateTime2.getDayOfWeek();
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear(100);
        int int11 = localDate8.size();
        org.joda.time.LocalDate localDate13 = localDate8.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusDays((int) '#');
        int int19 = dateTime16.getWeekyear();
        org.joda.time.DateMidnight dateMidnight20 = dateTime16.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property22 = dateTime16.property(dateTimeFieldType21);
        org.joda.time.LocalDate.Property property23 = localDate13.property(dateTimeFieldType21);
        boolean boolean24 = dateTime2.equals((java.lang.Object) property23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str26 = dateTime2.toString("Feb");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: F");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 6 + "'", int5 == 6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 3 + "'", int11 == 3);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        boolean boolean10 = dateTimeZone8.isStandardOffset(10L);
        java.lang.Object obj11 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long18 = dateTimeZone14.convertLocalToUTC((long) 13, true, (long) ' ');
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(obj11, dateTimeZone14);
        org.joda.time.DateTime dateTime20 = dateTime19.toDateTime();
        int int21 = dateTimeZone8.getOffset((org.joda.time.ReadableInstant) dateTime19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(365, 0, 11, 17, 10, 239, 16, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 239 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + (-187199987L) + "'", long18 == (-187199987L));
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 10 + "'", int21 == 10);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateMidnight dateMidnight6 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property8 = dateTime2.property(dateTimeFieldType7);
        org.joda.time.DateTime dateTime10 = dateTime2.minusWeeks(17);
        org.joda.time.MutableDateTime mutableDateTime11 = dateTime10.toMutableDateTime();
        org.joda.time.MutableDateTime mutableDateTime12 = mutableDateTime11.toMutableDateTimeISO();
        org.joda.time.MonthDay monthDay14 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property15 = monthDay14.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        int int17 = mutableDateTime12.get(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(mutableDateTime11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(14, 1970, 0, 365, 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        boolean boolean49 = dateTimeFormatter48.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime51 = dateTimeFormatter48.parseDateTime("\u4e00\u6708");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572124987,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=24,MILLISECOND=987,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        java.lang.String str6 = property5.getAsShortText();
        int int7 = property5.getMaximumValue();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3" + "'", str6, "3");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 23 + "'", int7 == 23);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.MonthDay monthDay11 = monthDay1.withChronologyRetainFields(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay13 = monthDay1.withMonthOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(monthDay11);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        java.lang.String str4 = monthDay0.toString("23");
        java.lang.Object obj5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(obj5, dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = monthDay0.compareTo((org.joda.time.ReadablePartial) localDate7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "23" + "'", str4, "23");
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.minusMinutes(52);
        org.joda.time.DateTime dateTime16 = dateTime14.minusYears(4);
        org.joda.time.DateTime dateTime18 = dateTime16.minusMonths((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime16.withWeekyear(349260000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 349260000 for weekyear must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder0.setScript("14399");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 14399 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        org.joda.time.MonthDay monthDay8 = org.joda.time.MonthDay.fromCalendarFields(calendar1);
        int int10 = calendar1.getGreatestMinimum(3);
        // The following exception was thrown during execution in test generation
        try {
            calendar1.set(21, 43199999);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572125515,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=25,MILLISECOND=515,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(monthDay8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.lang.String str2 = locale0.getCountry();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone4);
        org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property8 = dateTime7.hourOfDay();
        java.lang.String str9 = property8.getAsShortText();
        org.joda.time.MonthDay monthDay10 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay12 = monthDay10.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField14 = monthDay12.getField((int) (byte) 0);
        java.util.Locale locale18 = new java.util.Locale("", "", "hi!");
        int int19 = dateTimeField14.getMaximumTextLength(locale18);
        long long22 = dateTimeField14.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay23 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay25 = monthDay23.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.MonthDay monthDay27 = monthDay23.minus(readablePeriod26);
        org.joda.time.MonthDay monthDay28 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay30 = monthDay28.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField32 = monthDay30.getField((int) (byte) 0);
        java.util.Locale locale36 = new java.util.Locale("", "", "hi!");
        int int37 = dateTimeField32.getMaximumTextLength(locale36);
        java.lang.String str38 = dateTimeField14.getAsShortText((org.joda.time.ReadablePartial) monthDay23, locale36);
        int int39 = property8.getMaximumTextLength(locale36);
        java.lang.String str40 = locale0.getDisplayVariant(locale36);
        java.util.Locale locale41 = java.util.Locale.ITALIAN;
        java.lang.String str42 = locale36.getDisplayScript(locale41);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str44 = locale36.getExtension('4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: 4");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572125529,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=25,MILLISECOND=529,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "3" + "'", str9, "3");
        org.junit.Assert.assertNotNull(monthDay12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertEquals(locale18.toString(), "");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 9 + "'", int19 == 9);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 9L + "'", long22 == 9L);
        org.junit.Assert.assertNotNull(monthDay25);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Feb" + "'", str38, "Feb");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2 + "'", int39 == 2);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "it");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) dateTime14);
        int int16 = dateTime15.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime19.minusDays((int) '#');
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        java.util.TimeZone timeZone25 = null;
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forTimeZone(timeZone25);
        org.joda.time.LocalDate localDate27 = new org.joda.time.LocalDate(dateTimeZone26);
        org.joda.time.DateTime dateTime28 = localDate24.toDateTimeAtStartOfDay(dateTimeZone26);
        org.joda.time.DateTime dateTime29 = dateTime19.toDateTime(dateTimeZone26);
        org.joda.time.DateTime dateTime31 = dateTime19.plusWeeks(5);
        org.joda.time.Chronology chronology32 = dateTime19.getChronology();
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.DateTime dateTime34 = dateTime19.minus(readablePeriod33);
        int int35 = dateTime15.compareTo((org.joda.time.ReadableInstant) dateTime34);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime37 = dateTime34.withDayOfWeek(2021);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2021 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 70 + "'", int16 == 70);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 1 + "'", int35 == 1);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        java.util.TimeZone timeZone11 = null;
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forTimeZone(timeZone11);
        org.joda.time.MutableDateTime mutableDateTime13 = dateTime8.toMutableDateTime(dateTimeZone12);
        java.util.TimeZone timeZone14 = dateTimeZone12.toTimeZone();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(6, 0, 14, 14399, 2922789, 1439, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14399 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set((int) (byte) 0, (int) (byte) 1);
        java.util.Calendar.Builder builder7 = builder0.setDate(59, (int) (byte) 1, 2022);
        java.util.Calendar.Builder builder11 = builder0.setDate(14399, 52, 4);
        java.util.Calendar.Builder builder15 = builder0.setTimeOfDay(0, 14, (int) 'u');
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder18 = builder15.set(100, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        org.joda.time.DateTime dateTime9 = dateTime4.withDurationAdded(1L, 52);
        java.lang.String str10 = dateTime9.toString();
        java.util.Locale locale11 = java.util.Locale.FRENCH;
        java.util.Locale.setDefault(locale11);
        java.lang.String str13 = locale11.getDisplayVariant();
        java.util.Calendar calendar14 = dateTime9.toCalendar(locale11);
        int int16 = calendar14.getGreatestMinimum((int) (byte) 10);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property24 = dateTime23.hourOfDay();
        org.joda.time.DateTime dateTime26 = dateTime23.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property27 = dateTime23.yearOfCentury();
        org.joda.time.DateTime dateTime29 = dateTime23.plusWeeks(0);
        int int30 = dateTime23.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property36 = dateTime35.hourOfDay();
        org.joda.time.DateTime dateTime38 = dateTime35.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.DateTimeZone dateTimeZone42 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology43 = chronology39.withZone(dateTimeZone42);
        java.lang.String str44 = chronology39.toString();
        boolean boolean45 = dateTime23.equals((java.lang.Object) str44);
        java.util.Locale locale46 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar47 = dateTime23.toCalendar(locale46);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = calendar14.getDisplayName((int) (short) 0, 229, locale46);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0052-01-03T04:00:00.051+52:00" + "'", str10, "0052-01-03T04:00:00.051+52:00");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=-60526223999949,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=52,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=3,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=51,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 239 + "'", int30 == 239);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTimeZone42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "ISOChronology[+52:00]" + "'", str44, "ISOChronology[+52:00]");
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar47);
        org.junit.Assert.assertEquals(calendar47.toString(), "java.util.GregorianCalendar[time=-60526224000001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=52,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.minusMinutes(52);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        long long20 = dateTimeZone16.convertLocalToUTC((long) (byte) 10, true);
        org.joda.time.DateTime dateTime21 = dateTime2.withZone(dateTimeZone16);
        org.joda.time.DateTime.Property property22 = dateTime2.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = property22.setCopy("2022-02-13");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-13\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-187199990L) + "'", long20 == (-187199990L));
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(property22);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        org.joda.time.MonthDay monthDay8 = org.joda.time.MonthDay.fromCalendarFields(calendar1);
        boolean boolean10 = calendar1.isSet(2);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572125971,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=25,MILLISECOND=971,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(monthDay8);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + true + "'", boolean10 == true);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("0052-01-03T04:00:00.051+52:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '0052-01-03T04:00:00.051+52:00' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        boolean boolean5 = dateTimeFormatter3.isParser();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime8.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property11 = dateTime10.hourOfDay();
        java.lang.String str12 = property11.getAsShortText();
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField17 = monthDay15.getField((int) (byte) 0);
        java.util.Locale locale21 = new java.util.Locale("", "", "hi!");
        int int22 = dateTimeField17.getMaximumTextLength(locale21);
        long long25 = dateTimeField17.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay26 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay28 = monthDay26.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.MonthDay monthDay30 = monthDay26.minus(readablePeriod29);
        org.joda.time.MonthDay monthDay31 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay33 = monthDay31.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField35 = monthDay33.getField((int) (byte) 0);
        java.util.Locale locale39 = new java.util.Locale("", "", "hi!");
        int int40 = dateTimeField35.getMaximumTextLength(locale39);
        java.lang.String str41 = dateTimeField17.getAsShortText((org.joda.time.ReadablePartial) monthDay26, locale39);
        int int42 = property11.getMaximumTextLength(locale39);
        org.joda.time.DateTimeField dateTimeField43 = property11.getField();
        java.util.Locale locale44 = java.util.Locale.FRENCH;
        java.util.Calendar calendar45 = java.util.Calendar.getInstance(locale44);
        int int46 = property11.getMaximumTextLength(locale44);
        boolean boolean47 = locale44.hasExtensions();
        java.lang.String str48 = locale44.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter3.withLocale(locale44);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter50 = dateTimeFormatter49.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate51 = org.joda.time.LocalDate.parse("ISOChronology[Etc/UTC]", dateTimeFormatter50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "3" + "'", str12, "3");
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertEquals(locale21.toString(), "");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 9 + "'", int22 == 9);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 9L + "'", long25 == 9L);
        org.junit.Assert.assertNotNull(monthDay28);
        org.junit.Assert.assertNotNull(monthDay30);
        org.junit.Assert.assertNotNull(monthDay33);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertEquals(locale39.toString(), "");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 9 + "'", int40 == 9);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "Feb" + "'", str41, "Feb");
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2 + "'", int42 == 2);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(locale44);
        org.junit.Assert.assertEquals(locale44.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar45);
// flaky:         org.junit.Assert.assertEquals(calendar45.toString(), "java.util.GregorianCalendar[time=1644572126039,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=26,MILLISECOND=39,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 2 + "'", int46 == 2);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "" + "'", str48, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNotNull(dateTimeFormatter50);
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay1 = org.joda.time.MonthDay.parse("Jan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Jan\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        int int14 = dateTimeField4.get((-187199987L));
        long long16 = dateTimeField4.remainder((long) 'a');
        long long18 = dateTimeField4.roundFloor(0L);
        long long20 = dateTimeField4.roundHalfFloor((long) 0);
        org.joda.time.ReadablePartial readablePartial21 = null;
        org.joda.time.MonthDay monthDay23 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay25 = monthDay23.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField27 = monthDay25.getField((int) (byte) 0);
        java.util.Locale locale31 = new java.util.Locale("", "", "hi!");
        int int32 = dateTimeField27.getMaximumTextLength(locale31);
        long long35 = dateTimeField27.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay36 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay38 = monthDay36.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod39 = null;
        org.joda.time.MonthDay monthDay40 = monthDay36.minus(readablePeriod39);
        org.joda.time.MonthDay monthDay41 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay43 = monthDay41.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField45 = monthDay43.getField((int) (byte) 0);
        java.util.Locale locale49 = new java.util.Locale("", "", "hi!");
        int int50 = dateTimeField45.getMaximumTextLength(locale49);
        java.lang.String str51 = dateTimeField27.getAsShortText((org.joda.time.ReadablePartial) monthDay36, locale49);
        int[] intArray52 = monthDay36.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray54 = dateTimeField4.addWrapPartial(readablePartial21, 52, intArray52, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(monthDay25);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertEquals(locale31.toString(), "");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 9 + "'", int32 == 9);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 9L + "'", long35 == 9L);
        org.junit.Assert.assertNotNull(monthDay38);
        org.junit.Assert.assertNotNull(monthDay40);
        org.junit.Assert.assertNotNull(monthDay43);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 9 + "'", int50 == 9);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "Feb" + "'", str51, "Feb");
        org.junit.Assert.assertNotNull(intArray52);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray52), "[2, 13]");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 364);
        java.io.Writer writer9 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(writer9, (long) 365);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        boolean boolean5 = dateTimeFormatter3.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withDefaultYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.parse("0052-01-03T04:00:00.051+52:00", dateTimeFormatter7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateMidnight dateMidnight6 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property8 = dateTime2.property(dateTimeFieldType7);
        org.joda.time.DateTime.Property property9 = dateTime2.centuryOfEra();
        org.joda.time.DateTime dateTime11 = dateTime2.withCenturyOfEra(20);
        org.joda.time.format.DateTimePrinter dateTimePrinter12 = null;
        org.joda.time.format.DateTimeParser dateTimeParser13 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter12, dateTimeParser13);
        org.joda.time.Chronology chronology15 = dateTimeFormatter14.getChronology();
        boolean boolean16 = dateTimeFormatter14.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = dateTimeFormatter14.withDefaultYear(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateTime2.toString(dateTimeFormatter14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNull(chronology15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter18);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        int int14 = dateTimeField4.get((-187199987L));
        long long16 = dateTimeField4.remainder((long) 'a');
        long long18 = dateTimeField4.roundFloor(0L);
        java.util.Locale locale20 = java.util.Locale.forLanguageTag("");
        int int21 = dateTimeField4.getMaximumShortTextLength(locale20);
        org.joda.time.LocalDate localDate22 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate localDate24 = localDate22.minusMonths(32769);
        org.joda.time.LocalDate localDate26 = localDate22.withYear(9);
        org.joda.time.MonthDay monthDay28 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay30 = monthDay28.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField32 = monthDay30.getField((int) (byte) 0);
        java.util.Locale locale36 = new java.util.Locale("", "", "hi!");
        int int37 = dateTimeField32.getMaximumTextLength(locale36);
        org.joda.time.MonthDay monthDay39 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay41 = monthDay39.minusMonths((int) (byte) 0);
        org.joda.time.MonthDay monthDay42 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay44 = monthDay42.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField46 = monthDay44.getField((int) (byte) 0);
        java.util.Locale locale50 = new java.util.Locale("", "", "hi!");
        int int51 = dateTimeField46.getMaximumTextLength(locale50);
        long long54 = dateTimeField46.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay55 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay57 = monthDay55.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod58 = null;
        org.joda.time.MonthDay monthDay59 = monthDay55.minus(readablePeriod58);
        org.joda.time.MonthDay monthDay60 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay62 = monthDay60.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField64 = monthDay62.getField((int) (byte) 0);
        java.util.Locale locale68 = new java.util.Locale("", "", "hi!");
        int int69 = dateTimeField64.getMaximumTextLength(locale68);
        java.lang.String str70 = dateTimeField46.getAsShortText((org.joda.time.ReadablePartial) monthDay55, locale68);
        int[] intArray71 = monthDay55.getValues();
        int int72 = dateTimeField32.getMinimumValue((org.joda.time.ReadablePartial) monthDay39, intArray71);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray74 = dateTimeField4.set((org.joda.time.ReadablePartial) localDate26, 349260000, intArray71, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(monthDay30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 9 + "'", int37 == 9);
        org.junit.Assert.assertNotNull(monthDay41);
        org.junit.Assert.assertNotNull(monthDay44);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertEquals(locale50.toString(), "");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 9 + "'", int51 == 9);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 9L + "'", long54 == 9L);
        org.junit.Assert.assertNotNull(monthDay57);
        org.junit.Assert.assertNotNull(monthDay59);
        org.junit.Assert.assertNotNull(monthDay62);
        org.junit.Assert.assertNotNull(dateTimeField64);
        org.junit.Assert.assertEquals(locale68.toString(), "");
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 9 + "'", int69 == 9);
        org.junit.Assert.assertEquals("'" + str70 + "' != '" + "Feb" + "'", str70, "Feb");
        org.junit.Assert.assertNotNull(intArray71);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray71), "[2, 13]");
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 1 + "'", int72 == 1);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter48.withZoneUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime51 = dateTimeFormatter49.parseLocalTime("de-DE");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572126409,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=26,MILLISECOND=409,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) 10);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.centuryOfEra();
        java.lang.String str4 = localDate2.toString();
        java.util.Locale locale6 = java.util.Locale.PRC;
        java.util.Locale locale7 = java.util.Locale.CANADA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = localDate2.toString("1970-02-07T11:59:59.999+52:00", locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "2022-02-11" + "'", str4, "2022-02-11");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateMidnight dateMidnight6 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property8 = dateTime2.property(dateTimeFieldType7);
        org.joda.time.DateTime dateTime10 = dateTime2.minusWeeks(17);
        org.joda.time.MonthDay monthDay11 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay13 = monthDay11.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField15 = monthDay13.getField((int) (byte) 0);
        java.util.Locale locale19 = new java.util.Locale("", "", "hi!");
        int int20 = dateTimeField15.getMaximumTextLength(locale19);
        long long23 = dateTimeField15.add((long) 9, (long) (short) 0);
        int int25 = dateTimeField15.get((-187199987L));
        long long27 = dateTimeField15.remainder((long) 'a');
        int int28 = dateTime2.get(dateTimeField15);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = dateTimeField15.set((long) (-1), (int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 12 + "'", int25 == 12);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = property5.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate9 = property5.roundHalfFloorCopy();
        long long10 = property5.remainder();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale3.getDisplayScript(locale4);
        int int7 = property2.getMaximumTextLength(locale3);
        java.lang.String str8 = property2.getAsString();
        java.lang.String str9 = property2.getAsShortText();
        org.joda.time.MonthDay monthDay11 = property2.addToCopy(2);
        org.joda.time.MonthDay monthDay13 = monthDay11.minusDays((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay15 = monthDay13.withMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "gen" + "'", str9, "gen");
        org.junit.Assert.assertNotNull(monthDay11);
        org.junit.Assert.assertNotNull(monthDay13);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        org.joda.time.DateTime dateTime12 = dateTime9.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology13 = dateTime12.getChronology();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology17 = chronology13.withZone(dateTimeZone16);
        org.joda.time.MonthDay monthDay18 = org.joda.time.MonthDay.now(chronology13);
        org.joda.time.DateTimeField dateTimeField19 = chronology13.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField20 = chronology13.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(2, 52, (int) (byte) 1, (int) (byte) -1, 35, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(monthDay18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 364);
        org.joda.time.format.DateTimePrinter dateTimePrinter9 = dateTimeFormatter2.getPrinter();
        java.lang.StringBuffer stringBuffer10 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer10, (-187199996L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNull(dateTimePrinter9);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        java.util.Locale.Builder builder4 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder0.setExtension(' ', "Nov");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType4 = monthDay1.getFieldType(24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("--02-13", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=--02-13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("23");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateTime dateTime7 = dateTime2.minusMillis((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        boolean boolean13 = dateTime10.isBeforeNow();
        boolean boolean14 = dateTime2.isBefore((org.joda.time.ReadableInstant) dateTime10);
        org.joda.time.ReadableDuration readableDuration15 = null;
        org.joda.time.DateTime dateTime16 = dateTime2.plus(readableDuration15);
        int int17 = dateTime2.getWeekOfWeekyear();
        int int18 = dateTime2.getYearOfEra();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1970 + "'", int18 == 1970);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay3 = new org.joda.time.MonthDay(17, 100, chronology2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 17 for monthOfYear must not be larger than 12");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone8);
        org.joda.time.DateTime dateTime11 = dateTime9.minusDays((int) '#');
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localDate14.toDateTimeAtStartOfDay(dateTimeZone16);
        org.joda.time.DateTime dateTime19 = dateTime9.toDateTime(dateTimeZone16);
        org.joda.time.DateTime dateTime21 = dateTime9.minusMinutes(52);
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        long long27 = dateTimeZone23.convertLocalToUTC((long) (byte) 10, true);
        org.joda.time.DateTime dateTime28 = dateTime9.withZone(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone29 = dateTime9.getZone();
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.now(dateTimeZone29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(70, 22, 349260000, 22, 35, (int) 'a', 17, dateTimeZone29);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + (-187199990L) + "'", long27 == (-187199990L));
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(localDate30);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(0);
        int int11 = dateTime4.getMinuteOfDay();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property17 = dateTime16.hourOfDay();
        org.joda.time.DateTime dateTime19 = dateTime16.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology20 = dateTime19.getChronology();
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology24 = chronology20.withZone(dateTimeZone23);
        java.lang.String str25 = chronology20.toString();
        boolean boolean26 = dateTime4.equals((java.lang.Object) str25);
        java.util.Locale locale27 = java.util.Locale.JAPANESE;
        java.util.Calendar calendar28 = dateTime4.toCalendar(locale27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = locale27.getUnicodeLocaleType("0053-01-01T00:00:00.051Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 0053-01-01T00:00:00.051Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 239 + "'", int11 == 239);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "ISOChronology[+52:00]" + "'", str25, "ISOChronology[+52:00]");
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ja");
        org.junit.Assert.assertNotNull(calendar28);
        org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=-60526224000001,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=52,MONTH=0,WEEK_OF_YEAR=2,WEEK_OF_MONTH=2,DAY_OF_MONTH=2,DAY_OF_YEAR=2,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.MonthDay monthDay17 = monthDay13.minus(readablePeriod16);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        java.lang.String str28 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) monthDay13, locale26);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime33.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property36 = dateTime35.hourOfDay();
        org.joda.time.DateTime dateTime38 = dateTime35.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology39 = dateTime38.getChronology();
        org.joda.time.MonthDay monthDay40 = monthDay30.withChronologyRetainFields(chronology39);
        org.joda.time.DateTimeField dateTimeField41 = chronology39.clockhourOfHalfday();
        long long44 = dateTimeField41.add((long) '4', (long) (byte) 0);
        java.lang.String str46 = dateTimeField41.getAsShortText((long) 'u');
        long long49 = dateTimeField41.add(1644572116406L, 9L);
        org.joda.time.MonthDay monthDay51 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay53 = monthDay51.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField55 = monthDay53.getField((int) (byte) 0);
        java.util.Locale locale59 = new java.util.Locale("", "", "hi!");
        int int60 = dateTimeField55.getMaximumTextLength(locale59);
        long long63 = dateTimeField55.add((long) 9, (long) (short) 0);
        org.joda.time.DurationField durationField64 = dateTimeField55.getLeapDurationField();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone67);
        org.joda.time.DateTime dateTime70 = dateTime68.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property71 = dateTime70.hourOfDay();
        org.joda.time.DateTime dateTime73 = dateTime70.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property74 = dateTime70.yearOfCentury();
        java.util.Locale locale77 = new java.util.Locale("fra", "fr");
        java.lang.String str78 = property74.getAsShortText(locale77);
        java.lang.String str79 = dateTimeField55.getAsShortText(83968099800000L, locale77);
        java.lang.String str80 = dateTimeField41.getAsText((int) (short) 10, locale77);
        boolean boolean81 = locale26.equals((java.lang.Object) (short) 10);
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feb" + "'", str28, "Feb");
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(monthDay40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 52L + "'", long44 == 52L);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "4" + "'", str46, "4");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 1644604516406L + "'", long49 == 1644604516406L);
        org.junit.Assert.assertNotNull(monthDay53);
        org.junit.Assert.assertNotNull(dateTimeField55);
        org.junit.Assert.assertEquals(locale59.toString(), "");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 9 + "'", int60 == 9);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 9L + "'", long63 == 9L);
        org.junit.Assert.assertNotNull(durationField64);
        org.junit.Assert.assertNotNull(dateTime70);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(dateTime73);
        org.junit.Assert.assertNotNull(property74);
        org.junit.Assert.assertEquals(locale77.toString(), "fra_FR");
        org.junit.Assert.assertEquals("'" + str78 + "' != '" + "52" + "'", str78, "52");
        org.junit.Assert.assertEquals("'" + str79 + "' != '" + "Nov" + "'", str79, "Nov");
        org.junit.Assert.assertEquals("'" + str80 + "' != '" + "10" + "'", str80, "10");
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property16 = dateTime10.property(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate7.property(dateTimeFieldType15);
        org.joda.time.LocalDate localDate18 = property17.roundCeilingCopy();
        int int19 = localDate18.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = localDate18.toDateTimeAtMidnight();
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278994 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 229 + "'", int19 == 229);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        calendar1.set(10, 2022, 2922789, 3, 11, 32772);
        java.lang.String str13 = calendar1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=10,MONTH=2022,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=2922789,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=3,MINUTE=11,SECOND=32772,MILLISECOND=980,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=10,MONTH=2022,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=2922789,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=3,MINUTE=11,SECOND=32772,MILLISECOND=980,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str13, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=10,MONTH=2022,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=2922789,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=3,MINUTE=11,SECOND=32772,MILLISECOND=980,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.TRADITIONAL_CHINESE;
        int int4 = property2.getMaximumShortTextLength(locale3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay6 = property2.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 3 + "'", int4 == 3);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.util.TimeZone timeZone7 = null;
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.forTimeZone(timeZone7);
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate(dateTimeZone8);
        long long13 = dateTimeZone8.convertLocalToUTC((long) 4, false, (long) 5);
        int int15 = dateTimeZone8.getStandardOffset(83968099800000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(187200000, 21, 16, (int) (short) 0, 187200000, (-1), 2922789, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 187200000 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-187199996L) + "'", long13 == (-187199996L));
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 187200000 + "'", int15 == 187200000);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        java.io.Writer writer49 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer49, 2678400010L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572128446,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=28,MILLISECOND=446,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property10 = dateTime9.hourOfDay();
        java.lang.String str11 = property10.getAsShortText();
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay14 = monthDay12.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField16 = monthDay14.getField((int) (byte) 0);
        java.util.Locale locale20 = new java.util.Locale("", "", "hi!");
        int int21 = dateTimeField16.getMaximumTextLength(locale20);
        long long24 = dateTimeField16.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod28 = null;
        org.joda.time.MonthDay monthDay29 = monthDay25.minus(readablePeriod28);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField34 = monthDay32.getField((int) (byte) 0);
        java.util.Locale locale38 = new java.util.Locale("", "", "hi!");
        int int39 = dateTimeField34.getMaximumTextLength(locale38);
        java.lang.String str40 = dateTimeField16.getAsShortText((org.joda.time.ReadablePartial) monthDay25, locale38);
        int int41 = property10.getMaximumTextLength(locale38);
        org.joda.time.DateTimeField dateTimeField42 = property10.getField();
        java.util.Locale locale43 = java.util.Locale.FRENCH;
        java.util.Calendar calendar44 = java.util.Calendar.getInstance(locale43);
        int int45 = property10.getMaximumTextLength(locale43);
        boolean boolean46 = locale43.hasExtensions();
        java.lang.String str47 = locale43.getDisplayCountry();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter48 = dateTimeFormatter2.withLocale(locale43);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter49 = dateTimeFormatter48.withZoneUTC();
        org.joda.time.format.DateTimeParser dateTimeParser50 = dateTimeFormatter48.getParser();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str52 = dateTimeFormatter48.print((-187199996L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3" + "'", str11, "3");
        org.junit.Assert.assertNotNull(monthDay14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 9 + "'", int21 == 9);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 9L + "'", long24 == 9L);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertEquals(locale38.toString(), "");
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 9 + "'", int39 == 9);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Feb" + "'", str40, "Feb");
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2 + "'", int41 == 2);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(locale43);
        org.junit.Assert.assertEquals(locale43.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar44);
// flaky:         org.junit.Assert.assertEquals(calendar44.toString(), "java.util.GregorianCalendar[time=1644572128470,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=28,MILLISECOND=470,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2 + "'", int45 == 2);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(dateTimeFormatter48);
        org.junit.Assert.assertNotNull(dateTimeFormatter49);
        org.junit.Assert.assertNull(dateTimeParser50);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale3.getDisplayScript(locale4);
        int int7 = property2.getMaximumTextLength(locale3);
        java.lang.String str8 = property2.getAsString();
        int int9 = property2.getMaximumValue();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.withDayOfYear(100);
        org.joda.time.Interval interval15 = localDate14.toInterval();
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.days();
        java.lang.String str17 = durationFieldType16.getName();
        org.joda.time.LocalDate localDate19 = localDate14.withFieldAdded(durationFieldType16, 32770);
        org.joda.time.LocalDate.Property property20 = localDate19.yearOfCentury();
        org.joda.time.ReadableInstant readableInstant21 = null;
        org.joda.time.DateTime dateTime22 = localDate19.toDateTime(readableInstant21);
        // The following exception was thrown during execution in test generation
        try {
            int int23 = property2.compareTo(readableInstant21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The instant must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 12 + "'", int9 == 12);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(interval15);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "days" + "'", str17, "days");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(dateTime22);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeParser dateTimeParser7 = dateTimeFormatter6.getParser();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeFormatter6.parseMillis("era");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimeParser7);
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(1644572109112L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = monthDay1.toString("fra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.DateTime dateTime4 = dateTime2.plus(readablePeriod3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusMonths((int) (byte) 10);
        org.joda.time.DateTime.Property property7 = dateTime6.dayOfWeek();
        org.joda.time.DateTime dateTime8 = property7.roundHalfEvenCopy();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((long) 4, dateTimeZone13);
        java.util.Locale locale16 = java.util.Locale.ITALIAN;
        java.lang.String str17 = dateTimeZone13.getShortName((long) 0, locale16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = property7.setCopy("11 f\351vr. 2022 09:35:18", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"11 fe?vr. 2022 09:35:18\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "it");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "+52:00" + "'", str17, "+52:00");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-1), 229, 292278994, 14, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone2);
        org.joda.time.DateTime dateTime5 = dateTime3.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property6 = dateTime5.hourOfDay();
        org.joda.time.DateTime dateTime8 = dateTime5.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology9 = dateTime8.getChronology();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology13 = chronology9.withZone(dateTimeZone12);
        org.joda.time.DateTimeField dateTimeField14 = chronology9.weekyearOfCentury();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(83968099800000L, chronology9);
        org.joda.time.LocalDate localDate17 = localDate15.plusYears(0);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property23 = dateTime22.hourOfDay();
        org.joda.time.DateTime dateTime25 = dateTime22.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime27 = dateTime22.withYearOfEra((int) ' ');
        int int28 = dateTime22.getYearOfCentury();
        org.joda.time.ReadableDuration readableDuration29 = null;
        org.joda.time.DateTime dateTime31 = dateTime22.withDurationAdded(readableDuration29, (int) (byte) -1);
        org.joda.time.DateTime dateTime33 = dateTime31.plusHours(229);
        boolean boolean34 = localDate17.equals((java.lang.Object) 229);
        org.joda.time.LocalDate.Property property35 = localDate17.weekOfWeekyear();
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 52 + "'", int28 == 52);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(property35);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        int int9 = localDate7.getValue(0);
        java.lang.String str10 = localDate7.toString();
        org.joda.time.LocalDate localDate12 = localDate7.withWeekyear(1);
        org.joda.time.LocalDate localDate14 = localDate7.withDayOfYear((int) (byte) 1);
        int int15 = localDate7.getYear();
        org.joda.time.format.DateTimePrinter dateTimePrinter16 = null;
        org.joda.time.format.DateTimeParser dateTimeParser17 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter16, dateTimeParser17);
        org.joda.time.Chronology chronology19 = dateTimeFormatter18.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter18.withPivotYear(70);
        boolean boolean22 = localDate7.equals((java.lang.Object) 70);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = localDate7.get(dateTimeFieldType23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "2022-08-13" + "'", str10, "2022-08-13");
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        java.util.TimeZone timeZone3 = null;
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forTimeZone(timeZone3);
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtStartOfDay(dateTimeZone4);
        java.util.Date date7 = dateTime6.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime6.withDayOfWeek((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Feb 10 20:00:00 UTC 2022");
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter6.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter6.getZone();
        java.lang.Integer int9 = dateTimeFormatter6.getPivotYear();
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(dateTimeZone11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtStartOfDay(dateTimeZone14);
        org.joda.time.DateTime dateTime18 = dateTime16.plusHours(21);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str19 = dateTimeFormatter6.print((org.joda.time.ReadableInstant) dateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimePrinter7);
        org.junit.Assert.assertNull(dateTimeZone8);
        org.junit.Assert.assertNull(int9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property13 = dateTime2.centuryOfEra();
        int int14 = property13.getMaximumValue();
        int int15 = property13.getMinimumValueOverall();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) property13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2922789 + "'", int14 == 2922789);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.DateTime dateTime6 = localDate2.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = localDate2.toString("11-feb-2022 9.35.23");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: f");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        java.util.Date date5 = new java.util.Date(0, 32770, 5, 0, (int) (short) 10);
        long long6 = date5.getTime();
        long long7 = date5.getTime();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property16 = dateTime10.property(dateTimeFieldType15);
        org.joda.time.DateTime.Property property17 = dateTime10.centuryOfEra();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone19);
        org.joda.time.DateTime dateTime22 = dateTime20.minusDays((int) '#');
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone24);
        java.util.TimeZone timeZone26 = null;
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forTimeZone(timeZone26);
        org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(dateTimeZone27);
        org.joda.time.DateTime dateTime29 = localDate25.toDateTimeAtStartOfDay(dateTimeZone27);
        org.joda.time.DateTime dateTime30 = dateTime20.toDateTime(dateTimeZone27);
        org.joda.time.DateTime dateTime32 = dateTime20.plusWeeks(5);
        org.joda.time.DateTime dateTime34 = dateTime20.minusMillis(13);
        int int35 = property17.compareTo((org.joda.time.ReadableInstant) dateTime34);
        boolean boolean36 = date5.equals((java.lang.Object) dateTime34);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Nov 05 00:10:00 UTC 4630");
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 83968099800000L + "'", long6 == 83968099800000L);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 83968099800000L + "'", long7 == 83968099800000L);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = dateTime10.toString("ISOChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("Taiwan");
        java.util.Locale.Builder builder6 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder9 = builder0.setUnicodeLocaleKeyword("35", "11-feb-2022 9.35.23");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword type: 11-feb-2022 9.35.23 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        java.lang.String str13 = chronology8.toString();
        org.joda.time.DurationField durationField14 = chronology8.seconds();
        org.joda.time.DateTimeField dateTimeField15 = chronology8.yearOfCentury();
        org.joda.time.DurationField durationField16 = chronology8.years();
        org.joda.time.DateTimeField dateTimeField17 = chronology8.dayOfWeek();
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay(0L);
        java.lang.String str26 = monthDay25.toString();
        org.joda.time.MonthDay monthDay28 = monthDay25.plusMonths((int) (byte) 10);
        int[] intArray29 = monthDay25.getValues();
        java.util.Locale locale32 = new java.util.Locale("en-US");
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray33 = dateTimeField17.set((org.joda.time.ReadablePartial) monthDay20, 0, intArray29, "2 Apr 2104 08:59:23 GMT", locale32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2 Apr 2104 08:59:23 GMT\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "ISOChronology[+52:00]" + "'", str13, "ISOChronology[+52:00]");
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "--01-03" + "'", str26, "--01-03");
        org.junit.Assert.assertNotNull(monthDay28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[1, 3]");
        org.junit.Assert.assertEquals(locale32.toString(), "en-us");
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter7 = dateTimeFormatter6.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone8 = dateTimeFormatter6.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = dateTimeFormatter6.parseLocalTime("Thu Jan 01 00:00:00 UTC 1970");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNull(dateTimePrinter7);
        org.junit.Assert.assertNull(dateTimeZone8);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        java.lang.String str1 = durationFieldType0.toString();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology14 = chronology10.withZone(dateTimeZone13);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(chronology14);
        org.joda.time.DurationField durationField16 = chronology14.seconds();
        boolean boolean17 = durationFieldType0.isSupported(chronology14);
        org.joda.time.DateTimeField dateTimeField18 = chronology14.dayOfYear();
        org.joda.time.DurationField durationField19 = chronology14.hours();
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "days" + "'", str1, "days");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDate localDate11 = localDate4.plus(readablePeriod10);
        org.joda.time.LocalDate localDate13 = localDate11.withDayOfMonth(23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate15 = localDate11.withMonthOfYear(229);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 229 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.MonthDay monthDay11 = monthDay1.withChronologyRetainFields(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.millisOfDay();
        org.joda.time.DurationField durationField14 = chronology10.days();
        org.joda.time.DurationField durationField15 = chronology10.eras();
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(monthDay11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField17 = monthDay15.getField((int) (byte) 0);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        long long30 = dateTimeField22.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay31 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay33 = monthDay31.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.MonthDay monthDay35 = monthDay31.minus(readablePeriod34);
        org.joda.time.MonthDay monthDay36 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay38 = monthDay36.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField40 = monthDay38.getField((int) (byte) 0);
        java.util.Locale locale44 = new java.util.Locale("", "", "hi!");
        int int45 = dateTimeField40.getMaximumTextLength(locale44);
        java.lang.String str46 = dateTimeField22.getAsShortText((org.joda.time.ReadablePartial) monthDay31, locale44);
        java.lang.String str47 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) monthDay15, locale44);
        long long49 = dateTimeField4.roundHalfFloor((long) (short) 100);
        boolean boolean50 = dateTimeField4.isSupported();
        // The following exception was thrown during execution in test generation
        try {
            long long53 = dateTimeField4.set((-187197979L), 365);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 9L + "'", long30 == 9L);
        org.junit.Assert.assertNotNull(monthDay33);
        org.junit.Assert.assertNotNull(monthDay35);
        org.junit.Assert.assertNotNull(monthDay38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertEquals(locale44.toString(), "");
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 9 + "'", int45 == 9);
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "Feb" + "'", str46, "Feb");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "February" + "'", str47, "February");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertTrue("'" + boolean50 + "' != '" + true + "'", boolean50 == true);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("\u4e00\u6708", (double) 32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=32770.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        java.util.Locale.Builder builder5 = builder3.setLanguageTag("de-DE");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder3.setUnicodeLocaleKeyword("", "DateTimeField[year]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key:  [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField13 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfDay();
        long long19 = chronology8.getDateTimeMillis((-1), 8, 2, 17);
        org.joda.time.MonthDay monthDay20 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay22 = monthDay20.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField24 = monthDay22.getField((int) (byte) 0);
        java.util.Locale locale28 = new java.util.Locale("", "", "hi!");
        int int29 = dateTimeField24.getMaximumTextLength(locale28);
        long long32 = dateTimeField24.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay33 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay35 = monthDay33.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.MonthDay monthDay37 = monthDay33.minus(readablePeriod36);
        org.joda.time.MonthDay monthDay38 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay40 = monthDay38.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField42 = monthDay40.getField((int) (byte) 0);
        java.util.Locale locale46 = new java.util.Locale("", "", "hi!");
        int int47 = dateTimeField42.getMaximumTextLength(locale46);
        java.lang.String str48 = dateTimeField24.getAsShortText((org.joda.time.ReadablePartial) monthDay33, locale46);
        int[] intArray49 = monthDay33.getValues();
        int[] intArray51 = chronology8.get((org.joda.time.ReadablePartial) monthDay33, (long) 4);
        org.joda.time.MonthDay monthDay52 = new org.joda.time.MonthDay(chronology8);
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone55);
        org.joda.time.DateTime dateTime58 = dateTime56.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property59 = dateTime58.hourOfDay();
        org.joda.time.DateTime dateTime61 = dateTime58.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology62 = dateTime61.getChronology();
        org.joda.time.DateTimeZone dateTimeZone65 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology66 = chronology62.withZone(dateTimeZone65);
        org.joda.time.MonthDay monthDay67 = org.joda.time.MonthDay.now(chronology62);
        org.joda.time.DateTimeField dateTimeField68 = chronology62.dayOfMonth();
        org.joda.time.DurationField durationField69 = chronology62.millis();
        org.joda.time.DateTimeField dateTimeField70 = chronology62.year();
        java.lang.String str71 = dateTimeField70.getName();
        java.util.Locale locale74 = new java.util.Locale("fra", "fr");
        int int75 = dateTimeField70.getMaximumTextLength(locale74);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str76 = monthDay52.toString("hi!", locale74);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-62180539199983L) + "'", long19 == (-62180539199983L));
        org.junit.Assert.assertNotNull(monthDay22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertEquals(locale28.toString(), "");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 9 + "'", int29 == 9);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 9L + "'", long32 == 9L);
        org.junit.Assert.assertNotNull(monthDay35);
        org.junit.Assert.assertNotNull(monthDay37);
        org.junit.Assert.assertNotNull(monthDay40);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertEquals(locale46.toString(), "");
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 9 + "'", int47 == 9);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "Feb" + "'", str48, "Feb");
        org.junit.Assert.assertNotNull(intArray49);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray49), "[2, 13]");
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[1, 3]");
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(property59);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(chronology62);
        org.junit.Assert.assertNotNull(dateTimeZone65);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(monthDay67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertNotNull(durationField69);
        org.junit.Assert.assertNotNull(dateTimeField70);
        org.junit.Assert.assertEquals("'" + str71 + "' != '" + "year" + "'", str71, "year");
        org.junit.Assert.assertEquals(locale74.toString(), "fra_FR");
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 9 + "'", int75 == 9);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        long long6 = java.util.Date.UTC(16, (int) (byte) 100, 21, (int) (byte) 100, 999, 10);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1439090450000L) + "'", long6 == (-1439090450000L));
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.format.DateTimePrinter dateTimePrinter4 = dateTimeFormatter3.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone6);
        org.joda.time.DateTime dateTime9 = dateTime7.minusDays((int) '#');
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(dateTimeZone11);
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDate12.toDateTimeAtStartOfDay(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime7.toDateTime(dateTimeZone14);
        org.joda.time.DateTime dateTime19 = dateTime7.plusWeeks(5);
        org.joda.time.Chronology chronology20 = dateTime7.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter21 = dateTimeFormatter3.withChronology(chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.parse("10", dateTimeFormatter21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTimeFormatter21);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        boolean boolean5 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = dateTimeFormatter2.parseLocalDateTime("Property[dayOfMonth]");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder3 = builder0.set((int) (byte) 0, (int) (byte) 1);
        java.util.Calendar.Builder builder7 = builder0.setDate(59, (int) (byte) 1, 2022);
        org.joda.time.MonthDay monthDay8 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay10 = monthDay8.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField12 = monthDay10.getField((int) (byte) 0);
        java.util.Locale locale16 = new java.util.Locale("", "", "hi!");
        int int17 = dateTimeField12.getMaximumTextLength(locale16);
        long long20 = dateTimeField12.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay21 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay23 = monthDay21.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.MonthDay monthDay25 = monthDay21.minus(readablePeriod24);
        org.joda.time.MonthDay monthDay26 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay28 = monthDay26.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField30 = monthDay28.getField((int) (byte) 0);
        java.util.Locale locale34 = new java.util.Locale("", "", "hi!");
        int int35 = dateTimeField30.getMaximumTextLength(locale34);
        java.lang.String str36 = dateTimeField12.getAsShortText((org.joda.time.ReadablePartial) monthDay21, locale34);
        int[] intArray37 = monthDay21.getValues();
        org.joda.time.ReadablePeriod readablePeriod38 = null;
        org.joda.time.MonthDay monthDay40 = monthDay21.withPeriodAdded(readablePeriod38, 59);
        org.joda.time.MonthDay monthDay42 = monthDay21.minusDays(59);
        java.util.Date date48 = new java.util.Date(0, 32770, 5, 0, (int) (short) 10);
        long long49 = date48.getTime();
        long long50 = date48.getTime();
        boolean boolean51 = monthDay21.equals((java.lang.Object) date48);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder52 = builder0.setInstant(date48);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder7);
        org.junit.Assert.assertNotNull(monthDay10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertEquals(locale16.toString(), "");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 9 + "'", int17 == 9);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 9L + "'", long20 == 9L);
        org.junit.Assert.assertNotNull(monthDay23);
        org.junit.Assert.assertNotNull(monthDay25);
        org.junit.Assert.assertNotNull(monthDay28);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertEquals(locale34.toString(), "");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 9 + "'", int35 == 9);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Feb" + "'", str36, "Feb");
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[2, 13]");
        org.junit.Assert.assertNotNull(monthDay40);
        org.junit.Assert.assertNotNull(monthDay42);
        org.junit.Assert.assertEquals(date48.toString(), "Fri Nov 05 00:10:00 UTC 4630");
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 83968099800000L + "'", long49 == 83968099800000L);
        org.junit.Assert.assertTrue("'" + long50 + "' != '" + 83968099800000L + "'", long50 == 83968099800000L);
        org.junit.Assert.assertTrue("'" + boolean51 + "' != '" + false + "'", boolean51 == false);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.DurationField durationField13 = chronology8.weeks();
        org.joda.time.DateTimeField dateTimeField14 = chronology8.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long19 = chronology8.getDateTimeMillis(2021, (int) (byte) 10, (int) 'u', 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = dateTimeFormatter2.parseLocalDateTime("--02-01");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((int) (short) 10, (int) '4', 23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.minusDays((int) '#');
        int int13 = dateTime10.getWeekyear();
        org.joda.time.DateMidnight dateMidnight14 = dateTime10.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property16 = dateTime10.property(dateTimeFieldType15);
        org.joda.time.LocalDate.Property property17 = localDate7.property(dateTimeFieldType15);
        boolean boolean18 = property17.isLeap();
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone20);
        org.joda.time.DateTime dateTime23 = dateTime21.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property24 = dateTime23.hourOfDay();
        org.joda.time.DateTime dateTime26 = dateTime23.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime28 = dateTime23.withMillisOfDay(8);
        boolean boolean30 = dateTime23.isAfter((long) 17);
        org.joda.time.Instant instant31 = dateTime23.toInstant();
        org.joda.time.DateTime.Property property32 = dateTime23.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int33 = property17.getDifference((org.joda.time.ReadableInstant) dateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1970 + "'", int13 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(instant31);
        org.junit.Assert.assertNotNull(property32);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id 'hi!' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate localDate6 = property5.getLocalDate();
        org.joda.time.LocalDate localDate8 = property5.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate9 = property5.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = property5.getFieldType();
        org.joda.time.LocalDate localDate11 = property5.roundHalfFloorCopy();
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        org.joda.time.LocalDate localDate16 = localDate14.withDayOfYear(100);
        org.joda.time.Interval interval17 = localDate16.toInterval();
        java.util.TimeZone timeZone18 = null;
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forTimeZone(timeZone18);
        org.joda.time.LocalDate localDate20 = new org.joda.time.LocalDate(dateTimeZone19);
        org.joda.time.DateTime dateTime21 = localDate16.toDateTimeAtCurrentTime(dateTimeZone19);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.era();
        int int23 = localDate16.get(dateTimeFieldType22);
        boolean boolean24 = localDate11.isSupported(dateTimeFieldType22);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now(dateTimeZone27);
        org.joda.time.DateMidnight dateMidnight29 = localDate11.toDateMidnight(dateTimeZone27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField31 = localDate11.getField(59);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 59");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1 + "'", int23 == 1);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateMidnight29);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 364);
        java.io.Writer writer9 = null;
        java.util.TimeZone timeZone10 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forTimeZone(timeZone10);
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate12.withDayOfYear(100);
        org.joda.time.LocalDate.Property property15 = localDate12.dayOfMonth();
        org.joda.time.LocalDate localDate16 = property15.getLocalDate();
        org.joda.time.LocalDate localDate18 = property15.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate19 = property15.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = property15.getFieldType();
        org.joda.time.LocalDate localDate21 = property15.getLocalDate();
        org.joda.time.LocalDate localDate22 = property15.roundFloorCopy();
        org.joda.time.LocalDate localDate23 = property15.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer9, (org.joda.time.ReadablePartial) localDate23);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter2.getPrinter();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.minusDays((int) '#');
        java.util.TimeZone timeZone9 = null;
        org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.forTimeZone(timeZone9);
        org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate(dateTimeZone10);
        java.util.TimeZone timeZone12 = null;
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forTimeZone(timeZone12);
        org.joda.time.LocalDate localDate14 = new org.joda.time.LocalDate(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate11.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime6.toDateTime(dateTimeZone13);
        org.joda.time.DateTime dateTime18 = dateTime6.plusWeeks(5);
        org.joda.time.Chronology chronology19 = dateTime6.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withChronology(chronology19);
        java.util.TimeZone timeZone21 = null;
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.forTimeZone(timeZone21);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(dateTimeZone22);
        org.joda.time.LocalDate localDate25 = localDate23.withDayOfYear(100);
        org.joda.time.LocalDate.Property property26 = localDate23.dayOfMonth();
        org.joda.time.LocalDate localDate27 = property26.getLocalDate();
        org.joda.time.LocalDate localDate29 = property26.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate30 = property26.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType31 = property26.getFieldType();
        org.joda.time.LocalDate localDate32 = property26.getLocalDate();
        org.joda.time.LocalDate localDate34 = localDate32.withYear((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str35 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) localDate32);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeFormatter20);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(dateTimeFieldType31);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(localDate34);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        long long6 = java.util.Date.UTC((-292275054), 20, 349260000, 11, 2022, (int) (byte) 1);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-9193325335413479000L) + "'", long6 == (-9193325335413479000L));
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.util.Locale locale3 = java.util.Locale.ITALY;
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.lang.String str5 = locale4.getLanguage();
        java.lang.String str6 = locale3.getDisplayScript(locale4);
        int int7 = property2.getMaximumTextLength(locale3);
        java.lang.String str8 = property2.getAsString();
        java.lang.String str9 = property2.getAsShortText();
        java.util.Locale locale11 = java.util.Locale.CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay12 = property2.setCopy("Italia", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Italia\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "it_IT");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "it" + "'", str5, "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 9 + "'", int7 == 9);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "1" + "'", str8, "1");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "gen" + "'", str9, "gen");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "zh");
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.lang.String str3 = property2.getAsText();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay5 = property2.setCopy("--02-13");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"--02-13\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gennaio" + "'", str3, "gennaio");
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(22, 1970, 20, (-1), 32769, (int) '4', 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.minusMinutes(52);
        java.util.TimeZone timeZone15 = null;
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.forTimeZone(timeZone15);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate(dateTimeZone16);
        long long20 = dateTimeZone16.convertLocalToUTC((long) (byte) 10, true);
        org.joda.time.DateTime dateTime21 = dateTime2.withZone(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone22 = dateTime2.getZone();
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now(dateTimeZone22);
        long long26 = dateTimeZone22.adjustOffset((long) 35, true);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + (-187199990L) + "'", long20 == (-187199990L));
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 35L + "'", long26 == 35L);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        boolean boolean4 = dateTimeFormatter2.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withDefaultYear(0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = dateTimeFormatter2.withPivotYear((java.lang.Integer) 364);
        java.lang.Appendable appendable9 = null;
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays((int) '#');
        int int15 = dateTime12.getWeekyear();
        org.joda.time.DateMidnight dateMidnight16 = dateTime12.toDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter8.printTo(appendable9, (org.joda.time.ReadableInstant) dateTime12);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(dateTimeFormatter8);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight16);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        int int14 = dateTimeField4.get((-187199987L));
        long long16 = dateTimeField4.remainder((long) 'a');
        long long18 = dateTimeField4.roundFloor(0L);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        java.util.TimeZone timeZone23 = null;
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forTimeZone(timeZone23);
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = localDate25.withDayOfYear(100);
        org.joda.time.Interval interval28 = localDate27.toInterval();
        org.joda.time.DurationFieldType durationFieldType29 = org.joda.time.DurationFieldType.days();
        java.lang.String str30 = durationFieldType29.getName();
        org.joda.time.LocalDate localDate32 = localDate27.withFieldAdded(durationFieldType29, 32770);
        java.util.TimeZone timeZone33 = null;
        org.joda.time.DateTimeZone dateTimeZone34 = org.joda.time.DateTimeZone.forTimeZone(timeZone33);
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate(dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.withDayOfYear(100);
        org.joda.time.Interval interval38 = localDate37.toInterval();
        org.joda.time.DurationFieldType durationFieldType39 = org.joda.time.DurationFieldType.days();
        java.lang.String str40 = durationFieldType39.getName();
        org.joda.time.LocalDate localDate42 = localDate37.withFieldAdded(durationFieldType39, 32770);
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone44);
        org.joda.time.DateTime dateTime47 = dateTime45.minusDays((int) '#');
        int int48 = dateTime45.getWeekyear();
        org.joda.time.DateMidnight dateMidnight49 = dateTime45.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType50 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property51 = dateTime45.property(dateTimeFieldType50);
        boolean boolean52 = localDate37.isSupported(dateTimeFieldType50);
        boolean boolean53 = localDate27.isSupported(dateTimeFieldType50);
        boolean boolean54 = localDate22.isSupported(dateTimeFieldType50);
        int int55 = localDate22.getYearOfEra();
        java.util.Locale locale57 = java.util.Locale.ITALIAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str58 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) localDate22, (int) (byte) -1, locale57);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 12 + "'", int14 == 12);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 97L + "'", long16 == 97L);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 0L + "'", long18 == 0L);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(interval28);
        org.junit.Assert.assertNotNull(durationFieldType29);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "days" + "'", str30, "days");
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(dateTimeZone34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(durationFieldType39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "days" + "'", str40, "days");
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 1970 + "'", int48 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight49);
        org.junit.Assert.assertNotNull(dateTimeFieldType50);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + true + "'", boolean53 == true);
        org.junit.Assert.assertTrue("'" + boolean54 + "' != '" + true + "'", boolean54 == true);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2022 + "'", int55 == 2022);
        org.junit.Assert.assertNotNull(locale57);
        org.junit.Assert.assertEquals(locale57.toString(), "it");
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        java.lang.Integer int5 = dateTimeFormatter2.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateTimeFormatter2.print((long) 364);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNull(int5);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTime dateTime10 = dateTime7.withMinuteOfHour(8);
        org.joda.time.DateTime dateTime12 = dateTime7.withCenturyOfEra(0);
        org.joda.time.DateTime.Property property13 = dateTime12.dayOfWeek();
        java.lang.String str14 = property13.getAsText();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "mercoled\354" + "'", str14, "mercoled\354");
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter3.withPivotYear(70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.parse("0052-01-03T03:59:59.999+52:00", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(0L);
        java.lang.String str2 = monthDay1.toString();
        org.joda.time.Chronology chronology3 = monthDay1.getChronology();
        org.joda.time.Chronology chronology4 = monthDay1.getChronology();
        org.joda.time.LocalDate localDate6 = monthDay1.toLocalDate(20);
        org.joda.time.MonthDay monthDay7 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay9 = monthDay7.minusDays((int) (short) 10);
        java.lang.String str11 = monthDay7.toString("23");
        java.lang.String str12 = monthDay7.toString();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime17.hourOfDay();
        org.joda.time.DateTime dateTime20 = dateTime17.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology25 = chronology21.withZone(dateTimeZone24);
        org.joda.time.MonthDay monthDay26 = org.joda.time.MonthDay.now(chronology21);
        org.joda.time.DateTimeField dateTimeField27 = chronology21.dayOfMonth();
        org.joda.time.DurationField durationField28 = chronology21.millis();
        org.joda.time.MonthDay monthDay29 = monthDay7.withChronologyRetainFields(chronology21);
        org.joda.time.MonthDay monthDay30 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay32 = monthDay30.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod33 = null;
        org.joda.time.MonthDay monthDay34 = monthDay30.minus(readablePeriod33);
        java.lang.String str35 = monthDay30.toString();
        org.joda.time.MonthDay.Property property36 = monthDay30.monthOfYear();
        int int37 = monthDay30.getMonthOfYear();
        org.joda.time.MonthDay monthDay39 = monthDay30.minusDays(59);
        boolean boolean40 = monthDay29.isAfter((org.joda.time.ReadablePartial) monthDay39);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean41 = localDate6.isAfter((org.joda.time.ReadablePartial) monthDay29);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "--01-03" + "'", str2, "--01-03");
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(monthDay9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "23" + "'", str11, "23");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "--02-13" + "'", str12, "--02-13");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(monthDay26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(durationField28);
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(monthDay34);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "--02-13" + "'", str35, "--02-13");
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2 + "'", int37 == 2);
        org.junit.Assert.assertNotNull(monthDay39);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        java.lang.String str3 = property2.getAsText();
        int int4 = property2.getMinimumValue();
        int int5 = property2.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(property2);
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "gennaio" + "'", str3, "gennaio");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.Chronology chronology4 = dateTimeFormatter2.getChronology();
        java.io.Writer writer5 = null;
        java.util.TimeZone timeZone6 = null;
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate8.withDayOfYear(100);
        org.joda.time.LocalDate.Property property11 = localDate8.dayOfMonth();
        org.joda.time.LocalDate localDate12 = property11.getLocalDate();
        org.joda.time.LocalDate localDate14 = property11.addWrapFieldToCopy((int) (byte) 0);
        org.joda.time.LocalDate localDate15 = property11.withMaximumValue();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property11.getFieldType();
        org.joda.time.LocalDate localDate17 = property11.getLocalDate();
        org.joda.time.LocalDate localDate19 = localDate17.withYear((int) ' ');
        org.joda.time.LocalDate localDate21 = localDate19.withYear((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer5, (org.joda.time.ReadablePartial) localDate21);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.MonthDay monthDay4 = new org.joda.time.MonthDay(0L);
        java.lang.String str5 = monthDay4.toString();
        boolean boolean6 = monthDay2.isEqual((org.joda.time.ReadablePartial) monthDay4);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = monthDay4.toString("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=10,MONTH=2022,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=2922789,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=3,MINUTE=11,SECOND=32772,MILLISECOND=980,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--01-03" + "'", str5, "--01-03");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.roll((int) (short) 100, 0);
        int int8 = calendar1.getGreatestMinimum(0);
        calendar1.clear();
        calendar1.clear(0);
        calendar1.set(8, 0, (int) 'a', 2021, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = calendar1.getLeastMaximum((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=8,MONTH=0,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=97,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=2021,MINUTE=3,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        org.joda.time.Chronology chronology5 = dateTime4.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long11 = chronology5.getDateTimeMillis((long) ' ', 20, (-1), 2, 16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra(52);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.clockhourOfHalfday();
        boolean boolean5 = localDate2.isSupported(dateTimeFieldType4);
        org.joda.time.DurationFieldType durationFieldType6 = dateTimeFieldType4.getRangeDurationType();
        java.lang.Class<?> wildcardClass7 = dateTimeFieldType4.getClass();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(wildcardClass7);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        int int7 = calendar1.getGreatestMinimum(10);
        java.time.Instant instant8 = calendar1.toInstant();
        calendar1.setTimeInMillis(1L);
        calendar1.set(1439, (int) ' ', 7);
        boolean boolean15 = calendar1.isLenient();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=1439,MONTH=32,WEEK_OF_YEAR=52,WEEK_OF_MONTH=0,DAY_OF_MONTH=7,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.setMinimalDaysInFirstWeek(1970);
        java.util.Locale locale9 = java.util.Locale.forLanguageTag("1970-01-03T03:59:59.999+52:00");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap10 = calendar1.getDisplayNames((int) (short) 100, 52, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644572131549,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=31,MILLISECOND=549,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.ReadablePeriod readablePeriod1 = null;
        org.joda.time.LocalDate localDate3 = localDate0.withPeriodAdded(readablePeriod1, (int) (byte) 0);
        int int4 = localDate3.getYearOfCentury();
        int int5 = localDate3.getYearOfCentury();
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 22 + "'", int4 == 22);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 22 + "'", int5 == 22);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((-62180539199983L), dateTimeZone1);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = null;
        org.joda.time.format.DateTimeParser dateTimeParser4 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter3, dateTimeParser4);
        org.joda.time.Chronology chronology6 = dateTimeFormatter5.getChronology();
        boolean boolean7 = dateTimeFormatter5.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter5.withDefaultYear(0);
        org.joda.time.format.DateTimePrinter dateTimePrinter10 = dateTimeFormatter9.getPrinter();
        org.joda.time.format.DateTimeParser dateTimeParser11 = dateTimeFormatter9.getParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = dateTimeFormatter9.withZoneUTC();
        org.joda.time.MonthDay monthDay14 = new org.joda.time.MonthDay(0L);
        java.lang.String str15 = monthDay14.toString();
        org.joda.time.Chronology chronology16 = monthDay14.getChronology();
        org.joda.time.Chronology chronology17 = monthDay14.getChronology();
        org.joda.time.DateTimeField dateTimeField18 = chronology17.minuteOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter12.withChronology(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localDate2.toString(dateTimeFormatter19);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter9);
        org.junit.Assert.assertNull(dateTimePrinter10);
        org.junit.Assert.assertNull(dateTimeParser11);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "--01-03" + "'", str15, "--01-03");
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(dateTimeFormatter19);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        java.util.Date date7 = dateTime4.toDate();
        java.util.Date date8 = new java.util.Date();
        java.lang.String str9 = date8.toLocaleString();
        boolean boolean10 = date7.after(date8);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
        org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 02 23:59:59 UTC 52");
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Fri Feb 11 09:35:31 UTC 2022");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "11-feb-2022 9.35.31" + "'", str9, "11-feb-2022 9.35.31");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra(52);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        java.util.Locale locale5 = java.util.Locale.ITALIAN;
        java.lang.String str6 = locale5.getLanguage();
        java.lang.String str8 = locale5.getExtension('a');
        org.joda.time.LocalDate localDate9 = property3.setCopy("3", locale5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate9.withEra(2730);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2730 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "it");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "it" + "'", str6, "it");
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder4 = builder0.setCalendarType("centuries");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: centuries");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.addUnicodeLocaleAttribute("11-feb-2022 9.35.31");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 11-feb-2022 9.35.31 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.roll(9, false);
        calendar1.setFirstDayOfWeek((int) (byte) 1);
        int int7 = calendar1.getWeekYear();
        java.util.Locale locale8 = java.util.Locale.FRENCH;
        java.util.Calendar calendar9 = java.util.Calendar.getInstance(locale8);
        calendar9.setLenient(true);
        int int12 = calendar1.compareTo(calendar9);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1644615331875,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=1,HOUR=9,HOUR_OF_DAY=21,MINUTE=35,SECOND=31,MILLISECOND=875,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1644572131875,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=31,MILLISECOND=875,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.LocalDateTime localDateTime6 = dateTime4.toLocalDateTime();
        org.joda.time.DateTime dateTime9 = dateTime4.withDurationAdded(1L, 52);
        org.joda.time.DateTime dateTime11 = dateTime9.withDayOfYear(52);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime14 = dateTime11.withDurationAdded(readableDuration12, (int) 'a');
        org.joda.time.Instant instant15 = dateTime14.toInstant();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(instant15);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("1 janv. 1970 00:00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"1 janv. 1970 00:00:00\" is malformed at \" janv. 1970 00:00:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        int int5 = dateTime2.getWeekyear();
        org.joda.time.DateMidnight dateMidnight6 = dateTime2.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property8 = dateTime2.property(dateTimeFieldType7);
        org.joda.time.DateTime dateTime10 = dateTime2.minusWeeks(17);
        org.joda.time.MonthDay monthDay11 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay13 = monthDay11.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField15 = monthDay13.getField((int) (byte) 0);
        java.util.Locale locale19 = new java.util.Locale("", "", "hi!");
        int int20 = dateTimeField15.getMaximumTextLength(locale19);
        long long23 = dateTimeField15.add((long) 9, (long) (short) 0);
        int int25 = dateTimeField15.get((-187199987L));
        long long27 = dateTimeField15.remainder((long) 'a');
        int int28 = dateTime2.get(dateTimeField15);
        org.joda.time.MonthDay monthDay29 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay31 = monthDay29.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField33 = monthDay31.getField((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = org.joda.time.DateTimeFieldType.era();
        int int35 = monthDay31.indexOf(dateTimeFieldType34);
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.MonthDay monthDay38 = monthDay31.withPeriodAdded(readablePeriod36, (-1));
        org.joda.time.MonthDay monthDay41 = new org.joda.time.MonthDay(0L);
        java.lang.String str42 = monthDay41.toString();
        org.joda.time.MonthDay monthDay44 = monthDay41.plusMonths((int) (byte) 10);
        int[] intArray45 = monthDay41.getValues();
        org.joda.time.MonthDay monthDay47 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay49 = monthDay47.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField51 = monthDay49.getField((int) (byte) 0);
        java.util.Locale locale55 = new java.util.Locale("", "", "hi!");
        int int56 = dateTimeField51.getMaximumTextLength(locale55);
        long long59 = dateTimeField51.add((long) 9, (long) (short) 0);
        int int61 = dateTimeField51.get((-187199987L));
        long long63 = dateTimeField51.remainder((long) 'a');
        long long65 = dateTimeField51.roundFloor(0L);
        java.util.Locale locale67 = java.util.Locale.forLanguageTag("");
        int int68 = dateTimeField51.getMaximumShortTextLength(locale67);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray69 = dateTimeField15.set((org.joda.time.ReadablePartial) monthDay38, (int) (byte) -1, intArray45, "Thu Jan 01 00:00:00 UTC 1970", locale67);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Thu Jan 01 00:00:00 UTC 1970\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 9 + "'", int20 == 9);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 9L + "'", long23 == 9L);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 12 + "'", int25 == 12);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 97L + "'", long27 == 97L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 12 + "'", int28 == 12);
        org.junit.Assert.assertNotNull(monthDay31);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + (-1) + "'", int35 == (-1));
        org.junit.Assert.assertNotNull(monthDay38);
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "--01-03" + "'", str42, "--01-03");
        org.junit.Assert.assertNotNull(monthDay44);
        org.junit.Assert.assertNotNull(intArray45);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray45), "[1, 3]");
        org.junit.Assert.assertNotNull(monthDay49);
        org.junit.Assert.assertNotNull(dateTimeField51);
        org.junit.Assert.assertEquals(locale55.toString(), "");
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 9 + "'", int56 == 9);
        org.junit.Assert.assertTrue("'" + long59 + "' != '" + 9L + "'", long59 == 9L);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 12 + "'", int61 == 12);
        org.junit.Assert.assertTrue("'" + long63 + "' != '" + 97L + "'", long63 == 97L);
        org.junit.Assert.assertTrue("'" + long65 + "' != '" + 0L + "'", long65 == 0L);
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "");
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 3 + "'", int68 == 3);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        java.lang.Object obj6 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) '4', (int) (byte) 0);
        long long13 = dateTimeZone9.convertLocalToUTC((long) 13, true, (long) ' ');
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(obj6, dateTimeZone9);
        org.joda.time.DateTime dateTime15 = dateTime14.toDateTime();
        org.joda.time.DateTimeZone dateTimeZone16 = dateTime14.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((-1), 35, 16, 23, 32772, 6, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + (-187199987L) + "'", long13 == (-187199987L));
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.Chronology chronology6 = localDate2.getChronology();
        org.joda.time.DurationField durationField7 = chronology6.days();
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(durationField7);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime.Property property8 = dateTime4.yearOfCentury();
        int int9 = property8.getLeapAmount();
        java.util.Locale locale11 = java.util.Locale.ITALIAN;
        java.util.Set<java.lang.Character> charSet12 = locale11.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = property8.setCopy("de-DE", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"de-DE\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "it");
        org.junit.Assert.assertNotNull(charSet12);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(0L);
        org.joda.time.MonthDay monthDay3 = monthDay1.minusMonths((int) (byte) 0);
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.MonthDay monthDay5 = monthDay1.minus(readablePeriod4);
        org.joda.time.MonthDay.Property property6 = monthDay1.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = monthDay1.getFieldType(3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 3");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay3);
        org.junit.Assert.assertNotNull(monthDay5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.MonthDay monthDay3 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay5 = monthDay3.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField7 = monthDay5.getField((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = dateTimeFormatter2.print((org.joda.time.ReadablePartial) monthDay5);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay5);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology8 = dateTime7.getChronology();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology12 = chronology8.withZone(dateTimeZone11);
        org.joda.time.MonthDay monthDay13 = org.joda.time.MonthDay.now(chronology8);
        org.joda.time.DateTimeField dateTimeField14 = chronology8.dayOfMonth();
        java.util.Locale locale15 = java.util.Locale.CHINA;
        int int16 = dateTimeField14.getMaximumTextLength(locale15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(monthDay13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2 + "'", int16 == 2);
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        calendar1.set(0, (int) (byte) 10, (int) (short) 10);
        int int12 = calendar1.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear(100);
        int int18 = localDate15.size();
        org.joda.time.LocalDate localDate20 = localDate15.plusMonths(6);
        java.util.Date date21 = localDate20.toDate();
        calendar1.setTime(date21);
        java.util.TimeZone timeZone23 = calendar1.getTimeZone();
        java.util.Locale locale27 = new java.util.Locale("years", "italien", "Cina");
        java.util.Calendar calendar28 = java.util.Calendar.getInstance(timeZone23, locale27);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = locale27.getUnicodeLocaleType("de-DE");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: de-DE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1660348800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=7,WEEK_OF_YEAR=32,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=225,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Aug 13 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertEquals(locale27.toString(), "years_ITALIEN_Cina");
        org.junit.Assert.assertNotNull(calendar28);
// flaky:         org.junit.Assert.assertEquals(calendar28.toString(), "java.util.GregorianCalendar[time=1644572132627,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=32,MILLISECOND=627,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.minusDays((int) '#');
        java.util.TimeZone timeZone5 = null;
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(dateTimeZone6);
        java.util.TimeZone timeZone8 = null;
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forTimeZone(timeZone8);
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = localDate7.toDateTimeAtStartOfDay(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime2.toDateTime(dateTimeZone9);
        org.joda.time.DateTime dateTime14 = dateTime2.plusWeeks(5);
        org.joda.time.DateTime dateTime16 = dateTime14.withWeekyear(52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime16.withYearOfCentury(14399999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14399999 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        java.lang.String str6 = property5.getAsShortText();
        org.joda.time.DateTime dateTime7 = property5.roundHalfEvenCopy();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        java.lang.String str11 = locale9.getCountry();
        java.util.Locale locale12 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str13 = locale9.getDisplayVariant(locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = property5.setCopy("", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3" + "'", str6, "3");
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar10);
// flaky:         org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1644572132753,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=32,MILLISECOND=753,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "zh_TW");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        calendar1.set(0, (int) (byte) 10, (int) (short) 10);
        int int12 = calendar1.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear(100);
        int int18 = localDate15.size();
        org.joda.time.LocalDate localDate20 = localDate15.plusMonths(6);
        java.util.Date date21 = localDate20.toDate();
        calendar1.setTime(date21);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime25.minusDays((int) '#');
        java.util.TimeZone timeZone28 = null;
        org.joda.time.DateTimeZone dateTimeZone29 = org.joda.time.DateTimeZone.forTimeZone(timeZone28);
        org.joda.time.LocalDate localDate30 = new org.joda.time.LocalDate(dateTimeZone29);
        java.util.TimeZone timeZone31 = null;
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.forTimeZone(timeZone31);
        org.joda.time.LocalDate localDate33 = new org.joda.time.LocalDate(dateTimeZone32);
        org.joda.time.DateTime dateTime34 = localDate30.toDateTimeAtStartOfDay(dateTimeZone32);
        org.joda.time.DateTime dateTime35 = dateTime25.toDateTime(dateTimeZone32);
        org.joda.time.DateTime dateTime37 = dateTime25.plusWeeks(5);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((java.lang.Object) dateTime37);
        int int39 = dateTime38.getYearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone41);
        org.joda.time.DateTime dateTime44 = dateTime42.minusDays((int) '#');
        java.util.TimeZone timeZone45 = null;
        org.joda.time.DateTimeZone dateTimeZone46 = org.joda.time.DateTimeZone.forTimeZone(timeZone45);
        org.joda.time.LocalDate localDate47 = new org.joda.time.LocalDate(dateTimeZone46);
        java.util.TimeZone timeZone48 = null;
        org.joda.time.DateTimeZone dateTimeZone49 = org.joda.time.DateTimeZone.forTimeZone(timeZone48);
        org.joda.time.LocalDate localDate50 = new org.joda.time.LocalDate(dateTimeZone49);
        org.joda.time.DateTime dateTime51 = localDate47.toDateTimeAtStartOfDay(dateTimeZone49);
        org.joda.time.DateTime dateTime52 = dateTime42.toDateTime(dateTimeZone49);
        org.joda.time.DateTime dateTime54 = dateTime42.plusWeeks(5);
        org.joda.time.Chronology chronology55 = dateTime42.getChronology();
        org.joda.time.ReadablePeriod readablePeriod56 = null;
        org.joda.time.DateTime dateTime57 = dateTime42.minus(readablePeriod56);
        int int58 = dateTime38.compareTo((org.joda.time.ReadableInstant) dateTime57);
        boolean boolean59 = calendar1.after((java.lang.Object) int58);
        // The following exception was thrown during execution in test generation
        try {
            int int61 = calendar1.get(32772);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32772");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1660348800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=7,WEEK_OF_YEAR=32,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=225,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Aug 13 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTimeZone29);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 70 + "'", int39 == 70);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTimeZone46);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTime57);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 1 + "'", int58 == 1);
        org.junit.Assert.assertTrue("'" + boolean59 + "' != '" + false + "'", boolean59 == false);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        org.joda.time.LocalDate localDate9 = localDate7.withYear(999);
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDate9.getValue(26);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 26");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        java.lang.String str6 = property5.getAsShortText();
        org.joda.time.DurationField durationField7 = property5.getDurationField();
        java.util.Locale locale9 = java.util.Locale.FRENCH;
        java.util.Calendar calendar10 = java.util.Calendar.getInstance(locale9);
        calendar10.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        calendar10.set(0, (int) (byte) 10, (int) (short) 10);
        int int21 = calendar10.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone22 = null;
        org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.forTimeZone(timeZone22);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate(dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate24.withDayOfYear(100);
        int int27 = localDate24.size();
        org.joda.time.LocalDate localDate29 = localDate24.plusMonths(6);
        java.util.Date date30 = localDate29.toDate();
        calendar10.setTime(date30);
        java.util.TimeZone timeZone32 = calendar10.getTimeZone();
        java.util.Locale locale36 = new java.util.Locale("years", "italien", "Cina");
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(timeZone32, locale36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime38 = property5.setCopy("millisOfDay", locale36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"millisOfDay\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3" + "'", str6, "3");
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar10);
        org.junit.Assert.assertEquals(calendar10.toString(), "java.util.GregorianCalendar[time=1660348800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=7,WEEK_OF_YEAR=32,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=225,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 4 + "'", int21 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 3 + "'", int27 == 3);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(date30);
        org.junit.Assert.assertEquals(date30.toString(), "Sat Aug 13 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertEquals(locale36.toString(), "years_ITALIEN_Cina");
        org.junit.Assert.assertNotNull(calendar37);
// flaky:         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=1644572133064,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=33,MILLISECOND=64,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.MonthDay monthDay0 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay2 = monthDay0.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField4 = monthDay2.getField((int) (byte) 0);
        java.util.Locale locale8 = new java.util.Locale("", "", "hi!");
        int int9 = dateTimeField4.getMaximumTextLength(locale8);
        long long12 = dateTimeField4.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay13 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay15 = monthDay13.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.MonthDay monthDay17 = monthDay13.minus(readablePeriod16);
        org.joda.time.MonthDay monthDay18 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay20 = monthDay18.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField22 = monthDay20.getField((int) (byte) 0);
        java.util.Locale locale26 = new java.util.Locale("", "", "hi!");
        int int27 = dateTimeField22.getMaximumTextLength(locale26);
        java.lang.String str28 = dateTimeField4.getAsShortText((org.joda.time.ReadablePartial) monthDay13, locale26);
        int[] intArray29 = monthDay13.getValues();
        org.joda.time.ReadablePeriod readablePeriod30 = null;
        org.joda.time.MonthDay monthDay32 = monthDay13.withPeriodAdded(readablePeriod30, 59);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone34);
        org.joda.time.DateTime dateTime37 = dateTime35.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property38 = dateTime37.hourOfDay();
        org.joda.time.DateTime dateTime40 = dateTime37.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology41 = dateTime40.getChronology();
        org.joda.time.DateTimeZone dateTimeZone44 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology45 = chronology41.withZone(dateTimeZone44);
        org.joda.time.MonthDay monthDay46 = org.joda.time.MonthDay.now(chronology41);
        org.joda.time.DateTimeField dateTimeField47 = chronology41.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField48 = chronology41.year();
        org.joda.time.DateTimeField dateTimeField49 = chronology41.minuteOfDay();
        org.joda.time.MonthDay monthDay50 = monthDay32.withChronologyRetainFields(chronology41);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int52 = monthDay50.get(dateTimeFieldType51);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(monthDay2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertEquals(locale8.toString(), "");
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 9 + "'", int9 == 9);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 9L + "'", long12 == 9L);
        org.junit.Assert.assertNotNull(monthDay15);
        org.junit.Assert.assertNotNull(monthDay17);
        org.junit.Assert.assertNotNull(monthDay20);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertEquals(locale26.toString(), "");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 9 + "'", int27 == 9);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Feb" + "'", str28, "Feb");
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[2, 13]");
        org.junit.Assert.assertNotNull(monthDay32);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(chronology41);
        org.junit.Assert.assertNotNull(dateTimeZone44);
        org.junit.Assert.assertNotNull(chronology45);
        org.junit.Assert.assertNotNull(monthDay46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTimeField49);
        org.junit.Assert.assertNotNull(monthDay50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.MonthDay monthDay4 = new org.joda.time.MonthDay(0L);
        java.lang.String str5 = monthDay4.toString();
        org.joda.time.Chronology chronology6 = monthDay4.getChronology();
        org.joda.time.Chronology chronology7 = monthDay4.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((int) (byte) 0, 365, 14, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 365 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "--01-03" + "'", str5, "--01-03");
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setLenient(true);
        calendar1.set((-1), 0, 32770, (int) 'u', (int) (byte) -1, 1439);
        java.util.Locale locale13 = java.util.Locale.US;
        java.lang.String str14 = locale13.getLanguage();
        java.lang.String str15 = locale13.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap16 = calendar1.getDisplayNames((int) (short) 100, 21, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=-1,MONTH=0,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=32770,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=117,MINUTE=-1,SECOND=1439,MILLISECOND=262,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "en" + "'", str14, "en");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "eng" + "'", str15, "eng");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.Interval interval5 = localDate4.toInterval();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.days();
        java.lang.String str7 = durationFieldType6.getName();
        org.joda.time.LocalDate localDate9 = localDate4.withFieldAdded(durationFieldType6, 32770);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime12.minusDays((int) '#');
        int int15 = dateTime12.getWeekyear();
        org.joda.time.DateMidnight dateMidnight16 = dateTime12.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property18 = dateTime12.property(dateTimeFieldType17);
        boolean boolean19 = localDate4.isSupported(dateTimeFieldType17);
        java.util.Locale locale20 = java.util.Locale.FRENCH;
        java.util.Calendar calendar21 = java.util.Calendar.getInstance(locale20);
        calendar21.setLenient(true);
        calendar21.setMinimalDaysInFirstWeek(1970);
        int int27 = calendar21.getGreatestMinimum(10);
        org.joda.time.MonthDay monthDay28 = org.joda.time.MonthDay.fromCalendarFields(calendar21);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = localDate4.compareTo((org.joda.time.ReadablePartial) monthDay28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "days" + "'", str7, "days");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1970 + "'", int15 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1644572133348,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=33,MILLISECOND=348,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertNotNull(monthDay28);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        java.lang.String str6 = property5.getAsShortText();
        org.joda.time.MonthDay monthDay7 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay9 = monthDay7.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField11 = monthDay9.getField((int) (byte) 0);
        java.util.Locale locale15 = new java.util.Locale("", "", "hi!");
        int int16 = dateTimeField11.getMaximumTextLength(locale15);
        long long19 = dateTimeField11.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay20 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay22 = monthDay20.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.MonthDay monthDay24 = monthDay20.minus(readablePeriod23);
        org.joda.time.MonthDay monthDay25 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay27 = monthDay25.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField29 = monthDay27.getField((int) (byte) 0);
        java.util.Locale locale33 = new java.util.Locale("", "", "hi!");
        int int34 = dateTimeField29.getMaximumTextLength(locale33);
        java.lang.String str35 = dateTimeField11.getAsShortText((org.joda.time.ReadablePartial) monthDay20, locale33);
        int int36 = property5.getMaximumTextLength(locale33);
        org.joda.time.DateTimeField dateTimeField37 = property5.getField();
        java.util.Locale locale38 = java.util.Locale.FRENCH;
        java.util.Calendar calendar39 = java.util.Calendar.getInstance(locale38);
        int int40 = property5.getMaximumTextLength(locale38);
        java.lang.String str41 = locale38.getDisplayVariant();
        java.util.Locale locale42 = java.util.Locale.US;
        java.lang.String str43 = locale42.toLanguageTag();
        java.lang.String str44 = locale38.getDisplayName(locale42);
        java.lang.String str45 = locale42.getLanguage();
        java.util.Set<java.lang.Character> charSet46 = locale42.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str48 = locale42.getExtension(' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key:  ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "3" + "'", str6, "3");
        org.junit.Assert.assertNotNull(monthDay9);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 9 + "'", int16 == 9);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 9L + "'", long19 == 9L);
        org.junit.Assert.assertNotNull(monthDay22);
        org.junit.Assert.assertNotNull(monthDay24);
        org.junit.Assert.assertNotNull(monthDay27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertEquals(locale33.toString(), "");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 9 + "'", int34 == 9);
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "Feb" + "'", str35, "Feb");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar39);
// flaky:         org.junit.Assert.assertEquals(calendar39.toString(), "java.util.GregorianCalendar[time=1644572133448,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=33,MILLISECOND=448,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 2 + "'", int40 == 2);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "en_US");
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "en-US" + "'", str43, "en-US");
        org.junit.Assert.assertEquals("'" + str44 + "' != '" + "French" + "'", str44, "French");
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "en" + "'", str45, "en");
        org.junit.Assert.assertNotNull(charSet46);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        java.lang.String str1 = durationFieldType0.toString();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone3);
        org.joda.time.DateTime dateTime6 = dateTime4.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property7 = dateTime6.hourOfDay();
        org.joda.time.DateTime dateTime9 = dateTime6.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology10 = dateTime9.getChronology();
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology14 = chronology10.withZone(dateTimeZone13);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now(chronology14);
        org.joda.time.DurationField durationField16 = chronology14.seconds();
        boolean boolean17 = durationFieldType0.isSupported(chronology14);
        org.joda.time.DateTimeField dateTimeField18 = chronology14.dayOfYear();
        java.util.Locale locale19 = java.util.Locale.FRENCH;
        java.util.Calendar calendar20 = java.util.Calendar.getInstance(locale19);
        calendar20.setLenient(true);
        calendar20.setMinimalDaysInFirstWeek(1970);
        int int26 = calendar20.getGreatestMinimum(10);
        java.time.Instant instant27 = calendar20.toInstant();
        java.util.Date date28 = java.util.Date.from(instant27);
        org.joda.time.MonthDay monthDay29 = org.joda.time.MonthDay.fromDateFields(date28);
        org.joda.time.MonthDay monthDay31 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property32 = monthDay31.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property32.getFieldType();
        org.joda.time.DurationField durationField34 = property32.getRangeDurationField();
        org.joda.time.MonthDay monthDay36 = property32.addWrapFieldToCopy((int) ' ');
        int int37 = monthDay29.compareTo((org.joda.time.ReadablePartial) monthDay36);
        org.joda.time.MonthDay monthDay39 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay41 = monthDay39.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField43 = monthDay41.getField((int) (byte) 0);
        java.util.Locale locale47 = new java.util.Locale("", "", "hi!");
        int int48 = dateTimeField43.getMaximumTextLength(locale47);
        long long51 = dateTimeField43.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay52 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay54 = monthDay52.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod55 = null;
        org.joda.time.MonthDay monthDay56 = monthDay52.minus(readablePeriod55);
        org.joda.time.MonthDay monthDay57 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay59 = monthDay57.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField61 = monthDay59.getField((int) (byte) 0);
        java.util.Locale locale65 = new java.util.Locale("", "", "hi!");
        int int66 = dateTimeField61.getMaximumTextLength(locale65);
        java.lang.String str67 = dateTimeField43.getAsShortText((org.joda.time.ReadablePartial) monthDay52, locale65);
        int[] intArray68 = monthDay52.getValues();
        org.joda.time.ReadablePeriod readablePeriod69 = null;
        org.joda.time.MonthDay monthDay71 = monthDay52.withPeriodAdded(readablePeriod69, 59);
        int[] intArray72 = monthDay52.getValues();
        int[] intArray73 = monthDay52.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray75 = dateTimeField18.set((org.joda.time.ReadablePartial) monthDay29, 1439, intArray73, 349260000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 349260000 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "days" + "'", str1, "days");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeField18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar20);
// flaky:         org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=1644572133476,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1970,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=6,WEEK_OF_MONTH=1,DAY_OF_MONTH=11,DAY_OF_YEAR=42,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,HOUR_OF_DAY=9,MINUTE=35,SECOND=33,MILLISECOND=476,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
        org.junit.Assert.assertNotNull(instant27);
        org.junit.Assert.assertNotNull(date28);
// flaky:         org.junit.Assert.assertEquals(date28.toString(), "Fri Feb 11 09:35:33 UTC 2022");
        org.junit.Assert.assertNotNull(monthDay29);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(monthDay36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + (-1) + "'", int37 == (-1));
        org.junit.Assert.assertNotNull(monthDay41);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertEquals(locale47.toString(), "");
        org.junit.Assert.assertTrue("'" + int48 + "' != '" + 9 + "'", int48 == 9);
        org.junit.Assert.assertTrue("'" + long51 + "' != '" + 9L + "'", long51 == 9L);
        org.junit.Assert.assertNotNull(monthDay54);
        org.junit.Assert.assertNotNull(monthDay56);
        org.junit.Assert.assertNotNull(monthDay59);
        org.junit.Assert.assertNotNull(dateTimeField61);
        org.junit.Assert.assertEquals(locale65.toString(), "");
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 9 + "'", int66 == 9);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "Feb" + "'", str67, "Feb");
        org.junit.Assert.assertNotNull(intArray68);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray68), "[2, 13]");
        org.junit.Assert.assertNotNull(monthDay71);
        org.junit.Assert.assertNotNull(intArray72);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray72), "[2, 13]");
        org.junit.Assert.assertNotNull(intArray73);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray73), "[2, 13]");
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        org.joda.time.Chronology chronology3 = dateTimeFormatter2.getChronology();
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter2.getParser();
        java.io.Writer writer5 = null;
        org.joda.time.MonthDay monthDay6 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay8 = monthDay6.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField10 = monthDay8.getField((int) (byte) 0);
        java.util.Locale locale14 = new java.util.Locale("", "", "hi!");
        int int15 = dateTimeField10.getMaximumTextLength(locale14);
        long long18 = dateTimeField10.add((long) 9, (long) (short) 0);
        org.joda.time.MonthDay monthDay19 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay21 = monthDay19.minusDays((int) (short) 10);
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        org.joda.time.MonthDay monthDay23 = monthDay19.minus(readablePeriod22);
        org.joda.time.MonthDay monthDay24 = new org.joda.time.MonthDay();
        org.joda.time.MonthDay monthDay26 = monthDay24.minusDays((int) (short) 10);
        org.joda.time.DateTimeField dateTimeField28 = monthDay26.getField((int) (byte) 0);
        java.util.Locale locale32 = new java.util.Locale("", "", "hi!");
        int int33 = dateTimeField28.getMaximumTextLength(locale32);
        java.lang.String str34 = dateTimeField10.getAsShortText((org.joda.time.ReadablePartial) monthDay19, locale32);
        int[] intArray35 = monthDay19.getValues();
        org.joda.time.ReadablePeriod readablePeriod36 = null;
        org.joda.time.MonthDay monthDay38 = monthDay19.withPeriodAdded(readablePeriod36, 59);
        org.joda.time.MonthDay monthDay40 = monthDay19.plusMonths(2);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer5, (org.joda.time.ReadablePartial) monthDay40);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology3);
        org.junit.Assert.assertNull(dateTimeParser4);
        org.junit.Assert.assertNotNull(monthDay8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals(locale14.toString(), "");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 9 + "'", int15 == 9);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 9L + "'", long18 == 9L);
        org.junit.Assert.assertNotNull(monthDay21);
        org.junit.Assert.assertNotNull(monthDay23);
        org.junit.Assert.assertNotNull(monthDay26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertEquals(locale32.toString(), "");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 9 + "'", int33 == 9);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Feb" + "'", str34, "Feb");
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[2, 13]");
        org.junit.Assert.assertNotNull(monthDay38);
        org.junit.Assert.assertNotNull(monthDay40);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder3 = builder0.setExtension('u', "en-US");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.removeUnicodeLocaleAttribute("fr");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: fr [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone1);
        org.joda.time.DateTime dateTime4 = dateTime2.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property5 = dateTime4.hourOfDay();
        org.joda.time.DateTime dateTime7 = dateTime4.withSecondOfMinute((int) (byte) 0);
        org.joda.time.DateTime dateTime9 = dateTime4.plusYears((int) '#');
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime15.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property18 = dateTime17.hourOfDay();
        org.joda.time.DateTime dateTime20 = dateTime17.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology21 = dateTime20.getChronology();
        org.joda.time.MonthDay monthDay22 = monthDay12.withChronologyRetainFields(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfHalfday();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.millisOfDay();
        boolean boolean25 = durationFieldType10.isSupported(chronology21);
        org.joda.time.DurationField durationField26 = chronology21.millis();
        org.joda.time.DurationField durationField27 = chronology21.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((java.lang.Object) '#', chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Character");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(monthDay22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(durationField27);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setLenient(true);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder5 = builder2.setWeekDefinition(32769, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay((long) ' ');
        org.joda.time.MonthDay.Property property2 = monthDay1.monthOfYear();
        int int3 = property2.getMinimumValueOverall();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime6.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property9 = dateTime8.hourOfDay();
        int int10 = property2.compareTo((org.joda.time.ReadableInstant) dateTime8);
        org.joda.time.DurationField durationField11 = property2.getDurationField();
        java.lang.String str12 = property2.getName();
        java.lang.String str13 = property2.getAsText();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "monthOfYear" + "'", str12, "monthOfYear");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "janvier" + "'", str13, "janvier");
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        org.joda.time.LocalDate.Property property6 = localDate2.era();
        org.joda.time.LocalDate localDate7 = property6.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDate7.getValue((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.util.TimeZone timeZone0 = null;
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.withDayOfYear(100);
        int int5 = localDate2.size();
        org.joda.time.LocalDate localDate7 = localDate2.plusMonths(6);
        java.util.Date date8 = localDate7.toDate();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone10);
        org.joda.time.DateTime dateTime13 = dateTime11.minusDays((int) '#');
        java.util.TimeZone timeZone14 = null;
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forTimeZone(timeZone14);
        org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate(dateTimeZone15);
        java.util.TimeZone timeZone17 = null;
        org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.forTimeZone(timeZone17);
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate(dateTimeZone18);
        org.joda.time.DateTime dateTime20 = localDate16.toDateTimeAtStartOfDay(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime11.toDateTime(dateTimeZone18);
        org.joda.time.DateTime dateTime23 = dateTime11.plusWeeks(5);
        org.joda.time.Chronology chronology24 = dateTime11.getChronology();
        org.joda.time.ReadablePeriod readablePeriod25 = null;
        org.joda.time.DateTime dateTime26 = dateTime11.minus(readablePeriod25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.minuteOfDay();
        boolean boolean28 = dateTime11.isSupported(dateTimeFieldType27);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = localDate7.get(dateTimeFieldType27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 3 + "'", int5 == 3);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(date8);
        org.junit.Assert.assertEquals(date8.toString(), "Sat Aug 13 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        org.joda.time.Chronology chronology4 = dateTimeFormatter3.getChronology();
        boolean boolean5 = dateTimeFormatter3.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = dateTimeFormatter3.withDefaultYear(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MonthDay monthDay8 = org.joda.time.MonthDay.parse("--02-11", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(chronology4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter7);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        java.util.Locale locale0 = java.util.Locale.FRENCH;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.set((int) (short) 10, 12, (int) (short) 0, (int) '#', 13);
        calendar1.set(0, (int) (byte) 10, (int) (short) 10);
        int int12 = calendar1.getMinimalDaysInFirstWeek();
        java.util.TimeZone timeZone13 = null;
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate(dateTimeZone14);
        org.joda.time.LocalDate localDate17 = localDate15.withDayOfYear(100);
        int int18 = localDate15.size();
        org.joda.time.LocalDate localDate20 = localDate15.plusMonths(6);
        java.util.Date date21 = localDate20.toDate();
        calendar1.setTime(date21);
        java.util.TimeZone timeZone23 = calendar1.getTimeZone();
        java.lang.Object obj24 = calendar1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1660348800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=7,WEEK_OF_YEAR=32,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=225,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 4 + "'", int12 == 4);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 3 + "'", int18 == 3);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(date21);
        org.junit.Assert.assertEquals(date21.toString(), "Sat Aug 13 00:00:00 UTC 2022");
        org.junit.Assert.assertNotNull(timeZone23);
        org.junit.Assert.assertEquals(timeZone23.getDisplayName(), "Temps universel coordonn\351");
        org.junit.Assert.assertNotNull(obj24);
        org.junit.Assert.assertEquals(obj24.toString(), "java.util.GregorianCalendar[time=1660348800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=7,WEEK_OF_YEAR=32,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=225,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj24), "java.util.GregorianCalendar[time=1660348800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=7,WEEK_OF_YEAR=32,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=225,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj24), "java.util.GregorianCalendar[time=1660348800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=7,WEEK_OF_YEAR=32,WEEK_OF_MONTH=2,DAY_OF_MONTH=13,DAY_OF_YEAR=225,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.millis();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime10.withYearOfEra((int) '4');
        org.joda.time.DateTime.Property property13 = dateTime12.hourOfDay();
        org.joda.time.DateTime dateTime15 = dateTime12.withSecondOfMinute((int) (byte) 0);
        org.joda.time.Chronology chronology16 = dateTime15.getChronology();
        org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) 'a', (int) (byte) 1);
        org.joda.time.Chronology chronology20 = chronology16.withZone(dateTimeZone19);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now(chronology20);
        boolean boolean22 = durationFieldType7.isSupported(chronology20);
        org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate((java.lang.Object) localDate6, chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(32770, 999, 29, 0, 1439, 229, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1439 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.lang.StringBuffer stringBuffer3 = null;
        java.util.TimeZone timeZone4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forTimeZone(timeZone4);
        org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate6.withDayOfYear(100);
        int int9 = localDate6.size();
        org.joda.time.LocalDate localDate11 = localDate6.plusMonths(6);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((java.lang.Object) (-1L), dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime14.minusDays((int) '#');
        int int17 = dateTime14.getWeekyear();
        org.joda.time.DateMidnight dateMidnight18 = dateTime14.toDateMidnight();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.DateTime.Property property20 = dateTime14.property(dateTimeFieldType19);
        org.joda.time.LocalDate.Property property21 = localDate11.property(dateTimeFieldType19);
        java.lang.String str22 = localDate11.toString();
        org.joda.time.LocalDate localDate24 = localDate11.minusYears(4);
        org.joda.time.LocalDate localDate26 = localDate24.plusWeeks(229);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer3, (org.joda.time.ReadablePartial) localDate24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1970 + "'", int17 == 1970);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2022-08-13" + "'", str22, "2022-08-13");
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(localDate26);
    }
}
