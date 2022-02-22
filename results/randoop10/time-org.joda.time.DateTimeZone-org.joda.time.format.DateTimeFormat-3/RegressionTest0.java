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
        org.joda.time.Chronology chronology3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate((int) (byte) 1, (int) '#', (int) (short) 1, chronology3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00002");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
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
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.Object obj1 = locale0.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(obj1);
        org.junit.Assert.assertEquals(obj1.toString(), "ko_KR");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "ko_KR");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "ko_KR");
    }

    @Test
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        long long6 = java.util.Date.UTC((int) '4', (int) '4', 0, (int) ' ', (int) (byte) -1, 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-431366460000L) + "'", long6 == (-431366460000L));
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
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalTime localTime3 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = localDate0.toLocalDateTime(localTime3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The time must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.Chronology chronology5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) '#', 1, 0, 32772, (int) (short) 100, chronology5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        java.util.Locale locale1 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str2 = locale1.toString();
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDate4.getValue((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.clear(21);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 21");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455688489,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=28,MILLISECOND=489,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
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
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = localDate0.toString("ko-KR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: o");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = localDate2.toInterval(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate2.plusMonths(0);
        org.joda.time.LocalDate.Property property7 = localDate6.year();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        long long15 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 10);
        org.joda.time.DateMidnight dateMidnight16 = localDate6.toDateMidnight(dateTimeZone10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((java.lang.Object) "years", dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"years\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertNotNull(dateMidnight16);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((int) (short) 10, 12, (int) (short) 0, 2922789, 19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = locale0.getExtension('#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed extension key: #");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko-KR" + "'", str1, "ko-KR");
    }

    @Test
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.ReadablePeriod readablePeriod4 = null;
        org.joda.time.DateTime dateTime5 = dateTime1.plus(readablePeriod4);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        org.joda.time.tz.Provider provider0 = null;
        org.joda.time.DateTimeZone.setProvider(provider0);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.util.Locale locale5 = java.util.Locale.KOREA;
        java.lang.String str6 = locale4.getDisplayScript(locale5);
        java.util.Set<java.lang.String> strSet7 = locale4.getUnicodeLocaleKeys();
        java.lang.String str8 = timeZone1.getDisplayName(true, 1, locale4);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(strSet7);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc" + "'", str8, "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.setWeekDate(5, 100, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455690055,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=30,MILLISECOND=55,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(2, 13, 0, (int) (byte) 10, 8, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = new org.joda.time.DateTime(32772, 13, (int) (byte) 0, (int) (byte) 10, (int) (short) 100, (int) '#', chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = localDate6.toInterval(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate6.withYearOfEra((int) (byte) 100);
        int[] intArray14 = new int[] { (byte) 100, 2 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray16 = dateTimeField5.add((org.joda.time.ReadablePartial) localDate6, 0, intArray14, 2);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[102, 2]");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime1.setZone(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfHour(2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withDate((int) (short) 0, (int) (short) 10, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455690418,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=30,MILLISECOND=418,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField(chronology10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((int) (short) -1, (-1), (int) (short) 1, (int) (short) 100, (int) (byte) -1, 8, 13, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime6 = dateTime1.withDurationAdded((long) 10, 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime6.withHourOfDay(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(2, 21, 12, 19, (int) 'a', 0, 54089980);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        java.lang.String str7 = dateTimeField5.getAsShortText(10L);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate10 = localDate8.withWeekyear(3);
        int[] intArray16 = new int[] { (short) -1, 32772, (byte) 1, 12 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray18 = dateTimeField5.add((org.joda.time.ReadablePartial) localDate10, 2922789, intArray16, 5);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2922789");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(intArray16);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray16), "[-1, 32772, 1, 12]");
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = property2.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
        java.util.Date date0 = new java.util.Date();
        java.util.Date date1 = new java.util.Date();
        int int2 = date1.getDay();
        int int3 = date0.compareTo(date1);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 15:01:30 UTC 2022");
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Mon Feb 21 15:01:30 UTC 2022");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 1 + "'", int2 == 1);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
    }

    @Test
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.lang.StringBuffer stringBuffer1 = null;
        org.joda.time.Instant instant3 = new org.joda.time.Instant((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer1, (org.joda.time.ReadableInstant) instant3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        int int0 = java.util.Calendar.APRIL;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withYearOfEra((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType5.getField(chronology8);
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDate0.get(dateTimeFieldType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfHour' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDate0.getFieldType(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 100");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(32772, (int) (byte) -1, 2, (int) (byte) -1, 15, 3);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusMinutes((int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withEra(19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455691336,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=31,MILLISECOND=336,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone8);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime((java.lang.Object) dateTimeField5, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDateTimeField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property4 = localDate3.centuryOfEra();
        java.lang.String str5 = property4.getName();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate9 = property4.setCopy("ko-KR", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"ko-KR\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "centuryOfEra" + "'", str5, "centuryOfEra");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet8);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = localDateTime3.toString("ISOChronology[UTC]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: I");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455691466,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=31,MILLISECOND=466,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra(54089980);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54089980 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        int int6 = dateTimeField4.getLeapAmount((long) 32772);
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
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
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((java.lang.Object) dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        java.util.Date date2 = calendar0.getTime();
        java.util.Calendar calendar3 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.fromCalendarFields(calendar3);
        boolean boolean5 = calendar3.isWeekDateSupported();
        calendar3.setFirstDayOfWeek(5);
        int int8 = calendar0.compareTo(calendar3);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455692251,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=32,MILLISECOND=251,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 15:01:32 UTC 2022");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455692251,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=5,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=32,MILLISECOND=251,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.Interval interval4 = localDate3.toInterval();
        org.joda.time.Chronology chronology5 = localDate3.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            long long13 = chronology5.getDateTimeMillis(1, 100, 21, (int) (byte) -1, 12, (int) (byte) 10, 32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime1.setZone(dateTimeZone8);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType10.getField(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfDay();
        org.joda.time.DurationField durationField17 = dateTimeField16.getLeapDurationField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setRounding(dateTimeField16, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNull(durationField17);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        int int3 = timeZone1.getOffset((long) 19);
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.lang.String str7 = locale6.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str8 = timeZone1.getDisplayName(true, 19, locale6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 19");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "ko-KR" + "'", str7, "ko-KR");
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        java.util.Date date0 = new java.util.Date();
        int int1 = date0.getDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology5 = localTime4.getChronology();
        org.joda.time.DateTimeField dateTimeField6 = dateTimeFieldType2.getField(chronology5);
        org.joda.time.DateTimeField dateTimeField7 = chronology5.secondOfDay();
        java.lang.String str9 = dateTimeField7.getAsShortText(10L);
        org.joda.time.DurationField durationField10 = dateTimeField7.getDurationField();
        boolean boolean11 = date0.equals((java.lang.Object) dateTimeField7);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 15:01:32 UTC 2022");
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 1 + "'", int1 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "0" + "'", str9, "0");
        org.junit.Assert.assertNotNull(durationField10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int) (short) 0, 32772, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"hi!\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter0.getPrinter();
        java.io.Writer writer4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.millisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        long long20 = dateTimeZone15.getMillisKeepLocal(dateTimeZone18, (long) 10);
        java.lang.String str21 = dateTimeZone15.toString();
        java.util.Locale locale22 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.lang.String str26 = locale24.getDisplayScript(locale25);
        java.lang.String str27 = locale22.getDisplayScript(locale25);
        java.util.Locale locale28 = java.util.Locale.UK;
        java.lang.String str29 = locale22.getDisplayScript(locale28);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter3.printTo(writer4, (long) 54092146, chronology9, 12, dateTimeZone15, locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 10L + "'", long20 == 10L);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "Etc/UTC" + "'", str21, "Etc/UTC");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.Chronology chronology0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.now(chronology0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Chronology must not be null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        java.util.Locale locale1 = java.util.Locale.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.joda.time.format.DateTimeFormat.patternForStyle("hi!", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: hi!");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_US");
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("years");
        boolean boolean4 = timeZone3.observesDaylightTime();
        boolean boolean5 = timeZone1.hasSameRules(timeZone3);
        // The following exception was thrown during execution in test generation
        try {
            int int12 = timeZone3.getOffset(0, 20, (int) (byte) 10, 2, 19, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = dateTimeFormatter0.parseLocalDateTime("0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"0\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        java.util.Locale locale4 = java.util.Locale.JAPANESE;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = timeZone1.getDisplayName(false, (int) (short) 100, locale4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 100");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            long long15 = chronology7.getDateTimeMillis((long) (short) 1, (int) 'a', 2922789, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        boolean boolean4 = mutableDateTime1.isAfterNow();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDateTime(2922789, 54092654, 2, 54089980, (int) (short) 1, (int) '4', 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54089980 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        char char0 = java.util.Locale.PRIVATE_USE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'x' + "'", char0 == 'x');
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("\ub300\ud55c\ubbfc\uad6d");
        java.io.Writer writer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter1.printTo(writer2, (long) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (-1));
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate1.minus(readablePeriod2);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType5.getField(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.secondOfMinute();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.years();
        java.lang.String str14 = durationFieldType13.toString();
        boolean boolean15 = localTime12.isSupported(durationFieldType13);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime18 = localTime12.withFieldAdded(durationFieldType16, 32772);
        org.joda.time.LocalTime.Property property19 = localTime12.hourOfDay();
        org.joda.time.LocalTime localTime21 = localTime12.minusMinutes(2922789);
        java.util.Locale locale23 = java.util.Locale.UK;
        java.util.Locale locale24 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet25 = locale24.getExtensionKeys();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.lang.String str28 = locale26.getDisplayScript(locale27);
        java.lang.String str29 = locale24.getDisplayScript(locale27);
        java.util.Locale locale30 = java.util.Locale.UK;
        java.lang.String str31 = locale24.getDisplayScript(locale30);
        java.lang.String str32 = locale23.getDisplayLanguage(locale30);
        java.lang.String str33 = dateTimeField10.getAsText((org.joda.time.ReadablePartial) localTime21, (int) ' ', locale23);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str34 = localDate1.toString("KOR", locale23);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: O");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "years" + "'", str14, "years");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "English" + "'", str32, "English");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "32" + "'", str33, "32");
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        mutableDateTime1.addDays(19);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setHourOfDay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((int) '#', 19, 2922789, 0, (-1), 0, 3, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.secondOfMinute();
        int int9 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime4, "halfdays", 0);
        java.io.Writer writer10 = null;
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) (-1));
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        org.joda.time.LocalDate localDate14 = localDate12.minus(readablePeriod13);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(writer10, (org.joda.time.ReadablePartial) localDate12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
        org.junit.Assert.assertNotNull(localDate14);
    }

    @Test
    public void test00089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00089");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean11 = localTime9.equals((java.lang.Object) dateTimeFieldType10);
        org.joda.time.LocalTime.Property property12 = localTime1.property(dateTimeFieldType10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = property12.setCopy("June 21, 0130 3:01:33 PM ");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"June 21, 0130 3:01:33 PM \" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.secondOfMinute();
        java.util.Locale locale5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = property3.set("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc", locale5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"???????? ???????\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        java.lang.String str4 = durationFieldType3.toString();
        boolean boolean5 = localTime2.isSupported(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType6, 32772);
        java.lang.String str9 = durationFieldType6.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType10.getField(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfDay();
        boolean boolean17 = durationFieldType6.isSupported(chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) (-1.0d), chronology13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "years" + "'", str4, "years");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "halfdays" + "'", str9, "halfdays");
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        java.util.Date date2 = calendar0.getTime();
        int int3 = calendar0.getMinimalDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = calendar0.getGreatestMinimum(20);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 20");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455694511,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=34,MILLISECOND=511,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 15:01:34 UTC 2022");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.lang.String str3 = locale0.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale0.getUnicodeLocaleType("halfdays");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: halfdays");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("United Kingdom");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"United Kingdom\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime1.setZone(dateTimeZone8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.lang.String str14 = locale11.getDisplayScript();
        java.lang.String str15 = dateTimeZone8.getShortName((long) 13, locale11);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusSeconds(0);
        boolean boolean22 = dateTimeZone8.isLocalDateTimeGap(localDateTime19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime19.withMonthOfYear((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645455694792,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=34,MILLISECOND=792,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        // The following exception was thrown during execution in test generation
        try {
            strSet0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.lang.String str13 = localDateTime9.toString(dateTimeFormatter12);
        java.lang.Appendable appendable14 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.years();
        java.lang.String str18 = durationFieldType17.toString();
        boolean boolean19 = localTime16.isSupported(durationFieldType17);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime22 = localTime16.withFieldAdded(durationFieldType20, 32772);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(appendable14, (org.joda.time.ReadablePartial) localTime16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455694947,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=34,MILLISECOND=947,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3:01 PM" + "'", str11, "3:01 PM");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "June 21, 0130 3:01:34 PM " + "'", str13, "June 21, 0130 3:01:34 PM ");
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "years" + "'", str18, "years");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(localTime22);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(0);
        int int6 = localDateTime5.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withFieldAdded(durationFieldType8, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime5.withMillisOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455695025,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=35,MILLISECOND=25,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 54095025 + "'", int6 == 54095025);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        int int10 = dateTimeZone8.getStandardOffset(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((int) (byte) 10, 32772, 10, 12, 2022, (int) '#', dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
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
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.lang.String str13 = localDateTime9.toString(dateTimeFormatter12);
        java.lang.StringBuffer stringBuffer14 = null;
        org.joda.time.LocalTime localTime16 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.years();
        java.lang.String str18 = durationFieldType17.toString();
        boolean boolean19 = localTime16.isSupported(durationFieldType17);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime22 = localTime16.withFieldAdded(durationFieldType20, 32772);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        boolean boolean26 = mutableDateTime24.isAfter((long) 21);
        boolean boolean28 = mutableDateTime24.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(dateTimeZone29);
        org.joda.time.DateTimeZone dateTimeZone31 = mutableDateTime30.getZone();
        mutableDateTime24.setZone(dateTimeZone31);
        org.joda.time.DateTime dateTime33 = localTime16.toDateTimeToday(dateTimeZone31);
        org.joda.time.DateTimeZone dateTimeZone34 = null;
        org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(dateTimeZone34);
        org.joda.time.DateTimeZone dateTimeZone36 = mutableDateTime35.getZone();
        org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone36);
        int int39 = dateTimeZone36.getOffsetFromLocal((long) (byte) -1);
        org.joda.time.DateTime dateTime40 = localTime16.toDateTimeToday(dateTimeZone36);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter12.printTo(stringBuffer14, (org.joda.time.ReadableInstant) dateTime40);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455695206,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=35,MILLISECOND=206,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "3:01 PM" + "'", str11, "3:01 PM");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "June 21, 0130 3:01:35 PM " + "'", str13, "June 21, 0130 3:01:35 PM ");
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "years" + "'", str18, "years");
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(dateTimeZone31);
        org.junit.Assert.assertNotNull(dateTime33);
        org.junit.Assert.assertNotNull(dateTimeZone36);
        org.junit.Assert.assertNotNull(dateTime37);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(dateTime40);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime(21, (int) (short) 100, 2922789, 0, (int) (short) 0, 12, 52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = dateTimeFormatter0.parseLocalDateTime("halfdays");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"halfdays\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear(13);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter1.getParser();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.parse("2022-02-21T15:01:34.312Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T15:01:34.312Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeParser4);
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        int int10 = dateTimeZone8.getStandardOffset(0L);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((int) '#', (int) 'u', 0, (int) (short) 100, (int) (short) 100, (int) (short) 10, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime11 = property8.addCopy(19);
        java.util.Locale locale13 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale15.getDisplayScript(locale16);
        java.lang.String str18 = locale13.getDisplayScript(locale16);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.lang.String str20 = locale13.getDisplayScript(locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = property8.setCopy("Korean", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Korean\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.years();
        java.lang.String str8 = durationFieldType7.toString();
        boolean boolean9 = localTime6.isSupported(durationFieldType7);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime12 = localTime6.withFieldAdded(durationFieldType10, 32772);
        org.joda.time.LocalTime.Property property13 = localTime6.hourOfDay();
        org.joda.time.LocalTime localTime15 = localTime6.minusMinutes(19);
        org.joda.time.Chronology chronology16 = localTime6.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((int) 'x', 13, 54092146, 4, 9, chronology16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "years" + "'", str8, "years");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(chronology16);
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        java.util.Date date0 = new java.util.Date();
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromDateFields(date0);
        java.util.Date date7 = new java.util.Date(100, 4, 6, 0, 21);
        java.util.Date date8 = new java.util.Date();
        boolean boolean9 = date7.before(date8);
        int int10 = date7.getTimezoneOffset();
        int int11 = date0.compareTo(date7);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 15:01:36 UTC 2022");
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertEquals(date7.toString(), "Sat May 06 00:21:00 UTC 2000");
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Mon Feb 21 15:01:36 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        long long10 = dateTimeZone8.previousTransition((-431366460000L));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(15, 2, (int) (byte) 1, (int) ' ', 100, 14, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + (-431366460000L) + "'", long10 == (-431366460000L));
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long14 = chronology3.getDateTimeMillis((int) (byte) -1, (int) (byte) 100, (int) '#', 54092654, (int) ' ', (int) 'a', 20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54092654 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTime dateTime9 = dateTime1.toDateTime(chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime1.withWeekOfWeekyear(54092654);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54092654 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(54092654, (int) '4', 12, 54092146, 1, 2922789, 32772, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54092146 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime5.secondOfMinute();
        int int10 = dateTimeFormatter3.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime5, "halfdays", 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime11 = org.joda.time.MutableDateTime.parse("2022-02-21T15:01:32.747Z", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T15:01:32.747Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
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
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        long long13 = dateTimeZone8.getMillisKeepLocal(dateTimeZone11, (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((int) 'u', (int) '4', 7, (int) (byte) 100, (int) 'u', 15, dateTimeZone8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((int) (byte) 10, 13, (int) (byte) 10, (int) (short) 10, (int) (byte) -1, 9, 3, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime4 = dateTimeFormatter2.parseMutableDateTime("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getActualMaximum(13);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add((int) ' ', 15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455696621,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=36,MILLISECOND=621,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField4 = localDate0.getField((int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 120");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("ko-KR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime5 = mutableDateTime1.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setSecondOfDay((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(mutableDateTime5);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(20, 0, 2022, 4, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        int int0 = java.util.Calendar.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        java.util.Date date2 = calendar0.getTime();
        boolean boolean4 = calendar0.equals((java.lang.Object) "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455697063,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=37,MILLISECOND=63,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 15:01:37 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withTime(0, (int) (short) 10, 0, 54092654);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54092654 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455697117,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=37,MILLISECOND=117,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean11 = localTime9.equals((java.lang.Object) dateTimeFieldType10);
        org.joda.time.LocalTime.Property property12 = localTime1.property(dateTimeFieldType10);
        org.joda.time.LocalTime localTime13 = property12.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = property12.addNoWrapToCopy((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The addition exceeded the boundaries of LocalTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter0.getPrinter();
        java.io.Writer writer4 = null;
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology8 = instant7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.eras();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        long long19 = dateTimeZone14.getMillisKeepLocal(dateTimeZone17, (long) 10);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(10L, dateTimeZone14);
        boolean boolean22 = dateTimeZone14.isStandardOffset((long) 2922789);
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(1L);
        int int25 = mutableDateTime24.getCenturyOfEra();
        java.util.Locale locale26 = java.util.Locale.getDefault();
        java.util.Calendar calendar27 = mutableDateTime24.toCalendar(locale26);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter3.printTo(writer4, (long) 2122, chronology8, 901, dateTimeZone14, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 19 + "'", int25 == 19);
        org.junit.Assert.assertNotNull(locale26);
// flaky:         org.junit.Assert.assertEquals(locale26.toString(), "en_GB");
        org.junit.Assert.assertNotNull(calendar27);
// flaky:         org.junit.Assert.assertEquals(calendar27.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        int int20 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDate localDate21 = dateTime19.toLocalDate();
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.Interval interval24 = localDate22.toInterval(dateTimeZone23);
        org.joda.time.LocalDate localDate26 = localDate22.plusMonths(0);
        org.joda.time.LocalDate.Property property27 = localDate26.year();
        org.joda.time.LocalDate localDate28 = property27.roundHalfEvenCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType29 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        boolean boolean30 = localDate28.isSupported(dateTimeFieldType29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate32 = localDate21.withField(dateTimeFieldType29, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'halfdayOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(interval24);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(dateTimeFieldType29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + false + "'", boolean30 == false);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime10 = localTime1.minusMinutes(19);
        org.joda.time.Chronology chronology11 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = chronology11.get(readablePeriod13, (long) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusHours((-1));
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withTime((int) (byte) 0, 4, 32772, 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455697650,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=37,MILLISECOND=650,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withPeriodAdded(readablePeriod5, (int) (short) 100);
        int int8 = localDateTime3.size();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str10 = localDateTime3.toString("Etc/UTC");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455697813,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=37,MILLISECOND=813,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = dateTimeFormatter0.parseLocalTime("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"centuryOfEra\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.setFirstDayOfWeek(5);
        calendar0.setTimeInMillis((long) 4);
        java.util.Locale locale9 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap10 = calendar0.getDisplayNames(52, 32772, locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=4,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=5,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=4,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime1.setZone(dateTimeZone8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.lang.String str14 = locale11.getDisplayScript();
        java.lang.String str15 = dateTimeZone8.getShortName((long) 13, locale11);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusSeconds(0);
        boolean boolean22 = dateTimeZone8.isLocalDateTimeGap(localDateTime19);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plus(readablePeriod23);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime26 = localDateTime19.withSecondOfMinute(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645455697900,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=37,MILLISECOND=900,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale0.getDisplayCountry(locale2);
        java.lang.String str4 = locale2.getISO3Country();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        boolean boolean8 = locale2.equals((java.lang.Object) dateTimeZone7);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko-KR" + "'", str1, "ko-KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str3, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "KOR" + "'", str4, "KOR");
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = dateTimeFormatter0.parseLocalDateTime("monthOfYear");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"monthOfYear\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        long long13 = dateTimeZone8.getMillisKeepLocal(dateTimeZone11, (long) 10);
        java.lang.String str14 = dateTimeZone11.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime(0, (int) (byte) 1, 2, 2022, 4, 52, dateTimeZone11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 10L + "'", long13 == 10L);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "Etc/UTC" + "'", str14, "Etc/UTC");
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(21, 2022, 54089980, (int) ' ', 13, 5, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime4.setMinuteOfHour((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(mutableDateTime4);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        int int8 = dateTimeField5.getDifference(1645455690671L, (long) (short) 100);
        long long10 = dateTimeField5.remainder((long) (short) 0);
        java.util.Locale locale13 = java.util.Locale.FRENCH;
        // The following exception was thrown during execution in test generation
        try {
            long long14 = dateTimeField5.set((long) 19, "English", locale13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"English\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1645455690 + "'", int8 == 1645455690);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 0L + "'", long10 == 0L);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "fr");
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter0.getPrinter();
        java.lang.StringBuffer stringBuffer4 = null;
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfMinute();
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        org.joda.time.DateTimeZone dateTimeZone15 = mutableDateTime14.getZone();
        org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone15);
        long long20 = dateTimeZone15.convertLocalToUTC((long) 0, true, (long) 32772);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology24 = localTime23.getChronology();
        org.joda.time.DateTimeField dateTimeField25 = dateTimeFieldType21.getField(chronology24);
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.lang.String str28 = locale26.getDisplayScript(locale27);
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.lang.String str30 = locale29.toLanguageTag();
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale29.getDisplayCountry(locale31);
        java.lang.String str33 = locale27.getDisplayCountry(locale29);
        int int34 = dateTimeField25.getMaximumTextLength(locale27);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter3.printTo(stringBuffer4, (long) (byte) -1, chronology9, (int) '#', dateTimeZone15, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimePrinter3);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 0L + "'", long20 == 0L);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ko-KR" + "'", str30, "ko-KR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str32, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str33, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2 + "'", int34 == 2);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        calendar0.set(13, (int) (byte) -1, 2);
        boolean boolean6 = calendar0.isLenient();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=13,MONTH=-1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=2,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=38,MILLISECOND=729,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long) 6);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("years");
        boolean boolean4 = timeZone3.observesDaylightTime();
        boolean boolean5 = timeZone1.hasSameRules(timeZone3);
        java.lang.Object obj6 = timeZone3.clone();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertEquals(obj6.toString(), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj6), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj6), "sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null]");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale6.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = property4.setCopy("1970-01-01T15:01:38.774Z", locale6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T15:01:38.774Z\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455698992,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=38,MILLISECOND=992,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property4 = localDate3.centuryOfEra();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.LocalDate localDate6 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtMidnight();
        java.util.Calendar calendar8 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.fromCalendarFields(calendar8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property12 = localDateTime11.hourOfDay();
        org.joda.time.LocalDateTime localDateTime13 = property12.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = localDate6.isEqual((org.joda.time.ReadablePartial) localDateTime13);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2922789 + "'", int5 == 2922789);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime7);
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=1645455699006,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=39,MILLISECOND=6,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        java.lang.String str7 = dateTimeField5.getAsShortText(10L);
        org.joda.time.DurationField durationField8 = dateTimeField5.getDurationField();
        boolean boolean9 = dateTimeField5.isLenient();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        int int11 = localDate10.getDayOfMonth();
        org.joda.time.LocalDate localDate13 = localDate10.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime14 = localDate10.toDateTimeAtStartOfDay();
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(1L);
        int int17 = mutableDateTime16.getCenturyOfEra();
        java.util.Locale locale18 = java.util.Locale.getDefault();
        java.util.Calendar calendar19 = mutableDateTime16.toCalendar(locale18);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = dateTimeField5.getAsText((org.joda.time.ReadablePartial) localDate10, locale18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'secondOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "0" + "'", str7, "0");
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 19 + "'", int17 == 19);
        org.junit.Assert.assertNotNull(locale18);
// flaky:         org.junit.Assert.assertEquals(locale18.toString(), "en_GB");
        org.junit.Assert.assertNotNull(calendar19);
// flaky:         org.junit.Assert.assertEquals(calendar19.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.LocalDate localDate0 = new org.joda.time.LocalDate();
        org.joda.time.LocalDate.Property property1 = localDate0.weekyear();
        org.joda.time.LocalDate localDate2 = property1.roundCeilingCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = localDate2.withField(dateTimeFieldType3, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        java.lang.String str4 = mutableDateTime1.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int5 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = property6.set(54092654);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54092654 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc" + "'", str4, "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: centuryOfEra");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime10 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime11 = property8.roundHalfEvenCopy();
        java.util.Locale locale13 = java.util.Locale.KOREA;
        java.lang.String str14 = locale13.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str15 = localTime11.toString("", locale13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ko-KR" + "'", str14, "ko-KR");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField12 = chronology9.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime(3, 0, 52, 6, 0, 3, chronology9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("years");
        boolean boolean4 = timeZone3.observesDaylightTime();
        boolean boolean5 = timeZone1.hasSameRules(timeZone3);
        int int6 = timeZone1.getDSTSavings();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        boolean boolean9 = mutableDateTime7.isAfter((long) 21);
        boolean boolean11 = mutableDateTime7.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        mutableDateTime7.setZone(dateTimeZone14);
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = locale17.getDisplayScript(locale18);
        java.lang.String str20 = locale17.getDisplayScript();
        java.lang.String str21 = dateTimeZone14.getShortName((long) 13, locale17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(20, 54096794, 8, 4, 54092654, 8, dateTimeZone14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54092654 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime4 = property2.setCopy("15:01");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"15:01\" for weekOfWeekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra((int) '4');
        org.joda.time.LocalDate localDate4 = localDate2.minusDays(3);
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate.Property property6 = localDate2.property(dateTimeFieldType5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'minuteOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        long long8 = dateTimeField5.getDifferenceAsLong((long) (byte) 100, 0L);
        boolean boolean10 = dateTimeField5.isLeap((long) 9);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromCalendarFields(calendar11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) ' ');
        int int15 = localDateTime12.getMillisOfDay();
        int[] intArray19 = new int[] { (byte) 1, 54096794 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = dateTimeField5.addWrapField((org.joda.time.ReadablePartial) localDateTime12, 54096794, intArray19, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54096794");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645455700015,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=40,MILLISECOND=15,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
// flaky:         org.junit.Assert.assertTrue("'" + int15 + "' != '" + 54100015 + "'", int15 == 54100015);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[1, 54096794]");
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> strMap1 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList2 = java.util.Locale.LanguageRange.parse("Property[weekOfWeekyear]", strMap1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=property[weekofweekyear]");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((java.lang.Object) "+00:00", chronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.shortTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("9 Nov 2023 16:36:46 GMT", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"9 Nov 2023 16:36:46 GMT\" is malformed at \" Nov 2023 16:36:46 GMT\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("21 June 0130 15:01:38 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        int int4 = localDate3.getDayOfMonth();
        org.joda.time.LocalDate localDate6 = localDate3.plusYears((int) (byte) 100);
        org.joda.time.Interval interval7 = localDate6.toInterval();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        long long15 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 10);
        java.lang.String str16 = dateTimeZone10.toString();
        org.joda.time.DateTime dateTime17 = localDate6.toDateTimeAtMidnight(dateTimeZone10);
        org.joda.time.MutableDateTime mutableDateTime18 = mutableDateTime1.toMutableDateTime(dateTimeZone10);
        mutableDateTime1.addDays(0);
        mutableDateTime1.setDayOfYear(100);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfDay(54089980);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54089980 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(interval7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Etc/UTC" + "'", str16, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.util.Set<java.lang.String> strSet0 = java.util.Calendar.getAvailableCalendarTypes();
        java.util.Locale.LanguageRange[] languageRangeArray1 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList2 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean3 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList2, languageRangeArray1);
        java.lang.String[] strArray6 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList7 = new java.util.ArrayList<java.lang.String>();
        boolean boolean8 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList7, strArray6);
        java.lang.String str9 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strList7);
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.lang.String str12 = locale10.getDisplayScript(locale11);
        java.util.Set<java.lang.String> strSet13 = locale10.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode14 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList15 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList2, (java.util.Collection<java.lang.String>) strSet13, filteringMode14);
        java.util.Locale.LanguageRange[] languageRangeArray16 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList17 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean18 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17, languageRangeArray16);
        java.util.Locale.LanguageRange[] languageRangeArray19 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList20 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean21 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList20, languageRangeArray19);
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.util.Set<java.lang.String> strSet25 = locale22.getUnicodeLocaleKeys();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.lang.String str29 = locale26.getDisplayCountry(locale28);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale30.getDisplayScript(locale31);
        java.util.Locale[] localeArray33 = new java.util.Locale[] { locale22, locale28, locale31 };
        java.util.ArrayList<java.util.Locale> localeList34 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean35 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList34, localeArray33);
        java.util.Locale locale36 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.util.Locale>) localeList34);
        java.util.Locale locale37 = java.util.Locale.KOREA;
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.lang.String str39 = locale37.getDisplayScript(locale38);
        java.util.Set<java.lang.String> strSet40 = locale37.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet41 = locale37.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList42 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList20, (java.util.Collection<java.lang.String>) strSet41);
        java.util.Locale.FilteringMode filteringMode43 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList44 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList17, (java.util.Collection<java.lang.String>) strList42, filteringMode43);
        boolean boolean45 = strSet13.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17);
        boolean boolean46 = strSet0.containsAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList17);
        // The following exception was thrown during execution in test generation
        try {
            strSet0.clear();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: null");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(languageRangeArray1);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(strArray6);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(strSet13);
        org.junit.Assert.assertTrue("'" + filteringMode14 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode14.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList15);
        org.junit.Assert.assertNotNull(languageRangeArray16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(languageRangeArray19);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(strSet25);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ko-KR" + "'", str27, "ko-KR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str29, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(localeArray33);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNull(locale36);
        org.junit.Assert.assertNotNull(locale37);
        org.junit.Assert.assertEquals(locale37.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
        org.junit.Assert.assertNotNull(strSet40);
        org.junit.Assert.assertNotNull(strSet41);
        org.junit.Assert.assertNotNull(strList42);
        org.junit.Assert.assertTrue("'" + filteringMode43 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode43.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList44);
        org.junit.Assert.assertTrue("'" + boolean45 + "' != '" + false + "'", boolean45 == false);
        org.junit.Assert.assertTrue("'" + boolean46 + "' != '" + true + "'", boolean46 == true);
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(0);
        boolean boolean7 = localDateTime5.equals((java.lang.Object) (byte) 1);
        int int8 = localDateTime5.getMinuteOfHour();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455700330,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=40,MILLISECOND=330,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.era();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime4.add(readablePeriod6, (int) (byte) 100);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType10.getField(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfDay();
        org.joda.time.DurationField durationField17 = dateTimeField16.getLeapDurationField();
        int int18 = mutableDateTime4.get(dateTimeField16);
        long long21 = dateTimeField16.add((long) 14, 1645455690);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now();
        int int23 = localDate22.getDayOfMonth();
        org.joda.time.LocalDate localDate25 = localDate22.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property26 = localDate25.centuryOfEra();
        int int27 = property26.getMaximumValueOverall();
        org.joda.time.LocalDate localDate28 = property26.roundFloorCopy();
        java.util.Locale locale29 = java.util.Locale.ENGLISH;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str30 = dateTimeField16.getAsText((org.joda.time.ReadablePartial) localDate28, locale29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNull(durationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 5923640484000014L + "'", long21 == 5923640484000014L);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 21 + "'", int23 == 21);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2922789 + "'", int27 == 2922789);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en");
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        boolean boolean8 = dateTimeZone5.isFixed();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((java.lang.Object) dateTimeZone5, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime11 = localTime9.withMillisOfDay(20);
        org.joda.time.LocalTime localTime13 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType14 = org.joda.time.DurationFieldType.years();
        java.lang.String str15 = durationFieldType14.toString();
        boolean boolean16 = localTime13.isSupported(durationFieldType14);
        org.joda.time.DurationFieldType durationFieldType17 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime19 = localTime13.withFieldAdded(durationFieldType17, 32772);
        org.joda.time.LocalTime.Property property20 = localTime13.hourOfDay();
        org.joda.time.LocalTime localTime22 = localTime13.minusMinutes(19);
        org.joda.time.DateTimeFieldType dateTimeFieldType23 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType24 = dateTimeFieldType23.getRangeDurationType();
        boolean boolean25 = localTime13.isSupported(durationFieldType24);
        org.joda.time.LocalTime localTime27 = localTime9.withFieldAdded(durationFieldType24, 2122);
        int int28 = localTime27.getMinuteOfHour();
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(durationFieldType14);
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "years" + "'", str15, "years");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(durationFieldType17);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(dateTimeFieldType23);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 0 + "'", int28 == 0);
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withYearOfEra((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField6 = localDate4.getField(19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 19");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.getLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localTime9.get(dateTimeFieldType10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone9);
        long long14 = dateTimeZone9.convertLocalToUTC((long) 0, true, (long) 32772);
        int int16 = dateTimeZone9.getOffset((long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(54096794, 7, 2922789, 0, (int) '4', (int) (byte) 10, (int) (byte) 1, dateTimeZone9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 0L + "'", long14 == 0L);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter0.getPrinter();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate5 = dateTimeFormatter0.parseLocalDate("\ub300\ud55c\ubbfc\uad6d");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"???????????\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimePrinter3);
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.set(20, (int) (short) -1, (int) (byte) -1, 54092146, 3, 0);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.clear(19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=20,MONTH=-1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=-1,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=54092146,MINUTE=3,SECOND=0,MILLISECOND=703,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(0);
        int int6 = localDateTime5.getMillisOfDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType8 = dateTimeFieldType7.getRangeDurationType();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime5.withFieldAdded(durationFieldType8, (int) (byte) 1);
        org.joda.time.DateTime dateTime11 = localDateTime5.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((java.lang.Object) localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455700715,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=40,MILLISECOND=715,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 54100715 + "'", int6 == 54100715);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(5);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(1L);
        int int11 = mutableDateTime10.getCenturyOfEra();
        java.util.Locale locale12 = java.util.Locale.getDefault();
        java.util.Calendar calendar13 = mutableDateTime10.toCalendar(locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localDateTime5.toString("2022-02-21T15:01:40.004Z", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455700752,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=40,MILLISECOND=752,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 19 + "'", int11 == 19);
        org.junit.Assert.assertNotNull(locale12);
// flaky:         org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        java.lang.StringBuffer stringBuffer3 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(stringBuffer3, (long) 2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        long long12 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((int) '4', 52, 9, (-1), 0, dateTimeZone10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale1 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withLocale(locale1);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        boolean boolean6 = mutableDateTime4.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime7 = mutableDateTime4.toMutableDateTime();
        mutableDateTime4.addDays(19);
        java.lang.String str10 = dateTimeFormatter0.print((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int12 = mutableDateTime4.get(dateTimeFieldType11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + true + "'", boolean6 == true);
        org.junit.Assert.assertNotNull(mutableDateTime7);
// flaky:         org.junit.Assert.assertEquals("'" + str10 + "' != '" + "15:01" + "'", str10, "15:01");
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = dateTimeField5.getAsText(7, locale7);
        java.lang.String str10 = dateTimeField5.getAsText(35L);
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(1L);
        int int15 = mutableDateTime14.getCenturyOfEra();
        java.util.Locale locale16 = java.util.Locale.getDefault();
        java.util.Calendar calendar17 = mutableDateTime14.toCalendar(locale16);
        // The following exception was thrown during execution in test generation
        try {
            long long18 = dateTimeField5.set(1645455700681L, "eng", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"eng\" for secondOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7" + "'", str8, "7");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "0" + "'", str10, "0");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 19 + "'", int15 == 19);
        org.junit.Assert.assertNotNull(locale16);
// flaky:         org.junit.Assert.assertEquals(locale16.toString(), "en_GB");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=1,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        // The following exception was thrown during execution in test generation
        try {
            int int15 = calendar13.getActualMaximum(2122);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2122");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645455700931,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=40,MILLISECOND=931,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("Korean");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Korean\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale14.toLanguageTag();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale14.getDisplayCountry(locale16);
        java.lang.String str18 = locale12.getDisplayCountry(locale14);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        long long26 = dateTimeZone21.getMillisKeepLocal(dateTimeZone24, (long) 10);
        java.lang.String str27 = dateTimeZone21.toString();
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.lang.String str30 = locale29.toLanguageTag();
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale29.getDisplayCountry(locale31);
        java.lang.String str33 = dateTimeZone21.getName((long) 54089980, locale31);
        java.lang.String str34 = locale31.getDisplayLanguage();
        java.lang.String str35 = locale14.getDisplayName(locale31);
        java.lang.String str36 = timeZone10.getDisplayName(locale14);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Etc/UTC" + "'", str8, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ko-KR" + "'", str15, "ko-KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str17, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str18, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Etc/UTC" + "'", str27, "Etc/UTC");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "ko-KR" + "'", str30, "ko-KR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str32, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "+00:00" + "'", str33, "+00:00");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "Korean" + "'", str34, "Korean");
// flaky:         org.junit.Assert.assertEquals("'" + str35 + "' != '" + "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)" + "'", str35, "\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)");
// flaky:         org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\uc138\uacc4\ud45c\uc900\uc2dc" + "'", str36, "\uc138\uacc4\ud45c\uc900\uc2dc");
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = localDateTime9.withCenturyOfEra(54092654);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54092654 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455701232,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=41,MILLISECOND=232,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "15:01" + "'", str11, "15:01");
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.Instant instant2 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology3 = instant2.getChronology();
        org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.clockhourOfHalfday();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = chronology3.get(readablePeriod6, (long) 14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(localTime4);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
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
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minus(readablePeriod2);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime();
        org.joda.time.Instant instant5 = new org.joda.time.Instant();
        org.joda.time.Instant instant7 = instant5.withMillis((long) (short) 100);
        org.joda.time.Instant instant8 = instant7.toInstant();
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, 5);
        org.joda.time.DateTime dateTime12 = localTime4.toDateTime((org.joda.time.ReadableInstant) instant11);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = localDateTime3.compareTo((org.joda.time.ReadablePartial) localTime4);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455701348,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=41,MILLISECOND=348,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(instant7);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertNotNull(dateTime12);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime4.secondOfMinute();
        int int9 = dateTimeFormatter2.parseInto((org.joda.time.ReadWritableInstant) mutableDateTime4, "halfdays", 0);
        // The following exception was thrown during execution in test generation
        try {
            long long11 = dateTimeFormatter2.parseMillis("2022-02-21");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21\" is malformed at \"22-02-21\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + (-1) + "'", int9 == (-1));
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusMinutes((int) (byte) 1);
        java.lang.String str6 = localDateTime5.toString();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        long long15 = dateTimeZone10.getMillisKeepLocal(dateTimeZone13, (long) 10);
        java.lang.String str16 = dateTimeZone10.toString();
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = locale18.toLanguageTag();
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = locale18.getDisplayCountry(locale20);
        java.lang.String str22 = dateTimeZone10.getName((long) 54089980, locale20);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = localDateTime5.toString("21 June 0130 15:01:36 ", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455701378,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=41,MILLISECOND=378,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertEquals("'" + str6 + "' != '" + "2022-02-21T15:00:41.378" + "'", str6, "2022-02-21T15:00:41.378");
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 10L + "'", long15 == 10L);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "Etc/UTC" + "'", str16, "Etc/UTC");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "ko-KR" + "'", str19, "ko-KR");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str21, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "+00:00" + "'", str22, "+00:00");
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean3 = localTime1.equals((java.lang.Object) dateTimeFieldType2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType2.getField(chronology7);
        org.joda.time.LocalDate localDate12 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate14 = localDate12.withYearOfEra((int) '4');
        int int15 = localDate12.getEra();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        long long23 = dateTimeZone18.getMillisKeepLocal(dateTimeZone21, (long) 10);
        java.lang.String str24 = dateTimeZone18.toString();
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale26.toLanguageTag();
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.lang.String str29 = locale26.getDisplayCountry(locale28);
        java.lang.String str30 = dateTimeZone18.getName((long) 54089980, locale28);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str31 = dateTimeField11.getAsText((org.joda.time.ReadablePartial) localDate12, locale28);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 1 + "'", int15 == 1);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertTrue("'" + long23 + "' != '" + 10L + "'", long23 == 10L);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "Etc/UTC" + "'", str24, "Etc/UTC");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "ko-KR" + "'", str27, "ko-KR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str29, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "+00:00" + "'", str30, "+00:00");
    }

    @Test
    public void test00202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00202");
        int int0 = java.util.Calendar.TUESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00203");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusYears(14);
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property6.setCopy("3:01 PM");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"3:01 PM\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455701529,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=41,MILLISECOND=529,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime1.setZone(dateTimeZone8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.lang.String str14 = locale11.getDisplayScript();
        java.lang.String str15 = dateTimeZone8.getShortName((long) 13, locale11);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusSeconds(0);
        boolean boolean22 = dateTimeZone8.isLocalDateTimeGap(localDateTime19);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plus(readablePeriod23);
        java.util.Locale locale26 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str27 = localDateTime24.toString("2022-02-21T15:01:40.681Z", locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645455701540,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=41,MILLISECOND=540,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "de_DE");
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-02-21", 0.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=2022-02-21");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime10 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime11 = property8.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now();
        int int14 = localDate13.getDayOfMonth();
        org.joda.time.LocalDate localDate16 = localDate13.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property17 = localDate16.centuryOfEra();
        int int18 = property17.getMaximumValueOverall();
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Locale locale20 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet21 = locale20.getExtensionKeys();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.util.Locale locale23 = java.util.Locale.KOREA;
        java.lang.String str24 = locale22.getDisplayScript(locale23);
        java.lang.String str25 = locale20.getDisplayScript(locale23);
        java.util.Locale locale26 = java.util.Locale.UK;
        java.lang.String str27 = locale20.getDisplayScript(locale26);
        java.lang.String str28 = locale19.getDisplayLanguage(locale26);
        java.util.Locale.setDefault(locale19);
        int int30 = property17.getMaximumTextLength(locale19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime31 = property8.setCopy("centuryOfEra", locale19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"centuryOfEra\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 21 + "'", int14 == 21);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2922789 + "'", int18 == 2922789);
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet21);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale23);
        org.junit.Assert.assertEquals(locale23.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "English" + "'", str28, "English");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 7 + "'", int30 == 7);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        java.util.Locale locale7 = java.util.Locale.FRANCE;
        java.lang.String str8 = dateTimeField5.getAsText(7, locale7);
        java.util.Calendar calendar9 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.fromCalendarFields(calendar9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.era();
        org.joda.time.LocalDateTime localDateTime16 = property15.roundHalfFloorCopy();
        java.util.Calendar calendar18 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime19 = org.joda.time.LocalDateTime.fromCalendarFields(calendar18);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property22 = localDateTime21.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime21.withPeriodAdded(readablePeriod23, (int) (short) 100);
        int[] intArray26 = localDateTime25.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray28 = dateTimeField5.add((org.joda.time.ReadablePartial) localDateTime16, 5, intArray26, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 5");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "7" + "'", str8, "7");
        org.junit.Assert.assertNotNull(calendar9);
// flaky:         org.junit.Assert.assertEquals(calendar9.toString(), "java.util.GregorianCalendar[time=1645455701592,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=41,MILLISECOND=592,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(calendar18);
// flaky:         org.junit.Assert.assertEquals(calendar18.toString(), "java.util.GregorianCalendar[time=1645455701592,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=41,MILLISECOND=592,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(intArray26);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray26), "[2022, 10, 3, 54101592]");
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Locale locale1 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet2 = locale1.getExtensionKeys();
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.lang.String str6 = locale1.getDisplayScript(locale4);
        java.util.Locale locale7 = java.util.Locale.UK;
        java.lang.String str8 = locale1.getDisplayScript(locale7);
        java.lang.String str9 = locale0.getDisplayLanguage(locale7);
        java.lang.String str10 = locale0.getDisplayCountry();
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.years();
        java.lang.String str14 = durationFieldType13.toString();
        boolean boolean15 = localTime12.isSupported(durationFieldType13);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime18 = localTime12.withFieldAdded(durationFieldType16, 32772);
        org.joda.time.LocalTime.Property property19 = localTime12.hourOfDay();
        org.joda.time.LocalTime localTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalTime localTime21 = property19.roundCeilingCopy();
        org.joda.time.LocalTime localTime23 = localTime21.minusMillis(2022);
        boolean boolean24 = locale0.equals((java.lang.Object) localTime23);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "" + "'", str6, "");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "English" + "'", str9, "English");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "United Kingdom" + "'", str10, "United Kingdom");
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "years" + "'", str14, "years");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + false + "'", boolean24 == false);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = dateTime1.withHourOfDay(54098460);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54098460 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = timeZone1.getDisplayName(true, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 10");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645455701909,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=41,MILLISECOND=909,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone14);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property4 = localDate3.centuryOfEra();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.LocalDate localDate6 = property4.roundFloorCopy();
        org.joda.time.DateTime dateTime7 = localDate6.toDateTimeAtMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime7.withMonthOfYear(54096794);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54096794 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2922789 + "'", int5 == 2922789);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTime7);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        java.util.Locale locale12 = java.util.Locale.forLanguageTag("hi!");
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone10, locale12);
        java.lang.String str14 = calendar13.toString();
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Etc/UTC" + "'", str8, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645455702075,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=42,MILLISECOND=75,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals("'" + str14 + "' != '" + "java.util.GregorianCalendar[time=1645455702075,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=42,MILLISECOND=75,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str14, "java.util.GregorianCalendar[time=1645455702075,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=42,MILLISECOND=75,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) 14);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.Interval interval4 = localDate2.toInterval(dateTimeZone3);
        org.joda.time.LocalDate localDate6 = localDate2.plusMonths(0);
        org.joda.time.LocalDate.Property property7 = localDate6.weekOfWeekyear();
        java.lang.String str8 = property7.toString();
        org.joda.time.LocalDate localDate9 = property7.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        boolean boolean11 = localDate9.isSupported(dateTimeFieldType10);
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType10.getRangeDurationType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime14 = localTime1.withFieldAdded(durationFieldType12, 54100989);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Property[weekOfWeekyear]" + "'", str8, "Property[weekOfWeekyear]");
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertNotNull(durationFieldType12);
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate0.plus(readablePeriod2);
        int int4 = localDate3.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate3.withMonthOfYear(901);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 901 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
    }

    @Test
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale0.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.roll(1, true);
        calendar8.setTimeInMillis((long) 15);
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = locale14.getDisplayScript(locale15);
        java.util.Calendar calendar17 = java.util.Calendar.getInstance(locale14);
        int int18 = calendar8.compareTo(calendar17);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(calendar8);
        org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=15,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=15,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertNotNull(calendar17);
// flaky:         org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645455702210,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=42,MILLISECOND=210,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusYears(14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withMillisOfSecond(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455702245,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=42,MILLISECOND=245,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.Interval interval4 = localDate3.toInterval();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        long long12 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) 10);
        java.lang.String str13 = dateTimeZone7.toString();
        org.joda.time.DateTime dateTime14 = localDate3.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillisOfDay((int) (short) 10);
        int int17 = dateTime16.getYearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = dateTime16.withTime(16, 54100989, (int) (byte) 1, 5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54100989 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2122 + "'", int17 == 2122);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean3 = localTime1.equals((java.lang.Object) dateTimeFieldType2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType2.getField(chronology7);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) 10);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(10L, dateTimeZone16);
        org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long) (byte) 10, dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime24 = new org.joda.time.LocalTime((java.lang.Object) chronology7, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.forTimeZone(timeZone1);
        timeZone1.setRawOffset(0);
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        boolean boolean20 = mutableDateTime18.isAfter((long) 21);
        boolean boolean22 = mutableDateTime18.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        mutableDateTime18.setZone(dateTimeZone25);
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.lang.String str30 = locale28.getDisplayScript(locale29);
        java.lang.String str31 = locale28.getDisplayScript();
        java.lang.String str32 = dateTimeZone25.getShortName((long) 13, locale28);
        java.util.Calendar calendar33 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime34 = org.joda.time.LocalDateTime.fromCalendarFields(calendar33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime38 = localDateTime36.plusSeconds(0);
        boolean boolean39 = dateTimeZone25.isLocalDateTimeGap(localDateTime36);
        org.joda.time.ReadablePeriod readablePeriod40 = null;
        org.joda.time.LocalDateTime localDateTime41 = localDateTime36.plus(readablePeriod40);
        java.util.Date date42 = localDateTime41.toDate();
        boolean boolean43 = timeZone1.inDaylightTime(date42);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645455702349,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=42,MILLISECOND=349,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + true + "'", boolean20 == true);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "+00:00" + "'", str32, "+00:00");
        org.junit.Assert.assertNotNull(calendar33);
// flaky:         org.junit.Assert.assertEquals(calendar33.toString(), "java.util.GregorianCalendar[time=1645455702350,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=42,MILLISECOND=350,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime34);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(localDateTime38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + false + "'", boolean39 == false);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(date42);
// flaky:         org.junit.Assert.assertEquals(date42.toString(), "Mon Oct 03 15:01:42 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + false + "'", boolean43 == false);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minus(readablePeriod2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withYearOfCentury((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455702449,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=42,MILLISECOND=449,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.Instant instant3 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology4 = instant3.getChronology();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((java.lang.Object) (-1.0d), chronology4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(localTime5);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setSecondOfDay(1645455690);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1645455690 for secondOfDay must be in the range [0,86399]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        java.lang.String str4 = durationFieldType3.toString();
        boolean boolean5 = localTime2.isSupported(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType6, 32772);
        org.joda.time.LocalTime.Property property9 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime11 = localTime2.minusMinutes(19);
        org.joda.time.Chronology chronology12 = localTime2.getChronology();
        org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.now(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType0.getField(chronology12);
        // The following exception was thrown during execution in test generation
        try {
            long long20 = chronology12.getDateTimeMillis((-431366459990L), 2, 52, (int) (short) 100, 54100989);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "years" + "'", str4, "years");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(mutableDateTime13);
        org.junit.Assert.assertNotNull(dateTimeField14);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = property6.setCopy("3:01 PM");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"3:01 PM\" for era is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455702672,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=42,MILLISECOND=672,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusSeconds(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withDayOfMonth(2922789);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455702686,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=42,MILLISECOND=686,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "15:01" + "'", str11, "15:01");
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property4 = localDate3.centuryOfEra();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.LocalDate localDate6 = property4.roundFloorCopy();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 7);
        int int9 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime8.setMillisOfSecond(54100989);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54100989 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2922789 + "'", int5 == 2922789);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.halfdayOfDay();
        org.joda.time.DateTime dateTime18 = dateTime15.withField(dateTimeFieldType16, (int) (byte) 1);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        long long26 = dateTimeZone21.getMillisKeepLocal(dateTimeZone24, (long) 10);
        org.joda.time.MutableDateTime mutableDateTime27 = dateTime18.toMutableDateTime(dateTimeZone21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = dateTime18.withCenturyOfEra(54089980);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54089980 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertNotNull(mutableDateTime27);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        long long26 = dateTimeZone21.getMillisKeepLocal(dateTimeZone24, (long) 10);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime(10L, dateTimeZone21);
        long long29 = dateTimeZone21.nextTransition((long) 12);
        org.joda.time.DateTime dateTime30 = dateTime17.withZone(dateTimeZone21);
        java.lang.Class<?> wildcardClass31 = dateTime30.getClass();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertTrue("'" + long26 + "' != '" + 10L + "'", long26 == 10L);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 12L + "'", long29 == 12L);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(wildcardClass31);
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        java.io.Writer writer3 = null;
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        int int5 = localDate4.getDayOfMonth();
        org.joda.time.LocalDate localDate7 = localDate4.plusYears((int) (byte) 100);
        org.joda.time.Interval interval8 = localDate7.toInterval();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        org.joda.time.DateTimeZone dateTimeZone11 = mutableDateTime10.getZone();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        long long16 = dateTimeZone11.getMillisKeepLocal(dateTimeZone14, (long) 10);
        java.lang.String str17 = dateTimeZone11.toString();
        org.joda.time.DateTime dateTime18 = localDate7.toDateTimeAtMidnight(dateTimeZone11);
        org.joda.time.DateTime dateTime20 = dateTime18.withMillisOfDay((int) (short) 10);
        int int21 = dateTime20.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        long long29 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) 10);
        boolean boolean30 = dateTimeZone27.isFixed();
        org.joda.time.DateTime dateTime31 = dateTime20.withZone(dateTimeZone27);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer3, (org.joda.time.ReadableInstant) dateTime31);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 21 + "'", int5 == 21);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(dateTimeZone11);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertTrue("'" + long16 + "' != '" + 10L + "'", long16 == 10L);
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "Etc/UTC" + "'", str17, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2122 + "'", int21 == 2122);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(dateTime31);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology4 = localTime3.getChronology();
        org.joda.time.DateTimeField dateTimeField5 = dateTimeFieldType1.getField(chronology4);
        org.joda.time.DateTimeField dateTimeField6 = chronology4.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField7 = chronology4.hourOfDay();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime(1645455690671L, chronology4);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime.Property property10 = localTime8.property(dateTimeFieldType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(localTime3);
        org.junit.Assert.assertNotNull(chronology4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.plusWeeks(100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime3.withDate(0, 54096794, 19);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54096794 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455703152,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=43,MILLISECOND=152,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter0.getPrinter();
        java.io.Writer writer4 = null;
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        boolean boolean8 = mutableDateTime6.isAfter((long) 21);
        boolean boolean10 = mutableDateTime6.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        mutableDateTime6.setZone(dateTimeZone13);
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.lang.String str18 = locale16.getDisplayScript(locale17);
        java.lang.String str19 = locale16.getDisplayScript();
        java.lang.String str20 = dateTimeZone13.getShortName((long) 13, locale16);
        java.util.Calendar calendar21 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.fromCalendarFields(calendar21);
        org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime26 = localDateTime24.plusSeconds(0);
        boolean boolean27 = dateTimeZone13.isLocalDateTimeGap(localDateTime24);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime24.withSecondOfMinute((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer4, (org.joda.time.ReadablePartial) localDateTime29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimePrinter3);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "+00:00" + "'", str20, "+00:00");
        org.junit.Assert.assertNotNull(calendar21);
// flaky:         org.junit.Assert.assertEquals(calendar21.toString(), "java.util.GregorianCalendar[time=1645455703163,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=43,MILLISECOND=163,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + false + "'", boolean27 == false);
        org.junit.Assert.assertNotNull(localDateTime29);
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime localTime9 = localTime7.plusMinutes((int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = localTime9.toString("halfdays");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: l");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.lang.Throwable throwable0 = null;
        java.io.IOException iOException1 = new java.io.IOException(throwable0);
        java.lang.String str2 = iOException1.toString();
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "java.io.IOException" + "'", str2, "java.io.IOException");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withPeriodAdded(readablePeriod5, (int) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withMonthOfYear(1645455690);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1645455690 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455703371,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=43,MILLISECOND=371,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime10 = localTime1.minusMinutes(19);
        org.joda.time.Chronology chronology11 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(chronology11);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = chronology11.get(readablePeriod13, (long) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime4 = property3.roundHalfFloor();
        org.joda.time.ReadableDuration readableDuration5 = null;
        mutableDateTime4.add(readableDuration5);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(mutableDateTime4);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        java.util.Date date0 = new java.util.Date();
        org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime();
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now();
        int int3 = localDate2.getDayOfMonth();
        org.joda.time.LocalDate localDate5 = localDate2.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        boolean boolean9 = mutableDateTime7.isAfter((long) 21);
        boolean boolean11 = mutableDateTime7.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        mutableDateTime7.setZone(dateTimeZone14);
        org.joda.time.DateTime dateTime16 = localDate2.toDateTimeAtStartOfDay(dateTimeZone14);
        org.joda.time.DateTime dateTime17 = dateTime1.withFields((org.joda.time.ReadablePartial) localDate2);
        boolean boolean18 = date0.equals((java.lang.Object) localDate2);
// flaky:         org.junit.Assert.assertEquals(date0.toString(), "Mon Feb 21 15:01:43 UTC 2022");
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 21 + "'", int3 == 21);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        boolean boolean7 = mutableDateTime5.isAfter((long) 21);
        boolean boolean9 = mutableDateTime5.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        mutableDateTime5.setZone(dateTimeZone12);
        mutableDateTime1.setZoneRetainFields(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now(dateTimeZone12);
        // The following exception was thrown during execution in test generation
        try {
            int int17 = localDateTime15.getValue(14);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 14");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay((int) 'x', (int) 'u', 11);
        java.util.TimeZone timeZone6 = null;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder7 = builder5.setTimeZone(timeZone6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.Interval interval4 = localDate3.toInterval();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        long long12 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) 10);
        java.lang.String str13 = dateTimeZone7.toString();
        org.joda.time.DateTime dateTime14 = localDate3.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillisOfDay((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime14.withDate((int) (short) 1, 20, 54089980);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 20 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = localDate14.toInterval(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate14.plusMonths(0);
        org.joda.time.LocalDate.Property property19 = localDate18.year();
        int int20 = localDate18.size();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        long long28 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) 10);
        org.joda.time.DateTime dateTime29 = localDate18.toDateTimeAtMidnight(dateTimeZone26);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = locale30.toLanguageTag();
        boolean boolean32 = localDate18.equals((java.lang.Object) str31);
        org.joda.time.LocalDate localDate34 = localDate18.minusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod35 = null;
        org.joda.time.LocalDate localDate37 = localDate34.withPeriodAdded(readablePeriod35, 12);
        java.util.Date date38 = localDate37.toDate();
        calendar13.setTime(date38);
        java.lang.String str40 = date38.toString();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
        org.junit.Assert.assertNotNull(calendar13);
        org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645401600000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "ko-KR" + "'", str31, "ko-KR");
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + false + "'", boolean32 == false);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(date38);
        org.junit.Assert.assertEquals(date38.toString(), "Mon Feb 21 00:00:00 UTC 2022");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "Mon Feb 21 00:00:00 UTC 2022" + "'", str40, "Mon Feb 21 00:00:00 UTC 2022");
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime1.monthOfYear();
        org.joda.time.DateTime dateTime6 = dateTime1.withLaterOffsetAtOverlap();
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        boolean boolean1 = calendar0.isWeekDateSupported();
        java.util.Date date2 = calendar0.getTime();
        int int3 = calendar0.getMinimalDaysInFirstWeek();
        // The following exception was thrown during execution in test generation
        try {
            calendar0.add(52, 54100989);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455703764,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=43,MILLISECOND=764,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + true + "'", boolean1 == true);
        org.junit.Assert.assertNotNull(date2);
// flaky:         org.junit.Assert.assertEquals(date2.toString(), "Mon Feb 21 15:01:43 UTC 2022");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 4 + "'", int3 == 4);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter0.getPrinter();
        int int4 = dateTimePrinter3.estimatePrintedLength();
        java.io.Writer writer5 = null;
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.Interval interval8 = localDate6.toInterval(dateTimeZone7);
        org.joda.time.LocalDate localDate10 = localDate6.plusMonths(0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology14 = localTime13.getChronology();
        org.joda.time.DateTimeField dateTimeField15 = dateTimeFieldType11.getField(chronology14);
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.lang.String str18 = locale16.getDisplayScript(locale17);
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale19.toLanguageTag();
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.lang.String str22 = locale19.getDisplayCountry(locale21);
        java.lang.String str23 = locale17.getDisplayCountry(locale19);
        int int24 = dateTimeField15.getMaximumTextLength(locale17);
        java.lang.String str25 = locale17.getVariant();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter3.printTo(writer5, (org.joda.time.ReadablePartial) localDate6, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimePrinter3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40 + "'", int4 == 40);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(interval8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "ko-KR" + "'", str20, "ko-KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str22, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str23, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2 + "'", int24 == 2);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "" + "'", str25, "");
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate7 = localDate4.minus(readablePeriod6);
        org.joda.time.LocalDate localDate9 = localDate7.withCenturyOfEra(32772);
        org.joda.time.LocalDate localDate11 = localDate9.withMonthOfYear(12);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTimeZone dateTimeZone17 = null;
        org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(dateTimeZone17);
        org.joda.time.DateTimeZone dateTimeZone19 = mutableDateTime18.getZone();
        long long21 = dateTimeZone16.getMillisKeepLocal(dateTimeZone19, (long) 10);
        org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime(10L, dateTimeZone16);
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(1647097300888L, dateTimeZone16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((java.lang.Object) localDate9, dateTimeZone16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTimeZone19);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 10L + "'", long21 == 10L);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.years();
        java.lang.String str9 = durationFieldType8.toString();
        boolean boolean10 = localTime7.isSupported(durationFieldType8);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime13 = localTime7.withFieldAdded(durationFieldType11, 32772);
        org.joda.time.LocalTime.Property property14 = localTime7.hourOfDay();
        org.joda.time.LocalTime localTime16 = localTime7.minusMinutes(2922789);
        java.util.Locale locale18 = java.util.Locale.UK;
        java.util.Locale locale19 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet20 = locale19.getExtensionKeys();
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale21.getDisplayScript(locale22);
        java.lang.String str24 = locale19.getDisplayScript(locale22);
        java.util.Locale locale25 = java.util.Locale.UK;
        java.lang.String str26 = locale19.getDisplayScript(locale25);
        java.lang.String str27 = locale18.getDisplayLanguage(locale25);
        java.lang.String str28 = dateTimeField5.getAsText((org.joda.time.ReadablePartial) localTime16, (int) ' ', locale18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField30 = localTime16.getField(19);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 19");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "years" + "'", str9, "years");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "" + "'", str26, "");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "English" + "'", str27, "English");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "32" + "'", str28, "32");
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology6 = localTime5.getChronology();
        org.joda.time.DateTimeField dateTimeField7 = dateTimeFieldType3.getField(chronology6);
        org.joda.time.DateTimeField dateTimeField8 = chronology6.secondOfDay();
        org.joda.time.DateTimeField dateTimeField9 = chronology6.hourOfDay();
        java.lang.String str10 = chronology6.toString();
        org.joda.time.Chronology chronology11 = chronology6.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate(19, (int) 'u', 2, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(chronology6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ISOChronology[UTC]" + "'", str10, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        java.util.Locale locale7 = java.util.Locale.ITALIAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime8 = property4.setCopy("2022-02-21T15:01:40.681Z", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T15:01:40.681Z\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455704156,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=44,MILLISECOND=156,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "it");
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        mutableDateTime1.add(readablePeriod2);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setMinuteOfDay(54096794);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54096794 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        java.util.Locale locale4 = java.util.Locale.GERMANY;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = property2.setCopy("21 June 0130 15:01:36 ", locale4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"21 June 0130 15:01:36 \" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "de_DE");
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime1.setZone(dateTimeZone8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.lang.String str14 = locale11.getDisplayScript();
        java.lang.String str15 = dateTimeZone8.getShortName((long) 13, locale11);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusSeconds(0);
        boolean boolean22 = dateTimeZone8.isLocalDateTimeGap(localDateTime19);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plus(readablePeriod23);
        java.util.Date date25 = localDateTime24.toDate();
        int int26 = date25.getTimezoneOffset();
        java.lang.String str27 = date25.toString();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645455704516,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=44,MILLISECOND=516,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(date25);
// flaky:         org.junit.Assert.assertEquals(date25.toString(), "Mon Oct 03 15:01:44 UTC 2022");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 0 + "'", int26 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Mon Oct 03 15:01:44 UTC 2022" + "'", str27, "Mon Oct 03 15:01:44 UTC 2022");
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.setFirstDayOfWeek(5);
        calendar0.setTimeInMillis((long) 100);
        int int8 = calendar0.getGreatestMinimum(14);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.setWeekDate((int) 'u', 0, 11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 11");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=5,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Date date2 = calendar1.getTime();
        java.util.Locale locale5 = java.util.Locale.getDefault();
        java.lang.String str6 = locale5.getISO3Language();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = calendar1.getDisplayName(8, (int) (short) 0, locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "eng" + "'", str6, "eng");
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.setFirstDayOfWeek(5);
        calendar0.setMinimalDaysInFirstWeek((-1));
        java.util.Date date12 = new java.util.Date(100, 4, 6, 0, 21);
        int int13 = date12.getYear();
        calendar0.setTime(date12);
        java.util.Calendar calendar15 = java.util.Calendar.getInstance();
        int int17 = calendar15.getActualMaximum(13);
        int int18 = calendar0.compareTo(calendar15);
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=957572460000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=5,minimalDaysInFirstWeek=-1,ERA=1,YEAR=2000,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=127,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals(date12.toString(), "Sat May 06 00:21:00 UTC 2000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645455704884,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=44,MILLISECOND=884,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 59 + "'", int17 == 59);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + (-1) + "'", int18 == (-1));
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now();
        int int4 = localDate3.getDayOfMonth();
        org.joda.time.LocalDate localDate6 = localDate3.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property7 = localDate6.centuryOfEra();
        int int8 = property7.getMaximumValueOverall();
        org.joda.time.LocalDate localDate9 = property7.roundFloorCopy();
        org.joda.time.DateTime dateTime10 = localDate9.toDateTimeAtMidnight();
        org.joda.time.Chronology chronology11 = dateTime10.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((int) (byte) 0, 54092146, (int) (byte) 100, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54092146 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 21 + "'", int4 == 21);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2922789 + "'", int8 == 2922789);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(chronology11);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(8, 772, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 772 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = property4.setCopy(19);
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.minusMonths(4);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.LocalDateTime localDateTime10 = localDateTime6.plus(readableDuration9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withEra((int) 'a');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455704936,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=44,MILLISECOND=936,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = new org.joda.time.Instant((java.lang.Object) "minuteOfHour");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"minuteOfHour\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType5.getField(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(54096794, 2922789, 54099886, 7, 15, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.LocalTime localTime6 = localTime1.withMinuteOfHour((int) (short) 0);
        org.joda.time.LocalTime.Property property7 = localTime1.minuteOfHour();
        java.util.TimeZone timeZone10 = java.util.TimeZone.getTimeZone("years");
        boolean boolean11 = timeZone10.observesDaylightTime();
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Locale locale13 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet14 = locale13.getExtensionKeys();
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale15.getDisplayScript(locale16);
        java.lang.String str18 = locale13.getDisplayScript(locale16);
        java.util.Locale locale19 = java.util.Locale.UK;
        java.lang.String str20 = locale13.getDisplayScript(locale19);
        java.lang.String str21 = locale12.getDisplayLanguage(locale19);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance(timeZone10, locale12);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str23 = localTime1.toString("21-Feb-2022 15:01:43", locale12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: F");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "English" + "'", str21, "English");
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1645455705069,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=45,MILLISECOND=69,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType5 = localDate0.getFieldType(9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 9");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime localTime9 = localTime7.plusMinutes((int) (short) 100);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.Interval interval12 = localDate10.toInterval(dateTimeZone11);
        org.joda.time.LocalDate localDate14 = localDate10.plusMonths(0);
        org.joda.time.LocalDate.Property property15 = localDate14.year();
        org.joda.time.LocalDate localDate17 = localDate14.withYearOfCentury(6);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean18 = localTime7.isBefore((org.joda.time.ReadablePartial) localDate17);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(interval12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDate17);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale0.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        java.util.Calendar calendar8 = java.util.Calendar.getInstance(locale6);
        calendar8.roll(1, true);
        java.util.Locale locale14 = java.util.Locale.FRANCE;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap15 = calendar8.getDisplayNames(54092654, 8, locale14);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(calendar8);
// flaky:         org.junit.Assert.assertEquals(calendar8.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2023,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=45,MILLISECOND=197,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "fr_FR");
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortDate();
        java.lang.Appendable appendable1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(appendable1, (-431366459990L));
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.ReadablePeriod readablePeriod10 = null;
        org.joda.time.LocalTime localTime11 = localTime9.minus(readablePeriod10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localTime11.toString("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: c");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime11);
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str3 = mutableDateTime1.toString("9 Nov 2023 16:36:46 GMT");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: N");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = property4.setCopy(19);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        int int8 = property7.get();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455705348,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=45,MILLISECOND=348,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
// flaky:         org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        java.lang.String str4 = durationFieldType3.toString();
        boolean boolean5 = localTime2.isSupported(durationFieldType3);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime8 = localTime2.withFieldAdded(durationFieldType6, 32772);
        org.joda.time.LocalTime.Property property9 = localTime2.hourOfDay();
        org.joda.time.LocalTime localTime10 = property9.roundCeilingCopy();
        org.joda.time.LocalTime localTime12 = property9.addCopy(19);
        org.joda.time.LocalTime localTime13 = property9.roundFloorCopy();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean14 = strSet0.contains((java.lang.Object) property9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.joda.time.LocalTime$Property cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "years" + "'", str4, "years");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        mutableDateTime8.setMinuteOfDay(100);
        boolean boolean11 = mutableDateTime8.isAfterNow();
        boolean boolean12 = mutableDateTime8.isEqualNow();
        org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        mutableDateTime8.setZoneRetainFields(dateTimeZone15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(111, 54101869, 12, 1645455690, 100, 111, 16, dateTimeZone15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1645455690 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertNotNull(dateTimeZone15);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfDay();
        java.lang.String str14 = chronology10.toString();
        org.joda.time.Chronology chronology15 = chronology10.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(54100989, 54098460, 54101869, 19, 54100989, 59, 12, chronology15);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54100989 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "ISOChronology[UTC]" + "'", str14, "ISOChronology[UTC]");
        org.junit.Assert.assertNotNull(chronology15);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime10 = localTime1.minusMinutes(19);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.DurationFieldType durationFieldType12 = dateTimeFieldType11.getRangeDurationType();
        boolean boolean13 = localTime1.isSupported(durationFieldType12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime1.withHourOfDay(52);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.Interval interval4 = localDate3.toInterval();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        long long12 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) 10);
        java.lang.String str13 = dateTimeZone7.toString();
        org.joda.time.DateTime dateTime14 = localDate3.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DateTime dateTime16 = dateTime14.withMillisOfDay((int) (short) 10);
        int int17 = dateTime16.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        long long25 = dateTimeZone20.getMillisKeepLocal(dateTimeZone23, (long) 10);
        boolean boolean26 = dateTimeZone23.isFixed();
        org.joda.time.DateTime dateTime27 = dateTime16.withZone(dateTimeZone23);
        java.lang.String str28 = dateTimeZone23.toString();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2122 + "'", int17 == 2122);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertTrue("'" + long25 + "' != '" + 10L + "'", long25 == 10L);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "Etc/UTC" + "'", str28, "Etc/UTC");
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        long long11 = dateTimeZone6.getMillisKeepLocal(dateTimeZone9, (long) 10);
        java.lang.String str12 = dateTimeZone6.toString();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.lang.String str15 = locale14.toLanguageTag();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale14.getDisplayCountry(locale16);
        java.lang.String str18 = dateTimeZone6.getName((long) 54089980, locale16);
        java.lang.String str19 = locale16.getDisplayLanguage();
        java.lang.String str20 = locale16.getScript();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime21 = property2.set("GBR", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"GBR\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 10L + "'", long11 == 10L);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Etc/UTC" + "'", str12, "Etc/UTC");
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "ko-KR" + "'", str15, "ko-KR");
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str17, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "+00:00" + "'", str18, "+00:00");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "Korean" + "'", str19, "Korean");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime7.withMinuteOfHour(772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 772 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455705568,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=45,MILLISECOND=568,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(16, 59, 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        int int0 = java.util.Calendar.SHORT_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
        java.lang.Integer int1 = dateTimeFormatter0.getPivotYear();
        java.lang.StringBuffer stringBuffer2 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(stringBuffer2, 194766091200000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(int1);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        int int0 = java.util.Calendar.DATE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale1 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withLocale(locale1);
        java.io.Writer writer3 = null;
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate6 = localDate4.withYearOfEra((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = localDate4.getFields();
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer3, (org.joda.time.ReadablePartial) localDate4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.year();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime.Property property15 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime17 = localTime8.minusMinutes(19);
        org.joda.time.Chronology chronology18 = localTime8.getChronology();
        org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = dateTimeFieldType6.getField(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = new org.joda.time.DateTime(13, 9, 2922, 54098460, 52, 13, chronology18);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54098460 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "years" + "'", str10, "years");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(mutableDateTime19);
        org.junit.Assert.assertNotNull(dateTimeField20);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(0, 0, 6, 2922789, (int) (short) 100, 54098460);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        java.lang.Appendable appendable3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter2.printTo(appendable3, readableInstant4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.DurationField durationField7 = chronology3.weeks();
        org.joda.time.DurationField durationField8 = chronology3.days();
        org.joda.time.DateTimeField dateTimeField9 = chronology3.weekyearOfCentury();
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((-1), (int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((java.lang.Object) chronology3, dateTimeZone12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology2 = localTime1.getChronology();
        int[] intArray3 = localTime1.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = localTime1.withMinuteOfHour(100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(intArray3);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray3), "[0, 0, 0, 0]");
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        int int7 = dateTimeField6.getMinimumValue();
        org.joda.time.DurationField durationField8 = dateTimeField6.getRangeDurationField();
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        int int10 = localDate9.getDayOfMonth();
        org.joda.time.LocalDate localDate12 = localDate9.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(dateTimeZone13);
        boolean boolean16 = mutableDateTime14.isAfter((long) 21);
        boolean boolean18 = mutableDateTime14.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone19 = null;
        org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(dateTimeZone19);
        org.joda.time.DateTimeZone dateTimeZone21 = mutableDateTime20.getZone();
        mutableDateTime14.setZone(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = localDate9.toDateTimeAtStartOfDay(dateTimeZone21);
        org.joda.time.Chronology chronology24 = localDate9.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) durationField8, chronology24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.field.PreciseDurationField");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        mutableDateTime0.setWeekyear(20);
        org.joda.time.MutableDateTime mutableDateTime3 = mutableDateTime0.copy();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime0.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime0.setMinuteOfDay(54100989);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54100989 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(property4);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        long long8 = dateTimeField5.addWrapField((long) 2022, 52);
        int int10 = dateTimeField5.getLeapAmount((long) 9);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.years();
        java.lang.String str14 = durationFieldType13.toString();
        boolean boolean15 = localTime12.isSupported(durationFieldType13);
        int[] intArray22 = new int[] { 15, 86399999, 54089980, 13, 111 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = dateTimeField5.add((org.joda.time.ReadablePartial) localTime12, 6, intArray22, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 6");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455706509,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=46,MILLISECOND=509,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2074L + "'", long8 == 2074L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "years" + "'", str14, "years");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[15, 86399999, 54089980, 13, 111]");
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.plusWeeks(100);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withDurationAdded(readableDuration7, 14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime3.withEra(54096794);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54096794 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455706527,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=46,MILLISECOND=527,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getGreatestMinimum((int) (byte) 0);
        java.util.TimeZone timeZone3 = calendar0.getTimeZone();
        java.lang.String str4 = timeZone3.getDisplayName();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455706552,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=46,MILLISECOND=552,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Coordinated Universal Time" + "'", str4, "Coordinated Universal Time");
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(7);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean11 = localTime9.equals((java.lang.Object) dateTimeFieldType10);
        org.joda.time.LocalTime.Property property12 = localTime1.property(dateTimeFieldType10);
        org.joda.time.LocalTime localTime13 = property12.withMaximumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = property12.setCopy("eng");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"eng\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime13);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        long long6 = instant2.getMillis();
        org.junit.Assert.assertNotNull(instant4);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645455706881L + "'", long6 == 1645455706881L);
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate localDate6 = localDate0.minusMonths(10);
        int int7 = localDate6.getDayOfYear();
        org.joda.time.LocalDate.Property property8 = localDate6.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = property8.addToCopy(13);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 111 + "'", int7 == 111);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((int) '#', (int) (byte) 10, (int) (short) -1, 20, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        java.util.Locale locale0 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet1 = locale0.getExtensionKeys();
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.lang.String str4 = locale2.getDisplayScript(locale3);
        java.lang.String str5 = locale0.getDisplayScript(locale3);
        java.util.Locale locale6 = java.util.Locale.UK;
        java.lang.String str7 = locale0.getDisplayScript(locale6);
        java.lang.String str8 = locale6.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet1);
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "" + "'", str4, "");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "en_GB" + "'", str8, "en_GB");
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        java.lang.String str4 = mutableDateTime1.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int5 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale9.toLanguageTag();
        boolean boolean11 = locale9.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        long long19 = dateTimeZone14.getMillisKeepLocal(dateTimeZone17, (long) 10);
        java.lang.String str20 = dateTimeZone14.toString();
        java.util.Locale locale22 = java.util.Locale.KOREA;
        java.lang.String str23 = locale22.toLanguageTag();
        java.util.Locale locale24 = java.util.Locale.KOREA;
        java.lang.String str25 = locale22.getDisplayCountry(locale24);
        java.lang.String str26 = dateTimeZone14.getName((long) 54089980, locale24);
        java.lang.String str27 = locale24.getDisplayLanguage();
        java.lang.String str28 = locale9.getDisplayVariant(locale24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime29 = property6.set("3:01 PM", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"3:01 PM\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc" + "'", str4, "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "ko-KR" + "'", str10, "ko-KR");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19 == 10L);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Etc/UTC" + "'", str20, "Etc/UTC");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "ko-KR" + "'", str23, "ko-KR");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str25, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str26 + "' != '" + "+00:00" + "'", str26, "+00:00");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "Korean" + "'", str27, "Korean");
        org.junit.Assert.assertEquals("'" + str28 + "' != '" + "" + "'", str28, "");
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = property16.addToCopy(7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime19.withDayOfMonth(54096794);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54096794 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.millisOfDay();
        java.lang.String str4 = mutableDateTime1.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int5 = mutableDateTime1.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.secondOfMinute();
        org.joda.time.MutableDateTime mutableDateTime7 = property6.roundHalfFloor();
        long long8 = property6.remainder();
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc" + "'", str4, "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2 + "'", int5 == 2);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(mutableDateTime7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 0L + "'", long8 == 0L);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.parse("English");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"English\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (byte) -1, 13, 54092654, 0, 9, (int) 'x');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        int int7 = dateTimeField5.getMinimumValue((long) 8);
        // The following exception was thrown during execution in test generation
        try {
            long long10 = dateTimeField5.set((long) 11, "21 Feb 2022 15:01:43 GMT");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"21 Feb 2022 15:01:43 GMT\" for secondOfMinute is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay((int) 'x', (int) 'u', 11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder8 = builder0.setWeekDefinition(1501, 54101692);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        int int0 = java.util.Calendar.FIELD_COUNT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 17 + "'", int0 == 17);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.MutableDateTime.Property property5 = mutableDateTime4.era();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        mutableDateTime4.add(readablePeriod6, (int) (byte) 100);
        mutableDateTime1.setTime((org.joda.time.ReadableInstant) mutableDateTime4);
        org.joda.time.DateTimeFieldType dateTimeFieldType10 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime12 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology13 = localTime12.getChronology();
        org.joda.time.DateTimeField dateTimeField14 = dateTimeFieldType10.getField(chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.secondOfDay();
        org.joda.time.DateTimeField dateTimeField16 = chronology13.hourOfDay();
        org.joda.time.DurationField durationField17 = dateTimeField16.getLeapDurationField();
        int int18 = mutableDateTime4.get(dateTimeField16);
        mutableDateTime4.addHours(54092146);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime4.setHourOfDay((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(dateTimeFieldType10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNull(durationField17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 15 + "'", int18 == 15);
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone10);
        // The following exception was thrown during execution in test generation
        try {
            calendar11.setWeekDate(13, 100, 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 2000");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Etc/UTC" + "'", str8, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645455707727,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=47,MILLISECOND=727,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale1 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withLocale(locale1);
        boolean boolean3 = dateTimeFormatter2.isOffsetParsed();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime5 = dateTimeFormatter2.parseLocalTime("2022-02-21T15:01:32.747Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T15:01:32.747Z\" is malformed at \"22-02-21T15:01:32.747Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime10 = localTime1.minusMinutes(19);
        org.joda.time.DateTime dateTime11 = localTime10.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str13 = localTime10.toString("java.util.GregorianCalendar[time=1645455702075,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=42,MILLISECOND=75,ZONE_OFFSET=0,DST_OFFSET=0]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: j");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTime11);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.toLanguageTag();
        boolean boolean2 = locale0.hasExtensions();
        java.lang.String str3 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ko-KR" + "'", str1, "ko-KR");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "ko_KR" + "'", str3, "ko_KR");
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.days();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        int int7 = dateTimeField6.getMinimumValue();
        org.joda.time.DurationField durationField8 = dateTimeField6.getRangeDurationField();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean12 = localTime10.equals((java.lang.Object) dateTimeFieldType11);
        int int13 = localTime10.size();
        java.util.Calendar calendar15 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.fromCalendarFields(calendar15);
        org.joda.time.LocalDateTime localDateTime18 = localDateTime16.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property19 = localDateTime18.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod20 = null;
        org.joda.time.LocalDateTime localDateTime22 = localDateTime18.withPeriodAdded(readablePeriod20, (int) (short) 100);
        int[] intArray23 = localDateTime22.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray25 = dateTimeField6.addWrapField((org.joda.time.ReadablePartial) localTime10, (int) (byte) 100, intArray23, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 0 + "'", int7 == 0);
        org.junit.Assert.assertNotNull(durationField8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + false + "'", boolean12 == false);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 4 + "'", int13 == 4);
        org.junit.Assert.assertNotNull(calendar15);
// flaky:         org.junit.Assert.assertEquals(calendar15.toString(), "java.util.GregorianCalendar[time=1645455708157,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=48,MILLISECOND=157,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(intArray23);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray23), "[2022, 10, 3, 54108157]");
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.plusWeeks(100);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withDurationAdded(readableDuration7, 14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withSecondOfMinute(901);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 901 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455708193,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=48,MILLISECOND=193,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime10 = property8.roundCeilingCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int12 = localTime10.getValue(12);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 12");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime((int) 'x', (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 120 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.DateTimeField dateTimeField4 = chronology2.clockhourOfHalfday();
        org.joda.time.DurationField durationField5 = chronology2.years();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray8 = chronology2.get(readablePartial6, (long) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(durationField5);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.setFirstDayOfWeek(5);
        calendar0.setMinimalDaysInFirstWeek((-1));
        java.util.Date date12 = new java.util.Date(100, 4, 6, 0, 21);
        int int13 = date12.getYear();
        calendar0.setTime(date12);
        java.util.Date date15 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int16 = date12.compareTo(date15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
        org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=957572460000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=5,minimalDaysInFirstWeek=-1,ERA=1,YEAR=2000,MONTH=4,WEEK_OF_YEAR=19,WEEK_OF_MONTH=2,DAY_OF_MONTH=6,DAY_OF_YEAR=127,DAY_OF_WEEK=7,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=21,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertEquals(date12.toString(), "Sat May 06 00:21:00 UTC 2000");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 100 + "'", int13 == 100);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.util.Locale locale3 = java.util.Locale.KOREA;
        java.util.Locale locale4 = java.util.Locale.KOREA;
        java.lang.String str5 = locale3.getDisplayScript(locale4);
        java.util.Set<java.lang.String> strSet6 = locale3.getUnicodeLocaleKeys();
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale7.toLanguageTag();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.lang.String str10 = locale7.getDisplayCountry(locale9);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.util.Locale[] localeArray14 = new java.util.Locale[] { locale3, locale9, locale12 };
        java.util.ArrayList<java.util.Locale> localeList15 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList15, localeArray14);
        java.util.Locale locale17 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList15);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.util.Set<java.lang.String> strSet21 = locale18.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet22 = locale18.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strSet22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.lang.String str29 = locale27.getDisplayScript(locale28);
        java.util.Set<java.lang.String> strSet30 = locale27.getUnicodeLocaleKeys();
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale31.toLanguageTag();
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale31.getDisplayCountry(locale33);
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.lang.String str37 = locale35.getDisplayScript(locale36);
        java.util.Locale[] localeArray38 = new java.util.Locale[] { locale27, locale33, locale36 };
        java.util.ArrayList<java.util.Locale> localeList39 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean40 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList39, localeArray38);
        java.util.Locale locale41 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList39);
        java.util.List<java.util.Locale> localeList42 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList39);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime43 = new org.joda.time.LocalTime((java.lang.Object) localeList39);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.ArrayList");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "" + "'", str5, "");
        org.junit.Assert.assertNotNull(strSet6);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "ko-KR" + "'", str8, "ko-KR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str10, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertNotNull(localeArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(locale17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertNotNull(strSet22);
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertNotNull(strSet30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ko-KR" + "'", str32, "ko-KR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str34, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertNotNull(localeArray38);
        org.junit.Assert.assertTrue("'" + boolean40 + "' != '" + true + "'", boolean40 == true);
        org.junit.Assert.assertNull(locale41);
        org.junit.Assert.assertNotNull(localeList42);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.shortDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.parse("United Kingdom", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"United Kingdom\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) 16);
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.Interval interval4 = localDate3.toInterval();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        long long12 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) 10);
        java.lang.String str13 = dateTimeZone7.toString();
        org.joda.time.DateTime dateTime14 = localDate3.toDateTimeAtMidnight(dateTimeZone7);
        org.joda.time.DateTime.Property property15 = dateTime14.dayOfYear();
        org.joda.time.DateTime dateTime17 = dateTime14.minusMillis(54101692);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime17.withWeekOfWeekyear(279);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 279 for weekOfWeekyear must be in the range [1,53]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "Etc/UTC" + "'", str13, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(2000, 48, 54104989);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        long long12 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime13 = new org.joda.time.DateTime((int) (short) -1, 32769, 0, 40, (int) 'a', dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 40 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        int int3 = timeZone1.getOffset((long) 19);
        boolean boolean4 = timeZone1.useDaylightTime();
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        int int0 = java.util.Calendar.SUNDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDate localDate18 = localDate4.withPeriodAdded(readablePeriod16, (int) (short) -1);
        org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.years();
        java.lang.String str22 = durationFieldType21.toString();
        boolean boolean23 = localTime20.isSupported(durationFieldType21);
        org.joda.time.DurationFieldType durationFieldType24 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime26 = localTime20.withFieldAdded(durationFieldType24, 32772);
        java.lang.String str27 = durationFieldType24.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType28 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology31 = localTime30.getChronology();
        org.joda.time.DateTimeField dateTimeField32 = dateTimeFieldType28.getField(chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.secondOfDay();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.hourOfDay();
        boolean boolean35 = durationFieldType24.isSupported(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime36 = new org.joda.time.DateTime((java.lang.Object) localDate4, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "years" + "'", str22, "years");
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(durationFieldType24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "halfdays" + "'", str27, "halfdays");
        org.junit.Assert.assertNotNull(dateTimeFieldType28);
        org.junit.Assert.assertNotNull(localTime30);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minus(readableDuration6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime5.withTime(54098460, 54096794, 279, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54098460 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455709529,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=49,MILLISECOND=529,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long) 7);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfYear(54099886);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54099886 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("1970-01-01T15:01:48.207Z", (double) 5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=5.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.era();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now();
        int int11 = localDate10.getDayOfMonth();
        org.joda.time.LocalDate localDate13 = localDate10.plusYears((int) (byte) 100);
        org.joda.time.Interval interval14 = localDate13.toInterval();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        org.joda.time.DateTimeZone dateTimeZone18 = null;
        org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime(dateTimeZone18);
        org.joda.time.DateTimeZone dateTimeZone20 = mutableDateTime19.getZone();
        long long22 = dateTimeZone17.getMillisKeepLocal(dateTimeZone20, (long) 10);
        java.lang.String str23 = dateTimeZone17.toString();
        org.joda.time.DateTime dateTime24 = localDate13.toDateTimeAtMidnight(dateTimeZone17);
        org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime8.toMutableDateTime(dateTimeZone17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime((int) (short) 10, 3, 16, 54098460, 54099886, 0, 19, dateTimeZone17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54098460 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 21 + "'", int11 == 21);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTimeZone20);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 10L + "'", long22 == 10L);
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "Etc/UTC" + "'", str23, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(mutableDateTime25);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime dateTime17 = dateTime15.minusDays(0);
        org.joda.time.DateTime.Property property18 = dateTime15.dayOfYear();
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.Interval interval22 = localDate20.toInterval(dateTimeZone21);
        org.joda.time.LocalDate localDate24 = localDate20.plusMonths(0);
        org.joda.time.LocalDate.Property property25 = localDate24.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod26 = null;
        org.joda.time.LocalDate localDate27 = localDate24.minus(readablePeriod26);
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate30 = localDate28.withYearOfEra((int) '4');
        boolean boolean31 = localDate27.isBefore((org.joda.time.ReadablePartial) localDate28);
        org.joda.time.LocalDate localDate33 = localDate28.minusDays((int) (byte) 100);
        org.joda.time.LocalDate.Property property34 = localDate28.dayOfMonth();
        java.util.Locale locale36 = java.util.Locale.ROOT;
        java.lang.String str37 = localDate28.toString("32", locale36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime38 = property18.setCopy("01-Jan-1970 00:00:00", locale36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"01-Jan-1970 00:00:00\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(interval22);
        org.junit.Assert.assertNotNull(localDate24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localDate33);
        org.junit.Assert.assertNotNull(property34);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "32" + "'", str37, "32");
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime10 = property8.withMinimumValue();
        org.joda.time.LocalTime localTime11 = property8.roundHalfCeilingCopy();
        org.joda.time.LocalTime localTime12 = property8.roundHalfFloorCopy();
        java.util.Locale locale14 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet15 = locale14.getExtensionKeys();
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.lang.String str18 = locale16.getDisplayScript(locale17);
        java.lang.String str19 = locale14.getDisplayScript(locale17);
        java.lang.String str20 = locale17.getDisplayLanguage();
        java.lang.String str21 = locale17.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = property8.setCopy("21 June 0130 15:01:38 ", locale17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"21 June 0130 15:01:38 \" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "" + "'", str18, "");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "Korean" + "'", str20, "Korean");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ko-KR" + "'", str21, "ko-KR");
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder2 = builder0.setCalendarType("2022-02-21T15:01:34.312Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: 2022-02-21T15:01:34.312Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 19, dateTimeZone3);
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDateTime4.getValue(2000);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2000");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(54107140, 15, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54107140 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        int int4 = localDateTime1.getCenturyOfEra();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455710091,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=50,MILLISECOND=91,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 20 + "'", int4 == 20);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate0.plus(readablePeriod2);
        org.joda.time.LocalDate localDate5 = localDate0.withCenturyOfEra(21);
        org.joda.time.LocalDate localDate7 = localDate0.withYear(19);
        org.joda.time.LocalDate localDate9 = localDate7.withYearOfCentury((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate11 = localDate7.withWeekOfWeekyear(54092654);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54092654 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.minuteOfHour();
        org.joda.time.DateTime dateTime3 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime dateTime4 = dateTime1.withTimeAtStartOfDay();
        org.joda.time.DateTime.Property property5 = dateTime1.monthOfYear();
        java.util.Locale locale7 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.lang.String str12 = locale7.getDisplayScript(locale10);
        java.util.Locale locale13 = java.util.Locale.UK;
        java.lang.String str14 = locale7.getDisplayScript(locale13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = property5.setCopy("21-Feb-2022 15:01:41", locale7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"21-Feb-2022 15:01:41\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Date date2 = calendar1.getTime();
        // The following exception was thrown during execution in test generation
        try {
            calendar1.roll(16, (-3600000));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(2, (int) 'u', 12, 21);
        java.util.Calendar.Builder builder8 = builder6.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder11 = builder6.setWeekDefinition(54089980, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.LocalTime localTime6 = localTime1.withMinuteOfHour((int) (short) 0);
        org.joda.time.LocalTime.Property property7 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.addNoWrapToCopy((int) (byte) 100);
        org.joda.time.DateTimeFieldType dateTimeFieldType11 = org.joda.time.DateTimeFieldType.minuteOfHour();
        java.lang.String str12 = dateTimeFieldType11.toString();
        java.lang.String str13 = dateTimeFieldType11.getName();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime15 = localTime10.withField(dateTimeFieldType11, 2922);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFieldType11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "minuteOfHour" + "'", str12, "minuteOfHour");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "minuteOfHour" + "'", str13, "minuteOfHour");
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.Instant instant2 = new org.joda.time.Instant();
        org.joda.time.Instant instant4 = instant2.withMillis((long) (short) 100);
        mutableDateTime1.setMillis((org.joda.time.ReadableInstant) instant2);
        mutableDateTime1.addMinutes(14);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setDayOfWeek(13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 13 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant4);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getRoundingMode();
        org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
        mutableDateTime1.addHours(40);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime8 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology9 = localTime8.getChronology();
        org.joda.time.DateTimeField dateTimeField10 = dateTimeFieldType6.getField(chronology9);
        org.joda.time.DateTimeField dateTimeField11 = chronology9.secondOfMinute();
        org.joda.time.DurationField durationField12 = dateTimeField11.getDurationField();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setRounding(dateTimeField11, (int) 'x');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 120");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(chronology9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(9);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField6 = dateTimeField5.getDurationField();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean18 = localTime16.equals((java.lang.Object) dateTimeFieldType17);
        org.joda.time.LocalTime.Property property19 = localTime8.property(dateTimeFieldType17);
        org.joda.time.LocalTime localTime20 = property19.withMaximumValue();
        int int21 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.DateTime dateTime25 = localTime20.toDateTimeToday(dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime27 = dateTime25.withDayOfWeek((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "years" + "'", str10, "years");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        java.util.Locale locale1 = java.util.Locale.ITALIAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = org.joda.time.format.DateTimeFormat.patternForStyle("en_GB", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: en_GB");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "it");
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime.Property property15 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime16 = property15.roundCeilingCopy();
        org.joda.time.LocalTime localTime18 = localTime16.withMillisOfDay(20);
        org.joda.time.LocalTime.Property property19 = localTime18.secondOfMinute();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean23 = localTime21.equals((java.lang.Object) dateTimeFieldType22);
        org.joda.time.DateTimeFieldType dateTimeFieldType24 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology27 = localTime26.getChronology();
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType24.getField(chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField30 = chronology27.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType22.getField(chronology27);
        org.joda.time.LocalTime localTime33 = localTime18.withField(dateTimeFieldType22, 9);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology36 = instant35.getChronology();
        org.joda.time.DurationField durationField37 = chronology36.weekyears();
        org.joda.time.DateTimeField dateTimeField38 = chronology36.clockhourOfHalfday();
        org.joda.time.DurationField durationField39 = chronology36.weeks();
        org.joda.time.DateTimeField dateTimeField40 = chronology36.clockhourOfHalfday();
        boolean boolean41 = dateTimeFieldType22.isSupported(chronology36);
        org.joda.time.Chronology chronology42 = chronology36.withUTC();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((java.lang.Object) chronology3, chronology36);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "years" + "'", str10, "years");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType24);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(localTime33);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(durationField39);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
        org.junit.Assert.assertNotNull(chronology42);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        int int0 = java.util.Calendar.LONG_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32770 + "'", int0 == 32770);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(2, (int) 'u', 12, 21);
        java.util.Calendar.Builder builder11 = builder6.setTimeOfDay(901, 54092146, 59, 5);
        java.util.Calendar.Builder builder15 = builder11.setDate(21, (int) (byte) -1, 13);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder17 = builder11.setCalendarType("21 June 0130 15:01:41 ");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: 21 June 0130 15:01:41 ");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder11);
        org.junit.Assert.assertNotNull(builder15);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime4 = localDate0.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate.Property property5 = localDate0.dayOfYear();
        int int6 = localDate0.getDayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate0.withMonthOfYear(22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 52 + "'", int6 == 52);
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = dateTimeFormatter0.parseLocalTime("2022-02-21T15:01:45.243Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"2022-02-21T15:01:45.243Z\" is malformed at \"22-02-21T15:01:45.243Z\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("en_GB");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: n");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.Interval interval4 = localDate3.toInterval();
        org.joda.time.Chronology chronology5 = localDate3.getChronology();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = chronology5.get(readablePeriod6, (long) 22, (long) 21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(interval4);
        org.junit.Assert.assertNotNull(chronology5);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(0);
        org.joda.time.LocalDateTime.Property property6 = localDateTime5.era();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfFloorCopy();
        int int8 = localDateTime7.getDayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime10 = localDateTime7.withEra(48);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455710844,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=50,MILLISECOND=844,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.weekyears();
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now(chronology2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate6 = localDate4.withCenturyOfEra((-3600000));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -3600000 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(localDate4);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear(13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = org.joda.time.LocalDateTime.parse("java.util.GregorianCalendar[time=1645455702075,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=42,MILLISECOND=75,ZONE_OFFSET=0,DST_OFFSET=0]", dateTimeFormatter3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.util.GregorianCalendar[time...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(54101869, 100, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.roundHalfFloorCopy();
        org.joda.time.DateTime dateTime19 = property16.addToCopy((int) 'u');
        org.joda.time.DateTime dateTime21 = property16.setCopy(19);
        org.joda.time.DateTime dateTime23 = dateTime21.plusMonths(2922789);
        org.joda.time.DateTime.Property property24 = dateTime21.dayOfMonth();
        org.joda.time.Instant instant25 = dateTime21.toInstant();
        org.joda.time.MutableDateTime mutableDateTime26 = instant25.toMutableDateTimeISO();
        org.joda.time.Instant instant27 = instant25.toInstant();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertNotNull(instant25);
        org.junit.Assert.assertNotNull(mutableDateTime26);
        org.junit.Assert.assertNotNull(instant27);
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(3);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = localDate2.getValue(2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2022");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        boolean boolean18 = mutableDateTime16.isAfter((long) 21);
        boolean boolean20 = mutableDateTime16.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        mutableDateTime16.setZone(dateTimeZone23);
        org.joda.time.DateTime dateTime25 = localTime8.toDateTimeToday(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        org.joda.time.DateTime dateTime29 = org.joda.time.DateTime.now(dateTimeZone28);
        int int31 = dateTimeZone28.getOffsetFromLocal((long) (byte) -1);
        org.joda.time.DateTime dateTime32 = localTime8.toDateTimeToday(dateTimeZone28);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(772, 0, 1, 2922789, 54106168, 21, 1501, dateTimeZone28);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922789 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "years" + "'", str10, "years");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 0 + "'", int31 == 0);
        org.junit.Assert.assertNotNull(dateTime32);
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder5 = builder0.setTimeOfDay((int) 'x', (int) 'u', 11);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder7 = builder5.setInstant(1645455708350L);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            long long9 = dateTimeField6.set(1645455705671L, "2022-02-21T15:01:32.923Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T15:01:32.923Z\" for halfdayOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.util.Calendar calendar1 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.fromCalendarFields(calendar1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime6 = localDateTime2.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime8 = localDateTime6.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str12 = localDateTime10.toString(dateTimeFormatter11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime13 = org.joda.time.LocalTime.parse("\ud55c\uad6d\uc5b4\ub300\ud55c\ubbfc\uad6d)", dateTimeFormatter11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"???????? (???????????)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455711659,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=51,MILLISECOND=659,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime2);
        org.junit.Assert.assertNotNull(localDateTime4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
// flaky:         org.junit.Assert.assertEquals("'" + str12 + "' != '" + "15:01" + "'", str12, "15:01");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.add(3, (int) ' ');
        calendar0.set(7, 40, (int) (byte) 1, 54101869, 9, 1);
        // The following exception was thrown during execution in test generation
        try {
            calendar0.set(54110417, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54110417");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=7,MONTH=40,WEEK_OF_YEAR=40,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=276,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=3,HOUR_OF_DAY=54101869,MINUTE=9,SECOND=1,MILLISECOND=718,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property4 = localDate3.centuryOfEra();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.LocalDate localDate6 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        int int8 = localDate7.getDayOfMonth();
        org.joda.time.LocalDate localDate10 = localDate7.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property11 = localDate10.centuryOfEra();
        int int12 = property11.getMaximumValueOverall();
        org.joda.time.LocalDate localDate13 = property11.roundFloorCopy();
        org.joda.time.LocalDate localDate15 = localDate13.minusDays(12);
        boolean boolean16 = property4.equals((java.lang.Object) 12);
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2922789 + "'", int5 == 2922789);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 21 + "'", int8 == 21);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2922789 + "'", int12 == 2922789);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime0.withField(dateTimeFieldType1, (int) 'u');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'monthOfYear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("2022-02-21T15:01:32.923Z", (double) 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=59.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        long long6 = java.util.Date.UTC(14, 21, (int) '#', 6, (int) (byte) 1, 19);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-1709143121000L) + "'", long6 == (-1709143121000L));
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(54100989, (int) (byte) 0, 54106168, 54104989, (int) (short) -1, 54089980);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54104989 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = dateTimeField5.getType();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime.Property property15 = localTime8.hourOfDay();
        org.joda.time.LocalTime localTime16 = property15.roundCeilingCopy();
        int int17 = localTime16.getMillisOfSecond();
        org.joda.time.LocalTime localTime20 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology21 = localTime20.getChronology();
        int[] intArray22 = localTime20.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray24 = dateTimeField5.set((org.joda.time.ReadablePartial) localTime16, (int) (byte) 1, intArray22, 1501);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1501 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455712055,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=52,MILLISECOND=55,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "years" + "'", str10, "years");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 0 + "'", int17 == 0);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(intArray22);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray22), "[0, 0, 0, 0]");
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.years();
        mutableDateTime1.add(durationFieldType3, (int) (short) 1);
        org.joda.time.MutableDateTime.Property property6 = mutableDateTime1.monthOfYear();
        org.joda.time.DurationField durationField7 = property6.getDurationField();
        org.joda.time.MutableDateTime mutableDateTime8 = property6.roundCeiling();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime10 = property6.set(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(durationField7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setRegion("01/01/01 00:00");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed region: 01/01/01 00:00 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDateTime();
        java.io.Writer writer1 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer1, 1645455708350L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant1 = org.joda.time.Instant.parse("English (Canada)");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"English (Canada)\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = localDateTime9.withMinuteOfHour(54107140);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54107140 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455712387,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=52,MILLISECOND=387,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "15:01" + "'", str11, "15:01");
        org.junit.Assert.assertNotNull(property12);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime9 = property8.roundCeilingCopy();
        org.joda.time.LocalTime localTime10 = property8.roundCeilingCopy();
        org.joda.time.LocalTime.Property property11 = localTime10.millisOfDay();
        int int12 = localTime10.getMillisOfSecond();
        java.util.Calendar calendar13 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime14 = org.joda.time.LocalDateTime.fromCalendarFields(calendar13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.plusYears(14);
        org.joda.time.ReadableDuration readableDuration19 = null;
        org.joda.time.LocalDateTime localDateTime21 = localDateTime14.withDurationAdded(readableDuration19, 20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime14.minusWeeks((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime14.withMillisOfDay((int) (short) 0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean26 = localTime10.isEqual((org.joda.time.ReadablePartial) localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645455712458,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=52,MILLISECOND=458,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.monthOfYear();
        org.joda.time.DateTime dateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        java.util.Locale locale4 = java.util.Locale.ITALIAN;
        java.util.Calendar calendar5 = dateTime3.toCalendar(locale4);
        // The following exception was thrown during execution in test generation
        try {
            int int7 = calendar5.getMinimum(54101869);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54101869");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "it");
        org.junit.Assert.assertNotNull(calendar5);
        org.junit.Assert.assertEquals(calendar5.toString(), "java.util.GregorianCalendar[time=1646092800000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=2,WEEK_OF_YEAR=9,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=60,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.getDateTime();
        int int18 = property16.getMinimumValueOverall();
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.lang.String str21 = locale20.toLanguageTag();
        boolean boolean22 = locale20.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone23 = null;
        org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(dateTimeZone23);
        org.joda.time.DateTimeZone dateTimeZone25 = mutableDateTime24.getZone();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime(dateTimeZone26);
        org.joda.time.DateTimeZone dateTimeZone28 = mutableDateTime27.getZone();
        long long30 = dateTimeZone25.getMillisKeepLocal(dateTimeZone28, (long) 10);
        java.lang.String str31 = dateTimeZone25.toString();
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale33.toLanguageTag();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.lang.String str36 = locale33.getDisplayCountry(locale35);
        java.lang.String str37 = dateTimeZone25.getName((long) 54089980, locale35);
        java.lang.String str38 = locale35.getDisplayLanguage();
        java.lang.String str39 = locale20.getDisplayVariant(locale35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime40 = property16.setCopy("centuryOfEra", locale20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"centuryOfEra\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "ko-KR" + "'", str21, "ko-KR");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(dateTimeZone25);
        org.junit.Assert.assertNotNull(dateTimeZone28);
        org.junit.Assert.assertTrue("'" + long30 + "' != '" + 10L + "'", long30 == 10L);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "Etc/UTC" + "'", str31, "Etc/UTC");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "ko-KR" + "'", str34, "ko-KR");
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str36, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "+00:00" + "'", str37, "+00:00");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "Korean" + "'", str38, "Korean");
        org.junit.Assert.assertEquals("'" + str39 + "' != '" + "" + "'", str39, "");
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.DateTimeZone dateTimeZone1 = dateTimeFormatter0.getZone();
        boolean boolean2 = dateTimeFormatter0.isParser();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withPivotYear((java.lang.Integer) 48);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withZoneUTC();
        java.lang.Appendable appendable6 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter5.printTo(appendable6, (long) 2922);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.Instant instant1 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology2 = instant1.getChronology();
        org.joda.time.DurationField durationField3 = chronology2.eras();
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(chronology2);
        org.joda.time.DateTimeField dateTimeField5 = chronology2.clockhourOfDay();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray9 = chronology2.get(readablePeriod6, (long) 674, (long) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology2);
        org.junit.Assert.assertNotNull(durationField3);
        org.junit.Assert.assertNotNull(dateTimeField5);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property4 = localDate3.centuryOfEra();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.LocalDate localDate6 = property4.roundFloorCopy();
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((long) 7);
        int int9 = property4.compareTo((org.joda.time.ReadableInstant) mutableDateTime8);
        int int10 = property4.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2922789 + "'", int5 == 2922789);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes((int) (short) -1, 54112697);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 54112697");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withPeriodAdded(readablePeriod5, (int) (short) 100);
        int int8 = localDateTime3.size();
        int int9 = localDateTime3.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            int int11 = localDateTime3.getValue(7);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 7");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455713080,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=53,MILLISECOND=80,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 4 + "'", int8 == 4);
// flaky:         org.junit.Assert.assertTrue("'" + int9 + "' != '" + 80 + "'", int9 == 80);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("2022-02-21T15:00:52.973");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: 2022-02-21T15:00:52.973");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("100");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The datetime zone id '100' is not recognised");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Date date2 = calendar1.getTime();
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate7 = localDate5.withWeekyear(3);
        org.joda.time.LocalDate localDate9 = org.joda.time.LocalDate.now();
        int int10 = localDate9.getDayOfMonth();
        org.joda.time.LocalDate localDate12 = localDate9.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime13 = localDate9.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate14 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.Interval interval16 = localDate14.toInterval(dateTimeZone15);
        org.joda.time.LocalDate localDate18 = localDate14.plusMonths(0);
        org.joda.time.LocalDate.Property property19 = localDate18.year();
        int int20 = localDate18.size();
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        long long28 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) 10);
        org.joda.time.DateTime dateTime29 = localDate18.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.DateTimeFieldType dateTimeFieldType30 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property31 = dateTime29.property(dateTimeFieldType30);
        int int32 = localDate9.get(dateTimeFieldType30);
        org.joda.time.LocalDate.Property property33 = localDate9.dayOfMonth();
        java.util.Locale locale35 = java.util.Locale.forLanguageTag("hi!");
        int int36 = property33.getMaximumTextLength(locale35);
        java.lang.String str37 = localDate7.toString("2022-02-21", locale35);
        java.lang.String str38 = locale35.getDisplayVariant();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap39 = calendar1.getDisplayNames(100, (int) (byte) 10, locale35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(date2);
        org.junit.Assert.assertEquals(date2.toString(), "Thu Jan 01 00:00:00 UTC 1970");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 21 + "'", int10 == 21);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 3 + "'", int20 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateTimeFieldType30);
        org.junit.Assert.assertNotNull(property31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 8 + "'", int32 == 8);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2 + "'", int36 == 2);
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "2022-02-21" + "'", str37, "2022-02-21");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime localTime9 = localTime7.withMillisOfDay(54098460);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField11 = localTime7.getField(10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 10");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(localTime9);
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.DateTimeFormat.forPattern("\ub300\ud55c\ubbfc\uad6d");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.parse("java.util.GregorianCalendar[time=1645455702075,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=42,MILLISECOND=75,ZONE_OFFSET=0,DST_OFFSET=0]", dateTimeFormatter2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"java.util.GregorianCalendar[time...\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(0);
        int int6 = localDateTime5.getMillisOfDay();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.era();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.years();
        mutableDateTime8.add(durationFieldType10, (int) (short) 1);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime5.withFieldAdded(durationFieldType10, (int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime16 = localDateTime5.withHourOfDay(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455713658,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=53,MILLISECOND=658,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
// flaky:         org.junit.Assert.assertTrue("'" + int6 + "' != '" + 54113658 + "'", int6 == 54113658);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(localDateTime14);
    }

    @Test
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) '#', 901, 2922, 32770, 22, 111);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone3 = java.util.TimeZone.getTimeZone("years");
        boolean boolean4 = timeZone3.observesDaylightTime();
        boolean boolean5 = timeZone1.hasSameRules(timeZone3);
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        org.joda.time.Instant instant8 = instant6.withMillis((long) (short) 100);
        org.joda.time.ReadableDuration readableDuration9 = null;
        org.joda.time.Instant instant11 = instant8.withDurationAdded(readableDuration9, (int) (short) 0);
        boolean boolean13 = instant8.isBefore((long) 5);
        java.util.Date date14 = instant8.toDate();
        org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.fromDateFields(date14);
        date14.setYear(16);
        boolean boolean18 = timeZone3.inDaylightTime(date14);
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone3);
        org.junit.Assert.assertEquals(timeZone3.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + true + "'", boolean5 == true);
        org.junit.Assert.assertNotNull(instant8);
        org.junit.Assert.assertNotNull(instant11);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(date14);
        org.junit.Assert.assertEquals(date14.toString(), "Sat Jan 01 00:00:00 UTC 1916");
        org.junit.Assert.assertNotNull(localDateTime15);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        java.lang.Object obj1 = calendar0.clone();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455713702,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=53,MILLISECOND=702,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj1);
// flaky:         org.junit.Assert.assertEquals(obj1.toString(), "java.util.GregorianCalendar[time=1645455713702,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=53,MILLISECOND=702,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj1), "java.util.GregorianCalendar[time=1645455713702,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=53,MILLISECOND=702,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj1), "java.util.GregorianCalendar[time=1645455713702,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=53,MILLISECOND=702,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter0.getPrinter();
        int int4 = dateTimePrinter3.estimatePrintedLength();
        int int5 = dateTimePrinter3.estimatePrintedLength();
        java.io.Writer writer6 = null;
        java.util.Calendar calendar7 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.fromCalendarFields(calendar7);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property11 = localDateTime10.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime13 = localDateTime10.plusWeeks(100);
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.LocalDateTime localDateTime16 = localDateTime10.withDurationAdded(readableDuration14, 14);
        java.util.Locale locale17 = java.util.Locale.CANADA;
        java.lang.String str18 = locale17.getDisplayName();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter3.printTo(writer6, (org.joda.time.ReadablePartial) localDateTime10, locale17);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimePrinter3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40 + "'", int4 == 40);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 40 + "'", int5 == 40);
        org.junit.Assert.assertNotNull(calendar7);
// flaky:         org.junit.Assert.assertEquals(calendar7.toString(), "java.util.GregorianCalendar[time=1645455713730,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=53,MILLISECOND=730,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(property11);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "en_CA");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "English (Canada)" + "'", str18, "English (Canada)");
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.MutableDateTime.Property property9 = mutableDateTime8.millisOfDay();
        java.lang.String str11 = mutableDateTime8.toString("\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        int int12 = mutableDateTime8.getMonthOfYear();
        org.joda.time.MutableDateTime.Property property13 = mutableDateTime8.secondOfMinute();
        org.joda.time.Chronology chronology14 = mutableDateTime8.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime((int) (short) 100, 11, 8, (int) (short) -1, 54098460, 14, 54112697, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc" + "'", str11, "\uadf8\ub9ac\ub2c8\uce58\ud45c\uc900\uc2dc");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(chronology14);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        int int6 = localDate5.getDayOfMonth();
        org.joda.time.LocalDate localDate8 = localDate5.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        boolean boolean12 = mutableDateTime10.isAfter((long) 21);
        boolean boolean14 = mutableDateTime10.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        mutableDateTime10.setZone(dateTimeZone17);
        org.joda.time.DateTime dateTime19 = localDate5.toDateTimeAtStartOfDay(dateTimeZone17);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime(dateTimeZone17);
        org.joda.time.LocalDate localDate21 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate23 = localDate21.withWeekyear(3);
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        org.joda.time.DateTimeZone dateTimeZone28 = null;
        org.joda.time.MutableDateTime mutableDateTime29 = new org.joda.time.MutableDateTime(dateTimeZone28);
        org.joda.time.DateTimeZone dateTimeZone30 = mutableDateTime29.getZone();
        long long32 = dateTimeZone27.getMillisKeepLocal(dateTimeZone30, (long) 10);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(10L, dateTimeZone27);
        long long35 = dateTimeZone27.nextTransition((long) 12);
        org.joda.time.DateTime dateTime36 = localDate21.toDateTimeAtMidnight(dateTimeZone27);
        long long38 = dateTimeZone17.getMillisKeepLocal(dateTimeZone27, (long) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(48, 54113409, 12, 0, (int) (short) 100, dateTimeZone17);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertNotNull(dateTimeZone30);
        org.junit.Assert.assertTrue("'" + long32 + "' != '" + 10L + "'", long32 == 10L);
        org.junit.Assert.assertTrue("'" + long35 + "' != '" + 12L + "'", long35 == 12L);
        org.junit.Assert.assertNotNull(dateTime36);
        org.junit.Assert.assertTrue("'" + long38 + "' != '" + 35L + "'", long38 == 35L);
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(2, (int) 'u', 12, 21);
        java.util.Calendar.Builder builder10 = builder0.setDate(0, (int) (byte) 100, 21);
        java.util.Calendar calendar11 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime12 = org.joda.time.LocalDateTime.fromCalendarFields(calendar11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property15 = localDateTime14.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod16 = null;
        org.joda.time.LocalDateTime localDateTime18 = localDateTime14.withPeriodAdded(readablePeriod16, (int) (short) 100);
        int[] intArray19 = localDateTime18.getValues();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder20 = builder0.setFields(intArray19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645455713915,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=53,MILLISECOND=915,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(intArray19);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[2022, 10, 3, 54113915]");
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter0.getPrinter();
        int int4 = dateTimePrinter3.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer5 = null;
        org.joda.time.LocalDate localDate6 = org.joda.time.LocalDate.now();
        int int7 = localDate6.getDayOfMonth();
        org.joda.time.LocalDate localDate9 = localDate6.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property10 = localDate9.centuryOfEra();
        int int11 = property10.getMaximumValueOverall();
        org.joda.time.LocalDate localDate12 = property10.roundFloorCopy();
        org.joda.time.LocalDate localDate14 = localDate12.minusDays(12);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        org.joda.time.DateTimeField dateTimeField19 = dateTimeFieldType15.getField(chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.secondOfDay();
        java.util.Locale locale22 = java.util.Locale.FRANCE;
        java.lang.String str23 = dateTimeField20.getAsText(7, locale22);
        java.util.Locale locale24 = java.util.Locale.UK;
        java.util.Locale locale25 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet26 = locale25.getExtensionKeys();
        java.util.Locale locale27 = java.util.Locale.KOREA;
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.lang.String str29 = locale27.getDisplayScript(locale28);
        java.lang.String str30 = locale25.getDisplayScript(locale28);
        java.util.Locale locale31 = java.util.Locale.UK;
        java.lang.String str32 = locale25.getDisplayScript(locale31);
        java.lang.String str33 = locale24.getDisplayLanguage(locale31);
        java.lang.String str34 = locale22.getDisplayVariant(locale31);
        java.lang.String str35 = locale22.getDisplayScript();
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter3.printTo(stringBuffer5, (org.joda.time.ReadablePartial) localDate14, locale22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimePrinter3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40 + "'", int4 == 40);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 21 + "'", int7 == 21);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2922789 + "'", int11 == 2922789);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(localDate14);
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "7" + "'", str23, "7");
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet26);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "" + "'", str29, "");
        org.junit.Assert.assertEquals("'" + str30 + "' != '" + "" + "'", str30, "");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertEquals("'" + str33 + "' != '" + "English" + "'", str33, "English");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "" + "'", str35, "");
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear(13);
        java.util.Locale locale4 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter1.withLocale(locale4);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter5.withZoneUTC();
        boolean boolean7 = dateTimeFormatter5.isOffsetParsed();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology11 = localTime10.getChronology();
        org.joda.time.DateTimeField dateTimeField12 = dateTimeFieldType8.getField(chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.secondOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.hourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter15 = dateTimeFormatter5.withChronology(chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.parse("English", dateTimeFormatter5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"English\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertNotNull(dateTimeFormatter6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + false + "'", boolean7 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeFormatter15);
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        // The following exception was thrown during execution in test generation
        try {
            java.util.List<java.util.Locale.LanguageRange> languageRangeList1 = java.util.Locale.LanguageRange.parse("7");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=7");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        boolean boolean7 = mutableDateTime5.isAfter((long) 21);
        boolean boolean9 = mutableDateTime5.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        mutableDateTime5.setZone(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = localDate0.toDateTimeAtStartOfDay(dateTimeZone12);
        org.joda.time.LocalDate.Property property15 = localDate0.dayOfWeek();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((java.lang.Object) localDate0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        java.util.TimeZone timeZone1 = java.util.TimeZone.getTimeZone("years");
        boolean boolean2 = timeZone1.observesDaylightTime();
        java.util.Locale locale3 = java.util.Locale.UK;
        java.util.Locale locale4 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet5 = locale4.getExtensionKeys();
        java.util.Locale locale6 = java.util.Locale.KOREA;
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale6.getDisplayScript(locale7);
        java.lang.String str9 = locale4.getDisplayScript(locale7);
        java.util.Locale locale10 = java.util.Locale.UK;
        java.lang.String str11 = locale4.getDisplayScript(locale10);
        java.lang.String str12 = locale3.getDisplayLanguage(locale10);
        java.util.Calendar calendar13 = java.util.Calendar.getInstance(timeZone1, locale3);
        // The following exception was thrown during execution in test generation
        try {
            int int20 = timeZone1.getOffset((int) (short) 10, 54107140, 0, 54098460, 1, 54101869);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone1);
        org.junit.Assert.assertEquals(timeZone1.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet5);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "" + "'", str8, "");
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "" + "'", str9, "");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "English" + "'", str12, "English");
        org.junit.Assert.assertNotNull(calendar13);
// flaky:         org.junit.Assert.assertEquals(calendar13.toString(), "java.util.GregorianCalendar[time=1645455714382,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=54,MILLISECOND=382,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.minutes();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(54098460, 32770);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Minutes out of range: 32770");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.Instant instant0 = org.joda.time.Instant.now();
        org.joda.time.Instant instant2 = instant0.minus((long) 13);
        org.joda.time.Instant instant4 = instant2.minus((long) 901);
        org.joda.time.Chronology chronology5 = instant4.getChronology();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        boolean boolean9 = mutableDateTime7.isAfter((long) 21);
        boolean boolean11 = mutableDateTime7.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeZone dateTimeZone14 = mutableDateTime13.getZone();
        mutableDateTime7.setZone(dateTimeZone14);
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.lang.String str19 = locale17.getDisplayScript(locale18);
        java.lang.String str20 = locale17.getDisplayScript();
        java.lang.String str21 = dateTimeZone14.getShortName((long) 13, locale17);
        java.util.Calendar calendar22 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.fromCalendarFields(calendar22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusSeconds(0);
        boolean boolean28 = dateTimeZone14.isLocalDateTimeGap(localDateTime25);
        org.joda.time.ReadablePeriod readablePeriod29 = null;
        org.joda.time.LocalDateTime localDateTime30 = localDateTime25.plus(readablePeriod29);
        java.util.Date date31 = localDateTime30.toDate();
        int int32 = localDateTime30.getMonthOfYear();
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = null;
        boolean boolean34 = localDateTime30.isSupported(dateTimeFieldType33);
        int[] intArray35 = null;
        // The following exception was thrown during execution in test generation
        try {
            chronology5.validate((org.joda.time.ReadablePartial) localDateTime30, intArray35);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(instant0);
        org.junit.Assert.assertNotNull(instant2);
        org.junit.Assert.assertNotNull(instant4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + true + "'", boolean9 == true);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeZone14);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "+00:00" + "'", str21, "+00:00");
        org.junit.Assert.assertNotNull(calendar22);
// flaky:         org.junit.Assert.assertEquals(calendar22.toString(), "java.util.GregorianCalendar[time=1645455714722,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=54,MILLISECOND=722,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(date31);
// flaky:         org.junit.Assert.assertEquals(date31.toString(), "Mon Oct 03 15:01:54 UTC 2022");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 10 + "'", int32 == 10);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime5.add(readableDuration7, 0);
        mutableDateTime3.setTime((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.LocalTime localTime12 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType13 = org.joda.time.DurationFieldType.years();
        java.lang.String str14 = durationFieldType13.toString();
        boolean boolean15 = localTime12.isSupported(durationFieldType13);
        org.joda.time.DurationFieldType durationFieldType16 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime18 = localTime12.withFieldAdded(durationFieldType16, 32772);
        org.joda.time.LocalTime.Property property19 = localTime12.hourOfDay();
        org.joda.time.LocalTime localTime20 = property19.roundCeilingCopy();
        org.joda.time.LocalTime localTime22 = property19.addCopy(19);
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean26 = localTime24.equals((java.lang.Object) dateTimeFieldType25);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime29 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology30 = localTime29.getChronology();
        org.joda.time.DateTimeField dateTimeField31 = dateTimeFieldType27.getField(chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField33 = chronology30.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField34 = dateTimeFieldType25.getField(chronology30);
        boolean boolean35 = localTime22.isSupported(dateTimeFieldType25);
        org.joda.time.DurationFieldType durationFieldType36 = dateTimeFieldType25.getDurationType();
        int int37 = mutableDateTime5.get(dateTimeFieldType25);
        java.util.Calendar calendar38 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime39 = org.joda.time.LocalDateTime.fromCalendarFields(calendar38);
        org.joda.time.LocalDateTime localDateTime41 = localDateTime39.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property42 = localDateTime41.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField43 = property42.getField();
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = dateTimeField43.getType();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime5.setRounding(dateTimeField43, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 97");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(durationFieldType13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "years" + "'", str14, "years");
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(durationFieldType16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertTrue("'" + boolean35 + "' != '" + true + "'", boolean35 == true);
        org.junit.Assert.assertNotNull(durationFieldType36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 15 + "'", int37 == 15);
        org.junit.Assert.assertNotNull(calendar38);
// flaky:         org.junit.Assert.assertEquals(calendar38.toString(), "java.util.GregorianCalendar[time=1645455714746,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=54,MILLISECOND=746,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime39);
        org.junit.Assert.assertNotNull(localDateTime41);
        org.junit.Assert.assertNotNull(property42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.Locale locale0 = java.util.Locale.CANADA_FRENCH;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "fr_CA");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "fr_CA" + "'", str1, "fr_CA");
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forPattern("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(2000, 4, 772, 3, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 772 for dayOfMonth must be in the range [1,30]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        int int2 = calendar0.getActualMaximum(13);
        org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.years();
        java.lang.String str8 = durationFieldType7.toString();
        boolean boolean9 = localTime6.isSupported(durationFieldType7);
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime12 = localTime6.withFieldAdded(durationFieldType10, 32772);
        org.joda.time.LocalTime.Property property13 = localTime6.hourOfDay();
        org.joda.time.LocalTime localTime14 = property13.roundCeilingCopy();
        org.joda.time.LocalTime localTime16 = property13.addCopy(19);
        org.joda.time.LocalTime localTime18 = property13.setCopy((int) (short) 1);
        org.joda.time.LocalTime localTime19 = property13.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType20 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        org.joda.time.DateTimeField dateTimeField24 = dateTimeFieldType20.getField(chronology23);
        java.util.Locale locale25 = java.util.Locale.KOREA;
        java.util.Locale locale26 = java.util.Locale.KOREA;
        java.lang.String str27 = locale25.getDisplayScript(locale26);
        java.util.Locale locale28 = java.util.Locale.KOREA;
        java.lang.String str29 = locale28.toLanguageTag();
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = locale28.getDisplayCountry(locale30);
        java.lang.String str32 = locale26.getDisplayCountry(locale28);
        int int33 = dateTimeField24.getMaximumTextLength(locale26);
        java.lang.String str34 = property13.getAsText(locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Map<java.lang.String, java.lang.Integer> strMap35 = calendar0.getDisplayNames((int) (short) 1, 54096794, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455714928,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=54,MILLISECOND=928,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 59 + "'", int2 == 59);
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "years" + "'", str8, "years");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(localTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(localTime19);
        org.junit.Assert.assertNotNull(dateTimeFieldType20);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
        org.junit.Assert.assertNotNull(locale28);
        org.junit.Assert.assertEquals(locale28.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "ko-KR" + "'", str29, "ko-KR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str31, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str32, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2 + "'", int33 == 2);
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "0" + "'", str34, "0");
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = dateTimeFormatter0.parseDateTime("Korean");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Korean\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType2 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean3 = localTime1.equals((java.lang.Object) dateTimeFieldType2);
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType2.getField(chronology7);
        int int13 = dateTimeField11.getMinimumValue((-431366459990L));
        boolean boolean15 = dateTimeField11.isLeap((long) 54101869);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(dateTimeZone16);
        org.joda.time.DateTimeZone dateTimeZone18 = mutableDateTime17.getZone();
        int int20 = dateTimeZone18.getStandardOffset(0L);
        long long22 = dateTimeZone18.nextTransition((long) '#');
        org.joda.time.LocalDateTime localDateTime23 = org.joda.time.LocalDateTime.now(dateTimeZone18);
        org.joda.time.ReadablePeriod readablePeriod24 = null;
        org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minus(readablePeriod24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusSeconds(20);
        java.util.Calendar calendar29 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime30 = org.joda.time.LocalDateTime.fromCalendarFields(calendar29);
        org.joda.time.LocalDateTime localDateTime32 = localDateTime30.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property33 = localDateTime32.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod34 = null;
        org.joda.time.LocalDateTime localDateTime36 = localDateTime32.withPeriodAdded(readablePeriod34, (int) (short) 100);
        int[] intArray37 = localDateTime36.getValues();
        org.joda.time.DateTimeFieldType dateTimeFieldType39 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime41 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology42 = localTime41.getChronology();
        org.joda.time.DateTimeField dateTimeField43 = dateTimeFieldType39.getField(chronology42);
        org.joda.time.DateTimeField dateTimeField44 = chronology42.secondOfDay();
        int int47 = dateTimeField44.getDifference(1645455690671L, (long) (short) 100);
        long long49 = dateTimeField44.remainder((long) (short) 0);
        java.util.Locale locale50 = java.util.Locale.ITALIAN;
        int int51 = dateTimeField44.getMaximumTextLength(locale50);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray52 = dateTimeField11.set((org.joda.time.ReadablePartial) localDateTime25, 54096794, intArray37, "", locale50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localTime1);
        org.junit.Assert.assertNotNull(dateTimeFieldType2);
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + false + "'", boolean3 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateTimeZone18);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 35L + "'", long22 == 35L);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(localDateTime25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertNotNull(calendar29);
// flaky:         org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1645455715141,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=55,MILLISECOND=141,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertNotNull(localDateTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(intArray37);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[2022, 10, 3, 54115141]");
        org.junit.Assert.assertNotNull(dateTimeFieldType39);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateTimeField43);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 1645455690 + "'", int47 == 1645455690);
        org.junit.Assert.assertTrue("'" + long49 + "' != '" + 0L + "'", long49 == 0L);
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "it");
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 5 + "'", int51 == 5);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(6, (int) ' ', 12, 12, 2922);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2922 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguageTag("en_GB");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: en_GB [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone2.toString();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.lang.String str11 = locale10.toLanguageTag();
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale10.getDisplayCountry(locale12);
        java.lang.String str14 = dateTimeZone2.getName((long) 54089980, locale12);
        org.joda.time.LocalDate localDate15 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.Interval interval17 = localDate15.toInterval(dateTimeZone16);
        org.joda.time.LocalDate localDate19 = localDate15.plusMonths(0);
        org.joda.time.LocalDate.Property property20 = localDate19.year();
        int int21 = localDate19.size();
        org.joda.time.DateTimeZone dateTimeZone22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(dateTimeZone22);
        org.joda.time.DateTimeZone dateTimeZone24 = mutableDateTime23.getZone();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(dateTimeZone25);
        org.joda.time.DateTimeZone dateTimeZone27 = mutableDateTime26.getZone();
        long long29 = dateTimeZone24.getMillisKeepLocal(dateTimeZone27, (long) 10);
        org.joda.time.DateTime dateTime30 = localDate19.toDateTimeAtMidnight(dateTimeZone27);
        long long33 = dateTimeZone27.convertLocalToUTC(0L, false);
        java.util.Locale locale35 = java.util.Locale.getDefault();
        java.lang.String str36 = locale35.getISO3Language();
        java.lang.String str37 = locale35.getDisplayCountry();
        java.lang.String str38 = dateTimeZone27.getName(1664809302019L, locale35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime((java.lang.Object) 54089980, dateTimeZone27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Etc/UTC" + "'", str8, "Etc/UTC");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "ko-KR" + "'", str11, "ko-KR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str13, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "+00:00" + "'", str14, "+00:00");
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(interval17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(property20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 3 + "'", int21 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTimeZone27);
        org.junit.Assert.assertTrue("'" + long29 + "' != '" + 10L + "'", long29 == 10L);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertTrue("'" + long33 + "' != '" + 0L + "'", long33 == 0L);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "eng" + "'", str36, "eng");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "United Kingdom" + "'", str37, "United Kingdom");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withZoneUTC();
        boolean boolean6 = dateTimeFormatter4.isOffsetParsed();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter4.withChronology(chronology10);
        java.lang.Appendable appendable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter4.printTo(appendable15, 1646092800000L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withYearOfEra((int) '4');
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = localDate0.getFields();
        org.joda.time.LocalTime localTime5 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.years();
        java.lang.String str7 = durationFieldType6.toString();
        boolean boolean8 = localTime5.isSupported(durationFieldType6);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime11 = localTime5.withFieldAdded(durationFieldType9, 32772);
        org.joda.time.LocalTime.Property property12 = localTime5.hourOfDay();
        org.joda.time.LocalTime localTime14 = localTime5.minusMinutes(2922789);
        org.joda.time.Instant instant16 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology17 = instant16.getChronology();
        org.joda.time.MutableDateTime mutableDateTime18 = org.joda.time.MutableDateTime.now(chronology17);
        boolean boolean19 = localTime5.equals((java.lang.Object) chronology17);
        org.joda.time.DateTimeField dateTimeField20 = chronology17.dayOfMonth();
        org.joda.time.DateTimeField dateTimeField21 = chronology17.year();
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(chronology17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((java.lang.Object) localDate0, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'millisOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "years" + "'", str7, "years");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(mutableDateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeField21);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.monthOfYear();
        org.joda.time.DateTime dateTime2 = property1.roundHalfEvenCopy();
        org.joda.time.DateTime dateTime3 = dateTime2.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime2.withDayOfMonth(54113901);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54113901 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        java.util.Locale.LanguageRange[] languageRangeArray0 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList1 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean2 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList1, languageRangeArray0);
        java.lang.String[] strArray5 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList6 = new java.util.ArrayList<java.lang.String>();
        boolean boolean7 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList6, strArray5);
        java.lang.String str8 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.lang.String>) strList6);
        java.util.Locale.LanguageRange[] languageRangeArray9 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList10 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean11 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList10, languageRangeArray9);
        java.lang.String[] strArray14 = new java.lang.String[] { "hi!", "hi!" };
        java.util.ArrayList<java.lang.String> strList15 = new java.util.ArrayList<java.lang.String>();
        boolean boolean16 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strList15, strArray14);
        java.lang.String str17 = java.util.Locale.lookupTag((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strList15);
        java.util.Locale locale18 = java.util.Locale.KOREA;
        java.util.Locale locale19 = java.util.Locale.KOREA;
        java.lang.String str20 = locale18.getDisplayScript(locale19);
        java.util.Set<java.lang.String> strSet21 = locale18.getUnicodeLocaleKeys();
        java.util.Locale.FilteringMode filteringMode22 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList23 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList10, (java.util.Collection<java.lang.String>) strSet21, filteringMode22);
        java.util.Locale.LanguageRange[] languageRangeArray24 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList25 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean26 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25, languageRangeArray24);
        java.util.Locale.LanguageRange[] languageRangeArray27 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList28 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean29 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList28, languageRangeArray27);
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale30.getDisplayScript(locale31);
        java.util.Set<java.lang.String> strSet33 = locale30.getUnicodeLocaleKeys();
        java.util.Locale locale34 = java.util.Locale.KOREA;
        java.lang.String str35 = locale34.toLanguageTag();
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.lang.String str37 = locale34.getDisplayCountry(locale36);
        java.util.Locale locale38 = java.util.Locale.KOREA;
        java.util.Locale locale39 = java.util.Locale.KOREA;
        java.lang.String str40 = locale38.getDisplayScript(locale39);
        java.util.Locale[] localeArray41 = new java.util.Locale[] { locale30, locale36, locale39 };
        java.util.ArrayList<java.util.Locale> localeList42 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean43 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList42, localeArray41);
        java.util.Locale locale44 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.util.Locale>) localeList42);
        java.util.Locale locale45 = java.util.Locale.KOREA;
        java.util.Locale locale46 = java.util.Locale.KOREA;
        java.lang.String str47 = locale45.getDisplayScript(locale46);
        java.util.Set<java.lang.String> strSet48 = locale45.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet49 = locale45.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList50 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList28, (java.util.Collection<java.lang.String>) strSet49);
        java.util.Locale.FilteringMode filteringMode51 = java.util.Locale.FilteringMode.EXTENDED_FILTERING;
        java.util.List<java.lang.String> strList52 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.lang.String>) strList50, filteringMode51);
        boolean boolean53 = strSet21.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList25);
        java.util.stream.Stream<java.util.Locale.LanguageRange> languageRangeStream54 = languageRangeList25.parallelStream();
        java.util.Locale.LanguageRange[] languageRangeArray55 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList56 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean57 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList56, languageRangeArray55);
        java.util.Locale locale58 = java.util.Locale.KOREA;
        java.util.Locale locale59 = java.util.Locale.KOREA;
        java.lang.String str60 = locale58.getDisplayScript(locale59);
        java.util.Set<java.lang.String> strSet61 = locale58.getUnicodeLocaleKeys();
        java.util.Locale locale62 = java.util.Locale.KOREA;
        java.lang.String str63 = locale62.toLanguageTag();
        java.util.Locale locale64 = java.util.Locale.KOREA;
        java.lang.String str65 = locale62.getDisplayCountry(locale64);
        java.util.Locale locale66 = java.util.Locale.KOREA;
        java.util.Locale locale67 = java.util.Locale.KOREA;
        java.lang.String str68 = locale66.getDisplayScript(locale67);
        java.util.Locale[] localeArray69 = new java.util.Locale[] { locale58, locale64, locale67 };
        java.util.ArrayList<java.util.Locale> localeList70 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList70, localeArray69);
        java.util.Locale locale72 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.util.Locale>) localeList70);
        java.util.Locale locale73 = java.util.Locale.KOREA;
        java.util.Locale locale74 = java.util.Locale.KOREA;
        java.lang.String str75 = locale73.getDisplayScript(locale74);
        java.util.Set<java.lang.String> strSet76 = locale73.getUnicodeLocaleKeys();
        java.util.Set<java.lang.String> strSet77 = locale73.getUnicodeLocaleAttributes();
        java.util.List<java.lang.String> strList78 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.lang.String>) strSet77);
        java.util.Locale.LanguageRange[] languageRangeArray79 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList80 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList80, languageRangeArray79);
        java.util.Locale locale82 = java.util.Locale.KOREA;
        java.util.Locale locale83 = java.util.Locale.KOREA;
        java.lang.String str84 = locale82.getDisplayScript(locale83);
        java.util.Set<java.lang.String> strSet85 = locale82.getUnicodeLocaleKeys();
        java.util.Locale locale86 = java.util.Locale.KOREA;
        java.lang.String str87 = locale86.toLanguageTag();
        java.util.Locale locale88 = java.util.Locale.KOREA;
        java.lang.String str89 = locale86.getDisplayCountry(locale88);
        java.util.Locale locale90 = java.util.Locale.KOREA;
        java.util.Locale locale91 = java.util.Locale.KOREA;
        java.lang.String str92 = locale90.getDisplayScript(locale91);
        java.util.Locale[] localeArray93 = new java.util.Locale[] { locale82, locale88, locale91 };
        java.util.ArrayList<java.util.Locale> localeList94 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean95 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList94, localeArray93);
        java.util.Locale locale96 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList80, (java.util.Collection<java.util.Locale>) localeList94);
        java.util.List<java.util.Locale> localeList97 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList56, (java.util.Collection<java.util.Locale>) localeList94);
        java.util.List<java.util.Locale> localeList98 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList25, (java.util.Collection<java.util.Locale>) localeList94);
        java.util.Locale locale99 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList1, (java.util.Collection<java.util.Locale>) localeList94);
        org.junit.Assert.assertNotNull(languageRangeArray0);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + false + "'", boolean2 == false);
        org.junit.Assert.assertNotNull(strArray5);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(languageRangeArray9);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(strArray14);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNull(str17);
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
        org.junit.Assert.assertNotNull(strSet21);
        org.junit.Assert.assertTrue("'" + filteringMode22 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode22.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList23);
        org.junit.Assert.assertNotNull(languageRangeArray24);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
        org.junit.Assert.assertNotNull(languageRangeArray27);
        org.junit.Assert.assertTrue("'" + boolean29 + "' != '" + false + "'", boolean29 == false);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(strSet33);
        org.junit.Assert.assertNotNull(locale34);
        org.junit.Assert.assertEquals(locale34.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "ko-KR" + "'", str35, "ko-KR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str37, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertNotNull(localeArray41);
        org.junit.Assert.assertTrue("'" + boolean43 + "' != '" + true + "'", boolean43 == true);
        org.junit.Assert.assertNull(locale44);
        org.junit.Assert.assertNotNull(locale45);
        org.junit.Assert.assertEquals(locale45.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale46);
        org.junit.Assert.assertEquals(locale46.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str47 + "' != '" + "" + "'", str47, "");
        org.junit.Assert.assertNotNull(strSet48);
        org.junit.Assert.assertNotNull(strSet49);
        org.junit.Assert.assertNotNull(strList50);
        org.junit.Assert.assertTrue("'" + filteringMode51 + "' != '" + java.util.Locale.FilteringMode.EXTENDED_FILTERING + "'", filteringMode51.equals(java.util.Locale.FilteringMode.EXTENDED_FILTERING));
        org.junit.Assert.assertNotNull(strList52);
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
        org.junit.Assert.assertNotNull(languageRangeStream54);
        org.junit.Assert.assertNotNull(languageRangeArray55);
        org.junit.Assert.assertTrue("'" + boolean57 + "' != '" + false + "'", boolean57 == false);
        org.junit.Assert.assertNotNull(locale58);
        org.junit.Assert.assertEquals(locale58.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str60 + "' != '" + "" + "'", str60, "");
        org.junit.Assert.assertNotNull(strSet61);
        org.junit.Assert.assertNotNull(locale62);
        org.junit.Assert.assertEquals(locale62.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str63 + "' != '" + "ko-KR" + "'", str63, "ko-KR");
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str65, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertNotNull(locale66);
        org.junit.Assert.assertEquals(locale66.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale67);
        org.junit.Assert.assertEquals(locale67.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str68 + "' != '" + "" + "'", str68, "");
        org.junit.Assert.assertNotNull(localeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + true + "'", boolean71 == true);
        org.junit.Assert.assertNull(locale72);
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale74);
        org.junit.Assert.assertEquals(locale74.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str75 + "' != '" + "" + "'", str75, "");
        org.junit.Assert.assertNotNull(strSet76);
        org.junit.Assert.assertNotNull(strSet77);
        org.junit.Assert.assertNotNull(strList78);
        org.junit.Assert.assertNotNull(languageRangeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertNotNull(locale82);
        org.junit.Assert.assertEquals(locale82.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale83);
        org.junit.Assert.assertEquals(locale83.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str84 + "' != '" + "" + "'", str84, "");
        org.junit.Assert.assertNotNull(strSet85);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str87 + "' != '" + "ko-KR" + "'", str87, "ko-KR");
        org.junit.Assert.assertNotNull(locale88);
        org.junit.Assert.assertEquals(locale88.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str89 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str89, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertNotNull(locale90);
        org.junit.Assert.assertEquals(locale90.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale91);
        org.junit.Assert.assertEquals(locale91.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str92 + "' != '" + "" + "'", str92, "");
        org.junit.Assert.assertNotNull(localeArray93);
        org.junit.Assert.assertTrue("'" + boolean95 + "' != '" + true + "'", boolean95 == true);
        org.junit.Assert.assertNull(locale96);
        org.junit.Assert.assertNotNull(localeList97);
        org.junit.Assert.assertNotNull(localeList98);
        org.junit.Assert.assertNull(locale99);
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        java.lang.String str8 = durationFieldType5.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime11 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology12 = localTime11.getChronology();
        org.joda.time.DateTimeField dateTimeField13 = dateTimeFieldType9.getField(chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.secondOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.hourOfDay();
        boolean boolean16 = durationFieldType5.isSupported(chronology12);
        org.joda.time.DateTimeField dateTimeField17 = chronology12.dayOfYear();
        org.joda.time.LocalTime localTime19 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType20 = org.joda.time.DurationFieldType.years();
        java.lang.String str21 = durationFieldType20.toString();
        boolean boolean22 = localTime19.isSupported(durationFieldType20);
        org.joda.time.DurationFieldType durationFieldType23 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime25 = localTime19.withFieldAdded(durationFieldType23, 32772);
        org.joda.time.LocalTime.Property property26 = localTime19.hourOfDay();
        org.joda.time.LocalTime localTime27 = property26.getLocalTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale29 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter30 = dateTimeFormatter28.withLocale(locale29);
        java.lang.String str31 = localTime27.toString(dateTimeFormatter30);
        int[] intArray36 = new int[] { 54092146, 6, 279 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray38 = dateTimeField17.add((org.joda.time.ReadablePartial) localTime27, (-3600000), intArray36, 111);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -3600000");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "halfdays" + "'", str8, "halfdays");
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertNotNull(localTime11);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationFieldType20);
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "years" + "'", str21, "years");
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(durationFieldType23);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(dateTimeFormatter28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter30);
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "00:00" + "'", str31, "00:00");
        org.junit.Assert.assertNotNull(intArray36);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray36), "[54092146, 6, 279]");
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.LocalTime.Property property8 = localTime1.hourOfDay();
        org.joda.time.LocalTime localTime10 = localTime1.minusMinutes(19);
        org.joda.time.Chronology chronology11 = localTime1.getChronology();
        org.joda.time.MutableDateTime mutableDateTime12 = org.joda.time.MutableDateTime.now(chronology11);
        org.joda.time.Instant instant15 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology16 = instant15.getChronology();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology16);
        org.joda.time.DateTimeField dateTimeField18 = chronology16.clockhourOfHalfday();
        mutableDateTime12.setRounding(dateTimeField18, (int) (byte) 1);
        // The following exception was thrown during execution in test generation
        try {
            long long23 = dateTimeField18.set((long) (byte) 1, "21-Feb-2022 15:01:41");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"21-Feb-2022 15:01:41\" for clockhourOfHalfday is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(mutableDateTime12);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(dateTimeField18);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
        boolean boolean1 = mutableDateTime0.isAfterNow();
        org.joda.time.ReadableDuration readableDuration2 = null;
        mutableDateTime0.add(readableDuration2, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        org.joda.time.DateTimeZone dateTimeZone7 = mutableDateTime6.getZone();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        org.joda.time.DateTimeZone dateTimeZone10 = mutableDateTime9.getZone();
        long long12 = dateTimeZone7.getMillisKeepLocal(dateTimeZone10, (long) 10);
        boolean boolean13 = dateTimeZone10.isFixed();
        mutableDateTime0.setZoneRetainFields(dateTimeZone10);
        int int15 = mutableDateTime0.getYearOfCentury();
        mutableDateTime0.setHourOfDay(0);
        org.junit.Assert.assertNotNull(mutableDateTime0);
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 10L + "'", long12 == 10L);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + true + "'", boolean13 == true);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 22 + "'", int15 == 22);
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate2 = localDate0.withWeekyear(3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType4 = localDate0.getFieldType(2922789);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 2922789");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(localDate2);
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setExtension('#', "centuryOfEra");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.format.DateTimePrinter dateTimePrinter3 = dateTimeFormatter0.getPrinter();
        int int4 = dateTimePrinter3.estimatePrintedLength();
        int int5 = dateTimePrinter3.estimatePrintedLength();
        java.lang.StringBuffer stringBuffer6 = null;
        org.joda.time.Instant instant9 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology10 = instant9.getChronology();
        org.joda.time.DurationField durationField11 = chronology10.weekyears();
        org.joda.time.DateTimeField dateTimeField12 = chronology10.yearOfEra();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        org.joda.time.DateTime dateTime17 = org.joda.time.DateTime.now(dateTimeZone16);
        int int19 = dateTimeZone16.getOffsetFromLocal((long) (byte) -1);
        org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now();
        int int21 = localDate20.getDayOfMonth();
        org.joda.time.LocalDate localDate23 = localDate20.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property24 = localDate23.centuryOfEra();
        int int25 = property24.getMaximumValueOverall();
        java.util.Locale locale26 = java.util.Locale.UK;
        java.util.Locale locale27 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet28 = locale27.getExtensionKeys();
        java.util.Locale locale29 = java.util.Locale.KOREA;
        java.util.Locale locale30 = java.util.Locale.KOREA;
        java.lang.String str31 = locale29.getDisplayScript(locale30);
        java.lang.String str32 = locale27.getDisplayScript(locale30);
        java.util.Locale locale33 = java.util.Locale.UK;
        java.lang.String str34 = locale27.getDisplayScript(locale33);
        java.lang.String str35 = locale26.getDisplayLanguage(locale33);
        java.util.Locale.setDefault(locale26);
        int int37 = property24.getMaximumTextLength(locale26);
        // The following exception was thrown during execution in test generation
        try {
            dateTimePrinter3.printTo(stringBuffer6, (long) 16, chronology10, (int) (byte) 100, dateTimeZone16, locale26);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimePrinter3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 40 + "'", int4 == 40);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 40 + "'", int5 == 40);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(durationField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 0 + "'", int19 == 0);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 21 + "'", int21 == 21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(property24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2922789 + "'", int25 == 2922789);
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet28);
        org.junit.Assert.assertNotNull(locale29);
        org.junit.Assert.assertEquals(locale29.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str31 + "' != '" + "" + "'", str31, "");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "" + "'", str32, "");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "" + "'", str34, "");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "English" + "'", str35, "English");
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 7 + "'", int37 == 7);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusMillis((-1));
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusMonths((int) (short) 100);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withCenturyOfEra(1);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.shortTime();
        java.lang.String str11 = localDateTime9.toString(dateTimeFormatter10);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.longDateTime();
        java.lang.String str13 = localDateTime9.toString(dateTimeFormatter12);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withZoneUTC();
        java.lang.Appendable appendable15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(appendable15, (long) 54107140);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455716289,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=56,MILLISECOND=289,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(dateTimeFormatter10);
// flaky:         org.junit.Assert.assertEquals("'" + str11 + "' != '" + "15:01" + "'", str11, "15:01");
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
// flaky:         org.junit.Assert.assertEquals("'" + str13 + "' != '" + "21 June 0130 15:01:56 " + "'", str13, "21 June 0130 15:01:56 ");
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusYears(14);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime8 = localDateTime1.withDurationAdded(readableDuration6, 20);
        org.joda.time.LocalDateTime localDateTime10 = localDateTime1.minusWeeks((int) (short) 100);
        int int11 = localDateTime10.getDayOfWeek();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455716344,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=56,MILLISECOND=344,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime8);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = property4.setCopy(19);
        org.joda.time.LocalDateTime.Property property7 = localDateTime6.minuteOfHour();
        org.joda.time.LocalDateTime localDateTime9 = property7.setCopy(21);
        org.joda.time.LocalDateTime localDateTime10 = property7.roundFloorCopy();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455716356,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=56,MILLISECOND=356,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime10);
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DurationField durationField6 = chronology3.seconds();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.now(chronology3);
        org.joda.time.MutableDateTime mutableDateTime8 = org.joda.time.MutableDateTime.now(chronology3);
        org.joda.time.DurationField durationField9 = chronology3.weeks();
        // The following exception was thrown during execution in test generation
        try {
            long long17 = chronology3.getDateTimeMillis((int) (short) 10, 1, 772, 9, 54099886, (int) (byte) -1, 54113472);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54099886 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertNotNull(durationField9);
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.longTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("dayOfYear", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"dayOfYear\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withCenturyOfEra((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime8 = dateTime1.withDate(54100989, 2000, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2000 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.DurationFieldType durationFieldType5 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime7 = localTime1.withFieldAdded(durationFieldType5, 32772);
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(dateTimeZone8);
        boolean boolean11 = mutableDateTime9.isAfter((long) 21);
        boolean boolean13 = mutableDateTime9.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        mutableDateTime9.setZone(dateTimeZone16);
        org.joda.time.DateTime dateTime18 = localTime1.toDateTimeToday(dateTimeZone16);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime21 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology22 = localTime21.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = dateTimeFieldType19.getField(chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) dateTimeZone16, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(durationFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + true + "'", boolean11 == true);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        mutableDateTime1.setMinuteOfDay(100);
        org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.Interval interval6 = localDate4.toInterval(dateTimeZone5);
        org.joda.time.LocalDate localDate8 = localDate4.plusMonths(0);
        org.joda.time.LocalDate.Property property9 = localDate8.year();
        int int10 = localDate8.size();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(dateTimeZone14);
        org.joda.time.DateTimeZone dateTimeZone16 = mutableDateTime15.getZone();
        long long18 = dateTimeZone13.getMillisKeepLocal(dateTimeZone16, (long) 10);
        org.joda.time.DateTime dateTime19 = localDate8.toDateTimeAtMidnight(dateTimeZone16);
        int int20 = mutableDateTime1.compareTo((org.joda.time.ReadableInstant) dateTime19);
        org.joda.time.LocalDate localDate21 = dateTime19.toLocalDate();
        org.joda.time.DateTime dateTime22 = dateTime19.toDateTime();
        org.joda.time.Instant instant23 = dateTime19.toInstant();
        org.joda.time.ReadableDuration readableDuration24 = null;
        org.joda.time.Instant instant26 = instant23.withDurationAdded(readableDuration24, 54092654);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(interval6);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 3 + "'", int10 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTimeZone16);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 10L + "'", long18 == 10L);
        org.junit.Assert.assertNotNull(dateTime19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 1 + "'", int20 == 1);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(instant23);
        org.junit.Assert.assertNotNull(instant26);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.era();
        org.joda.time.MutableDateTime mutableDateTime3 = property2.roundHalfCeiling();
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(dateTimeZone4);
        org.joda.time.DateTimeZone dateTimeZone6 = mutableDateTime5.getZone();
        org.joda.time.ReadableDuration readableDuration7 = null;
        mutableDateTime5.add(readableDuration7, 0);
        mutableDateTime3.setTime((org.joda.time.ReadableInstant) mutableDateTime5);
        org.joda.time.MutableDateTime.Property property11 = mutableDateTime3.era();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime13 = property11.add(32770);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: eras field is unsupported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(mutableDateTime3);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(property11);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfDay();
        org.joda.time.DateTimeField dateTimeField6 = chronology3.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = chronology3.yearOfCentury();
        boolean boolean8 = dateTimeField7.isSupported();
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime6 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology7 = localTime6.getChronology();
        org.joda.time.DateTimeField dateTimeField8 = dateTimeFieldType4.getField(chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.secondOfMinute();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        java.lang.String str11 = dateTimeField10.getName();
        long long14 = dateTimeField10.getDifferenceAsLong((long) (byte) 0, (long) 54096794);
        org.joda.time.DateTimeFieldType dateTimeFieldType15 = dateTimeField10.getType();
        org.joda.time.LocalTime localTime17 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType18 = org.joda.time.DurationFieldType.years();
        java.lang.String str19 = durationFieldType18.toString();
        boolean boolean20 = localTime17.isSupported(durationFieldType18);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime23 = localTime17.withFieldAdded(durationFieldType21, 32772);
        java.lang.String str24 = durationFieldType21.toString();
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology28 = localTime27.getChronology();
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType25.getField(chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.secondOfDay();
        org.joda.time.DateTimeField dateTimeField31 = chronology28.hourOfDay();
        boolean boolean32 = durationFieldType21.isSupported(chronology28);
        org.joda.time.Instant instant35 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology36 = instant35.getChronology();
        org.joda.time.LocalTime localTime37 = org.joda.time.LocalTime.fromMillisOfDay((long) 20, chronology36);
        org.joda.time.DateTimeField dateTimeField38 = chronology36.clockhourOfHalfday();
        boolean boolean39 = durationFieldType21.isSupported(chronology36);
        org.joda.time.DateTime dateTime40 = org.joda.time.DateTime.now(chronology36);
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType15.getField(chronology36);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime42 = new org.joda.time.LocalTime(32770, 0, 54101692, 0, chronology36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32770 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "halfdayOfDay" + "'", str11, "halfdayOfDay");
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + (-1L) + "'", long14 == (-1L));
        org.junit.Assert.assertNotNull(dateTimeFieldType15);
        org.junit.Assert.assertNotNull(durationFieldType18);
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "years" + "'", str19, "years");
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "halfdays" + "'", str24, "halfdays");
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localTime27);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(dateTimeField31);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(localTime37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertTrue("'" + boolean39 + "' != '" + true + "'", boolean39 == true);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTimeField41);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.DateTimeField dateTimeField5 = property4.getField();
        long long8 = dateTimeField5.addWrapField((long) 2022, 52);
        int int10 = dateTimeField5.getLeapAmount((long) 9);
        org.joda.time.LocalDate localDate11 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone12 = null;
        org.joda.time.Interval interval13 = localDate11.toInterval(dateTimeZone12);
        org.joda.time.LocalDate localDate15 = localDate11.plusMonths(0);
        org.joda.time.LocalDate.Property property16 = localDate15.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod17 = null;
        org.joda.time.LocalDate localDate18 = localDate15.minus(readablePeriod17);
        int[] intArray21 = new int[] { 111 };
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray23 = dateTimeField5.add((org.joda.time.ReadablePartial) localDate18, 54113409, intArray21, 19);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54113409");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455717273,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=57,MILLISECOND=273,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 2074L + "'", long8 == 2074L);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 0 + "'", int10 == 0);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(interval13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(intArray21);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray21), "[111]");
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology8 = instant7.getChronology();
        org.joda.time.DurationField durationField9 = chronology8.weekyears();
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.now(chronology8);
        org.joda.time.ReadablePeriod readablePeriod11 = null;
        long long14 = chronology8.add(readablePeriod11, (long) 48, 2122);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((int) (byte) -1, 54101869, 54101692, 54092146, 1645455690, 279, chronology8);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54092146 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 48L + "'", long14 == 48L);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDate localDate3 = localDate0.plus(readablePeriod2);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = localDate0.toString("2022-02-21T15:01:47.331Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        boolean boolean5 = mutableDateTime1.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(dateTimeZone6);
        org.joda.time.DateTimeZone dateTimeZone8 = mutableDateTime7.getZone();
        mutableDateTime1.setZone(dateTimeZone8);
        java.util.Locale locale11 = java.util.Locale.KOREA;
        java.util.Locale locale12 = java.util.Locale.KOREA;
        java.lang.String str13 = locale11.getDisplayScript(locale12);
        java.lang.String str14 = locale11.getDisplayScript();
        java.lang.String str15 = dateTimeZone8.getShortName((long) 13, locale11);
        java.util.Calendar calendar16 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime17 = org.joda.time.LocalDateTime.fromCalendarFields(calendar16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime21 = localDateTime19.plusSeconds(0);
        boolean boolean22 = dateTimeZone8.isLocalDateTimeGap(localDateTime19);
        org.joda.time.ReadablePeriod readablePeriod23 = null;
        org.joda.time.LocalDateTime localDateTime24 = localDateTime19.plus(readablePeriod23);
        org.joda.time.DateTimeFieldType dateTimeFieldType25 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime27 = localDateTime19.withField(dateTimeFieldType25, 40);
        int int28 = localDateTime19.getMonthOfYear();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateTimeZone8);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "+00:00" + "'", str15, "+00:00");
        org.junit.Assert.assertNotNull(calendar16);
// flaky:         org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645455717328,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=57,MILLISECOND=328,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
        org.junit.Assert.assertNotNull(localDateTime24);
        org.junit.Assert.assertNotNull(dateTimeFieldType25);
        org.junit.Assert.assertNotNull(localDateTime27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 10 + "'", int28 == 10);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        java.util.Locale locale16 = java.util.Locale.KOREA;
        java.lang.String str17 = locale16.toLanguageTag();
        boolean boolean18 = localDate4.equals((java.lang.Object) str17);
        org.joda.time.LocalDate localDate20 = localDate4.minusWeeks(0);
        org.joda.time.ReadablePeriod readablePeriod21 = null;
        org.joda.time.LocalDate localDate23 = localDate20.withPeriodAdded(readablePeriod21, 12);
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.DateTime dateTime25 = localDate23.toDateTimeAtCurrentTime(dateTimeZone24);
        org.joda.time.DateTime.Property property26 = dateTime25.monthOfYear();
        org.joda.time.DateTime.Property property27 = dateTime25.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = dateTime25.withDayOfYear(54113472);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54113472 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "ko-KR" + "'", str17, "ko-KR");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(property26);
        org.junit.Assert.assertNotNull(property27);
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone10);
        // The following exception was thrown during execution in test generation
        try {
            int int13 = calendar11.get(54101869);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 54101869");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Etc/UTC" + "'", str8, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645455717480,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=57,MILLISECOND=480,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(279, 54107938, (int) (byte) 0, 2000);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 279 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.DateTime.Property property1 = dateTime0.monthOfYear();
        org.joda.time.DateTime dateTime2 = property1.roundHalfEvenCopy();
        int int3 = dateTime2.getMonthOfYear();
        org.junit.Assert.assertNotNull(property1);
        org.junit.Assert.assertNotNull(dateTime2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 3 + "'", int3 == 3);
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.io.IOException iOException0 = new java.io.IOException();
        java.lang.String str1 = iOException0.toString();
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "java.io.IOException" + "'", str1, "java.io.IOException");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.Instant instant0 = new org.joda.time.Instant();
        org.joda.time.DateTime dateTime1 = instant0.toDateTime();
        org.joda.time.DateTime.Property property2 = dateTime1.weekOfWeekyear();
        org.joda.time.DateTime dateTime4 = dateTime1.withHourOfDay((int) (short) 0);
        org.joda.time.DateTime dateTime6 = dateTime1.minus((long) 54101869);
        org.joda.time.DateTime dateTime8 = dateTime1.minusYears(0);
        org.junit.Assert.assertNotNull(dateTime1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateTime8);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        boolean boolean2 = calendar0.isWeekDateSupported();
        calendar0.setFirstDayOfWeek(5);
        calendar0.setTimeInMillis((long) 100);
        // The following exception was thrown during execution in test generation
        try {
            int int8 = calendar0.getActualMinimum(2122);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2122");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=100,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=5,minimalDaysInFirstWeek=4,ERA=1,YEAR=1970,MONTH=0,WEEK_OF_YEAR=1,WEEK_OF_MONTH=1,DAY_OF_MONTH=1,DAY_OF_YEAR=1,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=1,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=100,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.DateTimeField dateTimeField5 = chronology3.secondOfMinute();
        org.joda.time.DurationField durationField6 = dateTimeField5.getDurationField();
        org.joda.time.LocalTime localTime8 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType9 = org.joda.time.DurationFieldType.years();
        java.lang.String str10 = durationFieldType9.toString();
        boolean boolean11 = localTime8.isSupported(durationFieldType9);
        org.joda.time.DurationFieldType durationFieldType12 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime14 = localTime8.withFieldAdded(durationFieldType12, 32772);
        org.joda.time.LocalTime localTime16 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType17 = org.joda.time.DateTimeFieldType.hourOfDay();
        boolean boolean18 = localTime16.equals((java.lang.Object) dateTimeFieldType17);
        org.joda.time.LocalTime.Property property19 = localTime8.property(dateTimeFieldType17);
        org.joda.time.LocalTime localTime20 = property19.withMaximumValue();
        int int21 = dateTimeField5.getMinimumValue((org.joda.time.ReadablePartial) localTime20);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetHoursMinutes(21, 1);
        org.joda.time.DateTime dateTime25 = localTime20.toDateTimeToday(dateTimeZone24);
        org.joda.time.LocalDate localDate27 = org.joda.time.LocalDate.now();
        int int28 = localDate27.getDayOfMonth();
        org.joda.time.LocalDate localDate30 = localDate27.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone31 = null;
        org.joda.time.MutableDateTime mutableDateTime32 = new org.joda.time.MutableDateTime(dateTimeZone31);
        boolean boolean34 = mutableDateTime32.isAfter((long) 21);
        boolean boolean36 = mutableDateTime32.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime(dateTimeZone37);
        org.joda.time.DateTimeZone dateTimeZone39 = mutableDateTime38.getZone();
        mutableDateTime32.setZone(dateTimeZone39);
        org.joda.time.DateTime dateTime41 = localDate27.toDateTimeAtStartOfDay(dateTimeZone39);
        org.joda.time.DateTime dateTime42 = new org.joda.time.DateTime(dateTimeZone39);
        org.joda.time.LocalDate localDate43 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate45 = localDate43.withWeekyear(3);
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.MutableDateTime mutableDateTime48 = new org.joda.time.MutableDateTime(dateTimeZone47);
        org.joda.time.DateTimeZone dateTimeZone49 = mutableDateTime48.getZone();
        org.joda.time.DateTimeZone dateTimeZone50 = null;
        org.joda.time.MutableDateTime mutableDateTime51 = new org.joda.time.MutableDateTime(dateTimeZone50);
        org.joda.time.DateTimeZone dateTimeZone52 = mutableDateTime51.getZone();
        long long54 = dateTimeZone49.getMillisKeepLocal(dateTimeZone52, (long) 10);
        org.joda.time.DateTime dateTime55 = new org.joda.time.DateTime(10L, dateTimeZone49);
        long long57 = dateTimeZone49.nextTransition((long) 12);
        org.joda.time.DateTime dateTime58 = localDate43.toDateTimeAtMidnight(dateTimeZone49);
        long long60 = dateTimeZone39.getMillisKeepLocal(dateTimeZone49, (long) '#');
        org.joda.time.MutableDateTime mutableDateTime61 = new org.joda.time.MutableDateTime(dateTimeZone39);
        java.util.Locale locale64 = java.util.Locale.forLanguageTag("hi!");
        java.lang.String str65 = mutableDateTime61.toString("\ufffd\ufffd\ufffd\ufffd", locale64);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str66 = localTime20.toString("2022-02-21T15:01:40.004Z", locale64);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: T");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(dateTimeField5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertNotNull(durationFieldType9);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "years" + "'", str10, "years");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(durationFieldType12);
        org.junit.Assert.assertNotNull(localTime14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(dateTimeFieldType17);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(localTime20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 0 + "'", int21 == 0);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 21 + "'", int28 == 21);
        org.junit.Assert.assertNotNull(localDate30);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + false + "'", boolean36 == false);
        org.junit.Assert.assertNotNull(dateTimeZone39);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localDate43);
        org.junit.Assert.assertNotNull(localDate45);
        org.junit.Assert.assertNotNull(dateTimeZone49);
        org.junit.Assert.assertNotNull(dateTimeZone52);
        org.junit.Assert.assertTrue("'" + long54 + "' != '" + 10L + "'", long54 == 10L);
        org.junit.Assert.assertTrue("'" + long57 + "' != '" + 12L + "'", long57 == 12L);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertTrue("'" + long60 + "' != '" + 35L + "'", long60 == 35L);
        org.junit.Assert.assertNotNull(locale64);
        org.junit.Assert.assertEquals(locale64.toString(), "");
        org.junit.Assert.assertEquals("'" + str65 + "' != '" + "\ufffd\ufffd\ufffd\ufffd" + "'", str65, "\ufffd\ufffd\ufffd\ufffd");
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.plusYears(14);
        org.joda.time.LocalDateTime.Property property6 = localDateTime1.hourOfDay();
        org.joda.time.DateTimeField dateTimeField7 = property6.getField();
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.Interval interval10 = localDate8.toInterval(dateTimeZone9);
        org.joda.time.LocalDate localDate12 = localDate8.plusMonths(0);
        org.joda.time.LocalDate.Property property13 = localDate12.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod14 = null;
        org.joda.time.LocalDate localDate15 = localDate12.minus(readablePeriod14);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate18 = localDate16.withYearOfEra((int) '4');
        boolean boolean19 = localDate15.isBefore((org.joda.time.ReadablePartial) localDate16);
        org.joda.time.LocalTime localTime22 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology23 = localTime22.getChronology();
        int[] intArray24 = localTime22.getValues();
        org.joda.time.LocalDate localDate26 = org.joda.time.LocalDate.now();
        int int27 = localDate26.getDayOfMonth();
        org.joda.time.LocalDate localDate29 = localDate26.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property30 = localDate29.centuryOfEra();
        int int31 = property30.getMaximumValueOverall();
        java.util.Locale locale32 = java.util.Locale.UK;
        java.util.Locale locale33 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet34 = locale33.getExtensionKeys();
        java.util.Locale locale35 = java.util.Locale.KOREA;
        java.util.Locale locale36 = java.util.Locale.KOREA;
        java.lang.String str37 = locale35.getDisplayScript(locale36);
        java.lang.String str38 = locale33.getDisplayScript(locale36);
        java.util.Locale locale39 = java.util.Locale.UK;
        java.lang.String str40 = locale33.getDisplayScript(locale39);
        java.lang.String str41 = locale32.getDisplayLanguage(locale39);
        java.util.Locale.setDefault(locale32);
        int int43 = property30.getMaximumTextLength(locale32);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray44 = dateTimeField7.set((org.joda.time.ReadablePartial) localDate16, (int) '4', intArray24, "-2022-10-03T15:01:54.854", locale32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"-2022-10-03T15:01:54.854\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455717772,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=57,MILLISECOND=772,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(dateTimeField7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(interval10);
        org.junit.Assert.assertNotNull(localDate12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localTime22);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(intArray24);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray24), "[0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 21 + "'", int27 == 21);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2922789 + "'", int31 == 2922789);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet34);
        org.junit.Assert.assertNotNull(locale35);
        org.junit.Assert.assertEquals(locale35.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "" + "'", str38, "");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str40 + "' != '" + "" + "'", str40, "");
        org.junit.Assert.assertEquals("'" + str41 + "' != '" + "English" + "'", str41, "English");
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 7 + "'", int43 == 7);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder1.setUnicodeLocaleKeyword("2022-02-21T15:01:53.332", "2022-02-21T15:01:40.004Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale keyword key: 2022-02-21T15:01:53.332 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(1L);
        int int2 = mutableDateTime1.getCenturyOfEra();
        int int3 = mutableDateTime1.getDayOfYear();
        org.joda.time.MutableDateTime.Property property4 = mutableDateTime1.minuteOfHour();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime7 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology8 = localTime7.getChronology();
        org.joda.time.DateTimeField dateTimeField9 = dateTimeFieldType5.getField(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.secondOfMinute();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime1.setRounding(dateTimeField10, 1501);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: 1501");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 19 + "'", int2 == 19);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1 + "'", int3 == 1);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(localTime7);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        java.util.Locale locale3 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = dateTimeFormatter0.withLocale(locale3);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter5 = dateTimeFormatter4.withZoneUTC();
        boolean boolean6 = dateTimeFormatter4.isOffsetParsed();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime9 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology10 = localTime9.getChronology();
        org.joda.time.DateTimeField dateTimeField11 = dateTimeFieldType7.getField(chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.secondOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.hourOfDay();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter4.withChronology(chronology10);
        java.lang.StringBuffer stringBuffer15 = null;
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter14.printTo(stringBuffer15, (long) 9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(locale3);
        org.junit.Assert.assertEquals(locale3.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter4);
        org.junit.Assert.assertNotNull(dateTimeFormatter5);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(localTime9);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        int int0 = java.util.Calendar.DAY_OF_WEEK_IN_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 8 + "'", int0 == 8);
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.year();
        int int6 = localDate4.size();
        org.joda.time.DateTimeZone dateTimeZone7 = null;
        org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(dateTimeZone7);
        org.joda.time.DateTimeZone dateTimeZone9 = mutableDateTime8.getZone();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(dateTimeZone10);
        org.joda.time.DateTimeZone dateTimeZone12 = mutableDateTime11.getZone();
        long long14 = dateTimeZone9.getMillisKeepLocal(dateTimeZone12, (long) 10);
        org.joda.time.DateTime dateTime15 = localDate4.toDateTimeAtMidnight(dateTimeZone12);
        org.joda.time.DateTime.Property property16 = dateTime15.yearOfEra();
        org.joda.time.DateTime dateTime17 = property16.getDateTime();
        int int18 = property16.getMinimumValueOverall();
        org.joda.time.DateTime dateTime19 = property16.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime19.withDayOfWeek(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 3 + "'", int6 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone9);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 10L + "'", long14 == 10L);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 1 + "'", int18 == 1);
        org.junit.Assert.assertNotNull(dateTime19);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.minusMinutes((int) (byte) 1);
        org.joda.time.ReadableDuration readableDuration6 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plus(readableDuration6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withHourOfDay(901);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 901 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455718054,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=58,MILLISECOND=54,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.LocalTime localTime7 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType8 = org.joda.time.DurationFieldType.years();
        java.lang.String str9 = durationFieldType8.toString();
        boolean boolean10 = localTime7.isSupported(durationFieldType8);
        org.joda.time.DurationFieldType durationFieldType11 = org.joda.time.DurationFieldType.halfdays();
        org.joda.time.LocalTime localTime13 = localTime7.withFieldAdded(durationFieldType11, 32772);
        org.joda.time.LocalTime.Property property14 = localTime7.hourOfDay();
        org.joda.time.LocalTime localTime16 = localTime7.minusMinutes(19);
        org.joda.time.Chronology chronology17 = localTime7.getChronology();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((java.lang.Object) localDate4, chronology17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationFieldType8);
        org.junit.Assert.assertEquals("'" + str9 + "' != '" + "years" + "'", str9, "years");
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(durationFieldType11);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(chronology17);
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = dateTimeFormatter0.withPivotYear(13);
        org.joda.time.format.DateTimeParser dateTimeParser3 = dateTimeFormatter0.getParser();
        java.io.Writer writer4 = null;
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now();
        int int6 = localDate5.getDayOfMonth();
        org.joda.time.LocalDate localDate8 = localDate5.plusYears((int) (byte) 100);
        int int9 = localDate5.size();
        org.joda.time.LocalDate localDate11 = localDate5.minusWeeks((int) 'x');
        // The following exception was thrown during execution in test generation
        try {
            dateTimeFormatter0.printTo(writer4, (org.joda.time.ReadablePartial) localDate5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter0);
        org.junit.Assert.assertNotNull(dateTimeFormatter2);
        org.junit.Assert.assertNotNull(dateTimeParser3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 21 + "'", int6 == 21);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 3 + "'", int9 == 3);
        org.junit.Assert.assertNotNull(localDate11);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = dateTimeFormatter1.withPivotYear(13);
        org.joda.time.format.DateTimeParser dateTimeParser4 = dateTimeFormatter1.getParser();
        java.util.Locale locale5 = dateTimeFormatter1.getLocale();
        org.joda.time.Instant instant7 = new org.joda.time.Instant((long) 100);
        org.joda.time.Chronology chronology8 = instant7.getChronology();
        org.joda.time.MutableDateTime mutableDateTime9 = org.joda.time.MutableDateTime.now(chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfHalfday();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = dateTimeFormatter1.withChronology(chronology8);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (-3600000), chronology8);
        org.joda.time.ReadablePeriod readablePeriod13 = null;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray15 = chronology8.get(readablePeriod13, (long) 54112697);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFormatter1);
        org.junit.Assert.assertNotNull(dateTimeFormatter3);
        org.junit.Assert.assertNotNull(dateTimeParser4);
        org.junit.Assert.assertNull(locale5);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateTimeFormatter11);
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(2, (int) 'u', 12, 21);
        java.util.Calendar.Builder builder10 = builder0.setDate(0, (int) (byte) 100, 21);
        java.util.Calendar.Builder builder12 = builder0.setLenient(true);
        java.util.Calendar.Builder builder13 = new java.util.Calendar.Builder();
        java.util.Calendar calendar14 = builder13.build();
        java.util.Date date15 = calendar14.getTime();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder16 = builder0.setInstant(date15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: null");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder10);
        org.junit.Assert.assertNotNull(builder12);
        org.junit.Assert.assertNotNull(calendar14);
// flaky:         org.junit.Assert.assertEquals(calendar14.toString(), "java.util.GregorianCalendar[time=0,areFieldsSet=true,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(date15);
        org.junit.Assert.assertEquals(date15.toString(), "Thu Jan 01 00:00:00 UTC 1970");
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.plusWeeks(100);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withDurationAdded(readableDuration7, 14);
        int int10 = localDateTime3.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withMillisOfSecond((int) 'a');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.centuryOfEra();
        org.joda.time.LocalDateTime localDateTime15 = localDateTime12.minusWeeks(54113409);
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455718250,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=58,MILLISECOND=250,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
        org.junit.Assert.assertNotNull(localDateTime15);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.lang.String str2 = locale0.getDisplayScript(locale1);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        // The following exception was thrown during execution in test generation
        try {
            calendar3.setWeekDate(0, 2000, 54107140);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 54107140");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "" + "'", str2, "");
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455718320,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=58,MILLISECOND=320,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.Instant instant6 = new org.joda.time.Instant();
        long long7 = property5.getDifferenceAsLong((org.joda.time.ReadableInstant) instant6);
        org.joda.time.Chronology chronology8 = instant6.getChronology();
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(dateTimeZone9);
        boolean boolean12 = mutableDateTime10.isAfter((long) 21);
        boolean boolean14 = mutableDateTime10.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        mutableDateTime10.setZone(dateTimeZone17);
        java.util.Locale locale20 = java.util.Locale.KOREA;
        java.util.Locale locale21 = java.util.Locale.KOREA;
        java.lang.String str22 = locale20.getDisplayScript(locale21);
        java.lang.String str23 = locale20.getDisplayScript();
        java.lang.String str24 = dateTimeZone17.getShortName((long) 13, locale20);
        java.util.Calendar calendar25 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime26 = org.joda.time.LocalDateTime.fromCalendarFields(calendar25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusSeconds(0);
        boolean boolean31 = dateTimeZone17.isLocalDateTimeGap(localDateTime28);
        org.joda.time.LocalDateTime localDateTime33 = localDateTime28.withSecondOfMinute((int) (byte) 10);
        org.joda.time.LocalTime localTime35 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology36 = localTime35.getChronology();
        int[] intArray37 = localTime35.getValues();
        // The following exception was thrown during execution in test generation
        try {
            chronology8.validate((org.joda.time.ReadablePartial) localDateTime33, intArray37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must not be smaller than 1");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 0L + "'", long7 == 0L);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertTrue("'" + boolean12 + "' != '" + true + "'", boolean12 == true);
        org.junit.Assert.assertTrue("'" + boolean14 + "' != '" + false + "'", boolean14 == false);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "" + "'", str22, "");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "+00:00" + "'", str24, "+00:00");
        org.junit.Assert.assertNotNull(calendar25);
// flaky:         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=1645455718343,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=58,MILLISECOND=343,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime26);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(localDateTime30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + false + "'", boolean31 == false);
        org.junit.Assert.assertNotNull(localDateTime33);
        org.junit.Assert.assertNotNull(localTime35);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[0, 0, 0, 0]");
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.ReadablePeriod readablePeriod2 = null;
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.minus(readablePeriod2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withWeekyear((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withDayOfMonth(54092654);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54092654 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455718360,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=58,MILLISECOND=360,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone2);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime(dateTimeZone2);
        org.joda.time.LocalTime.Property property5 = localTime4.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime7 = property5.setCopy("centuryOfEra");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"centuryOfEra\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(property5);
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.MutableDateTime mutableDateTime4 = new org.joda.time.MutableDateTime(dateTimeZone3);
        org.joda.time.DateTimeZone dateTimeZone5 = mutableDateTime4.getZone();
        long long7 = dateTimeZone2.getMillisKeepLocal(dateTimeZone5, (long) 10);
        java.lang.String str8 = dateTimeZone5.toString();
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
        java.util.TimeZone timeZone10 = dateTimeZone5.toTimeZone();
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(timeZone10);
        java.util.TimeZone timeZone13 = java.util.TimeZone.getTimeZone("years");
        java.util.TimeZone timeZone15 = java.util.TimeZone.getTimeZone("years");
        boolean boolean16 = timeZone15.observesDaylightTime();
        boolean boolean17 = timeZone13.hasSameRules(timeZone15);
        calendar11.setTimeZone(timeZone13);
        org.joda.time.LocalDate localDate19 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate21 = localDate19.withWeekyear(3);
        org.joda.time.LocalDate localDate23 = org.joda.time.LocalDate.now();
        int int24 = localDate23.getDayOfMonth();
        org.joda.time.LocalDate localDate26 = localDate23.plusYears((int) (byte) 100);
        org.joda.time.DateTime dateTime27 = localDate23.toDateTimeAtStartOfDay();
        org.joda.time.LocalDate localDate28 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone29 = null;
        org.joda.time.Interval interval30 = localDate28.toInterval(dateTimeZone29);
        org.joda.time.LocalDate localDate32 = localDate28.plusMonths(0);
        org.joda.time.LocalDate.Property property33 = localDate32.year();
        int int34 = localDate32.size();
        org.joda.time.DateTimeZone dateTimeZone35 = null;
        org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(dateTimeZone35);
        org.joda.time.DateTimeZone dateTimeZone37 = mutableDateTime36.getZone();
        org.joda.time.DateTimeZone dateTimeZone38 = null;
        org.joda.time.MutableDateTime mutableDateTime39 = new org.joda.time.MutableDateTime(dateTimeZone38);
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        long long42 = dateTimeZone37.getMillisKeepLocal(dateTimeZone40, (long) 10);
        org.joda.time.DateTime dateTime43 = localDate32.toDateTimeAtMidnight(dateTimeZone40);
        org.joda.time.DateTimeFieldType dateTimeFieldType44 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        org.joda.time.DateTime.Property property45 = dateTime43.property(dateTimeFieldType44);
        int int46 = localDate23.get(dateTimeFieldType44);
        org.joda.time.LocalDate.Property property47 = localDate23.dayOfMonth();
        java.util.Locale locale49 = java.util.Locale.forLanguageTag("hi!");
        int int50 = property47.getMaximumTextLength(locale49);
        java.lang.String str51 = localDate21.toString("2022-02-21", locale49);
        java.util.Calendar calendar52 = java.util.Calendar.getInstance(locale49);
        int int53 = calendar11.compareTo(calendar52);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateTimeZone5);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 10L + "'", long7 == 10L);
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "Etc/UTC" + "'", str8, "Etc/UTC");
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(timeZone10);
        org.junit.Assert.assertEquals(timeZone10.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645455718516,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"GMT\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=58,MILLISECOND=516,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone13);
        org.junit.Assert.assertEquals(timeZone13.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertNotNull(timeZone15);
        org.junit.Assert.assertEquals(timeZone15.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + true + "'", boolean17 == true);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 21 + "'", int24 == 21);
        org.junit.Assert.assertNotNull(localDate26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(localDate28);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(localDate32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 3 + "'", int34 == 3);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTimeZone40);
        org.junit.Assert.assertTrue("'" + long42 + "' != '" + 10L + "'", long42 == 10L);
        org.junit.Assert.assertNotNull(dateTime43);
        org.junit.Assert.assertNotNull(dateTimeFieldType44);
        org.junit.Assert.assertNotNull(property45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 8 + "'", int46 == 8);
        org.junit.Assert.assertNotNull(property47);
        org.junit.Assert.assertNotNull(locale49);
        org.junit.Assert.assertEquals(locale49.toString(), "");
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + 2 + "'", int50 == 2);
        org.junit.Assert.assertEquals("'" + str51 + "' != '" + "2022-02-21" + "'", str51, "2022-02-21");
        org.junit.Assert.assertNotNull(calendar52);
// flaky:         org.junit.Assert.assertEquals(calendar52.toString(), "java.util.GregorianCalendar[time=1645455718516,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=58,MILLISECOND=516,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 0 + "'", int53 == 0);
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate7 = localDate4.minus(readablePeriod6);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) '4');
        boolean boolean11 = localDate7.isBefore((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.shortTime();
        java.util.Locale locale13 = java.util.Locale.UK;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withLocale(locale13);
        java.lang.String str15 = localDate8.toString(dateTimeFormatter12);
        org.joda.time.LocalDate localDate16 = org.joda.time.LocalDate.now();
        int int17 = localDate16.getDayOfMonth();
        org.joda.time.ReadablePeriod readablePeriod18 = null;
        org.joda.time.LocalDate localDate19 = localDate16.plus(readablePeriod18);
        org.joda.time.LocalDate localDate21 = localDate16.withCenturyOfEra(21);
        org.joda.time.LocalDate localDate23 = localDate16.withYear(19);
        org.joda.time.LocalDate localDate25 = localDate23.withYearOfCentury((int) (byte) 0);
        boolean boolean26 = localDate8.isBefore((org.joda.time.ReadablePartial) localDate25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate28 = localDate25.withDayOfYear(54113472);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54113472 for dayOfYear must be in the range [1,366]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
// flaky:         org.junit.Assert.assertEquals("'" + str15 + "' != '" + "\ufffd\ufffd\ufffd\ufffd" + "'", str15, "\ufffd\ufffd\ufffd\ufffd");
        org.junit.Assert.assertNotNull(localDate16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 21 + "'", int17 == 21);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + false + "'", boolean26 == false);
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        org.joda.time.DateTimeZone dateTimeZone2 = mutableDateTime1.getZone();
        int int4 = dateTimeZone2.getStandardOffset(0L);
        java.util.TimeZone timeZone5 = dateTimeZone2.toTimeZone();
        java.util.TimeZone timeZone7 = java.util.TimeZone.getTimeZone("years");
        boolean boolean8 = timeZone5.hasSameRules(timeZone7);
        java.util.Locale locale11 = java.util.Locale.UK;
        java.util.Locale locale12 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet13 = locale12.getExtensionKeys();
        java.util.Locale locale14 = java.util.Locale.KOREA;
        java.util.Locale locale15 = java.util.Locale.KOREA;
        java.lang.String str16 = locale14.getDisplayScript(locale15);
        java.lang.String str17 = locale12.getDisplayScript(locale15);
        java.util.Locale locale18 = java.util.Locale.UK;
        java.lang.String str19 = locale12.getDisplayScript(locale18);
        java.lang.String str20 = locale11.getDisplayLanguage(locale18);
        java.util.Locale locale21 = java.util.Locale.ENGLISH;
        java.util.Locale locale22 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet23 = locale22.getExtensionKeys();
        java.lang.String str24 = locale21.getDisplayScript(locale22);
        java.lang.String str25 = locale18.getDisplayCountry(locale21);
        java.util.Locale locale26 = java.util.Locale.UK;
        java.lang.String str27 = locale21.getDisplayScript(locale26);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str28 = timeZone7.getDisplayName(false, (int) (short) -1, locale21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(timeZone5);
        org.junit.Assert.assertEquals(timeZone5.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(timeZone7);
        org.junit.Assert.assertEquals(timeZone7.getDisplayName(), "Greenwich Mean Time");
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + false + "'", boolean8 == false);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet13);
        org.junit.Assert.assertNotNull(locale14);
        org.junit.Assert.assertEquals(locale14.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "" + "'", str16, "");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "" + "'", str17, "");
        org.junit.Assert.assertNotNull(locale18);
        org.junit.Assert.assertEquals(locale18.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "" + "'", str19, "");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "English" + "'", str20, "English");
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "en");
        org.junit.Assert.assertNotNull(locale22);
        org.junit.Assert.assertEquals(locale22.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "" + "'", str24, "");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "United Kingdom" + "'", str25, "United Kingdom");
        org.junit.Assert.assertNotNull(locale26);
        org.junit.Assert.assertEquals(locale26.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str27 + "' != '" + "" + "'", str27, "");
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setVariant("-2022-10-03T15:01:54.854");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: -2022-10-03T15:01:54.854 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = org.joda.time.format.DateTimeFormat.patternForStyle("1970-01-01T15:01:48.207Z", locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid style specification: 1970-01-01T15:01:48.207Z");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(2, (int) 'u', 12, 21);
        java.util.Calendar.Builder builder8 = builder6.setLenient(false);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar9 = builder8.build();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: MINUTE");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.hourOfDay();
        org.joda.time.ReadablePeriod readablePeriod5 = null;
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.withPeriodAdded(readablePeriod5, (int) (short) 100);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.weekyear();
        org.joda.time.LocalDateTime localDateTime9 = property8.roundFloorCopy();
        int int10 = property8.getMinimumValue();
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455718775,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=58,MILLISECOND=775,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-292275054) + "'", int10 == (-292275054));
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(70, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.minuteOfHour();
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology3 = localTime2.getChronology();
        org.joda.time.DateTimeField dateTimeField4 = dateTimeFieldType0.getField(chronology3);
        org.joda.time.Chronology chronology5 = chronology3.withUTC();
        org.joda.time.DateTimeField dateTimeField6 = chronology5.era();
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.Interval interval9 = localDate7.toInterval(dateTimeZone8);
        org.joda.time.LocalDate localDate11 = localDate7.withYearOfEra((int) (byte) 100);
        org.joda.time.LocalDate localDate13 = localDate7.minusMonths(10);
        java.lang.String str14 = localDate7.toString();
        org.joda.time.LocalTime localTime17 = org.joda.time.LocalTime.fromMillisOfDay((long) (byte) 0);
        org.joda.time.Chronology chronology18 = localTime17.getChronology();
        int[] intArray19 = localTime17.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray21 = dateTimeField6.add((org.joda.time.ReadablePartial) localDate7, 0, intArray19, 2000);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Maximum value exceeded for add");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(chronology3);
        org.junit.Assert.assertNotNull(dateTimeField4);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(dateTimeField6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(interval9);
        org.junit.Assert.assertNotNull(localDate11);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "2022-02-21" + "'", str14, "2022-02-21");
        org.junit.Assert.assertNotNull(localTime17);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(intArray19);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray19), "[0, 0, 0, 0]");
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(dateTimeZone0);
        boolean boolean3 = mutableDateTime1.isAfter((long) 21);
        org.joda.time.MutableDateTime mutableDateTime4 = mutableDateTime1.toMutableDateTime();
        mutableDateTime1.addDays(19);
        org.joda.time.MutableDateTime.Property property7 = mutableDateTime1.dayOfMonth();
        org.joda.time.MutableDateTime mutableDateTime8 = property7.roundCeiling();
        int int9 = property7.getMinimumValueOverall();
        org.junit.Assert.assertTrue("'" + boolean3 + "' != '" + true + "'", boolean3 == true);
        org.junit.Assert.assertNotNull(mutableDateTime4);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(mutableDateTime8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.Interval interval2 = localDate0.toInterval(dateTimeZone1);
        org.joda.time.LocalDate localDate4 = localDate0.plusMonths(0);
        org.joda.time.LocalDate.Property property5 = localDate4.weekOfWeekyear();
        org.joda.time.ReadablePeriod readablePeriod6 = null;
        org.joda.time.LocalDate localDate7 = localDate4.minus(readablePeriod6);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now();
        org.joda.time.LocalDate localDate10 = localDate8.withYearOfEra((int) '4');
        boolean boolean11 = localDate7.isBefore((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.LocalDate localDate13 = localDate8.minusDays((int) (byte) 100);
        org.joda.time.LocalDate.Property property14 = localDate8.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone15 = null;
        org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(dateTimeZone15);
        org.joda.time.DateTimeZone dateTimeZone17 = mutableDateTime16.getZone();
        long long19 = dateTimeZone17.previousTransition((-431366460000L));
        org.joda.time.DateTimeZone dateTimeZone21 = null;
        org.joda.time.MutableDateTime mutableDateTime22 = new org.joda.time.MutableDateTime(dateTimeZone21);
        org.joda.time.DateTimeZone dateTimeZone23 = mutableDateTime22.getZone();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(dateTimeZone24);
        org.joda.time.DateTimeZone dateTimeZone26 = mutableDateTime25.getZone();
        long long28 = dateTimeZone23.getMillisKeepLocal(dateTimeZone26, (long) 10);
        java.lang.String str29 = dateTimeZone23.toString();
        java.util.Locale locale31 = java.util.Locale.KOREA;
        java.lang.String str32 = locale31.toLanguageTag();
        java.util.Locale locale33 = java.util.Locale.KOREA;
        java.lang.String str34 = locale31.getDisplayCountry(locale33);
        java.lang.String str35 = dateTimeZone23.getName((long) 54089980, locale33);
        java.lang.String str36 = locale33.getDisplayLanguage();
        java.lang.String str37 = locale33.getScript();
        java.lang.String str38 = dateTimeZone17.getName((long) 52, locale33);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime(dateTimeZone17);
        boolean boolean41 = dateTimeZone17.isStandardOffset((long) 20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime42 = new org.joda.time.MutableDateTime((java.lang.Object) localDate8, dateTimeZone17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.LocalDate");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertNotNull(interval2);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(dateTimeZone17);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + (-431366460000L) + "'", long19 == (-431366460000L));
        org.junit.Assert.assertNotNull(dateTimeZone23);
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 10L + "'", long28 == 10L);
        org.junit.Assert.assertEquals("'" + str29 + "' != '" + "Etc/UTC" + "'", str29, "Etc/UTC");
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str32 + "' != '" + "ko-KR" + "'", str32, "ko-KR");
        org.junit.Assert.assertNotNull(locale33);
        org.junit.Assert.assertEquals(locale33.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str34 + "' != '" + "\ub300\ud55c\ubbfc\uad6d" + "'", str34, "\ub300\ud55c\ubbfc\uad6d");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "+00:00" + "'", str35, "+00:00");
        org.junit.Assert.assertEquals("'" + str36 + "' != '" + "Korean" + "'", str36, "Korean");
        org.junit.Assert.assertEquals("'" + str37 + "' != '" + "" + "'", str37, "");
        org.junit.Assert.assertEquals("'" + str38 + "' != '" + "+00:00" + "'", str38, "+00:00");
        org.junit.Assert.assertTrue("'" + boolean41 + "' != '" + true + "'", boolean41 == true);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(48, 6055);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 48 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(16, (-1), 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property4 = localDate3.centuryOfEra();
        int int5 = property4.getMaximumValueOverall();
        org.joda.time.LocalDate localDate6 = property4.roundFloorCopy();
        org.joda.time.LocalDate localDate8 = localDate6.minusDays(12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate10 = localDate8.withDayOfMonth(54113472);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 54113472 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2922789 + "'", int5 == 2922789);
        org.junit.Assert.assertNotNull(localDate6);
        org.junit.Assert.assertNotNull(localDate8);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
        org.joda.time.LocalDate localDate1 = org.joda.time.LocalDate.now();
        int int2 = localDate1.getDayOfMonth();
        org.joda.time.LocalDate localDate4 = localDate1.plusYears((int) (byte) 100);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(dateTimeZone5);
        boolean boolean8 = mutableDateTime6.isAfter((long) 21);
        boolean boolean10 = mutableDateTime6.equals((java.lang.Object) (short) 0);
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(dateTimeZone11);
        org.joda.time.DateTimeZone dateTimeZone13 = mutableDateTime12.getZone();
        mutableDateTime6.setZone(dateTimeZone13);
        org.joda.time.DateTime dateTime15 = localDate1.toDateTimeAtStartOfDay(dateTimeZone13);
        org.joda.time.DateTime dateTime16 = dateTime0.withFields((org.joda.time.ReadablePartial) localDate1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime21 = dateTime16.withTime(16, 16, (int) (short) 100, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate1);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 21 + "'", int2 == 21);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertTrue("'" + boolean8 + "' != '" + true + "'", boolean8 == true);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateTimeZone13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime16);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale.Builder builder1 = builder0.clearExtensions();
        java.util.Locale.Builder builder2 = builder1.clear();
        java.util.Locale.Builder builder3 = builder1.clearExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder6 = builder1.setExtension('a', "0");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension value: 0 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.LocalDate localDate0 = org.joda.time.LocalDate.now();
        int int1 = localDate0.getDayOfMonth();
        org.joda.time.LocalDate localDate3 = localDate0.plusYears((int) (byte) 100);
        org.joda.time.LocalDate.Property property4 = localDate3.centuryOfEra();
        int int5 = property4.getMaximumValueOverall();
        java.util.Locale locale6 = java.util.Locale.UK;
        java.util.Locale locale7 = java.util.Locale.UK;
        java.util.Set<java.lang.Character> charSet8 = locale7.getExtensionKeys();
        java.util.Locale locale9 = java.util.Locale.KOREA;
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.lang.String str11 = locale9.getDisplayScript(locale10);
        java.lang.String str12 = locale7.getDisplayScript(locale10);
        java.util.Locale locale13 = java.util.Locale.UK;
        java.lang.String str14 = locale7.getDisplayScript(locale13);
        java.lang.String str15 = locale6.getDisplayLanguage(locale13);
        java.util.Locale.setDefault(locale6);
        int int17 = property4.getMaximumTextLength(locale6);
        java.lang.String str18 = property4.getAsString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate20 = property4.setCopy("1970-01-01T15:01:38.774Z");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01T15:01:38.774Z\" for centuryOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDate0);
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 21 + "'", int1 == 21);
        org.junit.Assert.assertNotNull(localDate3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2922789 + "'", int5 == 2922789);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "en_GB");
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "en_GB");
        org.junit.Assert.assertNotNull(charSet8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "" + "'", str12, "");
        org.junit.Assert.assertNotNull(locale13);
        org.junit.Assert.assertEquals(locale13.toString(), "en_GB");
        org.junit.Assert.assertEquals("'" + str14 + "' != '" + "" + "'", str14, "");
        org.junit.Assert.assertEquals("'" + str15 + "' != '" + "English" + "'", str15, "English");
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 7 + "'", int17 == 7);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "21" + "'", str18, "21");
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar calendar1 = builder0.build();
        java.util.Calendar.Builder builder6 = builder0.setTimeOfDay(2, (int) 'u', 12, 21);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder9 = builder0.setWeekDefinition(54112697, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=?,YEAR=?,MONTH=?,WEEK_OF_YEAR=?,WEEK_OF_MONTH=?,DAY_OF_MONTH=?,DAY_OF_YEAR=?,DAY_OF_WEEK=?,DAY_OF_WEEK_IN_MONTH=?,AM_PM=?,HOUR=?,HOUR_OF_DAY=?,MINUTE=?,SECOND=?,MILLISECOND=?,ZONE_OFFSET=?,DST_OFFSET=?]");
        org.junit.Assert.assertNotNull(builder6);
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.util.Calendar calendar0 = java.util.Calendar.getInstance();
        org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.fromCalendarFields(calendar0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) ' ');
        org.joda.time.LocalDateTime.Property property4 = localDateTime3.millisOfSecond();
        org.joda.time.LocalDateTime localDateTime6 = localDateTime3.plusWeeks(100);
        org.joda.time.ReadableDuration readableDuration7 = null;
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withDurationAdded(readableDuration7, 14);
        int int10 = localDateTime3.getDayOfWeek();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withMillisOfSecond((int) 'a');
        org.joda.time.LocalDateTime.Property property13 = localDateTime12.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime15 = localDateTime12.withSecondOfMinute((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(calendar0);
// flaky:         org.junit.Assert.assertEquals(calendar0.toString(), "java.util.GregorianCalendar[time=1645455719421,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=59,MILLISECOND=421,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localDateTime1);
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 1 + "'", int10 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(property13);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        long long6 = java.util.Date.UTC(54117498, 7, (int) (short) -1, 6, 2922, 0);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1707781096161720000L + "'", long6 == 1707781096161720000L);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((long) (byte) 100);
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.years();
        java.lang.String str3 = durationFieldType2.toString();
        boolean boolean4 = localTime1.isSupported(durationFieldType2);
        org.joda.time.LocalTime localTime6 = localTime1.withMinuteOfHour((int) (short) 0);
        org.joda.time.LocalTime.Property property7 = localTime1.millisOfDay();
        org.joda.time.LocalTime localTime8 = property7.roundFloorCopy();
        org.joda.time.LocalTime localTime10 = property7.addNoWrapToCopy((int) (byte) 100);
        org.joda.time.format.DateTimeFormatter dateTimeFormatter12 = org.joda.time.format.DateTimeFormat.longDateTime();
        org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = dateTimeFormatter12.withPivotYear(13);
        java.util.Locale locale15 = java.util.Locale.CANADA_FRENCH;
        org.joda.time.format.DateTimeFormatter dateTimeFormatter16 = dateTimeFormatter12.withLocale(locale15);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = localTime10.toString("dayOfYear", locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: O");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "years" + "'", str3, "years");
        org.junit.Assert.assertTrue("'" + boolean4 + "' != '" + false + "'", boolean4 == false);
        org.junit.Assert.assertNotNull(localTime6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(localTime8);
        org.junit.Assert.assertNotNull(localTime10);
        org.junit.Assert.assertNotNull(dateTimeFormatter12);
        org.junit.Assert.assertNotNull(dateTimeFormatter14);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "fr_CA");
        org.junit.Assert.assertNotNull(dateTimeFormatter16);
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        java.util.List<java.util.Locale.LanguageRange> languageRangeList0 = null;
        java.util.Locale locale1 = java.util.Locale.KOREA;
        java.util.Locale locale2 = java.util.Locale.KOREA;
        java.lang.String str3 = locale1.getDisplayScript(locale2);
        java.util.Set<java.lang.String> strSet4 = locale1.getUnicodeLocaleKeys();
        strSet4.clear();
        java.util.Iterator<java.lang.String> strItor6 = strSet4.iterator();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = java.util.Locale.lookupTag(languageRangeList0, (java.util.Collection<java.lang.String>) strSet4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "ko_KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertNotNull(strSet4);
        org.junit.Assert.assertNotNull(strItor6);
    }
}
