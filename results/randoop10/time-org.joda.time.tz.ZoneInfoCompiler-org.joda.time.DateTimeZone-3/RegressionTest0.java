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
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
        int int0 = java.util.Calendar.SEPTEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
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
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
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
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (byte) -1, (int) (short) 100, (int) ' ', 3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTime(dateTimeZone4);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int7 = dateTime2.get(dateTimeFieldType6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime2.plusYears((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = dateTime9.get(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) 'a', (int) (byte) 0, 0, (int) (short) 10, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField4 = localTime2.getField((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) durationFieldType0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DurationFieldType$StandardDurationFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
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
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = calendar4.isSet((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        boolean boolean3 = file2.isDirectory();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((java.lang.Object) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100L, chronology6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean11 = dateTime9.isSupported(dateTimeFieldType10);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localDate4.get(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.lang.String str0 = java.io.File.separator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + "/" + "'", str0, "/");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar4.getLeastMaximum(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1970");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(3);
        java.lang.String str5 = localDate2.toString();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "1970-01-01" + "'", str5, "1970-01-01");
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDate4.getValue((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
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
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = dateTime2.withMinuteOfHour((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((int) 'a', (int) (byte) 100, 8, 10, (int) (short) -1, (int) (byte) -1, 3, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(3);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        boolean boolean0 = org.joda.time.tz.ZoneInfoCompiler.verbose();
        org.junit.Assert.assertTrue("'" + boolean0 + "' != '" + false + "'", boolean0 == false);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = java.io.File.createTempFile("/", "/");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Prefix string too short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        double double0 = java.util.Locale.LanguageRange.MIN_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 0.0d + "'", double0 == 0.0d);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) ' ', (int) (byte) 10, (int) (short) 100, 1, (int) (short) 0, (int) (short) 100, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
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
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) '#', (int) (byte) -1, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("/");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: / [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        int int13 = dateTime12.getEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = dateTime12.withTime(2, (-1), 9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        int int0 = java.util.Calendar.LONG_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((int) (short) 100, 20, 0, chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
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
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime5 = localTime2.withMillisOfSecond((int) (byte) 10);
        int int6 = localTime5.getMillisOfDay();
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) int6, chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32580010 + "'", int6 == 32580010);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis((int) 'a');
        org.joda.time.LocalTime localTime6 = localTime2.withMillisOfSecond(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType8 = localTime2.getFieldType((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDate4.get(dateTimeFieldType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (short) 100, 3, (int) (byte) 10, (int) '#', 9);
        // The following exception was thrown during execution in test generation
        try {
            calendar4.clear((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=35,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale5 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet6 = locale5.getUnicodeLocaleKeys();
        java.lang.String str7 = timeZone0.getDisplayName(false, 0, locale5);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals(locale5.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "UTC" + "'", str7, "UTC");
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (byte) 1, 1, (-1));
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(100L, chronology15);
        boolean boolean17 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime16);
        int int18 = dateTime13.getDayOfYear();
        org.joda.time.DateTime dateTime21 = dateTime13.withDurationAdded((long) (short) 0, 100);
        int int22 = dateTime21.getWeekOfWeekyear();
        boolean boolean23 = calendar4.before((java.lang.Object) dateTime21);
        java.util.Locale locale28 = new java.util.Locale("", "hi!");
        java.util.Locale locale31 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.lang.String str33 = locale31.getVariant();
        java.lang.String str34 = locale28.getDisplayScript(locale31);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap35 = calendar4.getDisplayNames((int) 'a', 0, locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=-1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals(locale28.toString(), "_HI!");
        org.junit.Assert.assertEquals(locale31.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(4, 10, 1970, 20, (int) 'a', 360000000, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.Chronology chronology1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((java.lang.Object) 0, chronology1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
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
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("1970-01-01T00:00:00.100Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 1970-01-01T00:00:00.100Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localTime2.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = timeZone0.getDisplayName(false, (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 35");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis((int) 'a');
        org.joda.time.LocalTime localTime6 = localTime2.withMillisOfSecond(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime2.withField(dateTimeFieldType7, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate3.withDayOfWeek((int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        long long3 = file2.length();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((long) '#', dateTimeZone6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((java.lang.Object) file2, dateTimeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.io.File");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 45056L + "'", long3 == 45056L);
        org.junit.Assert.assertNotNull(dateTimeZone6);
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(32769, (int) '4', 100, (int) (byte) 0, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        char char0 = java.io.File.separatorChar;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + '/' + "'", char0 == '/');
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate3.getValue(32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32770");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        int int5 = localDate4.getCenturyOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.withFields((org.joda.time.ReadablePartial) localDate4);
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.minusYears(3);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType12 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean13 = localDateTime11.isSupported(dateTimeFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDate4.get(dateTimeFieldType12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(dateTimeFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(10);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.plusDays(3);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localDate7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDate7);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        int int2 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        java.lang.String str3 = file2.getCanonicalPath();
        boolean boolean4 = file2.mkdir();
        boolean boolean5 = file2.isDirectory();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/experiment/hi!" + "'", str3, "/experiment/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.Interval interval2 = localDate1.toInterval();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localDate1.getValue(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1970");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval2);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int14 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(9, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = property15.compareTo((org.joda.time.ReadablePartial) localTime19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationField16);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.addUnicodeLocaleAttribute("+100:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: +100:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        java.util.Date date3 = localDateTime0.toDate();
        java.lang.String str4 = date3.toString();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Feb 21 15:01:51 UTC 2022");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Mon Feb 21 15:01:51 UTC 2022" + "'", str4, "Mon Feb 21 15:01:51 UTC 2022");
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int1 = timeZone0.getRawOffset();
        java.util.Locale locale7 = new java.util.Locale("dayOfWeek", "1970-01-01", "1970");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeZone0.getDisplayName(false, 2, locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 2");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertEquals(locale7.toString(), "dayofweek_1970-01-01_1970");
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.setTimeInMillis((long) 'a');
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(100L, chronology8);
        java.util.Locale locale10 = null;
        java.util.Calendar calendar11 = dateTime9.toCalendar(locale10);
        calendar11.clear(9);
        int int14 = calendar4.compareTo(calendar11);
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=97,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=97,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + (-1) + "'", int14 == (-1));
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime4.withWeekyear(360000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 360000000 for weekyear must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime2.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime2.year();
        org.joda.time.DateTime.Property property11 = dateTime2.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = property11.setCopy("Mon Feb 21 15:01:51 UTC 2022");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Mon Feb 21 15:01:51 UTC 2022\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = calendar4.getLeastMaximum(32580010);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32580010");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        java.util.Locale locale3 = java.util.Locale.PRC;
        java.lang.String str4 = locale1.getDisplayCountry(locale3);
        java.lang.String str5 = timeZone0.getDisplayName(locale3);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str4, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "\u534f\u8c03\u4e16\u754c\u65f6\u95f4" + "'", str5, "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.removeUnicodeLocaleAttribute("00:03:00.000");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 00:03:00.000 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.withWeekyear((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate5.withDayOfMonth((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for dayOfMonth must be in the range [1,29]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime3.withCenturyOfEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (short) 100, 3, (int) (byte) 10, (int) '#', 9);
        boolean boolean13 = calendar4.isLenient();
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=35,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        int int0 = java.util.Calendar.MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        java.lang.String str3 = file2.getCanonicalPath();
        long long4 = file2.lastModified();
        boolean boolean5 = file2.isDirectory();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/experiment/hi!" + "'", str3, "/experiment/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1645454200000L + "'", long4 == 1645454200000L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int1 = timeZone0.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType5.getField(chronology7);
        java.lang.String str10 = dateTimeField8.getAsText((long) (byte) 100);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        int int12 = localDate11.getCenturyOfEra();
        org.joda.time.LocalDate localDate14 = localDate11.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate16 = localDate14.withWeekyear((int) (short) 0);
        java.util.Locale locale19 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet20 = locale19.getUnicodeLocaleKeys();
        java.util.Locale locale23 = new java.util.Locale("", "hi!");
        java.util.Locale locale26 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleKeys();
        java.lang.String str28 = locale26.getVariant();
        java.lang.String str29 = locale23.getDisplayScript(locale26);
        java.lang.String str30 = locale19.getDisplayScript(locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = dateTimeField8.getAsShortText((org.joda.time.ReadablePartial) localDate14, locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfSecond' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 20 + "'", int12 == 20);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertEquals(locale19.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet20);
        org.junit.Assert.assertEquals(locale23.toString(), "_HI!");
        org.junit.Assert.assertEquals(locale26.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (byte) 1, 1, (-1));
        java.util.Locale locale13 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = calendar4.getDisplayName((int) (byte) -1, (-1), locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=-1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "de_DE");
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = strSet1.add("dayOfWeek");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.util.Date date0 = new java.util.Date();
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        boolean boolean3 = date0.equals((java.lang.Object) (short) 0);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 15:01:52 UTC 2022");
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime3.withField(dateTimeFieldType7, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTime.Property property5 = dateTime2.minuteOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        boolean boolean12 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime8.getDayOfYear();
        org.joda.time.DateTime dateTime16 = dateTime8.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime18 = dateTime8.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int20 = dateTime18.get(dateTimeFieldType19);
        boolean boolean21 = dateTime2.isSupported(dateTimeFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime25 = dateTime2.withDate(1970, 32580010, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32580010 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader1 = new java.io.BufferedReader(reader0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.lang.String str0 = java.io.File.pathSeparator;
        org.junit.Assert.assertEquals("'" + str0 + "' != '" + ":" + "'", str0, ":");
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (short) 100, 3, (int) (byte) 10, (int) '#', 9);
        java.lang.String str13 = calendar4.toString();
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=35,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=35,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str13, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=35,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap4);
        java.util.Locale locale8 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        java.util.Locale locale12 = new java.util.Locale("", "hi!");
        java.util.Locale locale13 = java.util.Locale.FRANCE;
        java.util.Locale locale15 = new java.util.Locale("");
        java.util.Locale locale18 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet19 = locale18.getUnicodeLocaleKeys();
        java.lang.String str20 = locale18.getVariant();
        java.lang.String str21 = locale18.getISO3Language();
        java.util.Locale locale22 = java.util.Locale.TAIWAN;
        java.util.Locale locale23 = java.util.Locale.FRENCH;
        java.util.Locale locale26 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet27 = locale26.getUnicodeLocaleKeys();
        java.lang.String str28 = locale26.getVariant();
        java.util.Locale locale31 = new java.util.Locale("", "hi!");
        java.util.Locale locale34 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet35 = locale34.getUnicodeLocaleKeys();
        java.lang.String str36 = locale34.getVariant();
        java.lang.String str37 = locale31.getDisplayScript(locale34);
        java.util.Locale[] localeArray38 = new java.util.Locale[] { locale8, locale12, locale13, locale15, locale18, locale22, locale23, locale26, locale34 };
        java.util.ArrayList<java.util.Locale> localeList39 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList39, localeArray38);
        java.util.List<java.util.Locale> localeList41 = java.util.Locale.filter(languageRangeList5, (java.util.Collection<java.util.Locale>) localeList39);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList41);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertEquals(locale12.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale15.toString(), "");
        org.junit.Assert.assertEquals(locale18.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "" + "'", str21, "");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "fr");
        org.junit.Assert.assertEquals(locale26.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals(locale31.toString(), "_HI!");
        org.junit.Assert.assertEquals(locale34.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(localeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNotNull(localeList41);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(9, 3);
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate1.compareTo((org.joda.time.ReadablePartial) localTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        int int5 = localDate4.getCenturyOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.withFields((org.joda.time.ReadablePartial) localDate4);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property10 = localTime9.hourOfDay();
        org.joda.time.LocalTime localTime11 = property10.withMinimumValue();
        int int12 = localTime11.getHourOfDay();
        org.joda.time.LocalTime.Property property13 = localTime11.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = localDate0.isEqual((org.joda.time.ReadablePartial) localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        int int1 = timeZone0.getRawOffset();
        java.util.TimeZone timeZone2 = java.util.TimeZone.getDefault();
        int int3 = timeZone2.getRawOffset();
        boolean boolean4 = timeZone0.hasSameRules(timeZone2);
        java.util.Date date5 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = timeZone2.inDaylightTime(date5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(timeZone2);
        org.junit.Assert.assertEquals(timeZone2.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        java.util.Locale locale3 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleKeys();
        java.util.Locale locale5 = java.util.Locale.PRC;
        java.lang.String str6 = locale3.getDisplayCountry(locale5);
        java.lang.String str7 = dateTimeZone1.getShortName((long) 3, locale5);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale5.getUnicodeLocaleType("UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: UTC");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str6, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "+00:00" + "'", str7, "+00:00");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int14 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        int int17 = property15.get();
        java.lang.String str18 = property15.getName();
        java.util.Locale locale20 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = property15.setCopy("hi!", locale20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "dayOfWeek" + "'", str18, "dayOfWeek");
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) '#', dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int5 = localDateTime4.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withHourOfDay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = java.io.File.createTempFile("+00:00", "/experiment/hi!");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: Unable to create temporary file, /tmp/+00:006682030941707576463/experiment/hi!");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
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
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getMonth();
        java.util.Date date2 = new java.util.Date();
        date2.setDate(32769);
        boolean boolean5 = date0.after(date2);
        java.lang.Object obj6 = date2.clone();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 15:01:53 UTC 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Oct 21 15:01:53 UTC 2111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
// flaky:         org.junit.Assert.assertEquals(obj6.toString(), "Wed Oct 21 15:01:53 UTC 2111");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "Wed Oct 21 15:01:53 UTC 2111");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "Wed Oct 21 15:01:53 UTC 2111");
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(0, (int) (short) 100, 360000000, (int) 'a', 15, 24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.era();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        boolean boolean7 = localDateTime2.isSupported(dateTimeFieldType6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType9 = localDateTime2.getFieldType((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property4 = localTime3.hourOfDay();
        org.joda.time.LocalTime localTime6 = localTime3.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = chronology7.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) "0000-02-21", chronology7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"0000-02-21\" is malformed at \"00-02-21\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = calendar4.getActualMaximum((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(3);
        org.joda.time.LocalDate localDate6 = localDate4.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate8 = localDate4.withWeekOfWeekyear(5);
        org.joda.time.DateTime dateTime9 = localDate4.toDateTimeAtStartOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDate4.getValue((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate7 = localDate3.minusWeeks(100);
        org.joda.time.LocalDate.Property property8 = localDate3.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) property8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime17.plus((long) 'a');
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(11);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis((long) 8);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime31 = localTime28.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime25.toDateTime(chronology32);
        org.joda.time.DateTime dateTime34 = dateTime12.withChronology(chronology32);
        // The following exception was thrown during execution in test generation
        try {
            long long42 = chronology32.getDateTimeMillis(0, 360000000, (int) (short) -1, 1970, (int) (short) 100, (int) (byte) 1, 32580010);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(20, 32400000, (int) 'x', 422, 9, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 422 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        long long3 = file2.length();
        boolean boolean4 = file2.exists();
        boolean boolean5 = file2.delete();
        java.io.File file6 = null;
        java.io.File file8 = new java.io.File(file6, "hi!");
        java.lang.String str9 = file8.getCanonicalPath();
        boolean boolean10 = file8.mkdir();
        int int11 = file2.compareTo(file8);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 45056L + "'", long3 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str9 + "' != '" + "/experiment/hi!" + "'", str9, "/experiment/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getMonth();
        java.util.Date date2 = new java.util.Date();
        date2.setDate(32769);
        boolean boolean5 = date0.after(date2);
        java.util.Date date6 = null;
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = date2.before(date6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 15:01:54 UTC 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Oct 21 15:01:54 UTC 2111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(0L);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField4 = localTime1.getField(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(11);
        org.joda.time.DateTime dateTime12 = dateTime10.withMillis((long) 8);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property16 = localTime15.hourOfDay();
        org.joda.time.LocalTime localTime18 = localTime15.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTime dateTime20 = dateTime12.toDateTime(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = chronology19.get(readablePeriod22, 0L, 90L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        java.lang.Class<?> wildcardClass4 = localDateTime2.getClass();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(wildcardClass4);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) '/', 100, (int) (short) -1, 100, (int) (short) -1, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.setLenient(false);
        calendar4.set(10, 8, 5, 20, 100);
        java.lang.Object obj17 = calendar4.clone();
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10,MONTH=8,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=20,MINUTE=100,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(obj17);
// flaky:         org.junit.Assert.assertEquals(obj17.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10,MONTH=8,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=20,MINUTE=100,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10,MONTH=8,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=20,MINUTE=100,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10,MONTH=8,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=20,MINUTE=100,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.roundFloorCopy();
        int int5 = localTime4.getMillisOfDay();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        int int7 = localDate6.getCenturyOfEra();
        org.joda.time.LocalDate localDate9 = localDate6.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate11 = localDate9.minusWeeks(2);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, chronology13);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(100L, chronology16);
        boolean boolean18 = dateTime14.isAfter((org.joda.time.ReadableInstant) dateTime17);
        int int19 = dateTime14.getDayOfYear();
        org.joda.time.DateTime dateTime21 = dateTime14.plusYears((int) (short) 0);
        long long22 = dateTime14.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int24 = dateTime14.get(dateTimeFieldType23);
        boolean boolean25 = localDate9.isSupported(dateTimeFieldType23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime27 = localTime4.withField(dateTimeFieldType23, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for halfdayOfDay must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 32400000 + "'", int5 == 32400000);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 20 + "'", int7 == 20);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1 + "'", int19 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 100L + "'", long22 == 100L);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate7 = localDate3.minusWeeks(100);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.eras();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate7.withFieldAdded(durationFieldType8, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'eras' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(durationFieldType8);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate.Property property4 = localDate3.monthOfYear();
        int int5 = property4.getMaximumValue();
        boolean boolean6 = property4.isLeap();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = property4.setCopy(32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property2 = localDateTime0.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withHourOfDay((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.util.Date date0 = new java.util.Date();
        date0.setDate(32769);
        boolean boolean4 = date0.equals((java.lang.Object) 'x');
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Wed Oct 21 15:01:54 UTC 2111");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.era();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        boolean boolean12 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.plusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTime(chronology15);
        boolean boolean17 = mutableDateTime16.isBeforeNow();
        int int18 = property5.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeField dateTimeField19 = property5.getField();
        java.util.Locale.Category category21 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale24 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet25 = locale24.getUnicodeLocaleKeys();
        java.lang.String str26 = locale24.getVariant();
        java.lang.String str27 = locale24.getISO3Language();
        java.util.Locale.setDefault(category21, locale24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime29 = property5.setCopy("4", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"4\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertTrue("'" + category21 + "' != '" + java.util.Locale.Category.FORMAT + "'", category21.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale24.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.Chronology chronology5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((-1), 32580010, (int) '4', 1, (int) (short) 0, chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32580010 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(360000000, (int) '#', 7, (int) (short) -1, 422, 22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType5.getField(chronology7);
        org.joda.time.ReadablePartial readablePartial9 = null;
        int[] intArray14 = new int[] { 32769, 'x', (byte) 1, 10 };
        int int15 = dateTimeField8.getMinimumValue(readablePartial9, intArray14);
        long long17 = dateTimeField8.remainder(63686358113845L);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[32769, 120, 1, 10]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + long17 + "' != '" + 0L + "'", long17 == 0L);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        long long3 = file2.length();
        boolean boolean5 = file2.setReadable(false);
        file2.deleteOnExit();
        boolean boolean7 = file2.setReadOnly();
        java.lang.String str8 = file2.toString();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 45056L + "'", long3 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "hi!" + "'", str8, "hi!");
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis((int) 'a');
        org.joda.time.LocalTime localTime6 = localTime2.withMillisOfSecond(3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter7 = null;
        java.lang.String str8 = localTime6.toString(dateTimeFormatter7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = localTime6.withHourOfDay((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "09:03:00.003" + "'", str8, "09:03:00.003");
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate3 = property1.setCopy("100");
        org.joda.time.LocalDate localDate5 = localDate3.withWeekyear(8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate3.withWeekOfWeekyear((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        long long3 = file2.length();
        java.lang.String str4 = file2.getCanonicalPath();
        boolean boolean5 = file2.canExecute();
        long long6 = file2.getUsableSpace();
        java.io.File file7 = null;
        java.io.File file9 = new java.io.File(file7, "hi!");
        long long10 = file9.length();
        boolean boolean12 = file9.setReadable(false);
        boolean boolean13 = file9.canWrite();
        int int14 = file2.compareTo(file9);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 45056L + "'", long3 == 45056L);
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "/experiment/hi!" + "'", str4, "/experiment/hi!");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 280491302912L + "'", long6 == 280491302912L);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 45056L + "'", long10 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate7 = localDate3.minusWeeks(100);
        org.joda.time.LocalDate.Property property8 = localDate3.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property8.setCopy("0422-02-21");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0422-02-21\" for yearOfCentury is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime8 = dateTime5.minusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        boolean boolean11 = dateTimeZone9.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone9);
        org.joda.time.DateTime dateTime13 = dateTime5.toDateTime(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime13.withWeekOfWeekyear((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet2 = locale1.getUnicodeLocaleKeys();
        strSet2.clear();
        java.util.Spliterator<java.lang.String> strSpliterator4 = strSet2.spliterator();
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.Locale.LanguageRange[] languageRangeArray10 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList11 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean12 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList11, languageRangeArray10);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap13 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList14 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList11, strMap13);
        java.util.Locale locale17 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleKeys();
        java.util.Locale locale21 = new java.util.Locale("", "hi!");
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.util.Locale locale24 = new java.util.Locale("");
        java.util.Locale locale27 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        java.lang.String str29 = locale27.getVariant();
        java.lang.String str30 = locale27.getISO3Language();
        java.util.Locale locale31 = java.util.Locale.TAIWAN;
        java.util.Locale locale32 = java.util.Locale.FRENCH;
        java.util.Locale locale35 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleKeys();
        java.lang.String str37 = locale35.getVariant();
        java.util.Locale locale40 = new java.util.Locale("", "hi!");
        java.util.Locale locale43 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet44 = locale43.getUnicodeLocaleKeys();
        java.lang.String str45 = locale43.getVariant();
        java.lang.String str46 = locale40.getDisplayScript(locale43);
        java.util.Locale[] localeArray47 = new java.util.Locale[] { locale17, locale21, locale22, locale24, locale27, locale31, locale32, locale35, locale43 };
        java.util.ArrayList<java.util.Locale> localeList48 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList48, localeArray47);
        java.util.List<java.util.Locale> localeList50 = java.util.Locale.filter(languageRangeList14, (java.util.Collection<java.util.Locale>) localeList48);
        java.util.List<java.util.Locale> localeList51 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, (java.util.Collection<java.util.Locale>) localeList50);
        java.util.Collection<java.util.Locale> localeCollection52 = null;
        java.util.Locale.FilteringMode filteringMode53 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        java.util.List<java.util.Locale> localeList54 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, localeCollection52, filteringMode53);
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags(languageRangeList0, (java.util.Collection<java.lang.String>) strSet2, filteringMode53);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(strSpliterator4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertNotNull(languageRangeArray10);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(languageRangeList14);
        org.junit.Assert.assertEquals(locale17.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertEquals(locale21.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale24.toString(), "");
        org.junit.Assert.assertEquals(locale27.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "fr");
        org.junit.Assert.assertEquals(locale35.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals(locale40.toString(), "_HI!");
        org.junit.Assert.assertEquals(locale43.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "" + "'", str45, "");
        org.junit.Assert.assertEquals("'" + str46 + "' != '" + "" + "'", str46, "");
        org.junit.Assert.assertNotNull(localeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + true + "'", boolean49 == true);
        org.junit.Assert.assertNotNull(localeList50);
        org.junit.Assert.assertNotNull(localeList51);
        org.junit.Assert.assertTrue("'" + filteringMode53 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode53.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
        org.junit.Assert.assertNotNull(localeList54);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime6 = property5.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property5.setCopy("0422-02-21");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0422-02-21\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = calendar1.getGreatestMinimum(24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455716081,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=56,MILLISECOND=81,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withWeekOfWeekyear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(16, 0, 0, 3, 1970);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setRegion("100");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setLanguage("0422-02-21");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 0422-02-21 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.roll(9, true);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = calendar4.getLeastMaximum((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(32400000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.100Z");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(100L, chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.withZoneRetainFields(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 'a');
        org.joda.time.DateTime dateTime12 = dateTime6.plusWeeks(11);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((long) 8);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property18 = localTime17.hourOfDay();
        org.joda.time.LocalTime localTime20 = localTime17.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTime dateTime22 = dateTime14.toDateTime(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfDay();
        long long27 = chronology21.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DateTime dateTime28 = dateTime1.withChronology(chronology21);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray31 = chronology21.get(readablePeriod29, (long) 12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32771L + "'", long27 == 32771L);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        strSet1.clear();
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "/experiment/hi!", "hi!" };
        java.util.LinkedHashSet<java.lang.String> strSet7 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet7, strArray6);
        java.lang.String[] strArray13 = new java.lang.String[] { "1970-01-01", "", "", "/experiment/hi!" };
        java.util.ArrayList<java.lang.String> strList14 = new java.util.ArrayList<java.lang.String>();
        boolean boolean15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList14, strArray13);
        boolean boolean16 = strSet7.addAll((java.util.Collection<java.lang.String>) strList14);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean17 = strSet1.addAll((java.util.Collection<java.lang.String>) strSet7);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNotNull(strArray13);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (byte) 1, 1, (-1));
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(100L, chronology15);
        boolean boolean17 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime16);
        int int18 = dateTime13.getDayOfYear();
        org.joda.time.DateTime dateTime21 = dateTime13.withDurationAdded((long) (short) 0, 100);
        int int22 = dateTime21.getWeekOfWeekyear();
        boolean boolean23 = calendar4.before((java.lang.Object) dateTime21);
        org.joda.time.DateTime dateTime25 = dateTime21.withWeekyear(11);
        org.joda.time.LocalDate localDate26 = dateTime21.toLocalDate();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = null;
        java.lang.String str28 = dateTime21.toString(dateTimeFormatter27);
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=-1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "1970-01-01T00:00:00.100Z" + "'", str28, "1970-01-01T00:00:00.100Z");
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusWeeks((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withMinuteOfHour((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setRegion("100");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder0.setVariant(":");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: : [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("French (France)", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=french(france)");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.months();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(56, 21, 32770, (int) '/', 32769, (int) (byte) 100, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 47 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime6 = property5.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property5.setCopy(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = localDate1.getField(1);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        int int6 = localDate5.getCenturyOfEra();
        org.joda.time.LocalDate localDate8 = localDate5.withCenturyOfEra(4);
        org.joda.time.LocalDate.Property property9 = localDate8.monthOfYear();
        org.joda.time.LocalDate localDate10 = property9.roundHalfCeilingCopy();
        java.util.Locale.Category category12 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale13 = java.util.Locale.getDefault(category12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = dateTimeField4.getAsText((org.joda.time.ReadablePartial) localDate10, (int) (byte) -1, locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 20 + "'", int6 == 20);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + category12 + "' != '" + java.util.Locale.Category.FORMAT + "'", category12.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate.Property property4 = localDate3.monthOfYear();
        int int5 = property4.getMaximumValue();
        org.joda.time.LocalDate localDate7 = property4.addWrapFieldToCopy((int) (short) 100);
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) '#', dateTimeZone11);
        int int14 = dateTimeZone11.getOffset((long) (short) 10);
        java.util.Locale locale18 = new java.util.Locale("", "hi!");
        java.util.Locale locale21 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet22 = locale21.getUnicodeLocaleKeys();
        java.lang.String str23 = locale21.getVariant();
        java.lang.String str24 = locale18.getDisplayScript(locale21);
        java.lang.String str25 = dateTimeZone11.getShortName((long) 20, locale21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate26 = property4.setCopy("FRA", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"FRA\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 12 + "'", int5 == 12);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 360000000 + "'", int14 == 360000000);
        org.junit.Assert.assertEquals(locale18.toString(), "_HI!");
        org.junit.Assert.assertEquals(locale21.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "+100:00" + "'", str25, "+100:00");
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap4 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList5 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, strMap4);
        java.util.Locale.LanguageRange[] languageRangeArray6 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList7 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList7, languageRangeArray6);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap9 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList10 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList7, strMap9);
        java.util.Locale locale13 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        java.util.Locale locale17 = new java.util.Locale("", "hi!");
        java.util.Locale locale18 = java.util.Locale.FRANCE;
        java.util.Locale locale20 = new java.util.Locale("");
        java.util.Locale locale23 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet24 = locale23.getUnicodeLocaleKeys();
        java.lang.String str25 = locale23.getVariant();
        java.lang.String str26 = locale23.getISO3Language();
        java.util.Locale locale27 = java.util.Locale.TAIWAN;
        java.util.Locale locale28 = java.util.Locale.FRENCH;
        java.util.Locale locale31 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet32 = locale31.getUnicodeLocaleKeys();
        java.lang.String str33 = locale31.getVariant();
        java.util.Locale locale36 = new java.util.Locale("", "hi!");
        java.util.Locale locale39 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet40 = locale39.getUnicodeLocaleKeys();
        java.lang.String str41 = locale39.getVariant();
        java.lang.String str42 = locale36.getDisplayScript(locale39);
        java.util.Locale[] localeArray43 = new java.util.Locale[] { locale13, locale17, locale18, locale20, locale23, locale27, locale28, locale31, locale39 };
        java.util.ArrayList<java.util.Locale> localeList44 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean45 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList44, localeArray43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter(languageRangeList10, (java.util.Collection<java.util.Locale>) localeList44);
        java.util.List<java.util.Locale> localeList47 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.util.Locale>) localeList46);
        java.util.Locale.FilteringMode filteringMode48 = java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale> localeList49 = java.util.Locale.filter(languageRangeList0, (java.util.Collection<java.util.Locale>) localeList46, filteringMode48);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(languageRangeList5);
        org.junit.Assert.assertNotNull(languageRangeArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(languageRangeList10);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals(locale17.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale20.toString(), "");
        org.junit.Assert.assertEquals(locale23.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet24);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "fr");
        org.junit.Assert.assertEquals(locale31.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet32);
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "" + "'", str33, "");
        org.junit.Assert.assertEquals(locale36.toString(), "_HI!");
        org.junit.Assert.assertEquals(locale39.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertEquals("'" + str42 + "' != '" + "" + "'", str42, "");
        org.junit.Assert.assertNotNull(localeArray43);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(localeList47);
        org.junit.Assert.assertTrue("'" + filteringMode48 + "' != '" + java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES + "'", filteringMode48.equals(java.util.Locale.FilteringMode.IGNORE_EXTENDED_RANGES));
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTime(dateTimeZone4);
        java.util.Locale locale8 = new java.util.Locale("", "hi!");
        java.util.Locale locale11 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = locale8.getDisplayScript(locale11);
        java.util.Calendar calendar15 = dateTime5.toCalendar(locale8);
        java.lang.String str16 = calendar15.toString();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertEquals(locale11.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str16, "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        java.util.Date date3 = localDateTime0.toDate();
        java.lang.String str4 = date3.toGMTString();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100L, chronology6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, chronology9);
        boolean boolean11 = dateTime7.isAfter((org.joda.time.ReadableInstant) dateTime10);
        int int12 = dateTime7.getDayOfYear();
        org.joda.time.DateTime dateTime14 = dateTime7.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property15 = dateTime7.year();
        org.joda.time.DateTime dateTime16 = property15.withMaximumValue();
        org.joda.time.DateTime dateTime18 = property15.addToCopy(3);
        org.joda.time.DateTime dateTime20 = dateTime18.withYear(12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime22 = dateTime18.withZoneRetainFields(dateTimeZone21);
        boolean boolean23 = date3.equals((java.lang.Object) dateTime18);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Feb 21 15:01:57 UTC 2022");
// flaky:         org.junit.Assert.assertEquals("'" + str4 + "' != '" + "21 Feb 2022 15:01:57 GMT" + "'", str4, "21 Feb 2022 15:01:57 GMT");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology5 = dateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeField6.set(0L, 197);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 197 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (byte) 1, 1, (-1));
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, chronology12);
        java.util.Locale locale14 = null;
        java.util.Calendar calendar15 = dateTime13.toCalendar(locale14);
        calendar15.setTimeInMillis((long) 'a');
        calendar15.add(11, (int) '4');
        int int21 = calendar4.compareTo(calendar15);
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=-1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=187200097,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=3,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=0,SECOND=0,MILLISECOND=97,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + (-1) + "'", int21 == (-1));
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(3);
        int int5 = localDate2.getEra();
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMillisOfDay(10);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusYears((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDate2.compareTo((org.joda.time.ReadablePartial) localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.era();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        boolean boolean12 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.plusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTime(chronology15);
        boolean boolean17 = mutableDateTime16.isBeforeNow();
        int int18 = property5.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeField dateTimeField19 = property5.getField();
        java.util.Locale locale24 = new java.util.Locale("", "hi!");
        java.util.Locale locale27 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        java.lang.String str29 = locale27.getVariant();
        java.lang.String str30 = locale24.getDisplayScript(locale27);
        // The following exception was thrown during execution in test generation
        try {
            long long31 = dateTimeField19.set((long) 2022, "\u53f0\u6e7e\u5730\u533a", locale27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"????\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertEquals(locale24.toString(), "_HI!");
        org.junit.Assert.assertEquals(locale27.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet28);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("Mon Feb 21 15:01:51 UTC 2022", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 3, dateTimeZone1);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.millisOfSecond();
        java.util.Locale locale7 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet8 = locale7.getUnicodeLocaleKeys();
        java.lang.String str9 = locale7.getVariant();
        java.lang.String str10 = locale7.getDisplayScript();
        java.util.Locale locale11 = locale7.stripExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = localDateTime2.toString("21 Feb 2022 15:01:57 GMT", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: F");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals(locale7.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "_HI!");
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks(2);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = localDate3.getValue(122);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 122");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) (short) 10, 7, 8, (int) ' ', 11, (int) (short) 1, 122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("100");
        java.util.Locale locale2 = java.util.Locale.PRC;
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1, locale2);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("100");
        boolean boolean6 = timeZone1.hasSameRules(timeZone5);
        int int7 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455718319,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=58,MILLISECOND=319,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(32580010, 100, 122, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32580010 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(100L, chronology8);
        org.joda.time.DateTime dateTime11 = dateTime9.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTime.Property property12 = dateTime9.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(100L, chronology17);
        boolean boolean19 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime15.getDayOfYear();
        org.joda.time.DateTime dateTime23 = dateTime15.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime25 = dateTime15.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int27 = dateTime25.get(dateTimeFieldType26);
        boolean boolean28 = dateTime9.isSupported(dateTimeFieldType26);
        org.joda.time.LocalTime localTime30 = localTime2.withField(dateTimeFieldType26, 11);
        org.joda.time.LocalTime localTime32 = localTime30.plusMillis(7);
        org.joda.time.LocalDate localDate33 = org.joda.time.LocalDate.now();
        int int34 = localDate33.getCenturyOfEra();
        org.joda.time.LocalDate localDate36 = localDate33.plusDays((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int37 = localTime30.compareTo((org.joda.time.ReadablePartial) localDate33);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 20 + "'", int34 == 20);
        org.junit.Assert.assertNotNull(localDate36);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        boolean boolean9 = dateTimeZone7.isFixed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(11, 100, (int) '4', (int) (byte) 0, (int) '/', 11, (int) (byte) 0, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        java.util.Date date5 = new java.util.Date(5, (int) (short) -1, (int) (short) 100, 12, (int) (byte) -1);
        java.util.Date date6 = new java.util.Date();
        int int7 = date6.getMonth();
        java.util.Date date8 = new java.util.Date();
        date8.setDate(32769);
        boolean boolean11 = date6.after(date8);
        boolean boolean12 = date5.before(date8);
        java.util.Date date13 = new java.util.Date();
        int int14 = date13.getMonth();
        java.util.Date date15 = new java.util.Date();
        date15.setDate(32769);
        boolean boolean18 = date13.after(date15);
        date13.setTime((long) (byte) 0);
        int int21 = date8.compareTo(date13);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 11:59:00 UTC 1905");
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Mon Feb 21 15:01:58 UTC 2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Oct 21 15:01:58 UTC 2111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertEquals(date13.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
// flaky:         org.junit.Assert.assertEquals(date15.toString(), "Wed Oct 21 15:01:58 UTC 2111");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("100");
        java.util.Locale locale2 = java.util.Locale.PRC;
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1, locale2);
        java.lang.Object obj4 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455718845,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=58,MILLISECOND=845,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertEquals(obj4.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
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
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (short) 100, 3, (int) (byte) 10, (int) '#', 9);
        int int13 = calendar4.getMinimalDaysInFirstWeek();
        boolean boolean15 = calendar4.isSet(3);
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=35,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        int int5 = localTime4.getHourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField8 = localTime4.getField(0);
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.minusYears(3);
        org.joda.time.LocalDateTime localDateTime15 = localDateTime11.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean17 = localDateTime15.isSupported(dateTimeFieldType16);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType16.getField(chronology18);
        org.joda.time.ReadablePartial readablePartial20 = null;
        int[] intArray25 = new int[] { 32769, 'x', (byte) 1, 10 };
        int int26 = dateTimeField19.getMinimumValue(readablePartial20, intArray25);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = dateTimeField8.addWrapPartial((org.joda.time.ReadablePartial) localDateTime9, 70, intArray25, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 70");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(intArray25);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray25), "[32769, 120, 1, 10]");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setRegion("hourOfHalfday");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: hourOfHalfday [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        int int5 = localTime4.getHourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.roundCeilingCopy();
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property6.setCopy("FRA", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"FRA\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(0, (int) 'x', 2022, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.Locale locale2 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = locale2.getDisplayScript();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(locale2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = locale2.getUnicodeLocaleType("Mon Feb 21 15:01:51 UTC 2022");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: Mon Feb 21 15:01:51 UTC 2022");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455719285,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=59,MILLISECOND=285,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(11);
        org.joda.time.DateTime dateTime12 = dateTime10.withMillis((long) 8);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property16 = localTime15.hourOfDay();
        org.joda.time.LocalTime localTime18 = localTime15.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTime dateTime20 = dateTime12.toDateTime(chronology19);
        org.joda.time.DurationField durationField21 = chronology19.halfdays();
        org.joda.time.ReadablePeriod readablePeriod22 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = chronology19.get(readablePeriod22, (long) (short) 100, 63686358113273L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(durationField21);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.100Z");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime10.plus((long) 'a');
        org.joda.time.DateTime dateTime16 = dateTime10.plusWeeks(11);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillis((long) 8);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property22 = localTime21.hourOfDay();
        org.joda.time.LocalTime localTime24 = localTime21.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime18.toDateTime(chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.clockhourOfDay();
        long long31 = chronology25.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DateTime dateTime32 = dateTime5.withChronology(chronology25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(422, (int) 'x', (int) (byte) 1, 3, chronology25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 422 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertTrue("'" + long31 + "' != '" + 32771L + "'", long31 == 32771L);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getMonth();
        java.util.Date date2 = new java.util.Date();
        date2.setDate(32769);
        boolean boolean5 = date0.after(date2);
        java.lang.String str6 = date2.toGMTString();
        java.lang.Object obj7 = date2.clone();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 15:01:59 UTC 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Oct 21 15:01:59 UTC 2111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "21 Oct 2111 15:01:59 GMT" + "'", str6, "21 Oct 2111 15:01:59 GMT");
        org.junit.Assert.assertNotNull(obj7);
// flaky:         org.junit.Assert.assertEquals(obj7.toString(), "Wed Oct 21 15:01:59 UTC 2111");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj7), "Wed Oct 21 15:01:59 UTC 2111");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj7), "Wed Oct 21 15:01:59 UTC 2111");
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
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.era();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        boolean boolean12 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.plusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTime(chronology15);
        boolean boolean17 = mutableDateTime16.isBeforeNow();
        int int18 = property5.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.DateTimeField dateTimeField19 = property5.getField();
        org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withMillisOfDay(10);
        int int23 = localDateTime20.getDayOfYear();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime20.plus(readableDuration24);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(100L, chronology28);
        org.joda.time.DateTime dateTime31 = dateTime29.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology32 = dateTime29.getChronology();
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone34);
        org.joda.time.LocalDate localDate37 = localDate35.plusDays(3);
        int int38 = localDate37.getYear();
        org.joda.time.LocalDate localDate40 = localDate37.withWeekOfWeekyear((int) ' ');
        int[] intArray42 = chronology32.get((org.joda.time.ReadablePartial) localDate37, (long) 52);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray44 = dateTimeField19.add((org.joda.time.ReadablePartial) localDateTime25, 27, intArray42, 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 27");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 52 + "'", int23 == 52);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 1970 + "'", int38 == 1970);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(intArray42);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray42), "[1970, 1, 1]");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("100");
        java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone1);
        int int3 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(calendar2);
// flaky:         org.junit.Assert.assertEquals(calendar2.toString(), "java.util.GregorianCalendar[time=1645455719924,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=59,MILLISECOND=924,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime6.withDayOfMonth(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(100L, chronology5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.withZoneRetainFields(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime8.plus((long) 'a');
        org.joda.time.DateTime dateTime13 = dateTime12.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = dateTime13.toDateTime(chronology14);
        org.joda.time.Chronology chronology16 = dateTime13.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(20, 2, 8, 32769, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = calendar4.getGreatestMinimum((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 35");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property2 = localDateTime0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = property2.setCopy("31 Dec 1969 23:59:59 GMT");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"31 Dec 1969 23:59:59 GMT\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) 'a', (int) (short) 0, (int) (byte) 0, (int) 'a', 197);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '#', dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone9);
        int int13 = dateTimeZone9.getOffset((long) 20);
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(63686358113845L, dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(360000000, 8, 52, 100, (-1), 32400000, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 360000000 + "'", int13 == 360000000);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        java.lang.String str3 = file2.getCanonicalPath();
        long long4 = file2.lastModified();
        java.net.URI uRI5 = file2.toURI();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        boolean boolean12 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime8.getDayOfYear();
        org.joda.time.DateTime dateTime16 = dateTime8.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime18 = dateTime16.plusSeconds(1);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(100L, chronology20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime23.plus((long) 'a');
        org.joda.time.DateTime dateTime29 = dateTime23.plusWeeks(11);
        org.joda.time.DateTime dateTime31 = dateTime29.withMillis((long) 8);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property35 = localTime34.hourOfDay();
        org.joda.time.LocalTime localTime37 = localTime34.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime31.toDateTime(chronology38);
        org.joda.time.DateTime dateTime40 = dateTime18.withChronology(chronology38);
        org.joda.time.DateTimeField dateTimeField41 = chronology38.weekyear();
        org.joda.time.DateTimeField dateTimeField42 = chronology38.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField43 = chronology38.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime44 = new org.joda.time.LocalTime((java.lang.Object) file2, chronology38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.io.File");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/experiment/hi!" + "'", str3, "/experiment/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1645454200000L + "'", long4 == 1645454200000L);
        org.junit.Assert.assertNotNull(uRI5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(dateTimeField43);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        int int5 = localDate4.getCenturyOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.withFields((org.joda.time.ReadablePartial) localDate4);
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate.Property property8 = localDate6.weekyear();
        int int9 = property8.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 292278993 + "'", int9 == 292278993);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.setLenient(false);
        calendar4.set(10, 8, 5, 20, 100);
        boolean boolean17 = calendar4.isLenient();
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10,MONTH=8,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=20,MINUTE=100,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file1 = null;
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.length();
        boolean boolean6 = file3.setReadable(false);
        java.io.File file7 = null;
        java.io.File file9 = new java.io.File(file7, "hi!");
        long long10 = file9.length();
        boolean boolean11 = file9.mkdirs();
        java.io.File file14 = new java.io.File("UTC", "");
        boolean boolean17 = file14.setExecutable(false, true);
        java.io.File file18 = null;
        java.io.File file20 = new java.io.File(file18, "hi!");
        long long21 = file20.length();
        boolean boolean22 = file20.exists();
        long long23 = file20.length();
        boolean boolean24 = file20.canRead();
        boolean boolean27 = file20.setReadable(false, false);
        java.io.File file28 = null;
        java.io.File file30 = new java.io.File(file28, "hi!");
        long long31 = file30.length();
        boolean boolean32 = file30.mkdirs();
        boolean boolean33 = file30.exists();
        boolean boolean34 = file30.exists();
        java.io.File file35 = null;
        java.io.File file37 = new java.io.File(file35, "hi!");
        java.lang.String str38 = file37.getCanonicalPath();
        long long39 = file37.lastModified();
        java.net.URI uRI40 = file37.toURI();
        java.io.File[] fileArray41 = new java.io.File[] { file9, file14, file20, file30, file37 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap42 = zoneInfoCompiler0.compile(file3, fileArray41);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message: hi! (Is a directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 45056L + "'", long4 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNull("file9.getParent() == null", file9.getParent());
        org.junit.Assert.assertEquals(file9.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long10 + "' != '" + 45056L + "'", long10 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "UTC");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNull("file20.getParent() == null", file20.getParent());
        org.junit.Assert.assertEquals(file20.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 45056L + "'", long21 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long23 + "' != '" + 45056L + "'", long23 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNull("file30.getParent() == null", file30.getParent());
        org.junit.Assert.assertEquals(file30.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long31 + "' != '" + 45056L + "'", long31 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + true + "'", boolean33 == true);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNull("file37.getParent() == null", file37.getParent());
        org.junit.Assert.assertEquals(file37.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str38 + "' != '" + "/experiment/hi!" + "'", str38, "/experiment/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long39 + "' != '" + 1645454200000L + "'", long39 == 1645454200000L);
        org.junit.Assert.assertNotNull(uRI40);
        org.junit.Assert.assertNotNull(fileArray41);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate3 = property1.setCopy("100");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate3.withDayOfMonth((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) 20);
        org.joda.time.LocalTime localTime3 = localTime1.plusMinutes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField5 = localTime1.getField(360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 360000000");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfCentury(13);
        org.joda.time.DurationFieldType durationFieldType9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime6.withFieldAdded(durationFieldType9, 360000000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime17.plus((long) 'a');
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(11);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis((long) 8);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime31 = localTime28.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime25.toDateTime(chronology32);
        org.joda.time.DateTime dateTime34 = dateTime12.withChronology(chronology32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(100L, chronology36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(100L, chronology39);
        boolean boolean41 = dateTime37.isAfter((org.joda.time.ReadableInstant) dateTime40);
        int int42 = dateTime37.getDayOfYear();
        org.joda.time.DateTime dateTime45 = dateTime37.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime47 = dateTime37.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property51 = localTime50.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime54 = localTime50.toDateTimeToday(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        int int57 = dateTimeZone53.getOffset((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime47.toMutableDateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime59 = dateTime34.toDateTime(dateTimeZone53);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateTime dateTime62 = new org.joda.time.DateTime(100L, chronology61);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(100L, chronology64);
        boolean boolean66 = dateTime62.isAfter((org.joda.time.ReadableInstant) dateTime65);
        int int67 = dateTime62.getDayOfYear();
        org.joda.time.DateTime dateTime69 = dateTime62.plusYears((int) (short) 0);
        long long70 = dateTime62.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType71 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int72 = dateTime62.get(dateTimeFieldType71);
        int int73 = dateTime34.get(dateTimeFieldType71);
        java.util.Locale locale75 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet76 = locale75.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str77 = dateTime34.toString("millis", locale75);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 100L + "'", long70 == 100L);
        org.junit.Assert.assertNotNull(dateTimeFieldType71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 0 + "'", int72 == 0);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
        org.junit.Assert.assertNotNull(locale75);
        org.junit.Assert.assertEquals(locale75.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet76);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int14 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.DateTime dateTime19 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.100Z");
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(100L, chronology21);
        org.joda.time.DateTime dateTime24 = dateTime22.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.DateTime dateTime26 = dateTime24.withZoneRetainFields(dateTimeZone25);
        org.joda.time.DateTime dateTime28 = dateTime24.plus((long) 'a');
        org.joda.time.DateTime dateTime30 = dateTime24.plusWeeks(11);
        org.joda.time.DateTime dateTime32 = dateTime30.withMillis((long) 8);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property36 = localTime35.hourOfDay();
        org.joda.time.LocalTime localTime38 = localTime35.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology39 = localTime38.getChronology();
        org.joda.time.DateTime dateTime40 = dateTime32.toDateTime(chronology39);
        org.joda.time.DateTimeField dateTimeField41 = chronology39.clockhourOfDay();
        long long45 = chronology39.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DateTime dateTime46 = dateTime19.withChronology(chronology39);
        org.joda.time.DateTimeField dateTimeField47 = chronology39.year();
        org.joda.time.DateTimeField dateTimeField48 = chronology39.weekOfWeekyear();
        org.joda.time.DurationField durationField49 = chronology39.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime((java.lang.Object) property15, chronology39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.DateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(chronology39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 32771L + "'", long45 == 32771L);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField49);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property9 = localTime8.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime12 = localTime8.toDateTimeToday(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone13);
        int int15 = dateTimeZone11.getOffset((org.joda.time.ReadableInstant) dateTime14);
        boolean boolean17 = dateTimeZone11.isStandardOffset(0L);
        java.util.TimeZone timeZone18 = dateTimeZone11.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(32580010, (int) 'a', 13, (int) (byte) 10, (int) 'a', (int) '/', dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(timeZone18);
        org.junit.Assert.assertEquals(timeZone18.getDisplayName(), "Coordinated Universal Time");
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (short) 100, 3, (int) (byte) 10, (int) '#', 9);
        int int13 = calendar4.getMinimalDaysInFirstWeek();
        int int14 = calendar4.getMinimalDaysInFirstWeek();
        java.lang.String str15 = calendar4.toString();
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=35,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=35,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str15, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=35,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(22, 24, 22, 2, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks(2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        boolean boolean12 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime8.getDayOfYear();
        org.joda.time.DateTime dateTime15 = dateTime8.plusYears((int) (short) 0);
        long long16 = dateTime8.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int18 = dateTime8.get(dateTimeFieldType17);
        boolean boolean19 = localDate3.isSupported(dateTimeFieldType17);
        java.util.Date date20 = localDate3.toDate();
        int int22 = localDate3.getValue(0);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Tue Feb 21 00:00:00 UTC 422");
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 422 + "'", int22 == 422);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder2 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setScript("hourOfHalfday");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: hourOfHalfday [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime10.withYearOfCentury(1645455721);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1645455721 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        int int5 = localTime4.getHourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.roundCeilingCopy();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDate localDate10 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate10.plusDays(3);
        int int13 = localDate10.getMonthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = property6.compareTo((org.joda.time.ReadablePartial) localDate10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("100");
        java.lang.String str4 = timeZone1.getDisplayName(true, 1);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Greenwich Mean Time" + "'", str4, "Greenwich Mean Time");
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (byte) 1, 1, (-1));
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(100L, chronology15);
        boolean boolean17 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime16);
        int int18 = dateTime13.getDayOfYear();
        org.joda.time.DateTime dateTime21 = dateTime13.withDurationAdded((long) (short) 0, 100);
        int int22 = dateTime21.getWeekOfWeekyear();
        boolean boolean23 = calendar4.before((java.lang.Object) dateTime21);
        org.joda.time.DateTime dateTime25 = dateTime21.withWeekyear(11);
        org.joda.time.LocalDate localDate26 = dateTime21.toLocalDate();
        int int27 = localDate26.getYearOfEra();
        org.joda.time.DurationFieldType durationFieldType28 = org.joda.time.DurationFieldType.halfdays();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate30 = localDate26.withFieldAdded(durationFieldType28, 24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdays' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=-1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 1970 + "'", int27 == 1970);
        org.junit.Assert.assertNotNull(durationFieldType28);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(0, (int) 'u', 8, (int) ' ', 360000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime localTime4 = localTime2.minusMillis((int) 'a');
        org.joda.time.LocalTime localTime6 = localTime4.withMillisOfDay(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime6.withMillisOfDay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime6);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("FRA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.util.Locale locale2 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        boolean boolean4 = strSet3.isEmpty();
        org.junit.Assert.assertEquals(locale2.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("millis");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date(":");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
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
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int14 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = property15.getFieldType();
        org.joda.time.DateTime dateTime18 = property15.roundFloorCopy();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (byte) 1, 1, (-1));
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(100L, chronology15);
        boolean boolean17 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime16);
        int int18 = dateTime13.getDayOfYear();
        org.joda.time.DateTime dateTime21 = dateTime13.withDurationAdded((long) (short) 0, 100);
        int int22 = dateTime21.getWeekOfWeekyear();
        boolean boolean23 = calendar4.before((java.lang.Object) dateTime21);
        // The following exception was thrown during execution in test generation
        try {
            calendar4.set(53, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 53");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=-1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate7 = localDate3.minusWeeks(100);
        int int8 = localDate3.size();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate3.get(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 3 + "'", int8 == 3);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.setTimeInMillis((long) 'a');
        calendar4.add(11, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            calendar4.set((int) '4', 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 52");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=187200097,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=3,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=0,SECOND=0,MILLISECOND=97,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        java.lang.String str4 = localDate3.toString();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDate3.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0422-02-21" + "'", str4, "0422-02-21");
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime(52, 422, 54122803, (int) (byte) -1, (int) (short) 100, 52, 54122803, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setRegion("100");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setUnicodeLocaleKeyword("1970-01-01T00:00:00.100Z", "France");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 1970-01-01T00:00:00.100Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone5);
        org.joda.time.DateTime dateTime7 = localTime4.toDateTime((org.joda.time.ReadableInstant) dateTime6);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, chronology9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime12.plus((long) 'a');
        org.joda.time.DateTime dateTime17 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime(chronology18);
        org.joda.time.Chronology chronology20 = dateTime17.getChronology();
        org.joda.time.DurationField durationField21 = chronology20.minutes();
        org.joda.time.MutableDateTime mutableDateTime22 = dateTime7.toMutableDateTime(chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate23 = new org.joda.time.LocalDate(54122803, 197, 3, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 197 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(durationField21);
        org.junit.Assert.assertNotNull(mutableDateTime22);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) '#', dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((java.lang.Object) locale0, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_US");
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType5.getField(chronology7);
        long long10 = dateTimeField8.roundHalfEven(1645454200000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime11 = new org.joda.time.LocalTime((java.lang.Object) dateTimeField8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1645454200000L + "'", long10 == 1645454200000L);
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("100");
        int int2 = timeZone1.getRawOffset();
        java.time.ZoneId zoneId3 = timeZone1.toZoneId();
        java.util.TimeZone.setDefault(timeZone1);
        int int5 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(3);
        int int5 = localDate4.getYear();
        org.joda.time.LocalDate localDate7 = localDate4.withWeekOfWeekyear((int) ' ');
        org.joda.time.Interval interval8 = localDate4.toInterval();
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(interval8);
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        java.lang.String str4 = localDate3.toString();
        int int5 = localDate3.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "0422-02-21" + "'", str4, "0422-02-21");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 8 + "'", int5 == 8);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setRegion("0422-02-21");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 0422-02-21 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar14 = dateTime2.toCalendar(locale13);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = calendar14.getLeastMaximum(56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 56");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar14);
        org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        int int5 = localDate4.getCenturyOfEra();
        org.joda.time.LocalDate localDate6 = localDate0.withFields((org.joda.time.ReadablePartial) localDate4);
        int int7 = localDate6.getDayOfWeek();
        org.joda.time.LocalDate.Property property8 = localDate6.weekyear();
        org.joda.time.ReadablePartial readablePartial9 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate6.compareTo(readablePartial9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime2.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime2.year();
        org.joda.time.DateTime dateTime11 = property10.withMaximumValue();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(100L, chronology13);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean18 = dateTime16.isSupported(dateTimeFieldType17);
        org.joda.time.DateTime dateTime20 = dateTime16.minus(10L);
        int int21 = property10.compareTo((org.joda.time.ReadableInstant) dateTime20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = property10.setCopy("1970-01-01T00:00:00.100Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T00:00:00.100Z\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime5 = localTime2.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfHalfday();
        boolean boolean8 = dateTimeField7.isLenient();
        int int10 = dateTimeField7.getMinimumValue((long) 7);
        java.util.Date date11 = new java.util.Date();
        int int12 = date11.getMonth();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(100L, chronology17);
        boolean boolean19 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime15.getDayOfYear();
        org.joda.time.DateTime dateTime22 = dateTime15.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property23 = dateTime15.year();
        org.joda.time.DateTime dateTime24 = property23.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime26 = dateTime24.minusSeconds((int) (byte) 1);
        java.util.Date date27 = dateTime26.toDate();
        boolean boolean28 = date11.before(date27);
        org.joda.time.LocalDate localDate29 = org.joda.time.LocalDate.fromDateFields(date27);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType30.getRangeDurationType();
        boolean boolean32 = localDate29.isSupported(durationFieldType31);
        org.joda.time.LocalDate localDate34 = new org.joda.time.LocalDate();
        int[] intArray35 = localDate34.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray37 = dateTimeField7.add((org.joda.time.ReadablePartial) localDate29, 32769, intArray35, 3);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32769");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
// flaky:         org.junit.Assert.assertEquals(date11.toString(), "Mon Feb 21 15:02:03 GMT 2022");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(date27);
        org.junit.Assert.assertEquals(date27.toString(), "Wed Dec 31 23:59:59 GMT 1969");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(intArray35);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray35), "[2022, 2, 21]");
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.roll(9, true);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = calendar4.getActualMinimum((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate7 = localDate3.minusWeeks(100);
        org.joda.time.LocalDate.Property property8 = localDate3.dayOfMonth();
        org.joda.time.LocalDate localDate9 = property8.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = property8.setCopy("1970-01-01T00:00:00.100Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T00:00:00.100Z\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime2.plusYears((int) (short) 0);
        org.joda.time.DateTime dateTime11 = dateTime9.withCenturyOfEra(1970);
        org.joda.time.DateTime dateTime13 = dateTime9.plusMillis((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime13.withHourOfDay(197);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 197 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withYearOfCentury(13);
        java.util.Locale.Category category10 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = java.util.Locale.getDefault(category10);
        java.lang.String str12 = locale11.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localDateTime8.toString("gregory", locale11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: g");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + category10 + "' != '" + java.util.Locale.Category.FORMAT + "'", category10.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "_HI!");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "HI!" + "'", str12, "HI!");
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property3.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime7 = property3.withMaximumValue();
        java.lang.String str8 = property3.getAsString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = property3.setCopy("Chinese (Taiwan)");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Chinese (Taiwan)\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "9" + "'", str8, "9");
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.io.Reader reader0 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.io.BufferedReader bufferedReader2 = new java.io.BufferedReader(reader0, 1970);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        java.util.GregorianCalendar gregorianCalendar9 = dateTime8.toGregorianCalendar();
        java.lang.Class<?> wildcardClass10 = gregorianCalendar9.getClass();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
        org.junit.Assert.assertNotNull(wildcardClass10);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setRegion("1970-01-01");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 1970-01-01 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.era();
        java.util.Locale locale7 = java.util.Locale.ROOT;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property5.setCopy("", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("+100:00", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=+100:00");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((int) '/', 1645455723, 100, (int) 'x', 3, 21, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "/", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Locale locale9 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleKeys();
        boolean boolean11 = strSet5.retainAll((java.util.Collection<java.lang.String>) strSet10);
        java.util.stream.Stream<java.lang.String> strStream12 = strSet10.stream();
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        boolean boolean15 = strSet10.removeAll((java.util.Collection<java.lang.String>) strSet14);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "/", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        java.util.Locale locale25 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleKeys();
        boolean boolean27 = strSet21.retainAll((java.util.Collection<java.lang.String>) strSet26);
        java.util.stream.Stream<java.lang.String> strStream28 = strSet26.stream();
        java.util.Locale locale29 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleKeys();
        boolean boolean31 = strSet26.removeAll((java.util.Collection<java.lang.String>) strSet30);
        boolean boolean32 = strSet14.addAll((java.util.Collection<java.lang.String>) strSet26);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean34 = strSet26.add("21 Oct 2111 15:01:59 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals(locale9.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals(locale25.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strStream28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("100");
        int int2 = timeZone1.getRawOffset();
        java.time.ZoneId zoneId3 = timeZone1.toZoneId();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(100L, chronology5);
        org.joda.time.DateTime dateTime8 = dateTime6.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTime.Property property9 = dateTime6.minuteOfDay();
        java.util.Locale locale12 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        int int14 = property9.getMaximumTextLength(locale12);
        java.lang.String str15 = timeZone1.getDisplayName(locale12);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(zoneId3);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals(locale12.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 4 + "'", int14 == 4);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "Greenwich Mean Time" + "'", str15, "Greenwich Mean Time");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(100L, chronology8);
        org.joda.time.DateTime dateTime11 = dateTime9.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTime.Property property12 = dateTime9.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(100L, chronology17);
        boolean boolean19 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime15.getDayOfYear();
        org.joda.time.DateTime dateTime23 = dateTime15.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime25 = dateTime15.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int27 = dateTime25.get(dateTimeFieldType26);
        boolean boolean28 = dateTime9.isSupported(dateTimeFieldType26);
        org.joda.time.LocalTime localTime30 = localTime2.withField(dateTimeFieldType26, 11);
        org.joda.time.LocalTime localTime32 = localTime30.plusMillis(7);
        org.joda.time.LocalTime localTime35 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.DateTimeFieldType dateTimeFieldType37 = localTime35.getFieldType(3);
        org.joda.time.DurationFieldType durationFieldType38 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.LocalTime localTime40 = localTime35.withFieldAdded(durationFieldType38, 8);
        boolean boolean41 = localTime32.isSupported(durationFieldType38);
        org.joda.time.LocalDate localDate42 = org.joda.time.LocalDate.now();
        int int43 = localDate42.getCenturyOfEra();
        org.joda.time.LocalDate localDate45 = localDate42.plusDays((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            int int46 = localTime32.compareTo((org.joda.time.ReadablePartial) localDate42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(dateTimeFieldType37);
        org.junit.Assert.assertNotNull(durationFieldType38);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(localDate42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 20 + "'", int43 == 20);
        org.junit.Assert.assertNotNull(localDate45);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(0L);
        org.joda.time.LocalTime.Property property2 = localTime1.millisOfDay();
        org.joda.time.DateTimeField dateTimeField3 = property2.getField();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property5 = localDate4.weekyear();
        org.joda.time.LocalDate localDate7 = property5.addWrapFieldToCopy((int) '#');
        org.joda.time.LocalDate localDate8 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property11 = localDate10.weekyear();
        org.joda.time.LocalDate localDate13 = property11.setCopy("100");
        int[] intArray14 = localDate13.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = dateTimeField3.addWrapPartial((org.joda.time.ReadablePartial) localDate8, 32769, intArray14, 4);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32769");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[100, 2, 22]");
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate.Property property4 = localDate3.monthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = property4.getFieldType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = property4.setCopy(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withHourOfDay((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks(4);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = property10.addToCopy(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime12.withDate(292278993, 0, 122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
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
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks(2);
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime7 = localDate3.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(dateTimeZone6);
        org.joda.time.DateTime.Property property9 = dateTime8.yearOfCentury();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(100L, chronology11);
        org.joda.time.DateTime dateTime14 = dateTime12.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.DateTime dateTime16 = dateTime14.withZoneRetainFields(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime14.plus((long) 'a');
        org.joda.time.DateTime dateTime19 = dateTime18.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = dateTime19.toDateTime(chronology20);
        org.joda.time.Chronology chronology22 = dateTime19.getChronology();
        org.joda.time.DurationField durationField23 = chronology22.minutes();
        org.joda.time.DateTime dateTime24 = dateTime8.toDateTime(chronology22);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(100L, chronology26);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(100L, chronology29);
        boolean boolean31 = dateTime27.isAfter((org.joda.time.ReadableInstant) dateTime30);
        int int32 = dateTime27.getDayOfYear();
        org.joda.time.DateTime dateTime35 = dateTime27.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime37 = dateTime27.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType38 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int39 = dateTime37.get(dateTimeFieldType38);
        org.joda.time.DateTime.Property property40 = dateTime37.dayOfWeek();
        org.joda.time.DurationField durationField41 = property40.getDurationField();
        long long42 = property40.remainder();
        org.joda.time.DateTime dateTime43 = property40.roundFloorCopy();
        org.joda.time.DateTime dateTime44 = property40.withMaximumValue();
        boolean boolean45 = dateTime24.isAfter((org.joda.time.ReadableInstant) dateTime44);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTimeFieldType38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(durationField41);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 90L + "'", long42 == 90L);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + true + "'", boolean45 == true);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate7 = localDate3.minusWeeks(100);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, chronology12);
        boolean boolean14 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime13);
        int int15 = dateTime10.getDayOfYear();
        org.joda.time.DateTime dateTime17 = dateTime10.plusYears((int) (short) 0);
        long long18 = dateTime10.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int20 = dateTime10.get(dateTimeFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = localDate3.withField(dateTimeFieldType19, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdayOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 100L + "'", long18 == 100L);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillis(364740218880L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime3.withYear(360000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 360000000 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime2.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime2.year();
        org.joda.time.DateTime dateTime11 = property10.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime13 = dateTime11.minusSeconds((int) (byte) 1);
        java.util.Date date14 = dateTime13.toDate();
        java.lang.String str15 = date14.toGMTString();
        java.lang.Object obj16 = date14.clone();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(date14);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Sun Jan 04 09:11:17 GMT 1970");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "31 Dec 1969 23:59:59 GMT" + "'", str15, "31 Dec 1969 23:59:59 GMT");
        org.junit.Assert.assertNotNull(obj16);
// flaky:         org.junit.Assert.assertEquals(obj16.toString(), "Sun Jan 04 09:11:17 GMT 1970");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj16), "Sun Jan 04 09:11:17 GMT 1970");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj16), "Sun Jan 04 09:11:17 GMT 1970");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        long long3 = file2.length();
        boolean boolean5 = file2.setReadable(false);
        long long6 = file2.getTotalSpace();
        java.io.File file7 = file2.getCanonicalFile();
        java.lang.Object obj8 = null;
        boolean boolean9 = file7.equals(obj8);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 45056L + "'", long3 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 364740218880L + "'", long6 == 364740218880L);
        org.junit.Assert.assertNotNull(file7);
// flaky:         org.junit.Assert.assertEquals(file7.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file7.toString(), "/experiment/hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.setLenient(false);
        calendar4.set(10, 8, 5, 20, 100);
        // The following exception was thrown during execution in test generation
        try {
            int int18 = calendar4.getActualMinimum(22);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 22");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=10,MONTH=8,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=20,MINUTE=100,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (short) 100, 3, (int) (byte) 10, (int) '#', 9);
        int int13 = calendar4.getMinimalDaysInFirstWeek();
        java.lang.String str14 = calendar4.toString();
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=35,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=35,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str14, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=35,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(68513845, 20, 32400000, 2, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime17.plus((long) 'a');
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(11);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis((long) 8);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime31 = localTime28.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime25.toDateTime(chronology32);
        org.joda.time.DateTime dateTime34 = dateTime12.withChronology(chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.weekyear();
        org.joda.time.DateTimeField dateTimeField36 = chronology32.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long42 = chronology32.getDateTimeMillis((long) 1970, (int) (short) 100, 32400000, 32580010, 15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertNotNull(dateTimeField36);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (short) 100, 3, (int) (byte) 10, (int) '#', 9);
        int int13 = calendar4.getFirstDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calendar4.get(21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=-59002865459900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=15,WEEK_OF_MONTH=2,DAY_OF_MONTH=11,DAY_OF_YEAR=102,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=11,HOUR_OF_DAY=11,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("");
        java.lang.Object obj2 = timeZone1.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(obj2);
        org.junit.Assert.assertEquals(obj2.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType5.getField(chronology7);
        long long10 = dateTimeField8.roundHalfEven(1645454200000L);
        java.lang.String str11 = dateTimeField8.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((java.lang.Object) dateTimeField8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 1645454200000L + "'", long10 == 1645454200000L);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "millisOfSecond" + "'", str11, "millisOfSecond");
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTime(dateTimeZone4);
        java.util.Locale locale8 = new java.util.Locale("", "hi!");
        java.util.Locale locale11 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = locale8.getDisplayScript(locale11);
        java.util.Calendar calendar15 = dateTime5.toCalendar(locale8);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromCalendarFields(calendar15);
        calendar15.setMinimalDaysInFirstWeek(5);
        java.lang.String str19 = calendar15.getCalendarType();
        calendar15.set(9, 52, 16);
        java.util.Locale locale26 = java.util.Locale.ROOT;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = calendar15.getDisplayName(1645455723, (int) ' ', locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertEquals(locale11.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=5,ERA=1,YEAR=9,MONTH=52,WEEK_OF_YEAR=52,WEEK_OF_MONTH=0,DAY_OF_MONTH=16,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "gregory" + "'", str19, "gregory");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "");
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("Mon Feb 21 15:01:51 UTC 2022", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        boolean boolean3 = file2.createNewFile();
        java.nio.file.Path path4 = file2.toPath();
        java.net.URL uRL5 = file2.toURL();
        java.io.File file6 = null;
        java.io.File file8 = new java.io.File(file6, "hi!");
        long long9 = file8.length();
        boolean boolean11 = file8.setReadable(false);
        file8.deleteOnExit();
        int int13 = file2.compareTo(file8);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(path4);
        org.junit.Assert.assertNotNull(uRL5);
// flaky:         org.junit.Assert.assertEquals(uRL5.toString(), "file:/experiment/hi!/");
        org.junit.Assert.assertNull("file8.getParent() == null", file8.getParent());
        org.junit.Assert.assertEquals(file8.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long9 + "' != '" + 45056L + "'", long9 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("+100:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: +100:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setRegion("100");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder5 = builder3.addUnicodeLocaleAttribute("/");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: / [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime2.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime2.year();
        org.joda.time.DateTime dateTime11 = property10.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime11.withDate(7, 54122803, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54122803 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime2.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime2.year();
        org.joda.time.DateTime dateTime11 = property10.withMaximumValue();
        org.joda.time.DateTime dateTime13 = property10.addToCopy(3);
        org.joda.time.DateTime dateTime15 = dateTime13.withYear(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = dateTime15.withEra(4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 4 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs((-18574));
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.roll(9, true);
        int int12 = calendar4.getFirstDayOfWeek();
        calendar4.setFirstDayOfWeek(16);
        java.lang.Object obj15 = null;
        boolean boolean16 = calendar4.equals(obj15);
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=16,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int14 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(100L, chronology19);
        org.joda.time.DateTime dateTime22 = dateTime20.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.withZoneRetainFields(dateTimeZone23);
        org.joda.time.DateTime dateTime26 = dateTime22.plus((long) 'a');
        org.joda.time.DateTime dateTime28 = dateTime22.plusWeeks(11);
        org.joda.time.DateTime dateTime30 = dateTime28.withMillis((long) 8);
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property34 = localTime33.hourOfDay();
        org.joda.time.LocalTime localTime36 = localTime33.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology37 = localTime36.getChronology();
        org.joda.time.DateTime dateTime38 = dateTime30.toDateTime(chronology37);
        org.joda.time.DateTimeField dateTimeField39 = chronology37.clockhourOfDay();
        int int40 = dateTime17.get(dateTimeField39);
        long long42 = dateTimeField39.roundHalfEven((long) 2);
        int int43 = dateTime12.get(dateTimeField39);
        int int45 = dateTimeField39.getLeapAmount((long) 20);
        org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property49 = localTime48.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone51 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime52 = localTime48.toDateTimeToday(dateTimeZone51);
        org.joda.time.LocalTime localTime54 = localTime48.plusMinutes((int) (short) 100);
        int[] intArray58 = new int[] { 32769, 23, 100 };
        int int59 = dateTimeField39.getMaximumValue((org.joda.time.ReadablePartial) localTime54, intArray58);
        // The following exception was thrown during execution in test generation
        try {
            int int61 = localTime54.getValue(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32769");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTime38);
        org.junit.Assert.assertNotNull(dateTimeField39);
        org.junit.Assert.assertTrue("'" + int40 + "' != '" + 15 + "'", int40 == 15);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 0L + "'", long42 == 0L);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 24 + "'", int43 == 24);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(property49);
        org.junit.Assert.assertNotNull(dateTimeZone51);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(localTime54);
        org.junit.Assert.assertNotNull(intArray58);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray58), "[32769, 23, 100]");
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 24 + "'", int59 == 24);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        java.util.Locale locale15 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = gregorianCalendar12.getDisplayName(12, (int) (short) 100, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(gregorianCalendar12);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.era();
        org.joda.time.LocalDateTime localDateTime6 = property5.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withCenturyOfEra(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = localDateTime6.getFieldType(4);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 4");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        boolean boolean3 = file2.isFile();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("21 Feb 2022 15:02:00 GMT", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=21feb202215:02:00gmt");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(3);
        int int5 = localDate4.getYear();
        org.joda.time.LocalDate localDate7 = localDate4.withWeekOfWeekyear((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDate7.get(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfMinute' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime5 = localTime2.withMillisOfSecond((int) (byte) 10);
        org.joda.time.LocalTime localTime7 = localTime5.withMillisOfSecond(16);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, chronology9);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, chronology12);
        boolean boolean14 = dateTime10.isAfter((org.joda.time.ReadableInstant) dateTime13);
        int int15 = dateTime10.getDayOfYear();
        org.joda.time.DateTime dateTime17 = dateTime10.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property18 = dateTime10.year();
        org.joda.time.DateTime dateTime19 = property18.withMaximumValue();
        org.joda.time.DateTime dateTime21 = property18.addToCopy(3);
        org.joda.time.DateTime dateTime23 = dateTime21.withYear(12);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime25 = dateTime21.withZoneRetainFields(dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate((java.lang.Object) localTime5, dateTimeZone24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.DateTime dateTime3 = dateTime1.plusMonths(0);
        org.joda.time.Chronology chronology4 = dateTime3.getChronology();
        org.joda.time.DateTime dateTime6 = dateTime3.withSecondOfMinute((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime7 = dateTime3.toLocalDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withDayOfMonth(32580010);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32580010 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        int int4 = localDate3.getCenturyOfEra();
        org.joda.time.LocalDate localDate6 = localDate3.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate8 = localDate6.minusWeeks(2);
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime10 = localDate6.toDateTimeAtCurrentTime(dateTimeZone9);
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(dateTimeZone9);
        org.joda.time.DateTime.Property property12 = dateTime11.yearOfCentury();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime17.plus((long) 'a');
        org.joda.time.DateTime dateTime22 = dateTime21.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateTime dateTime24 = dateTime22.toDateTime(chronology23);
        org.joda.time.Chronology chronology25 = dateTime22.getChronology();
        org.joda.time.DurationField durationField26 = chronology25.minutes();
        org.joda.time.DateTime dateTime27 = dateTime11.toDateTime(chronology25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate(10, 6, 59, chronology25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forTimeZone(timeZone0);
        java.time.ZoneId zoneId2 = timeZone0.toZoneId();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.LocalDate localDate5 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone4);
        org.joda.time.LocalDate localDate7 = localDate5.plusDays(3);
        org.joda.time.LocalDate localDate9 = localDate7.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate11 = localDate7.withWeekOfWeekyear(5);
        java.util.Date date12 = localDate7.toDate();
        boolean boolean13 = timeZone0.inDaylightTime(date12);
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(zoneId2);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(date12);
        org.junit.Assert.assertEquals(date12.toString(), "Sun Jan 04 00:00:00 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withHourOfDay((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks(4);
        org.joda.time.LocalDateTime.Property property10 = localDateTime9.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime9.withEra(21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy(364740218880L);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime17.plus((long) 'a');
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(11);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis((long) 8);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime31 = localTime28.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime25.toDateTime(chronology32);
        org.joda.time.DateTime dateTime34 = dateTime12.withChronology(chronology32);
        org.joda.time.DateTimeField dateTimeField35 = chronology32.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            long long38 = dateTimeField35.set(13L, "gregory");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"gregory\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        int int3 = dateTime2.getMillisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime2.withMillisOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("zho", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.BufferedReader bufferedReader1 = null;
        // The following exception was thrown during execution in test generation
        try {
            zoneInfoCompiler0.parseDataFile(bufferedReader1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        int int8 = dateTime2.getSecondOfMinute();
        java.util.GregorianCalendar gregorianCalendar9 = dateTime2.toGregorianCalendar();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = gregorianCalendar9.getActualMaximum(24);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 24");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(100L, chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.withZoneRetainFields(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 'a');
        org.joda.time.DateTime dateTime12 = dateTime6.plusWeeks(11);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((long) 8);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property18 = localTime17.hourOfDay();
        org.joda.time.LocalTime localTime20 = localTime17.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTime dateTime22 = dateTime14.toDateTime(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfDay();
        int int24 = dateTime1.get(dateTimeField23);
        long long26 = dateTimeField23.roundHalfEven((long) 2);
        int int28 = dateTimeField23.getLeapAmount(45056L);
        java.lang.String str30 = dateTimeField23.getAsShortText((long) 3);
        org.joda.time.LocalTime localTime32 = org.joda.time.LocalTime.fromMillisOfDay((long) 20);
        org.joda.time.LocalTime localTime34 = localTime32.plusMinutes((int) (short) 100);
        org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate();
        int[] intArray37 = localDate36.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray39 = dateTimeField23.addWrapField((org.joda.time.ReadablePartial) localTime34, (int) (byte) 100, intArray37, (int) '/');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 15 + "'", int24 == 15);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 0L + "'", long26 == 0L);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "24" + "'", str30, "24");
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[2022, 2, 21]");
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        org.joda.time.ReadableDuration readableDuration5 = null;
        org.joda.time.DateTime dateTime6 = dateTime2.minus(readableDuration5);
        java.util.Locale.Category category8 = java.util.Locale.Category.FORMAT;
        java.util.Locale locale11 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = locale11.getISO3Language();
        java.util.Locale.setDefault(category8, locale11);
        java.util.Locale locale16 = java.util.Locale.JAPAN;
        java.util.Locale.setDefault(category8, locale16);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = dateTime2.toString("", locale16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertTrue("'" + category8 + "' != '" + java.util.Locale.Category.FORMAT + "'", category8.equals(java.util.Locale.Category.FORMAT));
        org.junit.Assert.assertEquals(locale11.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ja_JP");
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1970-01-01T00:00:00.100Z");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(100L, chronology3);
        org.joda.time.DateTime dateTime6 = dateTime4.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.DateTime dateTime8 = dateTime6.withZoneRetainFields(dateTimeZone7);
        org.joda.time.DateTime dateTime10 = dateTime6.plus((long) 'a');
        org.joda.time.DateTime dateTime12 = dateTime6.plusWeeks(11);
        org.joda.time.DateTime dateTime14 = dateTime12.withMillis((long) 8);
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property18 = localTime17.hourOfDay();
        org.joda.time.LocalTime localTime20 = localTime17.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        org.joda.time.DateTime dateTime22 = dateTime14.toDateTime(chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfDay();
        long long27 = chronology21.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DateTime dateTime28 = dateTime1.withChronology(chronology21);
        org.joda.time.DateTimeField dateTimeField29 = chronology21.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            long long32 = dateTimeField29.set((long) 56, "millisOfSecond");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"millisOfSecond\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 32771L + "'", long27 == 32771L);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        int int5 = localTime4.getHourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = property6.setCopy("21 Oct 2111 15:01:55 GMT");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"21 Oct 2111 15:01:55 GMT\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.LocalTime localTime3 = localTime1.minusMillis(32770);
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property6 = localTime1.property(dateTimeFieldType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        java.util.Date date3 = localDateTime0.toDate();
        int int4 = date3.getSeconds();
        java.lang.String str5 = date3.toGMTString();
        int int6 = date3.getYear();
        java.lang.String str7 = date3.toLocaleString();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Feb 21 15:02:07 GMT 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 7 + "'", int4 == 7);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "18 Feb 2022 05:50:48 GMT" + "'", str5, "18 Feb 2022 05:50:48 GMT");
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 122 + "'", int6 == 122);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022/02/21 15:02:07" + "'", str7, "2022/02/21 15:02:07");
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(3);
        int int5 = localDate4.getYear();
        org.joda.time.LocalDate localDate7 = localDate4.withWeekOfWeekyear((int) ' ');
        org.joda.time.LocalDate localDate9 = localDate7.minusMonths((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate9.withCenturyOfEra(1645455721);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1645455721 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1970 + "'", int5 == 1970);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-18574), 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 32769");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguage("2022/02/21 15:02:07");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 2022/02/21 15:02:07 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime.Property property3 = localDateTime2.dayOfYear();
        org.joda.time.LocalDateTime localDateTime5 = property3.setCopy(52);
        org.joda.time.DurationField durationField6 = property3.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property3.setCopy("millisOfSecond");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"millisOfSecond\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(durationField6);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(9, 15, 9, 5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 15 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.io.File file2 = new java.io.File("UTC", "");
        java.lang.String str3 = file2.toString();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "UTC");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "UTC" + "'", str3, "UTC");
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTime(dateTimeZone4);
        org.joda.time.DateTime.Property property6 = dateTime2.hourOfDay();
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "/", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Locale locale9 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleKeys();
        boolean boolean11 = strSet5.retainAll((java.util.Collection<java.lang.String>) strSet10);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean13 = strSet10.add("millis");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals(locale9.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(3);
        org.joda.time.LocalDate.Property property5 = localDate2.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = localDate2.withMonthOfYear((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField2 = localTime0.getField(24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 24");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType5.getField(chronology7);
        java.lang.String str10 = dateTimeField8.getAsText((long) (byte) 100);
        long long12 = dateTimeField8.remainder(32771L);
        boolean boolean13 = dateTimeField8.isSupported();
        int int14 = dateTimeField8.getMinimumValue();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "100" + "'", str10, "100");
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 0L + "'", long12 == 0L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.lang.Class<?> wildcardClass5 = languageRangeList1.getClass();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(wildcardClass5);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        long long3 = file2.length();
        boolean boolean4 = file2.exists();
        long long5 = file2.length();
        boolean boolean6 = file2.isFile();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 45056L + "'", long3 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
// flaky:         org.junit.Assert.assertTrue("'" + long5 + "' != '" + 45056L + "'", long5 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        java.io.File file2 = new java.io.File("UTC", "");
        boolean boolean5 = file2.setExecutable(false, true);
        java.io.File file6 = file2.getAbsoluteFile();
        java.lang.Object obj7 = null;
        boolean boolean8 = file2.equals(obj7);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "UTC");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(file6);
// flaky:         org.junit.Assert.assertEquals(file6.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file6.toString(), "/experiment/UTC");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate3 = property1.addWrapFieldToCopy((int) '#');
        org.joda.time.LocalDate localDate4 = property1.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDate4.getField((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime10 = dateTime4.plusWeeks(11);
        org.joda.time.DateTime dateTime12 = dateTime10.withMillis((long) 8);
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property16 = localTime15.hourOfDay();
        org.joda.time.LocalTime localTime18 = localTime15.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology19 = localTime18.getChronology();
        org.joda.time.DateTime dateTime20 = dateTime12.toDateTime(chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.clockhourOfDay();
        long long25 = chronology19.add(1L, (long) 32770, (int) (byte) 1);
        org.joda.time.DurationField durationField26 = chronology19.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long34 = chronology19.getDateTimeMillis(5, (int) (byte) 1, 7, 20, 59, 32580010, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32580010 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 32771L + "'", long25 == 32771L);
        org.junit.Assert.assertNotNull(durationField26);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) '#', dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int5 = localDateTime4.getMinuteOfHour();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime10.plus((long) 'a');
        org.joda.time.DateTime dateTime15 = dateTime14.withTimeAtStartOfDay();
        boolean boolean16 = localDateTime4.equals((java.lang.Object) dateTime15);
        org.joda.time.LocalDateTime.Property property17 = localDateTime4.dayOfMonth();
        int int18 = property17.getMaximumValueOverall();
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 31 + "'", int18 == 31);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("FRA");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"FRA\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.roll(9, true);
        int int12 = calendar4.getFirstDayOfWeek();
        calendar4.setTimeInMillis((long) 70);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = calendar4.getMaximum(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1970");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=70,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=70,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property5.addToCopy((long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.LocalTime localTime0 = org.joda.time.LocalTime.now();
        org.junit.Assert.assertNotNull(localTime0);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (short) 100, 3, (int) (byte) 10, (int) '#', 9);
        int int13 = calendar4.getMinimalDaysInFirstWeek();
        int int14 = calendar4.getMinimalDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            calendar4.add(59, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=35,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) (short) 10, 1969, (int) (byte) 1, 32770, 122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.util.Locale locale2 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = locale2.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale2.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for HI!");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property2 = localDateTime0.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDateTime0.getFieldType(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 31");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withHourOfDay((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks(4);
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minus(readablePeriod10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDateTime9.getValue((int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 117");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        int int5 = localTime4.getHourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.roundHalfCeilingCopy();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, chronology9);
        org.joda.time.DateTime dateTime12 = dateTime10.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTime.Property property13 = dateTime10.minuteOfDay();
        java.util.Locale locale16 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet17 = locale16.getUnicodeLocaleKeys();
        int int18 = property13.getMaximumTextLength(locale16);
        org.joda.time.DateTime dateTime19 = property13.roundHalfEvenCopy();
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.MutableDateTime mutableDateTime21 = dateTime19.toMutableDateTime(chronology20);
        org.joda.time.DateTime dateTime23 = dateTime19.plusMonths((int) (short) -1);
        boolean boolean24 = dateTime19.isBeforeNow();
        org.joda.time.LocalTime localTime27 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property28 = localTime27.hourOfDay();
        org.joda.time.LocalTime localTime30 = localTime27.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology31 = localTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = chronology31.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField33 = chronology31.secondOfDay();
        boolean boolean34 = dateTime19.equals((java.lang.Object) dateTimeField33);
        org.joda.time.DateTime dateTime37 = dateTime19.withDurationAdded((long) 20, (int) (byte) 1);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(100L, chronology39);
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(100L, chronology42);
        boolean boolean44 = dateTime40.isAfter((org.joda.time.ReadableInstant) dateTime43);
        int int45 = dateTime40.getDayOfYear();
        org.joda.time.DateTime dateTime48 = dateTime40.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime50 = dateTime40.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType51 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int52 = dateTime50.get(dateTimeFieldType51);
        org.joda.time.DateTime.Property property53 = dateTime50.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType54 = property53.getFieldType();
        org.joda.time.DateTime dateTime56 = dateTime37.withField(dateTimeFieldType54, 2);
        // The following exception was thrown during execution in test generation
        try {
            int int57 = localTime7.get(dateTimeFieldType54);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'dayOfWeek' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertEquals(locale16.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 4 + "'", int18 == 4);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(mutableDateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 1 + "'", int45 == 1);
        org.junit.Assert.assertNotNull(dateTime48);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTimeFieldType51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 0 + "'", int52 == 0);
        org.junit.Assert.assertNotNull(property53);
        org.junit.Assert.assertNotNull(dateTimeFieldType54);
        org.junit.Assert.assertNotNull(dateTime56);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withWeekOfWeekyear(9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime0.withDate((-4871), (int) '#', 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.weekOfWeekyear();
        java.util.Locale locale11 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = locale11.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = property7.setCopy("zho", locale11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zho\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals(locale11.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "HI!" + "'", str13, "HI!");
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("FR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.withWeekyear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = null;
        java.lang.String str7 = localDate5.toString(dateTimeFormatter6);
        org.joda.time.LocalDate localDate9 = localDate5.minusMonths(0);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((long) '#', dateTimeZone12);
        int int15 = dateTimeZone12.getOffset((long) (short) 10);
        java.util.Locale locale19 = new java.util.Locale("", "hi!");
        java.util.Locale locale22 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleKeys();
        java.lang.String str24 = locale22.getVariant();
        java.lang.String str25 = locale19.getDisplayScript(locale22);
        java.lang.String str26 = dateTimeZone12.getShortName((long) 20, locale22);
        org.joda.time.DateTime dateTime27 = localDate5.toDateTimeAtMidnight(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate29 = localDate5.withDayOfYear(1100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1100 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0000-02-21" + "'", str7, "0000-02-21");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 360000000 + "'", int15 == 360000000);
        org.junit.Assert.assertEquals(locale19.toString(), "_HI!");
        org.junit.Assert.assertEquals(locale22.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+100:00" + "'", str26, "+100:00");
        org.junit.Assert.assertNotNull(dateTime27);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.era();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        boolean boolean12 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime11);
        org.joda.time.DateTime dateTime14 = dateTime11.plusMillis((int) (byte) -1);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = dateTime11.toMutableDateTime(chronology15);
        boolean boolean17 = mutableDateTime16.isBeforeNow();
        int int18 = property5.compareTo((org.joda.time.ReadableInstant) mutableDateTime16);
        org.joda.time.LocalDateTime localDateTime20 = property5.addWrapFieldToCopy((int) (short) 0);
        org.joda.time.LocalDateTime localDateTime21 = property5.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = property5.setCopy(27);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 27 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime21);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(100L, chronology5);
        org.joda.time.DateTime dateTime8 = dateTime6.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.DateTime dateTime10 = dateTime8.withZoneRetainFields(dateTimeZone9);
        org.joda.time.DateTime dateTime12 = dateTime8.plus((long) 'a');
        org.joda.time.DateTime dateTime14 = dateTime8.plusWeeks(11);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillis((long) 8);
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property20 = localTime19.hourOfDay();
        org.joda.time.LocalTime localTime22 = localTime19.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.DateTime dateTime24 = dateTime16.toDateTime(chronology23);
        org.joda.time.DurationField durationField25 = chronology23.eras();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime30 = property29.withMinimumValue();
        int int31 = localTime30.getHourOfDay();
        long long33 = chronology23.set((org.joda.time.ReadablePartial) localTime30, 364740218880L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(9, 4, 1645455718, (int) (short) -1, chronology23);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1645455718 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 364694580000L + "'", long33 == 364694580000L);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone1);
        org.joda.time.LocalDate.Property property3 = localDate2.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate2.getValue(6);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 6");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.setTimeInMillis((long) 'a');
        calendar4.add(11, (int) '4');
        // The following exception was thrown during execution in test generation
        try {
            calendar4.setWeekDate(56, 1, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 59");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=187200097,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=3,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=0,SECOND=0,MILLISECOND=97,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (byte) 1, 1, (-1));
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromCalendarFields(calendar4);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) 20);
        org.joda.time.LocalTime localTime15 = localTime13.plusMinutes((int) (short) 100);
        boolean boolean16 = calendar4.equals((java.lang.Object) localTime15);
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=-62133263999900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=6,WEEK_OF_MONTH=6,DAY_OF_MONTH=30,DAY_OF_YEAR=30,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(1645455721, 10, 54122803, 360000000, 11, (int) 'a', 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 360000000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        org.joda.time.DateTime dateTime8 = dateTime5.plusMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime10 = dateTime5.withCenturyOfEra((int) (byte) 1);
        int int11 = dateTime10.getMillisOfSecond();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 100 + "'", int11 == 100);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("", (double) 63686358124491L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=6.3686358124491E13");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("ap. J.-C.", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime2.plusYears((int) (short) 0);
        org.joda.time.DateTime dateTime11 = dateTime2.minusWeeks(4);
        org.joda.time.DateTime dateTime13 = dateTime11.withDayOfWeek(1);
        int int14 = dateTime11.getMillisOfDay();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 100 + "'", int14 == 100);
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate3 = property1.addWrapFieldToCopy((int) '#');
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100L, chronology6);
        org.joda.time.DateTime dateTime9 = dateTime7.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime7.minuteOfDay();
        java.util.Locale locale13 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        int int15 = property10.getMaximumTextLength(locale13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = property1.setCopy("FRA", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"FRA\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 4 + "'", int15 == 4);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        long long3 = file2.length();
        boolean boolean5 = file2.setReadable(false);
        boolean boolean6 = file2.canWrite();
        boolean boolean7 = file2.canWrite();
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime10 = instant8.toMutableDateTime();
        boolean boolean11 = file2.equals((java.lang.Object) instant8);
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long3 + "' != '" + 45056L + "'", long3 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
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
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(54122803, (int) ' ', 1645455723, (int) 'x', 1645455723, (int) (byte) 10, 56);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(0, 422, 4, 13, 52, (int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 422 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("seconds");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"seconds\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        java.util.Locale locale2 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet3 = locale2.getUnicodeLocaleKeys();
        java.lang.String str4 = locale2.getVariant();
        java.lang.String str5 = locale2.getDisplayScript();
        java.util.Locale locale6 = locale2.stripExtensions();
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(locale2);
        // The following exception was thrown during execution in test generation
        try {
            calendar7.setWeekDate(70, (int) 'x', 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 70");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale2.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455730521,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=292278993,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=56,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=13,SECOND=29,MILLISECOND=514,ZONE_OFFSET=292278993,DST_OFFSET=0]");
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(3);
        org.joda.time.LocalDate localDate6 = localDate4.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate8 = localDate4.withWeekOfWeekyear(5);
        org.joda.time.DateTime dateTime9 = localDate4.toDateTimeAtStartOfDay();
        org.joda.time.DateTime.Property property10 = dateTime9.year();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = property10.setCopy("zho");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"zho\" for year is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) 1, 903);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 903");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.parse("seconds", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(1969, 6, 2019, (int) 'u', 21, 422, 13, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder1.setScript("21 Feb 2022 15:02:10 GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: 21 Feb 2022 15:02:10 GMT [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("1970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '1970' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        int int5 = localTime4.getHourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        java.util.Locale locale11 = java.util.Locale.FRANCE;
        java.lang.String str12 = dateTime9.toString("4", locale11);
        java.lang.String str13 = localTime4.toString("197", locale11);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = localTime4.getValue((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "4" + "'", str12, "4");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "197" + "'", str13, "197");
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();
        java.io.File file1 = null;
        java.io.File file3 = new java.io.File(file1, "hi!");
        long long4 = file3.length();
        boolean boolean6 = file3.setReadable(false);
        long long7 = file3.getTotalSpace();
        java.io.File file8 = file3.getCanonicalFile();
        boolean boolean9 = file8.canExecute();
        java.io.File file11 = new java.io.File("");
        java.io.File file12 = null;
        java.io.File file14 = new java.io.File(file12, "hi!");
        boolean boolean15 = file14.createNewFile();
        java.nio.file.Path path16 = file14.toPath();
        java.lang.String str17 = file14.getName();
        long long18 = file14.length();
        java.io.File file19 = null;
        java.io.File file21 = new java.io.File(file19, "hi!");
        boolean boolean22 = file21.createNewFile();
        java.nio.file.Path path23 = file21.toPath();
        java.io.File file24 = file21.getCanonicalFile();
        java.io.File file25 = null;
        java.io.File file27 = new java.io.File(file25, "hi!");
        long long28 = file27.length();
        boolean boolean29 = file27.exists();
        boolean boolean30 = file27.delete();
        java.nio.file.Path path31 = file27.toPath();
        java.io.File file32 = null;
        java.io.File file34 = new java.io.File(file32, "hi!");
        java.lang.String str35 = file34.getCanonicalPath();
        long long36 = file34.lastModified();
        long long37 = file34.lastModified();
        boolean boolean38 = file34.delete();
        boolean boolean41 = file34.setWritable(true, false);
        java.io.File[] fileArray42 = new java.io.File[] { file11, file14, file24, file27, file34 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, org.joda.time.DateTimeZone> strMap43 = zoneInfoCompiler0.compile(file8, fileArray42);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException; message:  (No such file or directory)");
        } catch (java.io.FileNotFoundException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file3.getParent() == null", file3.getParent());
        org.junit.Assert.assertEquals(file3.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long4 + "' != '" + 45056L + "'", long4 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 364740218880L + "'", long7 == 364740218880L);
        org.junit.Assert.assertNotNull(file8);
// flaky:         org.junit.Assert.assertEquals(file8.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file8.toString(), "/experiment/hi!");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertNull("file11.getParent() == null", file11.getParent());
        org.junit.Assert.assertEquals(file11.toString(), "");
        org.junit.Assert.assertNull("file14.getParent() == null", file14.getParent());
        org.junit.Assert.assertEquals(file14.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(path16);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "hi!" + "'", str17, "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long18 + "' != '" + 45056L + "'", long18 == 45056L);
        org.junit.Assert.assertNull("file21.getParent() == null", file21.getParent());
        org.junit.Assert.assertEquals(file21.toString(), "hi!");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(path23);
        org.junit.Assert.assertNotNull(file24);
// flaky:         org.junit.Assert.assertEquals(file24.getParent(), "/experiment");
// flaky:         org.junit.Assert.assertEquals(file24.toString(), "/experiment/hi!");
        org.junit.Assert.assertNull("file27.getParent() == null", file27.getParent());
        org.junit.Assert.assertEquals(file27.toString(), "hi!");
// flaky:         org.junit.Assert.assertTrue("'" + long28 + "' != '" + 45056L + "'", long28 == 45056L);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + true + "'", boolean29 == true);
// flaky:         org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
        org.junit.Assert.assertNotNull(path31);
        org.junit.Assert.assertNull("file34.getParent() == null", file34.getParent());
        org.junit.Assert.assertEquals(file34.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "/experiment/hi!" + "'", str35, "/experiment/hi!");
        org.junit.Assert.assertTrue("'" + long36 + "' != '" + 0L + "'", long36 == 0L);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 0L + "'", long37 == 0L);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
// flaky:         org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(fileArray42);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-4871), (int) (byte) 0, 22, 1969, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1969 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getMonth();
        java.lang.String str2 = date0.toGMTString();
        java.lang.String str3 = date0.toString();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Fri Feb 25 00:13:30 GMT 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str2 + "' != '" + "21 Feb 2022 15:02:11 GMT" + "'", str2, "21 Feb 2022 15:02:11 GMT");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "Fri Feb 25 00:13:30 GMT 2022" + "'", str3, "Fri Feb 25 00:13:30 GMT 2022");
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime5 = localTime2.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfHalfday();
        boolean boolean8 = dateTimeField7.isLenient();
        org.joda.time.DurationField durationField9 = dateTimeField7.getDurationField();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        int int11 = localDate10.getCenturyOfEra();
        org.joda.time.LocalDate localDate13 = localDate10.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate15 = localDate13.withWeekyear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = null;
        java.lang.String str17 = localDate15.toString(dateTimeFormatter16);
        org.joda.time.LocalDate localDate19 = localDate15.minusMonths(0);
        org.joda.time.LocalDate localDate21 = new org.joda.time.LocalDate();
        int[] intArray22 = localDate21.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = dateTimeField7.addWrapPartial((org.joda.time.ReadablePartial) localDate19, (-18574), intArray22, 1645455718);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -18574");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "0000-02-21" + "'", str17, "0000-02-21");
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[2022, 2, 21]");
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        java.lang.String str3 = file2.getCanonicalPath();
        boolean boolean4 = file2.mkdir();
        long long5 = file2.getTotalSpace();
        java.lang.String str6 = file2.getParent();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/experiment/hi!" + "'", str3, "/experiment/hi!");
// flaky:         org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 364740218880L + "'", long5 == 364740218880L);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime5 = localTime2.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfHalfday();
        boolean boolean8 = dateTimeField7.isSupported();
        java.lang.String str9 = dateTimeField7.getName();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        int int11 = localDate10.getCenturyOfEra();
        org.joda.time.LocalDate localDate13 = localDate10.withCenturyOfEra(4);
        java.lang.String str14 = localDate13.toString();
        java.util.Locale locale15 = java.util.Locale.UK;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeField7.getAsShortText((org.joda.time.ReadablePartial) localDate13, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "hourOfHalfday" + "'", str9, "hourOfHalfday");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 20 + "'", int11 == 20);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "0422-02-21" + "'", str14, "0422-02-21");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "en_GB");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        gregorianCalendar12.set(11, (int) 'u', 0, 122, 9);
        java.lang.String str19 = gregorianCalendar12.toString();
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(gregorianCalendar12);
// flaky:         org.junit.Assert.assertEquals("'" + str19 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=11,MONTH=117,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=0,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=122,MINUTE=9,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str19, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=11,MONTH=117,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=0,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=122,MINUTE=9,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusYears((int) ' ');
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMinutes(15);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.millisOfDay();
        org.joda.time.LocalDateTime.Property property8 = localDateTime4.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = localDateTime4.getFieldType((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime3 = new org.joda.time.DateTime((long) '#', dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime(dateTimeZone2);
        int int5 = localDateTime4.getMinuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime4.withMinuteOfHour((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
// flaky:         org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.Chronology chronology12 = dateTime9.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.minutes();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = chronology12.get(readablePeriod14, 232L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        java.lang.String[] strArray4 = new java.lang.String[] { "hi!", "/", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet5 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean6 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet5, strArray4);
        java.util.Locale locale9 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleKeys();
        boolean boolean11 = strSet5.retainAll((java.util.Collection<java.lang.String>) strSet10);
        java.util.stream.Stream<java.lang.String> strStream12 = strSet10.stream();
        java.util.Locale locale13 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        boolean boolean15 = strSet10.removeAll((java.util.Collection<java.lang.String>) strSet14);
        java.lang.String[] strArray20 = new java.lang.String[] { "hi!", "/", "hi!", "" };
        java.util.LinkedHashSet<java.lang.String> strSet21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet21, strArray20);
        java.util.Locale locale25 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet26 = locale25.getUnicodeLocaleKeys();
        boolean boolean27 = strSet21.retainAll((java.util.Collection<java.lang.String>) strSet26);
        java.util.stream.Stream<java.lang.String> strStream28 = strSet26.stream();
        java.util.Locale locale29 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet30 = locale29.getUnicodeLocaleKeys();
        boolean boolean31 = strSet26.removeAll((java.util.Collection<java.lang.String>) strSet30);
        boolean boolean32 = strSet14.addAll((java.util.Collection<java.lang.String>) strSet26);
        org.joda.time.LocalDateTime localDateTime33 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime35 = localDateTime33.withMillisOfDay(10);
        org.joda.time.LocalDateTime localDateTime37 = localDateTime35.plusYears((int) ' ');
        org.joda.time.LocalDateTime localDateTime39 = localDateTime37.minusMinutes(15);
        org.joda.time.LocalDateTime.Property property40 = localDateTime39.millisOfSecond();
        boolean boolean41 = strSet26.contains((java.lang.Object) property40);
        org.joda.time.LocalDateTime localDateTime43 = property40.addToCopy((int) 'u');
        java.util.Locale locale45 = java.util.Locale.UK;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime46 = property40.setCopy("21 Feb 2022 15:01:56 GMT", locale45);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"21 Feb 2022 15:01:56 GMT\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertEquals(locale9.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(strStream12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(strArray20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertEquals(locale25.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(strStream28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDateTime35);
        org.junit.Assert.assertNotNull(localDateTime37);
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localDateTime43);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "en_GB");
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime9.withZone(dateTimeZone12);
        boolean boolean16 = dateTime14.isAfter((-12959996399978L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime14.withDate(0, 0, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        int int5 = localTime4.getHourOfDay();
        org.joda.time.LocalTime.Property property6 = localTime4.secondOfMinute();
        org.joda.time.LocalTime localTime7 = property6.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime9 = localTime7.withHourOfDay(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localTime7);
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology5 = dateTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.minuteOfHour();
        org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate(chronology5);
        org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withMillisOfDay(10);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.minusWeeks((int) (byte) 100);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withDayOfMonth(23);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime12.plus(readablePeriod15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusSeconds((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean19 = localDate7.isEqual((org.joda.time.ReadablePartial) localDateTime18);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        // The following exception was thrown during execution in test generation
        try {
            java.io.File file2 = java.io.File.createTempFile("millis", "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.io.IOException; message: File name too long");
        } catch (java.io.IOException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("100");
        java.util.Locale locale2 = java.util.Locale.PRC;
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(timeZone1, locale2);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getTimeZone("100");
        boolean boolean6 = timeZone1.hasSameRules(timeZone5);
        java.util.Calendar calendar7 = java.util.Calendar.getInstance(timeZone1);
        java.lang.String str8 = calendar7.toString();
        org.junit.Assert.assertNotNull(timeZone1);
// flaky:         org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455732178,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=12,MILLISECOND=178,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455732178,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=12,MILLISECOND=178,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.util.GregorianCalendar[time=1645455732178,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=12,MILLISECOND=178,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str8, "java.util.GregorianCalendar[time=1645455732178,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=12,MILLISECOND=178,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        int int13 = dateTime2.getWeekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone14);
        boolean boolean16 = dateTimeZone14.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone14);
        org.joda.time.MutableDateTime mutableDateTime18 = dateTime2.toMutableDateTime(dateTimeZone14);
        boolean boolean20 = mutableDateTime18.isEqual((long) (short) 0);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("2057-02-19");
        int int2 = localDateTime1.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDateTime1.withHourOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        java.lang.String str3 = file2.getCanonicalPath();
        boolean boolean4 = file2.canRead();
        boolean boolean5 = file2.isAbsolute();
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/experiment/hi!" + "'", str3, "/experiment/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + true + "'", boolean4 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((long) '#', dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(dateTimeZone4);
        int int8 = dateTimeZone4.getOffset((long) 20);
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(63686358113845L, dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(360000001L, dateTimeZone4);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withDayOfMonth((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDateTime12.getValue((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 120");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 360000000 + "'", int8 == 360000000);
        org.junit.Assert.assertNotNull(localDateTime12);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusYears((int) ' ');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDateTime4.getField(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32769");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime5 = localTime2.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.hourOfHalfday();
        org.joda.time.DateTimeField dateTimeField8 = chronology6.secondOfDay();
        java.lang.String str9 = dateTimeField8.getName();
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property14 = localTime13.hourOfDay();
        org.joda.time.LocalTime localTime16 = localTime13.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(100L, chronology18);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(100L, chronology21);
        boolean boolean23 = dateTime19.isAfter((org.joda.time.ReadableInstant) dateTime22);
        int int24 = dateTime19.getDayOfYear();
        org.joda.time.DateTime dateTime27 = dateTime19.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime29 = dateTime19.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int31 = dateTime29.get(dateTimeFieldType30);
        org.joda.time.DateTime.Property property32 = dateTime29.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = property32.getFieldType();
        org.joda.time.DurationFieldType durationFieldType34 = dateTimeFieldType33.getDurationType();
        boolean boolean35 = localTime13.isSupported(durationFieldType34);
        org.joda.time.DurationFieldType durationFieldType36 = org.joda.time.DurationFieldType.millis();
        java.lang.String str37 = durationFieldType36.getName();
        org.joda.time.LocalTime localTime39 = localTime13.withFieldAdded(durationFieldType36, (int) (short) -1);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(100L, chronology41);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(100L, chronology44);
        boolean boolean46 = dateTime42.isAfter((org.joda.time.ReadableInstant) dateTime45);
        int int47 = dateTime42.getDayOfYear();
        org.joda.time.DateTime dateTime50 = dateTime42.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime52 = dateTime42.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime55 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property56 = localTime55.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone58 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime59 = localTime55.toDateTimeToday(dateTimeZone58);
        org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime61 = org.joda.time.DateTime.now(dateTimeZone60);
        int int62 = dateTimeZone58.getOffset((org.joda.time.ReadableInstant) dateTime61);
        org.joda.time.MutableDateTime mutableDateTime63 = dateTime52.toMutableDateTime(dateTimeZone58);
        int int65 = dateTimeZone58.getOffset((long) (short) 100);
        org.joda.time.DateTime dateTime66 = localTime39.toDateTimeToday(dateTimeZone58);
        org.joda.time.LocalTime localTime70 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property71 = localTime70.hourOfDay();
        org.joda.time.LocalTime localTime73 = localTime70.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology74 = localTime73.getChronology();
        org.joda.time.DateTimeField dateTimeField75 = chronology74.hourOfHalfday();
        boolean boolean76 = dateTimeField75.isLenient();
        org.joda.time.DurationField durationField77 = dateTimeField75.getDurationField();
        java.util.Locale locale81 = new java.util.Locale("dayOfWeek", "1970-01-01", "1970");
        int int82 = dateTimeField75.getMaximumShortTextLength(locale81);
        java.lang.String str83 = dateTimeZone58.getShortName(709199999L, locale81);
        java.lang.String str84 = dateTimeField8.getAsText((int) '/', locale81);
        org.joda.time.ReadablePartial readablePartial85 = null;
        int[] intArray92 = new int[] { 7, 2022, 3, 'x', 360000000 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray94 = dateTimeField8.addWrapField(readablePartial85, (int) '/', intArray92, 56);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 47");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "secondOfDay" + "'", str9, "secondOfDay");
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(property32);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertNotNull(durationFieldType34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + false + "'", boolean35 == false);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "millis" + "'", str37, "millis");
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + false + "'", boolean46 == false);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1 + "'", int47 == 1);
        org.junit.Assert.assertNotNull(dateTime50);
        org.junit.Assert.assertNotNull(dateTime52);
        org.junit.Assert.assertNotNull(property56);
        org.junit.Assert.assertNotNull(dateTimeZone58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(dateTimeZone60);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 0 + "'", int62 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime63);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 0 + "'", int65 == 0);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(property71);
        org.junit.Assert.assertNotNull(localTime73);
        org.junit.Assert.assertNotNull(chronology74);
        org.junit.Assert.assertNotNull(dateTimeField75);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + false + "'", boolean76 == false);
        org.junit.Assert.assertNotNull(durationField77);
        org.junit.Assert.assertEquals(locale81.toString(), "dayofweek_1970-01-01_1970");
        org.junit.Assert.assertTrue("'" + int82 + "' != '" + 2 + "'", int82 == 2);
        org.junit.Assert.assertEquals("'" + str83 + "' != '" + "+00:00" + "'", str83, "+00:00");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "47" + "'", str84, "47");
        org.junit.Assert.assertNotNull(intArray92);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray92), "[7, 2022, 3, 120, 360000000]");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getMonth();
        java.util.Date date2 = new java.util.Date();
        date2.setDate(32769);
        boolean boolean5 = date0.after(date2);
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromDateFields(date2);
        java.lang.String str7 = localTime6.toString();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Fri Feb 25 00:13:31 GMT 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Oct 21 00:13:31 GMT 2111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(localTime6);
// flaky:         org.junit.Assert.assertEquals("'" + str7 + "' != '" + "00:13:31.637" + "'", str7, "00:13:31.637");
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("2022/02/21 15:02:07", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022/02/2115:02:07");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMinutes(9);
        java.util.Locale locale12 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.lang.String str14 = locale12.getVariant();
        java.lang.String str15 = locale12.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = localDateTime8.toString("dayOfMonth", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: O");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertEquals(locale12.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "" + "'", str15, "");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getMonth();
        java.util.Date date2 = new java.util.Date();
        date2.setDate(32769);
        boolean boolean5 = date0.after(date2);
        java.lang.Object obj6 = date0.clone();
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Fri Feb 25 00:13:31 GMT 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Wed Oct 21 00:13:31 GMT 2111");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(obj6);
// flaky:         org.junit.Assert.assertEquals(obj6.toString(), "Fri Feb 25 00:13:31 GMT 2022");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "Fri Feb 25 00:13:31 GMT 2022");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "Fri Feb 25 00:13:31 GMT 2022");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(100L, chronology8);
        org.joda.time.DateTime dateTime11 = dateTime9.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTime.Property property12 = dateTime9.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(100L, chronology17);
        boolean boolean19 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime15.getDayOfYear();
        org.joda.time.DateTime dateTime23 = dateTime15.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime25 = dateTime15.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int27 = dateTime25.get(dateTimeFieldType26);
        boolean boolean28 = dateTime9.isSupported(dateTimeFieldType26);
        org.joda.time.LocalTime localTime30 = localTime2.withField(dateTimeFieldType26, 11);
        org.joda.time.LocalTime localTime32 = localTime30.plusMillis(7);
        org.joda.time.LocalTime.Property property33 = localTime32.millisOfDay();
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime(100L, chronology35);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(100L, chronology38);
        boolean boolean40 = dateTime36.isAfter((org.joda.time.ReadableInstant) dateTime39);
        int int41 = dateTime36.getDayOfYear();
        org.joda.time.DateTime dateTime44 = dateTime36.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime46 = dateTime36.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property50 = localTime49.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone52 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime53 = localTime49.toDateTimeToday(dateTimeZone52);
        org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime55 = org.joda.time.DateTime.now(dateTimeZone54);
        int int56 = dateTimeZone52.getOffset((org.joda.time.ReadableInstant) dateTime55);
        org.joda.time.MutableDateTime mutableDateTime57 = dateTime46.toMutableDateTime(dateTimeZone52);
        org.joda.time.Instant instant58 = dateTime46.toInstant();
        org.joda.time.Instant instant61 = instant58.withDurationAdded((long) (byte) 100, 1970);
        org.joda.time.DateTime dateTime62 = instant61.toDateTime();
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateTime dateTime65 = new org.joda.time.DateTime(100L, chronology64);
        org.joda.time.DateTime dateTime67 = dateTime65.plusHours(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType68 = org.joda.time.DateTimeFieldType.secondOfMinute();
        int int69 = dateTime67.get(dateTimeFieldType68);
        boolean boolean70 = dateTime62.isSupported(dateTimeFieldType68);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime72 = localTime32.withField(dateTimeFieldType68, 1645455718);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1645455718 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + false + "'", boolean40 == false);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 1 + "'", int41 == 1);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime46);
        org.junit.Assert.assertNotNull(property50);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertNotNull(dateTime53);
        org.junit.Assert.assertNotNull(dateTimeZone54);
        org.junit.Assert.assertNotNull(dateTime55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 0 + "'", int56 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(instant58);
        org.junit.Assert.assertNotNull(instant61);
        org.junit.Assert.assertNotNull(dateTime62);
        org.junit.Assert.assertNotNull(dateTime67);
        org.junit.Assert.assertNotNull(dateTimeFieldType68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 0 + "'", int69 == 0);
        org.junit.Assert.assertTrue("'" + boolean70 + "' != '" + true + "'", boolean70 == true);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = localDate1.getField(1);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.DateTime dateTime10 = dateTime8.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.DateTime dateTime12 = dateTime10.withZoneRetainFields(dateTimeZone11);
        org.joda.time.DateTime dateTime14 = dateTime10.plus((long) 'a');
        org.joda.time.DateTime dateTime16 = dateTime10.plusWeeks(11);
        org.joda.time.DateTime dateTime18 = dateTime16.withMillis((long) 8);
        org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property22 = localTime21.hourOfDay();
        org.joda.time.LocalTime localTime24 = localTime21.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology25 = localTime24.getChronology();
        org.joda.time.DateTime dateTime26 = dateTime18.toDateTime(chronology25);
        org.joda.time.DurationField durationField27 = chronology25.eras();
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((-62135596800000L), chronology25);
        int[] intArray33 = new int[] { 27, 54122803, 'x' };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = dateTimeField4.set((org.joda.time.ReadablePartial) localTime28, 197, intArray33, 292278993);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 292278993 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(intArray33);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[27, 54122803, 120]");
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        java.io.File file0 = null;
        java.io.File file2 = new java.io.File(file0, "hi!");
        java.lang.String str3 = file2.getCanonicalPath();
        boolean boolean4 = file2.mkdir();
        long long5 = file2.getTotalSpace();
        java.io.File file6 = file2.getParentFile();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = file6.mkdir();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull("file2.getParent() == null", file2.getParent());
        org.junit.Assert.assertEquals(file2.toString(), "hi!");
// flaky:         org.junit.Assert.assertEquals("'" + str3 + "' != '" + "/experiment/hi!" + "'", str3, "/experiment/hi!");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + long5 + "' != '" + 364740218880L + "'", long5 == 364740218880L);
        org.junit.Assert.assertNull(file6);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetHours(902);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Offset is too large");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.roll(9, true);
        int int12 = calendar4.getFirstDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = calendar4.getLeastMaximum(68513845);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 68513845");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTime.Property property5 = dateTime2.minuteOfDay();
        java.util.Locale locale8 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet9 = locale8.getUnicodeLocaleKeys();
        int int10 = property5.getMaximumTextLength(locale8);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(100L, chronology15);
        boolean boolean17 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime16);
        int int18 = dateTime13.getDayOfYear();
        org.joda.time.DateTime dateTime21 = dateTime13.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime23 = dateTime21.plusSeconds(1);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(100L, chronology25);
        org.joda.time.DateTime dateTime28 = dateTime26.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.DateTime dateTime30 = dateTime28.withZoneRetainFields(dateTimeZone29);
        org.joda.time.DateTime dateTime32 = dateTime28.plus((long) 'a');
        org.joda.time.DateTime dateTime34 = dateTime28.plusWeeks(11);
        org.joda.time.DateTime dateTime36 = dateTime34.withMillis((long) 8);
        org.joda.time.LocalTime localTime39 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property40 = localTime39.hourOfDay();
        org.joda.time.LocalTime localTime42 = localTime39.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology43 = localTime42.getChronology();
        org.joda.time.DateTime dateTime44 = dateTime36.toDateTime(chronology43);
        org.joda.time.DateTime dateTime45 = dateTime23.withChronology(chronology43);
        org.joda.time.DateTimeField dateTimeField46 = chronology43.weekyear();
        org.joda.time.DateTimeField dateTimeField47 = chronology43.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField48 = chronology43.hourOfHalfday();
        org.joda.time.DateTime dateTime49 = org.joda.time.DateTime.now(chronology43);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime50 = new org.joda.time.LocalDateTime((java.lang.Object) locale8, chronology43);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 4 + "'", int10 == 4);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateTime32);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertNotNull(property40);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTime44);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(dateTimeField47);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(dateTime49);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime5 = localTime2.withMillisOfSecond((int) (byte) 10);
        int int6 = localTime5.getMillisOfDay();
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime();
        int int8 = localDateTime7.getMonthOfYear();
        int int9 = localDateTime7.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int11 = localDateTime7.get(dateTimeFieldType10);
        int int12 = localDateTime7.getHourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localTime5.compareTo((org.joda.time.ReadablePartial) localDateTime7);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 32580010 + "'", int6 == 32580010);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 52 + "'", int9 == 52);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 15 + "'", int12 == 15);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((long) '#', dateTimeZone7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime((java.lang.Object) languageRangeList4, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.ArrayList");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime5 = localTime2.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = chronology6.weekyearOfCentury();
        boolean boolean8 = dateTimeField7.isLenient();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime6 = localTime4.withMillisOfSecond(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension('/', "21 Feb 2022 15:01:56 GMT");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: / [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        java.util.Date date5 = new java.util.Date(5, (int) (short) -1, (int) (short) 100, 12, (int) (byte) -1);
        java.util.Date date6 = new java.util.Date();
        int int7 = date6.getMonth();
        java.util.Date date8 = new java.util.Date();
        date8.setDate(32769);
        boolean boolean11 = date6.after(date8);
        boolean boolean12 = date5.before(date8);
        java.util.Date date14 = new java.util.Date((long) 'a');
        int int15 = date5.compareTo(date14);
        org.junit.Assert.assertEquals(date5.toString(), "Fri Mar 10 11:59:00 GMT 1905");
// flaky:         org.junit.Assert.assertEquals(date6.toString(), "Fri Feb 25 00:13:32 GMT 2022");
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Wed Oct 21 00:13:32 GMT 2111");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
// flaky:         org.junit.Assert.assertEquals(date14.toString(), "Sun Jan 04 09:11:19 GMT 1970");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + (-1) + "'", int15 == (-1));
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay(232L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime1.withMillisOfSecond(32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.roundCeilingCopy();
        org.joda.time.LocalTime localTime5 = property3.roundFloorCopy();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        boolean boolean12 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime8.getDayOfYear();
        org.joda.time.DateTime dateTime15 = dateTime8.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property16 = dateTime8.year();
        org.joda.time.DateTime dateTime17 = property16.withMaximumValue();
        org.joda.time.DateTime dateTime19 = property16.addToCopy(3);
        org.joda.time.DateTime dateTime21 = dateTime19.withYear(12);
        org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime23 = dateTime19.withZoneRetainFields(dateTimeZone22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) property3, dateTimeZone22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getMonth();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime(100L, chronology3);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100L, chronology6);
        boolean boolean8 = dateTime4.isAfter((org.joda.time.ReadableInstant) dateTime7);
        int int9 = dateTime4.getDayOfYear();
        org.joda.time.DateTime dateTime11 = dateTime4.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property12 = dateTime4.year();
        org.joda.time.DateTime dateTime13 = property12.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime15 = dateTime13.minusSeconds((int) (byte) 1);
        java.util.Date date16 = dateTime15.toDate();
        boolean boolean17 = date0.before(date16);
        org.joda.time.LocalDate localDate18 = org.joda.time.LocalDate.fromDateFields(date16);
        int int19 = localDate18.getYear();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = localDate18.toString("dayOfWeek");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: O");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Fri Feb 25 00:13:32 GMT 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(date16);
// flaky:         org.junit.Assert.assertEquals(date16.toString(), "Sun Jan 04 09:11:17 GMT 1970");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertNotNull(localDate18);
// flaky:         org.junit.Assert.assertTrue("'" + int19 + "' != '" + 1970 + "'", int19 == 1970);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(68513845);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.util.TimeZone timeZone6 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forTimeZone(timeZone6);
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.parse("2057-02-19");
        int int10 = localDateTime9.getHourOfDay();
        boolean boolean11 = dateTimeZone7.isLocalDateTimeGap(localDateTime9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(14, 2, 0, 2, (int) '#', 11, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone6);
// flaky:         org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDateTime0.getFieldType(17);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 17");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks(2);
        int int6 = localDate3.getWeekyear();
        int int7 = localDate3.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localDate3.getValue(52);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 52");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 422 + "'", int6 == 422);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(100L, chronology6);
        java.util.Locale locale8 = null;
        java.util.Calendar calendar9 = dateTime7.toCalendar(locale8);
        org.joda.time.ReadableDuration readableDuration10 = null;
        org.joda.time.DateTime dateTime11 = dateTime7.minus(readableDuration10);
        org.joda.time.ReadableDuration readableDuration12 = null;
        org.joda.time.DateTime dateTime13 = dateTime7.minus(readableDuration12);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer4, (org.joda.time.ReadableInstant) dateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(calendar9);
        org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTime13);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusYears((int) ' ');
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMinutes(15);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.millisOfSecond();
        org.joda.time.LocalDateTime.Property property8 = localDateTime6.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType10 = localDateTime6.getFieldType(24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 24");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.withMillisOfDay(10);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusYears((int) ' ');
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusMinutes(15);
        org.joda.time.LocalDateTime.Property property7 = localDateTime4.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime4.withDate(31, 0, 70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getMonthOfYear();
        int int2 = localDateTime0.getDayOfYear();
        org.joda.time.ReadablePeriod readablePeriod3 = null;
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.minus(readablePeriod3);
        int int5 = localDateTime0.getMonthOfYear();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property9 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime11 = localTime8.withMillisOfSecond((int) (byte) 10);
        org.joda.time.LocalTime localTime13 = localTime11.withMillisOfSecond(16);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDateTime0.compareTo((org.joda.time.ReadablePartial) localTime11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plus(readablePeriod5);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMinutes(9);
        int int9 = localDateTime6.getSecondOfMinute();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 13 + "'", int9 == 13);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setRegion("100");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder3.setExtension('/', "9");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: / [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean6 = dateTime4.isSupported(dateTimeFieldType5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime4.withMillisOfDay(1645455721);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1645455721 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.util.Locale locale0 = java.util.Locale.getDefault();
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Spliterator<java.lang.String> strSpliterator2 = strSet1.spliterator();
        org.junit.Assert.assertNotNull(locale0);
// flaky:         org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strSpliterator2);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(chronology0);
        org.joda.time.LocalDate.Property property2 = localDate1.dayOfWeek();
        org.joda.time.DateTimeField dateTimeField4 = localDate1.getField(1);
        java.util.TimeZone timeZone5 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forTimeZone(timeZone5);
        org.joda.time.DateTime dateTime7 = localDate1.toDateTimeAtCurrentTime(dateTimeZone6);
        org.joda.time.format.DateTimePrinter dateTimePrinter8 = null;
        org.joda.time.format.DateTimeParser dateTimeParser9 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter8, dateTimeParser9);
        boolean boolean11 = dateTimeFormatter10.isPrinter();
        boolean boolean12 = dateTimeFormatter10.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter10.withPivotYear(32770);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localDate1.toString(dateTimeFormatter14);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(timeZone5);
// flaky:         org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        java.util.GregorianCalendar gregorianCalendar12 = dateTime9.toGregorianCalendar();
        gregorianCalendar12.set(11, (int) 'u', 0, 122, 9);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = gregorianCalendar12.getGreatestMinimum(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(gregorianCalendar12);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
        int int1 = localDateTime0.getMonthOfYear();
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears(3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime.Property property7 = localDateTime2.secondOfMinute();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(100L, chronology9);
        org.joda.time.DateTime dateTime12 = dateTime10.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateTime dateTime14 = dateTime12.withZoneRetainFields(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime12.plus((long) 'a');
        org.joda.time.DateTime dateTime17 = dateTime16.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.toDateTime(chronology18);
        org.joda.time.Chronology chronology20 = dateTime17.getChronology();
        org.joda.time.ReadableDuration readableDuration21 = null;
        org.joda.time.DateTime dateTime22 = dateTime17.plus(readableDuration21);
        int int23 = property7.getDifference((org.joda.time.ReadableInstant) dateTime22);
        boolean boolean24 = localDateTime0.equals((java.lang.Object) int23);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime((long) '#', dateTimeZone27);
        org.joda.time.LocalDateTime localDateTime29 = new org.joda.time.LocalDateTime(dateTimeZone27);
        int int30 = localDateTime29.getMinuteOfHour();
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(100L, chronology32);
        org.joda.time.DateTime dateTime35 = dateTime33.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone36 = null;
        org.joda.time.DateTime dateTime37 = dateTime35.withZoneRetainFields(dateTimeZone36);
        org.joda.time.DateTime dateTime39 = dateTime35.plus((long) 'a');
        org.joda.time.DateTime dateTime40 = dateTime39.withTimeAtStartOfDay();
        boolean boolean41 = localDateTime29.equals((java.lang.Object) dateTime40);
        org.joda.time.LocalDateTime localDateTime42 = localDateTime0.withFields((org.joda.time.ReadablePartial) localDateTime29);
        java.lang.String str43 = localDateTime42.toString();
        org.junit.Assert.assertNotNull(localDateTime0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertNotNull(dateTime22);
// flaky:         org.junit.Assert.assertTrue("'" + int23 + "' != '" + 1645455734 + "'", int23 == 1645455734);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
        org.junit.Assert.assertNotNull(dateTimeZone27);
// flaky:         org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2 + "'", int30 == 2);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertNotNull(localDateTime42);
// flaky:         org.junit.Assert.assertEquals("'" + str43 + "' != '" + "2022-02-25T19:02:14.075" + "'", str43, "2022-02-25T19:02:14.075");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        java.util.Date date1 = new java.util.Date((long) 'a');
        int int2 = date1.getSeconds();
        java.lang.Object obj3 = date1.clone();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Sun Jan 04 09:11:19 GMT 1970");
// flaky:         org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
        org.junit.Assert.assertNotNull(obj3);
// flaky:         org.junit.Assert.assertEquals(obj3.toString(), "Sun Jan 04 09:11:19 GMT 1970");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj3), "Sun Jan 04 09:11:19 GMT 1970");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj3), "Sun Jan 04 09:11:19 GMT 1970");
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (byte) 1, 1, (-1));
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(100L, chronology12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(100L, chronology15);
        boolean boolean17 = dateTime13.isAfter((org.joda.time.ReadableInstant) dateTime16);
        int int18 = dateTime13.getDayOfYear();
        org.joda.time.DateTime dateTime21 = dateTime13.withDurationAdded((long) (short) 0, 100);
        int int22 = dateTime21.getWeekOfWeekyear();
        boolean boolean23 = calendar4.before((java.lang.Object) dateTime21);
        java.lang.String str24 = dateTime21.toString();
        org.joda.time.DateTime dateTime26 = dateTime21.plusMinutes(53);
        org.joda.time.DateTime.Property property27 = dateTime26.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = property27.setCopy(360000000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 360000000 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=-1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 1 + "'", int22 == 1);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "1970-01-01T00:00:00.100Z" + "'", str24, "1970-01-01T00:00:00.100Z");
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        java.util.Locale locale0 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Iterator<java.lang.String> strItor2 = strSet1.iterator();
        java.lang.String[] strArray35 = new java.lang.String[] { "00:03:00.000", "GMT", "UTC", ":", "zho", "", "\u4e2d\u6587\u53f0\u6e7e\u5730\u533a)", "HI!", "gregory", "21 Oct 2111 15:01:59 GMT", "+100:00", "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]", "17 Oct 2111 15:02:13 GMT", "AD", "1970", "2057-02-19T00:00:00.000", ":", "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=11,MONTH=117,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=0,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=122,MINUTE=9,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]", "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=100,MONTH=3,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=10,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=35,MINUTE=9,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]", "0422-02-21", "France", "4", "2022/02/21 15:02:07", "+00:00", "millisOfSecond", "0000-02-21", "+00:00", "", "/experiment/hi!", "1970", "French (France)", "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=11,MONTH=117,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=0,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=122,MINUTE=9,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]" };
        java.util.ArrayList<java.lang.String> strList36 = new java.util.ArrayList<java.lang.String>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList36, strArray35);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean38 = strSet1.addAll((java.util.Collection<java.lang.String>) strList36);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(strItor2);
        org.junit.Assert.assertNotNull(strArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + true + "'", boolean37 == true);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        calendar4.set((int) (byte) 1, 1, (-1));
        calendar4.setLenient(true);
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromCalendarFields(calendar4);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean15 = calendar4.isSet(1645455733);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1645455733");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=-62133263999900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=0,WEEK_OF_YEAR=6,WEEK_OF_MONTH=6,DAY_OF_MONTH=30,DAY_OF_YEAR=30,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=5,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(dateTimeFieldType3);
        int int5 = localDateTime2.getCenturyOfEra();
        org.joda.time.LocalDateTime.Property property6 = localDateTime2.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) '#', dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone9);
        int int13 = dateTimeZone9.getOffset((long) 20);
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.minusYears(3);
        boolean boolean17 = dateTimeZone9.isLocalDateTimeGap(localDateTime16);
        int int18 = property6.compareTo((org.joda.time.ReadablePartial) localDateTime16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = localDateTime16.withEra((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 20 + "'", int5 == 20);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 360000000 + "'", int13 == 360000000);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
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
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(1);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone13);
        org.joda.time.DateTime dateTime15 = dateTime10.withZoneRetainFields(dateTimeZone14);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.DateTime dateTime18 = dateTime15.withPeriodAdded(readablePeriod16, 12);
        org.joda.time.DateTime.Property property19 = dateTime18.dayOfYear();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(property19);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setRegion("100");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.clear();
        java.util.Locale locale8 = new java.util.Locale("", "hi!");
        java.util.Locale locale11 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = locale8.getDisplayScript(locale11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder15 = builder5.setLocale(locale8);
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: HI! [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "_100");
        org.junit.Assert.assertNotNull(builder5);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertEquals(locale11.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate7 = localDate3.minusWeeks(100);
        org.joda.time.LocalDate.Property property8 = localDate3.yearOfCentury();
        org.joda.time.Chronology chronology9 = localDate3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate3.withMonthOfYear(32770);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
        boolean boolean4 = localDateTime2.isSupported(dateTimeFieldType3);
        org.joda.time.LocalDateTime.Property property5 = localDateTime2.era();
        long long6 = property5.remainder();
        org.joda.time.LocalDateTime localDateTime7 = property5.getLocalDateTime();
        org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property11 = localTime10.hourOfDay();
        org.joda.time.LocalTime localTime13 = localTime10.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime(100L, chronology15);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime(100L, chronology18);
        boolean boolean20 = dateTime16.isAfter((org.joda.time.ReadableInstant) dateTime19);
        int int21 = dateTime16.getDayOfYear();
        org.joda.time.DateTime dateTime24 = dateTime16.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime26 = dateTime16.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int28 = dateTime26.get(dateTimeFieldType27);
        org.joda.time.DateTime.Property property29 = dateTime26.dayOfWeek();
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = property29.getFieldType();
        org.joda.time.DurationFieldType durationFieldType31 = dateTimeFieldType30.getDurationType();
        boolean boolean32 = localTime10.isSupported(durationFieldType31);
        org.joda.time.LocalTime localTime34 = localTime10.withMinuteOfHour((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean35 = localDateTime7.isEqual((org.joda.time.ReadablePartial) localTime34);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(property5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 63686358134679L + "'", long6 == 63686358134679L);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(durationFieldType31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localTime34);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = dateTime9.withZone(dateTimeZone12);
        org.joda.time.ReadablePeriod readablePeriod15 = null;
        org.joda.time.DateTime dateTime17 = dateTime14.withPeriodAdded(readablePeriod15, 197);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime17.withEra(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime2.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime2.year();
        org.joda.time.DateTime dateTime12 = dateTime2.withMonthOfYear(5);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.DateTime dateTime14 = dateTime2.plus(readablePeriod13);
        org.joda.time.DateTime dateTime16 = dateTime2.plusDays((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration17 = null;
        org.joda.time.DateTime dateTime18 = dateTime16.plus(readableDuration17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime18.withDate(1645455718, 14, (-4871));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1645455718 for year must be in the range [-292275054,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        int int3 = dateTime2.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateTime dateTime5 = dateTime2.toDateTime(dateTimeZone4);
        java.util.Locale locale8 = new java.util.Locale("", "hi!");
        java.util.Locale locale11 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet12 = locale11.getUnicodeLocaleKeys();
        java.lang.String str13 = locale11.getVariant();
        java.lang.String str14 = locale8.getDisplayScript(locale11);
        java.util.Calendar calendar15 = dateTime5.toCalendar(locale8);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromCalendarFields(calendar15);
        calendar15.setMinimalDaysInFirstWeek(5);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = calendar15.getActualMinimum(1645455733);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1645455733");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 100 + "'", int3 == 100);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertEquals(locale8.toString(), "_HI!");
        org.junit.Assert.assertEquals(locale11.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet12);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertNotNull(calendar15);
        org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=5,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=52,WEEK_OF_MONTH=0,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks(2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        boolean boolean12 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime8.getDayOfYear();
        org.joda.time.DateTime dateTime15 = dateTime8.plusYears((int) (short) 0);
        long long16 = dateTime8.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int18 = dateTime8.get(dateTimeFieldType17);
        boolean boolean19 = localDate3.isSupported(dateTimeFieldType17);
        java.util.Date date20 = localDate3.toDate();
        date20.setMonth(1969);
        java.util.Date date23 = new java.util.Date();
        int int24 = date23.getMonth();
        java.util.Date date25 = new java.util.Date();
        date25.setDate(32769);
        boolean boolean28 = date23.after(date25);
        // The following exception was thrown during execution in test generation
        try {
            int int29 = date20.compareTo(date25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: sun.util.calendar.JulianCalendar$Date cannot be cast to sun.util.calendar.Gregorian$Date");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Thu Feb 21 00:00:00 GMT 586");
// flaky:         org.junit.Assert.assertEquals(date23.toString(), "Fri Feb 25 00:13:33 GMT 2022");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 1 + "'", int24 == 1);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Wed Oct 21 00:13:33 GMT 2111");
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.roundFloorCopy();
        org.joda.time.LocalTime localTime5 = property3.withMinimumValue();
        org.joda.time.LocalTime localTime6 = property3.roundFloorCopy();
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.millis();
        org.joda.time.LocalTime localTime9 = localTime6.withFieldAdded(durationFieldType7, (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localTime6.toString("2022-02-21T15:02:11.642Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(32770);
        java.io.Writer writer7 = null;
        org.joda.time.Instant instant8 = org.joda.time.Instant.now();
        org.joda.time.MutableDateTime mutableDateTime9 = instant8.toMutableDateTimeISO();
        org.joda.time.MutableDateTime mutableDateTime10 = instant8.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(writer7, (org.joda.time.ReadableInstant) mutableDateTime10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(mutableDateTime10);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime4 = property3.withMinimumValue();
        org.joda.time.DateTimeField dateTimeField5 = property3.getField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property3.setCopy("18 Feb 2022 05:50:48 GMT");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"18 Feb 2022 05:50:48 GMT\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(100L, chronology8);
        org.joda.time.DateTime dateTime11 = dateTime9.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTime.Property property12 = dateTime9.minuteOfDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(100L, chronology17);
        boolean boolean19 = dateTime15.isAfter((org.joda.time.ReadableInstant) dateTime18);
        int int20 = dateTime15.getDayOfYear();
        org.joda.time.DateTime dateTime23 = dateTime15.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime25 = dateTime15.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType26 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int27 = dateTime25.get(dateTimeFieldType26);
        boolean boolean28 = dateTime9.isSupported(dateTimeFieldType26);
        org.joda.time.LocalTime localTime30 = localTime2.withField(dateTimeFieldType26, 11);
        org.joda.time.LocalTime localTime32 = localTime30.plusMillis(7);
        org.joda.time.Chronology chronology33 = localTime32.getChronology();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray37 = chronology33.get(readablePeriod34, 1L, (long) 56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeFieldType26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 0 + "'", int27 == 0);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(chronology33);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.LocalDateTime.Property property5 = localDateTime0.secondOfMinute();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withHourOfDay((int) (short) 1);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks(4);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withDayOfYear((int) '/');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withMonthOfYear(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property3 = localTime2.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime6 = localTime2.toDateTimeToday(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone7);
        int int9 = dateTimeZone5.getOffset((org.joda.time.ReadableInstant) dateTime8);
        boolean boolean11 = dateTimeZone5.isStandardOffset(0L);
        java.util.TimeZone timeZone12 = dateTimeZone5.toTimeZone();
        java.time.ZoneId zoneId13 = timeZone12.toZoneId();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        java.util.Locale locale17 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet18 = locale17.getUnicodeLocaleKeys();
        java.util.Locale locale19 = java.util.Locale.PRC;
        java.lang.String str20 = locale17.getDisplayCountry(locale19);
        java.lang.String str21 = dateTimeZone15.getShortName((long) 3, locale19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone12, locale19);
        java.lang.Object obj23 = calendar22.clone();
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(timeZone12);
// flaky:         org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u534f\u8c03\u4e16\u754c\u65f6\u95f4");
        org.junit.Assert.assertNotNull(zoneId13);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "\u53f0\u6e7e\u5730\u533a" + "'", str20, "\u53f0\u6e7e\u5730\u533a");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1645455735350,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=15,MILLISECOND=350,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj23);
// flaky:         org.junit.Assert.assertEquals(obj23.toString(), "java.util.GregorianCalendar[time=1645455735350,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=15,MILLISECOND=350,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj23), "java.util.GregorianCalendar[time=1645455735350,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=15,MILLISECOND=350,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj23), "java.util.GregorianCalendar[time=1645455735350,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=15,MILLISECOND=350,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime((int) 'a', 12, 1970, 32400000, 54122803, (int) 'u', (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32400000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(32770);
        java.lang.StringBuffer stringBuffer7 = null;
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
        int int9 = localDateTime8.getMonthOfYear();
        org.joda.time.LocalDateTime.Property property10 = localDateTime8.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter6.printTo(stringBuffer7, (org.joda.time.ReadablePartial) localDateTime8);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate(0L);
        int int2 = localDate1.getYearOfEra();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        org.joda.time.DateTime dateTime7 = dateTime5.withMillisOfSecond((int) (short) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        boolean boolean9 = dateTime7.isSupported(dateTimeFieldType8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property10 = localDate1.property(dateTimeFieldType8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1970 + "'", int2 == 1970);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(32770);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, (-62135596800000L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("09:03:00.003", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=09:03:00.003");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setRegion("100");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale.Builder builder5 = builder0.clear();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder7 = builder5.setLanguageTag("java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=11,MONTH=117,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=0,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=122,MINUTE=9,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=11,MONTH=117,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=0,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=122,MINUTE=9,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "_100");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.setLenient(false);
        java.util.TimeZone timeZone11 = java.util.TimeZone.getDefault();
        int int12 = timeZone11.getRawOffset();
        java.util.TimeZone timeZone13 = java.util.TimeZone.getDefault();
        int int14 = timeZone13.getRawOffset();
        boolean boolean15 = timeZone11.hasSameRules(timeZone13);
        calendar4.setTimeZone(timeZone11);
        boolean boolean17 = timeZone11.useDaylightTime();
        org.junit.Assert.assertNotNull(calendar4);
// flaky:         org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=292278993,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(timeZone11);
// flaky:         org.junit.Assert.assertEquals(timeZone11.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
// flaky:         org.junit.Assert.assertTrue("'" + int12 + "' != '" + 292278993 + "'", int12 == 292278993);
        org.junit.Assert.assertNotNull(timeZone13);
// flaky:         org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "\u683c\u6797\u5a01\u6cbb\u65f6\u95f4");
// flaky:         org.junit.Assert.assertTrue("'" + int14 + "' != '" + 292278993 + "'", int14 == 292278993);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime2.minus((long) (byte) 10);
        org.joda.time.DateTimeFieldType dateTimeFieldType13 = org.joda.time.DateTimeFieldType.minuteOfHour();
        int int14 = dateTime12.get(dateTimeFieldType13);
        org.joda.time.DateTime.Property property15 = dateTime12.dayOfWeek();
        org.joda.time.DurationField durationField16 = property15.getDurationField();
        int int17 = property15.get();
        java.lang.String str18 = property15.getName();
        int int19 = property15.getMaximumValueOverall();
        java.util.Locale locale21 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = property15.setCopy("gregory", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"gregory\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTimeFieldType13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 4 + "'", int17 == 4);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "dayOfWeek" + "'", str18, "dayOfWeek");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 7 + "'", int19 == 7);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.DateTime dateTime10 = dateTime8.withMillisOfSecond((int) (short) 0);
        org.joda.time.Chronology chronology11 = dateTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = chronology11.minuteOfHour();
        org.joda.time.LocalDate localDate13 = new org.joda.time.LocalDate(chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((int) (short) 0, 11, 360000000, 23, (int) (short) -1, (int) (byte) 1, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.LocalTime localTime3 = localTime1.minusMillis(32770);
        org.joda.time.LocalTime.Property property4 = localTime1.millisOfDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        boolean boolean12 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime8.getDayOfYear();
        org.joda.time.DateTime dateTime16 = dateTime8.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime18 = dateTime8.minus((long) (byte) 10);
        java.util.Locale locale19 = java.util.Locale.TAIWAN;
        java.util.Calendar calendar20 = dateTime8.toCalendar(locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = property4.setCopy("1 Jan 1970 00:00:00 GMT", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1 Jan 1970 00:00:00 GMT\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(calendar20);
        org.junit.Assert.assertEquals(calendar20.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        java.util.Date date3 = localDateTime0.toDate();
        int int4 = date3.getSeconds();
        java.lang.String str5 = date3.toGMTString();
        java.util.Date date7 = new java.util.Date((long) 'a');
        int int8 = date7.getMonth();
        int int9 = date7.getDay();
        java.lang.String str10 = date7.toLocaleString();
        int int11 = date3.compareTo(date7);
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(date3);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Mon Feb 21 15:02:16 GMT 2022");
// flaky:         org.junit.Assert.assertTrue("'" + int4 + "' != '" + 16 + "'", int4 == 16);
// flaky:         org.junit.Assert.assertEquals("'" + str5 + "' != '" + "18 Feb 2022 05:50:57 GMT" + "'", str5, "18 Feb 2022 05:50:57 GMT");
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Sun Jan 04 09:11:19 GMT 1970");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "4 janv. 1970 09:11:19" + "'", str10, "4 janv. 1970 09:11:19");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
        org.joda.time.ReadableDuration readableDuration2 = null;
        org.joda.time.DateTime dateTime3 = dateTime1.plus(readableDuration2);
        org.joda.time.ReadableDuration readableDuration4 = null;
        org.joda.time.DateTime dateTime6 = dateTime3.withDurationAdded(readableDuration4, (int) (byte) 1);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = dateTime6.toMutableDateTime(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = dateTime6.withDate(6, 361, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 361 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(100L, chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(100L, chronology11);
        boolean boolean13 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime12);
        org.joda.time.DateTime dateTime15 = dateTime12.minusDays((int) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        boolean boolean18 = dateTimeZone16.isFixed();
        org.joda.time.DateTimeZone.setDefault(dateTimeZone16);
        org.joda.time.DateTime dateTime20 = dateTime12.toDateTime(dateTimeZone16);
        int int22 = dateTimeZone16.getStandardOffset((long) 1);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime(dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime(1970, 197, 1645455733, (int) (short) 0, 0, 16, (int) '/', dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 197 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(32770, 53, (int) '/', 976);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.roll(9, true);
        int int12 = calendar4.getFirstDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = calendar4.getActualMaximum(32580010);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32580010");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.setLenient(false);
        calendar4.set(10, 8, 5, 20, 100);
        calendar4.setFirstDayOfWeek(0);
        // The following exception was thrown during execution in test generation
        try {
            int int19 = calendar4.getWeekYear();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MINUTE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=false,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=0,minimalDaysInFirstWeek=1,ERA=1,YEAR=10,MONTH=8,WEEK_OF_YEAR=36,WEEK_OF_MONTH=1,DAY_OF_MONTH=5,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=20,MINUTE=100,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.DateTime dateTime4 = dateTime2.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateTime dateTime6 = dateTime4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.DateTime dateTime8 = dateTime4.plus((long) 'a');
        org.joda.time.DateTime dateTime9 = dateTime8.withTimeAtStartOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = dateTime9.toDateTime(chronology10);
        org.joda.time.Chronology chronology12 = dateTime9.getChronology();
        org.joda.time.DurationField durationField13 = chronology12.minutes();
        org.joda.time.DateTimeField dateTimeField14 = chronology12.minuteOfHour();
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        int int16 = localDate15.getCenturyOfEra();
        org.joda.time.LocalDate localDate18 = localDate15.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate20 = localDate18.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate22 = localDate18.minusWeeks(100);
        java.lang.String str24 = localDate18.toString("0422-02-21");
        org.joda.time.DateTime dateTime25 = localDate18.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate.Property property28 = localDate27.weekyear();
        org.joda.time.LocalDate localDate30 = property28.setCopy("100");
        int[] intArray31 = localDate30.getValues();
        java.util.Locale locale35 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet36 = locale35.getUnicodeLocaleKeys();
        java.lang.String str37 = locale35.getVariant();
        java.lang.String str38 = locale35.getDisplayScript();
        java.util.Locale locale39 = locale35.stripExtensions();
        java.util.Calendar calendar40 = java.util.Calendar.getInstance(locale35);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray41 = dateTimeField14.set((org.joda.time.ReadablePartial) localDate18, 19, intArray31, "dayofweek", locale35);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"dayofweek\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(durationField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 20 + "'", int16 == 20);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "0422-02-21" + "'", str24, "0422-02-21");
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(property28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertNotNull(intArray31);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray31), "[100, 2, 22]");
        org.junit.Assert.assertEquals(locale35.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet36);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "_HI!");
        org.junit.Assert.assertNotNull(calendar40);
// flaky:         org.junit.Assert.assertEquals(calendar40.toString(), "java.util.GregorianCalendar[time=1645455736605,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=292278993,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=25,DAY_OF_YEAR=56,DAY_OF_WEEK=6,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=13,SECOND=35,MILLISECOND=598,ZONE_OFFSET=292278993,DST_OFFSET=0]");
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.plus(readablePeriod5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = localDateTime6.withMinuteOfHour((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(32770);
        java.io.Writer writer7 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer7, (-3599999L));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.clear(9);
        int int8 = calendar4.getGreatestMinimum((int) (short) 0);
        calendar4.roll(9, true);
        int int12 = calendar4.getFirstDayOfWeek();
        calendar4.setFirstDayOfWeek(16);
        boolean boolean15 = calendar4.isWeekDateSupported();
        long long16 = calendar4.getTimeInMillis();
        // The following exception was thrown during execution in test generation
        try {
            int int18 = calendar4.getMinimum(32400000);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32400000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=43200100,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=16,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=0,HOUR_OF_DAY=12,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 1 + "'", int12 == 1);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + true + "'", boolean15 == true);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 43200100L + "'", long16 == 43200100L);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate2.plusDays(3);
        int int5 = localDate2.getEra();
        int int6 = localDate2.getDayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDate localDate9 = new org.joda.time.LocalDate((long) (short) 1, dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate9.plusDays(3);
        org.joda.time.LocalDate localDate13 = localDate11.withCenturyOfEra(4);
        boolean boolean14 = localDate2.isEqual((org.joda.time.ReadablePartial) localDate11);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.minusYears(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = null;
        boolean boolean19 = localDateTime17.isSupported(dateTimeFieldType18);
        org.joda.time.LocalDateTime.Property property20 = localDateTime17.era();
        long long21 = property20.remainder();
        org.joda.time.LocalDateTime localDateTime22 = property20.withMinimumValue();
        org.joda.time.LocalDateTime localDateTime23 = property20.roundHalfCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int24 = localDate11.compareTo((org.joda.time.ReadablePartial) localDateTime23);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 1 + "'", int5 == 1);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 1 + "'", int6 == 1);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(property20);
// flaky:         org.junit.Assert.assertTrue("'" + long21 + "' != '" + 63686358136964L + "'", long21 == 63686358136964L);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime23);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clear();
        java.util.Locale.Builder builder3 = builder0.setRegion("100");
        java.util.Locale locale4 = builder0.build();
        java.util.Locale locale5 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder8 = builder0.setExtension(' ', "Property[minuteOfDay]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "_100");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "_100");
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.minusWeeks(2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        boolean boolean12 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime8.getDayOfYear();
        org.joda.time.DateTime dateTime15 = dateTime8.plusYears((int) (short) 0);
        long long16 = dateTime8.getMillis();
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int18 = dateTime8.get(dateTimeFieldType17);
        boolean boolean19 = localDate3.isSupported(dateTimeFieldType17);
        java.util.Date date20 = localDate3.toDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate22 = localDate3.withDayOfMonth((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 100L + "'", long16 == 100L);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(date20);
        org.junit.Assert.assertEquals(date20.toString(), "Tue Feb 21 00:00:00 GMT 422");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        boolean boolean3 = dateTimeFormatter2.isPrinter();
        boolean boolean4 = dateTimeFormatter2.isOffsetParsed();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter2.withPivotYear(32770);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = dateTimeFormatter2.parseLocalDate("Mon Feb 21 15:01:51 UTC 2022");
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getCenturyOfEra();
        org.joda.time.LocalDate localDate3 = localDate0.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate5 = localDate3.withWeekyear((int) (short) 0);
        org.joda.time.LocalDate localDate7 = localDate3.minusWeeks(100);
        org.joda.time.LocalDate.Property property8 = localDate3.yearOfCentury();
        org.joda.time.Chronology chronology9 = localDate3.getChronology();
        org.joda.time.LocalDate.Property property10 = localDate3.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = localDate3.withDayOfYear(1100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1100 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 20 + "'", int1 == 20);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(property10);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.format.DateTimePrinter dateTimePrinter0 = null;
        org.joda.time.format.DateTimeParser dateTimeParser1 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter0, dateTimeParser1);
        java.io.Writer writer3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusYears(3);
        java.util.Date date7 = localDateTime4.toDate();
        org.joda.time.LocalDateTime localDateTime9 = localDateTime4.withWeekyear(7);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer3, (org.joda.time.ReadablePartial) localDateTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Printing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(date7);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Mon Feb 21 15:02:17 GMT 2022");
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.format.DateTimePrinter dateTimePrinter1 = null;
        org.joda.time.format.DateTimeParser dateTimeParser2 = null;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = new org.joda.time.format.DateTimeFormatter(dateTimePrinter1, dateTimeParser2);
        java.lang.Integer int4 = dateTimeFormatter3.getPivotYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.parse("0000-02-21", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Parsing not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNull(int4);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        java.util.Date date1 = new java.util.Date((long) (byte) 0);
        java.util.Date date7 = new java.util.Date(32770, (-18574), 59, 8, (int) (short) 100);
        boolean boolean8 = date1.after(date7);
        java.lang.String str9 = date7.toString();
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Sun Jan 04 09:11:18 GMT 1970");
        org.junit.Assert.assertEquals(date7.toString(), "Fri Apr 28 09:40:00 GMT 33122");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "Fri Apr 28 09:40:00 GMT 33122" + "'", str9, "Fri Apr 28 09:40:00 GMT 33122");
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        java.util.Locale locale3 = null;
        java.util.Calendar calendar4 = dateTime2.toCalendar(locale3);
        calendar4.setTimeInMillis((long) 'a');
        calendar4.add(11, (int) '4');
        calendar4.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = calendar4.getActualMinimum(563);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 563");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar4);
        org.junit.Assert.assertEquals(calendar4.toString(), "java.util.GregorianCalendar[time=187200097,areFieldsSet=true,areAllFieldsSet=true,lenient=false,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=3,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=4,HOUR_OF_DAY=4,MINUTE=0,SECOND=0,MILLISECOND=97,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap3 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList4 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, strMap3);
        java.util.Locale.LanguageRange[] languageRangeArray5 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList6 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList6, languageRangeArray5);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap8 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList9 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList6, strMap8);
        java.util.Locale locale12 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet13 = locale12.getUnicodeLocaleKeys();
        java.util.Locale locale16 = new java.util.Locale("", "hi!");
        java.util.Locale locale17 = java.util.Locale.FRANCE;
        java.util.Locale locale19 = new java.util.Locale("");
        java.util.Locale locale22 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet23 = locale22.getUnicodeLocaleKeys();
        java.lang.String str24 = locale22.getVariant();
        java.lang.String str25 = locale22.getISO3Language();
        java.util.Locale locale26 = java.util.Locale.TAIWAN;
        java.util.Locale locale27 = java.util.Locale.FRENCH;
        java.util.Locale locale30 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet31 = locale30.getUnicodeLocaleKeys();
        java.lang.String str32 = locale30.getVariant();
        java.util.Locale locale35 = new java.util.Locale("", "hi!");
        java.util.Locale locale38 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        java.lang.String str40 = locale38.getVariant();
        java.lang.String str41 = locale35.getDisplayScript(locale38);
        java.util.Locale[] localeArray42 = new java.util.Locale[] { locale12, locale16, locale17, locale19, locale22, locale26, locale27, locale30, locale38 };
        java.util.ArrayList<java.util.Locale> localeList43 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean44 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList43, localeArray42);
        java.util.List<java.util.Locale> localeList45 = java.util.Locale.filter(languageRangeList9, (java.util.Collection<java.util.Locale>) localeList43);
        java.util.List<java.util.Locale> localeList46 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList45);
        java.util.Locale.LanguageRange[] languageRangeArray47 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList48 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean49 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList48, languageRangeArray47);
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap50 = null;
        java.util.List<java.util.Locale.LanguageRange> languageRangeList51 = java.util.Locale.LanguageRange.mapEquivalents((java.util.List<java.util.Locale.LanguageRange>) languageRangeList48, strMap50);
        java.util.Locale locale52 = java.util.Locale.TAIWAN;
        java.util.Set<java.lang.String> strSet53 = locale52.getUnicodeLocaleKeys();
        strSet53.clear();
        java.util.List<java.lang.String> strList55 = java.util.Locale.filterTags(languageRangeList51, (java.util.Collection<java.lang.String>) strSet53);
        java.util.Locale.FilteringMode filteringMode56 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList57 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet53, filteringMode56);
        java.util.stream.Stream<java.lang.String> strStream58 = strList57.stream();
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(languageRangeList4);
        org.junit.Assert.assertNotNull(languageRangeArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(languageRangeList9);
        org.junit.Assert.assertEquals(locale12.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertEquals(locale16.toString(), "_HI!");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "fr_FR");
        org.junit.Assert.assertEquals(locale19.toString(), "");
        org.junit.Assert.assertEquals(locale22.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "fr");
        org.junit.Assert.assertEquals(locale30.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet31);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals(locale35.toString(), "_HI!");
        org.junit.Assert.assertEquals(locale38.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "" + "'", str41, "");
        org.junit.Assert.assertNotNull(localeArray42);
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + true + "'", boolean44 == true);
        org.junit.Assert.assertNotNull(localeList45);
        org.junit.Assert.assertNotNull(localeList46);
        org.junit.Assert.assertNotNull(languageRangeArray47);
        org.junit.Assert.assertTrue("'" + boolean49 + "' != '" + false + "'", boolean49 == false);
        org.junit.Assert.assertNotNull(languageRangeList51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(strSet53);
        org.junit.Assert.assertNotNull(strList55);
        org.junit.Assert.assertTrue("'" + filteringMode56 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode56.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList57);
        org.junit.Assert.assertNotNull(strStream58);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        int int1 = localDateTime0.getMonthOfYear();
        int int2 = localDateTime0.getDayOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        int int4 = localDateTime0.get(dateTimeFieldType3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime0.minusMonths(100);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusDays((int) 'u');
        org.joda.time.LocalDateTime.Property property9 = localDateTime6.dayOfWeek();
        java.util.Locale locale13 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet14 = locale13.getUnicodeLocaleKeys();
        java.lang.String str15 = locale13.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = property9.setCopy("", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for dayOfWeek is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 2 + "'", int1 == 2);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 52 + "'", int2 == 52);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 1 + "'", int4 == 1);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals(locale13.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "HI!" + "'", str15, "HI!");
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        int int8 = dateTime2.getSecondOfMinute();
        java.util.GregorianCalendar gregorianCalendar9 = dateTime2.toGregorianCalendar();
        // The following exception was thrown during execution in test generation
        try {
            gregorianCalendar9.roll(100, false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(gregorianCalendar9);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.LocalDateTime localDateTime0 = new org.joda.time.LocalDateTime();
        org.joda.time.LocalDateTime localDateTime2 = localDateTime0.minusYears(3);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime0.withMinuteOfHour((int) ' ');
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.millisOfSecond();
        boolean boolean6 = localDateTime4.isSupported(dateTimeFieldType5);
        int int7 = localDateTime4.getDayOfYear();
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 52 + "'", int7 == 52);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(100L, chronology8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(100L, chronology11);
        boolean boolean13 = dateTime9.isAfter((org.joda.time.ReadableInstant) dateTime12);
        int int14 = dateTime9.getDayOfYear();
        org.joda.time.DateTime dateTime17 = dateTime9.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime19 = dateTime9.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property23 = localTime22.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime26 = localTime22.toDateTimeToday(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime28 = org.joda.time.DateTime.now(dateTimeZone27);
        int int29 = dateTimeZone25.getOffset((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.MutableDateTime mutableDateTime30 = dateTime19.toMutableDateTime(dateTimeZone25);
        java.lang.String str32 = dateTimeZone25.getShortName(1645454200000L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(70, 32770, 903, (int) '4', 2022, 1970, 1645455723, dateTimeZone25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 1 + "'", int14 == 1);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime30);
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime9 = dateTime2.plusYears((int) (short) 0);
        org.joda.time.DateTime.Property property10 = dateTime2.year();
        org.joda.time.DateTime dateTime11 = property10.getDateTime();
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        int int13 = localDate12.getCenturyOfEra();
        org.joda.time.LocalDate localDate15 = localDate12.withCenturyOfEra(4);
        org.joda.time.LocalDate localDate17 = localDate15.withWeekyear((int) (short) 0);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter18 = null;
        java.lang.String str19 = localDate17.toString(dateTimeFormatter18);
        org.joda.time.LocalDate localDate21 = localDate17.minusMonths(0);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 100);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) '#', dateTimeZone24);
        int int27 = dateTimeZone24.getOffset((long) (short) 10);
        java.util.Locale locale31 = new java.util.Locale("", "hi!");
        java.util.Locale locale34 = new java.util.Locale("", "hi!");
        java.util.Set<java.lang.String> strSet35 = locale34.getUnicodeLocaleKeys();
        java.lang.String str36 = locale34.getVariant();
        java.lang.String str37 = locale31.getDisplayScript(locale34);
        java.lang.String str38 = dateTimeZone24.getShortName((long) 20, locale34);
        org.joda.time.DateTime dateTime39 = localDate17.toDateTimeAtMidnight(dateTimeZone24);
        org.joda.time.DateTime dateTime40 = dateTime11.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime dateTime42 = dateTime40.minusYears(0);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(100L, chronology44);
        java.util.Locale locale46 = null;
        java.util.Calendar calendar47 = dateTime45.toCalendar(locale46);
        calendar47.clear(9);
        calendar47.set((int) (byte) 1, 1, (-1));
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime(100L, chronology55);
        org.joda.time.Chronology chronology58 = null;
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime(100L, chronology58);
        boolean boolean60 = dateTime56.isAfter((org.joda.time.ReadableInstant) dateTime59);
        int int61 = dateTime56.getDayOfYear();
        org.joda.time.DateTime dateTime64 = dateTime56.withDurationAdded((long) (short) 0, 100);
        int int65 = dateTime64.getWeekOfWeekyear();
        boolean boolean66 = calendar47.before((java.lang.Object) dateTime64);
        java.lang.String str67 = dateTime64.toString();
        org.joda.time.DateTime dateTime69 = dateTime64.plusMinutes(53);
        org.joda.time.DateTime dateTime71 = dateTime69.plusWeeks(422);
        boolean boolean72 = dateTime40.isAfter((org.joda.time.ReadableInstant) dateTime71);
        int int73 = dateTime71.getSecondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime75 = dateTime71.withMinuteOfHour(1100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(dateTime11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 20 + "'", int13 == 20);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate17);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "0000-02-21" + "'", str19, "0000-02-21");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 360000000 + "'", int27 == 360000000);
        org.junit.Assert.assertEquals(locale31.toString(), "_HI!");
        org.junit.Assert.assertEquals(locale34.toString(), "_HI!");
        org.junit.Assert.assertNotNull(strSet35);
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "" + "'", str36, "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+100:00" + "'", str38, "+100:00");
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(calendar47);
        org.junit.Assert.assertEquals(calendar47.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=1,MONTH=1,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=-1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=?,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean60 + "' != '" + false + "'", boolean60 == false);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 1 + "'", int61 == 1);
        org.junit.Assert.assertNotNull(dateTime64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 1 + "'", int65 == 1);
        org.junit.Assert.assertTrue("'" + boolean66 + "' != '" + false + "'", boolean66 == false);
        org.junit.Assert.assertEquals("'" + str67 + "' != '" + "1970-01-01T00:00:00.100Z" + "'", str67, "1970-01-01T00:00:00.100Z");
        org.junit.Assert.assertNotNull(dateTime69);
        org.junit.Assert.assertNotNull(dateTime71);
        org.junit.Assert.assertTrue("'" + boolean72 + "' != '" + false + "'", boolean72 == false);
        org.junit.Assert.assertTrue("'" + int73 + "' != '" + 0 + "'", int73 == 0);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime(100L, chronology1);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(100L, chronology4);
        boolean boolean6 = dateTime2.isAfter((org.joda.time.ReadableInstant) dateTime5);
        int int7 = dateTime2.getDayOfYear();
        org.joda.time.DateTime dateTime10 = dateTime2.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime12 = dateTime10.plusSeconds(1);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(100L, chronology14);
        org.joda.time.DateTime dateTime17 = dateTime15.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.DateTime dateTime19 = dateTime17.withZoneRetainFields(dateTimeZone18);
        org.joda.time.DateTime dateTime21 = dateTime17.plus((long) 'a');
        org.joda.time.DateTime dateTime23 = dateTime17.plusWeeks(11);
        org.joda.time.DateTime dateTime25 = dateTime23.withMillis((long) 8);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property29 = localTime28.hourOfDay();
        org.joda.time.LocalTime localTime31 = localTime28.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology32 = localTime31.getChronology();
        org.joda.time.DateTime dateTime33 = dateTime25.toDateTime(chronology32);
        org.joda.time.DateTime dateTime34 = dateTime12.withChronology(chronology32);
        org.joda.time.Chronology chronology36 = null;
        org.joda.time.DateTime dateTime37 = new org.joda.time.DateTime(100L, chronology36);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime(100L, chronology39);
        boolean boolean41 = dateTime37.isAfter((org.joda.time.ReadableInstant) dateTime40);
        int int42 = dateTime37.getDayOfYear();
        org.joda.time.DateTime dateTime45 = dateTime37.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime47 = dateTime37.minus((long) (byte) 10);
        org.joda.time.LocalTime localTime50 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property51 = localTime50.hourOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.forOffsetHours((int) (short) 0);
        org.joda.time.DateTime dateTime54 = localTime50.toDateTimeToday(dateTimeZone53);
        org.joda.time.DateTimeZone dateTimeZone55 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime56 = org.joda.time.DateTime.now(dateTimeZone55);
        int int57 = dateTimeZone53.getOffset((org.joda.time.ReadableInstant) dateTime56);
        org.joda.time.MutableDateTime mutableDateTime58 = dateTime47.toMutableDateTime(dateTimeZone53);
        org.joda.time.DateTime dateTime59 = dateTime34.toDateTime(dateTimeZone53);
        org.joda.time.DateTime.Property property60 = dateTime34.dayOfWeek();
        long long61 = dateTime34.getMillis();
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + false + "'", boolean41 == false);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 1 + "'", int42 == 1);
        org.junit.Assert.assertNotNull(dateTime45);
        org.junit.Assert.assertNotNull(dateTime47);
        org.junit.Assert.assertNotNull(property51);
        org.junit.Assert.assertNotNull(dateTimeZone53);
        org.junit.Assert.assertNotNull(dateTime54);
        org.junit.Assert.assertNotNull(dateTimeZone55);
        org.junit.Assert.assertNotNull(dateTime56);
        org.junit.Assert.assertTrue("'" + int57 + "' != '" + 0 + "'", int57 == 0);
        org.junit.Assert.assertNotNull(mutableDateTime58);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertTrue("'" + long61 + "' != '" + 1100L + "'", long61 == 1100L);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime(100L, chronology7);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(100L, chronology10);
        boolean boolean12 = dateTime8.isAfter((org.joda.time.ReadableInstant) dateTime11);
        int int13 = dateTime8.getDayOfYear();
        org.joda.time.DateTime dateTime16 = dateTime8.withDurationAdded((long) (short) 0, 100);
        org.joda.time.DateTime dateTime18 = dateTime16.plusSeconds(1);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(100L, chronology20);
        org.joda.time.DateTime dateTime23 = dateTime21.plusHours(0);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = dateTime23.withZoneRetainFields(dateTimeZone24);
        org.joda.time.DateTime dateTime27 = dateTime23.plus((long) 'a');
        org.joda.time.DateTime dateTime29 = dateTime23.plusWeeks(11);
        org.joda.time.DateTime dateTime31 = dateTime29.withMillis((long) 8);
        org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime(9, 3);
        org.joda.time.LocalTime.Property property35 = localTime34.hourOfDay();
        org.joda.time.LocalTime localTime37 = localTime34.withMillisOfSecond((int) (byte) 10);
        org.joda.time.Chronology chronology38 = localTime37.getChronology();
        org.joda.time.DateTime dateTime39 = dateTime31.toDateTime(chronology38);
        org.joda.time.DateTime dateTime40 = dateTime18.withChronology(chronology38);
        org.joda.time.DateTimeField dateTimeField41 = chronology38.weekyear();
        org.joda.time.DateTimeField dateTimeField42 = chronology38.clockhourOfDay();
        org.joda.time.Chronology chronology43 = chronology38.withUTC();
        org.joda.time.Chronology chronology44 = chronology38.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime45 = new org.joda.time.DateTime(7, 0, 32400000, 14, 32580010, 24, chronology38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32580010 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 1 + "'", int13 == 1);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(property35);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTime39);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(chronology44);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Property[minuteOfDay]", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=property[minuteofday]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(3, 1645455737, 15, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1645455737 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }
}
