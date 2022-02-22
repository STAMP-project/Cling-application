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
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.now(dateTimeZone0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: Zone must not be null");
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
            org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight((java.lang.Object) (-1.0d), dateTimeZone1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00003");
        org.joda.time.Chronology chronology4 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay((int) (byte) -1, 10, (int) (short) -1, (int) (byte) 100, chronology4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must not be smaller than 0");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00004");
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
    public void test00005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00005");
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(0, (int) (byte) 10, (int) (byte) -1, (int) (byte) 100, (int) 'a', dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00006");
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
    public void test00007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00007");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((int) (short) 0, (int) ' ', 0, 0, (int) (byte) -1, 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00008");
        org.joda.time.PeriodType periodType1 = null;
        org.joda.time.Chronology chronology2 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period3 = new org.joda.time.Period((java.lang.Object) (-1.0f), periodType1, chronology2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Float");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00009");
        org.joda.time.Chronology chronology7 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((int) '4', (int) (byte) 0, (int) (byte) 100, (int) (byte) 100, (int) ' ', (int) (byte) -1, (int) (byte) 1, chronology7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00010");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("hi!", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00011");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval1 = new org.joda.time.Interval((java.lang.Object) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00012");
        int int0 = java.util.Calendar.JULY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00013");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType4 = timeOfDay2.getFieldType((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00014");
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
    public void test00015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00015");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("hi!", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00016");
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
    public void test00017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00017");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(1);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00018");
        int int0 = java.util.Calendar.JUNE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00019");
        int int0 = java.util.Calendar.THURSDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00020");
        int int0 = java.util.Calendar.ZONE_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 15 + "'", int0 == 15);
    }

    @Test
    public void test00021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00021");
        int int0 = java.util.Calendar.FEBRUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00022");
        java.util.Date date3 = new java.util.Date((-1), (int) (short) 0, 0);
        java.lang.String str4 = date3.toString();
        org.junit.Assert.assertEquals(date3.toString(), "Sat Dec 31 00:00:00 UTC 1898");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Sat Dec 31 00:00:00 UTC 1898" + "'", str4, "Sat Dec 31 00:00:00 UTC 1898");
    }

    @Test
    public void test00023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00023");
        int int0 = java.util.Calendar.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00024");
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
    public void test00025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00025");
        int int0 = org.joda.time.MutableDateTime.ROUND_FLOOR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00026");
        java.util.Date date3 = new java.util.Date((-1), (int) (short) 0, 0);
        date3.setMonth((int) (short) 10);
        java.lang.String str6 = date3.toString();
        org.junit.Assert.assertEquals(date3.toString(), "Thu Dec 01 00:00:00 UTC 1898");
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Thu Dec 01 00:00:00 UTC 1898" + "'", str6, "Thu Dec 01 00:00:00 UTC 1898");
    }

    @Test
    public void test00027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00027");
        int int0 = java.util.Calendar.JANUARY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00028");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(chronology1);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone5 = null;
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withZoneRetainFields(dateTimeZone5);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        int int11 = dateMidnight10.getYearOfEra();
        org.joda.time.Chronology chronology12 = dateMidnight10.getChronology();
        long long13 = dateMidnight10.getMillis();
        org.joda.time.ReadableDuration readableDuration14 = null;
        org.joda.time.ReadableInstant readableInstant15 = null;
        org.joda.time.Period period16 = new org.joda.time.Period(readableDuration14, readableInstant15);
        org.joda.time.PeriodType periodType17 = period16.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight6, (org.joda.time.ReadableInstant) dateMidnight10, periodType17);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) 0L, periodType17);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight4);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 1645488000000L + "'", long13 == 1645488000000L);
        org.junit.Assert.assertNotNull(periodType17);
    }

    @Test
    public void test00029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00029");
        int int0 = java.util.Calendar.DAY_OF_WEEK;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00030");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        int int9 = dateMidnight8.getYearOfEra();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.halfdayOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight((int) ' ', (int) 'a', (int) (byte) 100, chronology10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00031");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(7, (-1), 2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00032");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        java.util.Locale locale6 = java.util.Locale.JAPAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = property4.setCopy("hi!", locale6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(locale6);
        org.junit.Assert.assertEquals(locale6.toString(), "ja_JP");
    }

    @Test
    public void test00033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00033");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = localDateTime1.withField(dateTimeFieldType5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for clockhourOfDay must be in the range [1,24]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
    }

    @Test
    public void test00034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00034");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = new org.joda.time.MutablePeriod((java.lang.Object) 10.0d);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Double");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00035");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology9);
        mutablePeriod10.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod10.add(0L);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology24);
        mutablePeriod10.add(0L, chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(2022, (int) (short) -1, (int) 'a', (int) '4', (int) ' ', 0, 100, chronology24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test00036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00036");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay((long) 10, chronology12);
        java.util.Locale locale15 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str16 = dateTimeField10.getAsText((org.joda.time.ReadablePartial) timeOfDay13, 15, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "de");
    }

    @Test
    public void test00037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00037");
        int int0 = org.joda.time.TimeOfDay.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00038");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology5);
        mutablePeriod6.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod6.add(0L);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusDays((int) (short) -1);
        int int19 = dateMidnight18.getYearOfEra();
        org.joda.time.Chronology chronology20 = dateMidnight18.getChronology();
        org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology20);
        mutablePeriod6.add(0L, chronology20);
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight((long) (-1), chronology20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((int) (short) 0, 100, chronology20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
        org.junit.Assert.assertNotNull(chronology20);
    }

    @Test
    public void test00039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00039");
        int int0 = java.util.Calendar.HOUR_OF_DAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00040");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        long long8 = property7.remainder();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight10 = property7.setCopy("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4320000000L + "'", long8 == 4320000000L);
    }

    @Test
    public void test00041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00041");
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
    public void test00042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00042");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        org.joda.time.MutableDateTime mutableDateTime9 = dateMidnight3.toMutableDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime9.setMonthOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645401600000L + "'", long6 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(mutableDateTime9);
    }

    @Test
    public void test00043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00043");
        org.joda.time.DurationFieldType durationFieldType0 = org.joda.time.DurationFieldType.years();
        org.junit.Assert.assertNotNull(durationFieldType0);
    }

    @Test
    public void test00044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00044");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00045");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = timeOfDay2.getFields();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) 10, chronology5);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = timeOfDay6.getFields();
        org.joda.time.Period period8 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay2, (org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.DateTimeFieldType dateTimeFieldType9 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean10 = timeOfDay6.isSupported(dateTimeFieldType9);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology15);
        mutablePeriod16.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod16.add(0L);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        mutablePeriod16.add(0L, chronology30);
        org.joda.time.Period period33 = new org.joda.time.Period((long) 0, (long) 6, chronology30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime34 = new org.joda.time.LocalTime((java.lang.Object) boolean10, chronology30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(dateTimeFieldType9);
        org.junit.Assert.assertTrue("'" + boolean10 + "' != '" + false + "'", boolean10 == false);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
    }

    @Test
    public void test00046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00046");
        int int0 = java.util.Calendar.SHORT_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32769 + "'", int0 == 32769);
    }

    @Test
    public void test00047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00047");
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod7.add(0L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        mutablePeriod7.add(0L, chronology21);
        boolean boolean24 = dateTimeFieldType3.isSupported(chronology21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((int) '#', (int) (byte) -1, (int) (byte) 0, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
    }

    @Test
    public void test00048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00048");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = timeOfDay2.getFields();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) 10, chronology5);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = timeOfDay6.getFields();
        org.joda.time.Period period8 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay2, (org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.Period period10 = period8.minusMinutes(0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = period10.withDays((-1));
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
    }

    @Test
    public void test00049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00049");
        int int0 = java.util.Calendar.MONDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00050");
        int int0 = java.util.Calendar.PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00051");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withField(dateTimeFieldType1, 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyearOfCentury' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
    }

    @Test
    public void test00052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00052");
        java.lang.String[] strArray0 = java.util.TimeZone.getAvailableIDs();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00053");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((int) '4', (int) (byte) 1, 31, 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00054");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.plusSeconds((int) '4');
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = timeOfDay5.toString("DateTimeField[clockhourOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(timeOfDay5);
    }

    @Test
    public void test00055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00055");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime33.millisOfDay();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay((long) 10, chronology38);
        org.joda.time.DateTimeField[] dateTimeFieldArray40 = timeOfDay39.getFields();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.TimeOfDay timeOfDay43 = new org.joda.time.TimeOfDay((long) 10, chronology42);
        org.joda.time.DateTimeField[] dateTimeFieldArray44 = timeOfDay43.getFields();
        org.joda.time.Period period45 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay39, (org.joda.time.ReadablePartial) timeOfDay43);
        org.joda.time.DateTimeFieldType dateTimeFieldType46 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean47 = timeOfDay43.isSupported(dateTimeFieldType46);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(chronology50);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.minusDays((int) (short) -1);
        int int54 = dateMidnight53.getYearOfEra();
        org.joda.time.Chronology chronology55 = dateMidnight53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology55);
        org.joda.time.DateTimeField dateTimeField57 = chronology55.clockhourOfDay();
        boolean boolean58 = dateTimeFieldType46.isSupported(chronology55);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime59 = new org.joda.time.LocalTime((java.lang.Object) property36, chronology55);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutableDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateTimeFieldArray40);
        org.junit.Assert.assertNotNull(dateTimeFieldArray44);
        org.junit.Assert.assertNotNull(period45);
        org.junit.Assert.assertNotNull(dateTimeFieldType46);
        org.junit.Assert.assertTrue("'" + boolean47 + "' != '" + false + "'", boolean47 == false);
        org.junit.Assert.assertNotNull(dateMidnight53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2022 + "'", int54 == 2022);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertTrue("'" + boolean58 + "' != '" + true + "'", boolean58 == true);
    }

    @Test
    public void test00056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00056");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.days();
        org.joda.time.Period period2 = new org.joda.time.Period(1645488000000L, periodType1);
        org.joda.time.DateTimeFieldType dateTimeFieldType3 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod7.add(0L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        mutablePeriod7.add(0L, chronology21);
        boolean boolean24 = dateTimeFieldType3.isSupported(chronology21);
        org.joda.time.DurationField durationField25 = chronology21.hours();
        org.joda.time.DurationFieldType durationFieldType26 = durationField25.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period28 = period2.withFieldAdded(durationFieldType26, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'hours'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(dateTimeFieldType3);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(durationField25);
        org.junit.Assert.assertNotNull(durationFieldType26);
    }

    @Test
    public void test00057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00057");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            int int5 = localDate1.getValue(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32769");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(property3);
    }

    @Test
    public void test00058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00058");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) '#');
        int int13 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localDate12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay14 = new org.joda.time.TimeOfDay((java.lang.Object) localDate12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
    }

    @Test
    public void test00059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00059");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period8.withWeeks(24);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645401600000L + "'", long6 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
    }

    @Test
    public void test00060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00060");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) 24);
        long long3 = dateMidnight2.getMillis();
        java.util.Locale locale5 = java.util.Locale.JAPAN;
        boolean boolean6 = locale5.hasExtensions();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str7 = dateMidnight2.toString("zh-CN", locale5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: N");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertTrue("'" + long3 + "' != '" + 0L + "'", long3 == 0L);
        org.junit.Assert.assertNotNull(locale5);
        org.junit.Assert.assertEquals(locale5.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00061");
        org.joda.time.ReadableDuration readableDuration0 = null;
        org.joda.time.ReadableInstant readableInstant1 = null;
        org.joda.time.Period period2 = new org.joda.time.Period(readableDuration0, readableInstant1);
        org.joda.time.PeriodType periodType3 = period2.getPeriodType();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((java.lang.Object) periodType3, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.PeriodType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField13);
    }

    @Test
    public void test00062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00062");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime3 = localTime1.withSecondOfMinute(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00063");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setDayOfYear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfYear must be in the range [1,365]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
    }

    @Test
    public void test00064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00064");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime33.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime33.toMutableDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology41);
        mutablePeriod42.setPeriod((long) (short) 10, (long) (short) -1);
        int int46 = mutablePeriod42.getMonths();
        mutablePeriod42.addMinutes((int) (short) 0);
        mutableDateTime33.add((org.joda.time.ReadablePeriod) mutablePeriod42, 12);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setTime((int) (short) 100, 19, (int) '4', (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test00065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00065");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((int) (byte) -1, 2, (int) (short) 10, (int) (byte) 1, (int) (short) 100, 7, 2022, chronology14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00066");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.clockhourOfDay();
        org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime(chronology14);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        int int24 = dateMidnight23.getYearOfEra();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology25);
        org.joda.time.DateTimeField dateTimeField27 = chronology25.millisOfDay();
        org.joda.time.DateTime dateTime28 = dateTime17.withChronology(chronology25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(10, 53, (int) (short) 0, (int) ' ', 0, 2, 10, chronology25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField27);
        org.junit.Assert.assertNotNull(dateTime28);
    }

    @Test
    public void test00067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00067");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight21.withDayOfYear(53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight37 = dateMidnight21.withDayOfMonth((int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateMidnight35);
    }

    @Test
    public void test00068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00068");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        org.joda.time.DateMidnight.Property property34 = dateMidnight21.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight36 = property34.setCopy(53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property34);
    }

    @Test
    public void test00069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00069");
        int int0 = org.joda.time.MutableDateTime.ROUND_CEILING;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00070");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime33.millisOfDay();
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusDays((int) (short) -1);
        int int42 = dateMidnight41.getYearOfEra();
        org.joda.time.Chronology chronology43 = dateMidnight41.getChronology();
        long long44 = dateMidnight41.getMillis();
        java.util.Locale locale48 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar49 = dateMidnight41.toCalendar(locale48);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime50 = property36.set("PT0.010S", locale48);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0.010S\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2022 + "'", int42 == 2022);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertTrue("'" + long44 + "' != '" + 1645488000000L + "'", long44 == 1645488000000L);
        org.junit.Assert.assertEquals(locale48.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar49);
        org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00071");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        int int9 = dateMidnight8.getYearOfEra();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.halfdayOfDay();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) '#');
        int int16 = dateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) '4');
        boolean boolean19 = localDate1.isBefore((org.joda.time.ReadablePartial) localDate18);
        org.joda.time.DateTimeZone dateTimeZone20 = null;
        org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime(dateTimeZone20);
        org.joda.time.LocalDateTime localDateTime23 = localDateTime21.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property24 = localDateTime21.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean25 = localDate18.isBefore((org.joda.time.ReadablePartial) localDateTime21);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(localDateTime23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test00072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00072");
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology4);
        mutablePeriod5.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod5.add(0L);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        mutablePeriod5.add(0L, chronology19);
        org.joda.time.Period period22 = new org.joda.time.Period((long) 0, (long) 6, chronology19);
        int int23 = period22.getSeconds();
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
    }

    @Test
    public void test00073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00073");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.days();
        org.joda.time.Period period2 = new org.joda.time.Period(1645488000000L, periodType1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period4 = period2.withWeeks(11);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test00074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00074");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval3 = yearMonthDay2.toInterval();
        org.joda.time.Interval interval4 = interval1.gap((org.joda.time.ReadableInterval) interval3);
        org.joda.time.PeriodType periodType5 = org.joda.time.PeriodType.yearDayTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = interval4.toPeriod(periodType5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNull(interval4);
        org.junit.Assert.assertNotNull(periodType5);
    }

    @Test
    public void test00075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00075");
        int int0 = java.util.Calendar.AM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00076");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("Thu Dec 01 00:00:00 UTC 1898");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Thu Dec 01 00:00:00 UTC 1898\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00077");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        int int13 = dateTime12.getCenturyOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime15 = dateTime12.withSecondOfMinute((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
    }

    @Test
    public void test00078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00078");
        java.util.Date date1 = new java.util.Date((long) 1);
        date1.setHours(15);
        java.lang.String str4 = date1.toString();
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 15:00:00 UTC 1970");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "Thu Jan 01 15:00:00 UTC 1970" + "'", str4, "Thu Jan 01 15:00:00 UTC 1970");
    }

    @Test
    public void test00079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00079");
        java.util.TimeZone timeZone0 = null;
        java.util.Locale locale1 = java.util.Locale.PRC;
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar calendar2 = java.util.Calendar.getInstance(timeZone0, locale1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_CN");
    }

    @Test
    public void test00080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00080");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("15:01:52.189");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"15:01:52.189\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00081");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withCenturyOfEra(1970);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear(52);
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.days();
        org.joda.time.Period period10 = new org.joda.time.Period(1645488000000L, periodType9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object) localDateTime5, periodType9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.LocalDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(periodType9);
    }

    @Test
    public void test00082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00082");
        int int0 = java.util.Calendar.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00083");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        java.util.TimeZone timeZone12 = null;
        calendar11.setTimeZone(timeZone12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay14 = org.joda.time.YearMonthDay.fromCalendarFields(calendar11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=null,firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00084");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        int int6 = property4.get();
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
    }

    @Test
    public void test00085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00085");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        long long4 = dateMidnight1.getMillis();
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight1.withMillis((long) 7);
        int int7 = dateMidnight1.getWeekOfWeekyear();
        org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.days();
        org.joda.time.Period period10 = new org.joda.time.Period(1645488000000L, periodType9);
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod(periodType9);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology16);
        mutablePeriod17.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod17.add(0L);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusDays((int) (short) -1);
        int int30 = dateMidnight29.getYearOfEra();
        org.joda.time.Chronology chronology31 = dateMidnight29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology31);
        mutablePeriod17.add(0L, chronology31);
        org.joda.time.Period period34 = new org.joda.time.Period((long) 0, (long) 6, chronology31);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((java.lang.Object) int7, periodType9, chronology31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + long4 + "' != '" + 1645401600000L + "'", long4 == 1645401600000L);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 8 + "'", int7 == 8);
        org.junit.Assert.assertNotNull(periodType9);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertNotNull(chronology31);
    }

    @Test
    public void test00086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00086");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusDays((int) (short) -1);
        int int14 = dateMidnight13.getYearOfEra();
        org.joda.time.Chronology chronology15 = dateMidnight13.getChronology();
        org.joda.time.DateTimeField dateTimeField16 = chronology15.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = new org.joda.time.DateTime((java.lang.Object) chronology7, chronology15);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField16);
    }

    @Test
    public void test00087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00087");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.roundHalfEvenCopy();
        org.joda.time.ReadablePartial readablePartial6 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period7 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime5, readablePartial6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00088");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("");
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
            org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(15, 100, 32769);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00090");
        java.util.Locale.FilteringMode filteringMode0 = java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES;
        org.junit.Assert.assertTrue("'" + filteringMode0 + "' != '" + java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES + "'", filteringMode0.equals(java.util.Locale.FilteringMode.MAP_EXTENDED_RANGES));
    }

    @Test
    public void test00091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00091");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) 24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight4 = dateMidnight0.withEra((int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 10 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight2);
    }

    @Test
    public void test00092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00092");
        int int0 = org.joda.time.YearMonthDay.YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00093");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) '#');
        int int13 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.Period period14 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate15 = localDate12.plus((org.joda.time.ReadablePeriod) period14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone26 = null;
        org.joda.time.LocalDateTime localDateTime27 = new org.joda.time.LocalDateTime(dateTimeZone26);
        org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMillis(0);
        int[] intArray30 = new int[] {};
        int int31 = dateTimeField25.getMaximumValue((org.joda.time.ReadablePartial) localDateTime29, intArray30);
        int int33 = dateTimeField25.getMinimumValue((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType34 = dateTimeField25.getType();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate36 = localDate15.withField(dateTimeFieldType34, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertNotNull(localDateTime29);
        org.junit.Assert.assertNotNull(intArray30);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray30), "[]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 24 + "'", int31 == 24);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 1 + "'", int33 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType34);
    }

    @Test
    public void test00094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00094");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) '#');
        int int13 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay((long) 10, chronology15);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = timeOfDay16.getFields();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay((long) 10, chronology19);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = timeOfDay20.getFields();
        org.joda.time.Period period22 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay16, (org.joda.time.ReadablePartial) timeOfDay20);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay((long) 10, chronology24);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray26 = timeOfDay25.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay28 = timeOfDay25.plusSeconds((int) '4');
        int int29 = timeOfDay16.compareTo((org.joda.time.ReadablePartial) timeOfDay25);
        org.joda.time.TimeOfDay timeOfDay31 = timeOfDay16.withMillisOfSecond(1);
        org.joda.time.LocalTime localTime32 = timeOfDay16.toLocalTime();
        int[] intArray34 = new int[] {};
        java.util.Locale locale36 = java.util.Locale.PRC;
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray37 = dateTimeField10.set((org.joda.time.ReadablePartial) localTime32, 12, intArray34, "hi!", locale36);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for halfdayOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
        org.junit.Assert.assertNotNull(period22);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray26);
        org.junit.Assert.assertNotNull(timeOfDay28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(timeOfDay31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(intArray34);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray34), "[]");
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "zh_CN");
    }

    @Test
    public void test00095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00095");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        int int5 = dateMidnight3.getWeekyear();
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime((java.lang.Object) int5, dateTimeZone7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone7);
    }

    @Test
    public void test00096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00096");
        java.util.Locale locale0 = java.util.Locale.JAPAN;
        boolean boolean1 = locale0.hasExtensions();
        org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((java.lang.Object) locale0, dateTimeZone3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + boolean1 + "' != '" + false + "'", boolean1 == false);
        org.junit.Assert.assertNotNull(dateTimeZone3);
    }

    @Test
    public void test00097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00097");
        int int0 = org.joda.time.TimeOfDay.SECOND_OF_MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00098");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        boolean boolean21 = dateTimeFieldType0.isSupported(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime22 = new org.joda.time.DateTime((java.lang.Object) boolean21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Boolean");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00099");
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) 100, chronology11);
        org.joda.time.DurationField durationField15 = durationFieldType2.getField(chronology11);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.hourOfDay();
        org.joda.time.DurationField durationField23 = durationFieldType2.getField(chronology21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((int) '4', (-1), chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
    }

    @Test
    public void test00100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00100");
        int int0 = java.util.Calendar.DECEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 11 + "'", int0 == 11);
    }

    @Test
    public void test00101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00101");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.lang.String str1 = locale0.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "ja" + "'", str1, "ja");
    }

    @Test
    public void test00102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00102");
        int int0 = org.joda.time.TimeOfDay.MILLIS_OF_SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00103");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        org.joda.time.MutableDateTime mutableDateTime6 = dateMidnight3.toMutableDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration7 = new org.joda.time.Duration((java.lang.Object) mutableDateTime6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No duration converter found for type: org.joda.time.MutableDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(mutableDateTime6);
    }

    @Test
    public void test00104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00104");
        // The following exception was thrown during execution in test generation
        try {
            long long1 = java.util.Date.parse("2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00105");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("Thu Jan 01 15:00:00 UTC 1970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=thu jan 01 15:00:00 utc 1970");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00106");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setExtension(' ', "PeriodType[Standard]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key:   [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00107");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay0.dayOfMonth();
        java.util.Locale locale7 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Locale locale8 = java.util.Locale.JAPAN;
        boolean boolean9 = locale8.hasExtensions();
        java.lang.String str10 = locale8.getDisplayCountry();
        java.lang.String str11 = locale7.getDisplayScript(locale8);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str12 = yearMonthDay0.toString("PT0.010S", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertEquals(locale7.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(locale8);
        org.junit.Assert.assertEquals(locale8.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + boolean9 + "' != '" + false + "'", boolean9 == false);
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "Japan" + "'", str10, "Japan");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "" + "'", str11, "");
    }

    @Test
    public void test00108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00108");
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology10);
        mutablePeriod11.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod11.add(0L);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        int int24 = dateMidnight23.getYearOfEra();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology25);
        mutablePeriod11.add(0L, chronology25);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (-1), chronology25);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusDays((int) (short) -1);
        int int36 = dateMidnight35.getYearOfEra();
        org.joda.time.Chronology chronology37 = dateMidnight35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (short) 10, chronology37);
        org.joda.time.MutableDateTime mutableDateTime40 = dateMidnight28.toMutableDateTime(chronology37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime41 = new org.joda.time.MutableDateTime(11, (-1), 999, (int) 'a', (int) (byte) 10, (int) (byte) 1, 19, chronology37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 97 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(mutableDateTime40);
    }

    @Test
    public void test00109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00109");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology4);
        mutablePeriod5.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod5.add(0L);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        mutablePeriod5.add(0L, chronology19);
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight((long) (-1), chronology19);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusDays((int) (short) -1);
        int int30 = dateMidnight29.getYearOfEra();
        org.joda.time.Chronology chronology31 = dateMidnight29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (short) 10, chronology31);
        org.joda.time.MutableDateTime mutableDateTime34 = dateMidnight22.toMutableDateTime(chronology31);
        org.joda.time.DateTimeField dateTimeField35 = dateTimeFieldType0.getField(chronology31);
        // The following exception was thrown during execution in test generation
        try {
            long long43 = chronology31.getDateTimeMillis(15, 52, 19, 0, (int) ' ', 22, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(mutableDateTime34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test00110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00110");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period1 = new org.joda.time.Period((java.lang.Object) 7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00111");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = timeOfDay2.getFields();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) 10, chronology5);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = timeOfDay6.getFields();
        org.joda.time.Period period8 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay2, (org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 10, chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusSeconds((int) '4');
        int int15 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay2.withMillisOfSecond(1);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay2.secondOfMinute();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray19 = timeOfDay2.getFieldTypes();
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray19);
    }

    @Test
    public void test00112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00112");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight((java.lang.Object) locale0, dateTimeZone2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test00113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00113");
        int int0 = java.util.Calendar.MILLISECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 14 + "'", int0 == 14);
    }

    @Test
    public void test00114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00114");
        org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay((long) 11);
    }

    @Test
    public void test00115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00115");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        java.util.GregorianCalendar gregorianCalendar4 = dateMidnight1.toGregorianCalendar();
        // The following exception was thrown during execution in test generation
        try {
            int int6 = gregorianCalendar4.get(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 1970");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(gregorianCalendar4);
    }

    @Test
    public void test00116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00116");
        org.joda.time.Period period1 = org.joda.time.Period.days(4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay((java.lang.Object) 4);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00117");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property3.roundHalfFloorCopy();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        long long12 = dateMidnight9.getMillis();
        java.util.Locale locale16 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar17 = dateMidnight9.toCalendar(locale16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate18 = property3.setCopy("2022-02-21T00:00:00.000Z/2022-02-21T00:00:00.000Z", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"2022-02-21T00:00:00.000Z/2022-02-21T00:00:00.000Z\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertTrue("'" + long12 + "' != '" + 1645488000000L + "'", long12 == 1645488000000L);
        org.junit.Assert.assertEquals(locale16.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar17);
        org.junit.Assert.assertEquals(calendar17.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00118");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) '#');
        int int13 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.Period period14 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate15 = localDate12.plus((org.joda.time.ReadablePeriod) period14);
        int int16 = localDate15.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 1 + "'", int16 == 1);
    }

    @Test
    public void test00119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00119");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        int int4 = localDate1.getCenturyOfEra();
        org.joda.time.LocalDate.Property property5 = localDate1.weekOfWeekyear();
        org.joda.time.DateTimeZone dateTimeZone6 = null;
        org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(dateTimeZone6);
        org.joda.time.LocalDateTime localDateTime9 = localDateTime7.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.minusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime9.minusSeconds(2);
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDate1.compareTo((org.joda.time.ReadablePartial) localDateTime9);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(localDateTime9);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(localDateTime13);
    }

    @Test
    public void test00120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00120");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval3 = yearMonthDay2.toInterval();
        org.joda.time.Interval interval4 = interval1.gap((org.joda.time.ReadableInterval) interval3);
        boolean boolean6 = interval1.isBefore(100L);
        long long7 = interval1.toDurationMillis();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval9 = interval1.withEndMillis((long) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertTrue("'" + long7 + "' != '" + 86400000L + "'", long7 == 86400000L);
    }

    @Test
    public void test00121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00121");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        // The following exception was thrown during execution in test generation
        try {
            int int4 = calendar1.getLeastMaximum((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455718951,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=58,MILLISECOND=951,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime2);
    }

    @Test
    public void test00122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00122");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 5, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusSeconds((int) '#');
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime12);
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str18 = localDate17.toString();
        org.joda.time.LocalDate.Property property19 = localDate17.weekyear();
        java.lang.String str20 = property19.getAsString();
        org.joda.time.LocalDate localDate21 = property19.roundHalfEvenCopy();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone33 = null;
        org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime(dateTimeZone33);
        org.joda.time.LocalDateTime localDateTime36 = localDateTime34.plusMillis(0);
        int[] intArray37 = new int[] {};
        int int38 = dateTimeField32.getMaximumValue((org.joda.time.ReadablePartial) localDateTime36, intArray37);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray40 = dateTimeField9.addWrapPartial((org.joda.time.ReadablePartial) localDate21, (int) (byte) -1, intArray37, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "1970-01-01" + "'", str18, "1970-01-01");
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "1970" + "'", str20, "1970");
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(localDateTime36);
        org.junit.Assert.assertNotNull(intArray37);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray37), "[]");
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 24 + "'", int38 == 24);
    }

    @Test
    public void test00123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00123");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        java.lang.Object obj2 = calendar1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455719038,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=59,MILLISECOND=38,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj2);
// flaky:         org.junit.Assert.assertEquals(obj2.toString(), "java.util.GregorianCalendar[time=1645455719038,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=59,MILLISECOND=38,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj2), "java.util.GregorianCalendar[time=1645455719038,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=59,MILLISECOND=38,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj2), "java.util.GregorianCalendar[time=1645455719038,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=1,SECOND=59,MILLISECOND=38,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00124");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        int int5 = dateMidnight3.getWeekyear();
        org.joda.time.YearMonthDay yearMonthDay6 = dateMidnight3.toYearMonthDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight3.withFields((org.joda.time.ReadablePartial) localDate8);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((long) 10, chronology11);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray13 = timeOfDay12.getFieldTypes();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = localDate8.compareTo((org.joda.time.ReadablePartial) timeOfDay12);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray13);
    }

    @Test
    public void test00125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00125");
        int int0 = java.util.Calendar.NOVEMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00126");
        java.lang.String[] strArray0 = java.util.Locale.getISOLanguages();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00127");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property15 = dateTime12.centuryOfEra();
        org.joda.time.DateTime.Property property16 = dateTime12.weekyear();
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(property16);
    }

    @Test
    public void test00128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00128");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType3 = periodType2.withWeeksRemoved();
        org.joda.time.Period period4 = new org.joda.time.Period((long) 1970, (long) 3, periodType2);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period6 = period4.minusSeconds(50);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(periodType3);
    }

    @Test
    public void test00129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00129");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int) (byte) 0, 0, (int) (short) 10, 0, 22, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00130");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology9);
        mutablePeriod10.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod10.add(0L);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology24);
        mutablePeriod10.add(0L, chronology24);
        org.joda.time.Period period27 = new org.joda.time.Period((long) 0, (long) 6, chronology24);
        org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(2, 12, (int) (short) 10, 3, (int) (byte) 1, chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime30 = dateTime28.withHourOfDay((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test00131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00131");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        org.joda.time.Duration duration16 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        long long21 = dateMidnight18.getMillis();
        org.joda.time.PeriodType periodType22 = org.joda.time.PeriodType.days();
        org.joda.time.Period period23 = duration16.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight18, periodType22);
        java.util.Date date24 = dateMidnight18.toDate();
        boolean boolean25 = timeZone14.inDaylightTime(date24);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "Coordinated Universal Time");
        org.junit.Assert.assertNotNull(duration16);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1645401600000L + "'", long21 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType22);
        org.junit.Assert.assertNotNull(period23);
        org.junit.Assert.assertNotNull(date24);
        org.junit.Assert.assertEquals(date24.toString(), "Mon Feb 21 00:00:00 UTC 2022");
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + false + "'", boolean25 == false);
    }

    @Test
    public void test00132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00132");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder3 = builder0.set((int) ' ', (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: field is invalid");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00133");
        int int0 = java.util.Calendar.SATURDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00134");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        org.joda.time.DateMidnight dateMidnight8 = property7.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight9 = property7.getDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight11 = property7.addToCopy(4320000000L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Value cannot fit in an int: 4320000000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight9);
    }

    @Test
    public void test00135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00135");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("24");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"24\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00136");
        int int0 = java.util.Calendar.AM_PM;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00137");
        java.util.Locale locale3 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Locale locale4 = java.util.Locale.JAPAN;
        boolean boolean5 = locale4.hasExtensions();
        java.lang.String str6 = locale4.getDisplayCountry();
        java.lang.String str7 = locale3.getDisplayScript(locale4);
        java.lang.Object obj8 = locale4.clone();
        org.junit.Assert.assertEquals(locale3.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(locale4);
        org.junit.Assert.assertEquals(locale4.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "Japan" + "'", str6, "Japan");
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "" + "'", str7, "");
        org.junit.Assert.assertNotNull(obj8);
        org.junit.Assert.assertEquals(obj8.toString(), "ja_JP");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj8), "ja_JP");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj8), "ja_JP");
    }

    @Test
    public void test00138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00138");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        int int17 = localDateTime13.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minusHours(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime13.withTime(7, (int) (byte) 0, (int) (short) 100, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00139");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        int int17 = localDateTime13.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime13.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime20 = property18.setCopy("PeriodType[Standard]");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PeriodType[Standard]\" for millisOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00140");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        timeZone14.setID("PT0S");
        java.lang.Object obj17 = timeZone14.clone();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(obj17);
        org.junit.Assert.assertEquals(obj17.toString(), "java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj17), "java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj17), "java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00141");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.add((long) (short) 0);
        org.joda.time.DateTime dateTime41 = mutableDateTime40.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime40.setDateTime(1970, (int) 'a', 0, 8, 31, 999, (int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test00142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00142");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.fromCalendarFields(calendar1);
        org.joda.time.DateTime dateTime3 = localTime2.toDateTimeToday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = dateTime3.withYearOfEra((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455720552,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=sun.util.calendar.ZoneInfo[id=\"Etc/UTC\",offset=0,dstSavings=0,useDaylight=false,transitions=0,lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=0,MILLISECOND=552,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(localTime2);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00143");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        mutableDateTime33.addYears((int) (byte) -1);
        int int63 = mutableDateTime33.getEra();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setDate(19, (int) (byte) -1, 50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1645401600000L + "'", long45 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2022 + "'", int56 == 2022);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertTrue("'" + int63 + "' != '" + 0 + "'", int63 == 0);
    }

    @Test
    public void test00144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00144");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusSeconds(2);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        long long14 = dateMidnight11.getMillis();
        org.joda.time.DateMidnight.Property property15 = dateMidnight11.weekyear();
        org.joda.time.DateMidnight dateMidnight16 = property15.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight17 = property15.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime7.withField(dateTimeFieldType18, 32769);
        org.joda.time.LocalDateTime.Property property21 = localDateTime7.year();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((long) 10, chronology23);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray25 = timeOfDay24.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay27 = timeOfDay24.plusHours(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDateTime7, (org.joda.time.ReadablePartial) timeOfDay24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1645488000000L + "'", long14 == 1645488000000L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray25);
        org.junit.Assert.assertNotNull(timeOfDay27);
    }

    @Test
    public void test00145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00145");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int3 = localDate1.getValue(21);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 21");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00146");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) '#');
        int int13 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) '4');
        org.joda.time.DateTimeField dateTimeField17 = localDate12.getField((int) (byte) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((java.lang.Object) localDate12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeField17);
    }

    @Test
    public void test00147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00147");
        int int0 = java.util.Calendar.WEEK_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 3 + "'", int0 == 3);
    }

    @Test
    public void test00148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00148");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod7.add(0L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        mutablePeriod7.add(0L, chronology21);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(50, 53, 52, 19, chronology21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
    }

    @Test
    public void test00149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00149");
        int int0 = java.util.Calendar.NARROW_FORMAT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00150");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        int int17 = localDateTime13.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime13.millisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime13.plusSeconds(5);
        org.joda.time.DurationFieldType durationFieldType21 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfDay();
        org.joda.time.LocalTime localTime33 = new org.joda.time.LocalTime((long) (short) 100, chronology30);
        org.joda.time.DurationField durationField34 = durationFieldType21.getField(chronology30);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.DateTimeField dateTimeField41 = chronology40.hourOfDay();
        org.joda.time.DurationField durationField42 = durationFieldType21.getField(chronology40);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime((java.lang.Object) 5, chronology40);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(durationFieldType21);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2022 + "'", int39 == 2022);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(durationField42);
    }

    @Test
    public void test00151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00151");
        org.joda.time.DateTimeFieldType dateTimeFieldType0 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        boolean boolean21 = dateTimeFieldType0.isSupported(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period22 = new org.joda.time.Period((java.lang.Object) dateTimeFieldType0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.DateTimeFieldType$StandardDateTimeFieldType");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType0);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
    }

    @Test
    public void test00152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00152");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        java.util.Locale locale16 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime17 = property14.setCopy("", locale16);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(locale16);
        org.junit.Assert.assertEquals(locale16.toString(), "zh_TW");
    }

    @Test
    public void test00153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00153");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(10);
        java.lang.String str7 = localDateTime3.toString("1970-01-01");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = localDateTime3.withTime(6, 100, (int) (short) 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
    }

    @Test
    public void test00154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00154");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(52, 7);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00155");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("ja");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: ja [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00156");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.days();
        org.joda.time.Period period4 = new org.joda.time.Period(1645488000000L, periodType3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime1.withPeriodAdded((org.joda.time.ReadablePeriod) period4, (int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekOfWeekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime6.withField(dateTimeFieldType7, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
    }

    @Test
    public void test00157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00157");
        int int0 = java.util.Calendar.NARROW_STANDALONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 32772 + "'", int0 == 32772);
    }

    @Test
    public void test00158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00158");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        org.joda.time.Duration duration36 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime33.add((org.joda.time.ReadableDuration) duration36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setDayOfWeek((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test00159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00159");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) '#');
        int int13 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localDate12);
        java.util.Locale locale15 = java.util.Locale.PRC;
        java.lang.String str16 = locale15.toLanguageTag();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str17 = dateTimeField10.getAsText((int) (byte) 10, locale15);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 10");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(locale15);
        org.junit.Assert.assertEquals(locale15.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "zh-CN" + "'", str16, "zh-CN");
    }

    @Test
    public void test00160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00160");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.halfdayOfDay();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight10, chronology21);
        org.joda.time.LocalDate localDate27 = localDate25.withDayOfMonth(8);
        org.joda.time.LocalDate localDate29 = localDate27.plusMonths(7);
        org.joda.time.LocalDate.Property property30 = localDate27.monthOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate32 = property30.setCopy("Days");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Days\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(property30);
    }

    @Test
    public void test00161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00161");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime10 = yearMonthDay9.toDateTimeAtMidnight();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateTime10);
        java.lang.String str12 = interval11.toString();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        long long19 = dateMidnight16.getMillis();
        org.joda.time.DateMidnight.Property property20 = dateMidnight16.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval21 = interval11.withStart((org.joda.time.ReadableInstant) dateMidnight16);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The end instant must be greater or equal to the start");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645401600000L + "'", long6 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022-02-21T00:00:00.000Z/2022-02-21T00:00:00.000Z" + "'", str12, "2022-02-21T00:00:00.000Z/2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 1645488000000L + "'", long19 == 1645488000000L);
        org.junit.Assert.assertNotNull(property20);
    }

    @Test
    public void test00162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00162");
        org.joda.time.Period period1 = org.joda.time.Period.weeks((int) ' ');
        org.joda.time.DurationFieldType durationFieldType2 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.LocalTime localTime14 = new org.joda.time.LocalTime((long) (short) 100, chronology11);
        org.joda.time.DurationField durationField15 = durationFieldType2.getField(chronology11);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.DateTimeField dateTimeField22 = chronology21.hourOfDay();
        org.joda.time.DurationField durationField23 = durationFieldType2.getField(chronology21);
        org.joda.time.DateTimeField dateTimeField24 = chronology21.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((java.lang.Object) period1, chronology21);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Period");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertNotNull(durationFieldType2);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(durationField15);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
    }

    @Test
    public void test00163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00163");
        org.joda.time.Period period1 = org.joda.time.Period.seconds((-1));
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00164");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        long long8 = property7.remainder();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        int int11 = dateMidnight10.getSecondOfMinute();
        int int12 = property7.compareTo((org.joda.time.ReadableInstant) dateMidnight10);
        int int13 = property7.getMinimumValueOverall();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 4320000000L + "'", long8 == 4320000000L);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 0 + "'", int11 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + (-292275054) + "'", int13 == (-292275054));
    }

    @Test
    public void test00165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00165");
        int int0 = java.util.Calendar.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00166");
        int int0 = org.joda.time.MutableDateTime.ROUND_HALF_EVEN;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 5 + "'", int0 == 5);
    }

    @Test
    public void test00167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00167");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        java.lang.Object obj4 = calendar1.clone();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455722305,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=24,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=2,MILLISECOND=305,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(obj4);
// flaky:         org.junit.Assert.assertEquals(obj4.toString(), "java.util.GregorianCalendar[time=1645455722305,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=24,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=2,MILLISECOND=305,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj4), "java.util.GregorianCalendar[time=1645455722305,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=24,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=2,MILLISECOND=305,ZONE_OFFSET=0,DST_OFFSET=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj4), "java.util.GregorianCalendar[time=1645455722305,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=24,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=2,MILLISECOND=305,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00168");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(2, 14, (int) (byte) 100, (int) (short) 0, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 14 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00169");
        org.joda.time.PeriodType periodType2 = org.joda.time.PeriodType.yearDayTime();
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, 36000L, periodType2);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration9 = duration5.withDurationAdded((org.joda.time.ReadableDuration) duration7, 12);
        long long10 = duration5.getStandardMinutes();
        boolean boolean11 = mutablePeriod3.equals((java.lang.Object) long10);
        org.junit.Assert.assertNotNull(periodType2);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertTrue("'" + long10 + "' != '" + 50400L + "'", long10 == 50400L);
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
    }

    @Test
    public void test00170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00170");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate(32772, (int) (short) 100, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00171");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.days();
        org.joda.time.Period period2 = new org.joda.time.Period(1645488000000L, periodType1);
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(periodType1);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.setMinutes(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'minutes'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
    }

    @Test
    public void test00172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00172");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setLanguageTag("ISOChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: ISOChronology[Etc/UTC] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00173");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant(4320000000L);
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder9 = builder2.setTimeOfDay(21, 10, (int) (short) 100, 12);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00174");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearDayTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType2 = periodType0.getFieldType(14);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 14");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test00175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00175");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusDays((int) (short) -1);
        int int16 = dateMidnight15.getYearOfEra();
        org.joda.time.Chronology chronology17 = dateMidnight15.getChronology();
        long long18 = dateMidnight15.getMillis();
        org.joda.time.DateMidnight.Property property19 = dateMidnight15.weekyear();
        org.joda.time.DateMidnight dateMidnight20 = property19.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((java.lang.Object) dateMidnight20);
        boolean boolean22 = calendar11.equals((java.lang.Object) dateMidnight20);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1645488000000L + "'", long18 == 1645488000000L);
        org.junit.Assert.assertNotNull(property19);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + false + "'", boolean22 == false);
    }

    @Test
    public void test00176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00176");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00177");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        int int15 = dateTime14.getMonthOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology19);
        mutablePeriod20.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod20.add(0L);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        int int33 = dateMidnight32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateMidnight32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology34);
        mutablePeriod20.add(0L, chronology34);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (-1), chronology34);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (short) 10, chronology46);
        org.joda.time.MutableDateTime mutableDateTime49 = dateMidnight37.toMutableDateTime(chronology46);
        mutableDateTime49.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime49.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime49.toMutableDateTime(dateTimeZone53);
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = yearMonthDay55.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = yearMonthDay55.toDateTimeAtCurrentTime(dateTimeZone57);
        org.joda.time.Duration duration59 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType63 = periodType62.withWeeksRemoved();
        org.joda.time.Period period64 = new org.joda.time.Period((long) 1970, (long) 3, periodType62);
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableDuration) duration59, periodType62);
        org.joda.time.DateTime.Property property66 = dateTime14.dayOfYear();
        org.joda.time.Chronology chronology68 = null;
        org.joda.time.DateMidnight dateMidnight69 = new org.joda.time.DateMidnight(chronology68);
        org.joda.time.DateMidnight dateMidnight71 = dateMidnight69.minusDays((int) (short) -1);
        int int72 = dateMidnight71.getYearOfEra();
        org.joda.time.Chronology chronology73 = dateMidnight71.getChronology();
        long long74 = dateMidnight71.getMillis();
        java.util.Locale locale78 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar79 = dateMidnight71.toCalendar(locale78);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime80 = property66.setCopy("hi!", locale78);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"hi!\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(dateMidnight71);
        org.junit.Assert.assertTrue("'" + int72 + "' != '" + 2022 + "'", int72 == 2022);
        org.junit.Assert.assertNotNull(chronology73);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 1645488000000L + "'", long74 == 1645488000000L);
        org.junit.Assert.assertEquals(locale78.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar79);
        org.junit.Assert.assertEquals(calendar79.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00178");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime1 = yearMonthDay0.toDateTimeAtMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withMonthOfYear(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTime1);
    }

    @Test
    public void test00179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00179");
        java.util.Date date8 = new java.util.Date((long) 1);
        org.joda.time.YearMonthDay yearMonthDay9 = org.joda.time.YearMonthDay.fromDateFields(date8);
        org.joda.time.YearMonthDay.Property property10 = yearMonthDay9.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay11 = property10.getYearMonthDay();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone22 = chronology19.getZone();
        org.joda.time.DateTime dateTime23 = yearMonthDay11.toDateTimeAtCurrentTime(dateTimeZone22);
        boolean boolean25 = dateTimeZone22.isStandardOffset((long) 0);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime26 = new org.joda.time.MutableDateTime(3, 1970, 32769, (int) (byte) -1, 53, 31, 9, dateTimeZone22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date8.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(yearMonthDay9);
        org.junit.Assert.assertNotNull(property10);
        org.junit.Assert.assertNotNull(yearMonthDay11);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeZone22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
    }

    @Test
    public void test00180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00180");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        int int4 = localDate1.getCenturyOfEra();
        java.util.Locale locale9 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Locale locale10 = java.util.Locale.JAPAN;
        boolean boolean11 = locale10.hasExtensions();
        java.lang.String str12 = locale10.getDisplayCountry();
        java.lang.String str13 = locale9.getDisplayScript(locale10);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str14 = localDate1.toString("gregory", locale9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: g");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertEquals(locale9.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + boolean11 + "' != '" + false + "'", boolean11 == false);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "Japan" + "'", str12, "Japan");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00181");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundFloor();
        java.util.Locale locale41 = java.util.Locale.CHINA;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime42 = property38.set("-00:00:00.001", locale41);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"-00:00:00.001\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(locale41);
        org.junit.Assert.assertEquals(locale41.toString(), "zh_CN");
    }

    @Test
    public void test00182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00182");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTimeField dateTimeField10 = chronology8.clockhourOfDay();
        org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime(chronology8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.millisOfDay();
        org.joda.time.DateTime dateTime22 = dateTime11.withChronology(chronology19);
        org.joda.time.LocalTime localTime23 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) -1, chronology19);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology19);
        // The following exception was thrown during execution in test generation
        try {
            long long29 = chronology19.getDateTimeMillis(53, (-1), 1969, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(localTime23);
    }

    @Test
    public void test00183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00183");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        timeZone14.setID("PT0S");
        boolean boolean17 = timeZone14.useDaylightTime();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertTrue("'" + boolean17 + "' != '" + false + "'", boolean17 == false);
    }

    @Test
    public void test00184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00184");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        // The following exception was thrown during execution in test generation
        try {
            calendar11.add((int) '#', (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
    }

    @Test
    public void test00185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00185");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("Thu Jan 01 15:00:00 UTC 1970", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00186");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.DateTime.Property property14 = dateTime12.minuteOfHour();
        java.util.Locale locale19 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Locale locale20 = java.util.Locale.JAPAN;
        boolean boolean21 = locale20.hasExtensions();
        java.lang.String str22 = locale20.getDisplayCountry();
        java.lang.String str23 = locale19.getDisplayScript(locale20);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime24 = property14.setCopy("gregory", locale20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"gregory\" for minuteOfHour is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertEquals(locale19.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "Japan" + "'", str22, "Japan");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "" + "'", str23, "");
    }

    @Test
    public void test00187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00187");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        mutableDateTime33.addYears((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setMinuteOfDay((-23641));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -23641 for minuteOfDay must be in the range [0,1439]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1645401600000L + "'", long45 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2022 + "'", int56 == 2022);
        org.junit.Assert.assertNotNull(chronology57);
    }

    @Test
    public void test00188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00188");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(2022);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00189");
        java.util.Date date3 = new java.util.Date((-1), (int) (short) 0, 0);
        int int4 = date3.getDate();
        int int5 = date3.getTimezoneOffset();
        java.util.Date date7 = new java.util.Date((long) 1);
        org.joda.time.YearMonthDay yearMonthDay8 = org.joda.time.YearMonthDay.fromDateFields(date7);
        int int9 = date7.getHours();
        date7.setDate((int) '#');
        int int12 = date3.compareTo(date7);
// flaky:         org.junit.Assert.assertEquals(date3.toString(), "Sat Dec 31 00:00:00 GMT+00:00 1898");
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 31 + "'", int4 == 31);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
// flaky:         org.junit.Assert.assertEquals(date7.toString(), "Wed Feb 04 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + (-1) + "'", int12 == (-1));
    }

    @Test
    public void test00190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00190");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        int int1 = dateMidnight0.getMinuteOfDay();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.minusMonths(10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMillis(0);
        int[] intArray18 = new int[] {};
        int int19 = dateTimeField13.getMaximumValue((org.joda.time.ReadablePartial) localDateTime17, intArray18);
        int int21 = dateTimeField13.getMinimumValue((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = dateTimeField13.getType();
        int int23 = dateMidnight0.get(dateTimeFieldType22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight25 = dateMidnight0.withMonthOfYear(21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 24 + "'", int19 == 24);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 24 + "'", int23 == 24);
    }

    @Test
    public void test00191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00191");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeZone dateTimeZone9 = null;
        org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime(dateTimeZone9);
        org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMillisOfSecond(10);
        java.lang.String str16 = localDateTime12.toString("1970-01-01");
        int[] intArray18 = chronology7.get((org.joda.time.ReadablePartial) localDateTime12, (long) (-1));
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.DateMidnight dateMidnight23 = new org.joda.time.DateMidnight(chronology22);
        org.joda.time.DateMidnight dateMidnight25 = dateMidnight23.minusDays((int) (short) -1);
        int int26 = dateMidnight25.getYearOfEra();
        org.joda.time.Chronology chronology27 = dateMidnight25.getChronology();
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology27);
        org.joda.time.DateTimeField dateTimeField29 = chronology27.clockhourOfDay();
        org.joda.time.DateTime dateTime30 = new org.joda.time.DateTime(chronology27);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        int int37 = dateMidnight36.getYearOfEra();
        org.joda.time.Chronology chronology38 = dateMidnight36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.millisOfDay();
        org.joda.time.DateTime dateTime41 = dateTime30.withChronology(chronology38);
        org.joda.time.LocalTime localTime42 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) -1, chronology38);
        int int43 = localTime42.getMillisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            int int44 = localDateTime12.compareTo((org.joda.time.ReadablePartial) localTime42);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01" + "'", str16, "1970-01-01");
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[1969, 12, 31, 86399999]");
        org.junit.Assert.assertNotNull(dateMidnight25);
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 2022 + "'", int26 == 2022);
        org.junit.Assert.assertNotNull(chronology27);
        org.junit.Assert.assertNotNull(dateTimeField29);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(localTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 999 + "'", int43 == 999);
    }

    @Test
    public void test00192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00192");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.DateTime dateTime5 = dateTime3.withMillisOfSecond(53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = dateTime5.withHourOfDay(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00193");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology10);
        mutablePeriod11.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod11.add(0L);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        int int24 = dateMidnight23.getYearOfEra();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology25);
        mutablePeriod11.add(0L, chronology25);
        boolean boolean28 = dateTimeFieldType7.isSupported(chronology25);
        org.joda.time.DurationField durationField29 = chronology25.hours();
        org.joda.time.DurationFieldType durationFieldType30 = durationField29.getType();
        org.joda.time.LocalDateTime localDateTime32 = localDateTime6.withFieldAdded(durationFieldType30, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime34 = localDateTime32.withHourOfDay((-23641));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -23641 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNotNull(durationField29);
        org.junit.Assert.assertNotNull(durationFieldType30);
        org.junit.Assert.assertNotNull(localDateTime32);
    }

    @Test
    public void test00194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00194");
        java.util.Date date1 = new java.util.Date((long) 1);
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime(dateTimeZone2);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.yearOfEra();
        org.joda.time.LocalDateTime localDateTime7 = property6.roundHalfEvenCopy();
        int int8 = localDateTime7.getDayOfYear();
        org.joda.time.LocalDateTime localDateTime12 = localDateTime7.withDate((int) (byte) -1, (int) (byte) 10, 7);
        boolean boolean13 = date1.equals((java.lang.Object) (byte) 10);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1 + "'", int8 == 1);
        org.junit.Assert.assertNotNull(localDateTime12);
        org.junit.Assert.assertTrue("'" + boolean13 + "' != '" + false + "'", boolean13 == false);
    }

    @Test
    public void test00195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00195");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        // The following exception was thrown during execution in test generation
        try {
            int int3 = calendar1.getActualMaximum(59);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 59");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455724553,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=4,MILLISECOND=553,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00196");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate2 = org.joda.time.LocalDate.now(dateTimeZone1);
        org.joda.time.DateTime dateTime3 = org.joda.time.DateTime.now(dateTimeZone1);
        org.joda.time.Duration duration6 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime3, (org.joda.time.ReadableDuration) duration6);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime9 = dateTime3.withDayOfWeek(21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 21 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertNotNull(localDate2);
        org.junit.Assert.assertNotNull(dateTime3);
    }

    @Test
    public void test00197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00197");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        int int13 = dateTime12.getCenturyOfEra();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology16);
        mutablePeriod17.setPeriod((long) (short) 10, (long) (short) -1);
        int int22 = mutablePeriod17.getValue(0);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusDays((int) (short) -1);
        org.joda.time.Duration duration27 = mutablePeriod17.toDurationTo((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.minusDays((int) (short) -1);
        int int34 = dateMidnight33.getYearOfEra();
        org.joda.time.Chronology chronology35 = dateMidnight33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.halfdayOfDay();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight24, chronology35);
        org.joda.time.DateTime dateTime40 = dateTime12.withChronology(chronology35);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardHours(10L);
        long long43 = duration42.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight44.withMillis((long) 24);
        long long47 = dateMidnight46.getMillis();
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration42, (org.joda.time.ReadableInstant) dateMidnight46);
        int int49 = dateMidnight46.getSecondOfDay();
        int int50 = dateTime40.compareTo((org.joda.time.ReadableInstant) dateMidnight46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight52 = dateMidnight46.withEra((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2022 + "'", int34 == 2022);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 36000L + "'", long43 == 36000L);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test00198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00198");
        long long1 = java.util.Date.parse("Sat Dec 31 00:00:00 UTC 1898");
        org.junit.Assert.assertTrue("'" + long1 + "' != '" + (-2240611200000L) + "'", long1 == (-2240611200000L));
    }

    @Test
    public void test00199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00199");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("hourOfHalfday", (double) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=10.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00200");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusMonths(10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        org.joda.time.DateTime dateTime23 = new org.joda.time.DateTime((long) (short) 10, chronology21);
        org.joda.time.DateTime dateTime24 = dateTime12.toDateTime(chronology21);
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight(chronology27);
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight28.minusDays((int) (short) -1);
        int int31 = dateMidnight30.getYearOfEra();
        org.joda.time.Chronology chronology32 = dateMidnight30.getChronology();
        org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology32);
        org.joda.time.DateTimeField dateTimeField34 = chronology32.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField35 = chronology32.halfdayOfDay();
        org.joda.time.LocalDate localDate37 = new org.joda.time.LocalDate((long) '#');
        int int38 = dateTimeField35.getMinimumValue((org.joda.time.ReadablePartial) localDate37);
        org.joda.time.LocalDate localDate40 = localDate37.withYearOfEra((int) '4');
        org.joda.time.DateTimeField dateTimeField42 = localDate37.getField((int) (byte) 0);
        org.joda.time.LocalDate localDate44 = localDate37.plusYears(8);
        org.joda.time.LocalDate localDate46 = localDate37.withYearOfCentury(0);
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.MutablePeriod mutablePeriod51 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology50);
        mutablePeriod51.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod51.add(0L);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(chronology60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.minusDays((int) (short) -1);
        int int64 = dateMidnight63.getYearOfEra();
        org.joda.time.Chronology chronology65 = dateMidnight63.getChronology();
        org.joda.time.MutablePeriod mutablePeriod66 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology65);
        mutablePeriod51.add(0L, chronology65);
        org.joda.time.DateMidnight dateMidnight68 = new org.joda.time.DateMidnight((long) (-1), chronology65);
        org.joda.time.Chronology chronology72 = null;
        org.joda.time.DateMidnight dateMidnight73 = new org.joda.time.DateMidnight(chronology72);
        org.joda.time.DateMidnight dateMidnight75 = dateMidnight73.minusDays((int) (short) -1);
        int int76 = dateMidnight75.getYearOfEra();
        org.joda.time.Chronology chronology77 = dateMidnight75.getChronology();
        org.joda.time.MutablePeriod mutablePeriod78 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology77);
        org.joda.time.DateTime dateTime79 = new org.joda.time.DateTime((long) (short) 10, chronology77);
        org.joda.time.MutableDateTime mutableDateTime80 = dateMidnight68.toMutableDateTime(chronology77);
        mutableDateTime80.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property83 = mutableDateTime80.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone84 = null;
        org.joda.time.MutableDateTime mutableDateTime85 = mutableDateTime80.toMutableDateTime(dateTimeZone84);
        org.joda.time.Chronology chronology88 = null;
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology88);
        mutablePeriod89.setPeriod((long) (short) 10, (long) (short) -1);
        int int93 = mutablePeriod89.getMonths();
        mutablePeriod89.addMinutes((int) (short) 0);
        mutableDateTime80.add((org.joda.time.ReadablePeriod) mutablePeriod89, 12);
        org.joda.time.LocalDate localDate98 = localDate37.minus((org.joda.time.ReadablePeriod) mutablePeriod89);
        org.joda.time.DateTime dateTime99 = dateTime24.withFields((org.joda.time.ReadablePartial) localDate98);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 2022 + "'", int31 == 2022);
        org.junit.Assert.assertNotNull(chronology32);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
        org.junit.Assert.assertNotNull(localDate40);
        org.junit.Assert.assertNotNull(dateTimeField42);
        org.junit.Assert.assertNotNull(localDate44);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2022 + "'", int64 == 2022);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateMidnight75);
        org.junit.Assert.assertTrue("'" + int76 + "' != '" + 2022 + "'", int76 == 2022);
        org.junit.Assert.assertNotNull(chronology77);
        org.junit.Assert.assertNotNull(mutableDateTime80);
        org.junit.Assert.assertNotNull(property83);
        org.junit.Assert.assertNotNull(mutableDateTime85);
        org.junit.Assert.assertTrue("'" + int93 + "' != '" + 0 + "'", int93 == 0);
        org.junit.Assert.assertNotNull(localDate98);
        org.junit.Assert.assertNotNull(dateTime99);
    }

    @Test
    public void test00201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00201");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        int int11 = dateTime10.getWeekOfWeekyear();
        java.lang.Class<?> wildcardClass12 = dateTime10.getClass();
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 8 + "'", int11 == 8);
        org.junit.Assert.assertNotNull(wildcardClass12);
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
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withCenturyOfEra(1970);
        org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfYear();
        org.joda.time.tz.NameProvider nameProvider8 = org.joda.time.DateTimeZone.getNameProvider();
        java.util.Locale locale9 = java.util.Locale.TRADITIONAL_CHINESE;
        java.lang.String str12 = nameProvider8.getShortName(locale9, "DateTimeField[clockhourOfDay]", "PT0S");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime13 = property6.setCopy("-00:00:00.001", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"-00:00:00.001\" for dayOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertNotNull(nameProvider8);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "zh_TW");
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test00204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00204");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("hourOfHalfday");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=hourofhalfday");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00205");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate4 = localDate1.withDayOfWeek((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
    }

    @Test
    public void test00206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00206");
        int int0 = java.util.Calendar.DST_OFFSET;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 16 + "'", int0 == 16);
    }

    @Test
    public void test00207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00207");
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.weekyearOfCentury();
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology11);
        mutablePeriod12.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod12.add(0L);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology26);
        mutablePeriod12.add(0L, chronology26);
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight((long) (-1), chronology26);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        int int37 = dateMidnight36.getYearOfEra();
        org.joda.time.Chronology chronology38 = dateMidnight36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) 10, chronology38);
        org.joda.time.MutableDateTime mutableDateTime41 = dateMidnight29.toMutableDateTime(chronology38);
        org.joda.time.DateTimeField dateTimeField42 = dateTimeFieldType7.getField(chronology38);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime43 = new org.joda.time.DateTime(59, (int) 'a', (int) (short) 1, (int) (short) 1, 4, (int) (short) 100, 16, chronology38);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(mutableDateTime41);
        org.junit.Assert.assertNotNull(dateTimeField42);
    }

    @Test
    public void test00208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00208");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("zh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zh\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00209");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        boolean boolean2 = calendar1.isWeekDateSupported();
        // The following exception was thrown during execution in test generation
        try {
            int int4 = calendar1.getActualMinimum((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455725747,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=5,MILLISECOND=747,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00210");
        int int0 = java.util.Calendar.MARCH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00211");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(10);
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology10);
        mutablePeriod11.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod11.add(0L);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        int int24 = dateMidnight23.getYearOfEra();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology25);
        mutablePeriod11.add(0L, chronology25);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (-1), chronology25);
        org.joda.time.DateTimeField dateTimeField29 = dateTimeFieldType6.getField(chronology25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime31 = localDateTime5.withField(dateTimeFieldType6, (-2));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField29);
    }

    @Test
    public void test00212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00212");
        int int0 = java.util.Calendar.SECOND;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 13 + "'", int0 == 13);
    }

    @Test
    public void test00213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00213");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = timeOfDay2.getFields();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) 10, chronology5);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = timeOfDay6.getFields();
        org.joda.time.Period period8 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay2, (org.joda.time.ReadablePartial) timeOfDay6);
        int[] intArray9 = timeOfDay6.getValues();
        org.joda.time.DateTime dateTime10 = timeOfDay6.toDateTimeToday();
        org.joda.time.DateMidnight dateMidnight11 = dateTime10.toDateMidnight();
        org.joda.time.DateTime dateTime13 = dateTime10.withMillisOfSecond(3);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology16);
        mutablePeriod17.setPeriod((long) (short) 10, (long) (short) -1);
        int int22 = mutablePeriod17.getValue(0);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusDays((int) (short) -1);
        org.joda.time.Duration duration27 = mutablePeriod17.toDurationTo((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.minusDays((int) (short) -1);
        int int34 = dateMidnight33.getYearOfEra();
        org.joda.time.Chronology chronology35 = dateMidnight33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.halfdayOfDay();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight24, chronology35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((java.lang.Object) 3, chronology35);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2022 + "'", int34 == 2022);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
    }

    @Test
    public void test00214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00214");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((-1), (int) (byte) 0, (int) (byte) 1, 53, 14, 999, 14);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00215");
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
    public void test00216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00216");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        org.joda.time.LocalDate localDate5 = property3.addWrapFieldToCopy((int) (short) 10);
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusDays((int) (short) -1);
        int int14 = dateMidnight13.getYearOfEra();
        org.joda.time.Chronology chronology15 = dateMidnight13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfDay();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) 100, chronology15);
        org.joda.time.DurationField durationField19 = durationFieldType6.getField(chronology15);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate21 = localDate5.withFieldAdded(durationFieldType6, 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'seconds' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField19);
    }

    @Test
    public void test00217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00217");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        int int10 = dateTimeField9.getMaximumValue();
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 24 + "'", int10 == 24);
    }

    @Test
    public void test00218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00218");
        org.joda.time.DurationFieldType durationFieldType3 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        int int11 = dateMidnight10.getYearOfEra();
        org.joda.time.Chronology chronology12 = dateMidnight10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfDay();
        org.joda.time.LocalTime localTime15 = new org.joda.time.LocalTime((long) (short) 100, chronology12);
        org.joda.time.DurationField durationField16 = durationFieldType3.getField(chronology12);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        int int21 = dateMidnight20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateMidnight20.getChronology();
        org.joda.time.DateTimeField dateTimeField23 = chronology22.hourOfDay();
        org.joda.time.DurationField durationField24 = durationFieldType3.getField(chronology22);
        org.joda.time.DateTimeField dateTimeField25 = chronology22.clockhourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate26 = new org.joda.time.LocalDate(9, 5, (int) (short) -1, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType3);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(durationField16);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(durationField24);
        org.junit.Assert.assertNotNull(dateTimeField25);
    }

    @Test
    public void test00219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00219");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("2022-02-22T00:00:00.000Z");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-22T00:00:00.000Z [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00220");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration5 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration3, 12);
        org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate8 = org.joda.time.LocalDate.now(dateTimeZone7);
        org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone7);
        org.joda.time.Duration duration12 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime9, (org.joda.time.ReadableDuration) duration12);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        int int21 = dateMidnight20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateMidnight20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology22);
        org.joda.time.DateTime dateTime24 = new org.joda.time.DateTime((long) (short) 10, chronology22);
        org.joda.time.DateTime dateTime26 = dateTime24.minusHours(7);
        org.joda.time.DateTime dateTime28 = dateTime26.plusYears((int) (byte) 0);
        int int29 = dateTime28.getMonthOfYear();
        org.joda.time.Interval interval30 = duration12.toIntervalFrom((org.joda.time.ReadableInstant) dateTime28);
        org.joda.time.Duration duration31 = duration1.minus((org.joda.time.ReadableDuration) duration12);
        org.joda.time.Seconds seconds32 = duration1.toStandardSeconds();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(dateTimeZone7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(dateTime9);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertNotNull(dateTime28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 12 + "'", int29 == 12);
        org.junit.Assert.assertNotNull(interval30);
        org.junit.Assert.assertNotNull(duration31);
        org.junit.Assert.assertNotNull(seconds32);
    }

    @Test
    public void test00221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00221");
        org.joda.time.Period period1 = org.joda.time.Period.millis(0);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        int int4 = dateMidnight3.getMillisOfSecond();
        org.joda.time.PeriodType periodType6 = null;
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.Period period8 = new org.joda.time.Period((long) '#', periodType6, chronology7);
        org.joda.time.Period period10 = period8.withDays((int) ' ');
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadablePeriod) period10);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology15);
        mutablePeriod16.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod16.add(0L);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        mutablePeriod16.add(0L, chronology30);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (-1), chronology30);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(chronology37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.minusDays((int) (short) -1);
        int int41 = dateMidnight40.getYearOfEra();
        org.joda.time.Chronology chronology42 = dateMidnight40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology42);
        org.joda.time.DateTime dateTime44 = new org.joda.time.DateTime((long) (short) 10, chronology42);
        org.joda.time.MutableDateTime mutableDateTime45 = dateMidnight33.toMutableDateTime(chronology42);
        mutableDateTime45.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime45.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone49 = null;
        org.joda.time.MutableDateTime mutableDateTime50 = mutableDateTime45.toMutableDateTime(dateTimeZone49);
        org.joda.time.Chronology chronology53 = null;
        org.joda.time.MutablePeriod mutablePeriod54 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology53);
        mutablePeriod54.setPeriod((long) (short) 10, (long) (short) -1);
        int int58 = mutablePeriod54.getMonths();
        mutablePeriod54.addMinutes((int) (short) 0);
        mutableDateTime45.add((org.joda.time.ReadablePeriod) mutablePeriod54, 12);
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.LocalDateTime localDateTime64 = new org.joda.time.LocalDateTime(dateTimeZone63);
        org.joda.time.LocalDateTime localDateTime66 = localDateTime64.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property67 = localDateTime64.yearOfEra();
        org.joda.time.LocalDateTime localDateTime68 = property67.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime69 = property67.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology73 = null;
        org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology73);
        mutablePeriod74.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod74.add(0L);
        org.joda.time.Chronology chronology83 = null;
        org.joda.time.DateMidnight dateMidnight84 = new org.joda.time.DateMidnight(chronology83);
        org.joda.time.DateMidnight dateMidnight86 = dateMidnight84.minusDays((int) (short) -1);
        int int87 = dateMidnight86.getYearOfEra();
        org.joda.time.Chronology chronology88 = dateMidnight86.getChronology();
        org.joda.time.MutablePeriod mutablePeriod89 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology88);
        mutablePeriod74.add(0L, chronology88);
        boolean boolean91 = dateTimeFieldType70.isSupported(chronology88);
        org.joda.time.DurationField durationField92 = chronology88.hours();
        org.joda.time.DurationFieldType durationFieldType93 = durationField92.getType();
        org.joda.time.LocalDateTime localDateTime95 = localDateTime69.withFieldAdded(durationFieldType93, (int) (short) -1);
        int int96 = mutablePeriod54.indexOf(durationFieldType93);
        int int97 = period10.get(durationFieldType93);
        int int98 = period1.get(durationFieldType93);
        org.junit.Assert.assertNotNull(period1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 0 + "'", int4 == 0);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2022 + "'", int41 == 2022);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertNotNull(property48);
        org.junit.Assert.assertNotNull(mutableDateTime50);
        org.junit.Assert.assertTrue("'" + int58 + "' != '" + 0 + "'", int58 == 0);
        org.junit.Assert.assertNotNull(localDateTime66);
        org.junit.Assert.assertNotNull(property67);
        org.junit.Assert.assertNotNull(localDateTime68);
        org.junit.Assert.assertNotNull(localDateTime69);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
        org.junit.Assert.assertNotNull(dateMidnight86);
        org.junit.Assert.assertTrue("'" + int87 + "' != '" + 2022 + "'", int87 == 2022);
        org.junit.Assert.assertNotNull(chronology88);
        org.junit.Assert.assertTrue("'" + boolean91 + "' != '" + true + "'", boolean91 == true);
        org.junit.Assert.assertNotNull(durationField92);
        org.junit.Assert.assertNotNull(durationFieldType93);
        org.junit.Assert.assertNotNull(localDateTime95);
        org.junit.Assert.assertTrue("'" + int96 + "' != '" + 4 + "'", int96 == 4);
        org.junit.Assert.assertTrue("'" + int97 + "' != '" + 0 + "'", int97 == 0);
        org.junit.Assert.assertTrue("'" + int98 + "' != '" + 0 + "'", int98 == 0);
    }

    @Test
    public void test00222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00222");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("\ufffd\ufffd", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00223");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 5, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusSeconds((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDateTime4.getValue(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 31");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00224");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        int int4 = localDate1.getCenturyOfEra();
        org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean6 = localDate1.isBefore((org.joda.time.ReadablePartial) localDateTime5);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(localDateTime5);
    }

    @Test
    public void test00225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00225");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        int int36 = mutableDateTime33.getYearOfEra();
        mutableDateTime33.addMonths(11);
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        long long41 = duration40.getStandardSeconds();
        org.joda.time.Duration duration44 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration45 = duration40.plus((org.joda.time.ReadableDuration) duration44);
        org.joda.time.Duration duration46 = duration44.toDuration();
        mutableDateTime33.add((org.joda.time.ReadableDuration) duration44);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str49 = mutableDateTime33.toString("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid pattern specification");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertTrue("'" + long41 + "' != '" + 36000L + "'", long41 == 36000L);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration46);
    }

    @Test
    public void test00226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00226");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.clockhourOfDay();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (short) 100, chronology19);
        org.joda.time.DateTime dateTime23 = dateTime10.withChronology(chronology19);
        org.joda.time.DateTime dateTime24 = dateTime23.withTimeAtStartOfDay();
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateTime24);
    }

    @Test
    public void test00227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00227");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusDays((int) (short) -1);
        int int42 = dateMidnight41.getYearOfEra();
        org.joda.time.Chronology chronology43 = dateMidnight41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.halfdayOfDay();
        mutableDateTime33.setRounding(dateTimeField46);
        org.joda.time.MutableDateTime.Property property48 = mutableDateTime33.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setDayOfWeek(59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2022 + "'", int42 == 2022);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(property48);
    }

    @Test
    public void test00228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00228");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        org.joda.time.DateTimeZone dateTimeZone3 = null;
        org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long) 5, dateTimeZone3);
        org.joda.time.LocalDateTime localDateTime6 = localDateTime4.minusSeconds((int) '#');
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = org.joda.time.DateTimeFieldType.year();
        int int8 = localDateTime4.get(dateTimeFieldType7);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = localTime0.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'year' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(dateTimeFieldType7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 1970 + "'", int8 == 1970);
    }

    @Test
    public void test00229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00229");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.millisOfDay();
        org.joda.time.DateTime dateTime21 = dateTime10.withChronology(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            long long27 = chronology18.getDateTimeMillis(1645401600000L, 363, 0, 363, 31);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 363 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00230");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("Japan");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Japan\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00231");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        org.joda.time.DateMidnight dateMidnight8 = property7.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((java.lang.Object) dateMidnight8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.minus((long) (-1));
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField22 = chronology19.halfdayOfDay();
        int int23 = dateMidnight8.get(dateTimeField22);
        int int24 = dateMidnight8.getMinuteOfHour();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(dateTimeField22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 0 + "'", int23 == 0);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 0 + "'", int24 == 0);
    }

    @Test
    public void test00232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00232");
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology7);
        org.joda.time.LocalTime localTime9 = new org.joda.time.LocalTime((java.lang.Object) chronology7);
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay((long) 10, chronology11);
        org.joda.time.DateTimeField[] dateTimeFieldArray13 = timeOfDay12.getFields();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay((long) 10, chronology15);
        org.joda.time.DateTimeField[] dateTimeFieldArray17 = timeOfDay16.getFields();
        org.joda.time.Period period18 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay12, (org.joda.time.ReadablePartial) timeOfDay16);
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean20 = timeOfDay16.isSupported(dateTimeFieldType19);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusDays((int) (short) -1);
        int int27 = dateMidnight26.getYearOfEra();
        org.joda.time.Chronology chronology28 = dateMidnight26.getChronology();
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology28);
        org.joda.time.DateTimeField dateTimeField30 = chronology28.clockhourOfDay();
        boolean boolean31 = dateTimeFieldType19.isSupported(chronology28);
        boolean boolean32 = localTime9.isSupported(dateTimeFieldType19);
        org.joda.time.LocalTime localTime34 = localTime9.plusHours(11);
        org.joda.time.LocalTime localTime36 = localTime9.withMillisOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone37 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime38 = localTime36.toDateTimeToday(dateTimeZone37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((int) 'a', 4, (int) (short) 100, 0, (int) (short) -1, dateTimeZone37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray17);
        org.junit.Assert.assertNotNull(period18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertTrue("'" + int27 + "' != '" + 2022 + "'", int27 == 2022);
        org.junit.Assert.assertNotNull(chronology28);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertTrue("'" + boolean31 + "' != '" + true + "'", boolean31 == true);
        org.junit.Assert.assertTrue("'" + boolean32 + "' != '" + true + "'", boolean32 == true);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(dateTimeZone37);
        org.junit.Assert.assertNotNull(dateTime38);
    }

    @Test
    public void test00233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00233");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod1 = org.joda.time.MutablePeriod.parse("Thu Jan 01 15:00:00 UTC 1970");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"Thu Jan 01 15:00:00 UTC 1970\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00234");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DurationField durationField11 = chronology8.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period12 = new org.joda.time.Period((java.lang.Object) chronology8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: org.joda.time.chrono.ISOChronology");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(durationField11);
    }

    @Test
    public void test00235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00235");
        char char0 = java.util.Locale.UNICODE_LOCALE_EXTENSION;
        org.junit.Assert.assertTrue("'" + char0 + "' != '" + 'u' + "'", char0 == 'u');
    }

    @Test
    public void test00236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00236");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        int int15 = dateTime14.getMonthOfYear();
        org.joda.time.DateTime dateTime17 = dateTime14.minus((long) 100);
        org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.standard();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period19 = new org.joda.time.Period((java.lang.Object) 100, periodType18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(periodType18);
    }

    @Test
    public void test00237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00237");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        calendar1.setTimeInMillis((-1L));
        // The following exception was thrown during execution in test generation
        try {
            calendar1.setWeekDate((int) (byte) 100, 31, 2022);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: invalid dayOfWeek: 2022");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=24,minimalDaysInFirstWeek=4,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00238");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        int int17 = dateTimeField9.getMinimumValue((long) 1);
        long long19 = dateTimeField9.roundHalfFloor((long) 52);
        long long22 = dateTimeField9.getDifferenceAsLong((long) (byte) -1, (long) 2);
        java.util.Locale locale24 = java.util.Locale.CHINESE;
        java.lang.String str25 = dateTimeField9.getAsText(22, locale24);
        org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval27 = yearMonthDay26.toInterval();
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.YearMonthDay yearMonthDay29 = yearMonthDay26.withChronologyRetainFields(chronology28);
        org.joda.time.DateTime dateTime30 = yearMonthDay26.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        int int37 = dateMidnight36.getYearOfEra();
        org.joda.time.Chronology chronology38 = dateMidnight36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology38);
        org.joda.time.DateTimeField dateTimeField40 = chronology38.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField41 = chronology38.halfdayOfDay();
        org.joda.time.LocalDate localDate43 = new org.joda.time.LocalDate((long) '#');
        int int44 = dateTimeField41.getMinimumValue((org.joda.time.ReadablePartial) localDate43);
        org.joda.time.Period period45 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate46 = localDate43.plus((org.joda.time.ReadablePeriod) period45);
        org.joda.time.YearMonthDay yearMonthDay47 = yearMonthDay26.minus((org.joda.time.ReadablePeriod) period45);
        java.lang.String str48 = yearMonthDay26.toString();
        org.joda.time.DateTimeZone dateTimeZone50 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime51 = yearMonthDay26.toDateTimeAtMidnight(dateTimeZone50);
        java.util.Locale locale52 = java.util.Locale.JAPAN;
        boolean boolean53 = locale52.hasExtensions();
        java.lang.String str54 = locale52.getDisplayCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str55 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) yearMonthDay26, locale52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "zh");
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "22" + "'", str25, "22");
        org.junit.Assert.assertNotNull(interval27);
        org.junit.Assert.assertNotNull(yearMonthDay29);
        org.junit.Assert.assertNotNull(dateTime30);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTimeField40);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertTrue("'" + int44 + "' != '" + 0 + "'", int44 == 0);
        org.junit.Assert.assertNotNull(localDate46);
        org.junit.Assert.assertNotNull(yearMonthDay47);
        org.junit.Assert.assertEquals("'" + str48 + "' != '" + "2022-02-21" + "'", str48, "2022-02-21");
        org.junit.Assert.assertNotNull(dateTimeZone50);
        org.junit.Assert.assertNotNull(dateTime51);
        org.junit.Assert.assertNotNull(locale52);
        org.junit.Assert.assertEquals(locale52.toString(), "ja_JP");
        org.junit.Assert.assertTrue("'" + boolean53 + "' != '" + false + "'", boolean53 == false);
// flaky:         org.junit.Assert.assertEquals("'" + str54 + "' != '" + "\u65e5\u672c" + "'", str54, "\u65e5\u672c");
    }

    @Test
    public void test00239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00239");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        org.joda.time.DateTimeFieldType dateTimeFieldType8 = org.joda.time.DateTimeFieldType.minuteOfHour();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight10 = dateMidnight3.withField(dateTimeFieldType8, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateTimeFieldType8);
    }

    @Test
    public void test00240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00240");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        int int15 = dateTime14.getMonthOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology19);
        mutablePeriod20.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod20.add(0L);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        int int33 = dateMidnight32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateMidnight32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology34);
        mutablePeriod20.add(0L, chronology34);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (-1), chronology34);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (short) 10, chronology46);
        org.joda.time.MutableDateTime mutableDateTime49 = dateMidnight37.toMutableDateTime(chronology46);
        mutableDateTime49.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime49.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime49.toMutableDateTime(dateTimeZone53);
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = yearMonthDay55.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = yearMonthDay55.toDateTimeAtCurrentTime(dateTimeZone57);
        org.joda.time.Duration duration59 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType63 = periodType62.withWeeksRemoved();
        org.joda.time.Period period64 = new org.joda.time.Period((long) 1970, (long) 3, periodType62);
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableDuration) duration59, periodType62);
        org.joda.time.DateTime dateTime66 = dateTime14.withEarlierOffsetAtOverlap();
        int int67 = dateTime66.getWeekOfWeekyear();
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertTrue("'" + int67 + "' != '" + 1 + "'", int67 == 1);
    }

    @Test
    public void test00241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00241");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("-00:00:00.001", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00242");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        java.util.Date date9 = dateMidnight3.toDate();
        org.joda.time.DurationFieldType durationFieldType10 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        org.joda.time.DateTimeField dateTimeField21 = chronology19.clockhourOfDay();
        org.joda.time.LocalTime localTime22 = new org.joda.time.LocalTime((long) (short) 100, chronology19);
        org.joda.time.DurationField durationField23 = durationFieldType10.getField(chronology19);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusDays((int) (short) -1);
        int int28 = dateMidnight27.getYearOfEra();
        org.joda.time.Chronology chronology29 = dateMidnight27.getChronology();
        org.joda.time.DateTimeField dateTimeField30 = chronology29.hourOfDay();
        org.joda.time.DurationField durationField31 = durationFieldType10.getField(chronology29);
        org.joda.time.DateTimeField dateTimeField32 = chronology29.dayOfYear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period33 = new org.joda.time.Period((java.lang.Object) date9, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Date");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645401600000L + "'", long6 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(date9);
// flaky:         org.junit.Assert.assertEquals(date9.toString(), "Mon Feb 21 00:00:00 GMT+00:00 2022");
        org.junit.Assert.assertNotNull(durationFieldType10);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertNotNull(dateTimeField21);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2022 + "'", int28 == 2022);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(dateTimeField30);
        org.junit.Assert.assertNotNull(durationField31);
        org.junit.Assert.assertNotNull(dateTimeField32);
    }

    @Test
    public void test00243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00243");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime17 = localDateTime13.withMonthOfYear((int) '4');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
    }

    @Test
    public void test00244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00244");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withChronologyRetainFields(chronology2);
        org.joda.time.DateTime dateTime4 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        int int11 = dateMidnight10.getYearOfEra();
        org.joda.time.Chronology chronology12 = dateMidnight10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.halfdayOfDay();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) '#');
        int int18 = dateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.Period period19 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate20 = localDate17.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay0.minus((org.joda.time.ReadablePeriod) period19);
        java.lang.String str22 = yearMonthDay0.toString();
        org.joda.time.LocalDate localDate23 = yearMonthDay0.toLocalDate();
        org.joda.time.DateTimeZone dateTimeZone24 = null;
        org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime(dateTimeZone24);
        org.joda.time.LocalDateTime localDateTime27 = localDateTime25.plusWeeks((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period28 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) yearMonthDay0, (org.joda.time.ReadablePartial) localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: ReadablePartial objects must have the same set of fields");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2022-02-21" + "'", str22, "2022-02-21");
        org.junit.Assert.assertNotNull(localDate23);
        org.junit.Assert.assertNotNull(localDateTime27);
    }

    @Test
    public void test00245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00245");
        org.joda.time.DateTimeZone dateTimeZone1 = null;
        org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long) 5, dateTimeZone1);
        org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusSeconds((int) '#');
        // The following exception was thrown during execution in test generation
        try {
            int int6 = localDateTime2.getValue((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -1");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime4);
    }

    @Test
    public void test00246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00246");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        timeZone14.setID("PT0S");
        java.lang.String str17 = timeZone14.getID();
        java.lang.String str18 = timeZone14.getID();
        java.lang.String str19 = timeZone14.getID();
        // The following exception was thrown during execution in test generation
        try {
            int int26 = timeZone14.getOffset(69, 100, 9, 9, (-1), (int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 69");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0S" + "'", str17, "PT0S");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "PT0S" + "'", str18, "PT0S");
        org.junit.Assert.assertEquals("'" + str19 + "' != '" + "PT0S" + "'", str19, "PT0S");
    }

    @Test
    public void test00247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00247");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setMinimalDaysInFirstWeek((int) (short) 1);
        boolean boolean5 = calendar1.before((java.lang.Object) 18748801970L);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        org.joda.time.DurationField durationField12 = chronology11.minutes();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval13 = new org.joda.time.Interval((java.lang.Object) calendar1, chronology11);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.util.GregorianCalendar");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455729064,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=9,MILLISECOND=64,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean5 + "' != '" + false + "'", boolean5 == false);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(durationField12);
    }

    @Test
    public void test00248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00248");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder2 = builder0.setScript("Thu Jan 01 15:00:00 UTC 1970");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed script: Thu Jan 01 15:00:00 UTC 1970 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00249");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.LocalDate localDate5 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate6 = property3.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType7 = null;
        // The following exception was thrown during execution in test generation
        try {
            int int8 = localDate6.get(dateTimeFieldType7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: The DateTimeFieldType must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970" + "'", str4, "1970");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(localDate6);
    }

    @Test
    public void test00250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00250");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        int int13 = dateTime12.getCenturyOfEra();
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology16);
        mutablePeriod17.setPeriod((long) (short) 10, (long) (short) -1);
        int int22 = mutablePeriod17.getValue(0);
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(chronology23);
        org.joda.time.DateMidnight dateMidnight26 = dateMidnight24.minusDays((int) (short) -1);
        org.joda.time.Duration duration27 = mutablePeriod17.toDurationTo((org.joda.time.ReadableInstant) dateMidnight24);
        org.joda.time.Chronology chronology30 = null;
        org.joda.time.DateMidnight dateMidnight31 = new org.joda.time.DateMidnight(chronology30);
        org.joda.time.DateMidnight dateMidnight33 = dateMidnight31.minusDays((int) (short) -1);
        int int34 = dateMidnight33.getYearOfEra();
        org.joda.time.Chronology chronology35 = dateMidnight33.getChronology();
        org.joda.time.MutablePeriod mutablePeriod36 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology35);
        org.joda.time.DateTimeField dateTimeField37 = chronology35.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField38 = chronology35.halfdayOfDay();
        org.joda.time.LocalDate localDate39 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight24, chronology35);
        org.joda.time.DateTime dateTime40 = dateTime12.withChronology(chronology35);
        org.joda.time.Duration duration42 = org.joda.time.Duration.standardHours(10L);
        long long43 = duration42.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight44.withMillis((long) 24);
        long long47 = dateMidnight46.getMillis();
        org.joda.time.Period period48 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration42, (org.joda.time.ReadableInstant) dateMidnight46);
        int int49 = dateMidnight46.getSecondOfDay();
        int int50 = dateTime40.compareTo((org.joda.time.ReadableInstant) dateMidnight46);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight52 = dateMidnight46.withCenturyOfEra((-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for centuryOfEra must be in the range [0,2922789]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 19 + "'", int13 == 19);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 0 + "'", int22 == 0);
        org.junit.Assert.assertNotNull(dateMidnight26);
        org.junit.Assert.assertNotNull(duration27);
        org.junit.Assert.assertNotNull(dateMidnight33);
        org.junit.Assert.assertTrue("'" + int34 + "' != '" + 2022 + "'", int34 == 2022);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertNotNull(dateTimeField37);
        org.junit.Assert.assertNotNull(dateTimeField38);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(duration42);
        org.junit.Assert.assertTrue("'" + long43 + "' != '" + 36000L + "'", long43 == 36000L);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertTrue("'" + long47 + "' != '" + 0L + "'", long47 == 0L);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertTrue("'" + int50 + "' != '" + (-1) + "'", int50 == (-1));
    }

    @Test
    public void test00251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00251");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.plusSeconds((int) '4');
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay8 = timeOfDay5.withFieldAdded(durationFieldType6, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyears' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(durationFieldType6);
    }

    @Test
    public void test00252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00252");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(1970, 31, (int) ' ');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 31 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00253");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval9 = new org.joda.time.Interval((java.lang.Object) 6);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
    }

    @Test
    public void test00254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00254");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        int int17 = localDateTime13.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minusHours(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime13.withEra(12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 12 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00255");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.MutableDateTime mutableDateTime40 = property38.add((long) (short) 0);
        org.joda.time.DateTime dateTime41 = mutableDateTime40.toDateTimeISO();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime40.setDateTime((int) (byte) 100, (int) 'u', 32769, 14, 1970, 3, 6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(dateTime41);
    }

    @Test
    public void test00256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00256");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("1970-01-01", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00257");
        int int0 = java.util.Calendar.AUGUST;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 7 + "'", int0 == 7);
    }

    @Test
    public void test00258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00258");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        int int9 = mutablePeriod8.getDays();
        mutablePeriod8.setValue(0, 10);
        mutablePeriod8.setMonths(11);
        // The following exception was thrown during execution in test generation
        try {
            int int16 = mutablePeriod8.getValue(32772);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32772");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 0 + "'", int9 == 0);
    }

    @Test
    public void test00259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00259");
        java.lang.String[] strArray1 = java.util.TimeZone.getAvailableIDs(2);
        org.junit.Assert.assertNotNull(strArray1);
    }

    @Test
    public void test00260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00260");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(19, (int) (short) 100, 8, (int) (byte) 10, (int) (short) 10, 1970, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 1970 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00261");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) '#');
        int int13 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) '4');
        org.joda.time.DateTimeField dateTimeField17 = localDate12.getField((int) (byte) 0);
        org.joda.time.LocalDate localDate19 = localDate12.plusYears(8);
        org.joda.time.LocalDate localDate21 = localDate12.withYearOfCentury(0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology25);
        mutablePeriod26.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod26.add(0L);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        mutablePeriod26.add(0L, chronology40);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (-1), chronology40);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(chronology47);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.minusDays((int) (short) -1);
        int int51 = dateMidnight50.getYearOfEra();
        org.joda.time.Chronology chronology52 = dateMidnight50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (short) 10, chronology52);
        org.joda.time.MutableDateTime mutableDateTime55 = dateMidnight43.toMutableDateTime(chronology52);
        mutableDateTime55.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime55.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime55.toMutableDateTime(dateTimeZone59);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology63);
        mutablePeriod64.setPeriod((long) (short) 10, (long) (short) -1);
        int int68 = mutablePeriod64.getMonths();
        mutablePeriod64.addMinutes((int) (short) 0);
        mutableDateTime55.add((org.joda.time.ReadablePeriod) mutablePeriod64, 12);
        org.joda.time.LocalDate localDate73 = localDate12.minus((org.joda.time.ReadablePeriod) mutablePeriod64);
        // The following exception was thrown during execution in test generation
        try {
            int int75 = localDate12.getValue(50);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 50");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2022 + "'", int39 == 2022);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2022 + "'", int51 == 2022);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(localDate73);
    }

    @Test
    public void test00262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00262");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant(4320000000L);
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder8 = builder2.setTimeOfDay((int) 'u', 10, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00263");
        org.joda.time.Chronology chronology11 = null;
        org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(chronology11);
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.minusDays((int) (short) -1);
        int int15 = dateMidnight14.getYearOfEra();
        org.joda.time.Chronology chronology16 = dateMidnight14.getChronology();
        org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology16);
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime((long) (short) 10, chronology16);
        org.joda.time.DateTime dateTime20 = dateTime18.minusHours(7);
        org.joda.time.DateTime dateTime22 = dateTime20.plusYears((int) (byte) 0);
        int int23 = dateTime22.getMonthOfYear();
        org.joda.time.Chronology chronology27 = null;
        org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology27);
        mutablePeriod28.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod28.add(0L);
        org.joda.time.Chronology chronology37 = null;
        org.joda.time.DateMidnight dateMidnight38 = new org.joda.time.DateMidnight(chronology37);
        org.joda.time.DateMidnight dateMidnight40 = dateMidnight38.minusDays((int) (short) -1);
        int int41 = dateMidnight40.getYearOfEra();
        org.joda.time.Chronology chronology42 = dateMidnight40.getChronology();
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology42);
        mutablePeriod28.add(0L, chronology42);
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight((long) (-1), chronology42);
        org.joda.time.Chronology chronology49 = null;
        org.joda.time.DateMidnight dateMidnight50 = new org.joda.time.DateMidnight(chronology49);
        org.joda.time.DateMidnight dateMidnight52 = dateMidnight50.minusDays((int) (short) -1);
        int int53 = dateMidnight52.getYearOfEra();
        org.joda.time.Chronology chronology54 = dateMidnight52.getChronology();
        org.joda.time.MutablePeriod mutablePeriod55 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology54);
        org.joda.time.DateTime dateTime56 = new org.joda.time.DateTime((long) (short) 10, chronology54);
        org.joda.time.MutableDateTime mutableDateTime57 = dateMidnight45.toMutableDateTime(chronology54);
        mutableDateTime57.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property60 = mutableDateTime57.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone61 = null;
        org.joda.time.MutableDateTime mutableDateTime62 = mutableDateTime57.toMutableDateTime(dateTimeZone61);
        org.joda.time.YearMonthDay yearMonthDay63 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray64 = yearMonthDay63.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone65 = null;
        org.joda.time.DateTime dateTime66 = yearMonthDay63.toDateTimeAtCurrentTime(dateTimeZone65);
        org.joda.time.Duration duration67 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime57, (org.joda.time.ReadableInstant) dateTime66);
        org.joda.time.PeriodType periodType70 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType71 = periodType70.withWeeksRemoved();
        org.joda.time.Period period72 = new org.joda.time.Period((long) 1970, (long) 3, periodType70);
        org.joda.time.Period period73 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime22, (org.joda.time.ReadableDuration) duration67, periodType70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod74 = new org.joda.time.MutablePeriod((int) ' ', 8, 667, 31, (int) (byte) 10, 31, 4, 11, periodType70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'years'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 2022 + "'", int15 == 2022);
        org.junit.Assert.assertNotNull(chronology16);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 12 + "'", int23 == 12);
        org.junit.Assert.assertNotNull(dateMidnight40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + 2022 + "'", int41 == 2022);
        org.junit.Assert.assertNotNull(chronology42);
        org.junit.Assert.assertNotNull(dateMidnight52);
        org.junit.Assert.assertTrue("'" + int53 + "' != '" + 2022 + "'", int53 == 2022);
        org.junit.Assert.assertNotNull(chronology54);
        org.junit.Assert.assertNotNull(mutableDateTime57);
        org.junit.Assert.assertNotNull(property60);
        org.junit.Assert.assertNotNull(mutableDateTime62);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray64);
        org.junit.Assert.assertNotNull(dateTime66);
        org.junit.Assert.assertNotNull(periodType70);
        org.junit.Assert.assertNotNull(periodType71);
    }

    @Test
    public void test00264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00264");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight2 = dateMidnight0.withMillis((long) 24);
        org.joda.time.DateMidnight dateMidnight4 = dateMidnight2.withMillis((long) 11);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str6 = dateMidnight4.toString("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: N");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight2);
        org.junit.Assert.assertNotNull(dateMidnight4);
    }

    @Test
    public void test00265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00265");
        int int0 = java.util.Calendar.DAY_OF_YEAR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00266");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withChronologyRetainFields(chronology2);
        org.joda.time.DateTime dateTime4 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay0.plusMonths(0);
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay0.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay8 = property7.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay10 = property7.addWrapFieldToCopy((int) (byte) -1);
        java.util.Locale locale11 = java.util.Locale.UK;
        int int12 = property7.getMaximumShortTextLength(locale11);
        java.util.Locale locale17 = new java.util.Locale("ISOChronology[Etc/UTC]", "24", "Days");
        org.joda.time.YearMonthDay yearMonthDay18 = property7.setCopy("22", locale17);
        org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval21 = yearMonthDay20.toInterval();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay20.withChronologyRetainFields(chronology22);
        org.joda.time.DateTime dateTime24 = yearMonthDay20.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay26 = yearMonthDay20.plusMonths(0);
        org.joda.time.YearMonthDay.Property property27 = yearMonthDay20.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay28 = property27.withMaximumValue();
        org.joda.time.YearMonthDay yearMonthDay30 = property27.addWrapFieldToCopy((int) (byte) -1);
        java.util.Locale locale31 = java.util.Locale.UK;
        int int32 = property27.getMaximumShortTextLength(locale31);
        java.util.Locale locale37 = new java.util.Locale("ISOChronology[Etc/UTC]", "24", "Days");
        org.joda.time.YearMonthDay yearMonthDay38 = property27.setCopy("22", locale37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay39 = property7.setCopy("15:02:00.475", locale37);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"15:02:00.475\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(locale11);
        org.junit.Assert.assertEquals(locale11.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2 + "'", int12 == 2);
        org.junit.Assert.assertEquals(locale17.toString(), "isochronology[etc/utc]_24_Days");
        org.junit.Assert.assertNotNull(yearMonthDay18);
        org.junit.Assert.assertNotNull(interval21);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(yearMonthDay26);
        org.junit.Assert.assertNotNull(property27);
        org.junit.Assert.assertNotNull(yearMonthDay28);
        org.junit.Assert.assertNotNull(yearMonthDay30);
        org.junit.Assert.assertNotNull(locale31);
        org.junit.Assert.assertEquals(locale31.toString(), "en_GB");
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2 + "'", int32 == 2);
        org.junit.Assert.assertEquals(locale37.toString(), "isochronology[etc/utc]_24_Days");
        org.junit.Assert.assertNotNull(yearMonthDay38);
    }

    @Test
    public void test00267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00267");
        java.lang.String[] strArray0 = java.util.Locale.getISOCountries();
        org.junit.Assert.assertNotNull(strArray0);
    }

    @Test
    public void test00268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00268");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        int int17 = localDateTime13.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minusHours(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withDayOfWeek(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00269");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology2);
        org.joda.time.DurationFieldType durationFieldType4 = org.joda.time.DurationFieldType.centuries();
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod3.set(durationFieldType4, 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'centuries'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType4);
    }

    @Test
    public void test00270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00270");
        org.joda.time.Period period8 = new org.joda.time.Period((int) (short) 100, (int) (short) 10, (int) (byte) 1, (int) (short) 1, (int) (byte) 1, (int) (byte) 100, (int) (short) 0, (int) (byte) 0);
        int int9 = period8.getHours();
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 1 + "'", int9 == 1);
    }

    @Test
    public void test00271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00271");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        int int17 = dateTimeField9.getMinimumValue((long) 1);
        long long19 = dateTimeField9.roundHalfFloor((long) 52);
        long long21 = dateTimeField9.roundCeiling((long) 22);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        // The following exception was thrown during execution in test generation
        try {
            long long25 = dateTimeField9.set(3600000L, "KR", locale24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"KR\" for clockhourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 3600000L + "'", long21 == 3600000L);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
    }

    @Test
    public void test00272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00272");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight21.withDayOfYear(53);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight37 = dateMidnight21.withYearOfCentury((-2));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateMidnight35);
    }

    @Test
    public void test00273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00273");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.millisOfDay();
        org.joda.time.DateTime dateTime21 = dateTime10.withChronology(chronology18);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime23 = dateTime10.withYearOfCentury((-2));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTime21);
    }

    @Test
    public void test00274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00274");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        org.joda.time.LocalDate localDate5 = property3.addWrapFieldToCopy((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate7 = property3.setCopy("yearOfEra");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"yearOfEra\" for weekyear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate5);
    }

    @Test
    public void test00275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00275");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        int int17 = localDateTime13.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime.Property property18 = localDateTime13.millisOfDay();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime13.plusSeconds(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime13.withYearOfCentury((-2));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00276");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = timeOfDay2.getFields();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) 10, chronology5);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = timeOfDay6.getFields();
        org.joda.time.Period period8 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay2, (org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 10, chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusSeconds((int) '4');
        int int15 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay2.withMillisOfSecond(1);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay2.secondOfMinute();
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
        java.util.Locale locale20 = java.util.Locale.FRANCE;
        java.lang.String str21 = property18.getAsText(locale20);
        org.joda.time.TimeOfDay timeOfDay23 = property18.addWrapFieldToCopy((int) (byte) 100);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeField dateTimeField25 = timeOfDay23.getField(24);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 24");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "fr_FR");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "0" + "'", str21, "0");
        org.junit.Assert.assertNotNull(timeOfDay23);
    }

    @Test
    public void test00277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00277");
        int int0 = java.util.Calendar.UNDECIMBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00278");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime33.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime33.toMutableDateTime(dateTimeZone37);
        org.joda.time.MutableDateTime.Property property39 = mutableDateTime38.centuryOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval40 = new org.joda.time.Interval((java.lang.Object) mutableDateTime38);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.MutableDateTime");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(property39);
    }

    @Test
    public void test00279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00279");
        int int0 = java.util.Calendar.OCTOBER;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 9 + "'", int0 == 9);
    }

    @Test
    public void test00280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00280");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.LocalTime localTime15 = property14.withMaximumValue();
        org.joda.time.LocalTime localTime16 = property14.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime18 = property14.addCopy((int) (byte) -1);
        java.util.Locale locale20 = java.util.Locale.TAIWAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime21 = property14.setCopy("PT0S", locale20);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"PT0S\" for millisOfSecond is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_TW");
    }

    @Test
    public void test00281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00281");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property4 = localDateTime1.yearOfEra();
        org.joda.time.LocalDateTime localDateTime5 = property4.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime6 = property4.roundHalfFloorCopy();
        org.joda.time.LocalDateTime localDateTime7 = property4.roundHalfCeilingCopy();
        java.util.Locale locale9 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet10 = locale9.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale9);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime12 = property4.setCopy("Thu Dec 01 00:00:00 UTC 1898", locale9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Thu Dec 01 00:00:00 UTC 1898\" for yearOfEra is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(property4);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet10);
    }

    @Test
    public void test00282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00282");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        long long2 = duration1.getStandardSeconds();
        org.joda.time.Duration duration5 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.Duration duration6 = duration1.plus((org.joda.time.ReadableDuration) duration5);
        org.joda.time.Duration duration7 = duration5.toDuration();
        org.joda.time.Duration duration9 = duration5.plus(0L);
        org.joda.time.Duration duration11 = duration5.plus((-2240611200000L));
        org.joda.time.PeriodType periodType13 = org.joda.time.PeriodType.days();
        org.joda.time.Period period14 = new org.joda.time.Period(1645488000000L, periodType13);
        org.joda.time.DurationFieldType durationFieldType15 = org.joda.time.DurationFieldType.seconds();
        boolean boolean16 = periodType13.isSupported(durationFieldType15);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        int int24 = dateMidnight23.getYearOfEra();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology25);
        org.joda.time.DateTime dateTime27 = new org.joda.time.DateTime((long) (short) 10, chronology25);
        org.joda.time.DateTime dateTime29 = dateTime27.minusMonths(10);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        int int37 = dateMidnight36.getYearOfEra();
        org.joda.time.Chronology chronology38 = dateMidnight36.getChronology();
        org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology38);
        org.joda.time.DateTime dateTime40 = new org.joda.time.DateTime((long) (short) 10, chronology38);
        org.joda.time.DateTime dateTime41 = dateTime29.toDateTime(chronology38);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.MutablePeriod mutablePeriod52 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology51);
        mutablePeriod52.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod52.add(0L);
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.DateMidnight dateMidnight62 = new org.joda.time.DateMidnight(chronology61);
        org.joda.time.DateMidnight dateMidnight64 = dateMidnight62.minusDays((int) (short) -1);
        int int65 = dateMidnight64.getYearOfEra();
        org.joda.time.Chronology chronology66 = dateMidnight64.getChronology();
        org.joda.time.MutablePeriod mutablePeriod67 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology66);
        mutablePeriod52.add(0L, chronology66);
        org.joda.time.Period period69 = new org.joda.time.Period((long) 0, (long) 6, chronology66);
        org.joda.time.DateTime dateTime70 = new org.joda.time.DateTime(2, 12, (int) (short) 10, 3, (int) (byte) 1, chronology66);
        org.joda.time.DateTime dateTime71 = dateTime29.withChronology(chronology66);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod72 = new org.joda.time.MutablePeriod((java.lang.Object) (-2240611200000L), periodType13, chronology66);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Long");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertTrue("'" + long2 + "' != '" + 36000L + "'", long2 == 36000L);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(duration11);
        org.junit.Assert.assertNotNull(periodType13);
        org.junit.Assert.assertNotNull(durationFieldType15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + false + "'", boolean16 == false);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 2022 + "'", int37 == 2022);
        org.junit.Assert.assertNotNull(chronology38);
        org.junit.Assert.assertNotNull(dateTime41);
        org.junit.Assert.assertNotNull(dateMidnight64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 2022 + "'", int65 == 2022);
        org.junit.Assert.assertNotNull(chronology66);
        org.junit.Assert.assertNotNull(dateTime71);
    }

    @Test
    public void test00283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00283");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "24", "Japan", "Thu Jan 01 15:00:00 UTC 1970", "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z", "DateTimeField[clockhourOfDay]", "-00:00:00.001", "Thu Dec 01 00:00:00 UTC 1898", "2022-02-21T00:00:00.000Z/2022-02-21T00:00:00.000Z", "ja", "hourOfHalfday", "Sat Dec 31 00:00:00 UTC 1898", "hi!", "1970-01-01", "hourOfHalfday", "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z", "-00:00:00.001" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        boolean boolean20 = strSet18.isEmpty();
        boolean boolean21 = strSet18.isEmpty();
        java.util.Iterator<java.lang.String> strItor22 = strSet18.iterator();
        int int23 = strSet18.size();
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Calendar calendar25 = java.util.Calendar.getInstance(locale24);
        calendar25.setFirstDayOfWeek(24);
        int int29 = calendar25.getActualMinimum(10);
        java.util.Locale locale30 = java.util.Locale.GERMAN;
        java.util.Calendar calendar31 = java.util.Calendar.getInstance(locale30);
        calendar31.setFirstDayOfWeek(24);
        int int35 = calendar31.getActualMinimum(10);
        java.util.Locale locale36 = java.util.Locale.GERMAN;
        java.util.Calendar calendar37 = java.util.Calendar.getInstance(locale36);
        calendar37.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar37.setFirstDayOfWeek(11);
        java.util.Locale locale42 = java.util.Locale.GERMAN;
        java.util.Calendar calendar43 = java.util.Calendar.getInstance(locale42);
        calendar43.setFirstDayOfWeek(24);
        calendar43.setTimeInMillis((-1L));
        java.util.Locale locale48 = java.util.Locale.GERMAN;
        java.util.Calendar calendar49 = java.util.Calendar.getInstance(locale48);
        java.util.Locale locale50 = java.util.Locale.GERMAN;
        java.util.Calendar calendar51 = java.util.Calendar.getInstance(locale50);
        boolean boolean52 = calendar51.isWeekDateSupported();
        calendar51.roll(0, true);
        calendar51.roll((int) (short) 0, true);
        int int59 = calendar51.getFirstDayOfWeek();
        java.util.Calendar[] calendarArray60 = new java.util.Calendar[] { calendar25, calendar31, calendar37, calendar43, calendar49, calendar51 };
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar[] calendarArray61 = strSet18.toArray(calendarArray60);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayStoreException; message: java.lang.String");
        } catch (java.lang.ArrayStoreException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + false + "'", boolean21 == false);
        org.junit.Assert.assertNotNull(strItor22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 13 + "'", int23 == 13);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertNotNull(calendar25);
// flaky:         org.junit.Assert.assertEquals(calendar25.toString(), "java.util.GregorianCalendar[time=1645455731739,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=24,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=11,MILLISECOND=739,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 0 + "'", int29 == 0);
        org.junit.Assert.assertNotNull(locale30);
        org.junit.Assert.assertEquals(locale30.toString(), "de");
        org.junit.Assert.assertNotNull(calendar31);
// flaky:         org.junit.Assert.assertEquals(calendar31.toString(), "java.util.GregorianCalendar[time=1645455731740,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=24,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=11,MILLISECOND=740,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 0 + "'", int35 == 0);
        org.junit.Assert.assertNotNull(locale36);
        org.junit.Assert.assertEquals(locale36.toString(), "de");
        org.junit.Assert.assertNotNull(calendar37);
// flaky:         org.junit.Assert.assertEquals(calendar37.toString(), "java.util.GregorianCalendar[time=1645455731740,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=11,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=11,MILLISECOND=740,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale42);
        org.junit.Assert.assertEquals(locale42.toString(), "de");
        org.junit.Assert.assertNotNull(calendar43);
// flaky:         org.junit.Assert.assertEquals(calendar43.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=24,minimalDaysInFirstWeek=4,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale48);
        org.junit.Assert.assertEquals(locale48.toString(), "de");
        org.junit.Assert.assertNotNull(calendar49);
// flaky:         org.junit.Assert.assertEquals(calendar49.toString(), "java.util.GregorianCalendar[time=1645455731740,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=11,MILLISECOND=740,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(locale50);
        org.junit.Assert.assertEquals(locale50.toString(), "de");
        org.junit.Assert.assertNotNull(calendar51);
// flaky:         org.junit.Assert.assertEquals(calendar51.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=11,MILLISECOND=740,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean52 + "' != '" + true + "'", boolean52 == true);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2 + "'", int59 == 2);
        org.junit.Assert.assertNotNull(calendarArray60);
    }

    @Test
    public void test00284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00284");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("15:02:00.475", (double) 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=59.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00285");
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(22, 59, 667, 100, (int) 'u', 11, 363, 19);
    }

    @Test
    public void test00286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00286");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        java.util.Locale.setDefault(locale0);
        java.util.Calendar calendar3 = java.util.Calendar.getInstance(locale0);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology11);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        int int21 = dateMidnight20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateMidnight20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.millisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime14.withChronology(chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay26 = new org.joda.time.YearMonthDay((java.lang.Object) locale0, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Locale");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(calendar3);
// flaky:         org.junit.Assert.assertEquals(calendar3.toString(), "java.util.GregorianCalendar[time=1645455731919,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=11,MILLISECOND=919,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTime25);
    }

    @Test
    public void test00287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00287");
        java.util.Date date1 = new java.util.Date((long) 1);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromDateFields(date1);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay2.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay4 = property3.getYearMonthDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        int int11 = dateMidnight10.getYearOfEra();
        org.joda.time.Chronology chronology12 = dateMidnight10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology12.getZone();
        org.joda.time.DateTime dateTime16 = yearMonthDay4.toDateTimeAtCurrentTime(dateTimeZone15);
        org.joda.time.DateTime dateTime18 = dateTime16.minusHours(8);
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertNotNull(dateTime18);
    }

    @Test
    public void test00288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00288");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = yearMonthDay0.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.DateTime dateTime5 = dateTime3.withChronology(chronology4);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertNotNull(dateTime5);
    }

    @Test
    public void test00289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00289");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withChronologyRetainFields(chronology2);
        org.joda.time.DateTime dateTime4 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay0.plusMonths(0);
        org.joda.time.YearMonthDay.Property property7 = yearMonthDay0.dayOfMonth();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay9 = property7.setCopy("0");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(property7);
    }

    @Test
    public void test00290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00290");
        java.util.Date date1 = new java.util.Date((long) 1);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromDateFields(date1);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay2.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay5 = property3.addWrapFieldToCopy(10);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology13);
        org.joda.time.DateTimeField dateTimeField15 = chronology13.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMillis(0);
        int[] intArray20 = new int[] {};
        int int21 = dateTimeField15.getMaximumValue((org.joda.time.ReadablePartial) localDateTime19, intArray20);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = org.joda.time.DateTimeFieldType.year();
        int int23 = localDateTime19.get(dateTimeFieldType22);
        org.joda.time.LocalDateTime localDateTime25 = localDateTime19.plusWeeks(52);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = yearMonthDay5.compareTo((org.joda.time.ReadablePartial) localDateTime25);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
// flaky:         org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(intArray20);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray20), "[]");
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 24 + "'", int21 == 24);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(localDateTime25);
    }

    @Test
    public void test00291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00291");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        java.util.TimeZone timeZone12 = null;
        calendar11.setTimeZone(timeZone12);
        // The following exception was thrown during execution in test generation
        try {
            calendar11.setMinimalDaysInFirstWeek(11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=false,areAllFieldsSet=false,lenient=true,zone=null,firstDayOfWeek=1,minimalDaysInFirstWeek=11,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00292");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        timeZone14.setID("PT0S");
        java.util.TimeZone.setDefault(timeZone14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        long long24 = dateMidnight21.getMillis();
        java.util.Locale locale28 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar29 = dateMidnight21.toCalendar(locale28);
        int int31 = calendar29.getLeastMaximum(3);
        java.util.TimeZone timeZone32 = calendar29.getTimeZone();
        timeZone32.setID("PT0S");
        java.lang.String str35 = timeZone32.getID();
        boolean boolean36 = timeZone14.hasSameRules(timeZone32);
        // The following exception was thrown during execution in test generation
        try {
            int int43 = timeZone14.getOffset(31, (-23641), 50, (int) (byte) 10, 0, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1645488000000L + "'", long24 == 1645488000000L);
        org.junit.Assert.assertEquals(locale28.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar29);
        org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 50 + "'", int31 == 50);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT0S" + "'", str35, "PT0S");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test00293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00293");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime33.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime33.toMutableDateTime(dateTimeZone37);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setSecondOfMinute(363);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 363 for secondOfMinute must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
    }

    @Test
    public void test00294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00294");
        int int0 = java.util.Calendar.ALL_STYLES;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00295");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        timeZone14.setID("PT0S");
        java.util.TimeZone.setDefault(timeZone14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        long long24 = dateMidnight21.getMillis();
        java.util.Locale locale28 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar29 = dateMidnight21.toCalendar(locale28);
        int int31 = calendar29.getLeastMaximum(3);
        java.util.TimeZone timeZone32 = calendar29.getTimeZone();
        timeZone32.setID("PT0S");
        java.lang.String str35 = timeZone32.getID();
        boolean boolean36 = timeZone14.hasSameRules(timeZone32);
        java.lang.Object obj37 = timeZone32.clone();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1645488000000L + "'", long24 == 1645488000000L);
        org.junit.Assert.assertEquals(locale28.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar29);
        org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 50 + "'", int31 == 50);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT0S" + "'", str35, "PT0S");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertNotNull(obj37);
        org.junit.Assert.assertEquals(obj37.toString(), "java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.lang.String.valueOf(obj37), "java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
        org.junit.Assert.assertEquals(java.util.Objects.toString(obj37), "java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00296");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = yearMonthDay0.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        int int12 = mutablePeriod7.getValue(0);
        mutablePeriod7.addMinutes(0);
        mutablePeriod7.setMonths((int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay0.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod7.setValue((-292275054), 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -292275054");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay17);
    }

    @Test
    public void test00297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00297");
        java.util.Locale locale0 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet1 = locale0.getUnicodeLocaleKeys();
        strSet1.clear();
        org.joda.time.PeriodType periodType3 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType4 = periodType3.withWeeksRemoved();
        java.lang.String str5 = periodType3.getName();
        boolean boolean6 = strSet1.contains((java.lang.Object) periodType3);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((java.lang.Object) strSet1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.Collections$EmptySet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet1);
        org.junit.Assert.assertNotNull(periodType3);
        org.junit.Assert.assertNotNull(periodType4);
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "Days" + "'", str5, "Days");
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
    }

    @Test
    public void test00298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00298");
        org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime((long) 22, dateTimeZone5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight((-2), 32769, 1970, dateTimeZone5);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32769 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone5);
    }

    @Test
    public void test00299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00299");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(10);
        org.joda.time.Duration duration7 = org.joda.time.Duration.standardHours(10L);
        long long8 = duration7.getStandardSeconds();
        org.joda.time.LocalDateTime localDateTime10 = localDateTime3.withDurationAdded((org.joda.time.ReadableDuration) duration7, (int) (short) 10);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone12);
        org.joda.time.DateMidnight dateMidnight14 = org.joda.time.DateMidnight.now(dateTimeZone12);
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object) localDateTime3, dateTimeZone12);
        java.util.Locale locale17 = java.util.Locale.KOREA;
        java.lang.String str18 = locale17.getCountry();
        java.util.Locale locale19 = java.util.Locale.JAPAN;
        java.lang.String str20 = locale17.getDisplayVariant(locale19);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str21 = localDateTime3.toString("PT0.011S", locale19);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: P");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(duration7);
        org.junit.Assert.assertTrue("'" + long8 + "' != '" + 36000L + "'", long8 == 36000L);
        org.junit.Assert.assertNotNull(localDateTime10);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(locale17);
        org.junit.Assert.assertEquals(locale17.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str18 + "' != '" + "KR" + "'", str18, "KR");
        org.junit.Assert.assertNotNull(locale19);
        org.junit.Assert.assertEquals(locale19.toString(), "ja_JP");
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "" + "'", str20, "");
    }

    @Test
    public void test00300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00300");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime2 = org.joda.time.LocalDateTime.parse("22", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00301");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        org.joda.time.Duration duration36 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime33.add((org.joda.time.ReadableDuration) duration36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime40 = property38.set("");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"\" for hourOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test00302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00302");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology2);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) chronology2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) 10, chronology6);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = timeOfDay7.getFields();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 10, chronology10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = timeOfDay11.getFields();
        org.joda.time.Period period13 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay7, (org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean15 = timeOfDay11.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.clockhourOfDay();
        boolean boolean26 = dateTimeFieldType14.isSupported(chronology23);
        boolean boolean27 = localTime4.isSupported(dateTimeFieldType14);
        org.joda.time.LocalTime localTime29 = localTime4.plusHours(11);
        org.joda.time.LocalTime localTime31 = localTime4.withMillisOfDay(0);
        java.util.Date date35 = new java.util.Date((-1), (int) (short) 0, 0);
        int int36 = date35.getDate();
        int int37 = date35.getMonth();
        boolean boolean38 = localTime4.equals((java.lang.Object) int37);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime40 = localTime4.withHourOfDay((-2));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -2 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertEquals(date35.toString(), "Sat Dec 31 00:00:00 GMT+00:00 1898");
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 31 + "'", int36 == 31);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 11 + "'", int37 == 11);
        org.junit.Assert.assertTrue("'" + boolean38 + "' != '" + false + "'", boolean38 == false);
    }

    @Test
    public void test00303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00303");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange1 = new java.util.Locale.LanguageRange("315");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: range=315");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00304");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime33.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime33.toMutableDateTime(dateTimeZone37);
        int int39 = mutableDateTime38.getHourOfDay();
        org.joda.time.MutableDateTime.Property property40 = mutableDateTime38.minuteOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime42 = property40.set("02:02:04.911");
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"02:02:04.911\" for minuteOfDay is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
        org.junit.Assert.assertNotNull(property40);
    }

    @Test
    public void test00305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00305");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant(4320000000L);
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder7 = builder2.setWeekDefinition(16, 9);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00306");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        org.joda.time.DateTimeField dateTimeField23 = chronology21.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField24 = chronology21.halfdayOfDay();
        org.joda.time.LocalDate localDate25 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight10, chronology21);
        org.joda.time.LocalDate localDate27 = localDate25.withDayOfMonth(8);
        org.joda.time.LocalDate localDate29 = localDate27.plusMonths(7);
        org.joda.time.LocalDate.Property property30 = localDate27.monthOfYear();
        java.util.Locale locale32 = java.util.Locale.TRADITIONAL_CHINESE;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate33 = property30.setCopy("Japan", locale32);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"Japan\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateTimeField23);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(localDate27);
        org.junit.Assert.assertNotNull(localDate29);
        org.junit.Assert.assertNotNull(property30);
        org.junit.Assert.assertNotNull(locale32);
        org.junit.Assert.assertEquals(locale32.toString(), "zh_TW");
    }

    @Test
    public void test00307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00307");
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusDays((int) (short) -1);
        int int14 = dateMidnight13.getYearOfEra();
        org.joda.time.Chronology chronology15 = dateMidnight13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfDay();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology15);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.millisOfDay();
        org.joda.time.DateTime dateTime29 = dateTime18.withChronology(chronology26);
        org.joda.time.LocalTime localTime30 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) -1, chronology26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime31 = new org.joda.time.DateTime(2, 69, 4, 6, 122, 5, 122, chronology26);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 122 for minuteOfHour must be in the range [0,59]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime29);
        org.junit.Assert.assertNotNull(localTime30);
    }

    @Test
    public void test00308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00308");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.seconds();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test00309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00309");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        int int17 = localDateTime13.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minusYears(70);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime23 = localDateTime19.withDate(9, 5, (-23641));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -23641 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00310");
        org.joda.time.Period period1 = org.joda.time.Period.weeks(1970);
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00311");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime33.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime33.toMutableDateTime(dateTimeZone37);
        int int39 = mutableDateTime38.getSecondOfMinute();
        org.joda.time.Chronology chronology43 = null;
        org.joda.time.DateMidnight dateMidnight44 = new org.joda.time.DateMidnight(chronology43);
        org.joda.time.DateMidnight dateMidnight46 = dateMidnight44.minusDays((int) (short) -1);
        int int47 = dateMidnight46.getYearOfEra();
        org.joda.time.Chronology chronology48 = dateMidnight46.getChronology();
        org.joda.time.MutablePeriod mutablePeriod49 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology48);
        org.joda.time.DateTime dateTime50 = new org.joda.time.DateTime((long) (short) 10, chronology48);
        org.joda.time.DateTime dateTime52 = dateTime50.minusMonths(10);
        org.joda.time.Duration duration53 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime38, (org.joda.time.ReadableInstant) dateTime50);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime38.setTime(667, (-1), (int) (byte) 10, (-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 667 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 50 + "'", int39 == 50);
        org.junit.Assert.assertNotNull(dateMidnight46);
        org.junit.Assert.assertTrue("'" + int47 + "' != '" + 2022 + "'", int47 == 2022);
        org.junit.Assert.assertNotNull(chronology48);
        org.junit.Assert.assertNotNull(dateTime52);
    }

    @Test
    public void test00312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00312");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearWeekDayTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DurationFieldType durationFieldType2 = periodType0.getFieldType(11);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 11");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test00313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00313");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setLanguageTag("15:01:52.189");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Invalid subtag: 15:01:52.189 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00314");
        java.util.Date date3 = new java.util.Date((-1), (int) (short) 0, 0);
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.fromDateFields(date3);
        int int5 = timeOfDay4.getMinuteOfHour();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray6 = timeOfDay4.getFieldTypes();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.halfdayOfDay();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) '#');
        int int20 = dateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.LocalDate localDate22 = localDate19.withYearOfEra((int) '4');
        org.joda.time.DateTimeField dateTimeField24 = localDate19.getField((int) (byte) 0);
        org.joda.time.LocalDate localDate26 = localDate19.plusYears(8);
        // The following exception was thrown during execution in test generation
        try {
            int int27 = timeOfDay4.compareTo((org.joda.time.ReadablePartial) localDate19);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date3.toString(), "Sat Dec 31 00:00:00 GMT+00:00 1898");
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray6);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(localDate26);
    }

    @Test
    public void test00315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00315");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.weeks();
        org.junit.Assert.assertNotNull(periodType0);
    }

    @Test
    public void test00316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00316");
        int int0 = java.util.Calendar.FRIDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 6 + "'", int0 == 6);
    }

    @Test
    public void test00317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00317");
        org.joda.time.DateTimeFieldType dateTimeFieldType1 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology4);
        mutablePeriod5.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod5.add(0L);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        int int18 = dateMidnight17.getYearOfEra();
        org.joda.time.Chronology chronology19 = dateMidnight17.getChronology();
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology19);
        mutablePeriod5.add(0L, chronology19);
        boolean boolean22 = dateTimeFieldType1.isSupported(chronology19);
        org.joda.time.DurationField durationField23 = chronology19.hours();
        org.joda.time.LocalTime localTime24 = org.joda.time.LocalTime.fromMillisOfDay((-1L), chronology19);
        // The following exception was thrown during execution in test generation
        try {
            int int26 = localTime24.getValue(1970);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 1970");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType1);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 2022 + "'", int18 == 2022);
        org.junit.Assert.assertNotNull(chronology19);
        org.junit.Assert.assertTrue("'" + boolean22 + "' != '" + true + "'", boolean22 == true);
        org.junit.Assert.assertNotNull(durationField23);
        org.junit.Assert.assertNotNull(localTime24);
    }

    @Test
    public void test00318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00318");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay0.dayOfMonth();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod7.add(0L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        mutablePeriod7.add(0L, chronology21);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (-1), chronology21);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 10, chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight24.toMutableDateTime(chronology33);
        mutableDateTime36.setYear(2022);
        mutableDateTime36.setYear((-1));
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.dayOfYear();
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusDays((int) (short) -1);
        long long48 = dateMidnight45.getMillis();
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.days();
        org.joda.time.Period period50 = duration43.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight45, periodType49);
        org.joda.time.MutableDateTime mutableDateTime51 = dateMidnight45.toMutableDateTimeISO();
        int int52 = mutableDateTime51.getDayOfYear();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.minusDays((int) (short) -1);
        int int59 = dateMidnight58.getYearOfEra();
        org.joda.time.Chronology chronology60 = dateMidnight58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology60);
        mutableDateTime51.setChronology(chronology60);
        mutableDateTime36.setTime((org.joda.time.ReadableInstant) mutableDateTime51);
        mutableDateTime36.addYears((int) (byte) -1);
        int int66 = property2.compareTo((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.YearMonthDay yearMonthDay67 = property2.withMinimumValue();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay69 = property2.setCopy(50);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1645401600000L + "'", long48 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 52 + "'", int52 == 52);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2022 + "'", int59 == 2022);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay67);
    }

    @Test
    public void test00319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00319");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("zho", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00320");
        java.util.Locale locale0 = java.util.Locale.PRC;
        java.lang.String str1 = locale0.toLanguageTag();
        java.util.Set<java.lang.String> strSet2 = locale0.getUnicodeLocaleAttributes();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime(chronology11);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        int int21 = dateMidnight20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateMidnight20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.millisOfDay();
        org.joda.time.DateTime dateTime25 = dateTime14.withChronology(chronology22);
        org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromMillisOfDay((long) (short) -1, chronology22);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((java.lang.Object) strSet2, chronology22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.util.Collections$EmptySet");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "zh-CN" + "'", str1, "zh-CN");
        org.junit.Assert.assertNotNull(strSet2);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(dateTime25);
        org.junit.Assert.assertNotNull(localTime26);
    }

    @Test
    public void test00321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00321");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        org.joda.time.Chronology chronology38 = null;
        org.joda.time.DateMidnight dateMidnight39 = new org.joda.time.DateMidnight(chronology38);
        org.joda.time.DateMidnight dateMidnight41 = dateMidnight39.minusDays((int) (short) -1);
        int int42 = dateMidnight41.getYearOfEra();
        org.joda.time.Chronology chronology43 = dateMidnight41.getChronology();
        org.joda.time.MutablePeriod mutablePeriod44 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology43);
        org.joda.time.DateTimeField dateTimeField45 = chronology43.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField46 = chronology43.halfdayOfDay();
        mutableDateTime33.setRounding(dateTimeField46);
        mutableDateTime33.addSeconds((-1));
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setMonthOfYear(667);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 667 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(dateMidnight41);
        org.junit.Assert.assertTrue("'" + int42 + "' != '" + 2022 + "'", int42 == 2022);
        org.junit.Assert.assertNotNull(chronology43);
        org.junit.Assert.assertNotNull(dateTimeField45);
        org.junit.Assert.assertNotNull(dateTimeField46);
    }

    @Test
    public void test00322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00322");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.LocalTime.Property property14 = localTime13.millisOfSecond();
        org.joda.time.LocalTime localTime15 = property14.withMaximumValue();
        org.joda.time.LocalTime localTime16 = property14.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime18 = property14.addCopy((int) (byte) -1);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = localTime18.toString("DateTimeField[clockhourOfDay]");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(localTime15);
        org.junit.Assert.assertNotNull(localTime16);
        org.junit.Assert.assertNotNull(localTime18);
    }

    @Test
    public void test00323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00323");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime10 = yearMonthDay9.toDateTimeAtMidnight();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateTime10);
        java.lang.String str12 = interval11.toString();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval14 = yearMonthDay13.toInterval();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval16 = yearMonthDay15.toInterval();
        org.joda.time.Interval interval17 = interval14.gap((org.joda.time.ReadableInterval) interval16);
        boolean boolean19 = interval14.isBefore(100L);
        java.lang.String str20 = interval14.toString();
        boolean boolean21 = interval11.isBefore((org.joda.time.ReadableInterval) interval14);
        org.joda.time.DateTimeZone dateTimeZone24 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate25 = org.joda.time.LocalDate.now(dateTimeZone24);
        org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone24);
        org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long) (byte) 0, dateTimeZone24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((java.lang.Object) interval11, dateTimeZone24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.Interval");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645401600000L + "'", long6 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022-02-21T00:00:00.000Z/2022-02-21T00:00:00.000Z" + "'", str12, "2022-02-21T00:00:00.000Z/2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNull(interval17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z" + "'", str20, "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(dateTimeZone24);
        org.junit.Assert.assertNotNull(localDate25);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test00324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00324");
        int int0 = java.util.Calendar.MAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00325");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        int int2 = dateMidnight1.getMillisOfSecond();
        org.joda.time.PeriodType periodType4 = null;
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.Period period6 = new org.joda.time.Period((long) '#', periodType4, chronology5);
        org.joda.time.Period period8 = period6.withDays((int) ' ');
        org.joda.time.Interval interval9 = new org.joda.time.Interval((org.joda.time.ReadableInstant) dateMidnight1, (org.joda.time.ReadablePeriod) period8);
        org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval11 = yearMonthDay10.toInterval();
        org.joda.time.Duration duration13 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(chronology14);
        org.joda.time.DateMidnight dateMidnight17 = dateMidnight15.minusDays((int) (short) -1);
        long long18 = dateMidnight15.getMillis();
        org.joda.time.PeriodType periodType19 = org.joda.time.PeriodType.days();
        org.joda.time.Period period20 = duration13.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight15, periodType19);
        org.joda.time.YearMonthDay yearMonthDay21 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime22 = yearMonthDay21.toDateTimeAtMidnight();
        org.joda.time.Interval interval23 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period20, (org.joda.time.ReadableInstant) dateTime22);
        boolean boolean24 = interval11.abuts((org.joda.time.ReadableInterval) interval23);
        org.joda.time.Interval interval25 = interval9.overlap((org.joda.time.ReadableInterval) interval23);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology29);
        mutablePeriod30.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod30.add(0L);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(chronology39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.minusDays((int) (short) -1);
        int int43 = dateMidnight42.getYearOfEra();
        org.joda.time.Chronology chronology44 = dateMidnight42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology44);
        mutablePeriod30.add(0L, chronology44);
        org.joda.time.DateMidnight dateMidnight47 = new org.joda.time.DateMidnight((long) (-1), chronology44);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(chronology51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.minusDays((int) (short) -1);
        int int55 = dateMidnight54.getYearOfEra();
        org.joda.time.Chronology chronology56 = dateMidnight54.getChronology();
        org.joda.time.MutablePeriod mutablePeriod57 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology56);
        org.joda.time.DateTime dateTime58 = new org.joda.time.DateTime((long) (short) 10, chronology56);
        org.joda.time.MutableDateTime mutableDateTime59 = dateMidnight47.toMutableDateTime(chronology56);
        mutableDateTime59.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property62 = mutableDateTime59.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone63 = null;
        org.joda.time.MutableDateTime mutableDateTime64 = mutableDateTime59.toMutableDateTime(dateTimeZone63);
        org.joda.time.YearMonthDay yearMonthDay65 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray66 = yearMonthDay65.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone67 = null;
        org.joda.time.DateTime dateTime68 = yearMonthDay65.toDateTimeAtCurrentTime(dateTimeZone67);
        org.joda.time.Duration duration69 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime59, (org.joda.time.ReadableInstant) dateTime68);
        mutableDateTime59.setMinuteOfDay(14);
        org.joda.time.Duration duration73 = org.joda.time.Duration.standardHours(10L);
        long long74 = duration73.getStandardSeconds();
        org.joda.time.DateMidnight dateMidnight75 = new org.joda.time.DateMidnight();
        org.joda.time.DateMidnight dateMidnight77 = dateMidnight75.withMillis((long) 24);
        long long78 = dateMidnight77.getMillis();
        org.joda.time.Period period79 = new org.joda.time.Period((org.joda.time.ReadableDuration) duration73, (org.joda.time.ReadableInstant) dateMidnight77);
        org.joda.time.Period period80 = duration73.toPeriod();
        mutableDateTime59.add((org.joda.time.ReadablePeriod) period80, (int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval83 = interval25.withStart((org.joda.time.ReadableInstant) mutableDateTime59);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 0 + "'", int2 == 0);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(interval11);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 1645401600000L + "'", long18 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType19);
        org.junit.Assert.assertNotNull(period20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNull(interval25);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2022 + "'", int43 == 2022);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2022 + "'", int55 == 2022);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(mutableDateTime59);
        org.junit.Assert.assertNotNull(property62);
        org.junit.Assert.assertNotNull(mutableDateTime64);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray66);
        org.junit.Assert.assertNotNull(dateTime68);
        org.junit.Assert.assertNotNull(duration73);
        org.junit.Assert.assertTrue("'" + long74 + "' != '" + 36000L + "'", long74 == 36000L);
        org.junit.Assert.assertNotNull(dateMidnight77);
        org.junit.Assert.assertTrue("'" + long78 + "' != '" + 0L + "'", long78 == 0L);
        org.junit.Assert.assertNotNull(period80);
    }

    @Test
    public void test00326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00326");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusSeconds(2);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        long long14 = dateMidnight11.getMillis();
        org.joda.time.DateMidnight.Property property15 = dateMidnight11.weekyear();
        org.joda.time.DateMidnight dateMidnight16 = property15.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight17 = property15.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime7.withField(dateTimeFieldType18, 32769);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime22 = localDateTime7.withEra(70);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 70 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1645488000000L + "'", long14 == 1645488000000L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localDateTime20);
    }

    @Test
    public void test00327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00327");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("2022-02-21");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: 2022-02-21 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00328");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(16, 363);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 363 for minuteOfHour must not be larger than 59");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00329");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean3 = calendar1.isSet(69);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 69");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455735270,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=15,MILLISECOND=270,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00330");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTime dateTime17 = dateTime15.withDayOfMonth(2);
        int int18 = dateTime15.getMinuteOfDay();
        int int19 = dateTime15.getYearOfEra();
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
// flaky:         org.junit.Assert.assertTrue("'" + int18 + "' != '" + 902 + "'", int18 == 902);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
    }

    @Test
    public void test00331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00331");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("1970-01-01T00:00:32.769Z", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00332");
        org.joda.time.DateTimeFieldType dateTimeFieldType4 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology7);
        mutablePeriod8.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod8.add(0L);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        int int21 = dateMidnight20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateMidnight20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology22);
        mutablePeriod8.add(0L, chronology22);
        boolean boolean25 = dateTimeFieldType4.isSupported(chronology22);
        org.joda.time.DurationField durationField26 = chronology22.hours();
        org.joda.time.LocalTime localTime27 = org.joda.time.LocalTime.fromMillisOfDay((-1L), chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate28 = new org.joda.time.LocalDate((-1), (int) (short) 100, 14, chronology22);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType4);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertTrue("'" + boolean25 + "' != '" + true + "'", boolean25 == true);
        org.junit.Assert.assertNotNull(durationField26);
        org.junit.Assert.assertNotNull(localTime27);
    }

    @Test
    public void test00333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00333");
        java.util.Date date3 = new java.util.Date((-1), (int) (short) 0, 0);
        date3.setMonth((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromDateFields(date3);
        int int7 = date3.getYear();
        date3.setDate(1969);
        org.junit.Assert.assertEquals(date3.toString(), "Fri Apr 22 00:00:00 GMT+00:00 1904");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test00334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00334");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Date date1 = new java.util.Date("0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00335");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology22);
        mutablePeriod23.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod23.add(0L);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusDays((int) (short) -1);
        int int36 = dateMidnight35.getYearOfEra();
        org.joda.time.Chronology chronology37 = dateMidnight35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology37);
        mutablePeriod23.add(0L, chronology37);
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight((long) (-1), chronology37);
        org.joda.time.DateTimeField dateTimeField41 = dateTimeFieldType18.getField(chronology37);
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) 21, chronology37);
        org.joda.time.TimeOfDay timeOfDay43 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (-23641), chronology37);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(chronology47);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.minusDays((int) (short) -1);
        int int51 = dateMidnight50.getYearOfEra();
        org.joda.time.Chronology chronology52 = dateMidnight50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology52);
        org.joda.time.DateTimeField dateTimeField54 = chronology52.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone55 = null;
        org.joda.time.LocalDateTime localDateTime56 = new org.joda.time.LocalDateTime(dateTimeZone55);
        org.joda.time.LocalDateTime localDateTime58 = localDateTime56.plusMillis(0);
        int[] intArray59 = new int[] {};
        int int60 = dateTimeField54.getMaximumValue((org.joda.time.ReadablePartial) localDateTime58, intArray59);
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray62 = dateTimeField9.addWrapPartial((org.joda.time.ReadablePartial) timeOfDay43, 15, intArray59, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 15");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(dateTimeField41);
        org.junit.Assert.assertNotNull(timeOfDay43);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2022 + "'", int51 == 2022);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(dateTimeField54);
        org.junit.Assert.assertNotNull(localDateTime58);
        org.junit.Assert.assertNotNull(intArray59);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray59), "[]");
        org.junit.Assert.assertTrue("'" + int60 + "' != '" + 24 + "'", int60 == 24);
    }

    @Test
    public void test00336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00336");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray1 = yearMonthDay0.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone2 = null;
        org.joda.time.DateTime dateTime3 = yearMonthDay0.toDateTimeAtCurrentTime(dateTimeZone2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        int int12 = mutablePeriod7.getValue(0);
        mutablePeriod7.addMinutes(0);
        mutablePeriod7.setMonths((int) (byte) 10);
        org.joda.time.YearMonthDay yearMonthDay17 = yearMonthDay0.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay((long) 10, chronology19);
        org.joda.time.DateTimeField[] dateTimeFieldArray21 = timeOfDay20.getFields();
        org.joda.time.Chronology chronology23 = null;
        org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay((long) 10, chronology23);
        org.joda.time.DateTimeField[] dateTimeFieldArray25 = timeOfDay24.getFields();
        org.joda.time.Period period26 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay20, (org.joda.time.ReadablePartial) timeOfDay24);
        org.joda.time.DateTimeFieldType dateTimeFieldType27 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean28 = timeOfDay24.isSupported(dateTimeFieldType27);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay30 = yearMonthDay17.withField(dateTimeFieldType27, 52);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'hourOfHalfday' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray1);
        org.junit.Assert.assertNotNull(dateTime3);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(yearMonthDay17);
        org.junit.Assert.assertNotNull(dateTimeFieldArray21);
        org.junit.Assert.assertNotNull(dateTimeFieldArray25);
        org.junit.Assert.assertNotNull(period26);
        org.junit.Assert.assertNotNull(dateTimeFieldType27);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + false + "'", boolean28 == false);
    }

    @Test
    public void test00337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00337");
        org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType1 = periodType0.withWeeksRemoved();
        org.joda.time.PeriodType periodType2 = periodType1.withMillisRemoved();
        org.junit.Assert.assertNotNull(periodType0);
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType2);
    }

    @Test
    public void test00338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00338");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        boolean boolean2 = calendar1.isWeekDateSupported();
        calendar1.roll(0, true);
        calendar1.roll((int) (short) 0, true);
        int int9 = calendar1.getFirstDayOfWeek();
        java.util.Locale locale10 = java.util.Locale.GERMAN;
        java.util.Calendar calendar11 = java.util.Calendar.getInstance(locale10);
        calendar11.setFirstDayOfWeek(24);
        int int14 = calendar1.compareTo(calendar11);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=1,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=15,MILLISECOND=936,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2 + "'", int9 == 2);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "de");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645455735936,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=24,minimalDaysInFirstWeek=4,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=15,MILLISECOND=936,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 0 + "'", int14 == 0);
    }

    @Test
    public void test00339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00339");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.LocalDate localDate2 = new org.joda.time.LocalDate((long) 31, chronology1);
    }

    @Test
    public void test00340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00340");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology42);
        mutablePeriod43.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod43.add(0L);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutablePeriod43.add(0L, chronology57);
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (-1), chronology57);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        int int68 = dateMidnight67.getYearOfEra();
        org.joda.time.Chronology chronology69 = dateMidnight67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (short) 10, chronology69);
        org.joda.time.MutableDateTime mutableDateTime72 = dateMidnight60.toMutableDateTime(chronology69);
        mutableDateTime72.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime72.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.MutableDateTime mutableDateTime77 = mutableDateTime72.toMutableDateTime(dateTimeZone76);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology80);
        mutablePeriod81.setPeriod((long) (short) 10, (long) (short) -1);
        int int85 = mutablePeriod81.getMonths();
        mutablePeriod81.addMinutes((int) (short) 0);
        mutableDateTime72.add((org.joda.time.ReadablePeriod) mutablePeriod81, 12);
        mutableDateTime33.setDate((org.joda.time.ReadableInstant) mutableDateTime72);
        org.joda.time.ReadablePeriod readablePeriod91 = null;
        mutableDateTime72.add(readablePeriod91);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2022 + "'", int56 == 2022);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateMidnight67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2022 + "'", int68 == 2022);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(mutableDateTime77);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test00341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00341");
        java.util.Locale locale3 = new java.util.Locale("ISOChronology[Etc/UTC]", "24", "Days");
        java.util.Set<java.lang.String> strSet4 = locale3.getUnicodeLocaleAttributes();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str5 = locale3.getISO3Language();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter language code for isochronology[etc/utc]");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "isochronology[etc/utc]_24_Days");
        org.junit.Assert.assertNotNull(strSet4);
    }

    @Test
    public void test00342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00342");
        int int0 = java.util.Calendar.WEDNESDAY;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00343");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        timeZone14.setID("PT0S");
        java.util.TimeZone.setDefault(timeZone14);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str20 = timeZone14.getDisplayName(false, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00344");
        int int0 = java.util.Calendar.ERA;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00345");
        int int0 = java.util.Calendar.HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 10 + "'", int0 == 10);
    }

    @Test
    public void test00346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00346");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        int int36 = mutableDateTime33.getYearOfEra();
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(chronology39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.minusDays((int) (short) -1);
        int int43 = dateMidnight42.getYearOfEra();
        org.joda.time.Chronology chronology44 = dateMidnight42.getChronology();
        org.joda.time.MutablePeriod mutablePeriod45 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology44);
        org.joda.time.DateTimeField dateTimeField46 = chronology44.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone47 = null;
        org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime(dateTimeZone47);
        org.joda.time.LocalDateTime localDateTime50 = localDateTime48.plusMillis(0);
        int[] intArray51 = new int[] {};
        int int52 = dateTimeField46.getMaximumValue((org.joda.time.ReadablePartial) localDateTime50, intArray51);
        org.joda.time.DateTimeFieldType dateTimeFieldType53 = org.joda.time.DateTimeFieldType.year();
        int int54 = localDateTime50.get(dateTimeFieldType53);
        int int55 = mutableDateTime33.get(dateTimeFieldType53);
        org.joda.time.Chronology chronology56 = null;
        org.joda.time.DateMidnight dateMidnight57 = new org.joda.time.DateMidnight(chronology56);
        org.joda.time.DateMidnight dateMidnight59 = dateMidnight57.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone60 = null;
        org.joda.time.DateMidnight dateMidnight61 = dateMidnight59.withZoneRetainFields(dateTimeZone60);
        org.joda.time.Chronology chronology62 = null;
        org.joda.time.DateMidnight dateMidnight63 = new org.joda.time.DateMidnight(chronology62);
        org.joda.time.DateMidnight dateMidnight65 = dateMidnight63.minusDays((int) (short) -1);
        int int66 = dateMidnight65.getYearOfEra();
        org.joda.time.Chronology chronology67 = dateMidnight65.getChronology();
        long long68 = dateMidnight65.getMillis();
        org.joda.time.ReadableDuration readableDuration69 = null;
        org.joda.time.ReadableInstant readableInstant70 = null;
        org.joda.time.Period period71 = new org.joda.time.Period(readableDuration69, readableInstant70);
        org.joda.time.PeriodType periodType72 = period71.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod73 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight61, (org.joda.time.ReadableInstant) dateMidnight65, periodType72);
        mutableDateTime33.add((org.joda.time.ReadablePeriod) mutablePeriod73, 6);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod73.setValue(19, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 19");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2022 + "'", int43 == 2022);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertNotNull(dateTimeField46);
        org.junit.Assert.assertNotNull(localDateTime50);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[]");
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 24 + "'", int52 == 24);
        org.junit.Assert.assertNotNull(dateTimeFieldType53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2022 + "'", int54 == 2022);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2022 + "'", int55 == 2022);
        org.junit.Assert.assertNotNull(dateMidnight59);
        org.junit.Assert.assertNotNull(dateMidnight61);
        org.junit.Assert.assertNotNull(dateMidnight65);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + 2022 + "'", int66 == 2022);
        org.junit.Assert.assertNotNull(chronology67);
        org.junit.Assert.assertTrue("'" + long68 + "' != '" + 1645488000000L + "'", long68 == 1645488000000L);
        org.junit.Assert.assertNotNull(periodType72);
    }

    @Test
    public void test00347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00347");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusSeconds(2);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        long long14 = dateMidnight11.getMillis();
        org.joda.time.DateMidnight.Property property15 = dateMidnight11.weekyear();
        org.joda.time.DateMidnight dateMidnight16 = property15.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight17 = property15.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime7.withField(dateTimeFieldType18, 32769);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime7.minusMinutes((int) 'a');
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime24 = localDateTime7.withYearOfCentury(999);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1645488000000L + "'", long14 == 1645488000000L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
    }

    @Test
    public void test00348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00348");
        java.util.Date date3 = new java.util.Date(19, 11, 0);
        org.junit.Assert.assertEquals(date3.toString(), "Sun Nov 30 00:00:00 GMT+00:00 1919");
    }

    @Test
    public void test00349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00349");
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(14400004L);
        int int2 = localTime1.getHourOfDay();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        int int9 = dateMidnight8.getYearOfEra();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology10);
        org.joda.time.DateTimeField dateTimeField12 = chronology10.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField13 = chronology10.halfdayOfDay();
        org.joda.time.LocalDate localDate15 = new org.joda.time.LocalDate((long) '#');
        int int16 = dateTimeField13.getMinimumValue((org.joda.time.ReadablePartial) localDate15);
        org.joda.time.LocalDate localDate18 = localDate15.withYearOfEra((int) '4');
        org.joda.time.DateTimeFieldType dateTimeFieldType19 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean20 = localDate15.isSupported(dateTimeFieldType19);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime22 = localTime1.withField(dateTimeFieldType19, (-292275054));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -292275054 for hourOfHalfday must be in the range [0,11]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTimeField12);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 0 + "'", int16 == 0);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateTimeFieldType19);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
    }

    @Test
    public void test00350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00350");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.days();
        org.joda.time.Period period2 = new org.joda.time.Period(1645488000000L, periodType1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration3, readableInstant4);
        org.joda.time.PeriodType periodType6 = period5.getPeriodType();
        org.joda.time.Period period7 = period2.normalizedStandard(periodType6);
        org.joda.time.DurationFieldType durationFieldType8 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period10 = period7.withField(durationFieldType8, 8);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field must not be null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
    }

    @Test
    public void test00351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00351");
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusDays((int) (short) -1);
        int int14 = dateMidnight13.getYearOfEra();
        org.joda.time.Chronology chronology15 = dateMidnight13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfDay();
        org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long) (short) 100, chronology15);
        org.joda.time.DurationField durationField19 = durationFieldType6.getField(chronology15);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        int int24 = dateMidnight23.getYearOfEra();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.DateTimeField dateTimeField26 = chronology25.hourOfDay();
        org.joda.time.DurationField durationField27 = durationFieldType6.getField(chronology25);
        org.joda.time.DurationField durationField28 = chronology25.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime((int) '4', 122, 53, (int) (byte) -1, 8, 1969, chronology25);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(durationField19);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateTimeField26);
        org.junit.Assert.assertNotNull(durationField27);
        org.junit.Assert.assertNotNull(durationField28);
    }

    @Test
    public void test00352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00352");
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        int int9 = dateMidnight8.getYearOfEra();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology10);
        org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime((long) (short) 10, chronology10);
        org.joda.time.DateTime dateTime14 = dateTime12.minusMonths(10);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        org.joda.time.DateTime dateTime25 = new org.joda.time.DateTime((long) (short) 10, chronology23);
        org.joda.time.DateTime dateTime26 = dateTime14.toDateTime(chronology23);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 24, (long) '#', chronology23);
        mutablePeriod27.setHours((int) (short) 0);
        org.joda.time.ReadableDuration readableDuration30 = null;
        org.joda.time.ReadableInstant readableInstant31 = null;
        org.joda.time.Period period32 = new org.joda.time.Period(readableDuration30, readableInstant31);
        java.lang.Object obj33 = null;
        boolean boolean34 = period32.equals(obj33);
        org.joda.time.Period period36 = period32.plusWeeks(19);
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.centuries();
        int int38 = period32.get(durationFieldType37);
        // The following exception was thrown during execution in test generation
        try {
            mutablePeriod27.set(durationFieldType37, (int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Period does not support field 'centuries'");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTime26);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(period36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertTrue("'" + int38 + "' != '" + 0 + "'", int38 == 0);
    }

    @Test
    public void test00353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00353");
        org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((long) (byte) 1);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology13);
        org.joda.time.DateTime dateTime15 = new org.joda.time.DateTime((long) (short) 10, chronology13);
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.TimeOfDay timeOfDay18 = new org.joda.time.TimeOfDay((long) 10, chronology17);
        org.joda.time.DateTimeField[] dateTimeFieldArray19 = timeOfDay18.getFields();
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay((long) 10, chronology21);
        org.joda.time.DateTimeField[] dateTimeFieldArray23 = timeOfDay22.getFields();
        org.joda.time.Period period24 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay18, (org.joda.time.ReadablePartial) timeOfDay22);
        long long27 = chronology13.add((org.joda.time.ReadablePeriod) period24, (long) 53, 100);
        org.joda.time.LocalTime localTime28 = new org.joda.time.LocalTime((java.lang.Object) timeOfDay4, chronology13);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate29 = new org.joda.time.LocalDate(21, (-23641), 1969, chronology13);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -23641 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertNotNull(dateTimeFieldArray19);
        org.junit.Assert.assertNotNull(dateTimeFieldArray23);
        org.junit.Assert.assertNotNull(period24);
        org.junit.Assert.assertTrue("'" + long27 + "' != '" + 53L + "'", long27 == 53L);
    }

    @Test
    public void test00354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00354");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField14 = chronology11.halfdayOfDay();
        org.joda.time.LocalTime localTime15 = org.joda.time.LocalTime.fromMillisOfDay(0L, chronology11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate16 = new org.joda.time.LocalDate((int) (byte) 0, 19, (int) 'u', chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 19 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(localTime15);
    }

    @Test
    public void test00355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00355");
        org.joda.time.Period period1 = org.joda.time.Period.months((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Minutes minutes2 = period1.toStandardMinutes();
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Cannot convert to Minutes as this period contains months and months vary in length");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(period1);
    }

    @Test
    public void test00356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00356");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant(4320000000L);
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder6 = builder4.setCalendarType("Sat Dec 31 00:00:00 UTC 1898");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: Sat Dec 31 00:00:00 UTC 1898");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00357");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (short) -1);
        org.joda.time.LocalDate localDate3 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str4 = localDate3.toString();
        org.joda.time.LocalDate.Property property5 = localDate3.weekyear();
        java.lang.String str6 = property5.getAsString();
        org.joda.time.LocalDate localDate7 = property5.roundHalfEvenCopy();
        org.joda.time.LocalDate localDate8 = property5.roundHalfFloorCopy();
        org.joda.time.LocalDate localDate9 = property5.roundCeilingCopy();
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology12);
        mutablePeriod13.setPeriod((long) (short) 10, (long) (short) -1);
        int int18 = mutablePeriod13.getValue(0);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        org.joda.time.Duration duration23 = mutablePeriod13.toDurationTo((org.joda.time.ReadableInstant) dateMidnight20);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusDays((int) (short) -1);
        int int30 = dateMidnight29.getYearOfEra();
        org.joda.time.Chronology chronology31 = dateMidnight29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology31);
        org.joda.time.DateTimeField dateTimeField33 = chronology31.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField34 = chronology31.halfdayOfDay();
        org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((java.lang.Object) dateMidnight20, chronology31);
        org.joda.time.LocalDate localDate37 = localDate35.withDayOfMonth(8);
        java.util.Locale locale38 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet39 = locale38.getUnicodeLocaleKeys();
        strSet39.clear();
        org.joda.time.PeriodType periodType41 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType42 = periodType41.withWeeksRemoved();
        java.lang.String str43 = periodType41.getName();
        boolean boolean44 = strSet39.contains((java.lang.Object) periodType41);
        org.joda.time.Period period45 = new org.joda.time.Period((org.joda.time.ReadablePartial) localDate9, (org.joda.time.ReadablePartial) localDate35, periodType41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period46 = new org.joda.time.Period((java.lang.Object) (short) -1, periodType41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No period converter found for type: java.lang.Short");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970-01-01" + "'", str4, "1970-01-01");
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertEquals("'" + str6 + "' != '" + "1970" + "'", str6, "1970");
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(localDate8);
        org.junit.Assert.assertNotNull(localDate9);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertNotNull(duration23);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTimeField33);
        org.junit.Assert.assertNotNull(dateTimeField34);
        org.junit.Assert.assertNotNull(localDate37);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet39);
        org.junit.Assert.assertNotNull(periodType41);
        org.junit.Assert.assertNotNull(periodType42);
        org.junit.Assert.assertEquals("'" + str43 + "' != '" + "Days" + "'", str43, "Days");
        org.junit.Assert.assertTrue("'" + boolean44 + "' != '" + false + "'", boolean44 == false);
    }

    @Test
    public void test00358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00358");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withChronologyRetainFields(chronology2);
        org.joda.time.DateTime dateTime4 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        int int11 = dateMidnight10.getYearOfEra();
        org.joda.time.Chronology chronology12 = dateMidnight10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.halfdayOfDay();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) '#');
        int int18 = dateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.Period period19 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate20 = localDate17.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay0.minus((org.joda.time.ReadablePeriod) period19);
        java.lang.String str22 = yearMonthDay0.toString();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology25);
        mutablePeriod26.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod26.add(0L);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        mutablePeriod26.add(0L, chronology40);
        mutablePeriod26.setHours(10);
        int int45 = mutablePeriod26.getYears();
        org.joda.time.PeriodType periodType47 = null;
        org.joda.time.Chronology chronology48 = null;
        org.joda.time.Period period49 = new org.joda.time.Period((long) '#', periodType47, chronology48);
        org.joda.time.Period period51 = period49.withDays((int) ' ');
        mutablePeriod26.mergePeriod((org.joda.time.ReadablePeriod) period49);
        org.joda.time.YearMonthDay yearMonthDay53 = yearMonthDay0.plus((org.joda.time.ReadablePeriod) mutablePeriod26);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay55 = yearMonthDay0.withDayOfMonth(902);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 902 for dayOfMonth must be in the range [1,28]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2022-02-21" + "'", str22, "2022-02-21");
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2022 + "'", int39 == 2022);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 0 + "'", int45 == 0);
        org.junit.Assert.assertNotNull(period51);
        org.junit.Assert.assertNotNull(yearMonthDay53);
    }

    @Test
    public void test00359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00359");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.setExtension('#', "DateTimeField[clockhourOfDay]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed extension key: # [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00360");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        int int15 = dateTime14.getMonthOfYear();
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology19);
        mutablePeriod20.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod20.add(0L);
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(chronology29);
        org.joda.time.DateMidnight dateMidnight32 = dateMidnight30.minusDays((int) (short) -1);
        int int33 = dateMidnight32.getYearOfEra();
        org.joda.time.Chronology chronology34 = dateMidnight32.getChronology();
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology34);
        mutablePeriod20.add(0L, chronology34);
        org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight((long) (-1), chronology34);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        org.joda.time.DateTime dateTime48 = new org.joda.time.DateTime((long) (short) 10, chronology46);
        org.joda.time.MutableDateTime mutableDateTime49 = dateMidnight37.toMutableDateTime(chronology46);
        mutableDateTime49.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property52 = mutableDateTime49.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone53 = null;
        org.joda.time.MutableDateTime mutableDateTime54 = mutableDateTime49.toMutableDateTime(dateTimeZone53);
        org.joda.time.YearMonthDay yearMonthDay55 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray56 = yearMonthDay55.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone57 = null;
        org.joda.time.DateTime dateTime58 = yearMonthDay55.toDateTimeAtCurrentTime(dateTimeZone57);
        org.joda.time.Duration duration59 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime49, (org.joda.time.ReadableInstant) dateTime58);
        org.joda.time.PeriodType periodType62 = org.joda.time.PeriodType.days();
        org.joda.time.PeriodType periodType63 = periodType62.withWeeksRemoved();
        org.joda.time.Period period64 = new org.joda.time.Period((long) 1970, (long) 3, periodType62);
        org.joda.time.Period period65 = new org.joda.time.Period((org.joda.time.ReadableInstant) dateTime14, (org.joda.time.ReadableDuration) duration59, periodType62);
        org.joda.time.DateTime.Property property66 = dateTime14.dayOfYear();
        org.joda.time.DateTimeField dateTimeField67 = property66.getField();
        long long70 = dateTimeField67.set(36000L, 1);
        long long72 = dateTimeField67.roundCeiling((long) 100);
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(dateMidnight32);
        org.junit.Assert.assertTrue("'" + int33 + "' != '" + 2022 + "'", int33 == 2022);
        org.junit.Assert.assertNotNull(chronology34);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(mutableDateTime49);
        org.junit.Assert.assertNotNull(property52);
        org.junit.Assert.assertNotNull(mutableDateTime54);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray56);
        org.junit.Assert.assertNotNull(dateTime58);
        org.junit.Assert.assertNotNull(periodType62);
        org.junit.Assert.assertNotNull(periodType63);
        org.junit.Assert.assertNotNull(property66);
        org.junit.Assert.assertNotNull(dateTimeField67);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 36000L + "'", long70 == 36000L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 86400000L + "'", long72 == 86400000L);
    }

    @Test
    public void test00361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00361");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime(4, 999, 16, 53, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 53 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00362");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay0.dayOfMonth();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod7.add(0L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        mutablePeriod7.add(0L, chronology21);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (-1), chronology21);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 10, chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight24.toMutableDateTime(chronology33);
        mutableDateTime36.setYear(2022);
        mutableDateTime36.setYear((-1));
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.dayOfYear();
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusDays((int) (short) -1);
        long long48 = dateMidnight45.getMillis();
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.days();
        org.joda.time.Period period50 = duration43.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight45, periodType49);
        org.joda.time.MutableDateTime mutableDateTime51 = dateMidnight45.toMutableDateTimeISO();
        int int52 = mutableDateTime51.getDayOfYear();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.minusDays((int) (short) -1);
        int int59 = dateMidnight58.getYearOfEra();
        org.joda.time.Chronology chronology60 = dateMidnight58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology60);
        mutableDateTime51.setChronology(chronology60);
        mutableDateTime36.setTime((org.joda.time.ReadableInstant) mutableDateTime51);
        mutableDateTime36.addYears((int) (byte) -1);
        int int66 = property2.compareTo((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.YearMonthDay yearMonthDay67 = property2.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay69 = yearMonthDay67.minusDays(11);
        org.joda.time.DateTimeFieldType dateTimeFieldType70 = org.joda.time.DateTimeFieldType.clockhourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay72 = yearMonthDay69.withField(dateTimeFieldType70, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1645401600000L + "'", long48 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 52 + "'", int52 == 52);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2022 + "'", int59 == 2022);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay67);
        org.junit.Assert.assertNotNull(yearMonthDay69);
        org.junit.Assert.assertNotNull(dateTimeFieldType70);
    }

    @Test
    public void test00363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00363");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = timeOfDay2.getFields();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) 10, chronology5);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = timeOfDay6.getFields();
        org.joda.time.Period period8 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay2, (org.joda.time.ReadablePartial) timeOfDay6);
        int[] intArray9 = timeOfDay6.getValues();
        org.joda.time.DateTime dateTime10 = timeOfDay6.toDateTimeToday();
        org.joda.time.DateMidnight dateMidnight11 = dateTime10.toDateMidnight();
        org.joda.time.DateTime dateTime13 = dateTime10.withMillisOfSecond(3);
        org.joda.time.DateTime.Property property14 = dateTime13.hourOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime16 = property14.setCopy(122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 122 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(intArray9);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray9), "[0, 0, 0, 10]");
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateTime13);
        org.junit.Assert.assertNotNull(property14);
    }

    @Test
    public void test00364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00364");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime5 = localDateTime1.withWeekOfWeekyear((int) (short) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
    }

    @Test
    public void test00365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00365");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        boolean boolean2 = calendar1.isWeekDateSupported();
        calendar1.roll(0, true);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean7 = calendar1.isSet(2024);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 2024");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=0,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=17,MILLISECOND=374,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
    }

    @Test
    public void test00366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00366");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime33.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime33.toMutableDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology41);
        mutablePeriod42.setPeriod((long) (short) 10, (long) (short) -1);
        int int46 = mutablePeriod42.getMonths();
        mutablePeriod42.addMinutes((int) (short) 0);
        mutableDateTime33.add((org.joda.time.ReadablePeriod) mutablePeriod42, 12);
        org.joda.time.DateTimeZone dateTimeZone51 = null;
        org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime(dateTimeZone51);
        org.joda.time.LocalDateTime localDateTime54 = localDateTime52.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property55 = localDateTime52.yearOfEra();
        org.joda.time.LocalDateTime localDateTime56 = property55.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime57 = property55.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType58 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        org.joda.time.Chronology chronology61 = null;
        org.joda.time.MutablePeriod mutablePeriod62 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology61);
        mutablePeriod62.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod62.add(0L);
        org.joda.time.Chronology chronology71 = null;
        org.joda.time.DateMidnight dateMidnight72 = new org.joda.time.DateMidnight(chronology71);
        org.joda.time.DateMidnight dateMidnight74 = dateMidnight72.minusDays((int) (short) -1);
        int int75 = dateMidnight74.getYearOfEra();
        org.joda.time.Chronology chronology76 = dateMidnight74.getChronology();
        org.joda.time.MutablePeriod mutablePeriod77 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology76);
        mutablePeriod62.add(0L, chronology76);
        boolean boolean79 = dateTimeFieldType58.isSupported(chronology76);
        org.joda.time.DurationField durationField80 = chronology76.hours();
        org.joda.time.DurationFieldType durationFieldType81 = durationField80.getType();
        org.joda.time.LocalDateTime localDateTime83 = localDateTime57.withFieldAdded(durationFieldType81, (int) (short) -1);
        int int84 = mutablePeriod42.indexOf(durationFieldType81);
        java.lang.String str85 = durationFieldType81.toString();
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
        org.junit.Assert.assertNotNull(localDateTime54);
        org.junit.Assert.assertNotNull(property55);
        org.junit.Assert.assertNotNull(localDateTime56);
        org.junit.Assert.assertNotNull(localDateTime57);
        org.junit.Assert.assertNotNull(dateTimeFieldType58);
        org.junit.Assert.assertNotNull(dateMidnight74);
        org.junit.Assert.assertTrue("'" + int75 + "' != '" + 2022 + "'", int75 == 2022);
        org.junit.Assert.assertNotNull(chronology76);
        org.junit.Assert.assertTrue("'" + boolean79 + "' != '" + true + "'", boolean79 == true);
        org.junit.Assert.assertNotNull(durationField80);
        org.junit.Assert.assertNotNull(durationFieldType81);
        org.junit.Assert.assertNotNull(localDateTime83);
        org.junit.Assert.assertTrue("'" + int84 + "' != '" + 4 + "'", int84 == 4);
        org.junit.Assert.assertEquals("'" + str85 + "' != '" + "hours" + "'", str85, "hours");
    }

    @Test
    public void test00367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00367");
        java.util.Date date1 = new java.util.Date((long) 1);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromDateFields(date1);
        org.joda.time.YearMonthDay.Property property3 = yearMonthDay2.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay4 = property3.getYearMonthDay();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        int int11 = dateMidnight10.getYearOfEra();
        org.joda.time.Chronology chronology12 = dateMidnight10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology12.getZone();
        org.joda.time.DateTime dateTime16 = yearMonthDay4.toDateTimeAtCurrentTime(dateTimeZone15);
        boolean boolean18 = dateTimeZone15.isStandardOffset(1645455721906L);
        java.util.TimeZone timeZone19 = dateTimeZone15.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str22 = timeZone19.getDisplayName(false, 31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 31");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(yearMonthDay4);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertNotNull(dateTime16);
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + true + "'", boolean18 == true);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
    }

    @Test
    public void test00368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00368");
        org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology10);
        mutablePeriod11.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod11.add(0L);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        int int24 = dateMidnight23.getYearOfEra();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology25);
        mutablePeriod11.add(0L, chronology25);
        org.joda.time.Period period28 = new org.joda.time.Period((long) 0, (long) 6, chronology25);
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(2, 12, (int) (short) 10, 3, (int) (byte) 1, chronology25);
        org.joda.time.LocalDate localDate30 = org.joda.time.LocalDate.now(chronology25);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime31 = new org.joda.time.MutableDateTime((java.lang.Object) dateTimeZone0, chronology25);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone0);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(localDate30);
    }

    @Test
    public void test00369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00369");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(9, (int) (short) 100, 14, 59, 122, (int) (byte) 1, 12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 59 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00370");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration3 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration5 = duration1.withDurationAdded((org.joda.time.ReadableDuration) duration3, 12);
        org.joda.time.Duration duration6 = duration3.toDuration();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology10);
        mutablePeriod11.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod11.add(0L);
        org.joda.time.Chronology chronology20 = null;
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(chronology20);
        org.joda.time.DateMidnight dateMidnight23 = dateMidnight21.minusDays((int) (short) -1);
        int int24 = dateMidnight23.getYearOfEra();
        org.joda.time.Chronology chronology25 = dateMidnight23.getChronology();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology25);
        mutablePeriod11.add(0L, chronology25);
        org.joda.time.DateMidnight dateMidnight28 = new org.joda.time.DateMidnight((long) (-1), chronology25);
        org.joda.time.Chronology chronology32 = null;
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight(chronology32);
        org.joda.time.DateMidnight dateMidnight35 = dateMidnight33.minusDays((int) (short) -1);
        int int36 = dateMidnight35.getYearOfEra();
        org.joda.time.Chronology chronology37 = dateMidnight35.getChronology();
        org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology37);
        org.joda.time.DateTime dateTime39 = new org.joda.time.DateTime((long) (short) 10, chronology37);
        org.joda.time.MutableDateTime mutableDateTime40 = dateMidnight28.toMutableDateTime(chronology37);
        mutableDateTime40.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime40.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone44 = null;
        org.joda.time.MutableDateTime mutableDateTime45 = mutableDateTime40.toMutableDateTime(dateTimeZone44);
        int int46 = mutableDateTime45.getSecondOfMinute();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(chronology50);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.minusDays((int) (short) -1);
        int int54 = dateMidnight53.getYearOfEra();
        org.joda.time.Chronology chronology55 = dateMidnight53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology55);
        org.joda.time.DateTime dateTime57 = new org.joda.time.DateTime((long) (short) 10, chronology55);
        org.joda.time.DateTime dateTime59 = dateTime57.minusMonths(10);
        org.joda.time.Duration duration60 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime45, (org.joda.time.ReadableInstant) dateTime57);
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration) duration3, (org.joda.time.ReadableInstant) dateTime57);
        int int62 = mutablePeriod61.size();
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(duration3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertNotNull(duration6);
        org.junit.Assert.assertNotNull(dateMidnight23);
        org.junit.Assert.assertTrue("'" + int24 + "' != '" + 2022 + "'", int24 == 2022);
        org.junit.Assert.assertNotNull(chronology25);
        org.junit.Assert.assertNotNull(dateMidnight35);
        org.junit.Assert.assertTrue("'" + int36 + "' != '" + 2022 + "'", int36 == 2022);
        org.junit.Assert.assertNotNull(chronology37);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertNotNull(property43);
        org.junit.Assert.assertNotNull(mutableDateTime45);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 50 + "'", int46 == 50);
        org.junit.Assert.assertNotNull(dateMidnight53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2022 + "'", int54 == 2022);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTime59);
        org.junit.Assert.assertTrue("'" + int62 + "' != '" + 8 + "'", int62 == 8);
    }

    @Test
    public void test00371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00371");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        int int5 = dateMidnight3.getWeekyear();
        org.joda.time.YearMonthDay yearMonthDay6 = dateMidnight3.toYearMonthDay();
        org.joda.time.LocalDate localDate8 = new org.joda.time.LocalDate((long) '#');
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight3.withFields((org.joda.time.ReadablePartial) localDate8);
        java.lang.String str11 = localDate8.toString("\ufffd\ufffd");
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime(dateTimeZone13);
        org.joda.time.LocalDateTime localDateTime16 = localDateTime14.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property17 = localDateTime14.yearOfEra();
        org.joda.time.LocalDateTime localDateTime18 = property17.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField19 = property17.getField();
        java.util.Locale locale20 = java.util.Locale.PRC;
        java.lang.String str21 = locale20.toLanguageTag();
        java.lang.String str22 = property17.getAsShortText(locale20);
        java.lang.String str23 = locale20.getCountry();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str24 = localDate8.toString("Japan", locale20);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: J");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 2022 + "'", int5 == 2022);
        org.junit.Assert.assertNotNull(yearMonthDay6);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "\ufffd\ufffd" + "'", str11, "\ufffd\ufffd");
        org.junit.Assert.assertNotNull(localDateTime16);
        org.junit.Assert.assertNotNull(property17);
        org.junit.Assert.assertNotNull(localDateTime18);
        org.junit.Assert.assertNotNull(dateTimeField19);
        org.junit.Assert.assertNotNull(locale20);
        org.junit.Assert.assertEquals(locale20.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str21 + "' != '" + "zh-CN" + "'", str21, "zh-CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2022" + "'", str22, "2022");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "CN" + "'", str23, "CN");
    }

    @Test
    public void test00372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00372");
        java.util.Locale locale3 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str4 = locale3.getISO3Country();
            org.junit.Assert.fail("Expected exception of type java.util.MissingResourceException; message: Couldn't find 3-letter country code for 15:01:52.189");
        } catch (java.util.MissingResourceException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(locale3.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
    }

    @Test
    public void test00373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00373");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) (short) -1);
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval3 = yearMonthDay2.toInterval();
        org.joda.time.Chronology chronology4 = null;
        org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay2.withChronologyRetainFields(chronology4);
        org.joda.time.DateTime dateTime6 = yearMonthDay2.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTimeField dateTimeField16 = chronology14.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField17 = chronology14.halfdayOfDay();
        org.joda.time.LocalDate localDate19 = new org.joda.time.LocalDate((long) '#');
        int int20 = dateTimeField17.getMinimumValue((org.joda.time.ReadablePartial) localDate19);
        org.joda.time.Period period21 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate22 = localDate19.plus((org.joda.time.ReadablePeriod) period21);
        org.joda.time.YearMonthDay yearMonthDay23 = yearMonthDay2.minus((org.joda.time.ReadablePeriod) period21);
        java.lang.String str24 = yearMonthDay2.toString();
        org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateTime dateTime27 = yearMonthDay2.toDateTimeAtMidnight(dateTimeZone26);
        org.joda.time.Interval interval28 = localDate1.toInterval(dateTimeZone26);
        org.joda.time.Chronology chronology29 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay((java.lang.Object) dateTimeZone26, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.tz.FixedDateTimeZone");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNotNull(yearMonthDay5);
        org.junit.Assert.assertNotNull(dateTime6);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTimeField16);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 0 + "'", int20 == 0);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(yearMonthDay23);
        org.junit.Assert.assertEquals("'" + str24 + "' != '" + "2022-02-21" + "'", str24, "2022-02-21");
        org.junit.Assert.assertNotNull(dateTimeZone26);
        org.junit.Assert.assertNotNull(dateTime27);
        org.junit.Assert.assertNotNull(interval28);
    }

    @Test
    public void test00374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00374");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        timeZone14.setID("PT0S");
        java.lang.String str17 = timeZone14.getID();
        timeZone14.setID("\ufffd\ufffd");
        java.lang.Object obj20 = timeZone14.clone();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
// flaky:         org.junit.Assert.assertEquals(calendar11.toString(), "\ufffd\ufffd,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str17 + "' != '" + "PT0S" + "'", str17, "PT0S");
        org.junit.Assert.assertNotNull(obj20);
// flaky:         org.junit.Assert.assertEquals(obj20.toString(), "\ufffd\ufffd,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
// flaky:         org.junit.Assert.assertEquals(java.lang.String.valueOf(obj20), "\ufffd\ufffd,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
// flaky:         org.junit.Assert.assertEquals(java.util.Objects.toString(obj20), "\ufffd\ufffd,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0]");
    }

    @Test
    public void test00375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00375");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        java.util.TimeZone timeZone12 = calendar11.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int14 = calendar11.getLeastMaximum(31);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 31");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
    }

    @Test
    public void test00376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00376");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone12);
        mutableDateTime15.addMinutes(53);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime15.setHourOfDay(122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 122 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
    }

    @Test
    public void test00377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00377");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Duration duration40 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        long long45 = dateMidnight42.getMillis();
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = duration40.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight42, periodType46);
        org.joda.time.MutableDateTime mutableDateTime48 = dateMidnight42.toMutableDateTimeISO();
        int int49 = mutableDateTime48.getDayOfYear();
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutableDateTime48.setChronology(chronology57);
        mutableDateTime33.setTime((org.joda.time.ReadableInstant) mutableDateTime48);
        int int61 = mutableDateTime33.getSecondOfDay();
        mutableDateTime33.setSecondOfDay((int) (short) 10);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setMillisOfDay((int) (short) -1);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for millisOfDay must be in the range [0,86399999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(duration40);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertTrue("'" + long45 + "' != '" + 1645401600000L + "'", long45 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period47);
        org.junit.Assert.assertNotNull(mutableDateTime48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 52 + "'", int49 == 52);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2022 + "'", int56 == 2022);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertTrue("'" + int61 + "' != '" + 0 + "'", int61 == 0);
    }

    @Test
    public void test00378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00378");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime(7, 15, (int) '4', 52, 122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 52 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00379");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone11 = null;
        org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long) 5, dateTimeZone11);
        org.joda.time.LocalDateTime localDateTime14 = localDateTime12.minusSeconds((int) '#');
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime12);
        java.lang.String str16 = localDateTime12.toString();
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertEquals("'" + str16 + "' != '" + "1970-01-01T00:00:00.005" + "'", str16, "1970-01-01T00:00:00.005");
    }

    @Test
    public void test00380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00380");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "24", "Japan", "Thu Jan 01 15:00:00 UTC 1970", "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z", "DateTimeField[clockhourOfDay]", "-00:00:00.001", "Thu Dec 01 00:00:00 UTC 1898", "2022-02-21T00:00:00.000Z/2022-02-21T00:00:00.000Z", "ja", "hourOfHalfday", "Sat Dec 31 00:00:00 UTC 1898", "hi!", "1970-01-01", "hourOfHalfday", "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z", "-00:00:00.001" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        boolean boolean20 = strSet18.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale24, locale25 };
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.Locale locale29 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList27);
        boolean boolean30 = strSet18.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        boolean boolean34 = strSet18.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray40 = new java.util.Locale[] { locale38, locale39 };
        java.util.ArrayList<java.util.Locale> localeList41 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList41, localeArray40);
        java.util.Locale locale43 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.util.Locale>) localeList41);
        java.util.List<java.util.Locale> localeList44 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList41);
        java.util.Set<java.lang.String> strSet45 = org.joda.time.DateTimeZone.getAvailableIDs();
        java.util.Locale.FilteringMode filteringMode46 = java.util.Locale.FilteringMode.AUTOSELECT_FILTERING;
        java.util.List<java.lang.String> strList47 = java.util.Locale.filterTags((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.lang.String>) strSet45, filteringMode46);
        java.lang.String[] strArray65 = new java.lang.String[] { "hi!", "24", "Japan", "Thu Jan 01 15:00:00 UTC 1970", "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z", "DateTimeField[clockhourOfDay]", "-00:00:00.001", "Thu Dec 01 00:00:00 UTC 1898", "2022-02-21T00:00:00.000Z/2022-02-21T00:00:00.000Z", "ja", "hourOfHalfday", "Sat Dec 31 00:00:00 UTC 1898", "hi!", "1970-01-01", "hourOfHalfday", "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z", "-00:00:00.001" };
        java.util.LinkedHashSet<java.lang.String> strSet66 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean67 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet66, strArray65);
        boolean boolean68 = strSet66.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray69 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList70 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean71 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70, languageRangeArray69);
        java.util.Locale locale72 = java.util.Locale.GERMAN;
        java.util.Locale locale73 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray74 = new java.util.Locale[] { locale72, locale73 };
        java.util.ArrayList<java.util.Locale> localeList75 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean76 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList75, localeArray74);
        java.util.Locale locale77 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList70, (java.util.Collection<java.util.Locale>) localeList75);
        boolean boolean78 = strSet66.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList70);
        java.util.Locale.LanguageRange[] languageRangeArray79 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList80 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean81 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList80, languageRangeArray79);
        boolean boolean82 = strSet66.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList80);
        java.util.Locale.LanguageRange[] languageRangeArray83 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList84 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean85 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList84, languageRangeArray83);
        java.util.Locale locale86 = java.util.Locale.GERMAN;
        java.util.Locale locale87 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray88 = new java.util.Locale[] { locale86, locale87 };
        java.util.ArrayList<java.util.Locale> localeList89 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean90 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList89, localeArray88);
        java.util.Locale locale91 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList84, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.List<java.util.Locale> localeList92 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList80, (java.util.Collection<java.util.Locale>) localeList89);
        java.util.Locale locale93 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList89);
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertNotNull(localeList44);
        org.junit.Assert.assertNotNull(strSet45);
        org.junit.Assert.assertTrue("'" + filteringMode46 + "' != '" + java.util.Locale.FilteringMode.AUTOSELECT_FILTERING + "'", filteringMode46.equals(java.util.Locale.FilteringMode.AUTOSELECT_FILTERING));
        org.junit.Assert.assertNotNull(strList47);
        org.junit.Assert.assertNotNull(strArray65);
        org.junit.Assert.assertTrue("'" + boolean67 + "' != '" + true + "'", boolean67 == true);
        org.junit.Assert.assertTrue("'" + boolean68 + "' != '" + false + "'", boolean68 == false);
        org.junit.Assert.assertNotNull(languageRangeArray69);
        org.junit.Assert.assertTrue("'" + boolean71 + "' != '" + false + "'", boolean71 == false);
        org.junit.Assert.assertNotNull(locale72);
        org.junit.Assert.assertEquals(locale72.toString(), "de");
        org.junit.Assert.assertNotNull(locale73);
        org.junit.Assert.assertEquals(locale73.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray74);
        org.junit.Assert.assertTrue("'" + boolean76 + "' != '" + true + "'", boolean76 == true);
        org.junit.Assert.assertNull(locale77);
        org.junit.Assert.assertTrue("'" + boolean78 + "' != '" + true + "'", boolean78 == true);
        org.junit.Assert.assertNotNull(languageRangeArray79);
        org.junit.Assert.assertTrue("'" + boolean81 + "' != '" + false + "'", boolean81 == false);
        org.junit.Assert.assertTrue("'" + boolean82 + "' != '" + false + "'", boolean82 == false);
        org.junit.Assert.assertNotNull(languageRangeArray83);
        org.junit.Assert.assertTrue("'" + boolean85 + "' != '" + false + "'", boolean85 == false);
        org.junit.Assert.assertNotNull(locale86);
        org.junit.Assert.assertEquals(locale86.toString(), "de");
        org.junit.Assert.assertNotNull(locale87);
        org.junit.Assert.assertEquals(locale87.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray88);
        org.junit.Assert.assertTrue("'" + boolean90 + "' != '" + true + "'", boolean90 == true);
        org.junit.Assert.assertNull(locale91);
        org.junit.Assert.assertNotNull(localeList92);
        org.junit.Assert.assertNull(locale93);
    }

    @Test
    public void test00381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00381");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardHours(10L);
        long long6 = duration5.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableDuration) duration5);
        int int8 = mutablePeriod7.getSeconds();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 36000L + "'", long6 == 36000L);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
    }

    @Test
    public void test00382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00382");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant(4320000000L);
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) (short) 100);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder6 = builder2.setCalendarType("GBR");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: unknown calendar type: GBR");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
    }

    @Test
    public void test00383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00383");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime((long) 22, dateTimeZone2);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime3.setDateTime((int) (byte) 0, 1970, 16, 50, 1969, 11, 53);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 50 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone2);
    }

    @Test
    public void test00384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00384");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        int int8 = dateMidnight3.getMonthOfYear();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 2 + "'", int8 == 2);
    }

    @Test
    public void test00385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00385");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Instant instant6 = dateMidnight5.toInstant();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight8 = dateMidnight5.withDayOfWeek((int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(instant6);
    }

    @Test
    public void test00386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00386");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        int int4 = localDate1.getCenturyOfEra();
        org.joda.time.LocalDate.Property property5 = localDate1.weekOfWeekyear();
        int int6 = property5.getLeapAmount();
        org.joda.time.LocalDate localDate7 = property5.withMaximumValue();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusDays((int) (short) -1);
        int int14 = dateMidnight13.getYearOfEra();
        org.joda.time.Chronology chronology15 = dateMidnight13.getChronology();
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology15);
        org.joda.time.DateTimeField dateTimeField17 = chronology15.clockhourOfDay();
        org.joda.time.DateTime dateTime18 = new org.joda.time.DateTime(chronology15);
        org.joda.time.DateTime dateTime20 = dateTime18.minusSeconds(4);
        org.joda.time.LocalTime localTime21 = dateTime20.toLocalTime();
        org.joda.time.LocalTime.Property property22 = localTime21.millisOfSecond();
        org.joda.time.LocalTime localTime23 = property22.withMaximumValue();
        org.joda.time.LocalTime localTime24 = property22.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime25 = property22.roundFloorCopy();
        org.joda.time.LocalTime localTime26 = property22.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime28 = property22.setCopy(11);
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean29 = localDate7.isBefore((org.joda.time.ReadablePartial) localTime28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 0 + "'", int6 == 0);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + int14 + "' != '" + 2022 + "'", int14 == 2022);
        org.junit.Assert.assertNotNull(chronology15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(localTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(localTime23);
        org.junit.Assert.assertNotNull(localTime24);
        org.junit.Assert.assertNotNull(localTime25);
        org.junit.Assert.assertNotNull(localTime26);
        org.junit.Assert.assertNotNull(localTime28);
    }

    @Test
    public void test00387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00387");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        java.lang.String str12 = chronology11.toString();
        org.joda.time.DurationField durationField13 = chronology11.months();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime14 = new org.joda.time.DateTime((int) (short) 100, 3, (-2), 363, 32769, (int) (byte) 10, chronology11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 363 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str12, "ISOChronology[Etc/UTC]");
        org.junit.Assert.assertNotNull(durationField13);
    }

    @Test
    public void test00388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00388");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime33.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime33.toMutableDateTime(dateTimeZone37);
        org.joda.time.YearMonthDay yearMonthDay39 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray40 = yearMonthDay39.getFieldTypes();
        org.joda.time.DateTimeZone dateTimeZone41 = null;
        org.joda.time.DateTime dateTime42 = yearMonthDay39.toDateTimeAtCurrentTime(dateTimeZone41);
        org.joda.time.Duration duration43 = new org.joda.time.Duration((org.joda.time.ReadableInstant) mutableDateTime33, (org.joda.time.ReadableInstant) dateTime42);
        mutableDateTime33.addYears(9);
        org.joda.time.DurationFieldType durationFieldType46 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology50 = null;
        org.joda.time.DateMidnight dateMidnight51 = new org.joda.time.DateMidnight(chronology50);
        org.joda.time.DateMidnight dateMidnight53 = dateMidnight51.minusDays((int) (short) -1);
        int int54 = dateMidnight53.getYearOfEra();
        org.joda.time.Chronology chronology55 = dateMidnight53.getChronology();
        org.joda.time.MutablePeriod mutablePeriod56 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology55);
        org.joda.time.DateTimeField dateTimeField57 = chronology55.clockhourOfDay();
        org.joda.time.LocalTime localTime58 = new org.joda.time.LocalTime((long) (short) 100, chronology55);
        org.joda.time.DurationField durationField59 = durationFieldType46.getField(chronology55);
        org.joda.time.Chronology chronology60 = null;
        org.joda.time.DateMidnight dateMidnight61 = new org.joda.time.DateMidnight(chronology60);
        org.joda.time.DateMidnight dateMidnight63 = dateMidnight61.minusDays((int) (short) -1);
        int int64 = dateMidnight63.getYearOfEra();
        org.joda.time.Chronology chronology65 = dateMidnight63.getChronology();
        org.joda.time.DateTimeField dateTimeField66 = chronology65.hourOfDay();
        org.joda.time.DurationField durationField67 = durationFieldType46.getField(chronology65);
        org.joda.time.DateTimeField dateTimeField68 = chronology65.clockhourOfHalfday();
        long long70 = dateTimeField68.roundHalfFloor((long) 24);
        long long72 = dateTimeField68.roundHalfCeiling(68400007L);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setRounding(dateTimeField68, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal rounding mode: -1");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertNotNull(durationFieldType46);
        org.junit.Assert.assertNotNull(dateMidnight53);
        org.junit.Assert.assertTrue("'" + int54 + "' != '" + 2022 + "'", int54 == 2022);
        org.junit.Assert.assertNotNull(chronology55);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField59);
        org.junit.Assert.assertNotNull(dateMidnight63);
        org.junit.Assert.assertTrue("'" + int64 + "' != '" + 2022 + "'", int64 == 2022);
        org.junit.Assert.assertNotNull(chronology65);
        org.junit.Assert.assertNotNull(dateTimeField66);
        org.junit.Assert.assertNotNull(durationField67);
        org.junit.Assert.assertNotNull(dateTimeField68);
        org.junit.Assert.assertTrue("'" + long70 + "' != '" + 0L + "'", long70 == 0L);
        org.junit.Assert.assertTrue("'" + long72 + "' != '" + 68400000L + "'", long72 == 68400000L);
    }

    @Test
    public void test00389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00389");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.Duration duration5 = org.joda.time.Duration.standardHours(10L);
        long long6 = duration5.getStandardSeconds();
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight3, (org.joda.time.ReadableDuration) duration5);
        org.joda.time.Period period8 = duration5.toPeriod();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        long long15 = dateMidnight12.getMillis();
        org.joda.time.DateMidnight.Property property16 = dateMidnight12.weekyear();
        org.joda.time.DateMidnight dateMidnight17 = property16.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight18 = property16.roundHalfFloorCopy();
        org.joda.time.Period period19 = duration5.toPeriodTo((org.joda.time.ReadableInstant) dateMidnight18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight18.minus((long) 50);
        org.joda.time.Chronology chronology22 = null;
        org.joda.time.MutableDateTime mutableDateTime23 = dateMidnight18.toMutableDateTime(chronology22);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(duration5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 36000L + "'", long6 == 36000L);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertTrue("'" + long15 + "' != '" + 1645488000000L + "'", long15 == 1645488000000L);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertNotNull(period19);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertNotNull(mutableDateTime23);
    }

    @Test
    public void test00390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00390");
        org.joda.time.DateTime dateTime0 = new org.joda.time.DateTime();
    }

    @Test
    public void test00391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00391");
        int int0 = org.joda.time.TimeOfDay.MINUTE_OF_HOUR;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00392");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        java.lang.String str4 = property3.getAsString();
        org.joda.time.LocalDate localDate5 = property3.roundHalfEvenCopy();
        org.joda.time.LocalDate.Property property6 = localDate5.yearOfEra();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate8 = localDate5.withYearOfEra(0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "1970" + "'", str4, "1970");
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(property6);
    }

    @Test
    public void test00393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00393");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        org.joda.time.Duration duration36 = new org.joda.time.Duration((long) 'a', (long) 1970);
        mutableDateTime33.add((org.joda.time.ReadableDuration) duration36);
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.hourOfDay();
        mutableDateTime33.setYear(24);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setDate(3, 100, 2);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
    }

    @Test
    public void test00394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00394");
        java.util.TimeZone timeZone0 = java.util.TimeZone.getDefault();
        // The following exception was thrown during execution in test generation
        try {
            int int7 = timeZone0.getOffset(52, 1969, 11, 3, 1, 2024);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal era 52");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(timeZone0);
        org.junit.Assert.assertEquals(timeZone0.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00395");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay.Property property2 = yearMonthDay0.dayOfMonth();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod7.add(0L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        mutablePeriod7.add(0L, chronology21);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (-1), chronology21);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 10, chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight24.toMutableDateTime(chronology33);
        mutableDateTime36.setYear(2022);
        mutableDateTime36.setYear((-1));
        org.joda.time.MutableDateTime.Property property41 = mutableDateTime36.dayOfYear();
        org.joda.time.Duration duration43 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology44 = null;
        org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(chronology44);
        org.joda.time.DateMidnight dateMidnight47 = dateMidnight45.minusDays((int) (short) -1);
        long long48 = dateMidnight45.getMillis();
        org.joda.time.PeriodType periodType49 = org.joda.time.PeriodType.days();
        org.joda.time.Period period50 = duration43.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight45, periodType49);
        org.joda.time.MutableDateTime mutableDateTime51 = dateMidnight45.toMutableDateTimeISO();
        int int52 = mutableDateTime51.getDayOfYear();
        org.joda.time.Chronology chronology55 = null;
        org.joda.time.DateMidnight dateMidnight56 = new org.joda.time.DateMidnight(chronology55);
        org.joda.time.DateMidnight dateMidnight58 = dateMidnight56.minusDays((int) (short) -1);
        int int59 = dateMidnight58.getYearOfEra();
        org.joda.time.Chronology chronology60 = dateMidnight58.getChronology();
        org.joda.time.MutablePeriod mutablePeriod61 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology60);
        mutableDateTime51.setChronology(chronology60);
        mutableDateTime36.setTime((org.joda.time.ReadableInstant) mutableDateTime51);
        mutableDateTime36.addYears((int) (byte) -1);
        int int66 = property2.compareTo((org.joda.time.ReadableInstant) mutableDateTime36);
        org.joda.time.YearMonthDay yearMonthDay67 = property2.withMinimumValue();
        org.joda.time.YearMonthDay yearMonthDay68 = property2.getYearMonthDay();
        int int69 = yearMonthDay68.getMonthOfYear();
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertNotNull(property2);
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(property41);
        org.junit.Assert.assertNotNull(duration43);
        org.junit.Assert.assertNotNull(dateMidnight47);
        org.junit.Assert.assertTrue("'" + long48 + "' != '" + 1645401600000L + "'", long48 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType49);
        org.junit.Assert.assertNotNull(period50);
        org.junit.Assert.assertNotNull(mutableDateTime51);
        org.junit.Assert.assertTrue("'" + int52 + "' != '" + 52 + "'", int52 == 52);
        org.junit.Assert.assertNotNull(dateMidnight58);
        org.junit.Assert.assertTrue("'" + int59 + "' != '" + 2022 + "'", int59 == 2022);
        org.junit.Assert.assertNotNull(chronology60);
        org.junit.Assert.assertTrue("'" + int66 + "' != '" + (-1) + "'", int66 == (-1));
        org.junit.Assert.assertNotNull(yearMonthDay67);
        org.junit.Assert.assertNotNull(yearMonthDay68);
        org.junit.Assert.assertTrue("'" + int69 + "' != '" + 2 + "'", int69 == 2);
    }

    @Test
    public void test00396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00396");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone12);
        org.joda.time.DateTime dateTime17 = dateTime10.minusMonths(5);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime10.withDayOfWeek((-23641));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -23641 for dayOfWeek must be in the range [1,7]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00397");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = builder0.build();
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder3 = builder0.removeUnicodeLocaleAttribute("DateTimeField[clockhourOfDay]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed Unicode locale attribute: DateTimeField[clockhourOfDay] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "");
    }

    @Test
    public void test00398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00398");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology2);
        mutablePeriod3.setPeriod((long) (short) 10, (long) (short) -1);
        int int8 = mutablePeriod3.getValue(0);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.Duration duration13 = mutablePeriod3.toDurationTo((org.joda.time.ReadableInstant) dateMidnight10);
        org.joda.time.Duration duration15 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration17 = org.joda.time.Duration.standardDays((long) '#');
        org.joda.time.Duration duration19 = duration15.withDurationAdded((org.joda.time.ReadableDuration) duration17, 12);
        org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate22 = org.joda.time.LocalDate.now(dateTimeZone21);
        org.joda.time.DateTime dateTime23 = org.joda.time.DateTime.now(dateTimeZone21);
        org.joda.time.Duration duration26 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime23, (org.joda.time.ReadableDuration) duration26);
        org.joda.time.Chronology chronology31 = null;
        org.joda.time.DateMidnight dateMidnight32 = new org.joda.time.DateMidnight(chronology31);
        org.joda.time.DateMidnight dateMidnight34 = dateMidnight32.minusDays((int) (short) -1);
        int int35 = dateMidnight34.getYearOfEra();
        org.joda.time.Chronology chronology36 = dateMidnight34.getChronology();
        org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology36);
        org.joda.time.DateTime dateTime38 = new org.joda.time.DateTime((long) (short) 10, chronology36);
        org.joda.time.DateTime dateTime40 = dateTime38.minusHours(7);
        org.joda.time.DateTime dateTime42 = dateTime40.plusYears((int) (byte) 0);
        int int43 = dateTime42.getMonthOfYear();
        org.joda.time.Interval interval44 = duration26.toIntervalFrom((org.joda.time.ReadableInstant) dateTime42);
        org.joda.time.Duration duration45 = duration15.minus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Duration duration46 = duration13.plus((org.joda.time.ReadableDuration) duration26);
        org.joda.time.Instant instant47 = new org.joda.time.Instant();
        org.joda.time.Interval interval48 = new org.joda.time.Interval((org.joda.time.ReadableDuration) duration46, (org.joda.time.ReadableInstant) instant47);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        org.joda.time.DateTime dateTime59 = new org.joda.time.DateTime((long) (short) 10, chronology57);
        org.joda.time.DateTime dateTime61 = dateTime59.minusHours(7);
        org.joda.time.DateTime dateTime63 = dateTime61.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property64 = dateTime61.centuryOfEra();
        int int65 = dateTime61.getMillisOfSecond();
        org.joda.time.DateTimeZone dateTimeZone66 = dateTime61.getZone();
        org.joda.time.Interval interval67 = interval48.withStart((org.joda.time.ReadableInstant) dateTime61);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(duration13);
        org.junit.Assert.assertNotNull(duration15);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(duration19);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(localDate22);
        org.junit.Assert.assertNotNull(dateTime23);
        org.junit.Assert.assertNotNull(dateMidnight34);
        org.junit.Assert.assertTrue("'" + int35 + "' != '" + 2022 + "'", int35 == 2022);
        org.junit.Assert.assertNotNull(chronology36);
        org.junit.Assert.assertNotNull(dateTime40);
        org.junit.Assert.assertNotNull(dateTime42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 12 + "'", int43 == 12);
        org.junit.Assert.assertNotNull(interval44);
        org.junit.Assert.assertNotNull(duration45);
        org.junit.Assert.assertNotNull(duration46);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2022 + "'", int56 == 2022);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateTime61);
        org.junit.Assert.assertNotNull(dateTime63);
        org.junit.Assert.assertNotNull(property64);
        org.junit.Assert.assertTrue("'" + int65 + "' != '" + 10 + "'", int65 == 10);
        org.junit.Assert.assertNotNull(dateTimeZone66);
        org.junit.Assert.assertNotNull(interval67);
    }

    @Test
    public void test00399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00399");
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
    public void test00400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00400");
        org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.days();
        org.joda.time.Period period2 = new org.joda.time.Period(1645488000000L, periodType1);
        org.joda.time.ReadableDuration readableDuration3 = null;
        org.joda.time.ReadableInstant readableInstant4 = null;
        org.joda.time.Period period5 = new org.joda.time.Period(readableDuration3, readableInstant4);
        org.joda.time.PeriodType periodType6 = period5.getPeriodType();
        org.joda.time.Period period7 = period2.normalizedStandard(periodType6);
        int int8 = period7.getDays();
        org.junit.Assert.assertNotNull(periodType1);
        org.junit.Assert.assertNotNull(periodType6);
        org.junit.Assert.assertNotNull(period7);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 5 + "'", int8 == 5);
    }

    @Test
    public void test00401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00401");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.DurationField durationField22 = chronology18.weeks();
        org.joda.time.DateTimeField dateTimeField23 = chronology18.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            long long29 = chronology18.getDateTimeMillis((long) 'a', 999, 11, 19, 11);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 999 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(durationField22);
        org.junit.Assert.assertNotNull(dateTimeField23);
    }

    @Test
    public void test00402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00402");
        long long6 = java.util.Date.UTC((int) (byte) -1, 53, 7, 53, 31, 6);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + (-2100623334000L) + "'", long6 == (-2100623334000L));
    }

    @Test
    public void test00403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00403");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("zh-CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"zh-CN\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00404");
        int int0 = java.util.TimeZone.LONG;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 1 + "'", int0 == 1);
    }

    @Test
    public void test00405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00405");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("PeriodType[Standard]", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00406");
        java.util.Date date3 = new java.util.Date((-1), (int) (short) 0, 0);
        date3.setMonth((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromDateFields(date3);
        int int7 = date3.getYear();
        org.joda.time.Duration duration9 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(chronology10);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight11.minusDays((int) (short) -1);
        long long14 = dateMidnight11.getMillis();
        org.joda.time.PeriodType periodType15 = org.joda.time.PeriodType.days();
        org.joda.time.Period period16 = duration9.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight11, periodType15);
        java.util.Date date17 = dateMidnight11.toDate();
        boolean boolean18 = date3.after(date17);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Dec 01 00:00:00 GMT+00:00 1898");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
        org.junit.Assert.assertNotNull(duration9);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1645401600000L + "'", long14 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType15);
        org.junit.Assert.assertNotNull(period16);
        org.junit.Assert.assertNotNull(date17);
        org.junit.Assert.assertEquals(date17.toString(), "Mon Feb 21 00:00:00 GMT+00:00 2022");
        org.junit.Assert.assertTrue("'" + boolean18 + "' != '" + false + "'", boolean18 == false);
    }

    @Test
    public void test00407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00407");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        int int13 = calendar11.getLeastMaximum(3);
        java.util.TimeZone timeZone14 = calendar11.getTimeZone();
        timeZone14.setID("PT0S");
        java.util.TimeZone.setDefault(timeZone14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        long long24 = dateMidnight21.getMillis();
        java.util.Locale locale28 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar29 = dateMidnight21.toCalendar(locale28);
        int int31 = calendar29.getLeastMaximum(3);
        java.util.TimeZone timeZone32 = calendar29.getTimeZone();
        timeZone32.setID("PT0S");
        java.lang.String str35 = timeZone32.getID();
        boolean boolean36 = timeZone14.hasSameRules(timeZone32);
        int int37 = timeZone32.getDSTSavings();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 50 + "'", int13 == 50);
        org.junit.Assert.assertNotNull(timeZone14);
        org.junit.Assert.assertEquals(timeZone14.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertTrue("'" + long24 + "' != '" + 1645488000000L + "'", long24 == 1645488000000L);
        org.junit.Assert.assertEquals(locale28.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar29);
        org.junit.Assert.assertEquals(calendar29.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int31 + "' != '" + 50 + "'", int31 == 50);
        org.junit.Assert.assertNotNull(timeZone32);
        org.junit.Assert.assertEquals(timeZone32.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertEquals("'" + str35 + "' != '" + "PT0S" + "'", str35, "PT0S");
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
        org.junit.Assert.assertTrue("'" + int37 + "' != '" + 0 + "'", int37 == 0);
    }

    @Test
    public void test00408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00408");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("1", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00409");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(chronology7);
        org.joda.time.DateTime dateTime12 = dateTime10.minusSeconds(4);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.DateTime dateTime15 = dateTime12.withMillisOfSecond((int) (byte) 100);
        org.joda.time.DateTime dateTime17 = dateTime12.plusMinutes(1);
        org.joda.time.DateTime.Property property18 = dateTime12.millisOfSecond();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime20 = dateTime12.withYearOfEra((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfEra must be in the range [1,292278993]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(dateTime17);
        org.junit.Assert.assertNotNull(property18);
    }

    @Test
    public void test00410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00410");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval3 = yearMonthDay2.toInterval();
        org.joda.time.Interval interval4 = interval1.gap((org.joda.time.ReadableInterval) interval3);
        boolean boolean6 = interval1.isBefore(100L);
        java.lang.String str7 = interval1.toString();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        org.joda.time.DateTime dateTime20 = new org.joda.time.DateTime((long) (short) 10, chronology18);
        org.joda.time.DateTime dateTime22 = dateTime20.minusMonths(10);
        org.joda.time.Chronology chronology26 = null;
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(chronology26);
        org.joda.time.DateMidnight dateMidnight29 = dateMidnight27.minusDays((int) (short) -1);
        int int30 = dateMidnight29.getYearOfEra();
        org.joda.time.Chronology chronology31 = dateMidnight29.getChronology();
        org.joda.time.MutablePeriod mutablePeriod32 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology31);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime((long) (short) 10, chronology31);
        org.joda.time.DateTime dateTime34 = dateTime22.toDateTime(chronology31);
        org.joda.time.MutablePeriod mutablePeriod35 = new org.joda.time.MutablePeriod((long) 24, (long) '#', chronology31);
        mutablePeriod35.setHours((int) (short) 0);
        org.joda.time.Interval interval38 = interval1.withPeriodBeforeEnd((org.joda.time.ReadablePeriod) mutablePeriod35);
        org.joda.time.Chronology chronology39 = null;
        org.joda.time.DateMidnight dateMidnight40 = new org.joda.time.DateMidnight(chronology39);
        org.joda.time.DateMidnight dateMidnight42 = dateMidnight40.minusDays((int) (short) -1);
        int int43 = dateMidnight42.getYearOfEra();
        org.joda.time.Chronology chronology44 = dateMidnight42.getChronology();
        java.lang.String str45 = chronology44.toString();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate46 = new org.joda.time.LocalDate((java.lang.Object) mutablePeriod35, chronology44);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.MutablePeriod");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertNotNull(interval3);
        org.junit.Assert.assertNull(interval4);
        org.junit.Assert.assertTrue("'" + boolean6 + "' != '" + false + "'", boolean6 == false);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z" + "'", str7, "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z");
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateMidnight29);
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 2022 + "'", int30 == 2022);
        org.junit.Assert.assertNotNull(chronology31);
        org.junit.Assert.assertNotNull(dateTime34);
        org.junit.Assert.assertNotNull(interval38);
        org.junit.Assert.assertNotNull(dateMidnight42);
        org.junit.Assert.assertTrue("'" + int43 + "' != '" + 2022 + "'", int43 == 2022);
        org.junit.Assert.assertNotNull(chronology44);
        org.junit.Assert.assertEquals("'" + str45 + "' != '" + "ISOChronology[Etc/UTC]" + "'", str45, "ISOChronology[Etc/UTC]");
    }

    @Test
    public void test00411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00411");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00412");
        org.joda.time.LocalTime localTime0 = new org.joda.time.LocalTime();
        int int1 = localTime0.getHourOfDay();
        int int2 = localTime0.getHourOfDay();
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 15 + "'", int1 == 15);
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 15 + "'", int2 == 15);
    }

    @Test
    public void test00413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00413");
        org.joda.time.Chronology chronology12 = null;
        org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(chronology12);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.minusDays((int) (short) -1);
        int int16 = dateMidnight15.getYearOfEra();
        org.joda.time.Chronology chronology17 = dateMidnight15.getChronology();
        org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology17);
        org.joda.time.DateTime dateTime19 = new org.joda.time.DateTime((long) (short) 10, chronology17);
        org.joda.time.DateTime dateTime21 = dateTime19.minusMonths(10);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.DateTime dateTime33 = dateTime21.toDateTime(chronology30);
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 24, (long) '#', chronology30);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(31, 22, (int) (byte) 100, (int) 'u', (int) '4', 32769, 59, chronology30);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight15);
        org.junit.Assert.assertTrue("'" + int16 + "' != '" + 2022 + "'", int16 == 2022);
        org.junit.Assert.assertNotNull(chronology17);
        org.junit.Assert.assertNotNull(dateTime21);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test00414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00414");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.dayOfYear();
        org.joda.time.Chronology chronology42 = null;
        org.joda.time.MutablePeriod mutablePeriod43 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology42);
        mutablePeriod43.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod43.add(0L);
        org.joda.time.Chronology chronology52 = null;
        org.joda.time.DateMidnight dateMidnight53 = new org.joda.time.DateMidnight(chronology52);
        org.joda.time.DateMidnight dateMidnight55 = dateMidnight53.minusDays((int) (short) -1);
        int int56 = dateMidnight55.getYearOfEra();
        org.joda.time.Chronology chronology57 = dateMidnight55.getChronology();
        org.joda.time.MutablePeriod mutablePeriod58 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology57);
        mutablePeriod43.add(0L, chronology57);
        org.joda.time.DateMidnight dateMidnight60 = new org.joda.time.DateMidnight((long) (-1), chronology57);
        org.joda.time.Chronology chronology64 = null;
        org.joda.time.DateMidnight dateMidnight65 = new org.joda.time.DateMidnight(chronology64);
        org.joda.time.DateMidnight dateMidnight67 = dateMidnight65.minusDays((int) (short) -1);
        int int68 = dateMidnight67.getYearOfEra();
        org.joda.time.Chronology chronology69 = dateMidnight67.getChronology();
        org.joda.time.MutablePeriod mutablePeriod70 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology69);
        org.joda.time.DateTime dateTime71 = new org.joda.time.DateTime((long) (short) 10, chronology69);
        org.joda.time.MutableDateTime mutableDateTime72 = dateMidnight60.toMutableDateTime(chronology69);
        mutableDateTime72.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property75 = mutableDateTime72.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone76 = null;
        org.joda.time.MutableDateTime mutableDateTime77 = mutableDateTime72.toMutableDateTime(dateTimeZone76);
        org.joda.time.Chronology chronology80 = null;
        org.joda.time.MutablePeriod mutablePeriod81 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology80);
        mutablePeriod81.setPeriod((long) (short) 10, (long) (short) -1);
        int int85 = mutablePeriod81.getMonths();
        mutablePeriod81.addMinutes((int) (short) 0);
        mutableDateTime72.add((org.joda.time.ReadablePeriod) mutablePeriod81, 12);
        mutableDateTime33.setDate((org.joda.time.ReadableInstant) mutableDateTime72);
        mutableDateTime33.setMinuteOfHour(52);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setDayOfMonth((int) '#');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 35 for dayOfMonth must be in the range [1,31]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(dateMidnight55);
        org.junit.Assert.assertTrue("'" + int56 + "' != '" + 2022 + "'", int56 == 2022);
        org.junit.Assert.assertNotNull(chronology57);
        org.junit.Assert.assertNotNull(dateMidnight67);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 2022 + "'", int68 == 2022);
        org.junit.Assert.assertNotNull(chronology69);
        org.junit.Assert.assertNotNull(mutableDateTime72);
        org.junit.Assert.assertNotNull(property75);
        org.junit.Assert.assertNotNull(mutableDateTime77);
        org.junit.Assert.assertTrue("'" + int85 + "' != '" + 0 + "'", int85 == 0);
    }

    @Test
    public void test00415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00415");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        calendar1.setTimeInMillis((-1L));
        boolean boolean7 = calendar1.isSet((int) (short) 0);
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=24,minimalDaysInFirstWeek=4,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
    }

    @Test
    public void test00416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00416");
        java.util.Date date3 = new java.util.Date((-1), (int) (short) 0, 0);
        org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.fromDateFields(date3);
        org.joda.time.LocalTime localTime5 = timeOfDay4.toLocalTime();
        org.joda.time.DateTimeFieldType dateTimeFieldType6 = org.joda.time.DateTimeFieldType.weekyear();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime8 = localTime5.withField(dateTimeFieldType6, 70);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weekyear' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date3.toString(), "Sat Dec 31 00:00:00 GMT+00:00 1898");
        org.junit.Assert.assertNotNull(timeOfDay4);
        org.junit.Assert.assertNotNull(localTime5);
        org.junit.Assert.assertNotNull(dateTimeFieldType6);
    }

    @Test
    public void test00417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00417");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.plusHours(10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay7 = timeOfDay2.withHourOfDay(122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 122 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(timeOfDay5);
    }

    @Test
    public void test00418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00418");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        int int17 = dateTimeField9.getMinimumValue((long) 1);
        long long19 = dateTimeField9.roundHalfFloor((long) 52);
        long long22 = dateTimeField9.getDifferenceAsLong((long) (byte) -1, (long) 2);
        org.joda.time.LocalDate localDate24 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str25 = localDate24.toString();
        int int26 = localDate24.getYearOfEra();
        java.util.Locale locale27 = java.util.Locale.JAPANESE;
        java.util.Set<java.lang.String> strSet28 = locale27.getUnicodeLocaleKeys();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str29 = dateTimeField9.getAsText((org.joda.time.ReadablePartial) localDate24, locale27);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'clockhourOfDay' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 1 + "'", int17 == 1);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 0L + "'", long19 == 0L);
        org.junit.Assert.assertTrue("'" + long22 + "' != '" + 0L + "'", long22 == 0L);
        org.junit.Assert.assertEquals("'" + str25 + "' != '" + "1970-01-01" + "'", str25, "1970-01-01");
        org.junit.Assert.assertTrue("'" + int26 + "' != '" + 1970 + "'", int26 == 1970);
        org.junit.Assert.assertNotNull(locale27);
        org.junit.Assert.assertEquals(locale27.toString(), "ja");
        org.junit.Assert.assertNotNull(strSet28);
    }

    @Test
    public void test00419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00419");
        int int0 = java.util.Calendar.WEEK_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 4 + "'", int0 == 4);
    }

    @Test
    public void test00420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00420");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withChronologyRetainFields(chronology2);
        org.joda.time.DateTime dateTime4 = yearMonthDay0.toDateTimeAtCurrentTime();
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        int int11 = dateMidnight10.getYearOfEra();
        org.joda.time.Chronology chronology12 = dateMidnight10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField15 = chronology12.halfdayOfDay();
        org.joda.time.LocalDate localDate17 = new org.joda.time.LocalDate((long) '#');
        int int18 = dateTimeField15.getMinimumValue((org.joda.time.ReadablePartial) localDate17);
        org.joda.time.Period period19 = new org.joda.time.Period();
        org.joda.time.LocalDate localDate20 = localDate17.plus((org.joda.time.ReadablePeriod) period19);
        org.joda.time.YearMonthDay yearMonthDay21 = yearMonthDay0.minus((org.joda.time.ReadablePeriod) period19);
        java.lang.String str22 = yearMonthDay0.toString();
        org.joda.time.LocalDate localDate23 = yearMonthDay0.toLocalDate();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay25 = yearMonthDay0.withMonthOfYear(122);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 122 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTime4);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeField15);
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 0 + "'", int18 == 0);
        org.junit.Assert.assertNotNull(localDate20);
        org.junit.Assert.assertNotNull(yearMonthDay21);
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "2022-02-21" + "'", str22, "2022-02-21");
        org.junit.Assert.assertNotNull(localDate23);
    }

    @Test
    public void test00421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00421");
        int int0 = org.joda.time.MutableDateTime.ROUND_NONE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00422");
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology9);
        mutablePeriod10.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod10.add(0L);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology24);
        mutablePeriod10.add(0L, chronology24);
        org.joda.time.Period period27 = new org.joda.time.Period((long) 0, (long) 6, chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime28 = new org.joda.time.DateTime(3, 0, 59, 122, (int) (short) 100, chronology24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 122 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(chronology24);
    }

    @Test
    public void test00423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00423");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("15:02:17.234", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00424");
        org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();
        int int1 = dateMidnight0.getMinuteOfDay();
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight0.minusMonths(10);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(chronology6);
        org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((int) (short) -1);
        int int10 = dateMidnight9.getYearOfEra();
        org.joda.time.Chronology chronology11 = dateMidnight9.getChronology();
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology11);
        org.joda.time.DateTimeField dateTimeField13 = chronology11.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusMillis(0);
        int[] intArray18 = new int[] {};
        int int19 = dateTimeField13.getMaximumValue((org.joda.time.ReadablePartial) localDateTime17, intArray18);
        int int21 = dateTimeField13.getMinimumValue((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType22 = dateTimeField13.getType();
        int int23 = dateMidnight0.get(dateTimeFieldType22);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusDays((int) (short) -1);
        long long28 = dateMidnight25.getMillis();
        org.joda.time.DateMidnight dateMidnight30 = dateMidnight25.withMillis((long) 7);
        org.joda.time.Duration duration32 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology33 = null;
        org.joda.time.DateMidnight dateMidnight34 = new org.joda.time.DateMidnight(chronology33);
        org.joda.time.DateMidnight dateMidnight36 = dateMidnight34.minusDays((int) (short) -1);
        long long37 = dateMidnight34.getMillis();
        org.joda.time.PeriodType periodType38 = org.joda.time.PeriodType.days();
        org.joda.time.Period period39 = duration32.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight34, periodType38);
        org.joda.time.MutableDateTime mutableDateTime40 = dateMidnight34.toMutableDateTimeISO();
        int int41 = dateMidnight30.compareTo((org.joda.time.ReadableInstant) mutableDateTime40);
        boolean boolean42 = dateMidnight0.isBefore((org.joda.time.ReadableInstant) mutableDateTime40);
        mutableDateTime40.setMillisOfSecond(70);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime40.setMonthOfYear((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 0 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertTrue("'" + int1 + "' != '" + 0 + "'", int1 == 0);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + 2022 + "'", int10 == 2022);
        org.junit.Assert.assertNotNull(chronology11);
        org.junit.Assert.assertNotNull(dateTimeField13);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(intArray18);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray18), "[]");
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 24 + "'", int19 == 24);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 1 + "'", int21 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 24 + "'", int23 == 24);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertTrue("'" + long28 + "' != '" + 1645401600000L + "'", long28 == 1645401600000L);
        org.junit.Assert.assertNotNull(dateMidnight30);
        org.junit.Assert.assertNotNull(duration32);
        org.junit.Assert.assertNotNull(dateMidnight36);
        org.junit.Assert.assertTrue("'" + long37 + "' != '" + 1645401600000L + "'", long37 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType38);
        org.junit.Assert.assertNotNull(period39);
        org.junit.Assert.assertNotNull(mutableDateTime40);
        org.junit.Assert.assertTrue("'" + int41 + "' != '" + (-1) + "'", int41 == (-1));
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + false + "'", boolean42 == false);
    }

    @Test
    public void test00425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00425");
        int int0 = org.joda.time.YearMonthDay.DAY_OF_MONTH;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 2 + "'", int0 == 2);
    }

    @Test
    public void test00426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00426");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setWeekOfWeekyear((int) (byte) 1);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime33.secondOfMinute();
        org.joda.time.DurationFieldType durationFieldType37 = org.joda.time.DurationFieldType.seconds();
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.DateMidnight dateMidnight42 = new org.joda.time.DateMidnight(chronology41);
        org.joda.time.DateMidnight dateMidnight44 = dateMidnight42.minusDays((int) (short) -1);
        int int45 = dateMidnight44.getYearOfEra();
        org.joda.time.Chronology chronology46 = dateMidnight44.getChronology();
        org.joda.time.MutablePeriod mutablePeriod47 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology46);
        org.joda.time.DateTimeField dateTimeField48 = chronology46.clockhourOfDay();
        org.joda.time.LocalTime localTime49 = new org.joda.time.LocalTime((long) (short) 100, chronology46);
        org.joda.time.DurationField durationField50 = durationFieldType37.getField(chronology46);
        org.joda.time.Chronology chronology51 = null;
        org.joda.time.DateMidnight dateMidnight52 = new org.joda.time.DateMidnight(chronology51);
        org.joda.time.DateMidnight dateMidnight54 = dateMidnight52.minusDays((int) (short) -1);
        int int55 = dateMidnight54.getYearOfEra();
        org.joda.time.Chronology chronology56 = dateMidnight54.getChronology();
        org.joda.time.DateTimeField dateTimeField57 = chronology56.hourOfDay();
        org.joda.time.DurationField durationField58 = durationFieldType37.getField(chronology56);
        org.joda.time.DurationField durationField59 = chronology56.hours();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Interval interval60 = new org.joda.time.Interval((java.lang.Object) property36, chronology56);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No interval converter found for type: org.joda.time.MutableDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(durationFieldType37);
        org.junit.Assert.assertNotNull(dateMidnight44);
        org.junit.Assert.assertTrue("'" + int45 + "' != '" + 2022 + "'", int45 == 2022);
        org.junit.Assert.assertNotNull(chronology46);
        org.junit.Assert.assertNotNull(dateTimeField48);
        org.junit.Assert.assertNotNull(durationField50);
        org.junit.Assert.assertNotNull(dateMidnight54);
        org.junit.Assert.assertTrue("'" + int55 + "' != '" + 2022 + "'", int55 == 2022);
        org.junit.Assert.assertNotNull(chronology56);
        org.junit.Assert.assertNotNull(dateTimeField57);
        org.junit.Assert.assertNotNull(durationField58);
        org.junit.Assert.assertNotNull(durationField59);
    }

    @Test
    public void test00427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00427");
        int int0 = java.util.Calendar.MINUTE;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 12 + "'", int0 == 12);
    }

    @Test
    public void test00428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00428");
        double double0 = java.util.Locale.LanguageRange.MAX_WEIGHT;
        org.junit.Assert.assertTrue("'" + double0 + "' != '" + 1.0d + "'", double0 == 1.0d);
    }

    @Test
    public void test00429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00429");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = chronology7.getZone();
        org.joda.time.DateTimeField dateTimeField11 = chronology7.dayOfMonth();
        org.joda.time.DateTimeZone dateTimeZone14 = null;
        org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime(dateTimeZone14);
        org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property18 = localDateTime15.yearOfEra();
        org.joda.time.LocalDateTime localDateTime19 = property18.withMaximumValue();
        org.joda.time.DateTimeField dateTimeField20 = property18.getField();
        java.util.Locale locale21 = java.util.Locale.PRC;
        java.lang.String str22 = locale21.toLanguageTag();
        java.lang.String str23 = property18.getAsShortText(locale21);
        // The following exception was thrown during execution in test generation
        try {
            long long24 = dateTimeField11.set(14400004L, "1970-01-01", locale21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"1970-01-01\" for dayOfMonth is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeZone10);
        org.junit.Assert.assertNotNull(dateTimeField11);
        org.junit.Assert.assertNotNull(localDateTime17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(locale21);
        org.junit.Assert.assertEquals(locale21.toString(), "zh_CN");
        org.junit.Assert.assertEquals("'" + str22 + "' != '" + "zh-CN" + "'", str22, "zh-CN");
        org.junit.Assert.assertEquals("'" + str23 + "' != '" + "2022" + "'", str23, "2022");
    }

    @Test
    public void test00430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00430");
        org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(dateTimeZone2);
        org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((long) (short) 100, dateTimeZone2);
        org.joda.time.Chronology chronology7 = null;
        org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(chronology7);
        org.joda.time.DateMidnight dateMidnight10 = dateMidnight8.minusDays((int) (short) -1);
        int int11 = dateMidnight10.getYearOfEra();
        org.joda.time.Chronology chronology12 = dateMidnight10.getChronology();
        org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology12);
        org.joda.time.DateTimeField dateTimeField14 = chronology12.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone15 = chronology12.getZone();
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone15);
        long long18 = dateTimeZone2.getMillisKeepLocal(dateTimeZone15, (long) 667);
        long long20 = dateTimeZone2.convertUTCToLocal((long) 100);
        org.junit.Assert.assertNotNull(dateTimeZone2);
        org.junit.Assert.assertNotNull(dateMidnight10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 2022 + "'", int11 == 2022);
        org.junit.Assert.assertNotNull(chronology12);
        org.junit.Assert.assertNotNull(dateTimeField14);
        org.junit.Assert.assertNotNull(dateTimeZone15);
        org.junit.Assert.assertTrue("'" + long18 + "' != '" + 666L + "'", long18 == 666L);
        org.junit.Assert.assertTrue("'" + long20 + "' != '" + 99L + "'", long20 == 99L);
    }

    @Test
    public void test00431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00431");
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod7.add(0L);
        org.joda.time.Chronology chronology16 = null;
        org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(chronology16);
        org.joda.time.DateMidnight dateMidnight19 = dateMidnight17.minusDays((int) (short) -1);
        int int20 = dateMidnight19.getYearOfEra();
        org.joda.time.Chronology chronology21 = dateMidnight19.getChronology();
        org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology21);
        mutablePeriod7.add(0L, chronology21);
        org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight((long) (-1), chronology21);
        org.joda.time.Chronology chronology28 = null;
        org.joda.time.DateMidnight dateMidnight29 = new org.joda.time.DateMidnight(chronology28);
        org.joda.time.DateMidnight dateMidnight31 = dateMidnight29.minusDays((int) (short) -1);
        int int32 = dateMidnight31.getYearOfEra();
        org.joda.time.Chronology chronology33 = dateMidnight31.getChronology();
        org.joda.time.MutablePeriod mutablePeriod34 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology33);
        org.joda.time.DateTime dateTime35 = new org.joda.time.DateTime((long) (short) 10, chronology33);
        org.joda.time.MutableDateTime mutableDateTime36 = dateMidnight24.toMutableDateTime(chronology33);
        org.joda.time.DurationField durationField37 = chronology33.minutes();
        org.joda.time.LocalDate localDate38 = org.joda.time.LocalDate.now(chronology33);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay39 = new org.joda.time.TimeOfDay(2022, (-1), 12, chronology33);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for hourOfDay must not be larger than 23");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight19);
        org.junit.Assert.assertTrue("'" + int20 + "' != '" + 2022 + "'", int20 == 2022);
        org.junit.Assert.assertNotNull(chronology21);
        org.junit.Assert.assertNotNull(dateMidnight31);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 2022 + "'", int32 == 2022);
        org.junit.Assert.assertNotNull(chronology33);
        org.junit.Assert.assertNotNull(mutableDateTime36);
        org.junit.Assert.assertNotNull(durationField37);
        org.junit.Assert.assertNotNull(localDate38);
    }

    @Test
    public void test00432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00432");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("yearOfEra");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"yearOfEra\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00433");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        boolean boolean2 = calendar1.isWeekDateSupported();
        calendar1.roll(0, true);
        int int7 = calendar1.getActualMinimum(1);
        java.lang.String str8 = calendar1.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=0,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=22,MILLISECOND=816,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + boolean2 + "' != '" + true + "'", boolean2 == true);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
// flaky:         org.junit.Assert.assertEquals("'" + str8 + "' != '" + "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=0,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=22,MILLISECOND=816,ZONE_OFFSET=0,DST_OFFSET=0]" + "'", str8, "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=2,minimalDaysInFirstWeek=4,ERA=0,YEAR=2022,MONTH=1,WEEK_OF_YEAR=8,WEEK_OF_MONTH=4,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=22,MILLISECOND=816,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00434");
        java.util.Locale locale0 = java.util.Locale.KOREA;
        java.lang.String str1 = locale0.getCountry();
        java.util.Locale locale2 = java.util.Locale.GERMANY;
        java.lang.String str3 = locale0.getDisplayVariant(locale2);
        java.lang.String str4 = locale2.toString();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str1 + "' != '" + "KR" + "'", str1, "KR");
        org.junit.Assert.assertNotNull(locale2);
        org.junit.Assert.assertEquals(locale2.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str3 + "' != '" + "" + "'", str3, "");
        org.junit.Assert.assertEquals("'" + str4 + "' != '" + "de_DE" + "'", str4, "de_DE");
    }

    @Test
    public void test00435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00435");
        java.util.Set<java.lang.String> strSet0 = org.joda.time.DateTimeZone.getAvailableIDs();
        strSet0.clear();
        org.joda.time.Period period3 = org.joda.time.Period.millis(0);
        org.joda.time.Minutes minutes4 = period3.toStandardMinutes();
        // The following exception was thrown during execution in test generation
        try {
            boolean boolean5 = strSet0.contains((java.lang.Object) period3);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: org.joda.time.Period cannot be cast to java.lang.Comparable");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strSet0);
        org.junit.Assert.assertNotNull(period3);
        org.junit.Assert.assertNotNull(minutes4);
    }

    @Test
    public void test00436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00436");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property36 = mutableDateTime33.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone37 = null;
        org.joda.time.MutableDateTime mutableDateTime38 = mutableDateTime33.toMutableDateTime(dateTimeZone37);
        org.joda.time.Chronology chronology41 = null;
        org.joda.time.MutablePeriod mutablePeriod42 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology41);
        mutablePeriod42.setPeriod((long) (short) 10, (long) (short) -1);
        int int46 = mutablePeriod42.getMonths();
        mutablePeriod42.addMinutes((int) (short) 0);
        mutableDateTime33.add((org.joda.time.ReadablePeriod) mutablePeriod42, 12);
        mutablePeriod42.addMillis(0);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property36);
        org.junit.Assert.assertNotNull(mutableDateTime38);
        org.junit.Assert.assertTrue("'" + int46 + "' != '" + 0 + "'", int46 == 0);
    }

    @Test
    public void test00437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00437");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((-2), (int) 'u', 10, (int) (byte) 100, 9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00438");
        java.util.Date date7 = new java.util.Date((long) 1);
        org.joda.time.YearMonthDay yearMonthDay8 = org.joda.time.YearMonthDay.fromDateFields(date7);
        org.joda.time.YearMonthDay.Property property9 = yearMonthDay8.dayOfMonth();
        org.joda.time.YearMonthDay yearMonthDay10 = property9.getYearMonthDay();
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        org.joda.time.DateTimeField dateTimeField20 = chronology18.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone21 = chronology18.getZone();
        org.joda.time.DateTime dateTime22 = yearMonthDay10.toDateTimeAtCurrentTime(dateTimeZone21);
        boolean boolean24 = dateTimeZone21.isStandardOffset(1645455721906L);
        java.util.TimeZone timeZone25 = dateTimeZone21.toTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime26 = new org.joda.time.DateTime(0, 902, 15, 24, (int) (short) 100, (int) (byte) 10, dateTimeZone21);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(yearMonthDay8);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(yearMonthDay10);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateTimeField20);
        org.junit.Assert.assertNotNull(dateTimeZone21);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertTrue("'" + boolean24 + "' != '" + true + "'", boolean24 == true);
        org.junit.Assert.assertNotNull(timeZone25);
        org.junit.Assert.assertEquals(timeZone25.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
    }

    @Test
    public void test00439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00439");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Duration duration1 = org.joda.time.Duration.parse("CN");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"CN\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00440");
        java.util.Date date1 = new java.util.Date((long) 1);
        org.joda.time.YearMonthDay yearMonthDay2 = org.joda.time.YearMonthDay.fromDateFields(date1);
        int int3 = date1.getHours();
        java.util.Date date7 = new java.util.Date((-1), (int) (short) 0, 0);
        date7.setMonth((int) (short) 10);
        org.joda.time.LocalDate localDate10 = org.joda.time.LocalDate.fromDateFields(date7);
        int int11 = date1.compareTo(date7);
        org.junit.Assert.assertEquals(date1.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(yearMonthDay2);
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 0 + "'", int3 == 0);
        org.junit.Assert.assertEquals(date7.toString(), "Thu Dec 01 00:00:00 GMT+00:00 1898");
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 1 + "'", int11 == 1);
    }

    @Test
    public void test00441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00441");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology9);
        mutablePeriod10.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod10.add(0L);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology24);
        mutablePeriod10.add(0L, chronology24);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (-1), chronology24);
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType5.getField(chronology24);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 21, chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime(2024, 50, 0, (int) (short) 10, chronology24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2024 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField28);
    }

    @Test
    public void test00442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00442");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.monthOfYear();
        org.joda.time.MutableDateTime mutableDateTime39 = property38.roundFloor();
        org.joda.time.DateTimeZone dateTimeZone40 = mutableDateTime39.getZone();
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime39.setMillisOfSecond(2022);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2022 for millisOfSecond must be in the range [0,999]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertNotNull(mutableDateTime39);
        org.junit.Assert.assertNotNull(dateTimeZone40);
    }

    @Test
    public void test00443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00443");
        java.util.Calendar.Builder builder0 = new java.util.Calendar.Builder();
        java.util.Calendar.Builder builder2 = builder0.setInstant(4320000000L);
        java.util.Calendar.Builder builder4 = builder2.setInstant((long) (short) 100);
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(chronology5);
        org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.minusDays((int) (short) -1);
        int int9 = dateMidnight8.getYearOfEra();
        org.joda.time.Chronology chronology10 = dateMidnight8.getChronology();
        long long11 = dateMidnight8.getMillis();
        java.util.Locale locale15 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar16 = dateMidnight8.toCalendar(locale15);
        int int18 = calendar16.getLeastMaximum(3);
        java.util.TimeZone timeZone19 = calendar16.getTimeZone();
        timeZone19.setID("PT0S");
        java.util.TimeZone.setDefault(timeZone19);
        java.util.Calendar.Builder builder23 = builder2.setTimeZone(timeZone19);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Calendar.Builder builder28 = builder23.setTimeOfDay(59, 1969, 9, (int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException; message: instant has been set");
        } catch (java.lang.IllegalStateException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(builder2);
        org.junit.Assert.assertNotNull(builder4);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertTrue("'" + int9 + "' != '" + 2022 + "'", int9 == 2022);
        org.junit.Assert.assertNotNull(chronology10);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + 1645488000000L + "'", long11 == 1645488000000L);
        org.junit.Assert.assertEquals(locale15.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar16);
        org.junit.Assert.assertEquals(calendar16.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int18 + "' != '" + 50 + "'", int18 == 50);
        org.junit.Assert.assertNotNull(timeZone19);
        org.junit.Assert.assertEquals(timeZone19.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(builder23);
    }

    @Test
    public void test00444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00444");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod((long) (short) 10, 0L, chronology2);
        org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object) chronology2);
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay((long) 10, chronology6);
        org.joda.time.DateTimeField[] dateTimeFieldArray8 = timeOfDay7.getFields();
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 10, chronology10);
        org.joda.time.DateTimeField[] dateTimeFieldArray12 = timeOfDay11.getFields();
        org.joda.time.Period period13 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay7, (org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.DateTimeFieldType dateTimeFieldType14 = org.joda.time.DateTimeFieldType.hourOfHalfday();
        boolean boolean15 = timeOfDay11.isSupported(dateTimeFieldType14);
        org.joda.time.Chronology chronology18 = null;
        org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(chronology18);
        org.joda.time.DateMidnight dateMidnight21 = dateMidnight19.minusDays((int) (short) -1);
        int int22 = dateMidnight21.getYearOfEra();
        org.joda.time.Chronology chronology23 = dateMidnight21.getChronology();
        org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology23);
        org.joda.time.DateTimeField dateTimeField25 = chronology23.clockhourOfDay();
        boolean boolean26 = dateTimeFieldType14.isSupported(chronology23);
        boolean boolean27 = localTime4.isSupported(dateTimeFieldType14);
        org.joda.time.LocalTime localTime29 = localTime4.plusHours(11);
        org.joda.time.LocalTime localTime31 = localTime4.withMillisOfDay(0);
        org.joda.time.DateTimeZone dateTimeZone32 = org.joda.time.DateTimeZone.UTC;
        org.joda.time.DateTime dateTime33 = localTime31.toDateTimeToday(dateTimeZone32);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType35 = localTime31.getFieldType(31);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 31");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray8);
        org.junit.Assert.assertNotNull(dateTimeFieldArray12);
        org.junit.Assert.assertNotNull(period13);
        org.junit.Assert.assertNotNull(dateTimeFieldType14);
        org.junit.Assert.assertTrue("'" + boolean15 + "' != '" + false + "'", boolean15 == false);
        org.junit.Assert.assertNotNull(dateMidnight21);
        org.junit.Assert.assertTrue("'" + int22 + "' != '" + 2022 + "'", int22 == 2022);
        org.junit.Assert.assertNotNull(chronology23);
        org.junit.Assert.assertNotNull(dateTimeField25);
        org.junit.Assert.assertTrue("'" + boolean26 + "' != '" + true + "'", boolean26 == true);
        org.junit.Assert.assertTrue("'" + boolean27 + "' != '" + true + "'", boolean27 == true);
        org.junit.Assert.assertNotNull(localTime29);
        org.junit.Assert.assertNotNull(localTime31);
        org.junit.Assert.assertNotNull(dateTimeZone32);
        org.junit.Assert.assertNotNull(dateTime33);
    }

    @Test
    public void test00445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00445");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.year();
        int int17 = localDateTime13.get(dateTimeFieldType16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime13.minusHours(11);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType21 = localDateTime19.getFieldType((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: -2");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(localDateTime19);
    }

    @Test
    public void test00446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00446");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.LocalTime localTime13 = dateTime12.toLocalTime();
        org.joda.time.DateTime.Property property14 = dateTime12.dayOfWeek();
        org.joda.time.DurationField durationField15 = property14.getRangeDurationField();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime17 = property14.addToCopy(1648166400035L);
            org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException; message: Multiplication overflows a long: 1648166400035 * 86400000");
        } catch (java.lang.ArithmeticException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(localTime13);
        org.junit.Assert.assertNotNull(property14);
        org.junit.Assert.assertNotNull(durationField15);
    }

    @Test
    public void test00447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00447");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        java.util.Locale locale10 = new java.util.Locale("Thu Dec 01 00:00:00 UTC 1898", "15:01:52.189", "15:01:52.189");
        java.util.Calendar calendar11 = dateMidnight3.toCalendar(locale10);
        java.util.TimeZone timeZone12 = calendar11.getTimeZone();
        org.joda.time.TimeOfDay timeOfDay13 = org.joda.time.TimeOfDay.fromCalendarFields(calendar11);
        // The following exception was thrown during execution in test generation
        try {
            calendar11.set((int) (short) -1, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000000L + "'", long6 == 1645488000000L);
        org.junit.Assert.assertEquals(locale10.toString(), "thu dec 01 00:00:00 utc 1898_15:01:52.189_15:01:52.189");
        org.junit.Assert.assertNotNull(calendar11);
        org.junit.Assert.assertEquals(calendar11.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone12);
        org.junit.Assert.assertEquals(timeZone12.getDisplayName(), "\u5354\u5b9a\u4e16\u754c\u6642");
        org.junit.Assert.assertNotNull(timeOfDay13);
    }

    @Test
    public void test00448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00448");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusSeconds(2);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        long long14 = dateMidnight11.getMillis();
        org.joda.time.DateMidnight.Property property15 = dateMidnight11.weekyear();
        org.joda.time.DateMidnight dateMidnight16 = property15.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight17 = property15.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime7.withField(dateTimeFieldType18, 32769);
        org.joda.time.LocalDateTime.Property property21 = localDateTime7.year();
        org.joda.time.LocalDateTime.Property property22 = localDateTime7.yearOfCentury();
        org.joda.time.LocalDateTime.Property property23 = localDateTime7.minuteOfHour();
        org.joda.time.LocalDateTime.Property property24 = localDateTime7.millisOfDay();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay25 = new org.joda.time.YearMonthDay((java.lang.Object) property24);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDateTime$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology13);
        org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1645488000000L + "'", long14 == 1645488000000L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(property21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(property23);
        org.junit.Assert.assertNotNull(property24);
    }

    @Test
    public void test00449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00449");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        org.joda.time.LocalDate localDate4 = property3.getLocalDate();
        org.joda.time.Chronology chronology14 = null;
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology14);
        mutablePeriod15.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod15.add(0L);
        org.joda.time.Chronology chronology24 = null;
        org.joda.time.DateMidnight dateMidnight25 = new org.joda.time.DateMidnight(chronology24);
        org.joda.time.DateMidnight dateMidnight27 = dateMidnight25.minusDays((int) (short) -1);
        int int28 = dateMidnight27.getYearOfEra();
        org.joda.time.Chronology chronology29 = dateMidnight27.getChronology();
        org.joda.time.MutablePeriod mutablePeriod30 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology29);
        mutablePeriod15.add(0L, chronology29);
        org.joda.time.Period period32 = new org.joda.time.Period((long) 0, (long) 6, chronology29);
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(2, 12, (int) (short) 10, 3, (int) (byte) 1, chronology29);
        org.joda.time.LocalDate localDate34 = org.joda.time.LocalDate.now(chronology29);
        org.joda.time.MutableDateTime mutableDateTime35 = org.joda.time.MutableDateTime.now(chronology29);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay36 = new org.joda.time.YearMonthDay((java.lang.Object) property3, chronology29);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: org.joda.time.LocalDate$Property");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertNotNull(localDate4);
        org.junit.Assert.assertNotNull(dateMidnight27);
        org.junit.Assert.assertTrue("'" + int28 + "' != '" + 2022 + "'", int28 == 2022);
        org.junit.Assert.assertNotNull(chronology29);
        org.junit.Assert.assertNotNull(localDate34);
        org.junit.Assert.assertNotNull(mutableDateTime35);
    }

    @Test
    public void test00450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00450");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime1 = org.joda.time.LocalDateTime.parse("+00:00");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Invalid format: \"+00:00\" is malformed at \":00\"");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00451");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime15 = dateTime14.withTimeAtStartOfDay();
        org.joda.time.LocalTime localTime16 = dateTime14.toLocalTime();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str18 = localTime16.toString("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: i");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertNotNull(localTime16);
    }

    @Test
    public void test00452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00452");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setMinimalDaysInFirstWeek((int) (short) 1);
        calendar1.setFirstDayOfWeek(11);
        calendar1.setMinimalDaysInFirstWeek(363);
        java.util.TimeZone timeZone8 = calendar1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = calendar1.getActualMaximum(100);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: Array index out of range: 100");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=1645455744060,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=11,minimalDaysInFirstWeek=363,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=21,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=15,MINUTE=2,SECOND=24,MILLISECOND=60,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone8);
        org.junit.Assert.assertEquals(timeZone8.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00453");
        java.util.Date date3 = new java.util.Date((-1), (int) (short) 0, 0);
        date3.setMonth((int) (short) 10);
        org.joda.time.LocalDateTime localDateTime6 = org.joda.time.LocalDateTime.fromDateFields(date3);
        int int7 = date3.getYear();
        date3.setMonth((int) (short) 10);
        date3.setTime(0L);
        org.junit.Assert.assertEquals(date3.toString(), "Thu Jan 01 00:00:00 GMT+00:00 1970");
        org.junit.Assert.assertNotNull(localDateTime6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + (-2) + "'", int7 == (-2));
    }

    @Test
    public void test00454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00454");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime(dateTimeZone0);
        int int2 = localTime1.size();
        org.junit.Assert.assertTrue("'" + int2 + "' != '" + 4 + "'", int2 == 4);
    }

    @Test
    public void test00455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00455");
        org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(dateTimeZone1);
        int int4 = dateTimeZone1.getOffsetFromLocal((long) (short) -1);
        java.lang.String str5 = dateTimeZone1.getID();
        org.joda.time.YearMonthDay yearMonthDay6 = new org.joda.time.YearMonthDay(dateTimeZone1);
        org.joda.time.DurationFieldType durationFieldType7 = org.joda.time.DurationFieldType.weeks();
        org.joda.time.DateTimeZone dateTimeZone8 = null;
        org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime(dateTimeZone8);
        org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime.Property property12 = localDateTime9.yearOfEra();
        org.joda.time.LocalDateTime localDateTime13 = property12.withMaximumValue();
        org.joda.time.LocalDateTime localDateTime14 = property12.roundHalfFloorCopy();
        org.joda.time.Chronology chronology17 = null;
        org.joda.time.DateMidnight dateMidnight18 = new org.joda.time.DateMidnight(chronology17);
        org.joda.time.DateMidnight dateMidnight20 = dateMidnight18.minusDays((int) (short) -1);
        int int21 = dateMidnight20.getYearOfEra();
        org.joda.time.Chronology chronology22 = dateMidnight20.getChronology();
        org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology22);
        org.joda.time.DateTimeField dateTimeField24 = chronology22.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone25 = null;
        org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime(dateTimeZone25);
        org.joda.time.LocalDateTime localDateTime28 = localDateTime26.plusMillis(0);
        int[] intArray29 = new int[] {};
        int int30 = dateTimeField24.getMaximumValue((org.joda.time.ReadablePartial) localDateTime28, intArray29);
        int int32 = dateTimeField24.getMinimumValue((long) 1);
        org.joda.time.DateTimeFieldType dateTimeFieldType33 = dateTimeField24.getType();
        boolean boolean34 = localDateTime14.isSupported(dateTimeFieldType33);
        org.joda.time.Chronology chronology35 = localDateTime14.getChronology();
        boolean boolean36 = durationFieldType7.isSupported(chronology35);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay38 = yearMonthDay6.withFieldAdded(durationFieldType7, 59);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Field 'weeks' is not supported");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone1);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + (-1) + "'", int4 == (-1));
        org.junit.Assert.assertEquals("'" + str5 + "' != '" + "-00:00:00.001" + "'", str5, "-00:00:00.001");
        org.junit.Assert.assertNotNull(durationFieldType7);
        org.junit.Assert.assertNotNull(localDateTime11);
        org.junit.Assert.assertNotNull(property12);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(localDateTime14);
        org.junit.Assert.assertNotNull(dateMidnight20);
        org.junit.Assert.assertTrue("'" + int21 + "' != '" + 2022 + "'", int21 == 2022);
        org.junit.Assert.assertNotNull(chronology22);
        org.junit.Assert.assertNotNull(dateTimeField24);
        org.junit.Assert.assertNotNull(localDateTime28);
        org.junit.Assert.assertNotNull(intArray29);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray29), "[]");
        org.junit.Assert.assertTrue("'" + int30 + "' != '" + 24 + "'", int30 == 24);
        org.junit.Assert.assertTrue("'" + int32 + "' != '" + 1 + "'", int32 == 1);
        org.junit.Assert.assertNotNull(dateTimeFieldType33);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + true + "'", boolean34 == true);
        org.junit.Assert.assertNotNull(chronology35);
        org.junit.Assert.assertTrue("'" + boolean36 + "' != '" + true + "'", boolean36 == true);
    }

    @Test
    public void test00456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00456");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay();
        org.joda.time.DateTime dateTime10 = yearMonthDay9.toDateTimeAtMidnight();
        org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadablePeriod) period8, (org.joda.time.ReadableInstant) dateTime10);
        java.lang.String str12 = interval11.toString();
        org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval14 = yearMonthDay13.toInterval();
        org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval16 = yearMonthDay15.toInterval();
        org.joda.time.Interval interval17 = interval14.gap((org.joda.time.ReadableInterval) interval16);
        boolean boolean19 = interval14.isBefore(100L);
        java.lang.String str20 = interval14.toString();
        boolean boolean21 = interval11.isBefore((org.joda.time.ReadableInterval) interval14);
        org.joda.time.Chronology chronology22 = interval11.getChronology();
        org.joda.time.YearMonthDay yearMonthDay23 = new org.joda.time.YearMonthDay(chronology22);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTimeFieldType dateTimeFieldType25 = yearMonthDay23.getFieldType(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: 32769");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645401600000L + "'", long6 == 1645401600000L);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(dateTime10);
        org.junit.Assert.assertEquals("'" + str12 + "' != '" + "2022-02-21T00:00:00.000Z/2022-02-21T00:00:00.000Z" + "'", str12, "2022-02-21T00:00:00.000Z/2022-02-21T00:00:00.000Z");
        org.junit.Assert.assertNotNull(interval14);
        org.junit.Assert.assertNotNull(interval16);
        org.junit.Assert.assertNull(interval17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertEquals("'" + str20 + "' != '" + "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z" + "'", str20, "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z");
        org.junit.Assert.assertTrue("'" + boolean21 + "' != '" + true + "'", boolean21 == true);
        org.junit.Assert.assertNotNull(chronology22);
    }

    @Test
    public void test00457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00457");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("02:02:04.911", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00458");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        calendar1.setTimeInMillis((-1L));
        java.util.TimeZone timeZone6 = calendar1.getTimeZone();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone13 = null;
        org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.withZoneRetainFields(dateTimeZone13);
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(chronology15);
        org.joda.time.DateMidnight dateMidnight18 = dateMidnight16.minusDays((int) (short) -1);
        int int19 = dateMidnight18.getYearOfEra();
        org.joda.time.Chronology chronology20 = dateMidnight18.getChronology();
        long long21 = dateMidnight18.getMillis();
        org.joda.time.ReadableDuration readableDuration22 = null;
        org.joda.time.ReadableInstant readableInstant23 = null;
        org.joda.time.Period period24 = new org.joda.time.Period(readableDuration22, readableInstant23);
        org.joda.time.PeriodType periodType25 = period24.getPeriodType();
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateMidnight14, (org.joda.time.ReadableInstant) dateMidnight18, periodType25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight18.withWeekyear(59);
        java.util.Locale locale31 = new java.util.Locale("PeriodType[Standard]", "");
        java.util.Calendar calendar32 = dateMidnight18.toCalendar(locale31);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str33 = calendar1.getDisplayName((int) (byte) 1, 24, locale31);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: null");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=24,minimalDaysInFirstWeek=4,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertNotNull(dateMidnight14);
        org.junit.Assert.assertNotNull(dateMidnight18);
        org.junit.Assert.assertTrue("'" + int19 + "' != '" + 2022 + "'", int19 == 2022);
        org.junit.Assert.assertNotNull(chronology20);
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1645488000000L + "'", long21 == 1645488000000L);
        org.junit.Assert.assertNotNull(periodType25);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertEquals(locale31.toString(), "periodtype[standard]");
        org.junit.Assert.assertNotNull(calendar32);
        org.junit.Assert.assertEquals(calendar32.toString(), "java.util.GregorianCalendar[time=1645488000000,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=Etc/UTC,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=1,minimalDaysInFirstWeek=1,ERA=1,YEAR=2022,MONTH=1,WEEK_OF_YEAR=9,WEEK_OF_MONTH=4,DAY_OF_MONTH=22,DAY_OF_YEAR=53,DAY_OF_WEEK=3,DAY_OF_WEEK_IN_MONTH=4,AM_PM=0,HOUR=0,HOUR_OF_DAY=0,MINUTE=0,SECOND=0,MILLISECOND=0,ZONE_OFFSET=0,DST_OFFSET=0]");
    }

    @Test
    public void test00459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00459");
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(9, 1, 7, 1970);
        int int5 = mutablePeriod4.getMonths();
        org.junit.Assert.assertTrue("'" + int5 + "' != '" + 0 + "'", int5 == 0);
    }

    @Test
    public void test00460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00460");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeField dateTimeField10 = chronology7.halfdayOfDay();
        org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long) '#');
        int int13 = dateTimeField10.getMinimumValue((org.joda.time.ReadablePartial) localDate12);
        org.joda.time.LocalDate localDate15 = localDate12.withYearOfEra((int) '4');
        org.joda.time.DateTimeField dateTimeField17 = localDate12.getField((int) (byte) 0);
        org.joda.time.LocalDate localDate19 = localDate12.plusYears(8);
        org.joda.time.LocalDate localDate21 = localDate12.withYearOfCentury(0);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology25);
        mutablePeriod26.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod26.add(0L);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        mutablePeriod26.add(0L, chronology40);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (-1), chronology40);
        org.joda.time.Chronology chronology47 = null;
        org.joda.time.DateMidnight dateMidnight48 = new org.joda.time.DateMidnight(chronology47);
        org.joda.time.DateMidnight dateMidnight50 = dateMidnight48.minusDays((int) (short) -1);
        int int51 = dateMidnight50.getYearOfEra();
        org.joda.time.Chronology chronology52 = dateMidnight50.getChronology();
        org.joda.time.MutablePeriod mutablePeriod53 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology52);
        org.joda.time.DateTime dateTime54 = new org.joda.time.DateTime((long) (short) 10, chronology52);
        org.joda.time.MutableDateTime mutableDateTime55 = dateMidnight43.toMutableDateTime(chronology52);
        mutableDateTime55.addSeconds(1970);
        org.joda.time.MutableDateTime.Property property58 = mutableDateTime55.millisOfDay();
        org.joda.time.DateTimeZone dateTimeZone59 = null;
        org.joda.time.MutableDateTime mutableDateTime60 = mutableDateTime55.toMutableDateTime(dateTimeZone59);
        org.joda.time.Chronology chronology63 = null;
        org.joda.time.MutablePeriod mutablePeriod64 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology63);
        mutablePeriod64.setPeriod((long) (short) 10, (long) (short) -1);
        int int68 = mutablePeriod64.getMonths();
        mutablePeriod64.addMinutes((int) (short) 0);
        mutableDateTime55.add((org.joda.time.ReadablePeriod) mutablePeriod64, 12);
        org.joda.time.LocalDate localDate73 = localDate12.minus((org.joda.time.ReadablePeriod) mutablePeriod64);
        int int74 = mutablePeriod64.size();
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(dateTimeField10);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 0 + "'", int13 == 0);
        org.junit.Assert.assertNotNull(localDate15);
        org.junit.Assert.assertNotNull(dateTimeField17);
        org.junit.Assert.assertNotNull(localDate19);
        org.junit.Assert.assertNotNull(localDate21);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2022 + "'", int39 == 2022);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateMidnight50);
        org.junit.Assert.assertTrue("'" + int51 + "' != '" + 2022 + "'", int51 == 2022);
        org.junit.Assert.assertNotNull(chronology52);
        org.junit.Assert.assertNotNull(mutableDateTime55);
        org.junit.Assert.assertNotNull(property58);
        org.junit.Assert.assertNotNull(mutableDateTime60);
        org.junit.Assert.assertTrue("'" + int68 + "' != '" + 0 + "'", int68 == 0);
        org.junit.Assert.assertNotNull(localDate73);
        org.junit.Assert.assertTrue("'" + int74 + "' != '" + 8 + "'", int74 == 8);
    }

    @Test
    public void test00461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00461");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        java.util.GregorianCalendar gregorianCalendar4 = dateMidnight1.toGregorianCalendar();
        org.joda.time.TimeOfDay timeOfDay5 = org.joda.time.TimeOfDay.fromCalendarFields((java.util.Calendar) gregorianCalendar4);
        java.util.Locale locale7 = java.util.Locale.KOREA;
        java.lang.String str8 = locale7.getCountry();
        java.util.Locale locale9 = java.util.Locale.GERMANY;
        java.lang.String str10 = locale7.getDisplayVariant(locale9);
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str11 = timeOfDay5.toString("Sat Dec 31 00:00:00 UTC 1898", locale7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal pattern component: t");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(gregorianCalendar4);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(locale7);
        org.junit.Assert.assertEquals(locale7.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str8 + "' != '" + "KR" + "'", str8, "KR");
        org.junit.Assert.assertNotNull(locale9);
        org.junit.Assert.assertEquals(locale9.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str10 + "' != '" + "" + "'", str10, "");
    }

    @Test
    public void test00462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00462");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setVariant("ISOChronology[Etc/UTC]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: ISOChronology[Etc/UTC] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00463");
        org.joda.time.DateTimeZone dateTimeZone4 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate5 = org.joda.time.LocalDate.now(dateTimeZone4);
        org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone4);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(14, 100, (int) 'u', dateTimeZone4);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 100 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeZone4);
        org.junit.Assert.assertNotNull(localDate5);
        org.junit.Assert.assertNotNull(dateTime6);
    }

    @Test
    public void test00464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00464");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.property(dateTimeFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = property17.set(9);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 9 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
    }

    @Test
    public void test00465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00465");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusSeconds(2);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfCentury();
        // The following exception was thrown during execution in test generation
        try {
            int int10 = localDateTime7.getValue(32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException; message: Invalid index: 32769");
        } catch (java.lang.IndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
    }

    @Test
    public void test00466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00466");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = timeOfDay2.getFields();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) 10, chronology5);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = timeOfDay6.getFields();
        org.joda.time.Period period8 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay2, (org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.Chronology chronology10 = null;
        org.joda.time.TimeOfDay timeOfDay11 = new org.joda.time.TimeOfDay((long) 10, chronology10);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray12 = timeOfDay11.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay14 = timeOfDay11.plusSeconds((int) '4');
        int int15 = timeOfDay2.compareTo((org.joda.time.ReadablePartial) timeOfDay11);
        org.joda.time.TimeOfDay timeOfDay17 = timeOfDay2.withMillisOfSecond(1);
        org.joda.time.TimeOfDay.Property property18 = timeOfDay2.secondOfMinute();
        org.joda.time.TimeOfDay timeOfDay20 = property18.addToCopy((int) (byte) 0);
        org.joda.time.DateTimeFieldType dateTimeFieldType21 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology25);
        mutablePeriod26.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod26.add(0L);
        org.joda.time.Chronology chronology35 = null;
        org.joda.time.DateMidnight dateMidnight36 = new org.joda.time.DateMidnight(chronology35);
        org.joda.time.DateMidnight dateMidnight38 = dateMidnight36.minusDays((int) (short) -1);
        int int39 = dateMidnight38.getYearOfEra();
        org.joda.time.Chronology chronology40 = dateMidnight38.getChronology();
        org.joda.time.MutablePeriod mutablePeriod41 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology40);
        mutablePeriod26.add(0L, chronology40);
        org.joda.time.DateMidnight dateMidnight43 = new org.joda.time.DateMidnight((long) (-1), chronology40);
        org.joda.time.DateTimeField dateTimeField44 = dateTimeFieldType21.getField(chronology40);
        org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.days();
        org.joda.time.Period period47 = new org.joda.time.Period(1645488000000L, periodType46);
        org.joda.time.Period period48 = period47.normalizedStandard();
        int int49 = period48.getSeconds();
        int[] intArray51 = chronology40.get((org.joda.time.ReadablePeriod) period48, (long) (short) 0);
        org.joda.time.TimeOfDay timeOfDay52 = timeOfDay20.plus((org.joda.time.ReadablePeriod) period48);
        org.joda.time.TimeOfDay timeOfDay54 = timeOfDay20.withMinuteOfHour(0);
        org.joda.time.TimeOfDay timeOfDay56 = timeOfDay20.withSecondOfMinute(7);
        org.joda.time.TimeOfDay.Property property57 = timeOfDay56.hourOfDay();
        java.util.Locale locale59 = java.util.Locale.KOREAN;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.TimeOfDay timeOfDay60 = property57.setCopy("24", locale59);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 24 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray12);
        org.junit.Assert.assertNotNull(timeOfDay14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 0 + "'", int15 == 0);
        org.junit.Assert.assertNotNull(timeOfDay17);
        org.junit.Assert.assertNotNull(property18);
        org.junit.Assert.assertNotNull(timeOfDay20);
        org.junit.Assert.assertNotNull(dateTimeFieldType21);
        org.junit.Assert.assertNotNull(dateMidnight38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 2022 + "'", int39 == 2022);
        org.junit.Assert.assertNotNull(chronology40);
        org.junit.Assert.assertNotNull(dateTimeField44);
        org.junit.Assert.assertNotNull(periodType46);
        org.junit.Assert.assertNotNull(period48);
        org.junit.Assert.assertTrue("'" + int49 + "' != '" + 0 + "'", int49 == 0);
        org.junit.Assert.assertNotNull(intArray51);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray51), "[0, 0, 0, 0, 0, 0, 0, 0]");
        org.junit.Assert.assertNotNull(timeOfDay52);
        org.junit.Assert.assertNotNull(timeOfDay54);
        org.junit.Assert.assertNotNull(timeOfDay56);
        org.junit.Assert.assertNotNull(property57);
        org.junit.Assert.assertNotNull(locale59);
        org.junit.Assert.assertEquals(locale59.toString(), "ko");
    }

    @Test
    public void test00467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00467");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        int int15 = dateTime14.getMonthOfYear();
        org.joda.time.DateTime.Property property16 = dateTime14.monthOfYear();
        org.joda.time.LocalDateTime localDateTime17 = dateTime14.toLocalDateTime();
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 12 + "'", int15 == 12);
        org.junit.Assert.assertNotNull(property16);
        org.junit.Assert.assertNotNull(localDateTime17);
    }

    @Test
    public void test00468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00468");
        org.joda.time.format.PeriodFormatter periodFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period2 = org.joda.time.Period.parse("02:02:04.911", periodFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00469");
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        int int6 = dateMidnight5.getYearOfEra();
        org.joda.time.Chronology chronology7 = dateMidnight5.getChronology();
        org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology7);
        org.joda.time.DateTimeField dateTimeField9 = chronology7.clockhourOfDay();
        org.joda.time.DateTimeZone dateTimeZone10 = null;
        org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime(dateTimeZone10);
        org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusMillis(0);
        int[] intArray14 = new int[] {};
        int int15 = dateTimeField9.getMaximumValue((org.joda.time.ReadablePartial) localDateTime13, intArray14);
        org.joda.time.DateTimeZone dateTimeZone16 = null;
        org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime(dateTimeZone16);
        org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime21 = localDateTime17.plusMonths(31);
        org.joda.time.LocalDateTime.Property property22 = localDateTime17.centuryOfEra();
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.TimeOfDay timeOfDay26 = new org.joda.time.TimeOfDay((long) 10, chronology25);
        org.joda.time.DateTimeField[] dateTimeFieldArray27 = timeOfDay26.getFields();
        org.joda.time.Chronology chronology29 = null;
        org.joda.time.TimeOfDay timeOfDay30 = new org.joda.time.TimeOfDay((long) 10, chronology29);
        org.joda.time.DateTimeField[] dateTimeFieldArray31 = timeOfDay30.getFields();
        org.joda.time.Period period32 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay26, (org.joda.time.ReadablePartial) timeOfDay30);
        int[] intArray33 = timeOfDay30.getValues();
        // The following exception was thrown during execution in test generation
        try {
            int[] intArray35 = dateTimeField9.addWrapField((org.joda.time.ReadablePartial) localDateTime17, (int) (byte) -1, intArray33, 13);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -1");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertTrue("'" + int6 + "' != '" + 2022 + "'", int6 == 2022);
        org.junit.Assert.assertNotNull(chronology7);
        org.junit.Assert.assertNotNull(dateTimeField9);
        org.junit.Assert.assertNotNull(localDateTime13);
        org.junit.Assert.assertNotNull(intArray14);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray14), "[]");
        org.junit.Assert.assertTrue("'" + int15 + "' != '" + 24 + "'", int15 == 24);
        org.junit.Assert.assertNotNull(localDateTime19);
        org.junit.Assert.assertNotNull(localDateTime21);
        org.junit.Assert.assertNotNull(property22);
        org.junit.Assert.assertNotNull(dateTimeFieldArray27);
        org.junit.Assert.assertNotNull(dateTimeFieldArray31);
        org.junit.Assert.assertNotNull(period32);
        org.junit.Assert.assertNotNull(intArray33);
// flaky:         org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray33), "[0, 0, 0, 9]");
    }

    @Test
    public void test00470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00470");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder0.setLanguage("1970-01-01T00:00:00.000-00:00:00.001/1970-01-02T00:00:00.000-00:00:00.001");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed language: 1970-01-01T00:00:00.000-00:00:00.001/1970-01-02T00:00:00.000-00:00:00.001 [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00471");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        calendar1.setTimeInMillis((-1L));
        java.util.TimeZone timeZone6 = calendar1.getTimeZone();
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str9 = timeZone6.getDisplayName(true, 667);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Illegal style: 667");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
        org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=-1,areFieldsSet=true,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=24,minimalDaysInFirstWeek=4,ERA=1,YEAR=1969,MONTH=11,WEEK_OF_YEAR=1,WEEK_OF_MONTH=5,DAY_OF_MONTH=31,DAY_OF_YEAR=365,DAY_OF_WEEK=4,DAY_OF_WEEK_IN_MONTH=5,AM_PM=1,HOUR=11,HOUR_OF_DAY=23,MINUTE=59,SECOND=59,MILLISECOND=999,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertNotNull(timeZone6);
        org.junit.Assert.assertEquals(timeZone6.getDisplayName(), "GMT+00:00");
    }

    @Test
    public void test00472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00472");
        java.util.Locale locale0 = java.util.Locale.GERMAN;
        java.util.Calendar calendar1 = java.util.Calendar.getInstance(locale0);
        calendar1.setFirstDayOfWeek(24);
        calendar1.set(100, (int) (byte) -1, 6, 50, 22, 2022);
        int int11 = calendar1.getMinimalDaysInFirstWeek();
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "de");
        org.junit.Assert.assertNotNull(calendar1);
// flaky:         org.junit.Assert.assertEquals(calendar1.toString(), "java.util.GregorianCalendar[time=?,areFieldsSet=false,areAllFieldsSet=true,lenient=true,zone=java.util.SimpleTimeZone[id=PT0S,offset=0,dstSavings=3600000,useDaylight=false,startYear=0,startMode=0,startMonth=0,startDay=0,startDayOfWeek=0,startTime=0,startTimeMode=0,endMode=0,endMonth=0,endDay=0,endDayOfWeek=0,endTime=0,endTimeMode=0],firstDayOfWeek=24,minimalDaysInFirstWeek=4,ERA=1,YEAR=100,MONTH=-1,WEEK_OF_YEAR=7,WEEK_OF_MONTH=3,DAY_OF_MONTH=6,DAY_OF_YEAR=52,DAY_OF_WEEK=2,DAY_OF_WEEK_IN_MONTH=3,AM_PM=1,HOUR=3,HOUR_OF_DAY=50,MINUTE=22,SECOND=2022,MILLISECOND=830,ZONE_OFFSET=0,DST_OFFSET=0]");
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 4 + "'", int11 == 4);
    }

    @Test
    public void test00473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00473");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        int int4 = localDate1.getCenturyOfEra();
        org.joda.time.DateTime dateTime5 = localDate1.toDateTimeAtCurrentTime();
        org.joda.time.LocalDate.Property property6 = localDate1.year();
        int int7 = localDate1.getMonthOfYear();
        int int8 = localDate1.getYearOfCentury();
        org.joda.time.LocalDate.Property property9 = localDate1.centuryOfEra();
        org.joda.time.LocalDate localDate10 = property9.withMinimumValue();
        int int11 = localDate10.getYearOfCentury();
        org.joda.time.Chronology chronology15 = null;
        org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology15);
        mutablePeriod16.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod16.add(0L);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        mutablePeriod16.add(0L, chronology30);
        org.joda.time.DateMidnight dateMidnight33 = new org.joda.time.DateMidnight((long) (-1), chronology30);
        org.joda.time.DurationField durationField34 = chronology30.weeks();
        org.joda.time.DateTimeField dateTimeField35 = chronology30.hourOfHalfday();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate36 = new org.joda.time.LocalDate((java.lang.Object) int11, chronology30);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.lang.Integer");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(dateTime5);
        org.junit.Assert.assertNotNull(property6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 1 + "'", int7 == 1);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 70 + "'", int8 == 70);
        org.junit.Assert.assertNotNull(property9);
        org.junit.Assert.assertNotNull(localDate10);
        org.junit.Assert.assertTrue("'" + int11 + "' != '" + 70 + "'", int11 == 70);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(durationField34);
        org.junit.Assert.assertNotNull(dateTimeField35);
    }

    @Test
    public void test00474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00474");
        java.util.Locale locale0 = java.util.Locale.CHINA;
        // The following exception was thrown during execution in test generation
        try {
            java.lang.String str2 = locale0.getUnicodeLocaleType("2022-02-21");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: Ill-formed Unicode locale key: 2022-02-21");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale0);
        org.junit.Assert.assertEquals(locale0.toString(), "zh_CN");
    }

    @Test
    public void test00475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00475");
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.LanguageRange languageRange2 = new java.util.Locale.LanguageRange("millisOfDay", (double) 32769);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: weight=32769.0");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00476");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withCenturyOfEra(1970);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime5.withYear(52);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime9 = localDateTime7.withYearOfCentury((int) 'u');
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 117 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
    }

    @Test
    public void test00477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00477");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        org.joda.time.DurationField durationField6 = chronology5.minutes();
        int int8 = durationField6.getValue((long) 6);
        long long11 = durationField6.add((-2240611200000L), 446);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
        org.junit.Assert.assertNotNull(durationField6);
        org.junit.Assert.assertTrue("'" + int8 + "' != '" + 0 + "'", int8 == 0);
        org.junit.Assert.assertTrue("'" + long11 + "' != '" + (-2240584440000L) + "'", long11 == (-2240584440000L));
    }

    @Test
    public void test00478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00478");
        java.util.Date date5 = new java.util.Date((int) (short) 0, 11, (int) (short) 0, (int) (short) -1, (int) (byte) 10);
        java.util.Date date7 = new java.util.Date((long) 1);
        date7.setSeconds(7);
        int int10 = date5.compareTo(date7);
        org.junit.Assert.assertEquals(date5.toString(), "Thu Nov 29 23:10:00 GMT+00:00 1900");
        org.junit.Assert.assertEquals(date7.toString(), "Thu Jan 01 00:00:07 GMT+00:00 1970");
        org.junit.Assert.assertTrue("'" + int10 + "' != '" + (-1) + "'", int10 == (-1));
    }

    @Test
    public void test00479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00479");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        org.joda.time.LocalDate.Property property3 = localDate1.weekyear();
        int int4 = localDate1.getCenturyOfEra();
        org.joda.time.LocalDate.Property property5 = localDate1.weekOfWeekyear();
        org.joda.time.DurationFieldType durationFieldType6 = org.joda.time.DurationFieldType.weekyears();
        boolean boolean7 = localDate1.isSupported(durationFieldType6);
        org.joda.time.LocalDate.Property property8 = localDate1.monthOfYear();
        java.util.Locale locale10 = java.util.Locale.KOREA;
        java.lang.String str11 = locale10.getCountry();
        java.util.Locale locale12 = java.util.Locale.GERMANY;
        java.lang.String str13 = locale10.getDisplayVariant(locale12);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate14 = property8.setCopy("0", locale12);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value \"0\" for monthOfYear is not supported");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertNotNull(property3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 19 + "'", int4 == 19);
        org.junit.Assert.assertNotNull(property5);
        org.junit.Assert.assertNotNull(durationFieldType6);
        org.junit.Assert.assertTrue("'" + boolean7 + "' != '" + true + "'", boolean7 == true);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(locale10);
        org.junit.Assert.assertEquals(locale10.toString(), "ko_KR");
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "KR" + "'", str11, "KR");
        org.junit.Assert.assertNotNull(locale12);
        org.junit.Assert.assertEquals(locale12.toString(), "de_DE");
        org.junit.Assert.assertEquals("'" + str13 + "' != '" + "" + "'", str13, "");
    }

    @Test
    public void test00480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00480");
        int int0 = java.util.TimeZone.SHORT;
        org.junit.Assert.assertTrue("'" + int0 + "' != '" + 0 + "'", int0 == 0);
    }

    @Test
    public void test00481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00481");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime dateTime15 = dateTime14.withTimeAtStartOfDay();
        boolean boolean16 = dateTime15.isBeforeNow();
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(dateTime15);
        org.junit.Assert.assertTrue("'" + boolean16 + "' != '" + true + "'", boolean16 == true);
    }

    @Test
    public void test00482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00482");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeField[] dateTimeFieldArray3 = timeOfDay2.getFields();
        org.joda.time.Chronology chronology5 = null;
        org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((long) 10, chronology5);
        org.joda.time.DateTimeField[] dateTimeFieldArray7 = timeOfDay6.getFields();
        org.joda.time.Period period8 = org.joda.time.Period.fieldDifference((org.joda.time.ReadablePartial) timeOfDay2, (org.joda.time.ReadablePartial) timeOfDay6);
        org.joda.time.Period period10 = period8.minusMinutes(0);
        org.joda.time.Period period12 = period10.minusHours((int) (short) 0);
        int[] intArray13 = period12.getValues();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Period period15 = period12.withMonths(4);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException; message: Field is not supported");
        } catch (java.lang.UnsupportedOperationException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldArray3);
        org.junit.Assert.assertNotNull(dateTimeFieldArray7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(period10);
        org.junit.Assert.assertNotNull(period12);
        org.junit.Assert.assertNotNull(intArray13);
        org.junit.Assert.assertEquals(java.util.Arrays.toString(intArray13), "[0, 0, 0, 0]");
    }

    @Test
    public void test00483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00483");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology3);
        mutablePeriod4.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod4.add(0L);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        int int17 = dateMidnight16.getYearOfEra();
        org.joda.time.Chronology chronology18 = dateMidnight16.getChronology();
        org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology18);
        mutablePeriod4.add(0L, chronology18);
        org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight((long) (-1), chronology18);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTime dateTime32 = new org.joda.time.DateTime((long) (short) 10, chronology30);
        org.joda.time.MutableDateTime mutableDateTime33 = dateMidnight21.toMutableDateTime(chronology30);
        mutableDateTime33.setYear(2022);
        mutableDateTime33.setYear((-1));
        org.joda.time.MutableDateTime.Property property38 = mutableDateTime33.monthOfYear();
        int int39 = mutableDateTime33.getHourOfDay();
        org.joda.time.ReadableInstant readableInstant40 = null;
        org.joda.time.Interval interval41 = new org.joda.time.Interval((org.joda.time.ReadableInstant) mutableDateTime33, readableInstant40);
        java.lang.String str42 = mutableDateTime33.toString();
        org.joda.time.MutableDateTime.Property property43 = mutableDateTime33.dayOfWeek();
        mutableDateTime33.addSeconds(0);
        // The following exception was thrown during execution in test generation
        try {
            mutableDateTime33.setDate(726, 902, (int) (short) 10);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 902 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertTrue("'" + int17 + "' != '" + 2022 + "'", int17 == 2022);
        org.junit.Assert.assertNotNull(chronology18);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(mutableDateTime33);
        org.junit.Assert.assertNotNull(property38);
        org.junit.Assert.assertTrue("'" + int39 + "' != '" + 0 + "'", int39 == 0);
// flaky:         org.junit.Assert.assertEquals("'" + str42 + "' != '" + "-0001-12-31T00:00:00.000-00:00:00.001" + "'", str42, "-0001-12-31T00:00:00.000-00:00:00.001");
        org.junit.Assert.assertNotNull(property43);
    }

    @Test
    public void test00484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00484");
        org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours(10L);
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(chronology2);
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.minusDays((int) (short) -1);
        long long6 = dateMidnight3.getMillis();
        org.joda.time.PeriodType periodType7 = org.joda.time.PeriodType.days();
        org.joda.time.Period period8 = duration1.toPeriodFrom((org.joda.time.ReadableInstant) dateMidnight3, periodType7);
        java.util.Date date9 = dateMidnight3.toDate();
        date9.setMinutes(0);
        org.junit.Assert.assertNotNull(duration1);
        org.junit.Assert.assertNotNull(dateMidnight5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645401600001L + "'", long6 == 1645401600001L);
        org.junit.Assert.assertNotNull(periodType7);
        org.junit.Assert.assertNotNull(period8);
        org.junit.Assert.assertNotNull(date9);
        org.junit.Assert.assertEquals(date9.toString(), "Mon Feb 21 00:00:00 GMT+00:00 2022");
    }

    @Test
    public void test00485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00485");
        java.util.Locale.Builder builder0 = new java.util.Locale.Builder();
        java.util.Locale locale1 = java.util.Locale.TRADITIONAL_CHINESE;
        java.util.Locale.Builder builder2 = builder0.setLocale(locale1);
        // The following exception was thrown during execution in test generation
        try {
            java.util.Locale.Builder builder4 = builder2.setVariant("DateTimeField[secondOfMinute]");
            org.junit.Assert.fail("Expected exception of type java.util.IllformedLocaleException; message: Ill-formed variant: DateTimeField[secondOfMinute] [at index 0]");
        } catch (java.util.IllformedLocaleException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(locale1);
        org.junit.Assert.assertEquals(locale1.toString(), "zh_TW");
        org.junit.Assert.assertNotNull(builder2);
    }

    @Test
    public void test00486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00486");
        org.joda.time.Chronology chronology1 = null;
        org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay((long) 10, chronology1);
        org.joda.time.DateTimeFieldType[] dateTimeFieldTypeArray3 = timeOfDay2.getFieldTypes();
        org.joda.time.TimeOfDay timeOfDay5 = timeOfDay2.plusSeconds((int) '4');
        org.joda.time.TimeOfDay timeOfDay7 = timeOfDay5.plusHours(50);
        // The following exception was thrown during execution in test generation
        try {
            int int9 = timeOfDay7.getValue((-2));
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException; message: -2");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldTypeArray3);
        org.junit.Assert.assertNotNull(timeOfDay5);
        org.junit.Assert.assertNotNull(timeOfDay7);
    }

    @Test
    public void test00487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00487");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusSeconds(2);
        org.joda.time.Chronology chronology8 = null;
        org.joda.time.DateMidnight dateMidnight9 = new org.joda.time.DateMidnight(chronology8);
        org.joda.time.DateMidnight dateMidnight11 = dateMidnight9.minusDays((int) (short) -1);
        int int12 = dateMidnight11.getYearOfEra();
        org.joda.time.Chronology chronology13 = dateMidnight11.getChronology();
        long long14 = dateMidnight11.getMillis();
        org.joda.time.DateMidnight.Property property15 = dateMidnight11.weekyear();
        org.joda.time.DateMidnight dateMidnight16 = property15.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight17 = property15.roundHalfFloorCopy();
        org.joda.time.DateTimeFieldType dateTimeFieldType18 = property15.getFieldType();
        org.joda.time.LocalDateTime localDateTime20 = localDateTime7.withField(dateTimeFieldType18, 32769);
        org.joda.time.LocalDateTime localDateTime22 = localDateTime20.withWeekOfWeekyear(21);
        org.joda.time.Chronology chronology25 = null;
        org.joda.time.DateMidnight dateMidnight26 = new org.joda.time.DateMidnight(chronology25);
        org.joda.time.DateMidnight dateMidnight28 = dateMidnight26.minusDays((int) (short) -1);
        int int29 = dateMidnight28.getYearOfEra();
        org.joda.time.Chronology chronology30 = dateMidnight28.getChronology();
        org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology30);
        org.joda.time.DateTimeField dateTimeField32 = chronology30.clockhourOfDay();
        org.joda.time.DateTime dateTime33 = new org.joda.time.DateTime(chronology30);
        org.joda.time.DateTime dateTime35 = dateTime33.minusSeconds(4);
        org.joda.time.LocalTime localTime36 = dateTime35.toLocalTime();
        org.joda.time.LocalTime.Property property37 = localTime36.millisOfSecond();
        org.joda.time.LocalTime localTime38 = property37.withMaximumValue();
        org.joda.time.LocalTime localTime39 = property37.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime40 = property37.roundFloorCopy();
        org.joda.time.LocalTime localTime41 = property37.roundHalfEvenCopy();
        org.joda.time.LocalTime localTime43 = property37.setCopy(11);
        org.joda.time.LocalTime localTime45 = property37.addCopy((long) (short) 1);
        org.joda.time.LocalTime localTime47 = property37.addCopy(600L);
        // The following exception was thrown during execution in test generation
        try {
            int int48 = localDateTime20.compareTo((org.joda.time.ReadablePartial) localTime47);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 2022 + "'", int12 == 2022);
        org.junit.Assert.assertNotNull(chronology13);
// flaky:         org.junit.Assert.assertTrue("'" + long14 + "' != '" + 1645488000001L + "'", long14 == 1645488000001L);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(dateMidnight17);
        org.junit.Assert.assertNotNull(dateTimeFieldType18);
        org.junit.Assert.assertNotNull(localDateTime20);
        org.junit.Assert.assertNotNull(localDateTime22);
        org.junit.Assert.assertNotNull(dateMidnight28);
        org.junit.Assert.assertTrue("'" + int29 + "' != '" + 2022 + "'", int29 == 2022);
        org.junit.Assert.assertNotNull(chronology30);
        org.junit.Assert.assertNotNull(dateTimeField32);
        org.junit.Assert.assertNotNull(dateTime35);
        org.junit.Assert.assertNotNull(localTime36);
        org.junit.Assert.assertNotNull(property37);
        org.junit.Assert.assertNotNull(localTime38);
        org.junit.Assert.assertNotNull(localTime39);
        org.junit.Assert.assertNotNull(localTime40);
        org.junit.Assert.assertNotNull(localTime41);
        org.junit.Assert.assertNotNull(localTime43);
        org.junit.Assert.assertNotNull(localTime45);
        org.junit.Assert.assertNotNull(localTime47);
    }

    @Test
    public void test00488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00488");
        org.joda.time.DateTimeFieldType dateTimeFieldType5 = org.joda.time.DateTimeFieldType.centuryOfEra();
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology9);
        mutablePeriod10.setPeriod((long) (short) 10, (long) (short) -1);
        mutablePeriod10.add(0L);
        org.joda.time.Chronology chronology19 = null;
        org.joda.time.DateMidnight dateMidnight20 = new org.joda.time.DateMidnight(chronology19);
        org.joda.time.DateMidnight dateMidnight22 = dateMidnight20.minusDays((int) (short) -1);
        int int23 = dateMidnight22.getYearOfEra();
        org.joda.time.Chronology chronology24 = dateMidnight22.getChronology();
        org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology24);
        mutablePeriod10.add(0L, chronology24);
        org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight((long) (-1), chronology24);
        org.joda.time.DateTimeField dateTimeField28 = dateTimeFieldType5.getField(chronology24);
        org.joda.time.MutablePeriod mutablePeriod29 = new org.joda.time.MutablePeriod((long) 21, chronology24);
        org.joda.time.TimeOfDay timeOfDay30 = org.joda.time.TimeOfDay.fromMillisOfDay((long) (-23641), chronology24);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDate localDate31 = new org.joda.time.LocalDate(1970, 22, 19, chronology24);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 22 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateTimeFieldType5);
        org.junit.Assert.assertNotNull(dateMidnight22);
        org.junit.Assert.assertTrue("'" + int23 + "' != '" + 2022 + "'", int23 == 2022);
        org.junit.Assert.assertNotNull(chronology24);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(timeOfDay30);
    }

    @Test
    public void test00489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00489");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusMillis(0);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.withMillisOfSecond(10);
        java.lang.String str7 = localDateTime3.toString("1970-01-01");
        org.joda.time.LocalDateTime localDateTime9 = localDateTime3.withMinuteOfHour((int) (byte) 10);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.LocalDateTime localDateTime11 = localDateTime9.withHourOfDay(2024);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 2024 for hourOfDay must be in the range [0,23]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertEquals("'" + str7 + "' != '" + "1970-01-01" + "'", str7, "1970-01-01");
        org.junit.Assert.assertNotNull(localDateTime9);
    }

    @Test
    public void test00490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00490");
        org.joda.time.DateTimeZone dateTimeZone0 = null;
        org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime(dateTimeZone0);
        org.joda.time.LocalDateTime localDateTime3 = localDateTime1.plusWeeks((int) (short) -1);
        org.joda.time.LocalDateTime localDateTime5 = localDateTime3.minusMonths((int) (byte) 0);
        org.joda.time.LocalDateTime localDateTime7 = localDateTime3.minusSeconds(2);
        org.joda.time.LocalDateTime.Property property8 = localDateTime7.yearOfCentury();
        org.joda.time.DateTime dateTime9 = localDateTime7.toDateTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime11 = dateTime9.withWeekOfWeekyear(902);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 902 for weekOfWeekyear must be in the range [1,52]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(localDateTime3);
        org.junit.Assert.assertNotNull(localDateTime5);
        org.junit.Assert.assertNotNull(localDateTime7);
        org.junit.Assert.assertNotNull(property8);
        org.junit.Assert.assertNotNull(dateTime9);
    }

    @Test
    public void test00491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00491");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight1.getYearOfEra();
        org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now(dateTimeZone6);
        org.joda.time.DateTime dateTime8 = org.joda.time.DateTime.now(dateTimeZone6);
        org.joda.time.Duration duration11 = new org.joda.time.Duration((long) 'a', (long) 1970);
        org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant) dateTime8, (org.joda.time.ReadableDuration) duration11);
        org.joda.time.DateMidnight dateMidnight13 = dateMidnight1.minus((org.joda.time.ReadableDuration) duration11);
        org.joda.time.DateMidnight dateMidnight15 = dateMidnight13.withCenturyOfEra(12);
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(dateTimeZone6);
        org.junit.Assert.assertNotNull(localDate7);
        org.junit.Assert.assertNotNull(dateTime8);
        org.junit.Assert.assertNotNull(dateMidnight13);
        org.junit.Assert.assertNotNull(dateMidnight15);
    }

    @Test
    public void test00492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00492");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        org.joda.time.DateTimeZone dateTimeZone4 = null;
        org.joda.time.DateMidnight dateMidnight5 = dateMidnight3.withZoneRetainFields(dateTimeZone4);
        org.joda.time.Chronology chronology9 = null;
        org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(chronology9);
        org.joda.time.DateMidnight dateMidnight12 = dateMidnight10.minusDays((int) (short) -1);
        int int13 = dateMidnight12.getYearOfEra();
        org.joda.time.Chronology chronology14 = dateMidnight12.getChronology();
        org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology14);
        org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((long) (short) 10, chronology14);
        org.joda.time.DateTime dateTime18 = dateTime16.plusSeconds(14);
        boolean boolean19 = dateMidnight5.isBefore((org.joda.time.ReadableInstant) dateTime18);
        org.joda.time.DateTime dateTime20 = dateTime18.toDateTimeISO();
        org.joda.time.DateTime dateTime22 = dateTime18.withDayOfWeek(1);
        org.joda.time.DateTime dateTime24 = dateTime22.plus((long) '#');
        org.joda.time.DateTime.Property property25 = dateTime24.centuryOfEra();
        org.joda.time.DateTime dateTime26 = property25.withMaximumValue();
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertNotNull(dateMidnight5);
        org.junit.Assert.assertNotNull(dateMidnight12);
        org.junit.Assert.assertTrue("'" + int13 + "' != '" + 2022 + "'", int13 == 2022);
        org.junit.Assert.assertNotNull(chronology14);
        org.junit.Assert.assertNotNull(dateTime18);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + false + "'", boolean19 == false);
        org.junit.Assert.assertNotNull(dateTime20);
        org.junit.Assert.assertNotNull(dateTime22);
        org.junit.Assert.assertNotNull(dateTime24);
        org.junit.Assert.assertNotNull(property25);
        org.junit.Assert.assertNotNull(dateTime26);
    }

    @Test
    public void test00493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00493");
        org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long) '#');
        java.lang.String str2 = localDate1.toString();
        int int3 = localDate1.getYearOfEra();
        org.joda.time.Chronology chronology6 = null;
        org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod((long) (byte) -1, (long) '#', chronology6);
        mutablePeriod7.setPeriod((long) (short) 10, (long) (short) -1);
        int int12 = mutablePeriod7.getValue(0);
        org.joda.time.Chronology chronology13 = null;
        org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(chronology13);
        org.joda.time.DateMidnight dateMidnight16 = dateMidnight14.minusDays((int) (short) -1);
        org.joda.time.Duration duration17 = mutablePeriod7.toDurationTo((org.joda.time.ReadableInstant) dateMidnight14);
        org.joda.time.LocalDate localDate18 = localDate1.minus((org.joda.time.ReadablePeriod) mutablePeriod7);
        org.joda.time.Chronology chronology21 = null;
        org.joda.time.DateMidnight dateMidnight22 = new org.joda.time.DateMidnight(chronology21);
        org.joda.time.DateMidnight dateMidnight24 = dateMidnight22.minusDays((int) (short) -1);
        int int25 = dateMidnight24.getYearOfEra();
        org.joda.time.Chronology chronology26 = dateMidnight24.getChronology();
        org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology26);
        org.joda.time.DateTimeField dateTimeField28 = chronology26.clockhourOfDay();
        org.joda.time.DateTime dateTime29 = new org.joda.time.DateTime(chronology26);
        org.joda.time.DateTime dateTime31 = dateTime29.minusSeconds(4);
        org.joda.time.LocalTime localTime32 = dateTime31.toLocalTime();
        org.joda.time.LocalTime.Property property33 = localTime32.millisOfSecond();
        org.joda.time.LocalTime localTime34 = property33.withMaximumValue();
        org.joda.time.LocalTime localTime35 = property33.roundHalfEvenCopy();
        // The following exception was thrown during execution in test generation
        try {
            int int36 = localDate1.compareTo((org.joda.time.ReadablePartial) localTime35);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException; message: ReadablePartial objects must have matching field types");
        } catch (java.lang.ClassCastException e) {
            // Expected exception.
        }
        org.junit.Assert.assertEquals("'" + str2 + "' != '" + "1970-01-01" + "'", str2, "1970-01-01");
        org.junit.Assert.assertTrue("'" + int3 + "' != '" + 1970 + "'", int3 == 1970);
        org.junit.Assert.assertTrue("'" + int12 + "' != '" + 0 + "'", int12 == 0);
        org.junit.Assert.assertNotNull(dateMidnight16);
        org.junit.Assert.assertNotNull(duration17);
        org.junit.Assert.assertNotNull(localDate18);
        org.junit.Assert.assertNotNull(dateMidnight24);
        org.junit.Assert.assertTrue("'" + int25 + "' != '" + 2022 + "'", int25 == 2022);
        org.junit.Assert.assertNotNull(chronology26);
        org.junit.Assert.assertNotNull(dateTimeField28);
        org.junit.Assert.assertNotNull(dateTime31);
        org.junit.Assert.assertNotNull(localTime32);
        org.junit.Assert.assertNotNull(property33);
        org.junit.Assert.assertNotNull(localTime34);
        org.junit.Assert.assertNotNull(localTime35);
    }

    @Test
    public void test00494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00494");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        org.joda.time.DateMidnight dateMidnight8 = property7.withMaximumValue();
        org.joda.time.DateMidnight dateMidnight9 = property7.withMinimumValue();
        org.joda.time.DateMidnight dateMidnight11 = property7.addToCopy((long) 24);
        org.joda.time.DateMidnight dateMidnight12 = property7.getDateMidnight();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight14 = dateMidnight12.withMonthOfYear(32772);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 32772 for monthOfYear must be in the range [1,12]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000001L + "'", long6 == 1645488000001L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertNotNull(dateMidnight9);
        org.junit.Assert.assertNotNull(dateMidnight11);
        org.junit.Assert.assertNotNull(dateMidnight12);
    }

    @Test
    public void test00495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00495");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTime dateTime12 = dateTime10.minusHours(7);
        org.joda.time.DateTime dateTime14 = dateTime12.plusYears((int) (byte) 0);
        org.joda.time.DateTime.Property property15 = dateTime14.weekyear();
        org.joda.time.DateTime dateTime17 = property15.setCopy("24");
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateTime dateTime19 = dateTime17.withYearOfCentury((-1));
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value -1 for yearOfCentury must be in the range [0,99]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTime12);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(property15);
        org.junit.Assert.assertNotNull(dateTime17);
    }

    @Test
    public void test00496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00496");
        org.joda.time.Chronology chronology0 = null;
        org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(chronology0);
        org.joda.time.DateMidnight dateMidnight3 = dateMidnight1.minusDays((int) (short) -1);
        int int4 = dateMidnight3.getYearOfEra();
        org.joda.time.Chronology chronology5 = dateMidnight3.getChronology();
        long long6 = dateMidnight3.getMillis();
        org.joda.time.DateMidnight.Property property7 = dateMidnight3.weekyear();
        org.joda.time.DateMidnight dateMidnight8 = property7.withMaximumValue();
        org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay((java.lang.Object) dateMidnight8);
        java.lang.String str11 = timeOfDay9.toString("24");
        org.junit.Assert.assertNotNull(dateMidnight3);
        org.junit.Assert.assertTrue("'" + int4 + "' != '" + 2022 + "'", int4 == 2022);
        org.junit.Assert.assertNotNull(chronology5);
// flaky:         org.junit.Assert.assertTrue("'" + long6 + "' != '" + 1645488000001L + "'", long6 == 1645488000001L);
        org.junit.Assert.assertNotNull(property7);
        org.junit.Assert.assertNotNull(dateMidnight8);
        org.junit.Assert.assertEquals("'" + str11 + "' != '" + "24" + "'", str11, "24");
    }

    @Test
    public void test00497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00497");
        java.lang.String[] strArray17 = new java.lang.String[] { "hi!", "24", "Japan", "Thu Jan 01 15:00:00 UTC 1970", "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z", "DateTimeField[clockhourOfDay]", "-00:00:00.001", "Thu Dec 01 00:00:00 UTC 1898", "2022-02-21T00:00:00.000Z/2022-02-21T00:00:00.000Z", "ja", "hourOfHalfday", "Sat Dec 31 00:00:00 UTC 1898", "hi!", "1970-01-01", "hourOfHalfday", "2022-02-21T00:00:00.000Z/2022-02-22T00:00:00.000Z", "-00:00:00.001" };
        java.util.LinkedHashSet<java.lang.String> strSet18 = new java.util.LinkedHashSet<java.lang.String>();
        boolean boolean19 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) strSet18, strArray17);
        boolean boolean20 = strSet18.isEmpty();
        java.util.Locale.LanguageRange[] languageRangeArray21 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList22 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean23 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22, languageRangeArray21);
        java.util.Locale locale24 = java.util.Locale.GERMAN;
        java.util.Locale locale25 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray26 = new java.util.Locale[] { locale24, locale25 };
        java.util.ArrayList<java.util.Locale> localeList27 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean28 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList27, localeArray26);
        java.util.Locale locale29 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList22, (java.util.Collection<java.util.Locale>) localeList27);
        boolean boolean30 = strSet18.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList22);
        java.util.Locale.LanguageRange[] languageRangeArray31 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList32 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean33 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32, languageRangeArray31);
        boolean boolean34 = strSet18.retainAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList32);
        java.util.Locale.LanguageRange[] languageRangeArray35 = new java.util.Locale.LanguageRange[] {};
        java.util.ArrayList<java.util.Locale.LanguageRange> languageRangeList36 = new java.util.ArrayList<java.util.Locale.LanguageRange>();
        boolean boolean37 = java.util.Collections.addAll((java.util.Collection<java.util.Locale.LanguageRange>) languageRangeList36, languageRangeArray35);
        java.util.Locale locale38 = java.util.Locale.GERMAN;
        java.util.Locale locale39 = java.util.Locale.JAPAN;
        java.util.Locale[] localeArray40 = new java.util.Locale[] { locale38, locale39 };
        java.util.ArrayList<java.util.Locale> localeList41 = new java.util.ArrayList<java.util.Locale>();
        boolean boolean42 = java.util.Collections.addAll((java.util.Collection<java.util.Locale>) localeList41, localeArray40);
        java.util.Locale locale43 = java.util.Locale.lookup((java.util.List<java.util.Locale.LanguageRange>) languageRangeList36, (java.util.Collection<java.util.Locale>) localeList41);
        java.util.List<java.util.Locale> localeList44 = java.util.Locale.filter((java.util.List<java.util.Locale.LanguageRange>) languageRangeList32, (java.util.Collection<java.util.Locale>) localeList41);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.YearMonthDay yearMonthDay45 = new org.joda.time.YearMonthDay((java.lang.Object) localeList41);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No partial converter found for type: java.util.ArrayList");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(strArray17);
        org.junit.Assert.assertTrue("'" + boolean19 + "' != '" + true + "'", boolean19 == true);
        org.junit.Assert.assertTrue("'" + boolean20 + "' != '" + false + "'", boolean20 == false);
        org.junit.Assert.assertNotNull(languageRangeArray21);
        org.junit.Assert.assertTrue("'" + boolean23 + "' != '" + false + "'", boolean23 == false);
        org.junit.Assert.assertNotNull(locale24);
        org.junit.Assert.assertEquals(locale24.toString(), "de");
        org.junit.Assert.assertNotNull(locale25);
        org.junit.Assert.assertEquals(locale25.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray26);
        org.junit.Assert.assertTrue("'" + boolean28 + "' != '" + true + "'", boolean28 == true);
        org.junit.Assert.assertNull(locale29);
        org.junit.Assert.assertTrue("'" + boolean30 + "' != '" + true + "'", boolean30 == true);
        org.junit.Assert.assertNotNull(languageRangeArray31);
        org.junit.Assert.assertTrue("'" + boolean33 + "' != '" + false + "'", boolean33 == false);
        org.junit.Assert.assertTrue("'" + boolean34 + "' != '" + false + "'", boolean34 == false);
        org.junit.Assert.assertNotNull(languageRangeArray35);
        org.junit.Assert.assertTrue("'" + boolean37 + "' != '" + false + "'", boolean37 == false);
        org.junit.Assert.assertNotNull(locale38);
        org.junit.Assert.assertEquals(locale38.toString(), "de");
        org.junit.Assert.assertNotNull(locale39);
        org.junit.Assert.assertEquals(locale39.toString(), "ja_JP");
        org.junit.Assert.assertNotNull(localeArray40);
        org.junit.Assert.assertTrue("'" + boolean42 + "' != '" + true + "'", boolean42 == true);
        org.junit.Assert.assertNull(locale43);
        org.junit.Assert.assertNotNull(localeList44);
    }

    @Test
    public void test00498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00498");
        org.joda.time.YearMonthDay yearMonthDay0 = new org.joda.time.YearMonthDay();
        org.joda.time.Interval interval1 = yearMonthDay0.toInterval();
        org.joda.time.Chronology chronology2 = null;
        org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay0.withChronologyRetainFields(chronology2);
        org.joda.time.DateTime dateTime4 = yearMonthDay0.toDateTimeAtCurrentTime();
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.DateMidnight dateMidnight5 = new org.joda.time.DateMidnight((java.lang.Object) yearMonthDay0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException; message: No instant converter found for type: org.joda.time.YearMonthDay");
        } catch (java.lang.IllegalArgumentException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(interval1);
        org.junit.Assert.assertNotNull(yearMonthDay3);
        org.junit.Assert.assertNotNull(dateTime4);
    }

    @Test
    public void test00499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00499");
        org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = null;
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.Instant instant2 = org.joda.time.Instant.parse("KR", dateTimeFormatter1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException; message: null");
        } catch (java.lang.NullPointerException e) {
            // Expected exception.
        }
    }

    @Test
    public void test00500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test00500");
        org.joda.time.Chronology chronology3 = null;
        org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(chronology3);
        org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.minusDays((int) (short) -1);
        int int7 = dateMidnight6.getYearOfEra();
        org.joda.time.Chronology chronology8 = dateMidnight6.getChronology();
        org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((long) 6, (long) 2022, chronology8);
        org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime((long) (short) 10, chronology8);
        org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.forOffsetMillis((int) (byte) -1);
        org.joda.time.LocalDate localDate13 = org.joda.time.LocalDate.now(dateTimeZone12);
        org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone12);
        org.joda.time.MutableDateTime mutableDateTime15 = dateTime10.toMutableDateTime(dateTimeZone12);
        org.joda.time.DateTimeFieldType dateTimeFieldType16 = org.joda.time.DateTimeFieldType.era();
        org.joda.time.MutableDateTime.Property property17 = mutableDateTime15.property(dateTimeFieldType16);
        // The following exception was thrown during execution in test generation
        try {
            org.joda.time.MutableDateTime mutableDateTime19 = property17.set(6);
            org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException; message: Value 6 for era must be in the range [0,1]");
        } catch (org.joda.time.IllegalFieldValueException e) {
            // Expected exception.
        }
        org.junit.Assert.assertNotNull(dateMidnight6);
        org.junit.Assert.assertTrue("'" + int7 + "' != '" + 2022 + "'", int7 == 2022);
        org.junit.Assert.assertNotNull(chronology8);
        org.junit.Assert.assertNotNull(dateTimeZone12);
        org.junit.Assert.assertNotNull(localDate13);
        org.junit.Assert.assertNotNull(dateTime14);
        org.junit.Assert.assertNotNull(mutableDateTime15);
        org.junit.Assert.assertNotNull(dateTimeFieldType16);
        org.junit.Assert.assertNotNull(property17);
    }
}
